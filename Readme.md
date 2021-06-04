
# ProjecteUF4
<h2>Esquema principal del projecte:</h2>
<h3>Menú del programa</h3>
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

<h3>Carregar dades</h3>
<p>Aquesta funcionalitat carrega al nostre programa les dades que tenim emmagatzemades a la nostra base de dades. Per poder fer-ho es connecta a la nostra base de dades (que es troba en una màquina de AWS) i carrega les dades utilitzant sentències SQL. Les dades que carrega són els empleats que treballen a la nostra botiga, crea un objecte per cada un d'ells i els guarda dintre d'un ArrayList d'empleats, segueix el mateix procés pels clients que visiten la nostra botiga, els instruments que venem a la nostra botiga i els vinils que venem a la nostra botiga. Un cop les dades estan carregades se'ns mostra un missatge assegurant que han estat carregades.</p>

![alt text](CAPTURA 1)

<h3>Consultar dades</h3>
<p>Aquesta funcionalitat permet realitzar consultes de les nostres dades. Et mostra un submenú perquè seleccionis una de les diferents opcions. Hi ha tres consultes predefinides i una opció que et permet mostrar totes les dades que tens carregades en el programa. Les tres consultes predefinides són: l'empleat amb el salari més alt, l'instrument que té el preu més barat i el vinil que té l'any de publicació més antic. Si escrivim el número 0 tornarem al menú principal.<p/>

![alt text](CAPTURA 2)

<h4>Empleat amb el salari més alt</h4>
<p>Aquesta funcionalitat agafa l'ArrayList d'empleats i utilitzant els get de l'atribut salari de l'objecte empleat compara cada un dels salaris fins a trobar l'empleat amb el salari més alt. Et mostra el nom de l'empleat, el seu ID i el seu salari.</p>

![alt text](CAPTURA 3)

<h4>Instrument més barat</h4>
<p>Aquesta funcionalitat agafa l'ArrayList d'instruments i utilitzant els get de l'atribut preu de l'objecte instrument compara cada un dels preus fins a trobar l'instrument amb el preu més baix. Et mostra el nom de l'instrument, el seu ID i el seu preu.</p>

![alt text](CAPTURA 4)

<h4>Vinil més antic</h4>
<p>Aquesta funcionalitat agafa l'ArrayList de vinils i utilitzant els get de l'atribut any de l'objecte vinil compara cada un dels anys fins a trobar el vinil amb l'any de publicació més antic. Et mostra el nom del vinil, el seu ID, l'autor del vinil i l'any de publicació del vinil.</p>

![alt text](CAPTURA 5)

<h4>Mostrar informació</h4>
<p>Aquesta funcionalitat et mostra tota la informació carregada en el programa. Et mostra una taula d'empleats a on pots veure el ID de l'empleat, el seu nom, el seu primer cognom i el seu salari. Et mostra una taula de clients a on pots veure el ID del client, el seu nom, el seu primer congom i la seva edat. Et mostra una taula de vinils a on pots veure el ID del vinil, el seu nom, el seu autor, l'any de publicació del vinil i el seu preu. Et mostra una taula d'instruments a on pots veure el ID de l'instrument, el seu nom, el material, el color i el seu preu.<p>

![alt text](CAPTURA 6)
![alt text](CAPTURA 7)

<h3>Afegir dades</h3>
<p>Aquesta funcionalitat permet afegir dades al nostre programa i emmagatzemar-los a la nostra base de dades. Primer et mostra un submenú preguntante que vols afegir: un empleat, un client, un vinil o un instrument. Un cop selecciones una de les diferents opcions hauràs d'introduir les dades que et demana el programa. Un cop introduïdes totes les dades crea un objecte i l'afegeix al seu ArrayList corresponent. Després mitjançant sentències SQL afegeix les dades, utilitzant els gets i sets de l'objecte, a la nostra base de dades. Si escrivim el número 0 tornarem al menú principal.<p/>

![alt text](CAPTURA 8)


<h3>Eliminar dades</h3>
<p>Aquesta funcionalitat et permet eliminar dades que tenim carregades en el nostre programa. Primer et mostra un submenú preguntante que vols eliminar: un empleat, un cient, un vinil o un instrument. Un cop selecciones una de les diferents opcions et mostrarà una taula de l'opció que hagis seleccionat. Per exemple si selecciono, instruments em mostrarà una taula de tots els instruments que hi han carregats en el programa. Per eliminar-lo només hauré d'escriure el ID de l'instrument que vull eliminar. Eliminarà l'objecte instrument seleccionat i també l'eliminarà de l'ArrayList d'instruments. Després ens tornarà a mostrar la taula perquè puguem veure com s'ha eliminat. Si escrivim el número 0 tornarem al menú principal.<p/>

![alt text](CAPTURA 9)

<h3>Sortir</h3>
<p>Si escrivim un 0 en el nostre menú principal finalitzarem el programa i se'ns mostrarà un missatge de comiat.
  
 ![alt text](CAPTURA 10)
