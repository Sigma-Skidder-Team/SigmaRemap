package net.minecraft.block.trees;

import mapped.Class4733;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;
import javax.annotation.Nullable;

public abstract class Tree {
   @Nullable
   public abstract ConfiguredFeature<Class4733, ?> method25186(Random var1, boolean var2);

   public boolean method25182(ServerWorld var1, ChunkGenerator var2, BlockPos var3, BlockState var4, Random var5) {
      ConfiguredFeature var8 = this.method25186(var5, this.method25187(var1, var3));
      if (var8 != null) {
         var1.setBlockState(var3, Blocks.AIR.getDefaultState(), 4);
         ((Class4733)var8.config).method14849();
         if (!var8.func_242765_a(var1, var2, var5, var3)) {
            var1.setBlockState(var3, var4, 4);
            return false;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private boolean method25187(IWorld var1, BlockPos var2) {
      for (BlockPos var6 : BlockPos.Mutable.method8359(var2.down().method8342(2).method8346(2), var2.up().method8344(2).method8348(2))) {
         if (var1.getBlockState(var6).isIn(BlockTags.field32773)) {
            return true;
         }
      }

      return false;
   }
}
