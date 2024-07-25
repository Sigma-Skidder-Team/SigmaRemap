package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_6511 extends class_4285<class_4080> {
   private static final class_2522 field_33111 = class_4783.field_23886
      .method_29260()
      .method_10308(class_747.field_4063, Integer.valueOf(1))
      .method_10308(class_747.field_4059, class_6546.field_33278)
      .method_10308(class_747.field_4058, Integer.valueOf(0));
   private static final class_2522 field_33108 = field_33111.method_10308(class_747.field_4059, class_6546.field_33280)
      .method_10308(class_747.field_4058, Integer.valueOf(1));
   private static final class_2522 field_33109 = field_33111.method_10308(class_747.field_4059, class_6546.field_33280);
   private static final class_2522 field_33110 = field_33111.method_10308(class_747.field_4059, class_6546.field_33277);

   public class_6511(Codec<class_4080> var1) {
      super(var1);
   }

   public boolean method_29665(class_700 var1, class_6541 var2, Random var3, BlockPos var4, class_4080 var5) {
      int var8 = 0;
      class_2921 var9 = var4.method_6089();
      class_2921 var10 = var4.method_6089();
      if (var1.method_22548(var9)) {
         if (class_4783.field_23886.method_29260().method_8309(var1, var9)) {
            int var11 = var3.nextInt(12) + 5;
            if (var3.nextFloat() < var5.field_19859) {
               int var12 = var3.nextInt(4) + 1;

               for (int var13 = var4.getX() - var12; var13 <= var4.getX() + var12; var13++) {
                  for (int var14 = var4.getZ() - var12; var14 <= var4.getZ() + var12; var14++) {
                     int var15 = var13 - var4.getX();
                     int var16 = var14 - var4.getZ();
                     if (var15 * var15 + var16 * var16 <= var12 * var12) {
                        var10.method_13362(var13, var1.method_22562(class_3801.field_18592, var13, var14) - 1, var14);
                        if (method_19910(var1.method_28262(var10).method_8360())) {
                           var1.method_7513(var10, class_4783.field_23201.method_29260(), 2);
                        }
                     }
                  }
               }
            }

            for (int var17 = 0; var17 < var11 && var1.method_22548(var9); var17++) {
               var1.method_7513(var9, field_33111, 2);
               var9.method_13369(Direction.field_817, 1);
            }

            if (var9.getY() - var4.getY() >= 3) {
               var1.method_7513(var9, field_33108, 2);
               var1.method_7513(var9.method_13369(Direction.field_802, 1), field_33109, 2);
               var1.method_7513(var9.method_13369(Direction.field_802, 1), field_33110, 2);
            }
         }

         var8++;
      }

      return var8 > 0;
   }
}
