package mapped;

import net.minecraft.block.BlockState;

public class Class7542 {
   private static String[] field32355;

   public static boolean method24657(BlockState var0, Class9727[] var1) {
      if (var1 == null) {
         return true;
      } else {
         for (int var4 = 0; var4 < var1.length; var4++) {
            Class9727 var5 = var1[var4];
            if (var5.method38105(var0)) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean method24658(int var0, int var1, Class9727[] var2) {
      if (var2 == null) {
         return true;
      } else {
         for (int var5 = 0; var5 < var2.length; var5++) {
            Class9727 var6 = var2[var5];
            if (var6.method38106(var0, var1)) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean method24659(int var0, Class9727[] var1) {
      if (var1 == null) {
         return true;
      } else {
         for (int var4 = 0; var4 < var1.length; var4++) {
            Class9727 var5 = var1[var4];
            if (var5.method38103() == var0) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean method24660(int var0, int[] var1) {
      if (var1 == null) {
         return true;
      } else {
         for (int var4 = 0; var4 < var1.length; var4++) {
            if (var1[var4] == var0) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean method24661(TextureAtlasSprite var0, TextureAtlasSprite[] var1) {
      if (var1 == null) {
         return true;
      } else {
         for (int var4 = 0; var4 < var1.length; var4++) {
            if (var1[var4] == var0) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean method24662(Biome var0, Class8507[] var1) {
      if (var1 != null) {
         for (int var4 = 0; var4 < var1.length; var4++) {
            Class8507 var5 = var1[var4];
            if (var5 != null && var5.method30136() == var0) {
               return true;
            }
         }

         return false;
      } else {
         return true;
      }
   }
}
