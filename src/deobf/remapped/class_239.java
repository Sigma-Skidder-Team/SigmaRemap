package remapped;

import com.google.common.collect.Maps;
import java.util.Map;

public class class_239 extends class_2451 {
   private static String[] field_798;
   private static final Map<class_9077, class_239> field_796 = Maps.newEnumMap(class_9077.class);
   private final class_9077 field_797;

   public class_239(class_9077 var1, class_317 var2) {
      super(var2);
      this.field_797 = var1;
      field_796.put(var1, this);
   }

   @Override
   public class_6910 method_11202(ItemStack var1, class_704 var2, class_5834 var3, Hand var4) {
      if (var3 instanceof class_8031) {
         class_8031 var7 = (class_8031)var3;
         if (var7.method_37330() && !var7.method_36478() && var7.method_36474() != this.field_797) {
            if (!var2.world.field_33055) {
               var7.method_36471(this.field_797);
               var1.method_27970(1);
            }

            return class_6910.method_31659(var2.world.field_33055);
         }
      }

      return class_6910.field_35521;
   }

   public class_9077 method_1015() {
      return this.field_797;
   }

   public static class_239 method_1016(class_9077 var0) {
      return field_796.get(var0);
   }
}
