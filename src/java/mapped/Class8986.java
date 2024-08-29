package mapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.entity.Entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;

public class Class8986 implements Class8985 {
   private static String[] field40996;
   private final Class8429 field40997;

   public Class8986(Class8429 var1) {
      this.field40997 = var1;
   }

   @Override
   public Collection<String> method33188(Class6619 var1, Supplier<Collection<String>> var2) throws CommandSyntaxException {
      List<? extends Entity> var5 = this.field40997.method29617(var1);
      if (var5.isEmpty()) {
         throw Class8700.field39263.create();
      } else {
         ArrayList var6 = Lists.newArrayList();

         for (Entity var8 : var5) {
            var6.add(var8.method2956());
         }

         return var6;
      }
   }
}
