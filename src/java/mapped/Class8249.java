package mapped;

import net.minecraft.client.util.Util;

import java.util.Random;
import java.util.UUID;

public class Class8249 {
   private static final String[] field35443 = new String[]{
      "Slim",
      "Far",
      "River",
      "Silly",
      "Fat",
      "Thin",
      "Fish",
      "Bat",
      "Dark",
      "Oak",
      "Sly",
      "Bush",
      "Zen",
      "Bark",
      "Cry",
      "Slack",
      "Soup",
      "Grim",
      "Hook",
      "Dirt",
      "Mud",
      "Sad",
      "Hard",
      "Crook",
      "Sneak",
      "Stink",
      "Weird",
      "Fire",
      "Soot",
      "Soft",
      "Rough",
      "Cling",
      "Scar"
   };
   private static final String[] field35444 = new String[]{
      "Fox",
      "Tail",
      "Jaw",
      "Whisper",
      "Twig",
      "Root",
      "Finder",
      "Nose",
      "Brow",
      "Blade",
      "Fry",
      "Seek",
      "Wart",
      "Tooth",
      "Foot",
      "Leaf",
      "Stone",
      "Fall",
      "Face",
      "Tongue",
      "Voice",
      "Lip",
      "Mouth",
      "Snail",
      "Toe",
      "Ear",
      "Hair",
      "Beard",
      "Shirt",
      "Fist"
   };

   public static String method28763(UUID var0) {
      Random var3 = method28765(var0);
      return method28764(var3, field35443) + method28764(var3, field35444);
   }

   private static String method28764(Random var0, String[] var1) {
      return Util.<String>getRandomObject(var1, var0);
   }

   private static Random method28765(UUID var0) {
      return new Random((long)(var0.hashCode() >> 2));
   }
}
