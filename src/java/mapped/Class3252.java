package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import java.util.Map;

public class Class3252 extends Class3251 {
   private static String[] field18726;
   public static final Class8553 field18727 = Class3198.field18484;
   private static final Map<Direction, Class6408> field18728 = Maps.newEnumMap(
      ImmutableMap.of(
         Direction.NORTH,
         Block.method11539(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         Direction.SOUTH,
         Block.method11539(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         Direction.EAST,
         Block.method11539(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         Direction.WEST,
         Block.method11539(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   public Class3252(Class2137 var1, Class7929 var2) {
      super(var1, var2);
      this.method11578(this.field18612.method35393().method23465(field18727, Direction.NORTH));
   }

   @Override
   public String method11566() {
      return this.method11581().method11719();
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field18728.get(var1.<Direction>method23463(field18727));
   }

   @Override
   public Class7380 method11495(Class5909 var1) {
      Class7380 var4 = this.method11579();
      Class1655 var5 = var1.method18360();
      BlockPos var6 = var1.method18345();
      Direction[] var7 = var1.method18349();

      for (Direction var11 : var7) {
         if (var11.method544().method324()) {
            Direction var12 = var11.method536();
            var4 = var4.method23465(field18727, var12);
            if (!var5.method6738(var6.method8349(var11)).method23441(var1)) {
               return var4;
            }
         }
      }

      return null;
   }

   @Override
   public Class7380 method11500(Class7380 var1, Class80 var2) {
      return var1.method23465(field18727, var2.method252(var1.<Direction>method23463(field18727)));
   }

   @Override
   public Class7380 method11501(Class7380 var1, Class2089 var2) {
      return var1.method23395(var2.method8749(var1.<Direction>method23463(field18727)));
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field18727);
   }
}
