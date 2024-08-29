package mapped;

import java.util.Random;

public class Class3230 extends Class3229 {
   private static String[] field18668;
   private final Block field18671;

   public Class3230(Block var1, AbstractBlock var2) {
      super(var2);
      this.field18671 = var1;
   }

   @Override
   public void method11589(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      this.method11632(var1, var2, var3);
   }

   @Override
   public void method11522(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (!method11633(var1, var2, var3)) {
         var2.setBlockState(
            var3,
            this.field18671.method11579().method23465(field18663, Boolean.valueOf(false)).method23465(field18669, var1.<Direction>method23463(field18669)),
            2
         );
      }
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var2.method536() == var1.<Direction>method23463(field18669) && !var1.method23443(var4, var5)) {
         return Blocks.AIR.method11579();
      } else {
         if (var1.<Boolean>method23463(field18663)) {
            var4.method6861().method20726(var5, Class9479.field44066, Class9479.field44066.method25057(var4));
         }

         this.method11632(var1, var4, var5);
         return super.method11491(var1, var2, var3, var4, var5, var6);
      }
   }
}
