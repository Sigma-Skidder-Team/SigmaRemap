package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

@FunctionalInterface
public interface EntitySpawnPlacementRegistry$IPlacementPredicate<T extends Entity> {
   boolean method32251(EntityType<T> var1, ServerWorldAccess var2, SpawnReason var3, BlockPos var4, Random var5);
}
