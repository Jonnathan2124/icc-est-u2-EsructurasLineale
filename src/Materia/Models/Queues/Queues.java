package Materia.Models.Queues;

import java.util.NoSuchElementException;

import Materia.Models.Node;

public class Queues {
    
    private Node front; //Node al frente de la cola.
    private Node rear; //Node al final de la cola.

    ///Creamos una cola con los nodos vacios.
    public  Queues(){
        this.front=null;
        this.rear=null;
    }
    //Metodo para emcolar nodos
    public void esqueue(int value){
        Node newNode = new Node(value);
        if(isEmpty()){
            front=newNode;
            rear=newNode;
        }else{
            rear.setNext(newNode);
            rear = newNode;
        }
    }

    //Desencolar
    public Node dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        Node node = front;
        front = front.getNext();
        if(front == null){
            rear = null;
        }
        return node;
    }

    public Node peek(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return front;
    }

    public boolean isEmpty(){
        return front == null;
    }

    

}
