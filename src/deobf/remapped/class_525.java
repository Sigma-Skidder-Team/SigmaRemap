package remapped;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class class_525 implements class_2822 {
   private static String[] field_3197;
   private final class_4550 field_3198;

   public class_525(class_4550 var1) {
      this.field_3198 = var1;
   }

   @Override
   public Collection<GameProfile> method_12849(class_9155 var1) throws CommandSyntaxException {
      List var4 = this.field_3198.method_21103(var1);
      if (var4.isEmpty()) {
         throw class_5601.field_28403.create();
      } else {
         ArrayList var5 = Lists.newArrayList();

         for (class_9359 var7 : var4) {
            var5.add(var7.method_3247());
         }

         return var5;
      }
   }
}
