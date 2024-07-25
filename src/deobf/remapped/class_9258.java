package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_9258 extends class_4285<class_2225> {
   public class_9258(Codec<class_2225> var1) {
      super(var1);
   }

   public boolean method_42655(class_700 var1, class_6541 var2, Random var3, class_1331 var4, class_2225 var5) {
      if (var5.field_11114.contains(var1.method_28262(var4.method_6100()))
         && var5.field_11116.contains(var1.method_28262(var4))
         && var5.field_11112.contains(var1.method_28262(var4.method_6081()))) {
         var1.method_7513(var4, var5.field_11117, 2);
         return true;
      } else {
         return false;
      }
   }
}
