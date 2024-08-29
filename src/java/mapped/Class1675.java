package mapped;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Class1675 extends Chunk {
   private static String[] field9134;
   private static final Biome[] field9135 = Util.<Biome[]>make(
      new Biome[Class1684.field9154], var0 -> Arrays.fill(var0, Class8900.field40281)
   );

   public Class1675(World var1, Class7481 var2) {
      super(var1, var2, new Class1684(var1.method6867().<Biome>getRegistry(Registry.BIOME_KEY), field9135));
   }

   @Override
   public BlockState getBlockState(BlockPos var1) {
      return Blocks.field37011.method11579();
   }

   @Nullable
   @Override
   public BlockState setBlockState(BlockPos var1, BlockState var2, boolean var3) {
      return null;
   }

   @Override
   public FluidState getFluidState(BlockPos var1) {
      return Class9479.field44064.method25049();
   }

   @Nullable
   @Override
   public Class196 method7131() {
      return null;
   }

   @Override
   public int method7032(BlockPos var1) {
      return 0;
   }

   @Override
   public void method7063(Entity var1) {
   }

   @Override
   public void method7132(Entity var1) {
   }

   @Override
   public void method7133(Entity var1, int var2) {
   }

   @Nullable
   @Override
   public TileEntity method7029(BlockPos var1, Class2206 var2) {
      return null;
   }

   @Override
   public void method7135(TileEntity var1) {
   }

   @Override
   public void method7062(BlockPos var1, TileEntity var2) {
   }

   @Override
   public void method7081(BlockPos var1) {
   }

   @Override
   public void method7137() {
   }

   @Override
   public void method7138(Entity var1, AxisAlignedBB var2, List<Entity> var3, Predicate<? super Entity> var4) {
   }

   @Override
   public <T extends Entity> void method7140(Class<? extends T> var1, AxisAlignedBB var2, List<T> var3, Predicate<? super T> var4) {
   }

   @Override
   public boolean method7141() {
      return true;
   }

   @Override
   public boolean method7076(int var1, int var2) {
      return true;
   }

   @Override
   public ChunkHolderLocationType getLocationType() {
      return ChunkHolderLocationType.field167;
   }
}
