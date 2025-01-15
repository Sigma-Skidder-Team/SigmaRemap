// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.commands.CommandException;

public class Class6704 extends Class6693
{
    public static final String[] field26430;
    public static final String[] field26431;
    public static final String[] field26432;
    public static final String[] field26433;
    public static final String[] field26434;
    public static final String[] field26435;
    
    public Class6704() {
        super("insult", "Sends a randomly generated insult", new String[0]);
    }
    
    @Override
    public void run(final String s, final Class8025[] array, final Class6428 class6428) throws CommandException {
        if (array.length <= 0) {
            Class6430.method19107(method20358());
            return;
        }
        throw new Class2332("Too many arguments");
    }
    
    public static String method20358() {
        return method20359() + ((Math.random() <= 0.5) ? ", " : ", you ") + method20360() + ".";
    }
    
    public static String method20359() {
        String string;
        if (Math.random() >= 0.8999999761581421) {
            string = Class6704.field26435[method20361(Class6704.field26435.length)];
        }
        else {
            final String s = Class6704.field26434[method20361(Class6704.field26434.length)];
            final String string2 = s.substring(0, 1).toUpperCase() + s.substring(1, s.length());
            final String method20360 = method20360();
            String str = "a";
            Label_0155: {
                if (!method20360.startsWith("a")) {
                    if (!method20360.startsWith("e")) {
                        if (!method20360.startsWith("i")) {
                            if (!method20360.startsWith("o")) {
                                if (!method20360.startsWith("u")) {
                                    break Label_0155;
                                }
                            }
                        }
                    }
                }
                str = "an";
            }
            string = string2 + " " + str + " " + method20360;
        }
        return string;
    }
    
    public static String method20360() {
        switch (method20361(4)) {
            case 0: {
                return Class6704.field26430[method20361(Class6704.field26430.length)] + " " + Class6704.field26431[method20361(Class6704.field26431.length)] + " " + Class6704.field26432[method20361(Class6704.field26432.length)];
            }
            case 1: {
                return Class6704.field26430[method20361(Class6704.field26430.length)] + " " + Class6704.field26431[method20361(Class6704.field26431.length)] + " " + Class6704.field26433[method20361(Class6704.field26433.length)];
            }
            case 2: {
                return Class6704.field26431[method20361(Class6704.field26431.length)] + " " + Class6704.field26432[method20361(Class6704.field26432.length)];
            }
            default: {
                return Class6704.field26431[method20361(Class6704.field26431.length)] + " " + Class6704.field26433[method20361(Class6704.field26433.length)];
            }
        }
    }
    
    private static int method20361(final int n) {
        return (int)Math.round(Math.random() * n);
    }
    
    static {
        field26430 = new String[] { "tossing", "bloody", "shitting", "wanking", "stinky", "raging", "dementing", "dumb", "dipping", "fucking", "dipping", "holy", "maiming", "cocking", "ranting", "twunting", "hairy", "spunking", "flipping", "slapping", "sodding", "blooming", "frigging", "sponglicking", "guzzling", "glistering", "cock wielding", "failed", "artist formally known as", "unborn", "pulsating", "naked", "throbbing", "lonely", "failed", "stale", "spastic", "senile", "strangely shaped", "virgin", "bottled", "twin-headed", "fat", "gigantic", "sticky", "prodigal", "bald", "bearded", "horse-loving", "spotty", "spitting", "dandy", "fritzl-admiring", "friend of a", "indeterminable", "overrated", "fingerlicking", "diaper-wearing", "leg-humping", "gold-digging", "mong loving", "trout-faced", "cunt rotting", "flip-flopping", "rotting", "inbred", "badly drawn", "undead", "annoying", "whoring", "leaking", "dripping", "racist", "slutty", "cross-eyed", "irrelevant", "mental", "rotating", "scurvy looking", "rambling", "gag sacking", "cunting", "wrinkled old", "dried out", "sodding", "funky", "silly", "unhuman", "bloated", "wanktastic", "bum-banging", "cockmunching", "animal-fondling", "stillborn", "scruffy-looking", "hard-rubbing", "rectal", "glorious", "eye-less", "constipated", "bastardized", "utter", "hitler's personal", "irredeemable", "complete", "enormous", "go suck a", "fuckfaced", "broadfaced", "titless", "son of a", "demonizing", "pigfaced", "treacherous", "retarded" };
        field26431 = new String[] { "cock", "tit", "cunt", "wank", "piss", "crap", "shit", "arse", "sperm", "nipple", "anus", "colon", "shaft", "dick", "poop", "semen", "slut", "suck", "earwax", "fart", "scrotum", "cock-tip", "tea-bag", "jizz", "cockstorm", "bunghole", "food trough", "bum", "butt", "shitface", "ass", "nut", "ginger", "llama", "tramp", "fudge", "vomit", "cum", "lard", "puke", "sphincter", "nerf", "turd", "cocksplurt", "cockthistle", "dickwhistle", "gloryhole", "gaylord", "spazz", "nutsack", "fuck", "spunk", "shitshark", "shitehawk", "fuckwit", "dipstick", "asswad", "chesticle", "clusterfuck", "douchewaffle", "retard" };
        field26432 = new String[] { "force", "bottom", "hole", "goatse", "testicle", "balls", "bucket", "biscuit", "stain", "boy", "flaps", "erection", "mange", "twat", "twunt", "mong", "spack", "diarrhea", "sod", "excrement", "faggot", "pirate", "asswipe", "sock", "sack", "barrel", "head", "zombie", "alien", "minge", "candle", "torch", "pipe", "bint", "jockey", "udder", "pig", "dog", "cockroach", "worm", "MILF", "sample", "infidel", "spunk-bubble", "stack", "handle", "badger", "wagon", "bandit", "lord", "bogle", "bollock", "tranny", "knob", "nugget", "king", "hole", "kid", "trailer", "lorry", "whale", "rag", "foot", "deez nutz" };
        field26433 = new String[] { "licker", "raper", "lover", "shiner", "blender", "fucker", "assjacker", "butler", "packer", "rider", "wanker", "sucker", "felcher", "wiper", "experiment", "wiper", "bender", "dictator", "basher", "piper", "slapper", "fondler", "plonker", "bastard", "handler", "herder", "fan", "amputee", "extractor", "professor", "graduate", "voyeur", "deez nutz" };
        field26434 = new String[] { "fuck", "screw", "hump", "molest", "rape", "kill", "shit on", "step on", "sit on", "eat", "slip on", "suck", "flick", "arouse", "bombard", "penetrate", "high five", "lick", "snort", "fist", "wipe", "fall off of", "nail", "pound", "rock", "smack", "shit", "crap", "digest", "consume", "devour", "hit", "thrust", "moan", "pierce", "gnaw", "nibble on", "arouse", "grasp" };
        field26435 = new String[] { "Go kill yourself", "Jump off of a bridge", "Go back to school", "Get hit by a bus", "Go fuck yourself" };
    }
}
