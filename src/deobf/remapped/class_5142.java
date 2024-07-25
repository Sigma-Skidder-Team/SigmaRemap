package remapped;

import java.util.ArrayList;
import java.util.Map;

public class class_5142 {
   private static String[] field_26492;
   private class_6458[] field_26493;
   private class_2194[] field_26494;

   public class_5142(class_6458[] var1, Map<String, class_3999> var2) {
      this.field_26493 = var1;
      ArrayList var5 = new ArrayList();

      for (String var7 : var2.keySet()) {
         class_3999 var8 = (class_3999)var2.get(var7);
         if (var8 instanceof class_2194) {
            class_2194 var9 = (class_2194)var8;
            var5.add(var9);
         }
      }

      this.field_26494 = var5.<class_2194>toArray(new class_2194[var5.size()]);
   }

   public void method_23556(int var1) {
      for (int var4 = 0; var4 < this.field_26493.length; var4++) {
         class_6458 var5 = this.field_26493[var4];
         var5.method_29429(var1);
      }
   }

   public void method_23560() {
      this.method_23559();

      for (int var3 = 0; var3 < this.field_26493.length; var3++) {
         class_6458 var4 = this.field_26493[var3];
         var4.method_29426();
      }
   }

   private void method_23559() {
      for (int var3 = 0; var3 < this.field_26494.length; var3++) {
         class_2194 var4 = this.field_26494[var3];
         var4.method_10150();
      }
   }

   public void method_23557() {
      for (int var3 = 0; var3 < this.field_26493.length; var3++) {
         class_6458 var4 = this.field_26493[var3];
         var4.method_29430();
      }
   }
}
