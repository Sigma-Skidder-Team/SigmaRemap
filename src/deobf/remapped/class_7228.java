package remapped;

import java.util.EnumSet;

public class class_7228 extends class_3599 {
   private static final class_4931 field_37099 = new class_4931().method_22607(10.0).method_22603().method_22601().method_22609().method_22602();
   public final class_4612 field_37092;
   private final double field_37098;
   private double field_37090;
   private double field_37091;
   private double field_37094;
   private double field_37097;
   private double field_37096;
   public PlayerEntity field_37102;
   private int field_37095;
   private boolean field_37101;
   private final class_8137 field_37100;
   private final boolean field_37093;

   public class_7228(class_4612 var1, double var2, class_8137 var4, boolean var5) {
      this(var1, var2, var5, var4);
   }

   public class_7228(class_4612 var1, double var2, boolean var4, class_8137 var5) {
      this.field_37092 = var1;
      this.field_37098 = var2;
      this.field_37100 = var5;
      this.field_37093 = var4;
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9564, class_1891.field_9560));
      if (!(var1.method_26927() instanceof class_8985) && !(var1.method_26927() instanceof class_5133)) {
         throw new IllegalArgumentException("Unsupported mob type for TemptGoal");
      }
   }

   @Override
   public boolean method_16795() {
      if (this.field_37095 <= 0) {
         this.field_37102 = this.field_37092.world.method_25859(field_37099, this.field_37092);
         return this.field_37102 == null ? false : this.method_33088(this.field_37102.method_26446()) || this.method_33088(this.field_37102.method_26568());
      } else {
         this.field_37095--;
         return false;
      }
   }

   public boolean method_33088(ItemStack var1) {
      return this.field_37100.test(var1);
   }

   @Override
   public boolean method_16799() {
      if (this.method_33090()) {
         if (!(this.field_37092.method_37275(this.field_37102) < 36.0)) {
            this.field_37090 = this.field_37102.getPosX();
            this.field_37091 = this.field_37102.method_37309();
            this.field_37094 = this.field_37102.getPosZ();
         } else {
            if (this.field_37102.method_37273(this.field_37090, this.field_37091, this.field_37094) > 0.010000000000000002) {
               return false;
            }

            if (Math.abs((double)this.field_37102.rotationPitch - this.field_37097) > 5.0
               || Math.abs((double)this.field_37102.rotationYaw - this.field_37096) > 5.0) {
               return false;
            }
         }

         this.field_37097 = (double)this.field_37102.rotationPitch;
         this.field_37096 = (double)this.field_37102.rotationYaw;
      }

      return this.method_16795();
   }

   public boolean method_33090() {
      return this.field_37093;
   }

   @Override
   public void method_16796() {
      this.field_37090 = this.field_37102.getPosX();
      this.field_37091 = this.field_37102.method_37309();
      this.field_37094 = this.field_37102.getPosZ();
      this.field_37101 = true;
   }

   @Override
   public void method_16793() {
      this.field_37102 = null;
      this.field_37092.method_26927().method_5620();
      this.field_37095 = 100;
      this.field_37101 = false;
   }

   @Override
   public void method_16794() {
      this.field_37092.method_26865().method_17240(this.field_37102, (float)(this.field_37092.method_26903() + 20), (float)this.field_37092.method_26862());
      if (!(this.field_37092.method_37275(this.field_37102) < 6.25)) {
         this.field_37092.method_26927().method_5616(this.field_37102, this.field_37098);
      } else {
         this.field_37092.method_26927().method_5620();
      }
   }

   public boolean method_33089() {
      return this.field_37101;
   }
}
