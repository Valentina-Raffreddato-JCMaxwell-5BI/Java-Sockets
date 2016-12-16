/*
 * ServerTesto MultiThreaded.java Server che attende per richieste di connessioni da Clients
 * e li gestisce in modo contemporaneo generando un socket "worker" per ogni connessione.
 * 
 */

/**
 *
 * @author Prof. Matteo Palitto
 */
import java.net.*;
import java.io.*;
import java.util.LinkedList;

public class ServerTestoMultiThreaded
{
    static LinkedList<SocketWorker> listaUtenti = new LinkedList<SocketWorker>(); // Creo una lista di socket, da cui estrarrò il nickname assegnato ad ogni socket
    
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Uso: java ServerTestoMultithreaded <Porta Server>");
            return;
        }

        int portNumber = Integer.parseInt(args[0]);


        try{
            ServerSocket server = new ServerSocket(portNumber);
            System.out.println("Server di Testo in esecuzione...  (CTRL-C quits)\n");

            while(true){
                SocketWorker w;
                try {
                    //server.accept returns a client connection
                    w = new SocketWorker(server.accept());
                    listaUtenti.add(w); // Inserisco il socket nella lista degli utenti connessi
                    Thread t = new Thread(w);
                    t.start();
                } catch (IOException e) {
                    System.out.println("Connessione NON riuscita con client: ");
                    System.exit(-1);
                }
            }
        } catch (IOException e) {
            System.out.println("Error! Porta: " + portNumber + " non disponibile");
            System.exit(-1);
        }

        
    }
}
