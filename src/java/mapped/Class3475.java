package mapped;

import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import java.util.Random;

public class Class3475 extends Block implements Class3476 {
   private static String[] field19325;
   public static final Class8554 field19326 = Class8820.field39752;
   public static final Object2FloatMap<Class3303> field19327 = new Object2FloatOpenHashMap();
   private static final Class6408 field19328 = Class8022.method27426();
   private static final Class6408[] field19329 = Util.<Class6408[]>method38508(
      new Class6408[9],
      var0 -> {
         for (int var3 = 0; var3 < 8; var3++) {
            var0[var3] = Class8022.method27433(
               field19328, Block.method11539(2.0, (double)Math.max(2, 1 + var3 * 2), 2.0, 14.0, 16.0, 14.0), Class9477.field44041
            );
         }

         var0[8] = var0[7];
      }
   );

   public static void method12162() {
      field19327.defaultReturnValue(-1.0F);
      float var2 = 0.3F;
      float var3 = 0.5F;
      float var4 = 0.65F;
      float var5 = 0.85F;
      float var6 = 1.0F;
      method12163(0.3F, Class8514.field37294);
      method12163(0.3F, Class8514.field37291);
      method12163(0.3F, Class8514.field37292);
      method12163(0.3F, Class8514.field37296);
      method12163(0.3F, Class8514.field37295);
      method12163(0.3F, Class8514.field37293);
      method12163(0.3F, Class8514.field37245);
      method12163(0.3F, Class8514.field37246);
      method12163(0.3F, Class8514.field37247);
      method12163(0.3F, Class8514.field37248);
      method12163(0.3F, Class8514.field37249);
      method12163(0.3F, Class8514.field37250);
      method12163(0.3F, Class8514.field38112);
      method12163(0.3F, Class8514.field37958);
      method12163(0.3F, Class8514.field37311);
      method12163(0.3F, Class8514.field37356);
      method12163(0.3F, Class8514.field37960);
      method12163(0.3F, Class8514.field37959);
      method12163(0.3F, Class8514.field37314);
      method12163(0.3F, Class8514.field38170);
      method12163(0.3F, Class8514.field37841);
      method12163(0.5F, Class8514.field37898);
      method12163(0.5F, Class8514.field37599);
      method12163(0.5F, Class8514.field37427);
      method12163(0.5F, Class8514.field37355);
      method12163(0.5F, Class8514.field37473);
      method12163(0.5F, Class8514.field37352);
      method12163(0.5F, Class8514.field37353);
      method12163(0.5F, Class8514.field37354);
      method12163(0.5F, Class8514.field37957);
      method12163(0.65F, Class8514.field37315);
      method12163(0.65F, Class8514.field37485);
      method12163(0.65F, Class8514.field37438);
      method12163(0.65F, Class8514.field37439);
      method12163(0.65F, Class8514.field37472);
      method12163(0.65F, Class8514.field37795);
      method12163(0.65F, Class8514.field38111);
      method12163(0.65F, Class8514.field38052);
      method12163(0.65F, Class8514.field37916);
      method12163(0.65F, Class8514.field38053);
      method12163(0.65F, Class8514.field37842);
      method12163(0.65F, Class8514.field37346);
      method12163(0.65F, Class8514.field37347);
      method12163(0.65F, Class8514.field37468);
      method12163(0.65F, Class8514.field37348);
      method12163(0.65F, Class8514.field37349);
      method12163(0.65F, Class8514.field37970);
      method12163(0.65F, Class8514.field37350);
      method12163(0.65F, Class8514.field37351);
      method12163(0.65F, Class8514.field38173);
      method12163(0.65F, Class8514.field37333);
      method12163(0.65F, Class8514.field37334);
      method12163(0.65F, Class8514.field37335);
      method12163(0.65F, Class8514.field37336);
      method12163(0.65F, Class8514.field37337);
      method12163(0.65F, Class8514.field37338);
      method12163(0.65F, Class8514.field37339);
      method12163(0.65F, Class8514.field37340);
      method12163(0.65F, Class8514.field37341);
      method12163(0.65F, Class8514.field37342);
      method12163(0.65F, Class8514.field37343);
      method12163(0.65F, Class8514.field37344);
      method12163(0.65F, Class8514.field37345);
      method12163(0.65F, Class8514.field37312);
      method12163(0.65F, Class8514.field37595);
      method12163(0.65F, Class8514.field37596);
      method12163(0.65F, Class8514.field37597);
      method12163(0.65F, Class8514.field37598);
      method12163(0.65F, Class8514.field37600);
      method12163(0.85F, Class8514.field37571);
      method12163(0.85F, Class8514.field37466);
      method12163(0.85F, Class8514.field37467);
      method12163(0.85F, Class8514.field37647);
      method12163(0.85F, Class8514.field37648);
      method12163(0.85F, Class8514.field37843);
      method12163(0.85F, Class8514.field38054);
      method12163(0.85F, Class8514.field37954);
      method12163(1.0F, Class8514.field37937);
      method12163(1.0F, Class8514.field38067);
   }

