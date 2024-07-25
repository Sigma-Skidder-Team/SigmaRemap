package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class class_1232 implements class_7279 {
   private static String[] field_6800;
   private final Map<String, class_7986> field_6802;
   private final class_5848 field_6801;

   private class_1232(Map<String, class_7986> var1, class_5848 var2) {
      this.field_6802 = ImmutableMap.copyOf(var1);
      this.field_6801 = var2;
   }

   @Override
   public class_2190 method_33269() {
      return class_5110.field_26349;
   }

   @Override
   public Set<class_9791<?>> method_12681() {
      return ImmutableSet.of(this.field_6801.method_26666());
   }

   public boolean test(class_2792 var1) {
      Entity var4 = var1.<Entity>method_12698(this.field_6801.method_26666());
      if (var4 == null) {
         return false;
      } else {
         class_1097 var5 = var4.world.method_29562();

         for (Entry var7 : this.field_6802.entrySet()) {
            if (!this.method_5479(var4, var5, (String)var7.getKey(), (class_7986)var7.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean method_5479(Entity var1, class_1097 var2, String var3, class_7986 var4) {
      class_4399 var7 = var2.method_4858(var3);
      if (var7 != null) {
         String var8 = var1.method_37206();
         return var2.method_4857(var8, var7) ? var4.method_36241(var2.method_4855(var8, var7).method_38146()) : false;
      } else {
         return false;
      }
   }
}
