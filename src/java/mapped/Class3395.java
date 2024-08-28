package mapped;

import java.util.Random;

public class Class3395 extends Block {
   private static String[] field19031;
   private static final Class8554 field19032 = Class8820.field39759;

   public Class3395(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field19032, Integer.valueOf(0)));
   }

   @Override
   public void method11595(World var1, Class7380 var2, Class8711 var3, Class882 var4) {
      int var7 = method12006(var1, var2, var3, var4);
      Entity var8 = var4.method3460();
      if (var8 instanceof ServerPlayerEntity) {
         ServerPlayerEntity var9 = (ServerPlayerEntity)var8;
         var9.method2911(Class8876.field40177);
         CriteriaTriggers.field44502.method15161(var9, var4, var3.method31419(), var7);
      }
   }

   private static int method12006(Class1660 var0, Class7380 var1, Class8711 var2, Entity var3) {
      int var6 = method12007(var2, var2.method31419());
      int var7 = !(var3 instanceof AbstractArrowEntity) ? 8 : 20;
      if (!var0.method6860().method20718(var2.method31423(), var1.method23383())) {
         method12008(var0, var1, var6, var2.method31423(), var7);
      }

      return var6;
   }

   private static int method12007(Class8711 var0, Vector3d var1) {
      Direction var4 = var0.method31424();
      double var5 = Math.abs(MathHelper.method37808(var1.field18048) - 0.5);
      double var7 = Math.abs(MathHelper.method37808(var1.field18049) - 0.5);
      double var9 = Math.abs(MathHelper.method37808(var1.field18050) - 0.5);
      Class113 var11 = var4.method544();
      double var12;
      if (var11 != Class113.field414) {
         if (var11 != Class113.field415) {
            var12 = Math.max(var7, var9);
         } else {
            var12 = Math.max(var5, var7);
         }
      } else {
         var12 = Math.max(var5, var9);
      }

      return Math.max(1, MathHelper.method37774(15.0 * MathHelper.method37778((0.5 - var12) / 0.5, 0.0, 1.0)));
   }

   private static void method12008(Class1660 var0, Class7380 var1, int var2, BlockPos var3, int var4) {
      var0.method6725(var3, var1.method23465(field19032, Integer.valueOf(var2)), 3);
      var0.method6860().method20726(var3, var1.method23383(), var4);
   }

   @Override
   public void method11522(Class7380 var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (var1.<Integer>method23463(field19032) != 0) {
         var2.method6725(var3, var1.method23465(field19032, Integer.valueOf(0)), 3);
      }
   }

   @Override
   public int method11514(Class7380 var1, Class1665 var2, BlockPos var3, Direction var4) {
      return var1.<Integer>method23463(field19032);
   }

   @Override
   public boolean method11516(Class7380 var1) {
      return true;
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field19032);
   }

   @Override
   public void method11589(Class7380 var1, World var2, BlockPos var3, Class7380 var4, boolean var5) {
      if (!var2.method6714()
         && !var1.method23448(var4.method23383())
         && var1.<Integer>method23463(field19032) > 0
         && !var2.method6860().method20718(var3, this)) {
         var2.method6725(var3, var1.method23465(field19032, Integer.valueOf(0)), 18);
      }
   }
}
