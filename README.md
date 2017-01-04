# LED-Array
Ett Java projekt för att styra ett fält av lysdioder, GU4

Välkommen till projektet! Här ligger allt mellan himmel och jord angående det här projektet. Denna readme går igenom:

1. Hur kod i projektet skall kommenteras
2. Grundläggande funktionalitet hos Git
3. Att göra lista på projektet, vad som skall göras mm.
4. Intressanta länkar och resurser

Detta täcker naturligtvis inte allt utan detta är enbart extra saker som inte direkt finns med i det 14-sidor långa dokument kring hur den här gruppuppgiften går till.

===================================================================
1. Dokumentation
===================================================================

Alla klasser och där emellan måste dokumenteras noggrant. Endast engelsk dokumentation för olika charsets kan förekomma. Inuti init-paketet finns en exempelfil på hur koden ska kommenteras.
Denna är tagen från laboration16 och kallas för ExampleOfHowToCommentCode. Det är nödvändigt att reglerna följs då man ska kunna generera javadocs av detta.
Utöver det ska även skapare, deltagare som redigerat såväl som datum av då klassen skapades finnas med längst upp i klassen finnas. 

===================================================================
2. Git
===================================================================

Git är i grund och botten ett verktyg för versionshantering. I större projekt kommer man ha funktionalitet som inte är 100% förutsägbar.
Man kommer att råka göra missar som kan förstöra programmet, men man vet inte var dessa ändringar har skett. Då kommer Git till undsättning
där man enkelt kan återställa en tidigare version av programmet innan någonting förstördes.

Utöver versionshantering öppnar även Git upp för möjligheten att arbeta tillsammans, då utformningen av Git gör detta enklare i form av versionshantering, men även andra saker som beskrivs nedan.

Ett projekt som ska versionshanteras av Git kallas för ett repository, som enbart är en viss mapp med filer/andra mappar inuti sig. 
Git i grund och botten körs via en kommandotolk vid namn Git-bash, som är en form av unix-baserad terminal för att utföra diverse operationer. Då det är tidskonsumerande
att lära sig allt det där för att inte tala om "mekkigt", kommer vi att köra det som kallas för GitKraken (Detta finns ej installerat på skolans datorer, utan där används Git GUI, som har ganska lik funktionalitet). 
Med dessa kan man skapa repositories. Man kan även klona existerande repositories (vilket ni gör för att komma åt projektet).

Eftersom detta projekt måste ligga någonstans är det praktiskt att skicka (pusha) upp det mot en server. Ett populärt sätt att göra detta på är via GitHub, som är en sida där man kan ladda upp och kolla även på andras projekt.
Alternativ existerar också till det här (BitBucket, alternativt använda egen server om man jobbar på företag). Vårt projekt ligger på GitHub men notera att det är public för god anda av öppen källkod.

Video för att komma igång med grunderna:
https://www.youtube.com/channel/UCp06FAzrFalo3txskS1gCfA

Mer komplett lista (Täcker främst grunderna i Git och Git Bash):
https://www.youtube.com/playlist?list=PL6gx4Cwl9DGAKWClAD_iKpNC0bGHxGhcx

===================================================================
3. Att göra lista (kommer tillökas/minska kontinuerligt), arbetar ni med en viss sak skriv upp erat namn intill uppgiften!
===================================================================
- Porta projektet till Android (Icke obligatoriskt): Porta hela projektet så det kan köra på en Android mobil, om någon är uppe för detta.
- Kommentera testsuites/StringToColorDisplayParser programmet, såväl som huvudprogrammet.

Åtminståne en av följande extrauppgifter måste göras:

- Skriva i olika riktningar på displayen, finns någorlunda stöd för detta redan, men inte helt implementerat. Kolla WritingDirection för detta. Man ska i så fall kunna via antingen knappar, eller annan form av fin styrning kontrollera detta i programmet.
- Kunna styra hur lång ColorDisplay ska vara. Den kan skalas i nuläget genom att dra ut fönstret, men tanken är i så fall att fler celler ska visas. Vill man ha en riktig utmaning kan man försöka fixa så man kan ha flera rader i programmet!
- Kunna ta en bild och representera denna i en ColorDisplay, denna uppgift täcks under optionella uppgifter i uppgiftsbeskrivningen.
- Lägga till en transparency slider för att justera transparensen på texten som åker igenom.

===================================================================
4. Intressanta länkar & Resurser
===================================================================

Sidan där alla karaktärer är mappade från. 
http://www.1001fonts.com/subway-ticker-font.html#character-map

En sida där man kan skapa alla klassdiagram som kommer behövas senare för momentet där man ska lämna in klassdiagram över alltihopa.
https://www.genmymodel.com/class-diagram-online

ArraySupporter:

Ett bibliotek för arrayer, ungefär som det vi gjorde på P4, bara det att den innehåller mycket mer funktionalitet som används för det här projektet. 