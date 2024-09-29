package net.minecraft.entity.projectile;

import mapped.*;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class ProjectileHelper {
   private static String[] field43938;

   public static RayTraceResult method36385(Entity var0, Predicate<Entity> var1) {
      Vector3d var4 = var0.getMotion();
      World var5 = var0.world;
      Vector3d var6 = var0.getPositionVec();
      Vector3d var7 = var6.add(var4);
      Object var8 = var5.rayTraceBlocks(new RayTraceContext(var6, var7, RayTraceContext.BlockMode.field14774, RayTraceContext.FluidMode.NONE, var0));
      if (((RayTraceResult)var8).getType() != RayTraceResult.Type.MISS) {
         var7 = ((RayTraceResult)var8).getHitVec();
      }

      EntityRayTraceResult var9 = method36387(var5, var0, var6, var7, var0.getBoundingBox().expand(var0.getMotion()).method19664(1.0), var1);
      if (var9 != null) {
         var8 = var9;
      }

      return (RayTraceResult)var8;
   }

   @Nullable
   public static EntityRayTraceResult rayTraceEntities(Entity var0, Vector3d var1, Vector3d var2, AxisAlignedBB var3, Predicate<Entity> var4, double var5) {
      World var9 = var0.world;
      double var10 = var5;
      Entity var12 = null;
      Vector3d var13 = null;

      for (Entity var15 : var9.getEntitiesInAABBexcluding(var0, var3, var4)) {
         AxisAlignedBB var16 = var15.getBoundingBox().method19664((double)var15.getCollisionBorderSize());
         Optional<Vector3d> var17 = var16.method19680(var1, var2);
         if (!var16.method19673(var1)) {
            if (var17.isPresent()) {
               Vector3d var18 = (Vector3d)var17.get();
               double var19 = var1.squareDistanceTo(var18);
               if (var19 < var10 || var10 == 0.0) {
                  if (var15.method3415() != var0.method3415()) {
                     var12 = var15;
                     var13 = var18;
                     var10 = var19;
                  } else if (var10 == 0.0) {
                     var12 = var15;
                     var13 = var18;
                  }
               }
            }
         } else if (var10 >= 0.0) {
            var12 = var15;
            var13 = var17.orElse(var1);
            var10 = 0.0;
         }
      }

      return var12 != null ? new EntityRayTraceResult(var12, var13) : null;
   }

   @Nullable
   public static EntityRayTraceResult method36387(World var0, Entity var1, Vector3d var2, Vector3d var3, AxisAlignedBB var4, Predicate<Entity> var5) {
      double var8 = Double.MAX_VALUE;
      Entity var10 = null;

      for (Entity var12 : var0.getEntitiesInAABBexcluding(var1, var4, var5)) {
         AxisAlignedBB var13 = var12.getBoundingBox().method19664(0.3F);
         Optional var14 = var13.method19680(var2, var3);
         if (var14.isPresent()) {
            double var15 = var2.squareDistanceTo((Vector3d)var14.get());
            if (var15 < var8) {
               var10 = var12;
               var8 = var15;
            }
         }
      }

      return var10 != null ? new EntityRayTraceResult(var10) : null;
   }

   public static final void method36388(Entity var0, float var1) {
      Vector3d var4 = var0.getMotion();
      if (var4.lengthSquared() != 0.0) {
         float var5 = MathHelper.sqrt(Entity.horizontalMag(var4));
         var0.rotationYaw = (float)(MathHelper.method37814(var4.z, var4.x) * 180.0F / (float)Math.PI) + 90.0F;
         var0.rotationPitch = (float)(MathHelper.method37814((double)var5, var4.y) * 180.0F / (float)Math.PI) - 90.0F;

         while (var0.rotationPitch - var0.prevRotationPitch < -180.0F) {
            var0.prevRotationPitch -= 360.0F;
         }

         while (var0.rotationPitch - var0.prevRotationPitch >= 180.0F) {
            var0.prevRotationPitch += 360.0F;
         }

         while (var0.rotationYaw - var0.prevRotationYaw < -180.0F) {
            var0.prevRotationYaw -= 360.0F;
         }

         while (var0.rotationYaw - var0.prevRotationYaw >= 180.0F) {
            var0.prevRotationYaw += 360.0F;
         }

         var0.rotationPitch = MathHelper.lerp(var1, var0.prevRotationPitch, var0.rotationPitch);
         var0.rotationYaw = MathHelper.lerp(var1, var0.prevRotationYaw, var0.rotationYaw);
      }
   }

   public static Hand method36389(LivingEntity var0, Item var1) {
      return var0.getHeldItemMainhand().getItem() != var1 ? Hand.OFF_HAND : Hand.MAIN_HAND;
   }

   public static AbstractArrowEntity method36390(LivingEntity var0, ItemStack var1, float var2) {
      Class3308 var5 = (Class3308)(!(var1.getItem() instanceof Class3308) ? Items.field37797 : var1.getItem());
      AbstractArrowEntity var6 = var5.method11850(var0.world, var1, var0);
      var6.method3490(var0, var2);
      if (var1.getItem() == Items.field38117 && var6 instanceof Class887) {
         ((Class887)var6).method3497(var1);
      }

      return var6;
   }
}
