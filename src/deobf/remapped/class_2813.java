package remapped;

public class class_2813 extends class_7346<class_6594> {
   public class_2813(class_4908 var1) {
      super(var1.field_941 - 150, var1.field_940, 32, var1.field_940 - 15, 36);
      this.field_13819 = var1;
   }

   public void method_12809(class_8960 var1) {
      class_4908 var10003 = this.field_13819;
      this.field_13819.getClass();
      this.method_33483(new class_6594(var10003, var1));
   }

   @Override
   public int method_36195() {
      return (int)((double)this.field_40891 * 0.93);
   }

   @Override
   public boolean method_36221() {
      return this.field_13819.method_41185() == this;
   }

   @Override
   public int method_36205() {
      return this.method_36218() * 36;
   }

   @Override
   public void method_36199(class_7966 var1) {
      this.field_13819.method_1183(var1);
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      if (var5 == 0) {
         if (var1 < (double)this.method_36191() && var3 >= (double)this.field_40876 && var3 <= (double)this.field_40877) {
            int var8 = this.field_40891 / 2 - 92;
            int var9 = this.field_40891;
            int var10 = (int)Math.floor(var3 - (double)this.field_40876) - this.field_40874 + (int)this.method_36228();
            int var11 = var10 / this.field_40878;
            if (var1 >= (double)var8 && var1 <= (double)var9 && var11 >= 0 && var10 >= 0 && var11 < this.method_36218()) {
               this.method_33482(var11);
               this.method_33484(var10, var11, var1, var3, this.field_40891);
            }

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public int method_36191() {
      return this.field_40891 - 5;
   }

   @Override
   public void method_33484(int var1, int var2, double var3, double var5, int var7) {
      int var10 = this.field_40891 - 35;
      int var11 = var2 * this.field_40878 + 36 - (int)this.method_36228();
      int var12 = var10 + 10;
      int var13 = var11 - 3;
      if (var3 >= (double)var10 && var3 <= (double)(var10 + 9) && var5 >= (double)var11 && var5 <= (double)(var11 + 9)) {
         if (!((class_8960)class_4908.method_22487(this.field_13819).get(var2)).field_45903.isEmpty()) {
            class_4908.method_22479(this.field_13819, -1);
            class_4908.method_22492((int)this.method_36228());
            this.field_40883.method_8609(new class_6420(this.field_13819, (class_8960)class_4908.method_22487(this.field_13819).get(var2)));
         }
      } else if (var3 >= (double)var12 && var3 < (double)(var12 + 13) && var5 >= (double)var13 && var5 < (double)(var13 + 15)) {
         class_4908.method_22492((int)this.method_36228());
         class_4908.method_22472(this.field_13819, var2);
      }
   }

   @Override
   public void method_33482(int var1) {
      this.method_33485(var1);
      if (var1 != -1) {
         class_7567.method_34410(
            class_6956.method_31803("narrator.select", ((class_8960)class_4908.method_22487(this.field_13819).get(var1)).field_45899.toString())
         );
      }

      this.method_12808(var1);
   }

   public void method_12808(int var1) {
      class_4908.method_22479(this.field_13819, var1);
      class_4908.method_22485(this.field_13819);
   }

   public void method_12807(class_6594 var1) {
      super.method_36197(var1);
      class_4908.method_22479(this.field_13819, this.method_41183().indexOf(var1));
      class_4908.method_22485(this.field_13819);
   }
}
