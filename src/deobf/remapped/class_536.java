package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_536 extends class_4285<class_611> {
   public class_536(Codec<class_611> var1) {
      super(var1);
   }

   public boolean method_2625(class_700 var1, class_6541 var2, Random var3, class_1331 var4, class_611 var5) {
      int var8 = 0;
      int var9 = var5.method_2873().method_15936(var3);

      for (int var10 = 0; var10 < var9; var10++) {
         int var11 = var3.nextInt(8) - var3.nextInt(8);
         int var12 = var3.nextInt(8) - var3.nextInt(8);
         int var13 = var1.method_22562(class_3801.field_18599, var4.method_12173() + var11, var4.method_12185() + var12);
         class_1331 var14 = new class_1331(var4.method_12173() + var11, var13, var4.method_12185() + var12);
         class_2522 var15 = class_4783.field_23239.method_29260().method_10308(class_6001.field_30566, Integer.valueOf(var3.nextInt(4) + 1));
         if (var1.method_28262(var14).method_8350(class_4783.field_23900) && var15.method_8309(var1, var14)) {
            var1.method_7513(var14, var15, 2);
            var8++;
         }
      }

      return var8 > 0;
   }
}
