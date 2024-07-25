package remapped;

import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class class_9719 extends class_4285<class_1941> {
   public class_9719(Codec<class_1941> var1) {
      super(var1);
   }

   public boolean method_44913(class_700 var1, class_6541 var2, Random var3, class_1331 var4, class_1941 var5) {
      class_2034 var8 = new class_2034(var4);
      List var9 = IntStream.rangeClosed(var8.method_9535(), var8.method_9536()).boxed().collect(Collectors.toList());
      Collections.shuffle(var9, var3);
      List var10 = IntStream.rangeClosed(var8.method_9545(), var8.method_9538()).boxed().collect(Collectors.toList());
      Collections.shuffle(var10, var3);
      class_2921 var11 = new class_2921();

      for (Integer var13 : var9) {
         for (Integer var15 : var10) {
            var11.method_13362(var13, 0, var15);
            class_1331 var16 = var1.method_22563(class_3801.field_18590, var11);
            if (var1.method_22548(var16) || var1.method_28262(var16).method_8324(var1, var16).method_19485()) {
               var1.method_7513(var16, class_4783.field_23471.method_29260(), 2);
               class_2358.method_10817(var1, var3, var16, class_5931.field_30085);
               class_2522 var17 = class_4783.field_23521.method_29260();

               for (Direction var19 : class_9594.field_48893) {
                  class_1331 var20 = var16.method_6098(var19);
                  if (var17.method_8309(var1, var20)) {
                     var1.method_7513(var20, var17, 2);
                  }
               }

               return true;
            }
         }
      }

      return false;
   }
}
