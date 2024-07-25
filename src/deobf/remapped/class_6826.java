package remapped;

import java.util.Random;

public class class_6826 {
   private static String[] field_35187;
   private final Random field_35188 = new Random();
   private final class_1893 field_35186;
   private class_3560 field_35185;
   private int field_35184 = 100;

   public class_6826(class_1893 var1) {
      this.field_35186 = var1;
   }

   public void method_31309() {
      class_75 var3 = this.field_35186.method_8506();
      if (this.field_35185 != null) {
         if (!var3.method_163().method_38928().equals(this.field_35185.method_16556()) && var3.method_164()) {
            this.field_35186.method_8590().method_16336(this.field_35185);
            this.field_35184 = class_9299.method_42824(this.field_35188, 0, var3.method_162() / 2);
         }

         if (!this.field_35186.method_8590().method_16331(this.field_35185)) {
            this.field_35185 = null;
            this.field_35184 = Math.min(this.field_35184, class_9299.method_42824(this.field_35188, var3.method_162(), var3.method_160()));
         }
      }

      this.field_35184 = Math.min(this.field_35184, var3.method_160());
      if (this.field_35185 == null && this.field_35184-- <= 0) {
         this.method_31311(var3);
      }
   }

   public void method_31311(class_75 var1) {
      this.field_35185 = class_4949.method_22678(var1.method_163());
      if (this.field_35185.method_16551() != class_3541.field_17316) {
         this.field_35186.method_8590().method_16345(this.field_35185);
      }

      this.field_35184 = Integer.MAX_VALUE;
   }

   public void method_31312() {
      if (this.field_35185 != null) {
         this.field_35186.method_8590().method_16336(this.field_35185);
         this.field_35185 = null;
      }

      this.field_35184 += 100;
   }

   public boolean method_31308(class_75 var1) {
      return this.field_35185 != null ? var1.method_163().method_38928().equals(this.field_35185.method_16556()) : false;
   }
}
