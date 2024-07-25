package remapped;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class class_9699 extends Exception {
   private final Map<String, Object> field_49339 = new HashMap<String, Object>();
   private int field_49341;

   public class_9699(Throwable var1) {
      super(var1);
   }

   public class_9699 method_44824(String var1, Object var2) {
      this.field_49339.put(var1, var2);
      return this;
   }

   public class_9699 method_44826(Class<?> var1) {
      return this.method_44824("Source " + this.field_49341++, this.method_44823(var1));
   }

   private String method_44823(Class<?> var1) {
      return !var1.isAnonymousClass() ? var1.getName() : var1.getName() + " (Anonymous)";
   }

   @Override
   public String getMessage() {
      StringBuilder var3 = new StringBuilder();
      var3.append("Please post this error to https://github.com/ViaVersion/ViaVersion/issues\n{");
      int var4 = 0;

      for (Entry var6 : this.field_49339.entrySet()) {
         var3.append(var4 != 0 ? ", " : "").append((String)var6.getKey()).append(": ").append(var6.getValue().toString());
         var4++;
      }

      var3.append("}\nActual Error: ");
      return var3.toString();
   }

   @Override
   public synchronized Throwable fillInStackTrace() {
      return this;
   }
}
