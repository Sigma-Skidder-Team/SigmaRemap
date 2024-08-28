package mapped;

public class Class3394 extends Block {
   private static String[] field19028;
   public static final Class8554 field19029 = Class8820.field39745;
   public static final Class6408[] field19030 = new Class6408[]{
      Block.method11539(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      Block.method11539(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      Block.method11539(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      Block.method11539(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      Block.method11539(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      Block.method11539(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      Block.method11539(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   public Class3394(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field19029, Integer.valueOf(0)));
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field19030[var1.<Integer>method23463(field19029)];
   }

   @Override
   public ActionResultType method11505(Class7380 var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, Class8711 var6) {
      if (var2.field9020) {
         ItemStack var9 = var4.getHeldItem(var5);
         if (this.method12005(var2, var3, var1, var4).isSuccessOrConsume()) {
            return ActionResultType.field14818;
         }

         if (var9.method32105()) {
            return ActionResultType.field14819;
         }
      }

      return this.method12005(var2, var3, var1, var4);
   }

   private ActionResultType method12005(Class1660 var1, BlockPos var2, Class7380 var3, PlayerEntity var4) {
      if (var4.method2933(false)) {
         var4.method2911(Class8876.field40141);
         var4.method2932().method37569(2, 0.1F);
         int var7 = var3.<Integer>method23463(field19029);
         if (var7 >= 6) {
            var1.method6728(var2, false);
         } else {
            var1.method6725(var2, var3.method23465(field19029, Integer.valueOf(var7 + 1)), 3);
         }

         return ActionResultType.field14818;
      } else {
         return ActionResultType.field14820;
      }
   }

   @Override
   public Class7380 method11491(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return var2 == Direction.field672 && !var1.method23443(var4, var5)
         ? Blocks.AIR.method11579()
         : super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method11492(Class7380 var1, Class1662 var2, BlockPos var3) {
      return var2.method6738(var3.method8313()).method23384().method31086();
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field19029);
   }

   @Override
   public int method11649(Class7380 var1, World var2, BlockPos var3) {
      return (7 - var1.<Integer>method23463(field19029)) * 2;
   }

   @Override
   public boolean method11648(Class7380 var1) {
      return true;
   }

   @Override
   public boolean method11494(Class7380 var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}
