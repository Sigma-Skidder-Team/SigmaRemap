package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_3852 extends class_4285<class_1941> {
   public class_3852(Codec<class_1941> var1) {
      super(var1);
   }

   public boolean method_17878(class_700 var1, class_6541 var2, Random var3, class_1331 var4, class_1941 var5) {
      if (var1.method_22548(var4) && !var1.method_22548(var4.method_6081())) {
         class_2921 var8 = var4.method_6089();
         class_2921 var9 = var4.method_6089();
         boolean var10 = true;
         boolean var11 = true;
         boolean var12 = true;
         boolean var13 = true;

         while (var1.method_22548(var8)) {
            if (class_6486.method_29556(var8)) {
               return true;
            }

            var1.method_7513(var8, class_4783.field_23788.method_29260(), 2);
            var10 = var10 && this.method_17879(var1, var3, var9.method_13371(var8, class_240.field_818));
            var11 = var11 && this.method_17879(var1, var3, var9.method_13371(var8, class_240.field_800));
            var12 = var12 && this.method_17879(var1, var3, var9.method_13371(var8, class_240.field_809));
            var13 = var13 && this.method_17879(var1, var3, var9.method_13371(var8, class_240.field_804));
            var8.method_13368(class_240.field_802);
         }

         var8.method_13368(class_240.field_817);
         this.method_17877(var1, var3, var9.method_13371(var8, class_240.field_818));
         this.method_17877(var1, var3, var9.method_13371(var8, class_240.field_800));
         this.method_17877(var1, var3, var9.method_13371(var8, class_240.field_809));
         this.method_17877(var1, var3, var9.method_13371(var8, class_240.field_804));
         var8.method_13368(class_240.field_802);
         class_2921 var14 = new class_2921();

         for (int var15 = -3; var15 < 4; var15++) {
            for (int var16 = -3; var16 < 4; var16++) {
               int var17 = class_9299.method_42805(var15) * class_9299.method_42805(var16);
               if (var3.nextInt(10) < 10 - var17) {
                  var14.method_13364(var8.method_6104(var15, 0, var16));
                  int var18 = 3;

                  while (var1.method_22548(var9.method_13371(var14, class_240.field_802))) {
                     var14.method_13368(class_240.field_802);
                     if (--var18 <= 0) {
                        break;
                     }
                  }

                  if (!var1.method_22548(var9.method_13371(var14, class_240.field_802))) {
                     var1.method_7513(var14, class_4783.field_23788.method_29260(), 2);
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void method_17877(class_9379 var1, Random var2, class_1331 var3) {
      if (var2.nextBoolean()) {
         var1.method_7513(var3, class_4783.field_23788.method_29260(), 2);
      }
   }

   private boolean method_17879(class_9379 var1, Random var2, class_1331 var3) {
      if (var2.nextInt(10) == 0) {
         return false;
      } else {
         var1.method_7513(var3, class_4783.field_23788.method_29260(), 2);
         return true;
      }
   }
}
