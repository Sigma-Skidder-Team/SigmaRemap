package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_1326 extends class_4285<class_4080> {
   public class_1326(Codec<class_4080> var1) {
      super(var1);
   }

   public boolean method_6055(class_700 var1, class_6541 var2, Random var3, BlockPos var4, class_4080 var5) {
      boolean var8 = false;
      int var9 = var3.nextInt(8) - var3.nextInt(8);
      int var10 = var3.nextInt(8) - var3.nextInt(8);
      int var11 = var1.method_22562(class_3801.field_18599, var4.method_12173() + var9, var4.method_12185() + var10);
      BlockPos var12 = new BlockPos(var4.method_12173() + var9, var11, var4.method_12185() + var10);
      if (var1.method_28262(var12).method_8350(class_4783.field_23900)) {
         boolean var13 = var3.nextDouble() < (double)var5.field_19859;
         class_2522 var14 = !var13 ? class_4783.field_23563.method_29260() : class_4783.field_23535.method_29260();
         if (var14.method_8309(var1, var12)) {
            if (!var13) {
               var1.method_7513(var12, var14, 2);
            } else {
               class_2522 var15 = var14.method_10308(class_8993.field_46044, class_7422.field_37874);
               BlockPos var16 = var12.method_6081();
               if (var1.method_28262(var16).method_8350(class_4783.field_23900)) {
                  var1.method_7513(var12, var14, 2);
                  var1.method_7513(var16, var15, 2);
               }
            }

            var8 = true;
         }
      }

      return var8;
   }
}
