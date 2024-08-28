package mapped;

import java.io.IOException;

public class Class273 extends Class269<int[]> {
   private static final ResourceLocation field1050 = new ResourceLocation("textures/colormap/grass.png");

   public int[] method970(Class191 var1, Class7165 var2) {
      try {
         return Class4230.method13022(var1, field1050);
      } catch (IOException var6) {
         throw new IllegalStateException("Failed to load grass color texture", var6);
      }
   }

   public void method971(int[] var1, Class191 var2, Class7165 var3) {
      Class6406.method19508(var1);
   }
}
