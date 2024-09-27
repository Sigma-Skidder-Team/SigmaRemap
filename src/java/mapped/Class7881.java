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

public class Class7881 extends Class7882<LivingEntity> {
   private static String[] field33824;

   @Override
   public Set<Class8830<?>> method26424() {
      return ImmutableSet.of(
         Class8830.field39819,
         Class8830.field39818,
         Class8830.field39848,
         Class8830.field39860,
         Class8830.field39868,
         Class8830.field39858,
         new Class8830[]{Class8830.field39859, Class8830.field39862, Class8830.field39861, Class8830.field39866, Class8830.field39867, Class8830.field39870}
      );
   }

   @Override
   public void method26425(ServerWorld var1, LivingEntity var2) {
      Brain<?> var5 = var2.getBrain();
      var5.method21408(Class8830.field39870, method26426(var1, var2));
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

      for (LivingEntity var17 : var5.<List<LivingEntity>>method21410(Class8830.field39819).orElse(ImmutableList.of())) {
         if (!(var17 instanceof Class1091)) {
            if (!(var17 instanceof Class1036)) {
               if (!(var17 instanceof Class1034)) {
                  if (!(var17 instanceof PlayerEntity)) {
                     if (var6.isPresent() || !(var17 instanceof Class1084) && !(var17 instanceof WitherEntity)) {
                        if (!var10.isPresent() && Class4388.method13880(var17.getType())) {
                           var10 = Optional.<LivingEntity>of(var17);
                        }
                     } else {
                        var6 = Optional.<LivingEntity>of((MobEntity)var17);
                     }
                  } else {
                     PlayerEntity var22 = (PlayerEntity)var17;
                     if (!var11.isPresent() && Class8088.field34762.test(var17) && !Class4388.method13843(var22)) {
                        var11 = Optional.<PlayerEntity>of(var22);
                     }

                     if (!var12.isPresent() && !var22.isSpectator() && Class4388.method13875(var22)) {
                        var12 = Optional.<PlayerEntity>of(var22);
                     }
                  }
               } else {
                  Class1034 var21 = (Class1034)var17;
                  if (var21.isChild() && !var9.isPresent()) {
                     var9 = Optional.<Class1034>of(var21);
                  } else if (var21.method4635()) {
                     var14.add(var21);
                  }
               }
            } else {
               var14.add((Class1036)var17);
            }
         } else {
            Class1091 var18 = (Class1091)var17;
            if (var18.isChild() && !var8.isPresent()) {
               var8 = Optional.<Class1091>of(var18);
            } else if (var18.method5084()) {
               var13++;
               if (!var7.isPresent() && var18.method5089()) {
                  var7 = Optional.<Class1091>of(var18);
               }
            }
         }
      }

      for (LivingEntity var20 : var5.<List<LivingEntity>>method21410(Class8830.field39818).orElse(ImmutableList.of())) {
         if (var20 instanceof Class1035 && ((Class1035)var20).method4635()) {
            var15.add((Class1035)var20);
         }
      }

      var5.method21408(Class8830.field39848, var6);
      var5.method21408(Class8830.field39858, var7);
      var5.method21408(Class8830.field39859, var8);
      var5.method21408(Class8830.field39865, var10);
      var5.method21408(Class8830.field39860, var11);
      var5.method21408(Class8830.field39868, var12);
      var5.method21406(Class8830.field39861, var15);
      var5.method21406(Class8830.field39862, var14);
      var5.method21406(Class8830.field39866, var14.size());
      var5.method21406(Class8830.field39867, var13);
   }

   private static Optional<BlockPos> method26426(ServerWorld var0, LivingEntity var1) {
      return BlockPos.method8357(var1.getPosition(), 8, 4, var1x -> method26427(var0, var1x));
   }

   private static boolean method26427(ServerWorld var0, BlockPos var1) {
      BlockState var4 = var0.getBlockState(var1);
      boolean var5 = var4.isIn(BlockTags.field32774);
      return var5 && var4.isIn(Blocks.field37068) ? Class3244.method11655(var4) : var5;
   }
}
