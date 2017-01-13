
# Java-Sockets
Concetti e realizzazione di una semplice connessione Client/Server usando Sockets in Java
 # DESCRIZIONE DEL PROGETTO
-A COSA SERVE?
Serve ad inviare un messaggio attraverso il Prompt, pur sapendo che il Java Socket-Client rappresenta il mittente, mentre il Java   Socket-Server rappresenta il destinatario.

## Istruzioni
Per prima cosa dovete andare su www.oracle.com e scaricare NetBeans (se non si ha).
Una volta scaricato e installato dovete entrarci e poi andare su file e cliccare su New Project; apparirà una seconda finestra dove c'è un elenco e selezionate Java e poi cliccare su NEXT, poi inserirete il nome del progetto vicino Project Name in questo caso Java Socket-Client (mittente) prima di cliccare su FINISH togliere la spunta su Create Main Class.
Creare anche il Java Socket-Server seguendo la stessa procedura qui sopra.
Prarticamente una volta creato tutti e due i progetti   

### Prerequisiti
Java SDK (Software Development Kit) - programma per la compilazione (javac) da codice in Java a ByteCode. L'installazione comprende anche Java JRE (Java Runtime Envirorment) che fornisce la Virtual Machine (VM) su cui far eseguire il ByteCode.
```
E' suggerito anche l'utilizzo di netBeans IDE (Integrated Development Envirorment)
```

### Installazione
Scarica i files del progetto cliccando "Clone/Download"
* in NetBeans crea due nuovi progetti "Java-Sockets-Client" e "Java-Sockets-Server"

* estrai i files e spostali nella sub-directory "src" dei rispettivi progetti (es. Documents\NetBeansProjects\Java-Sockets-Server\src)

## Uso
Dal terminale del Server:
```
java ServerTestoMultiThreaded <server port>
```
Da un terminale Client:
```
java clientTesto <host> <server port>
dove:
* host puo' essere espresso sia in forma numerica (es. 127.0.0.1) che in forma alfanumerica (es. www.nomeSito.com)
```
NOTA: posso collegarmi al server con quanti Clients desidero, sia su stesso computer che da terminali su computer diversi.

### Esempio usando stesso computer sia per eseguire Server che multipli Clients
Da finestra di comando esguire il Server:
```
cd Documents\NetBeansProjects\Java-Sockets-Server\src
java ServerTestoMultiThreaded 1234
```
Da nuova finestra di comando esguire il ```primo``` Client
```
cd Documents\NetBeansProjects\Java-Sockets-Client\src
java client-Testo localhost 1234
```
Da nuova finestra di comando esguire il ```secondo``` Client
```
cd Documents\NetBeansProjects\Java-Sockets-Client\src
java client-Testo localhost 1234
```
## Diventa un collaboratore
Questa e' la lista di nuove funzioni da aggiungere al progetto:
```
1. Di seguito alla nuova connessione di un Client con il Server,
   richiedere il "NickName" e utilizzarlo per la visualizzazione del messaggio 
   (invece della porta del Client come da progetto iniziale)
```
```
2. Aggiungere la possibilita' di mandare un comando (es. ListaUtenti) al Server 
   che di conseguenza restituisca la lista di tutti i Clients connessi.
```
```
3. Group Chat 
3.1. Possibilita' di iniziare una o piu' "group chat" fornendo per ogni chat il "Soggetto della discussione"
3.2. Possibilita' di invitare uno o piu' utenti conessi a entrare nella "goup chat"
3.3. Possibilita' di uscire dalla "group chat"
```
Mentre le modifiche descritte dai primi due punti risulteranno in una fusione (merge), le modifiche descritti dai punti 3 dovranno far parte di un nuovo progetto che parte da quello originario (fork).
 
## Licenza
opensource nel modo piu' completo del termine :) senza alcuna restrizione!

## Ringraziamenti
a mia moglie che mi ha permesso di trovare il tempo per questo progetto guardando il bambino ;)
