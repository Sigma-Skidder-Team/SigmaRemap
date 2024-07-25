package remapped;

import com.google.common.collect.Maps;
import java.io.Reader;
import java.util.List;
import java.util.Map;

public class class_6751 {
   private static String[] field_34853;
   private final Map<String, class_9798> field_34854 = Maps.newLinkedHashMap();
   private class_9846 field_34852;

   public static class_6751 method_30946(class_9695 var0, Reader var1) {
      return class_6539.<class_6751>method_29801(var0.field_49317, var1, class_6751.class);
   }

   public class_6751(Map<String, class_9798> var1, class_9846 var2) {
      this.field_34852 = var2;
      this.field_34854.putAll(var1);
   }

   public class_6751(List<class_6751> var1) {
      class_6751 var4 = null;

      for (class_6751 var6 : var1) {
         if (var6.method_30948()) {
            this.field_34854.clear();
            var4 = var6;
         }

         this.field_34854.putAll(var6.field_34854);
      }

      if (var4 != null) {
         this.field_34852 = var4.field_34852;
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 instanceof class_6751) {
            class_6751 var4 = (class_6751)var1;
            if (this.field_34854.equals(var4.field_34854)) {
               return !this.method_30948() ? !var4.method_30948() : this.field_34852.equals(var4.field_34852);
            }
         }

         return false;
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.field_34854.hashCode() + (!this.method_30948() ? 0 : this.field_34852.hashCode());
   }

   public Map<String, class_9798> method_30947() {
      return this.field_34854;
   }

   public boolean method_30948() {
      return this.field_34852 != null;
   }

   public class_9846 method_30949() {
      return this.field_34852;
   }
}
