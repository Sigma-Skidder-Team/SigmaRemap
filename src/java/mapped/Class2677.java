package mapped;

import net.minecraft.potion.EffectInstance;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

import javax.annotation.Nullable;

public class Class2677 extends Class2672 {
   private static String[] field17071;
   public final IllusionerEntity field17072;

   Class2677(IllusionerEntity var1) {
      super(var1);
      this.field17072 = var1;
   }

   @Override
   public boolean method10803() {
      return super.method10803() ? !this.field17072.isPotionActive(Effects.INVISIBILITY) : false;
   }

   @Override
   public int method10892() {
      return 20;
   }

   @Override
   public int method10893() {
      return 340;
   }

   @Override
   public void method10890() {
      this.field17072.addPotionEffect(new EffectInstance(Effects.INVISIBILITY, 1200));
   }

   @Nullable
   @Override
   public SoundEvent method10894() {
      return SoundEvents.field26697;
   }

   @Override
   public Class2031 method10895() {
      return Class2031.field13185;
   }
}
