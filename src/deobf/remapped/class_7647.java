package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_7647 extends class_4285<class_1941> {
   private static final Direction[] field_38866 = Direction.values();

   public class_7647(Codec<class_1941> var1) {
      super(var1);
   }

   public boolean method_34642(class_700 var1, class_6541 var2, Random var3, BlockPos var4, class_1941 var5) {
      class_2921 var8 = var4.method_6089();

      for (int var9 = 64; var9 < 256; var9++) {
         var8.method_13364(var4);
         var8.method_13367(var3.nextInt(4) - var3.nextInt(4), 0, var3.nextInt(4) - var3.nextInt(4));
         var8.method_12184(var9);
         if (var1.method_22548(var8)) {
            for (Direction var13 : field_38866) {
               if (var13 != Direction.field_802 && class_4196.method_19528(var1, var8, var13)) {
                  var1.method_7513(var8, class_4783.field_23323.method_29260().method_10308(class_4196.method_19521(var13), Boolean.valueOf(true)), 2);
                  break;
               }
            }
         }
      }

      return true;
   }
}
