package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class Class3361 extends Class3359 {
   private static String[] field18909;
   public static final Class8553 field18910 = Class3198.field18484;
   private static final Map<Direction, Class6408> field18911 = Maps.newEnumMap(
      ImmutableMap.of(
         Direction.NORTH,
         Block.method11539(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         Direction.SOUTH,
         Block.method11539(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         Direction.WEST,
         Block.method11539(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         Direction.EAST,
         Block.method11539(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   public Class3361(Class112 var1, AbstractBlock var2) {
      super(var1, var2);
      this.method11578(this.field18612.method35393().method23465(field18910, Direction.NORTH));
   }

   @Override
   public String method11566() {
      return this.method11581().method11719();
   }

   @Override
   public boolean method11492(Class7380 var1, Class1662 var2, BlockPos var3) {
      return var2.method6738(var3.method8349(var1.<Direction>method23463(field18910).method536())).method23384().method31086();
   }

   @Override
   public Class7380 method11491(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return var2 == var1.<Direction>method23463(field18910).method536() && !var1.method23443(var4, var5)
         ? Blocks.AIR.method11579()
         : super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field18911.get(var1.<Direction>method23463(field18910));
   }

   @Override
   public Class7380 method11495(Class5909 var1) {
      Class7380 var4 = this.method11579();
      World var5 = var1.method18360();
      BlockPos var6 = var1.method18345();
      Direction[] var7 = var1.method18349();

      for (Direction var11 : var7) {
         if (var11.method544().method324()) {
            Direction var12 = var11.method536();
            var4 = var4.method23465(field18910, var12);
            if (var4.method23443(var5, var6)) {
               return var4;
            }
         }
      }

      return null;
   }

   @Override
   public Class7380 method11500(Class7380 var1, Class80 var2) {
      return var1.method23465(field18910, var2.method252(var1.<Direction>method23463(field18910)));
   }

   @Override
   public Class7380 method11501(Class7380 var1, Class2089 var2) {
      return var1.method23395(var2.method8749(var1.<Direction>method23463(field18910)));
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field18910);
   }
}