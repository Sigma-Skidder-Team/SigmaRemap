package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;

import java.util.EnumSet;

public class Class2620 extends Class2595 {
   private static String[] field16904;
   private final SlimeEntity field16905;
   private int field16906;

   public Class2620(SlimeEntity var1) {
      this.field16905 = var1;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14658));
   }

   @Override
   public boolean method10803() {
      LivingEntity var3 = this.field16905.getAttackTarget();
      if (var3 != null) {
         if (!var3.isAlive()) {
            return false;
         } else {
            return var3 instanceof PlayerEntity && ((PlayerEntity)var3).abilities.disableDamage ? false : this.field16905.method4228() instanceof Class6841;
         }
      } else {
         return false;
      }
   }

   @Override
   public void startExecuting() {
      this.field16906 = 300;
      super.startExecuting();
   }

   @Override
   public boolean method10806() {
      LivingEntity var3 = this.field16905.getAttackTarget();
      if (var3 != null) {
         if (var3.isAlive()) {
            return var3 instanceof PlayerEntity && ((PlayerEntity)var3).abilities.disableDamage ? false : --this.field16906 > 0;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public void method10805() {
      this.field16905.method4262(this.field16905.getAttackTarget(), 10.0F, 10.0F);
      ((Class6841)this.field16905.method4228()).method20822(this.field16905.rotationYaw, this.field16905.method5325());
   }
}
