package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import javax.annotation.Nullable;
import java.util.Map;

public class Class3229 extends Class3227 {
   private static String[] field18668;
   public static final Class8553 field18669 = Class3198.field18484;
   private static final Map<Direction, Class6408> field18670 = Maps.newEnumMap(
      ImmutableMap.of(
         Direction.NORTH,
         Block.method11539(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         Direction.SOUTH,
         Block.method11539(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         Direction.WEST,
         Block.method11539(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         Direction.EAST,
         Block.method11539(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   public Class3229(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field18669, Direction.NORTH).method23465(field18663, Boolean.valueOf(true)));
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field18670.get(var1.<Direction>method23463(field18669));
   }

   @Override
   public Class7380 method11500(Class7380 var1, Class80 var2) {
      return var1.method23465(field18669, var2.method252(var1.<Direction>method23463(field18669)));
   }

   @Override
   public Class7380 method11501(Class7380 var1, Class2089 var2) {
      return var1.method23395(var2.method8749(var1.<Direction>method23463(field18669)));
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field18669, field18663);
   }

   @Override
   public Class7380 method11491(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var1.<Boolean>method23463(field18663)) {
         var4.method6861().method20726(var5, Class9479.field44066, Class9479.field44066.method25057(var4));
      }

      return var2.method536() == var1.method23463(field18669) && !var1.method23443(var4, var5) ? Blocks.AIR.method11579() : var1;
   }

   @Override
   public boolean method11492(Class7380 var1, Class1662 var2, BlockPos var3) {
      Direction var6 = var1.<Direction>method23463(field18669);
      BlockPos var7 = var3.method8349(var6.method536());
      Class7380 var8 = var2.method6738(var7);
      return var8.method23454(var2, var7, var6);
   }

   @Nullable
   @Override
   public Class7380 method11495(Class5909 var1) {
      Class7380 var4 = super.method11495(var1);
      World var5 = var1.method18360();
      BlockPos var6 = var1.method18345();
      Direction[] var7 = var1.method18349();

      for (Direction var11 : var7) {
         if (var11.method544().method324()) {
            var4 = var4.method23465(field18669, var11.method536());
            if (var4.method23443(var5, var6)) {
               return var4;
            }
         }
      }

      return null;
   }
}
