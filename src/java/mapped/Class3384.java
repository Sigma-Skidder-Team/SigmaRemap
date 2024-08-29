package mapped;

import java.util.Random;
import javax.annotation.Nullable;

public class Class3384 extends Class3383 {
   private static String[] field18989;
   public static final Class8553 field18990 = Class3198.field18484;
   public static final Class8551 field18991 = Class3383.field18987;

   public Class3384(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field18990, Direction.NORTH).method23465(field18991, Boolean.valueOf(true)));
   }

   @Override
   public String method11566() {
      return this.method11581().getTranslationKey();
   }

   @Override
   public Class6408 method11483(BlockState var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return Class3382.method11980(var1);
   }

   @Override
   public boolean method11492(BlockState var1, Class1662 var2, BlockPos var3) {
      return Blocks.WALL_TORCH.method11492(var1, var2, var3);
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return Blocks.WALL_TORCH.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Nullable
   @Override
   public BlockState method11495(Class5909 var1) {
      BlockState var4 = Blocks.WALL_TORCH.method11495(var1);
      return var4 != null ? this.method11579().method23465(field18990, var4.<Direction>method23463(field18990)) : null;
   }

   @Override
   public void method11512(BlockState var1, World var2, BlockPos var3, Random var4) {
      if (var1.<Boolean>method23463(field18991)) {
         Direction var7 = var1.<Direction>method23463(field18990).method536();
         double var8 = 0.27;
         double var10 = (double)var3.getX() + 0.5 + (var4.nextDouble() - 0.5) * 0.2 + 0.27 * (double)var7.method539();
         double var12 = (double)var3.getY() + 0.7 + (var4.nextDouble() - 0.5) * 0.2 + 0.22;
         double var14 = (double)var3.getZ() + 0.5 + (var4.nextDouble() - 0.5) * 0.2 + 0.27 * (double)var7.method541();
         var2.method6746(this.field18984, var10, var12, var14, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public boolean method11981(World var1, BlockPos var2, BlockState var3) {
      Direction var6 = var3.<Direction>method23463(field18990).method536();
      return var1.method6778(var2.method8349(var6), var6);
   }

   @Override
   public int method11514(BlockState var1, Class1665 var2, BlockPos var3, Direction var4) {
      return var1.<Boolean>method23463(field18991) && var1.method23463(field18990) != var4 ? 15 : 0;
   }

   @Override
   public BlockState method11500(BlockState var1, Class80 var2) {
      return Blocks.WALL_TORCH.method11500(var1, var2);
   }

   @Override
   public BlockState method11501(BlockState var1, Class2089 var2) {
      return Blocks.WALL_TORCH.method11501(var1, var2);
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18990, field18991);
   }
}
