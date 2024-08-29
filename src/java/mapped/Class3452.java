package mapped;

import java.util.Random;

public abstract class Class3452 extends Class3444 implements Class3196 {
   public static final Class8554 field19267 = Class8820.field39744;
   private final double field19268;

   public Class3452(AbstractBlock var1, Direction var2, VoxelShape var3, boolean var4, double var5) {
      super(var1, var2, var3, var4);
      this.field19268 = var5;
      this.method11578(this.field18612.method35393().method23465(field19267, Integer.valueOf(0)));
   }

   @Override
   public BlockState method12122(Class1660 var1) {
      return this.method11579().method23465(field19267, Integer.valueOf(var1.method6814().nextInt(25)));
   }

   @Override
   public boolean method11499(BlockState var1) {
      return var1.<Integer>method23463(field19267) < 25;
   }

   @Override
   public void method11484(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (var1.<Integer>method23463(field19267) < 25 && var4.nextDouble() < this.field19268) {
         BlockPos var7 = var3.method8349(this.field19256);
         if (this.method12127(var2.getBlockState(var7))) {
            var2.method6730(var7, var1.method23459(field19267));
         }
      }
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var2 == this.field19256.method536() && !var1.method23443(var4, var5)) {
         var4.method6860().method20726(var5, this, 1);
      }

      if (var2 != this.field19256 || !var3.method23448(this) && !var3.method23448(this.method12125())) {
         if (this.field19257) {
            var4.method6861().method20726(var5, Class9479.field44066, Class9479.field44066.method25057(var4));
         }

         return super.method11491(var1, var2, var3, var4, var5, var6);
      } else {
         return this.method12125().method11579();
      }
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19267);
   }

   @Override
   public boolean method11486(Class1665 var1, BlockPos var2, BlockState var3, boolean var4) {
      return this.method12127(var1.getBlockState(var2.method8349(this.field19256)));
   }

   @Override
   public boolean method11487(World var1, Random var2, BlockPos var3, BlockState var4) {
      return true;
   }

   @Override
   public void method11488(ServerWorld var1, Random var2, BlockPos var3, BlockState var4) {
      BlockPos var7 = var3.method8349(this.field19256);
      int var8 = Math.min(var4.<Integer>method23463(field19267) + 1, 25);
      int var9 = this.method12128(var2);

      for (int var10 = 0; var10 < var9 && this.method12127(var1.getBlockState(var7)); var10++) {
         var1.method6730(var7, var4.method23465(field19267, Integer.valueOf(var8)));
         var7 = var7.method8349(this.field19256);
         var8 = Math.min(var8 + 1, 25);
      }
   }

   public abstract int method12128(Random var1);

   public abstract boolean method12127(BlockState var1);

   @Override
   public Class3452 method12124() {
      return this;
   }
}
