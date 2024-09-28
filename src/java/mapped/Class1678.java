package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.biome.Biome;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface Class1678 extends Class1682, IWorldReader, Class1679 {
   @Override
   default Stream<VoxelShape> func_230318_c_(Entity var1, AxisAlignedBB var2, Predicate<Entity> var3) {
      return Class1682.super.func_230318_c_(var1, var2, var3);
   }

   @Override
   default boolean checkNoEntityCollision(Entity var1, VoxelShape var2) {
      return Class1682.super.method7048(var1, var2);
   }

   @Override
   default BlockPos method7006(Heightmap.Type var1, BlockPos var2) {
      return IWorldReader.super.method7006(var1, var2);
   }

   DynamicRegistries func_241828_r();

   default Optional<RegistryKey<Biome>> method7178(BlockPos var1) {
      return this.func_241828_r().<Biome>getRegistry(Registry.BIOME_KEY).method9182(this.getBiome(var1));
   }
}
