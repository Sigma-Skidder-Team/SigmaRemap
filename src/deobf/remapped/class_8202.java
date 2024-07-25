package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_8202 extends class_4285<class_3043> {
   public class_8202(Codec<class_3043> var1) {
      super(var1);
   }

   public boolean method_37565(class_700 var1, class_6541 var2, Random var3, BlockPos var4, class_3043 var5) {
      for (BlockPos var9 : BlockPos.method_6076(var4.method_6104(-1, -2, -1), var4.method_6104(1, 2, 1))) {
         boolean var10 = var9.getX() == var4.getX();
         boolean var11 = var9.method_12165() == var4.method_12165();
         boolean var12 = var9.method_12185() == var4.method_12185();
         boolean var13 = Math.abs(var9.method_12165() - var4.method_12165()) == 2;
         if (var10 && var11 && var12) {
            BlockPos var14 = var9.method_6072();
            this.method_19906(var1, var14, class_4783.field_23824.method_29260());
            var5.method_13892().ifPresent(var3x -> {
               class_3757 var6 = var1.method_28260(var14);
               if (var6 instanceof class_5555) {
                  class_5555 var7 = (class_5555)var6;
                  var7.method_25253(var3x, var5.method_13895());
                  var6.method_17407();
               }
            });
         } else if (!var11) {
            if (var13 && var10 && var12) {
               this.method_19906(var1, var9, class_4783.field_23433.method_29260());
            } else if ((var10 || var12) && !var13) {
               this.method_19906(var1, var9, class_4783.field_23433.method_29260());
            } else {
               this.method_19906(var1, var9, class_4783.field_23184.method_29260());
            }
         } else {
            this.method_19906(var1, var9, class_4783.field_23184.method_29260());
         }
      }

      return true;
   }
}
