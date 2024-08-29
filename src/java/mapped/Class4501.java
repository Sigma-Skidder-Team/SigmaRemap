package mapped;

import java.util.BitSet;

public class Class4501 {
   private static String[] field21725;
   private static boolean field21726;
   private static BitSet field21727 = new BitSet();
   private static BitSet field21728 = new BitSet();

   public static boolean method14213() {
      return field21726 && ! Shaders.field40609;
   }

   public static void method14214() {
      field21726 = Class7944.method26928().field44686;
   }

   public static void method14215(TextureAtlasSprite var0) {
      if (var0.method7496()) {
         int var3 = var0.method7477();
         if (var3 >= 0) {
            field21727.set(var3);
         }
      }
   }

   public static void method14216(BitSet var0) {
      if (var0 != null) {
         field21727.or(var0);
      }
   }

   public static boolean method14217(TextureAtlasSprite var0) {
      if (var0.method7496()) {
         int var3 = var0.method7477();
         return var3 >= 0 ? field21727.get(var3) : false;
      } else {
         return true;
      }
   }

   public static void method14218(AtlasTexture var0) {
      if (var0.method1121()) {
         field21727.clear();
      }
   }

   public static void method14219(int var0) {
      if (var0 >= 0) {
         field21728.set(var0);
      }
   }

   public static boolean method14220(int var0) {
      return var0 >= 0 ? field21728.get(var0) : false;
   }

   public static void method14221() {
      field21728.clear();
   }
}
