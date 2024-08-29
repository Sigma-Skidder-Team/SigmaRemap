package mapped;

import java.util.Random;
import javax.annotation.Nullable;

public class Class3451 extends Class3452 implements Class3449 {
   private static String[] field19265;
   public static final VoxelShape field19266 = Block.method11539(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   public Class3451(AbstractBlock var1) {
      super(var1, Direction.field673, field19266, true, 0.14);
   }

   @Override
   public boolean method12127(BlockState var1) {
      return var1.method23448(Blocks.WATER);
   }

   @Override
   public Block method12125() {
      return Blocks.field36962;
   }

   @Override
   public boolean method12123(Block var1) {
      return var1 != Blocks.field36890;
   }

   @Override
   public boolean method11531(Class1665 var1, BlockPos var2, BlockState var3, Fluid var4) {
      return false;
   }

   @Override
   public boolean method11532(Class1660 var1, BlockPos var2, BlockState var3, Class7379 var4) {
      return false;
   }

   @Override
   public int method12128(Random var1) {
      return 1;
   }

   @Nullable
   @Override
   public BlockState method11495(Class5909 var1) {
      Class7379 var4 = var1.method18360().method6739(var1.method18345());
      return var4.method23486(Class8953.field40469) && var4.method23477() == 8 ? super.method11495(var1) : null;
   }

   @Override
   public Class7379 method11498(BlockState var1) {
      return Class9479.field44066.method25078(false);
   }
}
