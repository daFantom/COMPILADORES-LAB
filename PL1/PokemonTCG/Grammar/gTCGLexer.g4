lexer grammar gTCGLexer;

MULLIGAN: 'Mulligan' | 'Mulligans' | 'mulligan' | 'mulligans';
TURN    : 'Turn' | 'turn' ;
POKEMON : 'Pokémon' ;
ADDED   : 'added' ;
REVEALED : 'revealed';
AT : 'at';
LEAST : 'least';
PUT : 'put';
COUNTERS : 'counters';

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

FLIPPED
    : 'flipped'
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
    : 'cards' | 'Cards'
    ;

CARD_WORD
    : 'card'
    ;

ABILITY_WORD
    : 'Ability'
    ;
SUPPORTER_WORD
    : 'Supporter'
    ;

ATTACK_WORD
    : 'Attack'
    ;

POKEMON_TOOL
    : 'Pokémon Tool'
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

OF
    : 'of'
    ;

ON
    : 'on'
    ;

IN
    : 'in'
    ;

IT
    : 'it'
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

LANDED
    : 'landed'
    ;

ACTIVE
    : 'Active'
    ;
ACTIVATED
    : 'activated'
    ;

SPOT
    : 'Spot' | 'spot'
    ;

BENCH
    : 'Bench'
    ;

STADIUM
    : 'Stadium'
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
    : 'all' | 'All'
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

ENERGY
    : 'Energy'
    ;

SELECTED
    : 'selected'
    ;

YOU
    : 'You' | 'you'
    ;

MORE_WORD
    : 'more'
    ;

BECAUSE
    : 'because'
    ;

WEAKNESS
    : 'Weakness'
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
    | 'Energy Coin'

// ---------- CARTAS QUE APARECEN EN LOS LOGS ----------

    | 'Rocky Fighting Energy'
    | 'Fan Rotom'
    | 'Hoothoot'
    | 'Noctowl'
    | 'Prime Catcher'
    | 'Switch'
    | 'Cinderace'
    | 'Mega Zygarde ex'
    | 'Team Rocket\'s Watchtower'
    | 'Pokégear 3.0'
    | 'Scorbunny'
    | 'Fennekin'
    | 'Smoochum'
    | 'Teal Mask Ogerpon'
    | 'Mega Diancie ex'
    | 'Ralts'
    | 'Clefairy'
    | 'Mega Kangaskhan ex'
    | 'Hearthflame Mask Ogerpon'
    | 'Brock\'s Scouting'
    | 'Mega Clefable ex'
    | 'Delphox'
    | 'Mega Audino ex'
    | 'Raboot'
    | 'Kirlia'
    | 'Wondrous Patch'
    | 'Mega Floette ex'
    | 'Mystery Garden'
    | 'Braixen'
    | 'Jumbo Ice Cream'
    | 'Core Memory'
    | 'Ciphermaniac\'s Codebreaking'
    | 'Yveltal'
    | 'Mega Darkrai ex'
    | 'Gastly'
    | 'Dark Bell'
    | 'Hop\'s Corviknight'
    | 'Hop\'s Rookidee'
    | 'Nemona'
    | 'Drayton'
    | 'Reshiram ex'
    | 'Noibat'
    | 'Technical Machine: Evolution'
    | 'Hop\'s Cramorant'
    | 'Boomerang Energy'
    | 'Levincia'
    | 'Surfer'
    | 'Hop\'s Corvisquire'
    | 'Noivern'
    | 'Hop\'s Snorlax'
    | 'Jet Energy'
    | 'Iono\'s Kilowattrel'
    | 'Cramorant'
    | 'Iono\'s Wattrel'
    | 'Weedle'
    | 'Growing Grass Energy'
    | 'Axew'
    | 'Haxorus'
    | 'Lilligant'
    | 'Kakuna'
    | 'Thick Scale'
    | 'Nighttime Mine'
    | 'Sacred Ash'
    | 'Fraxure'
    | 'Mist Energy'
    | 'Patrat'
    | 'Amaura'
    | 'Budew'
    | 'Shadowy Darkness Energy'
    | 'Tauros'
    | 'Risky Ruins'
    | 'Paldean Tauros'
    | 'Crushing Hammer'
    | 'Brave Bangle'
    | 'Team Rocket\'s Transceiver'
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
    | 'Grass Kagura'
    | 'Delightful Kiss'
    | 'Myriad Leaf Shower'
    | 'Garland Ray'
    | 'Run Errand'
    | 'Shooting Moons'
    | 'Energized Storm'
    | 'Flaring Magic'
    | 'Turbo Flare'
    | 'Gaia Wave'
    | 'Nullifying Zero'
    | 'Night Joker'
    | 'Subjugating Chains'
    | 'Dusk Raid'
    | 'Shred'
    | 'Intimidating Stare'
    | 'Speed Dive'
    | 'Scorching Fire'
    | 'Fickle Spitting'
    | 'Evolution'
    | 'Shoot Through'
    | 'Flashing Draw'
    | 'Frightening Howl'
    | 'Flamebody Cannon'
    | 'Itchy Pollen'
    | 'Trade'
    | 'Rampaging Thunder'
    | 'Virtuous Flame'
    | 'Raging Charge'
    | 'Cosmic Beam'
    | 'Light Punch'
    | 'Cruel Arrow'
    | 'Flash Ray'
    | 'Riotous Blasting'
    ;

// ============================================================
// HABILIADES
// ============================================================

ABILITY
    : 'Diamond Coat'
    | 'Extra Helpings'
    ;

// ============================================================
// CONDICIONES ESPECIALES
// ============================================================

SPECIAL_CONDITION
    : 'Asleep'
    | 'Burned'
    | 'Confused'
    | 'Paralyzed'
    | 'Poisoned'
    ;

// ============================================================
// TIPO DE POKEMON
// ============================================================

POKEMON_TYPE
    : 'Grass'
    | 'Fire'
    | 'Water'
    | 'Lighting'
    | 'Fighting'
    | 'Psychic'
    | 'Colorless'
    | 'Darkness'
    | 'Metal'
    | 'Dragon'
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

NO_ACTION
    : 'didn' ('\'' | '’') 't take an action in time'
    ;

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

