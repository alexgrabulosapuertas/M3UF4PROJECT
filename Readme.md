
# ProjecteUF4
<h2>Esquema principal del projecte:</h2>
<h3>Menú del programa:</h3>
<ol>
<li>Carregar dades de la base de dades.</li>
<li>Consultar dades.
  <ol>
    <li>Empleat amb el salari més alt.</li>
    <li>Instrument més barat.</li>
    <li>Vinil més antic.</li>
    <li>Mostrar informació.</li>
    <li>Tornar al menú principal.</li>
  </ol>
</li>
<li>Afegir dades.
  <ol>
    <li>Vinil.</li>
    <li>Client.</li>
    <li>Instrument.</li>
    <li>Empleat.</li>
    <li>Tornar al menú principal.</li>
  </ol>
</li>
<li>Eliminar dades.
  <ol>
  <li>Client.</li>
  <li>Empleat.</li>
  <li>Vinil.</li>
  <li>Instrument.</li>
  <li>Tornar al menú principal.</li>
  </ol>
</li>
 <li>Sortir</li>
</ol>

<h2>Manual d'usuari:</h2>
<p>El nostre projecte va sobre un programa que hem creat per gestionar una botiga de música en la qual es venen vinils i instruments. El programa va destinat a l'usuari Administrador perquè pugui gestionar les dades de la botiga. De la nostra botiga emmagatzemem els empleats que hi treballen, els clients, els vinils i els instruments. En inicialitzar el programa, se'ns mostra un menú (detallat més a dalt) amb totes les funcionalitats del nostre programa. Per seleccionar una de les diferents funcionalitats (carregar, consultar, afegir o eliminar dades) simplement haurem d'escriure el número que acompanya a cada funcionalitat.</p>

