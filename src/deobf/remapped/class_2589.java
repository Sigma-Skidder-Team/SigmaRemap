package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_2589 extends class_4285<class_1941> {
   public class_2589(Codec<class_1941> var1) {
      super(var1);
   }

   public boolean method_11761(class_700 var1, class_6541 var2, Random var3, class_1331 var4, class_1941 var5) {
      int var8 = 0;
      int var9 = var1.method_22562(class_3801.field_18599, var4.method_12173(), var4.method_12185());
      class_1331 var10 = new class_1331(var4.method_12173(), var9, var4.method_12185());
      if (var1.method_28262(var10).method_8350(class_4783.field_23900)) {
         class_2522 var11 = class_4783.field_23325.method_29260();
         class_2522 var12 = class_4783.field_23371.method_29260();
         int var13 = 1 + var3.nextInt(10);

         for (int var14 = 0; var14 <= var13; var14++) {
            if (var1.method_28262(var10).method_8350(class_4783.field_23900)
               && var1.method_28262(var10.method_6081()).method_8350(class_4783.field_23900)
               && var12.method_8309(var1, var10)) {
               if (var14 != var13) {
                  var1.method_7513(var10, var12, 2);
               } else {
                  var1.method_7513(var10, var11.method_10308(class_5435.field_32703, Integer.valueOf(var3.nextInt(4) + 20)), 2);
                  var8++;
               }
            } else if (var14 > 0) {
               class_1331 var15 = var10.method_6100();
               if (var11.method_8309(var1, var15) && !var1.method_28262(var15.method_6100()).method_8350(class_4783.field_23325)) {
                  var1.method_7513(var15, var11.method_10308(class_5435.field_32703, Integer.valueOf(var3.nextInt(4) + 20)), 2);
                  var8++;
               }
               break;
            }

            var10 = var10.method_6081();
         }
      }

      return var8 > 0;
   }
}
