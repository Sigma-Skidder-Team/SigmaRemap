package remapped;

import java.io.IOException;

public class class_451 extends class_2840<int[]> {
   private static final class_4639 field_1878 = new class_4639("textures/colormap/foliage.png");

   public int[] method_2175(class_7832 var1, class_3492 var2) {
      try {
         return class_115.method_343(var1, field_1878);
      } catch (IOException var6) {
         throw new IllegalStateException("Failed to load foliage color texture", var6);
      }
   }

   public void method_2174(int[] var1, class_7832 var2, class_3492 var3) {
      class_8400.method_38686(var1);
   }
}
