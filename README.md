
# Java-Sockets
Concetti e realizzazione di una semplice connessione Client/Server usando Sockets in Java

# Descrizione del progetto
Il progetto ha come obiettivo l'effettuare una connessione client/server attraverso l'utilizzo dei Sockets. 
Ed inoltre la soluzione dei seguenti punti:
* Richiedere il nickname quando un client si connette al server, visualizzando il nickname dopo aver inviato un messaggio
* Utilizzare un comando /listautenti che permetta la visualizzazione della lista degli utenti connessi al server
* Sviluppare una group chat

## Istruzioni
-Per prima cosa andare nel sito di Java e scaricare il pacchetto JDK. 

-Una volta scaricato e installato, si deve aprire e poi andare su file e cliccare su New Project; verrà mostrata una seconda finestra    con  i vari tipi di file di Java e selezionate Java e poi cliccare su NEXT, poi inserirete il nome del progetto vicino Project Name in questo caso Java Socket-Client (mittente) prima di cliccare su FINISH togliere la spunta su Create Main Class.

-Creare anche il Java Socket-Server seguendo la stessa procedura qui sopra.

-Poi andate su risorse del computer e premete documenti, andate su NetBeansProject, entrate su Java Socket-Server e dopo su src, fate copia sui due file che ci sono (ServerTestoMultiThread e SocketWorker) e incollateli sul server su NetBeans.

-Fate la stessa cosa anche su Java Socket-Client.

-Andate su Prompt, apritene due (uno per il client e l'altro per il Server).

-Dentro al primo prompt realizzate il server eseguendo questi punti:

          1-vicino alla scritta c:\users\Utente> scrivete cd Documenti, e dopo premete invio;
          
          2-vicino a c:\users\Utente\Documenti>, scrivete cd NetBeansProjects;
          
          3-vicino a c:\users\Utente\Documenti\NetBeansProjects> scrivete dir e premete invio, e vedete un elenco dove sono scritti                 tutti i progetti di Netbeans;
          
          4-sotto ai progetti di NetBeans vedete di nuovo scritto c:\users\Utente\Documenti\NetBeansProjects> e questa volta scrivete               cd JavaSocket-Server, e siete entrati su JavaSocket-Server; 
          
          5-vicino a c:\users\Utente\Documenti\NetBeansProjects\JavaSocket-Server> scrivete dir;
          
          6-vicino a c:\users\Utente\Documenti\NetBeansProjects\JavaSocket-Server> scrivete cd dist, che sarebbe una cartella dove ci               sono i file eseguibili;
          
          7-vicino a c:\users\Utente\Documenti\NetBeansProjects\JavaSocket-Server\dist> scrivete java -jar JavaSocket-Server.jar e                   scrivete quattro numeri a scelta, ad esempio 1234; 
          
          8-premete invio e dopo vedete scritto "Server scritto in esecuzione....", significa che sta aspettando un messaggio da parte               del client dove adesso voi dovete andare sull'altro prompt a realizzarlo e scriverlo.
          
-Dopo aver eseguito questi punti, andate sull'altro prompt (come dice nell'ultimo punto) per realizzare il client e scrivere il messaggio, eseguendo gli stessi punti che ci sono qui sopra, ma fino al punto 6, perché dopo dovete eseguire questi 2 punti importanti:

          1-scrivete vicino a c:\users\Utente\Documenti\NetBeansProjects\JavaSocket-Client\dist> java -jar JavaSocket-Client.jar,                   127.0.0.1., e dopo 1234 e premete invio;
          
          2-ora vedete scritto "In ascolto con: Socket[addr=/127.0.0.1,port=1234,localport=49957]" e a capo il simbolo >, e                         vicino al > potete scrivere quello che volete e dopo inviare comodamente il messaggio, premendo invio;  
          
-Tornate al prompt Server per vedere se il messaggio é stato inviato; se sì allora deve esserci anche scritto "Connesso con: Socket[addr=/127.0.0.1,port=49957,localport=1234]", significa che il server si é connesso con il client. 

E avete fatto il vostro progetto! 
