package mapped;

import java.util.Random;

public class Class3482 extends Class3480 {
   private static String[] field19333;
   public static final Class8554 field19337 = Class8820.field39740;
   private static final Class6408[] field19338 = new Class6408[]{
      Block.method11539(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      Block.method11539(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      Block.method11539(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      Block.method11539(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   public Class3482(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public Class8554 method12175() {
      return field19337;
   }

   @Override
   public int method12176() {
      return 3;
   }

   @Override
   public Class3303 method12183() {
      return Class8514.field38112;
   }

   @Override
   public void method11484(Class7380 var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (var4.nextInt(3) != 0) {
         super.method11484(var1, var2, var3, var4);
      }
   }

   @Override
   public int method12181(World var1) {
      return super.method12181(var1) / 3;
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field19337);
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field19338[var1.<Integer>method23463(this.method12175())];
   }
}
