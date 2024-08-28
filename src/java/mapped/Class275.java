package mapped;

import java.io.IOException;

public class Class275 extends Class269<int[]> {
   private static final ResourceLocation field1057 = new ResourceLocation("textures/colormap/foliage.png");

   public int[] method970(Class191 var1, Class7165 var2) {
      try {
         return Class4230.method13022(var1, field1057);
      } catch (IOException var6) {
         throw new IllegalStateException("Failed to load foliage color texture", var6);
      }
   }

   public void method971(int[] var1, Class191 var2, Class7165 var3) {
      Class9441.method36291(var1);
   }
}
