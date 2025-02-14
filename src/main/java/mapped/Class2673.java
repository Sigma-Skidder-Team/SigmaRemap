package mapped;

import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.Difficulty;

public class Class2673 extends Class2672 {
   private static String[] field17060;
   private int field17061;
   public final IllusionerEntity field17062;

   public Class2673(IllusionerEntity var1) {
      super(var1);
      this.field17062 = var1;
   }

   @Override
   public boolean method10803() {
      if (super.method10803()) {
         if (this.field17062.getAttackTarget() != null) {
            return this.field17062.getAttackTarget().getEntityId() != this.field17061
               ? this.field17062.world.method6807(this.field17062.getPosition()).method38329((float) Difficulty.NORMAL.ordinal())
               : false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public void method10804() {
      super.method10804();
      this.field17061 = this.field17062.getAttackTarget().getEntityId();
   }

   @Override
   public int method10892() {
      return 20;
   }

   @Override
   public int method10893() {
      return 180;
   }

   @Override
   public void method10890() {
      this.field17062.getAttackTarget().addPotionEffect(new EffectInstance(Effects.BLINDNESS, 400));
   }

   @Override
   public SoundEvent method10894() {
      return SoundEvents.field26696;
   }

   @Override
   public Class2031 method10895() {
      return Class2031.field13186;
   }
}
