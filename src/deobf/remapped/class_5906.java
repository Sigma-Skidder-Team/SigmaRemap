package remapped;

public class class_5906 extends class_6967 {
   private static String[] field_29976;
   public int field_29975;

   public class_5906(class_5542 var1, double var2, int var4, int var5) {
      super(var1, var2, var4, var5);
      this.field_29977 = var1;
   }

   @Override
   public double method_31857() {
      return 2.0;
   }

   @Override
   public boolean method_31858() {
      return this.field_35808 % 100 == 0;
   }

   @Override
   public boolean method_31855(class_4924 var1, BlockPos var2) {
      class_2522 var5 = var1.method_28262(var2);
      return var5.method_8350(class_4783.field_23637) && var5.<Integer>method_10313(class_7086.field_36577) >= 2;
   }

   @Override
   public void method_16794() {
      if (!this.method_31860()) {
         if (!this.method_31860() && class_5542.method_25184(this.field_29977).nextFloat() < 0.05F) {
            this.field_29977.method_37155(class_463.field_2594, 1.0F, 1.0F);
         }
      } else if (this.field_29975 < 40) {
         this.field_29975++;
      } else {
         this.method_27013();
      }

      super.method_16794();
   }

   public void method_27013() {
      if (this.field_29977.field_41768.method_29537().method_1285(class_291.field_1047)) {
         class_2522 var3 = this.field_29977.field_41768.method_28262(this.field_35802);
         if (var3.method_8350(class_4783.field_23637)) {
            int var4 = var3.<Integer>method_10313(class_7086.field_36577);
            var3.method_10308(class_7086.field_36577, Integer.valueOf(1));
            int var5 = 1 + this.field_29977.field_41768.field_33033.nextInt(2) + (var4 != 3 ? 0 : 1);
            ItemStack var6 = this.field_29977.method_26520(class_6943.field_35707);
            if (var6.method_28022()) {
               this.field_29977.method_37349(class_6943.field_35707, new ItemStack(class_4897.field_25205));
               var5--;
            }

            if (var5 > 0) {
               class_6414.method_29267(this.field_29977.field_41768, this.field_35802, new ItemStack(class_4897.field_25205, var5));
            }

            this.field_29977.method_37155(class_463.field_2156, 1.0F, 1.0F);
            this.field_29977.field_41768.method_7513(this.field_35802, var3.method_10308(class_7086.field_36577, Integer.valueOf(1)), 2);
         }
      }
   }

   @Override
   public boolean method_16795() {
      return !this.field_29977.method_26507() && super.method_16795();
   }

   @Override
   public void method_16796() {
      this.field_29975 = 0;
      this.field_29977.method_25196(false);
      super.method_16796();
   }
}
