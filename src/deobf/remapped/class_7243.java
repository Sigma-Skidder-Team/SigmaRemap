package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_7243 extends class_4285<class_1941> {
   public class_7243(Codec<class_1941> var1) {
      super(var1);
   }

   public boolean method_33140(class_700 var1, class_6541 var2, Random var3, class_1331 var4, class_1941 var5) {
      if (var4.method_12165() > var1.method_22552() - 1) {
         return false;
      } else if (!var1.method_28262(var4).method_8350(class_4783.field_23900) && !var1.method_28262(var4.method_6100()).method_8350(class_4783.field_23900)) {
         return false;
      } else {
         boolean var8 = false;

         for (Direction var12 : Direction.values()) {
            if (var12 != Direction.field_802 && var1.method_28262(var4.method_6098(var12)).method_8350(class_4783.field_23829)) {
               var8 = true;
               break;
            }
         }

         if (!var8) {
            return false;
         } else {
            var1.method_7513(var4, class_4783.field_23437.method_29260(), 2);

            for (int var19 = 0; var19 < 200; var19++) {
               int var20 = var3.nextInt(5) - var3.nextInt(6);
               int var21 = 3;
               if (var20 < 2) {
                  var21 += var20 / 2;
               }

               if (var21 >= 1) {
                  class_1331 var22 = var4.method_6104(var3.nextInt(var21) - var3.nextInt(var21), var20, var3.nextInt(var21) - var3.nextInt(var21));
                  class_2522 var13 = var1.method_28262(var22);
                  if (var13.method_8362() == class_5371.field_27403
                     || var13.method_8350(class_4783.field_23900)
                     || var13.method_8350(class_4783.field_23829)
                     || var13.method_8350(class_4783.field_23496)) {
                     for (Direction var17 : Direction.values()) {
                        class_2522 var18 = var1.method_28262(var22.method_6098(var17));
                        if (var18.method_8350(class_4783.field_23437)) {
                           var1.method_7513(var22, class_4783.field_23437.method_29260(), 2);
                           break;
                        }
                     }
                  }
               }
            }

            return true;
         }
      }
   }
}
