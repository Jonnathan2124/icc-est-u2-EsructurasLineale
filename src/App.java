import java.util.Stack;

import Materia.Models.Queues.Queues;
import Materia.Models.Stack.StackGeneric;
import Models.Pantalla;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("");
        //runStack();
        runStackGeneric();
    }

    public static void runStack(){
        Stack stacks = new Stack();

        stacks.push(5);
        stacks.push(7);
        stacks.push(10);
        stacks.push(20);

        System.out.println("Cima      ->"+stacks.peek());
        System.out.println("Retirar   ->"+stacks.pop());
        System.out.println("Cima      ->"+stacks.peek());
        System.out.println("Retirar   ->"+stacks.pop());
        System.out.println("Cima      ->"+stacks.peek());
    }

    public static void runStackGeneric(){
        StackGeneric<Pantalla> router=new StackGeneric<>();
        router.push(new Pantalla(1, "Home Page", "/home"));
        router.push(new Pantalla(1, "Home Page", "/home/menu"));
        router.push(new Pantalla(1, "Users Page", "/home/menu/users"));

        System.out.println("Estoy en "+router.peek().getRuta());
        System.out.println("Regreso a "+ router.pop());
        System.out.println("Estoy en "+ router.peek().getRuta());

        router.push(new Pantalla(1, "Settings Page", "/home/menu/users/settings"));

        System.out.println("Pantallas = " + router.getSize());
        System.out.println("Estoy en " + router.peek().getRuta());
        router.printStack();
    }

    
    public static void runQueues(){
        Queues cola = new Queues();

        cola.esqueue(10);
        cola.esqueue(20);
        cola.esqueue(30);
        cola.esqueue(40);

        System.out.println(cola.peek());
        System.out.println(cola.dequeue());
        System.out.println(cola.dequeue());
        System.out.println(cola.peek());
    }
}
