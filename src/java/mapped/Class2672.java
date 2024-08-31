package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.SoundEvent;

import javax.annotation.Nullable;

public abstract class Class2672 extends Class2595 {
   public int field17057;
   public int field17058;
   public final Class1031 field17059;

   public Class2672(Class1031 var1) {
      this.field17059 = var1;
   }

   @Override
   public boolean method10803() {
      LivingEntity var3 = this.field17059.method4232();
      if (var3 == null || !var3.isAlive()) {
         return false;
      } else {
         return !this.field17059.method4594() ? this.field17059.ticksExisted >= this.field17058 : false;
      }
   }

   @Override
   public boolean method10806() {
      LivingEntity var3 = this.field17059.method4232();
      return var3 != null && var3.isAlive() && this.field17057 > 0;
   }

   @Override
   public void method10804() {
      this.field17057 = this.method10891();
      this.field17059.field5734 = this.method10892();
      this.field17058 = this.field17059.ticksExisted + this.method10893();
      SoundEvent var3 = this.method10894();
      if (var3 != null) {
         this.field17059.method2863(var3, 1.0F, 1.0F);
      }

      this.field17059.method4595(this.method10895());
   }

   @Override
   public void method10805() {
      this.field17057--;
      if (this.field17057 == 0) {
         this.method10890();
         this.field17059.method2863(this.field17059.method4598(), 1.0F, 1.0F);
      }
   }

   public abstract void method10890();

   public int method10891() {
      return 20;
   }

   public abstract int method10892();

   public abstract int method10893();

   @Nullable
   public abstract SoundEvent method10894();

   public abstract Class2031 method10895();
}
