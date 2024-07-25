package remapped;

import java.util.EnumSet;

public class class_1837 extends class_3599 {
   private final MobEntity field_9305;
   private final class_2354 field_9311;
   private LivingEntity field_9303;
   private int field_9302 = -1;
   private final double field_9308;
   private int field_9307;
   private final int field_9306;
   private final int field_9310;
   private final float field_9309;
   private final float field_9304;

   public class_1837(class_2354 var1, double var2, int var4, float var5) {
      this(var1, var2, var4, var4, var5);
   }

   public class_1837(class_2354 var1, double var2, int var4, int var5, float var6) {
      if (var1 instanceof LivingEntity) {
         this.field_9311 = var1;
         this.field_9305 = (MobEntity)var1;
         this.field_9308 = var2;
         this.field_9306 = var4;
         this.field_9310 = var5;
         this.field_9309 = var6;
         this.field_9304 = var6 * var6;
         this.method_16800(EnumSet.<Flag>of(Flag.MOVE, Flag.LOOK));
      } else {
         throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
      }
   }

   @Override
   public boolean method_16795() {
      LivingEntity var3 = this.field_9305.getAttackTarget();
      if (var3 != null && var3.isAlive()) {
         this.field_9303 = var3;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean method_16799() {
      return this.method_16795() || !this.field_9305.method_26927().method_5591();
   }

   @Override
   public void method_16793() {
      this.field_9303 = null;
      this.field_9307 = 0;
      this.field_9302 = -1;
   }

   @Override
   public void method_16794() {
      double var3 = this.field_9305.method_37273(this.field_9303.getPosX(), this.field_9303.method_37309(), this.field_9303.getPosZ());
      boolean var5 = this.field_9305.method_26928().method_36736(this.field_9303);
      if (!var5) {
         this.field_9307 = 0;
      } else {
         this.field_9307++;
      }

      if (!(var3 > (double)this.field_9304) && this.field_9307 >= 5) {
         this.field_9305.method_26927().method_5620();
      } else {
         this.field_9305.method_26927().method_5616(this.field_9303, this.field_9308);
      }

      this.field_9305.method_26865().method_17240(this.field_9303, 30.0F, 30.0F);
      if (--this.field_9302 != 0) {
         if (this.field_9302 < 0) {
            float var6 = MathHelper.sqrt(var3) / this.field_9309;
            this.field_9302 = MathHelper.floor(var6 * (float)(this.field_9310 - this.field_9306) + (float)this.field_9306);
         }
      } else {
         if (!var5) {
            return;
         }

         float var8 = MathHelper.sqrt(var3) / this.field_9309;
         float var7 = MathHelper.clamp(var8, 0.1F, 1.0F);
         this.field_9311.method_10805(this.field_9303, var7);
         this.field_9302 = MathHelper.floor(var8 * (float)(this.field_9310 - this.field_9306) + (float)this.field_9306);
      }
   }
}
