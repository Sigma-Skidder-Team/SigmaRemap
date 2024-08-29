package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.util.ActionResultType;

public class Class917 extends AbstractMinecartEntity {
   private static String[] field5231;

   public Class917(EntityType<?> var1, World var2) {
      super(var1, var2);
   }

   public Class917(World var1, double var2, double var4, double var6) {
      super(EntityType.field41050, var1, var2, var4, var6);
   }

   @Override
   public ActionResultType method3304(PlayerEntity var1, Hand var2) {
      if (!var1.method2851()) {
         if (!this.isBeingRidden()) {
            if (this.world.isRemote) {
               return ActionResultType.field14818;
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
            this.method3141();
         }
      }
   }

   @Override
   public MinecartType getMinecartType() {
      return MinecartType.MINECART;
   }
}
