package com.mentalfrostbyte.jello.command.impl;

import com.mentalfrostbyte.jello.command.ChatCommandExecutor;
import com.mentalfrostbyte.jello.command.Command;
import com.mentalfrostbyte.jello.command.CommandException;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import mapped.ChatCommandArguments;


public class Insult extends Command {
   public static final String[] field25704 = new String[]{
      "tossing",
      "bloody",
      "shitting",
      "wanking",
      "stinky",
      "raging",
      "dementing",
      "dumb",
      "dipping",
      "fucking",
      "dipping",
      "holy",
      "maiming",
      "cocking",
      "ranting",
      "twunting",
      "hairy",
      "spunking",
      "flipping",
      "slapping",
      "sodding",
      "blooming",
      "frigging",
      "sponglicking",
      "guzzling",
      "glistering",
      "cock wielding",
      "failed",
      "artist formally known as",
      "unborn",
      "pulsating",
      "naked",
      "throbbing",
      "lonely",
      "failed",
      "stale",
      "spastic",
      "senile",
      "strangely shaped",
      "virgin",
      "bottled",
      "twin-headed",
      "fat",
      "gigantic",
      "sticky",
      "prodigal",
      "bald",
      "bearded",
      "horse-loving",
      "spotty",
      "spitting",
      "dandy",
      "fritzl-admiring",
      "friend of a",
      "indeterminable",
      "overrated",
      "fingerlicking",
      "diaper-wearing",
      "leg-humping",
      "gold-digging",
      "mong loving",
      "trout-faced",
      "cunt rotting",
      "flip-flopping",
      "rotting",
      "inbred",
      "badly drawn",
      "undead",
      "annoying",
      "whoring",
      "leaking",
      "dripping",
      "racist",
      "slutty",
      "cross-eyed",
      "irrelevant",
      "mental",
      "rotating",
      "scurvy looking",
      "rambling",
      "gag sacking",
      "cunting",
      "wrinkled old",
      "dried out",
      "sodding",
      "funky",
      "silly",
      "unhuman",
      "bloated",
      "wanktastic",
      "bum-banging",
      "cockmunching",
      "animal-fondling",
      "stillborn",
      "scruffy-looking",
      "hard-rubbing",
      "rectal",
      "glorious",
      "eye-less",
      "constipated",
      "bastardized",
      "utter",
      "hitler's personal",
      "irredeemable",
      "complete",
      "enormous",
      "go suck a",
      "fuckfaced",
      "broadfaced",
      "titless",
      "son of a",
      "demonizing",
      "pigfaced",
      "treacherous",
      "retarded"
   };
   public static final String[] field25705 = new String[]{
      "cock",
      "tit",
      "cunt",
      "wank",
      "piss",
      "crap",
      "shit",
      "arse",
      "sperm",
      "nipple",
      "anus",
      "colon",
      "shaft",
      "dick",
      "poop",
      "semen",
      "slut",
      "suck",
      "earwax",
      "fart",
      "scrotum",
      "cock-tip",
      "tea-bag",
      "jizz",
      "cockstorm",
      "bunghole",
      "food trough",
      "bum",
      "butt",
      "shitface",
      "ass",
      "nut",
      "ginger",
      "llama",
      "tramp",
      "fudge",
      "vomit",
      "cum",
      "lard",
      "puke",
      "sphincter",
      "nerf",
      "turd",
      "cocksplurt",
      "cockthistle",
      "dickwhistle",
      "gloryhole",
      "gaylord",
      "spazz",
      "nutsack",
      "fuck",
      "spunk",
      "shitshark",
      "shitehawk",
      "fuckwit",
      "dipstick",
      "asswad",
      "chesticle",
      "clusterfuck",
      "douchewaffle",
      "retard"
   };
   public static final String[] field25706 = new String[]{
      "force",
      "bottom",
      "hole",
      "goatse",
      "testicle",
      "balls",
      "bucket",
      "biscuit",
      "stain",
      "boy",
      "flaps",
      "erection",
      "mange",
      "twat",
      "twunt",
      "mong",
      "spack",
      "diarrhea",
      "sod",
      "excrement",
      "faggot",
      "pirate",
      "asswipe",
      "sock",
      "sack",
      "barrel",
      "head",
      "zombie",
      "alien",
      "minge",
      "candle",
      "torch",
      "pipe",
      "bint",
      "jockey",
      "udder",
      "pig",
      "dog",
      "cockroach",
      "worm",
      "MILF",
      "sample",
      "infidel",
      "spunk-bubble",
      "stack",
      "handle",
      "badger",
      "wagon",
      "bandit",
      "lord",
      "bogle",
      "bollock",
      "tranny",
      "knob",
      "nugget",
      "king",
      "hole",
      "kid",
      "trailer",
      "lorry",
      "whale",
      "rag",
      "foot",
      "deez nutz"
   };
   public static final String[] field25707 = new String[]{
      "licker",
      "raper",
      "lover",
      "shiner",
      "blender",
      "fucker",
      "assjacker",
      "butler",
      "packer",
      "rider",
      "wanker",
      "sucker",
      "felcher",
      "wiper",
      "experiment",
      "wiper",
      "bender",
      "dictator",
      "basher",
      "piper",
      "slapper",
      "fondler",
      "plonker",
      "bastard",
      "handler",
      "herder",
      "fan",
      "amputee",
      "extractor",
      "professor",
      "graduate",
      "voyeur",
      "deez nutz"
   };
   public static final String[] field25708 = new String[]{
      "fuck",
      "screw",
      "hump",
      "molest",
      "rape",
      "kill",
      "shit on",
      "step on",
      "sit on",
      "eat",
      "slip on",
      "suck",
      "flick",
      "arouse",
      "bombard",
      "penetrate",
      "high five",
      "lick",
      "snort",
      "fist",
      "wipe",
      "fall off of",
      "nail",
      "pound",
      "rock",
      "smack",
      "shit",
      "crap",
      "digest",
      "consume",
      "devour",
      "hit",
      "thrust",
      "moan",
      "pierce",
      "gnaw",
      "nibble on",
      "arouse",
      "grasp"
   };
   public static final String[] field25709 = new String[]{
      "Go kill yourself", "Jump off of a bridge", "Go back to school", "Get hit by a bus", "Go fuck yourself"
   };

