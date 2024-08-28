package mapped;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;

public class Class8396 {
   private static String[] field36031;
   private final Class2352<Class8040> field36032 = new Class2352<Class8040>(32);
   private final Map<Class3209, Set<Class8550<?>>> field36033 = Maps.newHashMap();

   public static Class8396 method29463() {
      Class8396 var2 = new Class8396();
      var2.method29466(
         (var0, var1, var2x, var3) -> var1 != null && var2x != null
               ? Class8527.method30242(var1, var0.method23463(Class3456.field19276) != Class84.field209 ? var2x : var2x.method8313())
               : -1,
         Class8487.field36802,
         Class8487.field36801
      );
      var2.method29468(Class3456.field19276, Class8487.field36802, Class8487.field36801);
      var2.method29466(
         (var0, var1, var2x, var3) -> var1 != null && var2x != null ? Class8527.method30242(var1, var2x) : Class6406.method19509(0.5, 1.0),
         Class8487.field36395,
         Class8487.field36483,
         Class8487.field36482,
         Class8487.field36675
      );
      var2.method29466((var0, var1, var2x, var3) -> Class9441.method36293(), Class8487.field36447);
      var2.method29466((var0, var1, var2x, var3) -> Class9441.method36294(), Class8487.field36448);
      var2.method29466(
         (var0, var1, var2x, var3) -> var1 != null && var2x != null ? Class8527.method30243(var1, var2x) : Class9441.method36295(),
         Class8487.field36446,
         Class8487.field36449,
         Class8487.field36450,
         Class8487.field36451,
         Class8487.field36636
      );
      var2.method29466(
         (var0, var1, var2x, var3) -> var1 != null && var2x != null ? Class8527.method30244(var1, var2x) : -1,
         Class8487.field36413,
         Class8487.field37013,
         Class8487.field36648
      );
      var2.method29466((var0, var1, var2x, var3) -> Class3222.method11629(var0.<Integer>method23463(Class3222.field18651)), Class8487.field36535);
      var2.method29468(Class3222.field18651, Class8487.field36535);
      var2.method29466((var0, var1, var2x, var3) -> var1 != null && var2x != null ? Class8527.method30242(var1, var2x) : -1, Class8487.field36576);
      var2.method29466((var0, var1, var2x, var3) -> 14731036, Class8487.field36633, Class8487.field36632);
      var2.method29466((var0, var1, var2x, var3) -> {
         int var6 = var0.<Integer>method23463(Class3486.field19347);
         int var7 = var6 * 32;
         int var8 = 255 - var6 * 8;
         int var9 = var6 * 4;
         return var7 << 16 | var8 << 8 | var9;
      }, Class8487.field36635, Class8487.field36634);
      var2.method29468(Class3486.field19347, Class8487.field36635, Class8487.field36634);
      var2.method29466((var0, var1, var2x, var3) -> var1 != null && var2x != null ? 2129968 : 7455580, Class8487.field36641);
      return var2;
   }

   public int method29464(Class7380 var1, Class1655 var2, BlockPos var3) {
      Class8040 var6 = this.field36032.method9172(Class2348.field16072.method9171(var1.method23383()));
      if (var6 == null) {
         Class7210 var7 = var1.method23394(var2, var3);
         return var7 == null ? -1 : var7.field31006;
      } else {
         return var6.method27608(var1, (Class1663)null, (BlockPos)null, 0);
      }
   }

   public int method29465(Class7380 var1, Class1663 var2, BlockPos var3, int var4) {
      Class8040 var7 = this.field36032.method9172(Class2348.field16072.method9171(var1.method23383()));
      return var7 != null ? var7.method27608(var1, var2, var3, var4) : -1;
   }

   public void method29466(Class8040 var1, Class3209... var2) {
      for (Class3209 var8 : var2) {
         this.field36032.method9268(var1, Class2348.field16072.method9171(var8));
      }
   }

   private void method29467(Set<Class8550<?>> var1, Class3209... var2) {
      for (Class3209 var8 : var2) {
         this.field36033.put(var8, var1);
      }
   }

   private void method29468(Class8550<?> var1, Class3209... var2) {
      this.method29467(ImmutableSet.of(var1), var2);
   }

   public Set<Class8550<?>> method29469(Class3209 var1) {
      return this.field36033.getOrDefault(var1, ImmutableSet.of());
   }
}
