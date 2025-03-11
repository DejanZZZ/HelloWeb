# HelloWeb Project

Questo progetto è una semplice applicazione web basata su **Java** utilizzando **Maven** per la gestione delle dipendenze, **JSP (Java Server Pages)** per la parte di visualizzazione e **Jersey** per creare un'API REST.

## Attività Svolta

1. **Creazione del progetto Maven**
   - È stato creato un nuovo progetto Maven denominato `HelloWeb`.
   - È stata configurata la struttura del progetto, con l'integrazione della parte web in `src/main/webapp`.

2. **Implementazione della JSP**
   - La pagina `index.jsp` visualizza un messaggio di benvenuto personalizzato, che include:
     - **Benvenuto Utente Curioso, questo è la mia prima JSP.**
     - La **data odierna**.
     - Un **link** che rimanda alla pagina dell'autore.
   - La pagina `author.jsp` visualizza informazioni sull'autore, come nome, cognome e classe.

3. **Creazione dell'API REST**
   - Utilizzando il framework **Jersey**, è stata creata un'API REST disponibile all'endpoint `/api/test`.
   - L'API restituisce un semplice messaggio di testo: `"Ciao!"`.

4. **Configurazione del server Jetty**
   - Il progetto è stato eseguito in un server **Jetty** tramite Maven, utilizzando il plugin `jetty-maven-plugin`.
   - Il server è stato configurato per rispondere su `http://localhost:8080/HelloWeb`.

## Componenti Utilizzati

### **Maven**
- **Maven** è stato utilizzato per gestire le dipendenze e la build del progetto.
- Il file `pom.xml` contiene le dipendenze principali per il progetto, tra cui:
  - **Jersey** per la creazione dell'API REST.
  - **JSP** per la gestione delle pagine web dinamiche.
  - **Jetty** come server per eseguire l'applicazione web.

### **JSP (Java Server Pages)**
- **JSP** è stato utilizzato per creare le pagine dinamiche, come `index.jsp` e `author.jsp`.
- `index.jsp` mostra un messaggio di benvenuto con la data corrente.
- `author.jsp` visualizza informazioni personali dell'autore.

### **Jersey**
- **Jersey** è il framework utilizzato per creare l'API REST.

### **Jetty**
- **Jetty** è stato utilizzato come server per eseguire il progetto web.
- Il progetto è stato configurato per girare su Jetty utilizzando il plugin Maven `jetty-maven-plugin`.
