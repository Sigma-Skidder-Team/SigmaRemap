package mapped;

import com.google.common.collect.Maps;
import java.io.Reader;
import java.util.List;
import java.util.Map;

public class Class9032 {
   private static String[] field41328;
   private final Map<String, Class7497> field41329 = Maps.newLinkedHashMap();
   private Class7498 field41330;

   public static Class9032 method33448(Class9786 var0, Reader var1) {
      return Class8963.<Class9032>method32796(var0.field45755, var1, Class9032.class);
   }

   public Class9032(Map<String, Class7497> var1, Class7498 var2) {
      this.field41330 = var2;
      this.field41329.putAll(var1);
   }

   public Class9032(List<Class9032> var1) {
      Class9032 var4 = null;

      for (Class9032 var6 : var1) {
         if (var6.method33450()) {
            this.field41329.clear();
            var4 = var6;
         }

         this.field41329.putAll(var6.field41329);
      }

      if (var4 != null) {
         this.field41330 = var4.field41330;
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 instanceof Class9032) {
            Class9032 var4 = (Class9032)var1;
            if (this.field41329.equals(var4.field41329)) {
               return !this.method33450() ? !var4.method33450() : this.field41330.equals(var4.field41330);
            }
         }

         return false;
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.field41329.hashCode() + (!this.method33450() ? 0 : this.field41330.hashCode());
   }

   public Map<String, Class7497> method33449() {
      return this.field41329;
   }

   public boolean method33450() {
      return this.field41330 != null;
   }

   public Class7498 method33451() {
      return this.field41330;
   }
}
