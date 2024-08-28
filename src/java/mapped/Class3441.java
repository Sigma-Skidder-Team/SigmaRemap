package mapped;

import java.util.Random;
import javax.annotation.Nullable;

public class Class3441 extends Block {
   private static String[] field19240;
   private static final Class6408 field19241 = Block.method11539(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final Class6408 field19242 = Block.method11539(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final Class8554 field19243 = Class8820.field39749;
   public static final Class8554 field19244 = Class8820.field39748;

   public Class3441(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field19243, Integer.valueOf(0)).method23465(field19244, Integer.valueOf(1)));
   }

   @Override
   public void method11561(Class1655 var1, BlockPos var2, Entity var3) {
      this.method12112(var1, var2, var3, 100);
      super.method11561(var1, var2, var3);
   }

   @Override
   public void method11567(Class1655 var1, BlockPos var2, Entity var3, float var4) {
      if (!(var3 instanceof Class1038)) {
         this.method12112(var1, var2, var3, 3);
      }

      super.method11567(var1, var2, var3, var4);
   }

   private void method12112(Class1655 var1, BlockPos var2, Entity var3, int var4) {
      if (this.method12117(var1, var3) && !var1.field9020 && var1.field9016.nextInt(var4) == 0) {
         Class7380 var7 = var1.method6738(var2);
         if (var7.method23448(Blocks.field36964)) {
            this.method12113(var1, var2, var7);
         }
      }
   }

   private void method12113(Class1655 var1, BlockPos var2, Class7380 var3) {
      var1.method6742((PlayerEntity)null, var2, Class6067.field27167, Class2266.field14732, 0.7F, 0.9F + var1.field9016.nextFloat() * 0.2F);
      int var6 = var3.<Integer>method23463(field19244);
      if (var6 > 1) {
         var1.method6725(var2, var3.method23465(field19244, Integer.valueOf(var6 - 1)), 2);
         var1.method6999(2001, var2, Block.method11535(var3));
      } else {
         var1.method7179(var2, false);
      }
   }

   @Override
   public void method11484(Class7380 var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (this.method12116(var2) && method12114(var2, var3)) {
         int var7 = var1.<Integer>method23463(field19243);
         if (var7 >= 2) {
            var2.method6742((PlayerEntity)null, var3, Class6067.field27169, Class2266.field14732, 0.7F, 0.9F + var4.nextFloat() * 0.2F);
            var2.method6728(var3, false);

            for (int var8 = 0; var8 < var1.<Integer>method23463(field19244); var8++) {
               var2.method6999(2001, var3, Block.method11535(var1));
               Class1088 var9 = Class8992.field41096.method33215(var2);
               var9.method4770(-24000);
               var9.method5041(var3);
               var9.method3273((double)var3.method8304() + 0.3 + (double)var8 * 0.2, (double)var3.getY(), (double)var3.method8306() + 0.3, 0.0F, 0.0F);
               var2.method6916(var9);
            }
         } else {
            var2.method6742((PlayerEntity)null, var3, Class6067.field27168, Class2266.field14732, 0.7F, 0.9F + var4.nextFloat() * 0.2F);
            var2.method6725(var3, var1.method23465(field19243, Integer.valueOf(var7 + 1)), 2);
         }
      }
   }

   public static boolean method12114(Class1665 var0, BlockPos var1) {
      return method12115(var0, var1.method8313());
   }

   public static boolean method12115(Class1665 var0, BlockPos var1) {
      return var0.method6738(var1).method23446(Class7645.field32761);
   }

   @Override
   public void method11589(Class7380 var1, Class1655 var2, BlockPos var3, Class7380 var4, boolean var5) {
      if (method12114(var2, var3) && !var2.field9020) {
         var2.method6999(2005, var3, 0);
      }
   }

   private boolean method12116(Class1655 var1) {
      float var4 = var1.method7001(1.0F);
      return (double)var4 < 0.69 && (double)var4 > 0.65 ? true : var1.field9016.nextInt(500) == 0;
   }

   @Override
   public void method11562(Class1655 var1, PlayerEntity var2, BlockPos var3, Class7380 var4, Class944 var5, ItemStack var6) {
      super.method11562(var1, var2, var3, var4, var5, var6);
      this.method12113(var1, var3, var4);
   }

   @Override
   public boolean method11497(Class7380 var1, Class5909 var2) {
      return var2.method18357().method32107() == this.method11581() && var1.<Integer>method23463(field19244) < 4 ? true : super.method11497(var1, var2);
   }

   @Nullable
   @Override
   public Class7380 method11495(Class5909 var1) {
      Class7380 var4 = var1.method18360().method6738(var1.method18345());
      return !var4.method23448(this)
         ? super.method11495(var1)
         : var4.method23465(field19244, Integer.valueOf(Math.min(4, var4.<Integer>method23463(field19244) + 1)));
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return var1.<Integer>method23463(field19244) <= 1 ? field19241 : field19242;
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field19243, field19244);
   }

   private boolean method12117(Class1655 var1, Entity var2) {
      if (var2 instanceof Class1088 || var2 instanceof Class1114) {
         return false;
      } else {
         return !(var2 instanceof Class880) ? false : var2 instanceof PlayerEntity || var1.method6789().method17135(Class5462.field24224);
      }
   }
}
