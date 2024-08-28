package mapped;

import java.util.*;

public class Class20 extends Properties {
   private static String[] field35;
   private Set<Object> field36 = new LinkedHashSet<Object>();

   @Override
   public synchronized Object put(Object var1, Object var2) {
      if (var1 instanceof String) {
         var1 = ((String)var1).trim();
      }

      if (var2 instanceof String) {
         var2 = ((String)var2).trim();
      }

      this.field36.add(var1);
      return super.put(var1, var2);
   }

   @Override
   public Set<Object> keySet() {
      Set var3 = super.keySet();
      this.field36.retainAll(var3);
      return Collections.<Object>unmodifiableSet(this.field36);
   }

   @Override
   public synchronized Enumeration<Object> keys() {
      return Collections.<Object>enumeration(this.keySet());
   }
}
