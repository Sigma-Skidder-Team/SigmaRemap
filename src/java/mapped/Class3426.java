package mapped;

public class Class3426 extends Block {
   private static String[] field19174;
   public static final Class8552<Class108> field19175 = Class8820.field39768;
   public static final Class8551 field19176 = Class8820.field39704;
   public static final Class8554 field19177 = Class8820.field39757;

   public Class3426(AbstractBlock var1) {
      super(var1);
      this.method11578(
         this.field18612
            .method35393()
            .method23465(field19175, Class108.field347)
            .method23465(field19177, Integer.valueOf(0))
            .method23465(field19176, Boolean.valueOf(false))
      );
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      return this.method11579().method23465(field19175, Class108.method300(var1.method18360().getBlockState(var1.method18345().down())));
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return var2 != Direction.DOWN ? super.method11491(var1, var2, var3, var4, var5, var6) : var1.method23465(field19175, Class108.method300(var3));
   }

   @Override
   public void method11506(BlockState var1, World var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      boolean var9 = var2.method6780(var3);
      if (var9 != var1.<Boolean>method23463(field19176)) {
         if (var9) {
            this.method12083(var2, var3);
         }

         var2.setBlockState(var3, var1.method23465(field19176, Boolean.valueOf(var9)), 3);
      }
   }

   private void method12083(World var1, BlockPos var2) {
      if (var1.getBlockState(var2.up()).isAir()) {
         var1.method6787(var2, this, 0, 0);
      }
   }

   @Override
   public ActionResultType method11505(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var2.isRemote) {
         var1 = var1.method23459(field19177);
         var2.setBlockState(var3, var1, 3);
         this.method12083(var2, var3);
         var4.method2911(Class8876.field40153);
         return ActionResultType.field14819;
      } else {
         return ActionResultType.field14818;
      }
   }

   @Override
   public void method11602(BlockState var1, World var2, BlockPos var3, PlayerEntity var4) {
      if (!var2.isRemote) {
         this.method12083(var2, var3);
         var4.method2911(Class8876.field40152);
      }
   }

   @Override
   public boolean method11647(BlockState var1, World var2, BlockPos var3, int var4, int var5) {
      int var8 = var1.<Integer>method23463(field19177);
      float var9 = (float)Math.pow(2.0, (double)(var8 - 12) / 12.0);
      var2.method6742((PlayerEntity)null, var3, var1.<Class108>method23463(field19175).method299(), Class2266.field14730, 3.0F, var9);
      var2.method6746(
         Class7940.field34088, (double)var3.getX() + 0.5, (double)var3.getY() + 1.2, (double)var3.getZ() + 0.5, (double)var8 / 24.0, 0.0, 0.0
      );
      return true;
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19175, field19176, field19177);
   }
}