![alt text](https://github.com/alexgrabulosapuertas/M3UF4PROJECT/blob/master/img/1.png)

<h3>Carregar dades</h3>
<p>Aquesta funcionalitat carrega al nostre programa les dades que tenim emmagatzemades a la nostra base de dades. Per poder fer-ho es connecta a la nostra base de dades (que es troba en una màquina de AWS) i carrega les dades utilitzant sentències SQL. Les dades que carrega són els empleats que treballen a la nostra botiga, crea un objecte per cada un d'ells i els guarda dintre d'un ArrayList d'empleats, segueix el mateix procés pels clients que visiten la nostra botiga, els instruments que venem a la nostra botiga i els vinils que venem a la nostra botiga. Un cop les dades estan carregades se'ns mostra un missatge assegurant que han estat carregades.</p>

![alt text](https://github.com/alexgrabulosapuertas/M3UF4PROJECT/blob/master/img/2.png)

<h3>Consultar dades</h3>
<p>Aquesta funcionalitat permet realitzar consultes de les nostres dades. Et mostra un submenú perquè seleccionis una de les diferents opcions. Hi ha tres consultes predefinides i una opció que et permet mostrar totes les dades que tens carregades en el programa. Les tres consultes predefinides són: l'empleat amb el salari més alt, l'instrument que té el preu més barat i el vinil que té l'any de publicació més antic. Si escrivim el número 0 tornarem al menú principal.<p/>

![alt text](https://github.com/alexgrabulosapuertas/M3UF4PROJECT/blob/master/img/3.png)

<h4>Empleat amb el salari més alt:</h4>
<p>Aquesta funcionalitat agafa l'ArrayList d'empleats i utilitzant els get de l'atribut salari de l'objecte empleat compara cada un dels salaris fins a trobar l'empleat amb el salari més alt. Et mostra el nom de l'empleat, el seu ID i el seu salari.</p>

![alt text](https://github.com/alexgrabulosapuertas/M3UF4PROJECT/blob/master/img/4.png)

<h4>Instrument més barat:</h4>
<p>Aquesta funcionalitat agafa l'ArrayList d'instruments i utilitzant els get de l'atribut preu de l'objecte instrument compara cada un dels preus fins a trobar l'instrument amb el preu més baix. Et mostra el nom de l'instrument, el seu ID i el seu preu.</p>

![alt text](https://github.com/alexgrabulosapuertas/M3UF4PROJECT/blob/master/img/5.png)

<h4>Vinil més antic:</h4>
<p>Aquesta funcionalitat agafa l'ArrayList de vinils i utilitzant els get de l'atribut any de l'objecte vinil compara cada un dels anys fins a trobar el vinil amb l'any de publicació més antic. Et mostra el nom del vinil, el seu ID, l'autor del vinil i l'any de publicació del vinil.</p>

![alt text](https://github.com/alexgrabulosapuertas/M3UF4PROJECT/blob/master/img/6.png)

<h4>Mostrar informació:</h4>
<p>Aquesta funcionalitat et mostra tota la informació carregada en el programa. Et mostra una taula d'empleats a on pots veure el ID de l'empleat, el seu nom, el seu primer cognom i el seu salari. Et mostra una taula de clients a on pots veure el ID del client, el seu nom, el seu primer congom i la seva edat. Et mostra una taula de vinils a on pots veure el ID del vinil, el seu nom, el seu autor, l'any de publicació del vinil i el seu preu. Et mostra una taula d'instruments a on pots veure el ID de l'instrument, el seu nom, el material, el color i el seu preu.<p>

![alt text](https://github.com/alexgrabulosapuertas/M3UF4PROJECT/blob/master/img/7.png)
![alt text](https://github.com/alexgrabulosapuertas/M3UF4PROJECT/blob/master/img/8.png)

<h3>Afegir dades</h3>
<p>Aquesta funcionalitat permet afegir dades al nostre programa i emmagatzemar-los a la nostra base de dades. Primer et mostra un submenú preguntante que vols afegir: un empleat, un client, un vinil o un instrument. Un cop selecciones una de les diferents opcions hauràs d'introduir les dades que et demana el programa. Un cop introduïdes totes les dades crea un objecte i l'afegeix al seu ArrayList corresponent. Després mitjançant sentències SQL afegeix les dades, utilitzant els gets i sets de l'objecte, a la nostra base de dades. Si escrivim el número 0 tornarem al menú principal.<p/>

![alt text](https://github.com/alexgrabulosapuertas/M3UF4PROJECT/blob/master/img/9.png)
![alt text](https://github.com/alexgrabulosapuertas/M3UF4PROJECT/blob/master/img/10.png)


<h3>Eliminar dades</h3>
<p>Aquesta funcionalitat et permet eliminar dades que tenim carregades en el nostre programa. Primer et mostra un submenú preguntante que vols eliminar: un empleat, un cient, un vinil o un instrument. Un cop selecciones una de les diferents opcions et mostrarà una taula de l'opció que hagis seleccionat. Per exemple si selecciono, instruments em mostrarà una taula de tots els instruments que hi han carregats en el programa. Per eliminar-lo només hauré d'escriure el ID de l'instrument que vull eliminar. Eliminarà l'objecte instrument seleccionat i també l'eliminarà de l'ArrayList d'instruments. Després ens tornarà a mostrar la taula perquè puguem veure com s'ha eliminat. Si escrivim el número 0 tornarem al menú principal.<p/>

![alt text](https://github.com/alexgrabulosapuertas/M3UF4PROJECT/blob/master/img/11.png)
 ![alt text](https://github.com/alexgrabulosapuertas/M3UF4PROJECT/blob/master/img/12.png)

<h3>Sortir</h3>
<p>Si escrivim un 0 en el nostre menú principal finalitzarem el programa i se'ns mostrarà un missatge de comiat.
  
 ![alt text](https://github.com/alexgrabulosapuertas/M3UF4PROJECT/blob/master/img/13.png)
  
 <h2>Vídeo:</h2>
  
 <p>FALTA EL VIDE!!!!!!!!!!!!!!!!!</P>
  
<h2>PPO:</h2>
<p>En el nostre programa tenim sis principals classes de les quals es crearan les seves respectives instàncies.</p>
  
<h3>Botiga</h3>
<p>Tenim una classe anomenada Botiga que té com atributs: botigaId, nom, adreça, població, ArrayList<Client>, ArrayList<Empleat>, ArrayList<Instrument>, ArrayList<Client>. A l'inicialitzar el programa creem una instància de la classe botiga utilitzant el constructor que no té paràmetres d'entrada perquè ja té els seus atributs definits. Utilitzant aquesta instància de la classe botiga li passem les diferents instàncies (empleat, client, vinil i instrument) utilitzant ArrayList per poder emmagatzemar-les dintre de la pròpia botiga. Això ens permetrà que si en un futur tenim diferents botigues puguem emmagatzemar la informació dividida per cada instància de la classe botiga. Nosaltres només utilitzarem una instància de la classe botiga i aquesta serà la que passem a totes les funcionalitats del nostre programa (carregar, consultar, afegir i eliminar dades). Que guardem els clients, els empleats, els instruments i els vinils en ArrayList ens permet d'una forma senzilla accedir a tots ells i mostrar un llistat de tots ells per pantalla. A aquesta classe també tenim un get i un set per a cada atribut, per a poder obtenir i substituir els valors dels diferents atributs. A part aquesta classe té una interfície (BotigaI) fet que fa que estigui obligada a tenir els mètodes que es defineixen dintre la interfície.</p>
  
<h3>Persona</h3>
<p>Tenim la classe Persona, que és la classe pare de client i empleat, per tant heren tots els seus atributs i els seus mètodes. A la classe Persona tenim els atributs: botigaId, nom, cognom, DNI, edat, sexe, telèfon, email, adreça i població. Com la idea és crear interfícies utilitzant aquesta classe necessitem constructors així que hem creat dos constructors de Persona a més a més d'un get i un set per a tots els atributs de la classe Persona. Finalment hem fet la funció toString() per a obtenir el valor de tots els atributs.</p>

<h3>Empleat</h3>
<p>Tenim una classe anomenada Empleat que és una classe filla de la superclasse Persona per lo tant hereda els seus atributs i els seus mètodes. Els únics atributs que correspon a la classe empleat és empleatId i salari. En aquesta classe també tenim un get i un set per a cada atribut, per a poder obtenir i substituir els valors dels diferents atributs, juntament amb la funció toString per poder printar els seus atributs. A l'hora de carregar les dades de la base de dades creem una instància de la classe empleat per cada empleat i l'afegim a l'ArrayList d'empleats per poder emmagatzemar les dades en el nostre programa.</p>
  
<h3>Client</h3>
<p>Tenim una classe anomenada Client que és una classe filla de la superclasse Persona per lo tant hereda els seus atributs i els seus mètodes. Els únics atributs que correspon a la classe client és clientId En aquesta classe també tenim un get i un set per a cada atribut, per a poder obtenir i substituir els valors dels diferents atributs, juntament amb la funció toString per poder printar els seus atributs, juntament amb la funció toString per poder printar els seus atributs. A l'hora de carregar les dades de la base de dades creem una instància de la classe client per cada client i l'afegim a l'ArrayList de clients per poder emmagatzemar les dades en el nostre programa.</p>
  
<h3>Vinil</h3>
<p>Tenim una classe anomenada Vinil, en aquesta classe tenim els atributs vinilId, clientId, empleatId, nom, preu, autor, any i estil. Aquesta classe és utilitzada per a crear instàncies de Vinil, per aquest motiu tenim 2 constructors de Vinil. A aquesta classe també tenim un get i un set per a cada atribut, per a poder obtenir i substituir els valors dels diferents atributs. A més a més tenim la funció toString() a on obtenim els valors de tots els atributs per a poder printar-ho. Finalment tenim un enum dels Estils a on tenim els diferents estils.</p>

<h3>Instrument</h3>
<p>Tenim una classe anomenada Instrument, en aquesta classe tenim els atributs intstrumentId, clientId, empleatId, nom, tipus, color, material i preu. Aquesta classe es utilitzada principalment per a crear instàncies d'Instrument, per això tenim dos constructors. En aquesta classe també tenim un get i un set per a cada atribut, d'aquesta forma podem obtenir i substituir el valor de tots els atributs. A més a més tenim la funció toString() a on retornem el valor actual de tots els atributs per a poder printar-ho. Finalment tenim un enum COLOR a on tenim tots els colors disponibles pels instruments.</p>   
   
<h2>Version Control System:</h2>  
<h3>Problemes</h3>
<p>Al principi vam tenir problemes amb el github per les diferents branques, ja que no enteníem molt bé com fer els commits amb diferents branques i era una mica confós.</p>

<h3>Solucions</h3>
<p>Vam solucionar-ho buscant informació a internet i preguntant a classe i els companys ens van ajudar.</p>

<h3>Decisions</h3>
<p>Vam decidir tenir les següents classes Empleat, Instrument, Client i Vinil, després ens vam donar conta que estarien en una botiga la que seria un altre classe i que necessitaríem la classe Interfície per a poder printar, després vam fer classes per a les diferents opcions del menú i vam tenir les classes, AfegirDades, Consultes, GestorDades i ProjectePOO que és a on estaria el main i el menú. Després vam crear la classe ConnexioBD per a fer funcions per a connectar i desconnectar la BD i d'aquesta forma no haver de ficar el codi de la connecció i descconecció a cada opció. Després vam veure que l'Empleat i el Client tenien molts atributs en comú així que vam crear la classe Persona i vam fer que Client i Empleat fos extends de Persona. Finalment vam fer la interficie de Botiga anomenada BotigaI.</p>
  
  
  <h3> UML </h3>

<h4> Diagrama de classes versió 1: </h4>

![alt text](https://github.com/alexgrabulosapuertas/M3UF4PROJECT/blob/master/img/V1Complet.PNG)


<h4> Diagrama de classes versió 2:  </h4>

![alt text](https://github.com/alexgrabulosapuertas/M3UF4PROJECT/blob/master/img/V2Complet.PNG)

<p> En aquest diagrama a diferència de l'altre és pot veure com apareixen elements nous, com ara aparèix la taula "Concert" i "Carro". A la primera se li ha creat una generalització. D'altra banda la taula "Carro" permet calcular el preu total gastat per el client, també si aquest s'elimina la taula "Carro" també s'eliminara. També se li ha creat una associativa per a poder tenir el número del carro.

<h4> Diagrama d'ús: </h4>

![alt text](https://github.com/alexgrabulosapuertas/M3UF4PROJECT/blob/master/img/UsComplet.PNG)

<p> En aquest diagrama es pot veure com funciona la nostra aplicació, aquí teniu la documentació per a poder-ho entendre amb més facilitat. </p>

<p> Aquestes són les funcions les quals podrà fer l'usuari Administrador: </p>

![alt text](https://github.com/alexgrabulosapuertas/M3UF4PROJECT/blob/master/img/A.Client.PNG)

![alt text](https://github.com/alexgrabulosapuertas/M3UF4PROJECT/blob/master/img/A.Instrument.PNG)

![alt text](https://github.com/alexgrabulosapuertas/M3UF4PROJECT/blob/master/img/A.Vinil.PNG)

![alt text](https://github.com/alexgrabulosapuertas/M3UF4PROJECT/blob/master/img/E.Client.PNG)

![alt text](https://github.com/alexgrabulosapuertas/M3UF4PROJECT/blob/master/img/E.Empleat.PNG)

![alt text](https://github.com/alexgrabulosapuertas/M3UF4PROJECT/blob/master/img/E.Instrument.PNG)

![alt text](https://github.com/alexgrabulosapuertas/M3UF4PROJECT/blob/master/img/E.Vinil.PNG)

![alt text](https://github.com/alexgrabulosapuertas/M3UF4PROJECT/blob/master/img/ConsultaDades.PNG)

![alt text](https://github.com/alexgrabulosapuertas/M3UF4PROJECT/blob/master/img/CarregarDades.PNG)

<p> Aquestes són les funcions les quals podrà fer l'usuari Client: </p>

![alt text](https://github.com/alexgrabulosapuertas/M3UF4PROJECT/blob/master/img/S.Instrument.PNG)

![alt text](https://github.com/alexgrabulosapuertas/M3UF4PROJECT/blob/master/img/S.Vinil.PNG)

![alt text](https://github.com/alexgrabulosapuertas/M3UF4PROJECT/blob/master/img/Concert.PNG)


<p>Aniol Barrilado Colom, Àlex Grabolusa Puertas i Manel Colàs Casals - Projecte UF4 - M03 Programació</p>
