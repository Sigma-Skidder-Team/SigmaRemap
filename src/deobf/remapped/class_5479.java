package remapped;

import java.util.EnumSet;

public class class_5479<T extends MonsterEntity & class_2354> extends class_3599 {
   private static String[] field_27912;
   private final T field_27913;
   private final double field_27911;
   private int field_27915;
   private final float field_27908;
   private int field_27914 = -1;
   private int field_27907;
   private boolean field_27910;
   private boolean field_27916;
   private int field_27909 = -1;

   public class_5479(T var1, double var2, int var4, float var5) {
      this.field_27913 = (T)var1;
      this.field_27911 = var2;
      this.field_27915 = var4;
      this.field_27908 = var5 * var5;
      this.method_16800(EnumSet.<Flag>of(Flag.MOVE, Flag.LOOK));
   }

   public void method_24899(int var1) {
      this.field_27915 = var1;
   }

   @Override
   public boolean method_16795() {
      return this.field_27913.getAttackTarget() != null ? this.method_24898() : false;
   }

   public boolean method_24898() {
      return this.field_27913.method_26443(class_4897.field_25206);
   }

   @Override
   public boolean method_16799() {
      return (this.method_16795() || !this.field_27913.method_26927().method_5591()) && this.method_24898();
   }

   @Override
   public void method_16796() {
      super.method_16796();
      this.field_27913.method_26891(true);
   }

   @Override
   public void method_16793() {
      super.method_16793();
      this.field_27913.method_26891(false);
      this.field_27907 = 0;
      this.field_27914 = -1;
      this.field_27913.method_26529();
   }

   @Override
   public void method_16794() {
      LivingEntity var3 = this.field_27913.getAttackTarget();
      if (var3 != null) {
         double var4 = this.field_27913.method_37273(var3.getPosX(), var3.method_37309(), var3.getPosZ());
         boolean var6 = this.field_27913.method_26928().method_36736(var3);
         boolean var7 = this.field_27907 > 0;
         if (var6 != var7) {
            this.field_27907 = 0;
         }

         if (!var6) {
            this.field_27907--;
         } else {
            this.field_27907++;
         }

         if (!(var4 > (double)this.field_27908) && this.field_27907 >= 20) {
            this.field_27913.method_26927().method_5620();
            this.field_27909++;
         } else {
            this.field_27913.method_26927().method_5616(var3, this.field_27911);
            this.field_27909 = -1;
         }

         if (this.field_27909 >= 20) {
            if ((double)this.field_27913.method_26594().nextFloat() < 0.3) {
               this.field_27910 = !this.field_27910;
            }

            if ((double)this.field_27913.method_26594().nextFloat() < 0.3) {
               this.field_27916 = !this.field_27916;
            }

            this.field_27909 = 0;
         }

         if (this.field_27909 <= -1) {
            this.field_27913.method_26865().method_17240(var3, 30.0F, 30.0F);
         } else {
            if (!(var4 > (double)(this.field_27908 * 0.75F))) {
               if (var4 < (double)(this.field_27908 * 0.25F)) {
                  this.field_27916 = true;
               }
            } else {
               this.field_27916 = false;
            }

            this.field_27913.method_26905().method_12884(!this.field_27916 ? 0.5F : -0.5F, !this.field_27910 ? -0.5F : 0.5F);
            this.field_27913.method_26914(var3, 30.0F, 30.0F);
         }

         if (!this.field_27913.method_26554()) {
            if (--this.field_27914 <= 0 && this.field_27907 >= -60) {
               this.field_27913.method_26462(class_8462.method_38934(this.field_27913, class_4897.field_25206));
            }
         } else if (!var6 && this.field_27907 < -60) {
            this.field_27913.method_26529();
         } else if (var6) {
            int var8 = this.field_27913.method_26613();
            if (var8 >= 20) {
               this.field_27913.method_26529();
               this.field_27913.method_10805(var3, class_2100.method_9852(var8));
               this.field_27914 = this.field_27915;
            }
         }
      }
   }
}
