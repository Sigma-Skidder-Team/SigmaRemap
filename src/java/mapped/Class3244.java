package mapped;

import javax.annotation.Nullable;
import java.util.Optional;
import java.util.Random;

public class Class3244 extends Class3241 implements Class3207 {
   private static String[] field18696;
   public static final Class6408 field18697 = Class3209.method11539(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final Class8551 field18698 = Class8820.field39699;
   public static final Class8551 field18699 = Class8820.field39706;
   public static final Class8551 field18700 = Class8820.field39710;
   public static final Class8553 field18701 = Class8820.field39722;
   private static final Class6408 field18702 = Class3209.method11539(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private final boolean field18703;
   private final int field18704;

   public Class3244(boolean var1, int var2, Class7929 var3) {
      super(var3);
      this.field18703 = var1;
      this.field18704 = var2;
      this.method11578(
         this.field18612
            .method35393()
            .method23465(field18698, Boolean.valueOf(true))
            .method23465(field18699, Boolean.valueOf(false))
            .method23465(field18700, Boolean.valueOf(false))
            .method23465(field18701, Direction.NORTH)
      );
   }

   @Override
   public Class2274 method11505(Class7380 var1, Class1655 var2, BlockPos var3, PlayerEntity var4, Class79 var5, Class8711 var6) {
      Class944 var9 = var2.method6759(var3);
      if (var9 instanceof Class945) {
         Class945 var10 = (Class945)var9;
         Class8848 var11 = var4.method3094(var5);
         Optional var12 = var10.method3797(var11);
         if (var12.isPresent()) {
            if (!var2.field9020 && var10.method3798(!var4.field4919.field29609 ? var11 : var11.method32126(), ((Class4850)var12.get()).method14977())) {
               var4.method2911(Class8876.field40168);
               return Class2274.field14818;
            }

            return Class2274.field14819;
         }
      }

      return Class2274.field14820;
   }

   @Override
   public void method11523(Class7380 var1, Class1655 var2, BlockPos var3, Entity var4) {
      if (!var4.method3249() && var1.<Boolean>method23463(field18698) && var4 instanceof Class880 && !Class7858.method26332((Class880)var4)) {
         var4.method2741(Class8654.field38992, (float)this.field18704);
      }

      super.method11523(var1, var2, var3, var4);
   }

   @Override
   public void method11513(Class7380 var1, Class1655 var2, BlockPos var3, Class7380 var4, boolean var5) {
      if (!var1.method23448(var4.method23383())) {
         Class944 var8 = var2.method6759(var3);
         if (var8 instanceof Class945) {
            Class7236.method22724(var2, var3, ((Class945)var8).method3795());
         }

         super.method11513(var1, var2, var3, var4, var5);
      }
   }

   @Nullable
   @Override
   public Class7380 method11495(Class5909 var1) {
      Class1655 var4 = var1.method18360();
      BlockPos var5 = var1.method18345();
      boolean var6 = var4.method6739(var5).method23472() == Class9479.field44066;
      return this.method11579()
         .method23465(field18700, Boolean.valueOf(var6))
         .method23465(field18699, Boolean.valueOf(this.method11651(var4.method6738(var5.method8313()))))
         .method23465(field18698, Boolean.valueOf(!var6))
         .method23465(field18701, var1.method18350());
   }

   @Override
   public Class7380 method11491(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var1.<Boolean>method23463(field18700)) {
         var4.method6861().method20726(var5, Class9479.field44066, Class9479.field44066.method25057(var4));
      }

      return var2 != Direction.field672
         ? super.method11491(var1, var2, var3, var4, var5, var6)
         : var1.method23465(field18699, Boolean.valueOf(this.method11651(var3)));
   }

   private boolean method11651(Class7380 var1) {
      return var1.method23448(Class8487.field36777);
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field18697;
   }

   @Override
   public Class1855 method11526(Class7380 var1) {
      return Class1855.field9887;
   }

   @Override
   public void method11512(Class7380 var1, Class1655 var2, BlockPos var3, Random var4) {
      if (var1.<Boolean>method23463(field18698)) {
         if (var4.nextInt(10) == 0) {
            var2.method6745(
               (double)var3.method8304() + 0.5,
               (double)var3.getY() + 0.5,
               (double)var3.method8306() + 0.5,
               Class6067.field26432,
               Class2266.field14732,
               0.5F + var4.nextFloat(),
               var4.nextFloat() * 0.7F + 0.6F,
               false
            );
         }

         if (this.field18703 && var4.nextInt(5) == 0) {
            for (int var7 = 0; var7 < var4.nextInt(1) + 1; var7++) {
               var2.method6746(
                  Class7940.field34086,
                  (double)var3.method8304() + 0.5,
                  (double)var3.getY() + 0.5,
                  (double)var3.method8306() + 0.5,
                  (double)(var4.nextFloat() / 2.0F),
                  5.0E-5,
                  (double)(var4.nextFloat() / 2.0F)
               );
            }
         }
      }
   }

   public static void method11652(Class1660 var0, BlockPos var1, Class7380 var2) {
      if (var0.method6714()) {
         for (int var5 = 0; var5 < 20; var5++) {
            method11653((Class1655)var0, var1, var2.<Boolean>method23463(field18699), true);
         }
      }

      Class944 var6 = var0.method6759(var1);
      if (var6 instanceof Class945) {
         ((Class945)var6).method3800();
      }
   }

   @Override
   public boolean method11532(Class1660 var1, BlockPos var2, Class7380 var3, Class7379 var4) {
      if (!var3.<Boolean>method23463(Class8820.field39710) && var4.method23472() == Class9479.field44066) {
         boolean var7 = var3.<Boolean>method23463(field18698);
         if (var7) {
            if (!var1.method6714()) {
               var1.method6742((PlayerEntity)null, var2, Class6067.field26611, Class2266.field14732, 1.0F, 1.0F);
            }

            method11652(var1, var2, var3);
         }

         var1.method6725(var2, var3.method23465(field18700, Boolean.valueOf(true)).method23465(field18698, Boolean.valueOf(false)), 3);
         var1.method6861().method20726(var2, var4.method23472(), var4.method23472().method25057(var1));
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method11595(Class1655 var1, Class7380 var2, Class8711 var3, Class882 var4) {
      if (!var1.field9020 && var4.method3327()) {
         Entity var7 = var4.method3460();
         boolean var8 = var7 == null || var7 instanceof PlayerEntity || var1.method6789().method17135(Class5462.field24224);
         if (var8 && !var2.<Boolean>method23463(field18698) && !var2.<Boolean>method23463(field18700)) {
            BlockPos var9 = var3.method31423();
            var1.method6725(var9, var2.method23465(Class8820.field39699, Boolean.valueOf(true)), 11);
         }
      }
   }

   public static void method11653(Class1655 var0, BlockPos var1, boolean var2, boolean var3) {
      Random var6 = var0.method6814();
      Class7435 var7 = !var2 ? Class7940.field34106 : Class7940.field34107;
      var0.method6749(
         var7,
         true,
         (double)var1.method8304() + 0.5 + var6.nextDouble() / 3.0 * (double)(!var6.nextBoolean() ? -1 : 1),
         (double)var1.getY() + var6.nextDouble() + var6.nextDouble(),
         (double)var1.method8306() + 0.5 + var6.nextDouble() / 3.0 * (double)(!var6.nextBoolean() ? -1 : 1),
         0.0,
         0.07,
         0.0
      );
      if (var3) {
         var0.method6746(
            Class7940.field34092,
            (double)var1.method8304() + 0.25 + var6.nextDouble() / 2.0 * (double)(!var6.nextBoolean() ? -1 : 1),
            (double)var1.getY() + 0.4,
            (double)var1.method8306() + 0.25 + var6.nextDouble() / 2.0 * (double)(!var6.nextBoolean() ? -1 : 1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean method11654(Class1655 var0, BlockPos var1) {
      for (int var4 = 1; var4 <= 5; var4++) {
         BlockPos var5 = var1.method8340(var4);
         Class7380 var6 = var0.method6738(var5);
         if (method11655(var6)) {
            return true;
         }

         boolean var7 = Class8022.method27435(field18702, var6.method23415(var0, var1, Class4832.method14947()), Class9477.field44045);
         if (var7) {
            Class7380 var8 = var0.method6738(var5.method8313());
            return method11655(var8);
         }
      }

      return false;
   }

   public static boolean method11655(Class7380 var0) {
      return var0.method23462(field18698) && var0.method23446(Class7645.field32809) && var0.<Boolean>method23463(field18698);
   }

   @Override
   public Class7379 method11498(Class7380 var1) {
      return !var1.<Boolean>method23463(field18700) ? super.method11498(var1) : Class9479.field44066.method25078(false);
   }

   @Override
   public Class7380 method11500(Class7380 var1, Class80 var2) {
      return var1.method23465(field18701, var2.method252(var1.<Direction>method23463(field18701)));
   }

   @Override
   public Class7380 method11501(Class7380 var1, Class2089 var2) {
      return var1.method23395(var2.method8749(var1.<Direction>method23463(field18701)));
   }

   @Override
   public void method11489(Class7558<Class3209, Class7380> var1) {
      var1.method24737(field18698, field18699, field18700, field18701);
   }

   @Override
   public Class944 method11646(Class1665 var1) {
      return new Class945();
   }

   @Override
   public boolean method11494(Class7380 var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }

   public static boolean method11656(Class7380 var0) {
      return var0.method23447(Class7645.field32809, var0x -> var0x.method23462(Class8820.field39710) && var0x.method23462(Class8820.field39699))
         && !var0.<Boolean>method23463(Class8820.field39710)
         && !var0.<Boolean>method23463(Class8820.field39699);
   }
}
