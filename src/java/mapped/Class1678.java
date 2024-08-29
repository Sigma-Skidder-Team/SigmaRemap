package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface Class1678 extends Class1682, Class1662, Class1679 {
   @Override
   default Stream<VoxelShape> method7046(Entity var1, AxisAlignedBB var2, Predicate<Entity> var3) {
      return Class1682.super.method7046(var1, var2, var3);
   }

   @Override
   default boolean method7048(Entity var1, VoxelShape var2) {
      return Class1682.super.method7048(var1, var2);
   }

   @Override
   default BlockPos method7006(Class101 var1, BlockPos var2) {
      return Class1662.super.method7006(var1, var2);
   }

   DynamicRegistries method6867();

   default Optional<RegistryKey<Biome>> method7178(BlockPos var1) {
      return this.method6867().<Biome>getRegistry(Registry.BIOME_KEY).method9182(this.getBiome(var1));
   }
}
