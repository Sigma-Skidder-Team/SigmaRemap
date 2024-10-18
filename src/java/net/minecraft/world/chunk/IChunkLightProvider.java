package net.minecraft.world.chunk;

import net.minecraft.util.math.SectionPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.LightType;

import javax.annotation.Nullable;

public interface IChunkLightProvider {
   @Nullable
   IBlockReader getChunkForLight(int var1, int var2);

   default void markLightChanged(LightType var1, SectionPos var2) {
   }

   IBlockReader getWorld();
}
