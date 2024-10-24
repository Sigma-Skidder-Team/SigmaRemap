package mapped;

import net.minecraft.client.audio.Sound;

// $VF: synthetic class
public class Class7682 {
   private static String[] field32909;
   public static final int[] field32910 = new int[Sound.Type.values().length];

   static {
      try {
         field32910[Sound.Type.field14506.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field32910[Sound.Type.field14507.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }
   }
}
