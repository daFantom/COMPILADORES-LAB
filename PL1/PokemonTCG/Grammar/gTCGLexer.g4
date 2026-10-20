lexer grammar gTCGLexer;

TURN    : 'Turn' | 'turn' ;
POKEMON : 'Pokémon' ;
ADDED   : 'added' ;

// ============================================================
// gTCG - POKÉMON TCG LIVE LOG LEXER
// ============================================================


// ============================================================
// PALABRAS RESERVADAS / ESTRUCTURA DEL LOG
// ============================================================

SETUP
    : 'Setup'
    ;

CHOSE
    : 'chose'
    ;

HEADS
    : 'heads'
    ;

TAILS
    : 'tails'
    ;

FOR
    : 'for'
    ;

THE
    : 'the'
    ;

OPENING
    : 'opening'
    ;

COIN
    : 'coin'
    ;

FLIP
    : 'flip'
    ;

WON
    : 'won'
    ;

TOSS
    : 'toss'
    ;

DECIDED
    : 'decided'
    ;

TO
    : 'to'
    ;

GO
    : 'go'
    ;

FIRST
    : 'first'
    ;

DREW
    : 'drew'
    ;

DRAWN
    : 'drawn'
    ;

CARDS
    : 'cards'
    ;

CARD_WORD
    : 'card'
    ;

HAND
    : 'hand'
    ;

PLAYED
    : 'played'
    ;

ATTACHED
    : 'attached'
    ;

EVOLVED
    : 'evolved'
    ;

USED
    : 'used'
    ;

ON
    : 'on'
    ;

IN
    : 'in'
    ;

WITH
    : 'with'
    ;

WAS
    : 'was'
    ;

WERE
    : 'were'
    ;

IS
    : 'is'
    ;

NOW
    : 'now'
    ;

BECOME
    : 'become'
    ;

ACTIVE
    : 'Active'
    ;

SPOT
    : 'Spot'
    ;

BENCH
    : 'Bench'
    ;

DAMAGE
    : 'damage'
    ;

DISCARDED
    : 'discarded'
    ;

DISCARDS
    : 'discard'
    ;

SHUFFLED
    : 'shuffled'
    ;

DECK
    : 'deck'
    ;

INTO
    : 'into'
    ;

THEIR
    : 'their'
    ;

FROM
    : 'from'
    ;

MOVED
    : 'moved'
    ;

TAKE
    : 'took'
    ;

PRIZE
    : 'Prize'
    ;

PRIZE_CARDS
    : 'Prize cards'
    ;

KNOCKED
    : 'Knocked'
    ;

OUT
    : 'Out'
    ;

SWITCHED
    : 'switched'
    ;

RETIRED
    : 'retreated'
    ;

ENDED
    : 'ended'
    ;

OPPONENT
    : 'Opponent'
    ;

CONCEDED
    : 'conceded'
    ;

WINS
    : 'wins'
    ;

ALL
    : 'All'
    ;

TAKEN
    : 'taken'
    ;

A_SOMETHING
    : 'a' | 'A'
    ;

AND
    : 'and'
    ;

THEM
    : 'them'
    ;

// ============================================================
// CASOS ESPECIALES
// ============================================================

DAMAGE_BREAKDOWN
    : 'Damage breakdown'
    ;

BASE_DAMAGE
    : 'Base damage'
    ;

TOTAL_DAMAGE
    : 'Total damage'
    ;

ITEM
    : 'Item'
    ;

POSSESSIVE
    : ('\'' | '’') 's'
    ;


// ============================================================
// CARTAS
// ============================================================
//
// IMPORTANTE:
// Las alternativas más específicas van aquí antes de PLAYER.
// ANTLR selecciona el match más largo y, en caso de empate,
// la regla que aparece antes.
//
// Se incluyen las 9 barajas proporcionadas + las cartas que
// aparecen en los dos logs aunque no estén en esas listas.
// ============================================================

CARD
    :

// ---------- Mega Venusaur ex ----------

      'Meowth ex'
    | 'Bayleef'
    | 'Chikorita'
    | 'Bulbasaur'
    | 'Mega Venusaur ex'
    | 'Ivysaur'
    | 'Teal Mask Ogerpon ex'
    | 'Fezandipiti ex'
    | 'Meganium'

// ---------- Steven's Metagross ex ----------

    | 'Mega Mawile ex'
    | 'Jellicent ex'
    | 'Mega Skarmory ex'
    | 'Genesect ex'
    | 'Steven\'s Metang'
    | 'Steven\'s Beldum'
    | 'Frillish'
    | 'Steven\'s Metagross ex'

// ---------- N's Zoroark ex ----------

    | 'N\'s Zekrom'
    | 'N\'s Zorua'
    | 'N\'s Darmanitan'
    | 'N\'s Zoroark ex'
    | 'N\'s Darumaka'
    | 'Pecharunt ex'
    | 'N\'s Reshiram'

// ---------- Mew ex ----------

    | 'Hydreigon ex'
    | 'Zweilous'
    | 'Deino'
    | 'Mega Latias ex'
    | 'Latios'
    | 'Lillie\'s Clefairy ex'
    | 'Mew ex'

