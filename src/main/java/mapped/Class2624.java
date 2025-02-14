package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.player.PlayerEntity;

import java.util.EnumSet;

public class Class2624 extends Class2595 {
   private static String[] field16918;
   private final EndermanEntity field16919;
   private LivingEntity field16920;

   public Class2624(EndermanEntity var1) {
      this.field16919 = var1;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14659, Class2240.field14657));
   }

   @Override
   public boolean method10803() {
      this.field16920 = this.field16919.getAttackTarget();
      if (this.field16920 instanceof PlayerEntity) {
         double var3 = this.field16920.getDistanceSq(this.field16919);
         return !(var3 > 256.0) ? EndermanEntity.method4362(this.field16919, (PlayerEntity)this.field16920) : false;
      } else {
         return false;
      }
   }

   @Override
   public void startExecuting() {
      this.field16919.method4230().method21666();
   }

   @Override
   public void method10805() {
      this.field16919.method4227().method28041(this.field16920.getPosX(), this.field16920.getPosYEye(), this.field16920.getPosZ());
   }
}
