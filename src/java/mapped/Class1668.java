package mapped;

import javax.annotation.Nullable;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public interface Class1668 extends Class1665 {
   WorldBorder method6810();

   @Nullable
   Class1665 method6769(int var1, int var2);

   default boolean method7048(Entity var1, VoxelShape var2) {
      return true;
   }

   default boolean method7049(BlockState var1, BlockPos var2, ISelectionContext var3) {
      VoxelShape var6 = var1.getCollisionShape(this, var2, var3);
      return var6.method19516()
         || this.method7048((Entity)null, var6.withOffset((double)var2.getX(), (double)var2.getY(), (double)var2.getZ()));
   }

   default boolean method7050(Entity var1) {
      return this.method7048(var1, VoxelShapes.create(var1.getBoundingBox()));
   }

   default boolean method7051(AxisAlignedBB var1) {
      return this.method7054((Entity)null, var1, var0 -> true);
   }

   default boolean method7052(Entity var1) {
      return this.method7054(var1, var1.getBoundingBox(), var0 -> true);
   }

   default boolean method7053(Entity var1, AxisAlignedBB var2) {
      return this.method7054(var1, var2, var0 -> true);
   }

   default boolean method7054(Entity var1, AxisAlignedBB var2, Predicate<Entity> var3) {
      return this.method7047(var1, var2, var3).allMatch(VoxelShape::method19516);
   }

   Stream<VoxelShape> method7046(Entity var1, AxisAlignedBB var2, Predicate<Entity> var3);

   default Stream<VoxelShape> method7047(Entity var1, AxisAlignedBB var2, Predicate<Entity> var3) {
      return Stream.<VoxelShape>concat(this.method7055(var1, var2), this.method7046(var1, var2, var3));
   }

   default Stream<VoxelShape> method7055(Entity var1, AxisAlignedBB var2) {
      return StreamSupport.<VoxelShape>stream(new Class8181(this, var1, var2), false);
   }

   default boolean method7056(Entity var1, AxisAlignedBB var2, BiPredicate<BlockState, BlockPos> var3) {
      return this.method7057(var1, var2, var3).allMatch(VoxelShape::method19516);
   }

   default Stream<VoxelShape> method7057(Entity var1, AxisAlignedBB var2, BiPredicate<BlockState, BlockPos> var3) {
      return StreamSupport.<VoxelShape>stream(new Class8181(this, var1, var2, var3), false);
   }
}
