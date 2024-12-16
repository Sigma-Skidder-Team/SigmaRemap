package net.minecraft.world;

import mapped.*;
import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.particles.IParticleData;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.chunk.AbstractChunkProvider;

import java.util.Random;

public interface IWorld extends Class1678, Class1661 {
   @Override
   default long method6996() {
      return this.getWorldInfo().getDayTime();
   }

   ITickList<Block> method6860();

   ITickList<Fluid> getPendingFluidTicks();

   Class6612 getWorldInfo();

   Class9755 method6807(BlockPos var1);

   default Difficulty method6997() {
      return this.getWorldInfo().method20047();
   }

   AbstractChunkProvider getChunkProvider();

   @Override
   default boolean chunkExists(int var1, int var2) {
      return this.getChunkProvider().chunkExists(var1, var2);
   }

   Random method6814();

   default void func_230547_a_(BlockPos var1, Block var2) {
   }

   void playSound(PlayerEntity var1, BlockPos var2, SoundEvent var3, SoundCategory var4, float var5, float var6);

   void addParticle(IParticleData var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void method6869(PlayerEntity var1, int var2, BlockPos var3, int var4);

   default int method6998() {
      return this.getDimensionType().getLogicalHeight();
   }

   default void playEvent(int var1, BlockPos var2, int var3) {
      this.method6869((PlayerEntity)null, var1, var2, var3);
   }
}