   public Insult() {
      super("insult", "Sends a randomly generated insult");
   }

   @Override
   public void run(String var1, ChatCommandArguments[] var2, ChatCommandExecutor var3) throws CommandException {
      if (var2.length <= 0) {
         MultiUtilities.sendChatMessage(method18332());
      } else {
         throw new CommandException("Too many arguments");
      }
   }

   public static String method18332() {
      return method18333() + (!(Math.random() > 0.5) ? ", " : ", you ") + method18334() + ".";
   }

   public static String method18333() {
      String var2 = "";
      if (!(Math.random() < 0.9F)) {
         var2 = field25709[method18335(field25709.length)];
      } else {
         String var3 = field25708[method18335(field25708.length)];
         var3 = var3.substring(0, 1).toUpperCase() + var3.substring(1, var3.length());
         String var4 = method18334();
         String var5 = "a";
         if (var4.startsWith("a") || var4.startsWith("e") || var4.startsWith("i") || var4.startsWith("o") || var4.startsWith("u")) {
            var5 = "an";
         }

         var2 = var3 + " " + var5 + " " + var4;
      }

      return var2;
   }

   public static String method18334() {
      switch (method18335(4)) {
         case 0:
            return field25704[method18335(field25704.length)]
               + " "
               + field25705[method18335(field25705.length)]
               + " "
               + field25706[method18335(field25706.length)];
         case 1:
            return field25704[method18335(field25704.length)]
               + " "
               + field25705[method18335(field25705.length)]
               + " "
               + field25707[method18335(field25707.length)];
         case 2:
            return field25705[method18335(field25705.length)] + " " + field25706[method18335(field25706.length)];
         default:
            return field25705[method18335(field25705.length)] + " " + field25707[method18335(field25707.length)];
      }
   }

   private static int method18335(int var0) {
      return (int)Math.round(Math.random() * (double)var0);
   }
}
