package remapped;

import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_6203 extends class_5837 {
   private static final Logger field_31707 = LogManager.getLogger();

   private class_6203(class_7279[] var1) {
      super(var1);
   }

   @Override
   public class_1404 method_13321() {
      return class_5116.field_26391;
   }

   @Override
   public ItemStack method_26627(ItemStack var1, class_2792 var2) {
      if (!var1.method_28022()) {
         Optional var5 = var2.method_12694()
            .method_29549()
            .<class_6867, class_3001>method_23138(class_1510.field_7995, new class_4657(var1), var2.method_12694());
         if (var5.isPresent()) {
            ItemStack var6 = ((class_3001)var5.get()).method_41044();
            if (!var6.method_28022()) {
               ItemStack var7 = var6.method_27973();
               var7.method_28017(var1.method_27997());
               return var7;
            }
         }

         field_31707.warn("Couldn't smelt {} because there is no smelting recipe", var1);
         return var1;
      } else {
         return var1;
      }
   }

   public static class_5363<?> method_28397() {
      return method_26628(class_6203::new);
   }
}
