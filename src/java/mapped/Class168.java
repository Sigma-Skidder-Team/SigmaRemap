package mapped;

import net.minecraft.entity.LivingEntity;
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
      } else if (var1 instanceof Class1089 || var1 instanceof Class1094 || var1 instanceof Class1009) {
         return true;
      } else if (var1 instanceof Class1013) {
         return !((Class1013)var1).method4393();
      } else if (!(var1 instanceof PlayerEntity) || !var1.isSpectator() && !((PlayerEntity)var1).isCreative()) {
         return Class1095.method5163(this.field543, var1.getUniqueID()) ? false : !var1.isSleeping() && !var1.method3334();
      } else {
         return false;
      }
   }
}
