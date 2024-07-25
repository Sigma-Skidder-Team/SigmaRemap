package remapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;

public class class_8947 implements class_6605 {
   private static String[] field_45867;
   private final class_4550 field_45866;

   public class_8947(class_4550 var1) {
      this.field_45866 = var1;
   }

   @Override
   public Collection<String> method_30391(class_9155 var1, Supplier<Collection<String>> var2) throws CommandSyntaxException {
      List var5 = this.field_45866.method_21106(var1);
      if (var5.isEmpty()) {
         throw class_5601.field_28399.create();
      } else {
         ArrayList var6 = Lists.newArrayList();

         for (Entity var8 : var5) {
            var6.add(var8.method_37206());
         }

         return var6;
      }
   }
}
