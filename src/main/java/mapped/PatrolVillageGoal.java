package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.SectionPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.List;
import java.util.stream.Collectors;

public class PatrolVillageGoal extends Class2736 {
   private static String[] field17257;

   public PatrolVillageGoal(CreatureEntity var1, double var2) {
      super(var1, var2, 240, false);
   }

   @Nullable
   @Override
   public Vector3d method10943() {
      float var3 = this.field17258.world.rand.nextFloat();
      if (!(this.field17258.world.rand.nextFloat() < 0.3F)) {
         Vector3d var4;
         if (!(var3 < 0.7F)) {
            var4 = this.method10949();
            if (var4 == null) {
               var4 = this.method10948();
            }
         } else {
            var4 = this.method10948();
            if (var4 == null) {
               var4 = this.method10949();
            }
         }

         return var4 != null ? var4 : this.method10947();
      } else {
         return this.method10947();
      }
   }

   @Nullable
   private Vector3d method10947() {
      return Class8037.method27583(this.field17258, 10, 7);
   }

   @Nullable
   private Vector3d method10948() {
      ServerWorld var3 = (ServerWorld)this.field17258.world;
      List var4 = var3.<VillagerEntity>method6771(EntityType.VILLAGER, this.field17258.getBoundingBox().grow(32.0), this::method10952);
      if (!var4.isEmpty()) {
         VillagerEntity var5 = (VillagerEntity)var4.get(this.field17258.world.rand.nextInt(var4.size()));
         Vector3d var6 = var5.getPositionVec();
         return Class8037.method27586(this.field17258, 10, 7, var6);
      } else {
         return null;
      }
   }

   @Nullable
   private Vector3d method10949() {
      SectionPos var3 = this.method10950();
      if (var3 != null) {
         BlockPos var4 = this.func_234029_a_(var3);
         return var4 != null ? Class8037.method27586(this.field17258, 10, 7, Vector3d.method11330(var4)) : null;
      } else {
         return null;
      }
   }

   @Nullable
   private SectionPos method10950() {
      ServerWorld var3 = (ServerWorld)this.field17258.world;
      List var4 = SectionPos.getAllInBox(SectionPos.method8392(this.field17258), 2).filter(var1 -> var3.method6955(var1) == 0).collect(Collectors.toList());
      return !var4.isEmpty() ? (SectionPos)var4.get(var3.rand.nextInt(var4.size())) : null;
   }

   @Nullable
   private BlockPos func_234029_a_(SectionPos var1) {
      ServerWorld var4 = (ServerWorld)this.field17258.world;
      PointOfInterestManager var5 = var4.getPointOfInterestManager();
      List var6 = var5.func_219146_b(var0 -> true, var1.getCenter(), 8, PointOfInterestManager.Status.IS_OCCUPIED).<BlockPos>map(PointOfInterest::getPos).collect(Collectors.toList());
      return !var6.isEmpty() ? (BlockPos)var6.get(var4.rand.nextInt(var6.size())) : null;
   }

   private boolean method10952(VillagerEntity var1) {
      return var1.method4717(this.field17258.world.getGameTime());
   }
}
