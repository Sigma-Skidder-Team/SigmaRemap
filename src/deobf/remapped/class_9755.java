package remapped;

import java.util.ArrayList;

public class class_9755 {
   private static String[] field_49559;
   public class_168[] field_49557;
   public ArrayList field_49558;

   public class_9755(class_8095 var1, class_8095 var2, int var3) {
      this.field_49560 = var1;
      this.field_49557 = new class_168[var3];
      this.field_49558 = new ArrayList();

      for (int var6 = 0; var6 < this.field_49557.length; var6++) {
         this.field_49557[var6] = var1.method_36774(var2);
      }

      this.method_45030(var2);
   }

   public void method_45030(class_8095 var1) {
      this.field_49558.clear();

      for (int var4 = 0; var4 < this.field_49557.length; var4++) {
         this.field_49558.add(this.field_49557[var4]);
      }
   }
}
