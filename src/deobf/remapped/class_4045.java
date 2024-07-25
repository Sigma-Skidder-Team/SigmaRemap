package remapped;

import java.util.Random;
import java.util.UUID;

public class class_4045 {
   private static final String[] field_19628 = new String[]{
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
   private static final String[] field_19629 = new String[]{
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

   public static String method_18611(UUID var0) {
      Random var3 = method_18613(var0);
      return method_18614(var3, field_19628) + method_18614(var3, field_19629);
   }

   private static String method_18614(Random var0, String[] var1) {
      return class_9665.<String>method_44697(var1, var0);
   }

   private static Random method_18613(UUID var0) {
      return new Random((long)(var0.hashCode() >> 2));
   }
}
