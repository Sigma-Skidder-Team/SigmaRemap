package net.minecraft.world.lighting;

import mapped.Class197;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.SectionPos;
import net.minecraft.world.chunk.NibbleArray;

import javax.annotation.Nullable;

public interface IWorldLightListener extends Class197 {
   @Nullable
   NibbleArray method642(SectionPos var1);

   int method643(BlockPos var1);
}
