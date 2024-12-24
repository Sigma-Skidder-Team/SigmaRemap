package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;

import java.util.function.Predicate;

public class Class168 implements Predicate<LivingEntity> {
   private static String[] field542;
   public final Class1095 field543;

   public Class168(Class1095 var1) {
      this.field543 = var1;
   }

   public boolean test(LivingEntity var1) {
      if (var1 instanceof Class1095) {
         return false;
      } else if (var1 instanceof Class1089 || var1 instanceof RabbitEntity || var1 instanceof MonsterEntity) {
         return true;
      } else if (var1 instanceof TameableEntity) {
         return !((TameableEntity)var1).method4393();
      } else if (!(var1 instanceof PlayerEntity) || !var1.isSpectator() && !((PlayerEntity)var1).isCreative()) {
         return Class1095.method5163(this.field543, var1.getUniqueID()) ? false : !var1.isSleeping() && !var1.isDiscrete();
      } else {
         return false;
      }
   }
}
