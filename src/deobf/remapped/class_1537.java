package remapped;

import javax.annotation.Nullable;

public class class_1537 extends class_3429 {
   private static String[] field_8140;

   public class_1537(class_6629<? extends class_1537> var1, World var2) {
      super(var1, var2);
   }

   public class_1537(World var1, class_5834 var2) {
      super(class_6629.field_34259, var2, var1);
   }

   public class_1537(World var1, double var2, double var4, double var6) {
      super(class_6629.field_34259, var2, var4, var6, var1);
   }

   @Override
   public class_2451 method_15854() {
      return class_4897.field_24664;
   }

   @Override
   public void method_26163(class_5631 var1) {
      super.method_26163(var1);
      var1.method_25524().method_37181(class_6199.method_28355(this, this.method_26166()), 0.0F);
   }

   @Override
   public void method_26160(class_7474 var1) {
      super.method_26160(var1);
      Entity var4 = this.method_26166();

      for (int var5 = 0; var5 < 32; var5++) {
         this.field_41768
            .method_43361(
               class_3090.field_15356,
               this.method_37302(),
               this.method_37309() + this.field_41717.nextDouble() * 2.0,
               this.method_37156(),
               this.field_41717.nextGaussian(),
               0.0,
               this.field_41717.nextGaussian()
            );
      }

      if (!this.field_41768.field_33055 && !this.field_41751) {
         if (!(var4 instanceof class_9359)) {
            if (var4 != null) {
               var4.method_37254(this.method_37302(), this.method_37309(), this.method_37156());
               var4.field_41706 = 0.0F;
            }
         } else {
            class_9359 var7 = (class_9359)var4;
            if (var7.field_47794.method_9091().method_23493() && var7.field_41768 == this.field_41768 && !var7.method_26507()) {
               if (this.field_41717.nextFloat() < 0.05F && this.field_41768.method_29537().method_1285(class_291.field_1028)) {
                  class_2667 var6 = class_6629.field_34264.method_30484(this.field_41768);
                  var6.method_12025(true);
                  var6.method_37144(var4.method_37302(), var4.method_37309(), var4.method_37156(), var4.field_41701, var4.field_41755);
                  this.field_41768.method_7509(var6);
               }

               if (var4.method_37070()) {
                  var4.method_37390();
               }

               var4.method_37254(this.method_37302(), this.method_37309(), this.method_37156());
               var4.field_41706 = 0.0F;
               var4.method_37181(class_6199.field_31684, 5.0F);
            }
         }

         this.method_37204();
      }
   }

   @Override
   public void method_37123() {
      Entity var3 = this.method_26166();
      if (var3 instanceof class_704 && !var3.method_37330()) {
         this.method_37204();
      } else {
         super.method_37123();
      }
   }

   @Nullable
   @Override
   public Entity method_37326(class_6331 var1) {
      Entity var4 = this.method_26166();
      if (var4 != null && var4.field_41768.method_29545() != var1.method_29545()) {
         this.method_26159((Entity)null);
      }

      return super.method_37326(var1);
   }
}