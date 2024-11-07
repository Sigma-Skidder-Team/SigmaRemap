package mapped;

import com.google.common.collect.Lists;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.AxisAlignedBB;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface Class1682 {
   List<Entity> getEntitiesInAABBexcluding(Entity var1, AxisAlignedBB var2, Predicate<? super Entity> var3);

   <T extends Entity> List<T> getEntitiesInAABBexcluding(Class<? extends T> var1, AxisAlignedBB var2, Predicate<? super T> var3);

   default <T extends Entity> List<T> method6773(Class<? extends T> var1, AxisAlignedBB var2, Predicate<? super T> var3) {
      return this.<T>getEntitiesInAABBexcluding(var1, var2, var3);
   }

   List<? extends PlayerEntity> method6870();

   default List<Entity> method7181(Entity var1, AxisAlignedBB var2) {
      return this.getEntitiesInAABBexcluding(var1, var2, EntityPredicates.field34763);
   }

   default boolean method7048(Entity var1, VoxelShape var2) {
      if (var2.isEmpty()) {
         return true;
      } else {
         for (Entity var6 : this.method7181(var1, var2.getBoundingBox())) {
            if (!var6.removed
               && var6.preventEntitySpawning
               && (var1 == null || !var6.method3416(var1))
               && VoxelShapes.compare(var2, VoxelShapes.create(var6.getBoundingBox()), IBooleanFunction.AND)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends Entity> List<T> getEntitiesWithinAABB(Class<? extends T> var1, AxisAlignedBB var2) {
      return this.<T>getEntitiesInAABBexcluding(var1, var2, EntityPredicates.field34763);
   }

   default <T extends Entity> List<T> method7183(Class<? extends T> var1, AxisAlignedBB var2) {
      return this.<T>method6773(var1, var2, EntityPredicates.field34763);
   }

   default Stream<VoxelShape> func_230318_c_(Entity var1, AxisAlignedBB var2, Predicate<Entity> var3) {
      if (!(var2.getAverageEdgeLength() < 1.0E-7)) {
         AxisAlignedBB var6 = var2.grow(1.0E-7);
         return this.getEntitiesInAABBexcluding(var1, var6, var3.and(var2x -> {
            if (var2x.getBoundingBox().method19670(var6)) {
               if (var1 != null) {
                  if (var1.canCollide(var2x)) {
                     return true;
                  }
               } else if (var2x.method3306()) {
                  return true;
               }
            }

            return false;
         })).stream().<AxisAlignedBB>map(Entity::getBoundingBox).<VoxelShape>map(VoxelShapes::create);
      } else {
         return Stream.<VoxelShape>empty();
      }
   }

   @Nullable
   default PlayerEntity method7184(double var1, double var3, double var5, double var7, Predicate<Entity> var9) {
      double var12 = -1.0;
      PlayerEntity var14 = null;

      for (PlayerEntity var16 : this.method6870()) {
         if (var9 == null || var9.test(var16)) {
            double var17 = var16.getDistanceSq(var1, var3, var5);
            if ((var7 < 0.0 || var17 < var7 * var7) && (var12 == -1.0 || var17 < var12)) {
               var12 = var17;
               var14 = var16;
            }
         }
      }

      return var14;
   }

   @Nullable
   default PlayerEntity method7185(Entity var1, double var2) {
      return this.method7186(var1.getPosX(), var1.getPosY(), var1.getPosZ(), var2, false);
   }

   @Nullable
   default PlayerEntity method7186(double var1, double var3, double var5, double var7, boolean var9) {
      Predicate var12 = !var9 ? EntityPredicates.field34763 : EntityPredicates.field34761;
      return this.method7184(var1, var3, var5, var7, var12);
   }

   default boolean method7187(double var1, double var3, double var5, double var7) {
      for (PlayerEntity var12 : this.method6870()) {
         if (EntityPredicates.field34763.test(var12) && EntityPredicates.field34758.test(var12)) {
            double var13 = var12.getDistanceSq(var1, var3, var5);
            if (var7 < 0.0 || var13 < var7 * var7) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default PlayerEntity method7188(Class8522 var1, LivingEntity var2) {
      return this.<PlayerEntity>method7193(this.method6870(), var1, var2, var2.getPosX(), var2.getPosY(), var2.getPosZ());
   }

   @Nullable
   default PlayerEntity method7189(Class8522 var1, LivingEntity var2, double var3, double var5, double var7) {
      return this.<PlayerEntity>method7193(this.method6870(), var1, var2, var3, var5, var7);
   }

   @Nullable
   default PlayerEntity method7190(Class8522 var1, double var2, double var4, double var6) {
      return this.<PlayerEntity>method7193(this.method6870(), var1, (LivingEntity)null, var2, var4, var6);
   }

   @Nullable
   default <T extends LivingEntity> T method7191(Class<? extends T> var1, Class8522 var2, LivingEntity var3, double var4, double var6, double var8, AxisAlignedBB var10) {
      return this.<T>method7193(this.getEntitiesInAABBexcluding(var1, var10, (Predicate<? super T>)null), var2, var3, var4, var6, var8);
   }

   @Nullable
   default <T extends LivingEntity> T method7192(Class<? extends T> var1, Class8522 var2, LivingEntity var3, double var4, double var6, double var8, AxisAlignedBB var10) {
      return this.<T>method7193(this.method6773(var1, var10, (Predicate<? super T>)null), var2, var3, var4, var6, var8);
   }

   @Nullable
   default <T extends LivingEntity> T method7193(List<? extends T> var1, Class8522 var2, LivingEntity var3, double var4, double var6, double var8) {
      double var12 = -1.0;
      LivingEntity var14 = null;

      for (LivingEntity var16 : var1) {
         if (var2.canTarget(var3, var16)) {
            double var17 = var16.getDistanceSq(var4, var6, var8);
            if (var12 == -1.0 || var17 < var12) {
               var12 = var17;
               var14 = var16;
            }
         }
      }

      return (T)var14;
   }

   default List<PlayerEntity> method7194(Class8522 var1, LivingEntity var2, AxisAlignedBB var3) {
      ArrayList var6 = Lists.newArrayList();

      for (PlayerEntity var8 : this.method6870()) {
         if (var3.method19674(var8.getPosX(), var8.getPosY(), var8.getPosZ()) && var1.canTarget(var2, var8)) {
            var6.add(var8);
         }
      }

      return var6;
   }

   default <T extends LivingEntity> List<T> method7195(Class<? extends T> var1, Class8522 var2, LivingEntity var3, AxisAlignedBB var4) {
      List<LivingEntity> var7 = this.getEntitiesInAABBexcluding(var1, var4, null);
      ArrayList var8 = Lists.newArrayList();

      for (LivingEntity var10 : var7) {
         if (var2.canTarget(var3, var10)) {
            var8.add(var10);
         }
      }

      return var8;
   }

   @Nullable
   default PlayerEntity method7196(UUID var1) {
      for (int var4 = 0; var4 < this.method6870().size(); var4++) {
         PlayerEntity var5 = this.method6870().get(var4);
         if (var1.equals(var5.getUniqueID())) {
            return var5;
         }
      }

      return null;
   }
}
