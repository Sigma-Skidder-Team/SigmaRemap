package remapped;

import java.util.Iterator;
import java.util.List;

public class class_5966 {
   private final class_4085 field_30389 = null;
   private final List<class_3741> field_30390 = null;
   private long field_30387;

   public void method_27247(long var1) {
      try {
         this.method_27250(var1);
      } catch (Exception var6) {
      }
   }

   public void method_27249(long var1) {
      try {
         this.method_27250(var1);
      } catch (Exception var6) {
         this.field_30389.method_18833(var6);
      }
   }

   private void method_27250(long var1) {
      Iterator var5 = this.field_30390.iterator();

      while (var5.hasNext()) {
         class_3741 var6 = (class_3741)var5.next();
         var6.field_18316.run();
         var5.remove();
         long var7 = var1 - this.field_30387;
         long var9 = this.field_30387;
         this.field_30387 = var1;
         if (var6.field_18314 != null && var6.field_18314 != var7) {
            this.field_30389.method_18833(new class_699("Succeeded in invalid tick: expected " + (var9 + var6.field_18314) + ", but current tick is " + var1));
            break;
         }
      }
   }

   private class_5966() {
      throw new RuntimeException("Synthetic constructor added by MCP, do not call");
   }
}
