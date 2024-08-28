package mapped;

import java.util.Random;

public class Class3428 extends Block implements Class3207 {
   private static String[] field19179;
   private static final Class6408 field19180;
   private static final Class6408 field19181;
   private static final Class6408 field19182 = Block.method11539(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final Class6408 field19183 = Class8022.method27426().method19517(0.0, -1.0, 0.0);
   public static final Class8554 field19184 = Class8820.field39761;
   public static final Class8551 field19185 = Class8820.field39710;
   public static final Class8551 field19186 = Class8820.field39683;

   public Class3428(AbstractBlock var1) {
      super(var1);
      this.method11578(
         this.field18612
            .method35393()
            .method23465(field19184, Integer.valueOf(7))
            .method23465(field19185, Boolean.valueOf(false))
            .method23465(field19186, Boolean.valueOf(false))
      );
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field19184, field19185, field19186);
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      if (var4.method14951(var1.method23383().method11581())) {
         return Class8022.method27426();
      } else {
         return !var1.<Boolean>method23463(field19186) ? field19180 : field19181;
      }
   }

   @Override
   public Class6408 method11938(Class7380 var1, Class1665 var2, BlockPos var3) {
      return Class8022.method27426();
   }

   @Override
   public boolean method11497(Class7380 var1, Class5909 var2) {
      return var2.method18357().method32107() == this.method11581();
   }

   @Override
   public Class7380 method11495(Class5909 var1) {
      BlockPos var4 = var1.method18345();
      World var5 = var1.method18360();
      int var6 = method12085(var5, var4);
      return this.method11579()
         .method23465(field19185, Boolean.valueOf(var5.method6739(var4).method23472() == Class9479.field44066))
         .method23465(field19184, Integer.valueOf(var6))
         .method23465(field19186, Boolean.valueOf(this.method12084(var5, var4, var6)));
   }

   @Override
   public void method11589(Class7380 var1, World var2, BlockPos var3, Class7380 var4, boolean var5) {
      if (!var2.field9020) {
         var2.method6860().method20726(var3, this, 1);
      }
   }

   @Override
   public Class7380 method11491(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var1.<Boolean>method23463(field19185)) {
         var4.method6861().method20726(var5, Class9479.field44066, Class9479.field44066.method25057(var4));
      }

      if (!var4.method6714()) {
         var4.method6860().method20726(var5, this, 1);
      }

      return var1;
   }

   @Override
   public void method11522(Class7380 var1, ServerWorld var2, BlockPos var3, Random var4) {
      int var7 = method12085(var2, var3);
      Class7380 var8 = var1.method23465(field19184, Integer.valueOf(var7)).method23465(field19186, Boolean.valueOf(this.method12084(var2, var3, var7)));
      if (var8.<Integer>method23463(field19184) != 7) {
         if (var1 != var8) {
            var2.method6725(var3, var8, 3);
         }
      } else if (var1.<Integer>method23463(field19184) != 7) {
         var2.method7179(var3, true);
      } else {
         var2.method6916(
            new Class907(
               var2,
               (double)var3.method8304() + 0.5,
               (double)var3.getY(),
               (double)var3.method8306() + 0.5,
               var8.method23465(field19185, Boolean.valueOf(false))
            )
         );
      }
   }

   @Override
   public boolean method11492(Class7380 var1, Class1662 var2, BlockPos var3) {
      return method12085(var2, var3) < 7;
   }

   @Override
   public Class6408 method11502(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      if (var4.method14950(Class8022.method27426(), var3, true) && !var4.method14949()) {
         return field19180;
      } else {
         return var1.<Integer>method23463(field19184) != 0 && var1.<Boolean>method23463(field19186) && var4.method14950(field19183, var3, true)
            ? field19182
            : Class8022.method27425();
      }
   }

   @Override
   public Class7379 method11498(Class7380 var1) {
      return !var1.<Boolean>method23463(field19185) ? super.method11498(var1) : Class9479.field44066.method25078(false);
   }

   private boolean method12084(Class1665 var1, BlockPos var2, int var3) {
      return var3 > 0 && !var1.method6738(var2.method8313()).method23448(this);
   }

   public static int method12085(Class1665 var0, BlockPos var1) {
      Mutable var4 = var1.method8354().method8379(Direction.field672);
      Class7380 var5 = var0.method6738(var4);
      int var6 = 7;
      if (!var5.method23448(Blocks.field37053)) {
         if (var5.method23454(var0, var4, Direction.field673)) {
            return 0;
         }
      } else {
         var6 = var5.<Integer>method23463(field19184);
      }

      for (Direction var8 : Class76.field161) {
         Class7380 var9 = var0.method6738(var4.method8377(var1, var8));
         if (var9.method23448(Blocks.field37053)) {
            var6 = Math.min(var6, var9.<Integer>method23463(field19184) + 1);
            if (var6 != 1) {
               continue;
            }
            break;
         }
      }

      return var6;
   }

   static {
      Class6408 var2 = Block.method11539(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      Class6408 var3 = Block.method11539(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      Class6408 var4 = Block.method11539(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      Class6408 var5 = Block.method11539(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      Class6408 var6 = Block.method11539(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      field19180 = Class8022.method27432(var2, var3, var4, var5, var6);
      Class6408 var7 = Block.method11539(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      Class6408 var8 = Block.method11539(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      Class6408 var9 = Block.method11539(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      Class6408 var10 = Block.method11539(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      field19181 = Class8022.method27432(Class3428.field19182, field19180, var8, var7, var10, var9);
   }
}
