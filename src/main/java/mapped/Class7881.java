package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Class7881 extends Sensor<LivingEntity> {
   private static String[] field33824;

   @Override
   public Set<MemoryModuleType<?>> method26424() {
      return ImmutableSet.of(
         MemoryModuleType.field39819,
         MemoryModuleType.field39818,
         MemoryModuleType.field39848,
         MemoryModuleType.field39860,
         MemoryModuleType.field39868,
         MemoryModuleType.field39858,
         new MemoryModuleType[]{MemoryModuleType.field39859, MemoryModuleType.field39862, MemoryModuleType.field39861, MemoryModuleType.field39866, MemoryModuleType.field39867, MemoryModuleType.field39870}
      );
   }

   @Override
   public void method26425(ServerWorld var1, LivingEntity var2) {
      Brain<?> var5 = var2.getBrain();
      var5.method21408(MemoryModuleType.field39870, method26426(var1, var2));
      Optional var6 = Optional.empty();
      Optional var7 = Optional.empty();
      Optional var8 = Optional.empty();
      Optional var9 = Optional.empty();
      Optional var10 = Optional.empty();
      Optional var11 = Optional.empty();
      Optional var12 = Optional.empty();
      int var13 = 0;
      ArrayList var14 = Lists.newArrayList();
      ArrayList var15 = Lists.newArrayList();

      for (LivingEntity var17 : var5.<List<LivingEntity>>getMemory(MemoryModuleType.field39819).orElse(ImmutableList.of())) {
         if (!(var17 instanceof HoglinEntity)) {
            if (!(var17 instanceof PiglinBruteEntity)) {
               if (!(var17 instanceof PiglinEntity)) {
                  if (!(var17 instanceof PlayerEntity)) {
                     if (var6.isPresent() || !(var17 instanceof WitherSkeletonEntity) && !(var17 instanceof WitherEntity)) {
                        if (!var10.isPresent() && Class4388.method13880(var17.getType())) {
                           var10 = Optional.<LivingEntity>of(var17);
                        }
                     } else {
                        var6 = Optional.<LivingEntity>of((MobEntity)var17);
                     }
                  } else {
                     PlayerEntity var22 = (PlayerEntity)var17;
                     if (!var11.isPresent() && EntityPredicates.field34762.test(var17) && !Class4388.method13843(var22)) {
                        var11 = Optional.<PlayerEntity>of(var22);
                     }

                     if (!var12.isPresent() && !var22.isSpectator() && Class4388.method13875(var22)) {
                        var12 = Optional.<PlayerEntity>of(var22);
                     }
                  }
               } else {
                  PiglinEntity var21 = (PiglinEntity)var17;
                  if (var21.isChild() && !var9.isPresent()) {
                     var9 = Optional.<PiglinEntity>of(var21);
                  } else if (var21.func_242337_eM()) {
                     var14.add(var21);
                  }
               }
            } else {
               var14.add((PiglinBruteEntity)var17);
            }
         } else {
            HoglinEntity var18 = (HoglinEntity)var17;
            if (var18.isChild() && !var8.isPresent()) {
               var8 = Optional.<HoglinEntity>of(var18);
            } else if (var18.method5084()) {
               var13++;
               if (!var7.isPresent() && var18.method5089()) {
                  var7 = Optional.<HoglinEntity>of(var18);
               }
            }
         }
      }

      for (LivingEntity var20 : var5.<List<LivingEntity>>getMemory(MemoryModuleType.field39818).orElse(ImmutableList.of())) {
         if (var20 instanceof AbstractPiglinEntity && ((AbstractPiglinEntity)var20).func_242337_eM()) {
            var15.add((AbstractPiglinEntity)var20);
         }
      }

      var5.method21408(MemoryModuleType.field39848, var6);
      var5.method21408(MemoryModuleType.field39858, var7);
      var5.method21408(MemoryModuleType.field39859, var8);
      var5.method21408(MemoryModuleType.field39865, var10);
      var5.method21408(MemoryModuleType.field39860, var11);
      var5.method21408(MemoryModuleType.field39868, var12);
      var5.method21406(MemoryModuleType.field39861, var15);
      var5.method21406(MemoryModuleType.field39862, var14);
      var5.method21406(MemoryModuleType.field39866, var14.size());
      var5.method21406(MemoryModuleType.field39867, var13);
   }

   private static Optional<BlockPos> method26426(ServerWorld var0, LivingEntity var1) {
      return BlockPos.method8357(var1.getPosition(), 8, 4, var1x -> method26427(var0, var1x));
   }

   private static boolean method26427(ServerWorld var0, BlockPos var1) {
      BlockState var4 = var0.getBlockState(var1);
      boolean var5 = var4.isIn(BlockTags.field32774);
      return var5 && var4.isIn(Blocks.SOUL_CAMPFIRE) ? CampfireBlock.method11655(var4) : var5;
   }
}
