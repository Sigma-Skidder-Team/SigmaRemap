package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Random;
import javax.annotation.Nullable;

public class Class3382 extends Class3381 {
   private static String[] field18982;
   public static final Class8553 field18985 = Class3198.field18484;
   private static final Map<Direction, Class6408> field18986 = Maps.newEnumMap(
      ImmutableMap.of(
         Direction.NORTH,
         Class3209.method11539(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         Direction.SOUTH,
         Class3209.method11539(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         Direction.WEST,
         Class3209.method11539(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         Direction.EAST,
         Class3209.method11539(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   public Class3382(Class7929 var1, Class7436 var2) {
      super(var1, var2);
      this.method11578(this.field18612.method35393().method23465(field18985, Direction.NORTH));
   }

   @Override
   public String method11566() {
      return this.method11581().method11719();
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return method11980(var1);
   }

   public static Class6408 method11980(Class7380 var0) {
      return field18986.get(var0.<Direction>method23463(field18985));
   }

   @Override
   public boolean method11492(Class7380 var1, Class1662 var2, BlockPos var3) {
      Direction var6 = var1.<Direction>method23463(field18985);
      BlockPos var7 = var3.method8349(var6.method536());
      Class7380 var8 = var2.method6738(var7);
      return var8.method23454(var2, var7, var6);
   }

   @Nullable
   @Override
   public Class7380 method11495(Class5909 var1) {
      Class7380 var4 = this.method11579();
      Class1655 var5 = var1.method18360();
      BlockPos var6 = var1.method18345();
      Direction[] var7 = var1.method18349();

      for (Direction var11 : var7) {
         if (var11.method544().method324()) {
            Direction var12 = var11.method536();
            var4 = var4.method23465(field18985, var12);
            if (var4.method23443(var5, var6)) {
               return var4;
            }
         }
      }

      return null;
   }

   @Override
   public Class7380 method11491(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return var2.method536() == var1.method23463(field18985) && !var1.method23443(var4, var5) ? Class8487.field36387.method11579() : var1;
   }

   @Override
   public void method11512(Class7380 var1, Class1655 var2, BlockPos var3, Random var4) {
      Direction var7 = var1.<Direction>method23463(field18985);
      double var8 = (double)var3.method8304() + 0.5;
      double var10 = (double)var3.getY() + 0.7;
      double var12 = (double)var3.method8306() + 0.5;
      double var14 = 0.22;
      double var16 = 0.27;
      Direction var18 = var7.method536();
      var2.method6746(Class7940.field34092, var8 + 0.27 * (double)var18.method539(), var10 + 0.22, var12 + 0.27 * (double)var18.method541(), 0.0, 0.0, 0.0);
      var2.method6746(this.field18984, var8 + 0.27 * (double)var18.method539(), var10 + 0.22, var12 + 0.27 * (double)var18.method541(), 0.0, 0.0, 0.0);
   }

   @Override
   public Class7380 method11500(Class7380 var1, Class80 var2) {
      return var1.method23465(field18985, var2.method252(var1.<Direction>method23463(field18985)));
   }

   @Override
   public Class7380 method11501(Class7380 var1, Class2089 var2) {
      return var1.method23395(var2.method8749(var1.<Direction>method23463(field18985)));
   }

   @Override
   public void method11489(Class7558<Class3209, Class7380> var1) {
      var1.method24737(field18985);
   }
}
