package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;

import java.util.Comparator;
import java.util.List;

public class Class2690 extends Class2595 {
   private static String[] field17119;
   private final Class8522 field17120;
   private int field17121;
   public final Class1110 field17122;

   public Class2690(Class1110 var1) {
      this.field17122 = var1;
      this.field17120 = new Class8522().method30203(64.0);
      this.field17121 = 20;
   }

   @Override
   public boolean method10803() {
      if (this.field17121 > 0) {
         this.field17121--;
         return false;
      } else {
         this.field17121 = 60;
         List<PlayerEntity> var3 = this.field17122.world.method7194(this.field17120, this.field17122, this.field17122.getBoundingBox().method19663(16.0, 64.0, 16.0));
         if (!var3.isEmpty()) {
            var3.sort(Comparator.<Entity, Double>comparing(Entity::getPosY).reversed());

            for (PlayerEntity var5 : var3) {
               if (this.field17122.canAttack(var5, Class8522.field38240)) {
                  this.field17122.method4233(var5);
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   public boolean method10806() {
      LivingEntity var3 = this.field17122.method4232();
      return var3 == null ? false : this.field17122.canAttack(var3, Class8522.field38240);
   }
}
