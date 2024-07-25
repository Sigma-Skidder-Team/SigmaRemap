package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public abstract class class_3418 extends class_4285<class_1941> {
   public class_3418(Codec<class_1941> var1) {
      super(var1);
   }

   public boolean method_15773(class_700 var1, class_6541 var2, Random var3, class_1331 var4, class_1941 var5) {
      class_2522 var8 = class_2351.field_11725.method_10606(var3).method_29260();
      return this.method_15772(var1, var3, var4, var8);
   }

   public abstract boolean method_15772(class_9379 var1, Random var2, class_1331 var3, class_2522 var4);

   public boolean method_15774(class_9379 var1, Random var2, class_1331 var3, class_2522 var4) {
      class_1331 var7 = var3.method_6081();
      class_2522 var8 = var1.method_28262(var3);
      if ((var8.method_8350(class_4783.field_23900) || var8.method_8349(class_2351.field_11809)) && var1.method_28262(var7).method_8350(class_4783.field_23900)
         )
       {
         var1.method_7513(var3, var4, 3);
         if (!(var2.nextFloat() < 0.25F)) {
            if (var2.nextFloat() < 0.05F) {
               var1.method_7513(var7, class_4783.field_23239.method_29260().method_10308(class_6001.field_30566, Integer.valueOf(var2.nextInt(4) + 1)), 2);
            }
         } else {
            var1.method_7513(var7, class_2351.field_11809.method_10606(var2).method_29260(), 2);
         }

         for (class_240 var10 : class_9594.field_48893) {
            if (var2.nextFloat() < 0.2F) {
               class_1331 var11 = var3.method_6098(var10);
               if (var1.method_28262(var11).method_8350(class_4783.field_23900)) {
                  class_2522 var12 = class_2351.field_11804.method_10606(var2).method_29260().method_10308(class_4590.field_22314, var10);
                  var1.method_7513(var11, var12, 2);
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }
}
