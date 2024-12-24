package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.server.ServerWorld;

import java.util.Objects;
import java.util.Optional;

public class Class3336 extends Item {
   private static String[] field18843;

   public Class3336(Properties var1) {
      super(var1);
   }

   @Override
   public ActionResultType onItemUse(ItemUseContext var1) {
      World var4 = var1.getWorld();
      BlockPos var5 = var1.getPos();
      BlockPos var6 = var5.offset(var1.getFace());
      if (!method11883(var1.method18357(), var4, var5)) {
         BlockState var7 = var4.getBlockState(var5);
         boolean var8 = var7.method23454(var4, var5, var1.getFace());
         if (var8 && method11884(var1.method18357(), var4, var6, var1.getFace())) {
            if (!var4.isRemote) {
               var4.playEvent(2005, var6, 0);
            }

            return ActionResultType.method9002(var4.isRemote);
         } else {
            return ActionResultType.field14820;
         }
      } else {
         if (!var4.isRemote) {
            var4.playEvent(2005, var5, 0);
         }

         return ActionResultType.method9002(var4.isRemote);
      }
   }

   public static boolean method11883(ItemStack var0, World var1, BlockPos var2) {
      BlockState var5 = var1.getBlockState(var2);
      if (var5.getBlock() instanceof Class3196) {
         Class3196 var6 = (Class3196)var5.getBlock();
         if (var6.method11486(var1, var2, var5, var1.isRemote)) {
            if (var1 instanceof ServerWorld) {
               if (var6.method11487(var1, var1.rand, var2, var5)) {
                  var6.method11488((ServerWorld)var1, var1.rand, var2, var5);
               }

               var0.shrink(1);
            }

            return true;
         }
      }

      return false;
   }

   public static boolean method11884(ItemStack var0, World var1, BlockPos var2, Direction var3) {
      if (var1.getBlockState(var2).isIn(Blocks.WATER) && var1.getFluidState(var2).method23477() == 8) {
         if (!(var1 instanceof ServerWorld)) {
            return true;
         } else {
            label110:
            for (int var6 = 0; var6 < 128; var6++) {
               BlockPos var7 = var2;
               BlockState var8 = Blocks.SEAGRASS.getDefaultState();

               for (int var9 = 0; var9 < var6 / 16; var9++) {
                  var7 = var7.add(field18735.nextInt(3) - 1, (field18735.nextInt(3) - 1) * field18735.nextInt(3) / 2, field18735.nextInt(3) - 1);
                  if (var1.getBlockState(var7).method23456(var1, var7)) {
                     continue label110;
                  }
               }

               Optional var11 = var1.method7178(var7);
               if (Objects.equals(var11, Optional.<RegistryKey<Biome>>of(Biomes.WARM_OCEAN))
                  || Objects.equals(var11, Optional.<RegistryKey<Biome>>of(Biomes.DEEP_WARM_OCEAN))) {
                  if (var6 == 0 && var3 != null && var3.getAxis().isHorizontal()) {
                     var8 = BlockTags.field32784.getRandomElement(var1.rand).getDefaultState().with(Class3229.field18669, var3);
                  } else if (field18735.nextInt(4) == 0) {
                     var8 = BlockTags.field32782.getRandomElement(field18735).getDefaultState();
                  }
               }

               if (var8.getBlock().isIn(BlockTags.field32784)) {
                  for (int var10 = 0; !var8.isValidPosition(var1, var7) && var10 < 4; var10++) {
                     var8 = var8.with(Class3229.field18669, Direction.Plane.HORIZONTAL.method247(field18735));
                  }
               }

               if (var8.isValidPosition(var1, var7)) {
                  BlockState var12 = var1.getBlockState(var7);
                  if (var12.isIn(Blocks.WATER) && var1.getFluidState(var7).method23477() == 8) {
                     var1.setBlockState(var7, var8, 3);
                  } else if (var12.isIn(Blocks.SEAGRASS) && field18735.nextInt(10) == 0) {
                     ((Class3196) Blocks.SEAGRASS).method11488((ServerWorld)var1, field18735, var7, var12);
                  }
               }
            }

            var0.shrink(1);
            return true;
         }
      } else {
         return false;
      }
   }

   public static void method11885(IWorld var0, BlockPos var1, int var2) {
      if (var2 == 0) {
         var2 = 15;
      }

      BlockState var5 = var0.getBlockState(var1);
      if (!var5.isAir()) {
         double var6 = 0.5;
         double var8;
         if (!var5.isIn(Blocks.WATER)) {
            if (!var5.method23409(var0, var1)) {
               var8 = var5.method23412(var0, var1).getEnd(Direction.Axis.Y);
            } else {
               var1 = var1.up();
               var2 *= 3;
               var6 = 3.0;
               var8 = 1.0;
            }
         } else {
            var2 *= 3;
            var8 = 1.0;
            var6 = 3.0;
         }

         var0.addParticle(ParticleTypes.field34078, (double)var1.getX() + 0.5, (double)var1.getY() + 0.5, (double)var1.getZ() + 0.5, 0.0, 0.0, 0.0);

         for (int var10 = 0; var10 < var2; var10++) {
            double var11 = field18735.nextGaussian() * 0.02;
            double var13 = field18735.nextGaussian() * 0.02;
            double var15 = field18735.nextGaussian() * 0.02;
            double var17 = 0.5 - var6;
            double var19 = (double)var1.getX() + var17 + field18735.nextDouble() * var6 * 2.0;
            double var21 = (double)var1.getY() + field18735.nextDouble() * var8;
            double var23 = (double)var1.getZ() + var17 + field18735.nextDouble() * var6 * 2.0;
            if (!var0.getBlockState(new BlockPos(var19, var21, var23).down()).isAir()) {
               var0.addParticle(ParticleTypes.field34078, var19, var21, var23, var11, var13, var15);
            }
         }
      }
   }
}
