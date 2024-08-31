package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;

import java.util.function.Predicate;

public class Class121 implements Predicate<LivingEntity> {
   private static String[] field431;
   private final Class1105 field432;

   public Class121(Class1105 var1) {
      this.field432 = var1;
   }

   public boolean test(LivingEntity var1) {
      return (var1 instanceof PlayerEntity || var1 instanceof Class1055) && var1.getDistanceSq(this.field432) > 9.0;
   }
}
