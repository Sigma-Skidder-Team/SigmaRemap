package mapped;

import com.google.common.collect.Lists;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Optional;

public class Class3258 extends Class3257 {
   private static final Logger field18744 = LogManager.getLogger();

   public Class3258(Class5643 var1) {
      super(var1);
   }

   @Override
   public Class6794<ItemStack> method11700(Class1655 var1, PlayerEntity var2, Hand var3) {
      ItemStack var6 = var2.getHeldItem(var3);
      Class39 var7 = var6.method32142();
      if (!var2.field4919.field29609) {
         var2.method3095(var3, ItemStack.EMPTY);
      }

      if (var7 != null && var7.method119("Recipes", 9)) {
         if (!var1.field9020) {
            Class41 var8 = var7.method131("Recipes", 8);
            ArrayList var9 = Lists.newArrayList();
            Class282 var10 = var1.method6715().method1407();

            for (int var11 = 0; var11 < var8.size(); var11++) {
               String var12 = var8.method160(var11);
               Optional var13 = var10.method1035(new ResourceLocation(var12));
               if (!var13.isPresent()) {
                  field18744.error("Invalid recipe: {}", var12);
                  return Class6794.<ItemStack>method20699(var6);
               }

               var9.add(var13.get());
            }

            var2.method2778(var9);
            var2.method2913(Class8876.field40098.method172(this));
         }

         return Class6794.<ItemStack>method20700(var6, var1.method6714());
      } else {
         field18744.error("Tag not valid: {}", var7);
         return Class6794.<ItemStack>method20699(var6);
      }
   }
}
