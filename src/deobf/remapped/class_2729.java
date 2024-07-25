package remapped;

import java.util.Map;
import java.util.Map.Entry;

public class class_2729 {
   private static String[] field_13319;
   private final Identifier field_13320;
   private final Map<Identifier, Float> field_13321;

   public class_2729(Identifier var1, Map<Identifier, Float> var2) {
      this.field_13320 = var1;
      this.field_13321 = var2;
   }

   public Identifier method_12263() {
      return this.field_13320;
   }

   public boolean method_12261(ItemStack var1, ClientWorld var2, LivingEntity var3) {
      class_2451 var6 = var1.method_27960();

      for (Entry var8 : this.field_13321.entrySet()) {
         class_3825 var9 = class_6878.method_31546(var6, (Identifier)var8.getKey());
         if (var9 == null || var9.method_17802(var1, var2, var3) < (Float)var8.getValue()) {
            return false;
         }
      }

      return true;
   }
}
