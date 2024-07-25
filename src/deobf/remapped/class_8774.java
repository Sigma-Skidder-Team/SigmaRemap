package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_8774 extends class_4285<class_1941> {
   public class_8774(Codec<class_1941> var1) {
      super(var1);
   }

   public boolean method_40331(class_700 var1, class_6541 var2, Random var3, class_1331 var4, class_1941 var5) {
      if (!var1.method_22548(var4)) {
         return false;
      } else {
         class_2522 var8 = var1.method_28262(var4.method_6081());
         if (!var8.method_8350(class_4783.field_23700) && !var8.method_8350(class_4783.field_23788) && !var8.method_8350(class_4783.field_23785)) {
            return false;
         } else {
            var1.method_7513(var4, class_4783.field_23368.method_29260(), 2);

            for (int var9 = 0; var9 < 1500; var9++) {
               class_1331 var10 = var4.method_6104(var3.nextInt(8) - var3.nextInt(8), -var3.nextInt(12), var3.nextInt(8) - var3.nextInt(8));
               if (var1.method_28262(var10).method_8345()) {
                  int var11 = 0;

                  for (Direction var15 : Direction.values()) {
                     if (var1.method_28262(var10.method_6098(var15)).method_8350(class_4783.field_23368)) {
                        var11++;
                     }

                     if (var11 > 1) {
                        break;
                     }
                  }

                  if (var11 == 1) {
                     var1.method_7513(var10, class_4783.field_23368.method_29260(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
