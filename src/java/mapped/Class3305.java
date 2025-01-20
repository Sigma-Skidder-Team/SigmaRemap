package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.BoatEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

import java.util.List;
import java.util.function.Predicate;

public class Class3305 extends Item {
   private static String[] field18810;
   private static final Predicate<Entity> field18811 = EntityPredicates.field34763.and(Entity::canBeCollidedWith);
   private final Class2099 field18812;

   public Class3305(Class2099 var1, Properties var2) {
      super(var2);
      this.field18812 = var1;
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      ItemStack var6 = var2.getHeldItem(var3);
      BlockRayTraceResult var7 = method11735(var1, var2, RayTraceContext.FluidMode.ANY);
      if (var7.getType() == RayTraceResult.Type.MISS) {
         return Class6794.<ItemStack>method20698(var6);
      } else {
         Vector3d var8 = var2.getLook(1.0F);
         double var9 = 5.0;
         List<Entity> var11 = var1.getEntitiesInAABBexcluding(var2, var2.getBoundingBox().expand(var8.scale(5.0)).grow(1.0), field18811);
         if (!var11.isEmpty()) {
            Vector3d var12 = var2.getEyePosition(1.0F);

            for (Entity var14 : var11) {
               AxisAlignedBB var15 = var14.getBoundingBox().grow((double)var14.getCollisionBorderSize());
               if (var15.contains(var12)) {
                  return Class6794.<ItemStack>method20698(var6);
               }
            }
         }

         if (var7.getType() != RayTraceResult.Type.BLOCK) {
            return Class6794.<ItemStack>method20698(var6);
         } else {
            BoatEntity var16 = new BoatEntity(var1, var7.getHitVec().x, var7.getHitVec().y, var7.getHitVec().z);
            var16.method4171(this.field18812);
            var16.rotationYaw = var2.rotationYaw;
            if (var1.hasNoCollisions(var16, var16.getBoundingBox().grow(-0.1))) {
               if (!var1.isRemote) {
                  var1.addEntity(var16);
                  if (!var2.abilities.isCreativeMode) {
                     var6.shrink(1);
                  }
               }

               var2.addStat(Stats.field40098.method172(this));
               return Class6794.<ItemStack>method20700(var6, var1.isRemote());
            } else {
               return Class6794.<ItemStack>method20699(var6);
            }
         }
      }
   }
}
