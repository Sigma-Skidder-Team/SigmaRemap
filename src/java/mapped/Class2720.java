package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;

import java.util.function.Predicate;

public class Class2720 extends Class2709<PlayerEntity> {
   private static String[] field17187;
   public final Class1096 field17206;

   public Class2720(Class1096 var1) {
      super(var1, PlayerEntity.class, 20, true, true, (Predicate<LivingEntity>)null);
      this.field17206 = var1;
   }

   @Override
   public boolean method10803() {
      if (this.field17206.method3005()) {
         return false;
      } else {
         if (super.method10803()) {
            for (Class1096 var4 : this.field17206.world.<Class1096>method7182(Class1096.class, this.field17206.getBoundingBox().method19663(8.0, 4.0, 8.0))) {
               if (var4.method3005()) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   public double method10914() {
      return super.method10914() * 0.5;
   }
}
