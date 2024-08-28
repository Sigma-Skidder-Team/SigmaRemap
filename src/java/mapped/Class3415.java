package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class Class3415 extends Block implements Class3207 {
   private static String[] field19105;
   public static final Class8551 field19106 = Class8820.field39714;
   public static final Class8552<Class184> field19107 = Class8820.field39726;
   public static final Class8552<Class184> field19108 = Class8820.field39727;
   public static final Class8552<Class184> field19109 = Class8820.field39728;
   public static final Class8552<Class184> field19110 = Class8820.field39729;
   public static final Class8551 field19111 = Class8820.field39710;
   private final Map<Class7380, Class6408> field19112;
   private final Map<Class7380, Class6408> field19113;
   private static final Class6408 field19114 = Block.method11539(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final Class6408 field19115 = Block.method11539(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final Class6408 field19116 = Block.method11539(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final Class6408 field19117 = Block.method11539(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final Class6408 field19118 = Block.method11539(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   public Class3415(Class7929 var1) {
      super(var1);
      this.method11578(
         this.field18612
            .method35393()
            .method23465(field19106, Boolean.valueOf(true))
            .method23465(field19108, Class184.field667)
            .method23465(field19107, Class184.field667)
            .method23465(field19109, Class184.field667)
            .method23465(field19110, Class184.field667)
            .method23465(field19111, Boolean.valueOf(false))
      );
      this.field19112 = this.method12054(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.field19113 = this.method12054(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static Class6408 method12053(Class6408 var0, Class184 var1, Class6408 var2, Class6408 var3) {
      if (var1 != Class184.field669) {
         return var1 != Class184.field668 ? var0 : Class8022.method27431(var0, var2);
      } else {
         return Class8022.method27431(var0, var3);
      }
   }

   private Map<Class7380, Class6408> method12054(float var1, float var2, float var3, float var4, float var5, float var6) {
      float var9 = 8.0F - var1;
      float var10 = 8.0F + var1;
      float var11 = 8.0F - var2;
      float var12 = 8.0F + var2;
      Class6408 var13 = Block.method11539((double)var9, 0.0, (double)var9, (double)var10, (double)var3, (double)var10);
      Class6408 var14 = Block.method11539((double)var11, (double)var4, 0.0, (double)var12, (double)var5, (double)var12);
      Class6408 var15 = Block.method11539((double)var11, (double)var4, (double)var11, (double)var12, (double)var5, 16.0);
      Class6408 var16 = Block.method11539(0.0, (double)var4, (double)var11, (double)var12, (double)var5, (double)var12);
      Class6408 var17 = Block.method11539((double)var11, (double)var4, (double)var11, 16.0, (double)var5, (double)var12);
      Class6408 var18 = Block.method11539((double)var11, (double)var4, 0.0, (double)var12, (double)var6, (double)var12);
      Class6408 var19 = Block.method11539((double)var11, (double)var4, (double)var11, (double)var12, (double)var6, 16.0);
      Class6408 var20 = Block.method11539(0.0, (double)var4, (double)var11, (double)var12, (double)var6, (double)var12);
      Class6408 var21 = Block.method11539((double)var11, (double)var4, (double)var11, 16.0, (double)var6, (double)var12);
      Builder var22 = ImmutableMap.builder();

      for (Boolean var24 : field19106.method30474()) {
         for (Class184 var26 : field19107.method30474()) {
            for (Class184 var28 : field19108.method30474()) {
               for (Class184 var30 : field19110.method30474()) {
                  for (Class184 var32 : field19109.method30474()) {
                     Class6408 var33 = Class8022.method27425();
                     var33 = method12053(var33, var26, var17, var21);
                     var33 = method12053(var33, var30, var16, var20);
                     var33 = method12053(var33, var28, var14, var18);
                     var33 = method12053(var33, var32, var15, var19);
                     if (var24) {
                        var33 = Class8022.method27431(var33, var13);
                     }

                     Class7380 var34 = this.method11579()
                        .method23465(field19106, var24)
                        .method23465(field19107, var26)
                        .method23465(field19110, var30)
                        .method23465(field19108, var28)
                        .method23465(field19109, var32);
                     var22.put(var34.method23465(field19111, Boolean.valueOf(false)), var33);
                     var22.put(var34.method23465(field19111, Boolean.valueOf(true)), var33);
                  }
               }
            }
         }
      }

      return var22.build();
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return this.field19112.get(var1);
   }

   @Override
   public Class6408 method11502(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return this.field19113.get(var1);
   }

   @Override
   public boolean method11494(Class7380 var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }

   private boolean method12055(Class7380 var1, boolean var2, Direction var3) {
      Block var6 = var1.method23383();
      boolean var7 = var6 instanceof Class3199 && Class3199.method11507(var1, var3);
      return var1.method23446(Class7645.field32764) || !method11545(var6) && var2 || var6 instanceof Class3237 || var7;
   }

   @Override
   public Class7380 method11495(Class5909 var1) {
      Class1655 var4 = var1.method18360();
      BlockPos var5 = var1.method18345();
      Class7379 var6 = var1.method18360().method6739(var1.method18345());
      BlockPos var7 = var5.method8341();
      BlockPos var8 = var5.method8347();
      BlockPos var9 = var5.method8343();
      BlockPos var10 = var5.method8345();
      BlockPos var11 = var5.method8311();
      Class7380 var12 = var4.method6738(var7);
      Class7380 var13 = var4.method6738(var8);
      Class7380 var14 = var4.method6738(var9);
      Class7380 var15 = var4.method6738(var10);
      Class7380 var16 = var4.method6738(var11);
      boolean var17 = this.method12055(var12, var12.method23454(var4, var7, Direction.SOUTH), Direction.SOUTH);
      boolean var18 = this.method12055(var13, var13.method23454(var4, var8, Direction.WEST), Direction.WEST);
      boolean var19 = this.method12055(var14, var14.method23454(var4, var9, Direction.NORTH), Direction.NORTH);
      boolean var20 = this.method12055(var15, var15.method23454(var4, var10, Direction.EAST), Direction.EAST);
      Class7380 var21 = this.method11579().method23465(field19111, Boolean.valueOf(var6.method23472() == Class9479.field44066));
      return this.method12060(var4, var21, var11, var16, var17, var18, var19, var20);
   }

   @Override
   public Class7380 method11491(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var1.<Boolean>method23463(field19111)) {
         var4.method6861().method20726(var5, Class9479.field44066, Class9479.field44066.method25057(var4));
      }

      if (var2 != Direction.field672) {
         return var2 != Direction.field673 ? this.method12059(var4, var5, var1, var6, var3, var2) : this.method12058(var4, var1, var6, var3);
      } else {
         return super.method11491(var1, var2, var3, var4, var5, var6);
      }
   }

   private static boolean method12056(Class7380 var0, Class8550<Class184> var1) {
      return var0.method23463(var1) != Class184.field667;
   }

   private static boolean method12057(Class6408 var0, Class6408 var1) {
      return !Class8022.method27435(var1, var0, Class9477.field44041);
   }

   private Class7380 method12058(Class1662 var1, Class7380 var2, BlockPos var3, Class7380 var4) {
      boolean var7 = method12056(var2, field19108);
      boolean var8 = method12056(var2, field19107);
      boolean var9 = method12056(var2, field19109);
      boolean var10 = method12056(var2, field19110);
      return this.method12060(var1, var2, var3, var4, var7, var8, var9, var10);
   }

   private Class7380 method12059(Class1662 var1, BlockPos var2, Class7380 var3, BlockPos var4, Class7380 var5, Direction var6) {
      Direction var9 = var6.method536();
      boolean var10 = var6 != Direction.NORTH ? method12056(var3, field19108) : this.method12055(var5, var5.method23454(var1, var4, var9), var9);
      boolean var11 = var6 != Direction.EAST ? method12056(var3, field19107) : this.method12055(var5, var5.method23454(var1, var4, var9), var9);
      boolean var12 = var6 != Direction.SOUTH ? method12056(var3, field19109) : this.method12055(var5, var5.method23454(var1, var4, var9), var9);
      boolean var13 = var6 != Direction.WEST ? method12056(var3, field19110) : this.method12055(var5, var5.method23454(var1, var4, var9), var9);
      BlockPos var14 = var2.method8311();
      Class7380 var15 = var1.method6738(var14);
      return this.method12060(var1, var3, var14, var15, var10, var11, var12, var13);
   }

   private Class7380 method12060(Class1662 var1, Class7380 var2, BlockPos var3, Class7380 var4, boolean var5, boolean var6, boolean var7, boolean var8) {
      Class6408 var11 = var4.method23414(var1, var3).method19526(Direction.field672);
      Class7380 var12 = this.method12062(var2, var5, var6, var7, var8, var11);
      return var12.method23465(field19106, Boolean.valueOf(this.method12061(var12, var4, var11)));
   }

   private boolean method12061(Class7380 var1, Class7380 var2, Class6408 var3) {
      boolean var6 = var2.method23383() instanceof Class3415 && var2.<Boolean>method23463(field19106);
      if (!var6) {
         Class184 var7 = var1.<Class184>method23463(field19108);
         Class184 var8 = var1.<Class184>method23463(field19109);
         Class184 var9 = var1.<Class184>method23463(field19107);
         Class184 var10 = var1.<Class184>method23463(field19110);
         boolean var11 = var8 == Class184.field667;
         boolean var12 = var10 == Class184.field667;
         boolean var13 = var9 == Class184.field667;
         boolean var14 = var7 == Class184.field667;
         boolean var15 = var14 && var11 && var12 && var13 || var14 != var11 || var12 != var13;
         if (var15) {
            return true;
         } else {
            boolean var16 = var7 == Class184.field669 && var8 == Class184.field669 || var9 == Class184.field669 && var10 == Class184.field669;
            return var16 ? false : var2.method23383().method11540(Class7645.field32803) || method12057(var3, field19114);
         }
      } else {
         return true;
      }
   }

   private Class7380 method12062(Class7380 var1, boolean var2, boolean var3, boolean var4, boolean var5, Class6408 var6) {
      return var1.method23465(field19108, this.method12063(var2, var6, field19115))
         .method23465(field19107, this.method12063(var3, var6, field19118))
         .method23465(field19109, this.method12063(var4, var6, field19116))
         .method23465(field19110, this.method12063(var5, var6, field19117));
   }

   private Class184 method12063(boolean var1, Class6408 var2, Class6408 var3) {
      if (!var1) {
         return Class184.field667;
      } else {
         return !method12057(var2, var3) ? Class184.field668 : Class184.field669;
      }
   }

   @Override
   public Class7379 method11498(Class7380 var1) {
      return !var1.<Boolean>method23463(field19111) ? super.method11498(var1) : Class9479.field44066.method25078(false);
   }

   @Override
   public boolean method11493(Class7380 var1, Class1665 var2, BlockPos var3) {
      return !var1.<Boolean>method23463(field19111);
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field19106, field19108, field19107, field19110, field19109, field19111);
   }

   @Override
   public Class7380 method11500(Class7380 var1, Class80 var2) {
      switch (Class6962.field30164[var2.ordinal()]) {
         case 1:
            return var1.method23465(field19108, var1.<Class184>method23463(field19109))
               .method23465(field19107, var1.<Class184>method23463(field19110))
               .method23465(field19109, var1.<Class184>method23463(field19108))
               .method23465(field19110, var1.<Class184>method23463(field19107));
         case 2:
            return var1.method23465(field19108, var1.<Class184>method23463(field19107))
               .method23465(field19107, var1.<Class184>method23463(field19109))
               .method23465(field19109, var1.<Class184>method23463(field19110))
               .method23465(field19110, var1.<Class184>method23463(field19108));
         case 3:
            return var1.method23465(field19108, var1.<Class184>method23463(field19110))
               .method23465(field19107, var1.<Class184>method23463(field19108))
               .method23465(field19109, var1.<Class184>method23463(field19107))
               .method23465(field19110, var1.<Class184>method23463(field19109));
         default:
            return var1;
      }
   }

   @Override
   public Class7380 method11501(Class7380 var1, Class2089 var2) {
      switch (Class6962.field30165[var2.ordinal()]) {
         case 1:
            return var1.method23465(field19108, var1.<Class184>method23463(field19109)).method23465(field19109, var1.<Class184>method23463(field19108));
         case 2:
            return var1.method23465(field19107, var1.<Class184>method23463(field19110)).method23465(field19110, var1.<Class184>method23463(field19107));
         default:
            return super.method11501(var1, var2);
      }
   }
}