// ---------- Mega Sharpedo ex ----------

    | 'Mega Sharpedo ex'
    | 'Munkidori'
    | 'Carvanha'
    | 'Toxtricity'
    | 'Seviper'
    | 'Toxel'

// ---------- Mega Manectric ex ----------

    | 'Mega Eelektross ex'
    | 'Zekrom ex'
    | 'Eelektrik'
    | 'Electrike'
    | 'Tynamo'
    | 'Zeraora'
    | 'Mega Manectric ex'

// ---------- Mega Charizard X/Y ex ----------

    | 'Mega Charizard Y ex'
    | 'Mega Charizard X ex'
    | 'Oricorio ex'
    | 'Charmeleon'
    | 'Reshiram'
    | 'Charmander'

// ---------- Dragapult ex ----------

    | 'Drakloak'
    | 'Dreepy'
    | 'Dragapult ex'
    | 'Dusclops'
    | 'Duskull'
    | 'Dusknoir'

// ---------- Mega Lucario ex ----------

    | 'Solrock'
    | 'Makuhita'
    | 'Okidogi'
    | 'Mega Lucario ex'
    | 'Lunatone'
    | 'Riolu'
    | 'Hariyama'

// ---------- TRAINERS ----------

    | 'Lillie\'s Determination'
    | 'Grand Tree'
    | 'Poké Pad'
    | 'Lana\'s Aid'
    | 'Boss\'s Orders'
    | 'Forest of Vitality'
    | 'Night Stretcher'
    | 'Ultra Ball'
    | 'Wally\'s Compassion'
    | 'Colress\'s Tenacity'
    | 'Judge'
    | 'Dawn'
    | 'Team Rocket\'s Petrel'
    | 'Bug Catching Set'

    | 'Unfair Stamp'
    | 'Energy Recycler'
    | 'Rare Candy'
    | 'Buddy-Buddy Poffin'
    | 'Full Metal Lab'

    | 'Cyrano'
    | 'Hero\'s Cape'
    | 'Air Balloon'
    | 'Powerglass'
    | 'Binding Mochi'
    | 'Redeemable Ticket'
    | 'N\'s Castle'
    | 'N\'s PP Up'
    | 'Janine\'s Secret Art'

    | 'Scramble Switch'
    | 'Black Belt\'s Training'
    | 'Hilda'

    | 'Academy at Night'
    | 'Grimsley\'s Move'

    | 'Energy Search'
    | 'Canari'
    | 'Iris\'s Fighting Spirit'
    | 'Gravity Mountain'
    | 'Secret Box'
    | 'Carmine'

    | 'Energy Retrieval'
    | 'Battle Cage'
    | 'Precious Trolley'
    | 'Firebreather'
    | 'Mega Signal'

    | 'Crispin'
    | 'Jamming Tower'

    | 'Salvatore'
    | 'Fighting Gong'
    | 'Maximum Belt'
    | 'Tarragon'
    | 'Premium Power Pro'

// ---------- ENERGY ----------

    | 'Basic Grass Energy'
    | 'Basic Metal Energy'
    | 'Basic Psychic Energy'
    | 'Basic Darkness Energy'
    | 'Basic Lightning Energy'
    | 'Basic Fire Energy'
    | 'Basic Fighting Energy'
    | 'Prism Energy'
    | 'Neo Upper Energy'

// ---------- CARTAS QUE APARECEN EN LOS LOGS ----------

    | 'Rocky Fighting Energy'
    | 'Fan Rotom'
    | 'Hoothoot'
    | 'Noctowl'
    | 'Prime Catcher'
    | 'Switch'
    ;


// ============================================================
// ATAQUES
// ============================================================

ATTACK
    : 'Aura Jab'
    | 'Mega Brave'
    | 'Lunar Cycle'
    | 'Wild Press'
    | 'Heave-Ho Catcher'
    | 'Last-Ditch Catch'
    | 'Flip the Script'
    | 'Fan Call'
    | 'Teal Dance'
    ;


// ============================================================
// NÚMEROS
// ============================================================

NUMBER
    : [0-9]+
    ;


// ============================================================
// IDENTIFICADOR DE JUGADOR
// ============================================================
//
// Ejemplos:
//
// DudeJaden
// DrCompiler
// PJPJPJPJPJPJ
//
// No conocemos de antemano los nombres de los jugadores,
// por eso NO son palabras reservadas.
// ============================================================

PLAYER
    : [a-zA-Z0-9_]+
    
    ;


// ============================================================
// PUNTUACIÓN
// ============================================================

DOT
    : '.'
    ;

COMMA
    : ','
    ;

COLON
    : ':'
    ;

EXCLAMATION
    : '!'
    ;

LPAREN
    : '('
    ;

RPAREN
    : ')'
    ;

BULLET
    : '•'
    ;

HYPHEN
    : '-'
    ;


// ============================================================
// SALTO DE LÍNEA
// ============================================================
//
// NO debemos eliminar los saltos de línea porque el parser los
// utiliza para saber dónde termina cada acción.
// ============================================================

NEWLINE
    : '\r'? '\n'
    ;


// ============================================================
// ESPACIOS
// ============================================================

WS
    : [ \t]+ -> skip
    ;

