package mapped;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Class9458 {
   private static String[] field43947;
   private String field43948 = null;
   private Map<String, String> field43949 = new LinkedHashMap<String, String>();
   private Set<String> field43950 = new LinkedHashSet<String>();

   public Class9458(String var1) {
      this.field43948 = var1;
   }

   public String method36400() {
      return this.field43948;
   }

   public void method36401(String var1, String var2) {
      this.field43949.put(var1, var2);
   }

   public void method36402(Class9458 var1) {
      if (var1 != null) {
         this.field43949.putAll(var1.field43949);
      }
   }

   public void method36403(Class6679[] var1) {
      for (int var4 = 0; var4 < var1.length; var4++) {
         Class6679 var5 = var1[var4];
         String var6 = var5.method20366();
         String var7 = this.field43949.get(var6);
         if (var7 != null) {
            var5.method20371(var7);
         }
      }
   }

   public String[] method36404() {
      Set<String> var3 = this.field43949.keySet();
      return var3.toArray(new String[var3.size()]);
   }

   public String method36405(String var1) {
      return this.field43949.get(var1);
   }

   public void method36406(String var1) {
      this.field43950.add(var1);
   }

   public void method36407(String var1) {
      this.field43950.remove(var1);
   }

   public Collection<String> method36408() {
      return new LinkedHashSet<String>(this.field43950);
   }

   public void method36409(Collection<String> var1) {
      this.field43950.addAll(var1);
   }

   public boolean method36410(String var1) {
      return this.field43950.contains(var1);
   }
}
