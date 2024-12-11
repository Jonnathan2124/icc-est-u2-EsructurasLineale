package Controller;

import Materia.Models.NodeGeneric;
import Models.Contact;
import Models.LinkedList;

public class ContactManager {
     private LinkedList<Contact<?,?>> contacts;

     public ContactManager(){
        this.contacts= new LinkedList<>();
     }

     public void addContact(Contact<?,?> contact){
        contacts.appendTotail(contact);
     }

     public Contact<?,?> findContactByName(String name){
         NodeGeneric<Contact<?,?>> current = contacts.getHead();

         while(current != null){
            if(((String)current.getValue().getName()).equalsIgnoreCase(name)){
               return current.getValue();
            }
            current = current.getNext();
            System.out.println(current);
            System.out.println(current.getNext());
         }
         return null;
     }

   public void deleteContactByName(String name) {
      NodeGeneric<Contact<?,?>> current = contacts.getHead();
      if(current == null){
         return;
         
      }
      //Caso 1 que el contacto sea la head o cabeza
      if(((String)current.getValue().getName()).equalsIgnoreCase(name)){
         contacts.setHead(contacts.getHead().getNext());
         contacts.setSize(contacts.getSize() -1);
         return;
      }
      //Caso 2 en el resto iterar la lista
      while(current.getNext() != null){
         if(((String)current.getValue().getName()).equalsIgnoreCase(name)){
            current.setNext(current.getNext().getNext());
            contacts.setSize(contacts.getSize() -1);
            return;
         }
         current = current.getNext();
      }
   }

   public void printList() {
      if (contacts.getSize() == 0) {
         System.out.println("No hay contactos en la lista.");
         return;
     }
     NodeGeneric<Contact<?, ?>> current = contacts.getHead();
     while (current != null) {
      Contact<?, ?> contact = current.getValue();
      System.out.println("Nombre: " + contact.getName() + ", Teléfono: " + contact.getPhone());
      current = current.getNext();
      }
   }
}
