package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.biome.Biome;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface IBiomeReader extends IEntityReader, IWorldReader, IWorldGenerationReader {
   @Override
   default Stream<VoxelShape> func_230318_c_(Entity var1, AxisAlignedBB var2, Predicate<Entity> var3) {
      return IEntityReader.super.func_230318_c_(var1, var2, var3);
   }

   @Override
   default boolean checkNoEntityCollision(Entity var1, VoxelShape var2) {
      return IEntityReader.super.method7048(var1, var2);
   }

   @Override
   default BlockPos getHeight(Heightmap.Type heightmapType, BlockPos pos) {
      return IWorldReader.super.getHeight(heightmapType, pos);
   }

   DynamicRegistries func_241828_r();

   default Optional<RegistryKey<Biome>> func_242406_i(BlockPos p_242406_1_) {
      return this.func_241828_r().<Biome>getRegistry(Registry.BIOME_KEY).getOptionalKey(this.getBiome(p_242406_1_));
   }
}
