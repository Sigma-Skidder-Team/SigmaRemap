package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UpdateBeehiveGoal extends Class2661 {
   public final BeeEntity field17022;

   private UpdateBeehiveGoal(BeeEntity var1) {
      super(var1, null);
      this.field17022 = var1;
   }

   @Override
   public boolean canBeeStart() {
      return BeeEntity.method4492(this.field17022) == 0 && !this.field17022.method4432() && BeeEntity.method4452(this.field17022);
   }

   @Override
   public boolean canBeeContinue() {
      return false;
   }

   @Override
   public void startExecuting() {
      BeeEntity.method4467(this.field17022, 200);
      List<BlockPos> var3 = this.getNearbyFreeHives();
      if (!var3.isEmpty()) {
         for (BlockPos var5 : var3) {
            if (!FindBeehiveGoal.method10879(BeeEntity.method4493(this.field17022), var5)) {
               BeeEntity.method4454(this.field17022, var5);
               return;
            }
         }

         FindBeehiveGoal.method10880(BeeEntity.method4493(this.field17022));
         BeeEntity.method4454(this.field17022, (BlockPos)var3.get(0));
      }
   }

   private List<BlockPos> getNearbyFreeHives() {
      BlockPos var3 = this.field17022.getPosition();
      PointOfInterestManager var4 = ((ServerWorld)this.field17022.world).getPointOfInterestManager();
      Stream<PointOfInterest> var5 = var4.func_219146_b(var0 -> var0 == PointOfInterestType.BEEHIVE || var0 == PointOfInterestType.BEE_NEST, var3, 20, PointOfInterestManager.Status.ANY);
      return var5.map(PointOfInterest::getPos)
         .filter(var1 -> BeeEntity.method4494(this.field17022, var1))
         .sorted(Comparator.comparingDouble(var1 -> var1.distanceSq(var3)))
         .collect(Collectors.<BlockPos>toList());
   }

   // $VF: synthetic method
   public UpdateBeehiveGoal(BeeEntity var1, Class6996 var2) {
      this(var1);
   }
}
