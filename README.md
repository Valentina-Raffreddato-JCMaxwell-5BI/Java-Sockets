
# Java-Sockets
Concetti e realizzazione di una semplice connessione Client/Server usando Sockets in Java

# Descrizione del progetto
Il progetto ha come obiettivo l'effettuare una connessione client/server attraverso l'utilizzo dei Sockets. 
Ed inoltre la soluzione dei seguenti punti:
* Richiedere il nickname quando un client si connette al server, visualizzando il nickname dopo aver inviato un messaggio
* Utilizzare un comando /listautenti che permetta la visualizzazione della lista degli utenti connessi al server
* Sviluppare una group chat

## Istruzioni
-Per prima andare nel sito di Java e scaricare il pacchetto JDK. 
-Una volta scaricato e installato, si deve aprire e poi andare su file e cliccare su New Project; verrà mostrata una seconda finestra con  i vari tipi di file di Java e selezionate Java e poi cliccare su NEXT, poi inserirete il nome del progetto vicino Project Name in questo   caso Java Socket-Client (mittente) prima di cliccare su FINISH togliere la spunta su Create Main Class.
-Creare anche il Java Socket-Server seguendo la stessa procedura qui sopra.
-Poi andate su risorse del computer e premete documenti, andate su NetBeansProject, entrate su Java Socket-Server e dopo su src, fate copia sui due file che ci sono (ServerTestoMultiThread e SocketWorker) e incollateli sul server su NetBeans.
-Fate la stessa cosa anche su Java Socket-Client.
-Andate su Prompt, apritene due (uno per il client e l'altro per il Server).
-Dentro al primo prompt realizzate il server eseguendo questi punti:
            -vicino alla scritta c:\users\Utente> scrivete cd Documenti, che cd vi permette di muovere tra le varie cartelle, e dopo                    premete invio;
            -premuto invio vedete scritto questo: c:\users\Utente\Documenti>, significa che siete entrati sui documenti, e vicino                      dovete scrivere cd NetBeansProjects, che vi fa entrare su NetBeansProjects; 
            -vicino a c:\users\Utente\Documenti\NetBeansProjects> scrivete dir, sarebbe la directory ovvero la cartella, che una volta                  premuto invio, vedete un elenco dove sono scritti tutti i progetti di Netbeans;
            -sotto ai progetti di NetBeans vedete di nuovo scritto c:\users\Utente\Documenti\NetBeansProjects> e questa volta scrivete cd              JavaSocket-Server, e siete entrati su JavaSocket-Server; 
            -vicino a c:\users\Utente\Documenti\NetBeansProjects\JavaSocket-Server> scrivete dir, e vedete un'altro elenco                             -sotto a quell'altro elenco vedete di nuovo scritto c:\users\Utente\Documenti\NetBeansProjects\JavaSocket-Server> e vicino                  scrivete cd dist, che sarebbe una cartella dove ci sono i file eseguibili
            -ora che siete dentro alla dist e vicino a c:\users\Utente\Documenti\NetBeansProjects\JavaSocket-Server\dist> dovete scrivere              java -jar JavaSocket-Server.jar

