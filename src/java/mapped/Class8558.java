package mapped;

import java.util.Arrays;

public class Class8558 extends Class8557 {
   private static String[] field38465;

   public Class8558(Class8557 var1, TextureAtlasSprite var2) {
      super(method30533(var1.method30511(), var1.method30516(), var2), var1.method30513(), Class9155.method34184(var1.method30511()), var2, var1.method30515());
   }

   private static int[] method30533(int[] var0, TextureAtlasSprite var1, TextureAtlasSprite var2) {
      int[] var5 = Arrays.copyOf(var0, var0.length);

      for (int var6 = 0; var6 < 4; var6++) {
         Class7831 var7 = DefaultVertexFormats.field43334;
         int var8 = var7.method26215() * var6;
         int var9 = var7.method26220(2) / 4;
         var5[var8 + var9] = Float.floatToRawIntBits(var2.method7461((double)var1.method7492(Float.intBitsToFloat(var0[var8 + var9]))));
         var5[var8 + var9 + 1] = Float.floatToRawIntBits(var2.method7464((double)var1.method7493(Float.intBitsToFloat(var0[var8 + var9 + 1]))));
      }

      return var5;
   }
}
