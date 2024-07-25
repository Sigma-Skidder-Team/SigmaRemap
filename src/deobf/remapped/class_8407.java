package remapped;

import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Properties;
import java.util.Set;

public class class_8407 extends Properties {
   private static String[] field_43009;
   private Set<Object> field_43010 = new LinkedHashSet<Object>();

   @Override
   public synchronized Object put(Object var1, Object var2) {
      if (var1 instanceof String) {
         var1 = ((String)var1).trim();
      }

      if (var2 instanceof String) {
         var2 = ((String)var2).trim();
      }

      this.field_43010.add(var1);
      return super.put(var1, var2);
   }

   @Override
   public Set<Object> keySet() {
      Set var3 = super.keySet();
      this.field_43010.retainAll(var3);
      return Collections.<Object>unmodifiableSet(this.field_43010);
   }

   @Override
   public synchronized Enumeration<Object> keys() {
      return Collections.<Object>enumeration(this.keySet());
   }
}
