package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public interface ICollisionReader extends IBlockReader {
   WorldBorder getWorldBorder();

   @Nullable
   IBlockReader getBlockReader(int var1, int var2);

   default boolean checkNoEntityCollision(Entity var1, VoxelShape var2) {
      return true;
   }

   default boolean placedBlockCollides(BlockState var1, BlockPos var2, ISelectionContext var3) {
      VoxelShape var6 = var1.getCollisionShape(this, var2, var3);
      return var6.method19516()
         || this.checkNoEntityCollision((Entity)null, var6.withOffset((double)var2.getX(), (double)var2.getY(), (double)var2.getZ()));
   }

   default boolean checkNoEntityCollision(Entity var1) {
      return this.checkNoEntityCollision(var1, VoxelShapes.create(var1.getBoundingBox()));
   }

   default boolean hasNoCollisions(AxisAlignedBB var1) {
      return this.method7054((Entity)null, var1, var0 -> true);
   }

   default boolean hasNoCollisions(Entity var1) {
      return this.method7054(var1, var1.getBoundingBox(), var0 -> true);
   }

   default boolean hasNoCollisions(Entity var1, AxisAlignedBB var2) {
      return this.method7054(var1, var2, var0 -> true);
   }

   default boolean method7054(Entity var1, AxisAlignedBB var2, Predicate<Entity> var3) {
      return this.method7047(var1, var2, var3).allMatch(VoxelShape::method19516);
   }

   Stream<VoxelShape> method7046(Entity var1, AxisAlignedBB var2, Predicate<Entity> var3);

   default Stream<VoxelShape> method7047(Entity var1, AxisAlignedBB var2, Predicate<Entity> var3) {
      return Stream.<VoxelShape>concat(this.getCollisionShapes(var1, var2), this.method7046(var1, var2, var3));
   }

   default Stream<VoxelShape> getCollisionShapes(Entity var1, AxisAlignedBB var2) {
      return StreamSupport.<VoxelShape>stream(new Class8181(this, var1, var2), false);
   }

   default boolean method7056(Entity var1, AxisAlignedBB var2, BiPredicate<BlockState, BlockPos> var3) {
      return this.method7057(var1, var2, var3).allMatch(VoxelShape::method19516);
   }

   default Stream<VoxelShape> method7057(Entity var1, AxisAlignedBB var2, BiPredicate<BlockState, BlockPos> var3) {
      return StreamSupport.<VoxelShape>stream(new Class8181(this, var1, var2, var3), false);
   }
}
