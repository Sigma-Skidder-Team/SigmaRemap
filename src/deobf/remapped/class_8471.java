package remapped;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class class_8471 {
   private static String[] field_43404;
   private String field_43405 = null;
   private Map<String, String> field_43406 = new LinkedHashMap<String, String>();
   private Set<String> field_43407 = new LinkedHashSet<String>();

   public class_8471(String var1) {
      this.field_43405 = var1;
   }

   public String method_38982() {
      return this.field_43405;
   }

   public void method_38979(String var1, String var2) {
      this.field_43406.put(var1, var2);
   }

   public void method_38984(class_8471 var1) {
      if (var1 != null) {
         this.field_43406.putAll(var1.field_43406);
      }
   }

   public void method_38989(class_6843[] var1) {
      for (int var4 = 0; var4 < var1.length; var4++) {
         class_6843 var5 = var1[var4];
         String var6 = var5.method_31405();
         String var7 = this.field_43406.get(var6);
         if (var7 != null) {
            var5.method_31398(var7);
         }
      }
   }

   public String[] method_38987() {
      Set var3 = this.field_43406.keySet();
      return var3.<String>toArray(new String[var3.size()]);
   }

   public String method_38983(String var1) {
      return this.field_43406.get(var1);
   }

   public void method_38986(String var1) {
      this.field_43407.add(var1);
   }

   public void method_38985(String var1) {
      this.field_43407.remove(var1);
   }

   public Collection<String> method_38988() {
      return new LinkedHashSet<String>(this.field_43407);
   }

   public void method_38990(Collection<String> var1) {
      this.field_43407.addAll(var1);
   }

   public boolean method_38981(String var1) {
      return this.field_43407.contains(var1);
   }
}
