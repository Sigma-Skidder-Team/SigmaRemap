package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.block.BedBlock;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

import java.util.Optional;

public class Class3756 extends Class3676<LivingEntity> {
   private static String[] field19914;
   private long field19915;

   public Class3756() {
      super(ImmutableMap.of(Class8830.field39813, Class2217.field14484, Class8830.field39844, Class2217.field14486));
   }

   @Override
   public boolean method12508(ServerWorld var1, LivingEntity var2) {
      if (var2.isPassenger()) {
         return false;
      } else {
         Brain<?> var5 = var2.getBrain();
         Class9378 var6 = var5.method21410(Class8830.field39813).get();
         if (var1.getDimensionKey() == var6.method35578()) {
            Optional var7 = var5.<Long>method21410(Class8830.field39844);
            if (var7.isPresent()) {
               long var9 = var1.getGameTime() - (Long)var7.get();
               if (var9 > 0L && var9 < 100L) {
                  return false;
               }
            }

            BlockState var8 = var1.getBlockState(var6.method35579());
            return var6.method35579().method8317(var2.getPositionVec(), 2.0)
               && var8.getBlock().isIn(BlockTags.field32770)
               && !var8.<Boolean>get(BedBlock.field18714);
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean method12499(ServerWorld var1, LivingEntity var2, long var3) {
      Optional var7 = var2.getBrain().<Class9378>method21410(Class8830.field39813);
      if (!var7.isPresent()) {
         return false;
      } else {
         BlockPos var8 = ((Class9378)var7.get()).method35579();
         return var2.getBrain().method21430(Activity.field40223)
            && var2.getPosY() > (double)var8.getY() + 0.4
            && var8.method8317(var2.getPositionVec(), 1.14);
      }
   }

   @Override
   public void method12502(ServerWorld var1, LivingEntity var2, long var3) {
      if (var3 > this.field19915) {
         Class3697.method12561(var1, var2, (Class7176)null, (Class7176)null);
         var2.startSleeping(var2.getBrain().<Class9378>method21410(Class8830.field39813).get().method35579());
      }
   }

   @Override
   public boolean method12507(long var1) {
      return false;
   }

   @Override
   public void method12506(ServerWorld var1, LivingEntity var2, long var3) {
      if (var2.isSleeping()) {
         var2.wakeUp();
         this.field19915 = var3 + 40L;
      }
   }
}
