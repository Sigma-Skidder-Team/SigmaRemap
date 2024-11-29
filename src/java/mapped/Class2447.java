package mapped;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Class2447 extends Exception {
   private final Map<String, Object> field16528 = new HashMap<String, Object>();
   private int field16529;

   public Class2447(Throwable var1) {
      super(var1);
   }

   public Class2447 method10458(String var1, Object var2) {
      this.field16528.put(var1, var2);
      return this;
   }

   public Class2447 method10459(Class<?> var1) {
      return this.method10458("Source " + this.field16529++, this.method10460(var1));
   }

   private String method10460(Class<?> var1) {
      return !var1.isAnonymousClass() ? var1.getName() : var1.getName() + " (Anonymous)";
   }

   @Override
   public String getMessage() {
      StringBuilder var3 = new StringBuilder();
      var3.append("Please post this error to https://github.com/ViaVersion/ViaVersion/issues\n{");
      int var4 = 0;

      for (Entry var6 : this.field16528.entrySet()) {
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
