lexer grammar gTCGLexer;

// ============================================================
// gTCG - POKÉMON TCG LIVE LOG LEXER
// ============================================================

// ============================================================
// PALABRAS RESERVADAS / ESTRUCTURA DEL LOG
// ============================================================

FOR
    : 'for'
    ;

THE
    : 'the'
    ;

TO
    : 'to'
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

INTO
    : 'into'
    ;

THEIR
    : 'their'
    ;

FROM
    : 'from'
    ;

AND
    : 'and'
    ;

THEM
    : 'them'
    ;

A_SOMETHING
    : 'a' | 'A'
    ;

AT
    : 'at'
    ;

YOU
    : 'You' | 'you'
    ;

ALL
    : 'all' | 'All'
    ;

LEAST
    : 'least'
    ;

CHOSE
    : 'chose'
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

FLIPPED
    : 'flipped'
    ;

DECIDED
    : 'decided'
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

ACTIVATED
    : 'activated'
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

SELECTED
    : 'selected'
    ;

MOVED
    : 'moved'
    ;

LANDED
    : 'landed'
    ;

TAKE
    : 'took'
    ;

BECOME
    : 'become'
    ;

CONCEDED
    : 'conceded'
    ;

ADDED
    : 'added'
    ;

REVEALED 
    : 'revealed'
    ;

WON
    : 'won'
    ;

WINS
    : 'wins'
    ;

TAKEN
    : 'taken'
    ;

GO
    : 'go'
    ;

OPENING
    : 'opening'
    ;

DREW
    : 'drew'
    ;

DRAWN
    : 'drawn'
    ;

PUT
    : 'put'
    ;
COUNTERS 
    : 'counters'
    ;

NOW
    : 'now'
    ;

MORE_WORD
    : 'more'
    ;

BECAUSE
    : 'because'
    ;

KNOCKED
    : 'Knocked'
    ;

OUT
    : 'Out'
    ;

FIRST
    : 'first'
    ;

SETUP
    : 'Setup'
    ;

COIN
    : 'coin'
    ;

TOSS
    : 'toss'
    ;

FLIP
    : 'flip'
    ;

HEADS
    : 'heads'
    ;

TAILS
    : 'tails'
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

WEAKNESS
    : 'Weakness'
    ;

ENERGY
    : 'Energy'
    ;

POKEMON_TOOL
    : 'Pokémon Tool'
    ;

OPPONENT
    : 'Opponent'
    ;

TURN
    : 'Turn' | 'turn' 
    ;

POKEMON
    : 'Pokémon' 
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

ACTIVE
    : 'Active'
    ;

PRIZE
    : 'Prize'
    ;

PRIZE_CARDS
    : 'Prize cards'
    ;

HAND
    : 'hand'
    ;

DAMAGE
    : 'damage'
    ;

DECK
    : 'deck'
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

MULLIGAN: 'Mulligan' | 'Mulligans' | 'mulligan' | 'mulligans';

NO_ACTION
    : 'didn' ('\'' | '’') 't take an action in time'
    ;

NO_BENCHED
    : 'with no Benched Pokémon'
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
    | 'Legacy Energy'
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

