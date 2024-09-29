package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;

import java.util.EnumSet;

public class Class2598 extends Class2595 {
   private final MobEntity field16826;
   private final Class1022 field16827;
   private LivingEntity field16828;
   private int field16829 = -1;
   private final double field16830;
   private int field16831;
   private final int field16832;
   private final int field16833;
   private final float field16834;
   private final float field16835;

   public Class2598(Class1022 var1, double var2, int var4, float var5) {
      this(var1, var2, var4, var4, var5);
   }

   public Class2598(Class1022 var1, double var2, int var4, int var5, float var6) {
      if (var1 instanceof LivingEntity) {
         this.field16827 = var1;
         this.field16826 = (MobEntity)var1;
         this.field16830 = var2;
         this.field16832 = var4;
         this.field16833 = var5;
         this.field16834 = var6;
         this.field16835 = var6 * var6;
         this.method10809(EnumSet.<Class2240>of(Class2240.field14657, Class2240.field14658));
      } else {
         throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
      }
   }

   @Override
   public boolean method10803() {
      LivingEntity var3 = this.field16826.method4232();
      if (var3 != null && var3.isAlive()) {
         this.field16828 = var3;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean method10806() {
      return this.method10803() || !this.field16826.method4230().method21664();
   }

   @Override
   public void method10807() {
      this.field16828 = null;
      this.field16831 = 0;
      this.field16829 = -1;
   }

   @Override
   public void method10805() {
      double var3 = this.field16826.getDistanceNearest(this.field16828.getPosX(), this.field16828.getPosY(), this.field16828.getPosZ());
      boolean var5 = this.field16826.method4231().method35460(this.field16828);
      if (!var5) {
         this.field16831 = 0;
      } else {
         this.field16831++;
      }

      if (!(var3 > (double)this.field16835) && this.field16831 >= 5) {
         this.field16826.method4230().method21666();
      } else {
         this.field16826.method4230().method21655(this.field16828, this.field16830);
      }

      this.field16826.method4227().method28040(this.field16828, 30.0F, 30.0F);
      if (--this.field16829 != 0) {
         if (this.field16829 < 0) {
            float var6 = MathHelper.sqrt(var3) / this.field16834;
            this.field16829 = MathHelper.floor(var6 * (float)(this.field16833 - this.field16832) + (float)this.field16832);
         }
      } else {
         if (!var5) {
            return;
         }

         float var8 = MathHelper.sqrt(var3) / this.field16834;
         float var7 = MathHelper.clamp(var8, 0.1F, 1.0F);
         this.field16827.method4530(this.field16828, var7);
         this.field16829 = MathHelper.floor(var8 * (float)(this.field16833 - this.field16832) + (float)this.field16832);
      }
   }
}
