package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_8729 extends class_2451 {
   private static final Logger field_44731 = LogManager.getLogger();

   public class_8729(class_317 var1) {
      super(var1);
   }

   @Override
   public class_954<ItemStack> method_11231(World var1, class_704 var2, class_2584 var3) {
      ItemStack var6 = var2.method_26617(var3);
      CompoundNBT var7 = var6.method_27990();
      if (!var2.playerAbilities.isCreativeMode) {
         var2.method_26615(var3, ItemStack.EMPTY);
      }

      if (var7 != null && var7.contains("Recipes", 9)) {
         if (!var1.field_33055) {
            class_3416 var8 = var7.method_25927("Recipes", 8);
            ArrayList var9 = Lists.newArrayList();
            class_5023 var10 = var1.method_29522().method_1705();

            for (int var11 = 0; var11 < var8.size(); var11++) {
               String var12 = var8.method_15770(var11);
               Optional var13 = var10.method_23139(new Identifier(var12));
               if (!var13.isPresent()) {
                  field_44731.error("Invalid recipe: {}", var12);
                  return class_954.<ItemStack>method_4202(var6);
               }

               var9.add(var13.get());
            }

            var2.method_3223(var9);
            var2.method_3211(class_6234.field_31907.method_43790(this));
         }

         return class_954.<ItemStack>method_4208(var6, var1.method_22567());
      } else {
         field_44731.error("Tag not valid: {}", var7);
         return class_954.<ItemStack>method_4202(var6);
      }
   }
}
