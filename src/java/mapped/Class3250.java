package mapped;

import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Optional;

public class Class3250 extends Class3198 implements Class3245 {
   public static final Class8552<Class82> field18713 = Class8820.field39764;
   public static final Class8551 field18714 = Class8820.field39701;
   public static final Class6408 field18715 = Class3209.method11539(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   public static final Class6408 field18716 = Class3209.method11539(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   public static final Class6408 field18717 = Class3209.method11539(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   public static final Class6408 field18718 = Class3209.method11539(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   public static final Class6408 field18719 = Class3209.method11539(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   public static final Class6408 field18720 = Class8022.method27432(field18715, field18716, field18718);
   public static final Class6408 field18721 = Class8022.method27432(field18715, field18717, field18719);
   public static final Class6408 field18722 = Class8022.method27432(field18715, field18716, field18717);
   public static final Class6408 field18723 = Class8022.method27432(field18715, field18718, field18719);
   private final Class112 field18724;

   public Class3250(Class112 var1, Class7929 var2) {
      super(var2);
      this.field18724 = var1;
      this.method11578(this.field18612.method35393().method23465(field18713, Class82.field206).method23465(field18714, Boolean.valueOf(false)));
   }

   @Nullable
   public static Direction method11678(Class1665 var0, BlockPos var1) {
      Class7380 var4 = var0.method6738(var1);
      return !(var4.method23383() instanceof Class3250) ? null : var4.<Direction>method23463(field18484);
   }

   @Override
   public Class2274 method11505(Class7380 var1, Class1655 var2, BlockPos var3, PlayerEntity var4, Class79 var5, Class8711 var6) {
      if (!var2.field9020) {
         if (var1.<Class82>method23463(field18713) != Class82.field205) {
            var3 = var3.method8349(var1.<Direction>method23463(field18484));
            var1 = var2.method6738(var3);
            if (!var1.method23448(this)) {
               return Class2274.field14819;
            }
         }

         if (method11679(var2)) {
            if (!var1.<Boolean>method23463(field18714)) {
               var4.method2752(var3).ifLeft(var1x -> {
                  if (var1x != null) {
                     var4.method2785(var1x.method8769(), true);
                  }
               });
               return Class2274.field14818;
            } else {
               if (!this.method11680(var2, var3)) {
                  var4.method2785(new TranslationTextComponent("block.minecraft.bed.occupied"), true);
               }

               return Class2274.field14818;
            }
         } else {
            var2.method6728(var3, false);
            BlockPos var9 = var3.method8349(var1.<Direction>method23463(field18484).method536());
            if (var2.method6738(var9).method23448(this)) {
               var2.method6728(var9, false);
            }

            var2.method6757(
               (Entity)null,
               Class8654.method31128(),
               (Class5924)null,
               (double)var3.method8304() + 0.5,
               (double)var3.getY() + 0.5,
               (double)var3.method8306() + 0.5,
               5.0F,
               true,
               Class2141.field14016
            );
            return Class2274.field14818;
         }
      } else {
         return Class2274.field14819;
      }
   }

   public static boolean method11679(Class1655 var0) {
      return var0.method6812().method36881();
   }

   private boolean method11680(Class1655 var1, BlockPos var2) {
      List var5 = var1.<Class1042>method6772(Class1042.class, new Class6488(var2), Class880::method3176);
      if (!var5.isEmpty()) {
         ((Class1042)var5.get(0)).method2907();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method11567(Class1655 var1, BlockPos var2, Entity var3, float var4) {
      super.method11567(var1, var2, var3, var4 * 0.5F);
   }

   @Override
   public void method11568(Class1665 var1, Entity var2) {
      if (!var2.method3333()) {
         this.method11681(var2);
      } else {
         super.method11568(var1, var2);
      }
   }

   private void method11681(Entity var1) {
      Vector3d var4 = var1.method3433();
      if (var4.field18049 < 0.0) {
         double var5 = !(var1 instanceof Class880) ? 0.8 : 1.0;
         var1.method3435(var4.field18048, -var4.field18049 * 0.66F * var5, var4.field18050);
      }
   }

   @Override
   public Class7380 method11491(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var2 != method11682(var1.<Class82>method23463(field18713), var1.<Direction>method23463(field18484))) {
         return super.method11491(var1, var2, var3, var4, var5, var6);
      } else {
         return var3.method23448(this) && var3.method23463(field18713) != var1.method23463(field18713)
            ? var1.method23465(field18714, var3.<Boolean>method23463(field18714))
            : Class8487.field36387.method11579();
      }
   }

   private static Direction method11682(Class82 var0, Direction var1) {
      return var0 != Class82.field206 ? var1.method536() : var1;
   }

   @Override
   public void method11574(Class1655 var1, BlockPos var2, Class7380 var3, PlayerEntity var4) {
      if (!var1.field9020 && var4.method2801()) {
         Class82 var7 = var3.<Class82>method23463(field18713);
         if (var7 == Class82.field206) {
            BlockPos var8 = var2.method8349(method11682(var7, var3.<Direction>method23463(field18484)));
            Class7380 var9 = var1.method6738(var8);
            if (var9.method23383() == this && var9.<Class82>method23463(field18713) == Class82.field205) {
               var1.method6725(var8, Class8487.field36387.method11579(), 35);
               var1.method6869(var4, 2001, var8, Class3209.method11535(var9));
            }
         }
      }

      super.method11574(var1, var2, var3, var4);
   }

   @Nullable
   @Override
   public Class7380 method11495(Class5909 var1) {
      Direction var4 = var1.method18350();
      BlockPos var5 = var1.method18345();
      BlockPos var6 = var5.method8349(var4);
      return !var1.method18360().method6738(var6).method23441(var1) ? null : this.method11579().method23465(field18484, var4);
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      Direction var7 = method11683(var1).method536();
      switch (Class8903.field40297[var7.ordinal()]) {
         case 1:
            return field18720;
         case 2:
            return field18721;
         case 3:
            return field18722;
         default:
            return field18723;
      }
   }

   public static Direction method11683(Class7380 var0) {
      Direction var3 = var0.<Direction>method23463(field18484);
      return var0.method23463(field18713) != Class82.field205 ? var3 : var3.method536();
   }

   public static Class1895 method11684(Class7380 var0) {
      Class82 var3 = var0.<Class82>method23463(field18713);
      return var3 != Class82.field205 ? Class1895.field11111 : Class1895.field11110;
   }

   private static boolean method11685(Class1665 var0, BlockPos var1) {
      return var0.method6738(var1.method8313()).method23383() instanceof Class3250;
   }

   public static Optional<Vector3d> method11686(Class8992<?> var0, Class1668 var1, BlockPos var2, float var3) {
      Direction var6 = var1.method6738(var2).<Direction>method23463(field18484);
      Direction var7 = var6.method537();
      Direction var8 = !var7.method557(var3) ? var7 : var7.method536();
      if (!method11685(var1, var2)) {
         int[][] var9 = method11692(var6, var8);
         Optional var10 = method11688(var0, var1, var2, var9, true);
         return !var10.isPresent() ? method11688(var0, var1, var2, var9, false) : var10;
      } else {
         return method11687(var0, var1, var2, var6, var8);
      }
   }

   private static Optional<Vector3d> method11687(Class8992<?> var0, Class1668 var1, BlockPos var2, Direction var3, Direction var4) {
      int[][] var7 = method11693(var3, var4);
      Optional var8 = method11688(var0, var1, var2, var7, true);
      if (!var8.isPresent()) {
         BlockPos var9 = var2.method8313();
         Optional var10 = method11688(var0, var1, var9, var7, true);
         if (!var10.isPresent()) {
            int[][] var11 = method11694(var3);
            Optional var12 = method11688(var0, var1, var2, var11, true);
            if (!var12.isPresent()) {
               Optional var13 = method11688(var0, var1, var2, var7, false);
               if (!var13.isPresent()) {
                  Optional var14 = method11688(var0, var1, var9, var7, false);
                  return !var14.isPresent() ? method11688(var0, var1, var2, var11, false) : var14;
               } else {
                  return var13;
               }
            } else {
               return var12;
            }
         } else {
            return var10;
         }
      } else {
         return var8;
      }
   }

   private static Optional<Vector3d> method11688(Class8992<?> var0, Class1668 var1, BlockPos var2, int[][] var3, boolean var4) {
      Mutable var7 = new Mutable();

      for (int[] var11 : var3) {
         var7.method8372(var2.method8304() + var11[0], var2.getY(), var2.method8306() + var11[1]);
         Vector3d var12 = Class4527.method14428(var0, var1, var7, var4);
         if (var12 != null) {
            return Optional.<Vector3d>of(var12);
         }
      }

      return Optional.<Vector3d>empty();
   }

   @Override
   public Class2315 method11689(Class7380 var1) {
      return Class2315.field15863;
   }

   @Override
   public Class1855 method11526(Class7380 var1) {
      return Class1855.field9886;
   }

   @Override
   public void method11489(Class7558<Class3209, Class7380> var1) {
      var1.method24737(field18484, field18713, field18714);
   }

   @Override
   public Class944 method11646(Class1665 var1) {
      return new Class967(this.field18724);
   }

   @Override
   public void method11563(Class1655 var1, BlockPos var2, Class7380 var3, Class880 var4, Class8848 var5) {
      super.method11563(var1, var2, var3, var4, var5);
      if (!var1.field9020) {
         BlockPos var8 = var2.method8349(var3.<Direction>method23463(field18484));
         var1.method6725(var8, var3.method23465(field18713, Class82.field205), 3);
         var1.method6964(var2, Class8487.field36387);
         var3.method23424(var1, var2, 3);
      }
   }

   public Class112 method11690() {
      return this.field18724;
   }

   @Override
   public long method11691(Class7380 var1, BlockPos var2) {
      BlockPos var5 = var2.method8350(var1.<Direction>method23463(field18484), var1.method23463(field18713) != Class82.field205 ? 1 : 0);
      return Class9679.method37810(var5.method8304(), var2.getY(), var5.method8306());
   }

   @Override
   public boolean method11494(Class7380 var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }

   private static int[][] method11692(Direction var0, Direction var1) {
      return (int[][])ArrayUtils.addAll(method11693(var0, var1), method11694(var0));
   }

   private static int[][] method11693(Direction var0, Direction var1) {
      return new int[][]{
         {var1.method539(), var1.method541()},
         {var1.method539() - var0.method539(), var1.method541() - var0.method541()},
         {var1.method539() - var0.method539() * 2, var1.method541() - var0.method541() * 2},
         {-var0.method539() * 2, -var0.method541() * 2},
         {-var1.method539() - var0.method539() * 2, -var1.method541() - var0.method541() * 2},
         {-var1.method539() - var0.method539(), -var1.method541() - var0.method541()},
         {-var1.method539(), -var1.method541()},
         {-var1.method539() + var0.method539(), -var1.method541() + var0.method541()},
         {var0.method539(), var0.method541()},
         {var1.method539() + var0.method539(), var1.method541() + var0.method541()}
      };
   }

   private static int[][] method11694(Direction var0) {
      return new int[][]{{0, 0}, {-var0.method539(), -var0.method541()}};
   }
}
