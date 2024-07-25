package remapped;

public class class_4663 implements class_7687 {
   private final class_2309<?, ?> field_22744;
   private final class_2309<?, ?> field_22743;

   public class_4663(class_5002 var1, boolean var2, boolean var3) {
      this.field_22744 = !var2 ? null : new class_2975(var1);
      this.field_22743 = !var3 ? null : new class_6818(var1);
   }

   public void method_21566(class_1331 var1) {
      if (this.field_22744 != null) {
         this.field_22744.method_10616(var1);
      }

      if (this.field_22743 != null) {
         this.field_22743.method_10616(var1);
      }
   }

   public void method_21569(class_1331 var1, int var2) {
      if (this.field_22744 != null) {
         this.field_22744.method_10624(var1, var2);
      }
   }

   public boolean method_21570() {
      return this.field_22743 != null && this.field_22743.method_10621() ? true : this.field_22744 != null && this.field_22744.method_10621();
   }

   public int method_21571(int var1, boolean var2, boolean var3) {
      if (this.field_22744 != null && this.field_22743 != null) {
         int var6 = var1 / 2;
         int var7 = this.field_22744.method_10622(var6, var2, var3);
         int var8 = var1 - var6 + var7;
         int var9 = this.field_22743.method_10622(var8, var2, var3);
         return var7 == 0 && var9 > 0 ? this.field_22744.method_10622(var9, var2, var3) : var9;
      } else if (this.field_22744 == null) {
         return this.field_22743 == null ? var1 : this.field_22743.method_10622(var1, var2, var3);
      } else {
         return this.field_22744.method_10622(var1, var2, var3);
      }
   }

   @Override
   public void method_34830(class_6979 var1, boolean var2) {
      if (this.field_22744 != null) {
         this.field_22744.method_34830(var1, var2);
      }

      if (this.field_22743 != null) {
         this.field_22743.method_34830(var1, var2);
      }
   }

   public void method_21563(class_2034 var1, boolean var2) {
      if (this.field_22744 != null) {
         this.field_22744.method_10618(var1, var2);
      }

      if (this.field_22743 != null) {
         this.field_22743.method_10618(var1, var2);
      }
   }

   public class_9840 method_21562(class_2957 var1) {
      if (var1 != class_2957.field_14440) {
         return (class_9840)(this.field_22743 != null ? this.field_22743 : class_2453.field_12206);
      } else {
         return (class_9840)(this.field_22744 != null ? this.field_22744 : class_2453.field_12206);
      }
   }

   public String method_21564(class_2957 var1, class_6979 var2) {
      if (var1 != class_2957.field_14440) {
         if (this.field_22743 != null) {
            return this.field_22743.method_10620(var2.method_31925());
         }
      } else if (this.field_22744 != null) {
         return this.field_22744.method_10620(var2.method_31925());
      }

      return "n/a";
   }

   public void method_21568(class_2957 var1, class_6979 var2, class_1201 var3, boolean var4) {
      if (var1 != class_2957.field_14440) {
         if (this.field_22743 != null) {
            this.field_22743.method_10627(var2.method_31925(), var3, var4);
         }
      } else if (this.field_22744 != null) {
         this.field_22744.method_10627(var2.method_31925(), var3, var4);
      }
   }

   public void method_21561(class_2034 var1, boolean var2) {
      if (this.field_22744 != null) {
         this.field_22744.method_10619(var1, var2);
      }

      if (this.field_22743 != null) {
         this.field_22743.method_10619(var1, var2);
      }
   }

   public int method_21565(class_1331 var1, int var2) {
      int var5 = this.field_22743 != null ? this.field_22743.method_45335(var1) - var2 : 0;
      int var6 = this.field_22744 != null ? this.field_22744.method_45335(var1) : 0;
      return Math.max(var6, var5);
   }
}
