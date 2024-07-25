package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_8088 extends class_4285<class_1059> {
   public class_8088(Codec<class_1059> var1) {
      super(var1);
   }

   public boolean method_36729(class_700 var1, class_6541 var2, Random var3, class_1331 var4, class_1059 var5) {
      class_2522 var8 = var5.field_5814.method_35002(var3, var4);
      class_1331 var9;
      if (!var5.field_5807) {
         var9 = var4;
      } else {
         var9 = var1.method_22563(class_3801.field_18598, var4);
      }

      int var10 = 0;
      class_2921 var11 = new class_2921();

      for (int var12 = 0; var12 < var5.field_5810; var12++) {
         var11.method_13360(
            var9,
            var3.nextInt(var5.field_5805 + 1) - var3.nextInt(var5.field_5805 + 1),
            var3.nextInt(var5.field_5808 + 1) - var3.nextInt(var5.field_5808 + 1),
            var3.nextInt(var5.field_5811 + 1) - var3.nextInt(var5.field_5811 + 1)
         );
         class_1331 var13 = var11.method_6100();
         class_2522 var14 = var1.method_28262(var13);
         if ((var1.method_22548(var11) || var5.field_5804 && var1.method_28262(var11).method_8362().method_24497())
            && var8.method_8309(var1, var11)
            && (var5.field_5815.isEmpty() || var5.field_5815.contains(var14.method_8360()))
            && !var5.field_5809.contains(var14)
            && (
               !var5.field_5803
                  || var1.method_28258(var13.method_6108()).method_22007(class_6503.field_33094)
                  || var1.method_28258(var13.method_6090()).method_22007(class_6503.field_33094)
                  || var1.method_28258(var13.method_6094()).method_22007(class_6503.field_33094)
                  || var1.method_28258(var13.method_6073()).method_22007(class_6503.field_33094)
            )) {
            var5.field_5806.method_2498(var1, var11, var8, var3);
            var10++;
         }
      }

      return var10 > 0;
   }
}
