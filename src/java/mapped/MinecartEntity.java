package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.item.minecart.AbstractMinecartEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class MinecartEntity extends AbstractMinecartEntity {
   private static String[] field5231;

   public MinecartEntity(EntityType<?> var1, World var2) {
      super(var1, var2);
   }

   public MinecartEntity(World var1, double var2, double var4, double var6) {
      super(EntityType.MINECART, var1, var2, var4, var6);
   }

   @Override
   public ActionResultType processInitialInteract(PlayerEntity var1, Hand var2) {
      if (!var1.method2851()) {
         if (!this.isBeingRidden()) {
            if (this.world.isRemote) {
               return ActionResultType.SUCCESS;
            } else {
               return !var1.method3311(this) ? ActionResultType.field14820 : ActionResultType.field14819;
            }
         } else {
            return ActionResultType.field14820;
         }
      } else {
         return ActionResultType.field14820;
      }
   }

   @Override
   public void method3589(int var1, int var2, int var3, boolean var4) {
      if (var4) {
         if (this.isBeingRidden()) {
            this.removePassengers();
         }

         if (this.method3599() == 0) {
            this.method3600(-this.method3601());
            this.method3598(10);
            this.method3596(50.0F);
            this.markVelocityChanged();
         }
      }
   }

   @Override
   public MinecartType getMinecartType() {
      return MinecartType.MINECART;
   }
}