   private static void method12163(float var0, Class3303 var1) {
      field19327.put(var1.method11581(), var0);
   }

   public Class3475(Class7929 var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field19326, Integer.valueOf(0)));
   }

   public static void method12164(Class1655 var0, BlockPos var1, boolean var2) {
      Class7380 var5 = var0.method6738(var1);
      var0.method6745(
         (double)var1.method8304(),
         (double)var1.getY(),
         (double)var1.method8306(),
         !var2 ? Class6067.field26464 : Class6067.field26465,
         Class2266.field14732,
         1.0F,
         1.0F,
         false
      );
      double var6 = var5.method23412(var0, var1).method19522(Class113.field414, 0.5, 0.5) + 0.03125;
      double var8 = 0.13125F;
      double var10 = 0.7375F;
      Random var12 = var0.method6814();

      for (int var13 = 0; var13 < 10; var13++) {
         double var14 = var12.nextGaussian() * 0.02;
         double var16 = var12.nextGaussian() * 0.02;
         double var18 = var12.nextGaussian() * 0.02;
         var0.method6746(
            Class7940.field34079,
            (double)var1.method8304() + 0.13125F + 0.7375F * (double)var12.nextFloat(),
            (double)var1.getY() + var6 + (double)var12.nextFloat() * (1.0 - var6),
            (double)var1.method8306() + 0.13125F + 0.7375F * (double)var12.nextFloat(),
            var14,
            var16,
            var18
         );
      }
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field19329[var1.<Integer>method23463(field19326)];
   }

   @Override
   public Class6408 method11938(Class7380 var1, Class1665 var2, BlockPos var3) {
      return field19328;
   }

   @Override
   public Class6408 method11502(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field19329[0];
   }

   @Override
   public void method11589(Class7380 var1, Class1655 var2, BlockPos var3, Class7380 var4, boolean var5) {
      if (var1.<Integer>method23463(field19326) == 7) {
         var2.method6860().method20726(var3, var1.method23383(), 20);
      }
   }

   @Override
   public Class2274 method11505(Class7380 var1, Class1655 var2, BlockPos var3, PlayerEntity var4, Class79 var5, Class8711 var6) {
      int var9 = var1.<Integer>method23463(field19326);
      Class8848 var10 = var4.method3094(var5);
      if (var9 < 8 && field19327.containsKey(var10.method32107())) {
         if (var9 < 7 && !var2.field9020) {
            Class7380 var11 = method12168(var1, var2, var3, var10);
            var2.method6999(1500, var3, var1 == var11 ? 0 : 1);
            if (!var4.field4919.field29609) {
               var10.method32182(1);
            }
         }

         return Class2274.method9002(var2.field9020);
      } else if (var9 != 8) {
         return Class2274.field14820;
      } else {
         method12166(var1, var2, var3);
         return Class2274.method9002(var2.field9020);
      }
   }

   public static Class7380 method12165(Class7380 var0, Class1657 var1, Class8848 var2, BlockPos var3) {
      int var6 = var0.<Integer>method23463(field19326);
      if (var6 < 7 && field19327.containsKey(var2.method32107())) {
         Class7380 var7 = method12168(var0, var1, var3, var2);
         var2.method32182(1);
         return var7;
      } else {
         return var0;
      }
   }

   public static Class7380 method12166(Class7380 var0, Class1655 var1, BlockPos var2) {
      if (!var1.field9020) {
         float var5 = 0.7F;
         double var6 = (double)(var1.field9016.nextFloat() * 0.7F) + 0.15F;
         double var8 = (double)(var1.field9016.nextFloat() * 0.7F) + 0.060000002F + 0.6;
         double var10 = (double)(var1.field9016.nextFloat() * 0.7F) + 0.15F;
         Class1000 var12 = new Class1000(
            var1, (double)var2.method8304() + var6, (double)var2.getY() + var8, (double)var2.method8306() + var10, new Class8848(Class8514.field37934)
         );
         var12.method4131();
         var1.method6916(var12);
      }

      Class7380 var13 = method12167(var0, var1, var2);
      var1.method6742((PlayerEntity)null, var2, Class6067.field26463, Class2266.field14732, 1.0F, 1.0F);
      return var13;
   }

   private static Class7380 method12167(Class7380 var0, Class1660 var1, BlockPos var2) {
      Class7380 var5 = var0.method23465(field19326, Integer.valueOf(0));
      var1.method6725(var2, var5, 3);
      return var5;
   }

   private static Class7380 method12168(Class7380 var0, Class1660 var1, BlockPos var2, Class8848 var3) {
      int var6 = var0.<Integer>method23463(field19326);
      float var7 = field19327.getFloat(var3.method32107());
      if ((var6 != 0 || !(var7 > 0.0F)) && !(var1.method6814().nextDouble() < (double)var7)) {
         return var0;
      } else {
         int var8 = var6 + 1;
         Class7380 var9 = var0.method23465(field19326, Integer.valueOf(var8));
         var1.method6725(var2, var9, 3);
         if (var8 == 7) {
            var1.method6860().method20726(var2, var0.method23383(), 20);
         }

         return var9;
      }
   }

   @Override
   public void method11522(Class7380 var1, Class1657 var2, BlockPos var3, Random var4) {
      if (var1.<Integer>method23463(field19326) == 7) {
         var2.method6725(var3, var1.method23459(field19326), 3);
         var2.method6742((PlayerEntity)null, var3, Class6067.field26466, Class2266.field14732, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean method11648(Class7380 var1) {
      return true;
   }

   @Override
   public int method11649(Class7380 var1, Class1655 var2, BlockPos var3) {
      return var1.<Integer>method23463(field19326);
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field19326);
   }

   @Override
   public boolean method11494(Class7380 var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }

   @Override
   public Class930 method12169(Class7380 var1, Class1660 var2, BlockPos var3) {
      int var6 = var1.<Integer>method23463(field19326);
      return (Class930)(var6 != 8
         ? (Class930)(var6 >= 7 ? new Class976() : new Class975(var1, var2, var3))
         : new Class929(var1, var2, var3, new Class8848(Class8514.field37934)));
   }

   // $VF: synthetic method
   public static Class7380 method12171(Class7380 var0, Class1660 var1, BlockPos var2) {
      return method12167(var0, var1, var2);
   }

   // $VF: synthetic method
   public static Class7380 method12172(Class7380 var0, Class1660 var1, BlockPos var2, Class8848 var3) {
      return method12168(var0, var1, var2, var3);
   }
}
