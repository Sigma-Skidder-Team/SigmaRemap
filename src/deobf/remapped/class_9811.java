package remapped;

public class class_9811 extends PathNavigator {
   private static String[] field_49732;
   private boolean field_49733;

   public class_9811(MobEntity var1, World var2) {
      super(var1, var2);
   }

   @Override
   public class_8976 method_5605(int var1) {
      this.field_49733 = this.field_6877 instanceof class_449;
      this.field_6888 = new class_1703(this.field_49733);
      return new class_8976(this.field_6888, var1);
   }

   @Override
   public boolean method_5601() {
      return this.field_49733 || this.method_5617();
   }

   @Override
   public class_1343 method_5596() {
      return new class_1343(this.field_6877.getPosX(), this.field_6877.method_37080(0.5), this.field_6877.getPosZ());
   }

   @Override
   public void method_5612() {
      this.field_6875++;
      if (this.field_6874) {
         this.method_5621();
      }

      if (!this.method_5591()) {
         if (!this.method_5601()) {
            if (this.field_6887 != null && !this.field_6887.method_18436()) {
               class_1343 var3 = this.field_6887.method_18439(this.field_6877);
               if (MathHelper.floor(this.field_6877.getPosX()) == MathHelper.floor(var3.field_7336)
                  && MathHelper.floor(this.field_6877.method_37309()) == MathHelper.floor(var3.field_7333)
                  && MathHelper.floor(this.field_6877.getPosZ()) == MathHelper.floor(var3.field_7334)) {
                  this.field_6887.method_18434();
               }
            }
         } else {
            this.method_5592();
         }

         class_1892.method_8443(this.field_6882, this.field_6877, this.field_6887, this.field_6889);
         if (!this.method_5591()) {
            class_1343 var4 = this.field_6887.method_18439(this.field_6877);
            this.field_6877.method_26905().method_12879(var4.field_7336, var4.field_7333, var4.field_7334, this.field_6871);
         }
      }
   }

   @Override
   public void method_5592() {
      if (this.field_6887 != null) {
         class_1343 var3 = this.method_5596();
         float var4 = this.field_6877.method_37086();
         float var5 = !(var4 > 0.75F) ? 0.75F - var4 / 2.0F : var4 / 2.0F;
         class_1343 var6 = this.field_6877.method_37098();
         if (Math.abs(var6.field_7336) > 0.2 || Math.abs(var6.field_7334) > 0.2) {
            var5 = (float)((double)var5 * var6.method_6217() * 6.0);
         }

         byte var7 = 6;
         class_1343 var8 = class_1343.method_6200(this.field_6887.method_18449());
         if (Math.abs(this.field_6877.getPosX() - var8.field_7336) < (double)var5
            && Math.abs(this.field_6877.getPosZ() - var8.field_7334) < (double)var5
            && Math.abs(this.field_6877.method_37309() - var8.field_7333) < (double)(var5 * 2.0F)) {
            this.field_6887.method_18434();
         }

         for (int var9 = Math.min(this.field_6887.method_18429() + 6, this.field_6887.method_18437() - 1); var9 > this.field_6887.method_18429(); var9--) {
            var8 = this.field_6887.method_18432(this.field_6877, var9);
            if (!(var8.method_6204(var3) > 36.0) && this.method_5599(var3, var8, 0, 0, 0)) {
               this.field_6887.method_18443(var9);
               break;
            }
         }

         this.method_5619(var3);
      }
   }

   @Override
   public void method_5619(class_1343 var1) {
      if (this.field_6875 - this.field_6884 > 100) {
         if (var1.method_6204(this.field_6885) < 2.25) {
            this.method_5620();
         }

         this.field_6884 = this.field_6875;
         this.field_6885 = var1;
      }

      if (this.field_6887 != null && !this.field_6887.method_18436()) {
         BlockPos var4 = this.field_6887.method_18449();
         if (!var4.equals(this.field_6879)) {
            this.field_6879 = var4;
            double var5 = var1.method_6195(class_1343.method_6216(this.field_6879));
            this.field_6876 = !(this.field_6877.method_26423() > 0.0F) ? 0.0 : var5 / (double)this.field_6877.method_26423() * 100.0;
         } else {
            this.field_6886 = this.field_6886 + (Util.getMeasuringTimeMs() - this.field_6870);
         }

         if (this.field_6876 > 0.0 && (double)this.field_6886 > this.field_6876 * 2.0) {
            this.field_6879 = Vector3i.field_13228;
            this.field_6886 = 0L;
            this.field_6876 = 0.0;
            this.method_5620();
         }

         this.field_6870 = Util.getMeasuringTimeMs();
      }
   }

   @Override
   public boolean method_5599(class_1343 var1, class_1343 var2, int var3, int var4, int var5) {
      class_1343 var8 = new class_1343(var2.field_7336, var2.field_7333 + (double)this.field_6877.method_37074() * 0.5, var2.field_7334);
      return this.field_6882.method_28265(new class_972(var1, var8, class_3132.field_15553, class_9583.field_48747, this.field_6877)).method_33990()
         == class_1430.field_7721;
   }

   @Override
   public boolean method_5609(BlockPos var1) {
      return !this.field_6882.method_28262(var1).method_8321(this.field_6882, var1);
   }

   @Override
   public void method_5611(boolean var1) {
   }
}
