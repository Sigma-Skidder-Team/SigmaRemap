package remapped;

import java.io.IOException;

public class class_3205 extends class_2840<int[]> {
   private static final Identifier field_16002 = new Identifier("textures/colormap/grass.png");

   public int[] method_14741(class_7832 var1, class_3492 var2) {
      try {
         return class_115.method_343(var1, field_16002);
      } catch (IOException var6) {
         throw new IllegalStateException("Failed to load grass color texture", var6);
      }
   }

   public void method_14740(int[] var1, class_7832 var2, class_3492 var3) {
      class_640.method_2940(var1);
   }
}
