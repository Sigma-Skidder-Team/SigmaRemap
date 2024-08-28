package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class Class3493 extends Class3194 {
   private static String[] field18470;
   public static final Class8553 field19361 = Class3198.field18484;
   private final Class3462 field19362;
   private static final Map<Direction, Class6408> field19363 = Maps.newEnumMap(
      ImmutableMap.of(
         Direction.SOUTH,
         Class3209.method11539(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         Direction.WEST,
         Class3209.method11539(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         Direction.NORTH,
         Class3209.method11539(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         Direction.EAST,
         Class3209.method11539(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );

   public Class3493(Class3462 var1, Class7929 var2) {
      super(var2);
      this.method11578(this.field18612.method35393().method23465(field19361, Direction.NORTH));
      this.field19362 = var1;
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field19363.get(var1.<Direction>method23463(field19361));
   }

   @Override
   public Class7380 method11491(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return !var3.method23448(this.field19362) && var2 == var1.method23463(field19361)
         ? this.field19362.method12146().method11579().method23465(Class3486.field19347, Integer.valueOf(7))
         : super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method11490(Class7380 var1, Class1665 var2, BlockPos var3) {
      return var1.method23448(Class8487.field36540);
   }

   public Class3257 method12188() {
      if (this.field19362 != Class8487.field36579) {
         return this.field19362 != Class8487.field36631 ? Class8514.field37222 : Class8514.field37960;
      } else {
         return Class8514.field37959;
      }
   }

   @Override
   public Class8848 method11569(Class1665 var1, BlockPos var2, Class7380 var3) {
      return new Class8848(this.method12188());
   }

   @Override
   public Class7380 method11500(Class7380 var1, Class80 var2) {
      return var1.method23465(field19361, var2.method252(var1.<Direction>method23463(field19361)));
   }

   @Override
   public Class7380 method11501(Class7380 var1, Class2089 var2) {
      return var1.method23395(var2.method8749(var1.<Direction>method23463(field19361)));
   }

   @Override
   public void method11489(Class7558<Class3209, Class7380> var1) {
      var1.method24737(field19361);
   }
}
