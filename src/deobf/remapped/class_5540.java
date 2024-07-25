package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_5540 extends class_4285<class_9253> {
   public class_5540(Codec<class_9253> var1) {
      super(var1);
   }

   public boolean method_25155(class_700 var1, class_6541 var2, Random var3, BlockPos var4, class_9253 var5) {
      int var8 = var3.nextInt(var5.field_47236 + 1);
      class_2921 var9 = new class_2921();

      for (int var10 = 0; var10 < var8; var10++) {
         this.method_25157(var9, var3, var4, Math.min(var10, 7));
         if (var5.field_47233.method_12207(var1.method_28262(var9), var3) && !this.method_25154(var1, var9)) {
            var1.method_7513(var9, var5.field_47237, 2);
         }
      }

      return true;
   }

   private void method_25157(class_2921 var1, Random var2, BlockPos var3, int var4) {
      int var7 = this.method_25156(var2, var4);
      int var8 = this.method_25156(var2, var4);
      int var9 = this.method_25156(var2, var4);
      var1.method_13360(var3, var7, var8, var9);
   }

   private int method_25156(Random var1, int var2) {
      return Math.round((var1.nextFloat() - var1.nextFloat()) * (float)var2);
   }

   private boolean method_25154(class_9379 var1, BlockPos var2) {
      class_2921 var5 = new class_2921();

      for (Direction var9 : Direction.values()) {
         var5.method_13371(var2, var9);
         if (var1.method_28262(var5).method_8345()) {
            return true;
         }
      }

      return false;
   }
}
