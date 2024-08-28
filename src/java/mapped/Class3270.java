package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import java.util.Map;
import java.util.Set;

public class Class3270 extends Class3264 {
   private static String[] field18768;
   private static final Set<Block> field18769 = Sets.newHashSet(
      new Block[]{
         Blocks.CLAY,
         Blocks.field36396,
         Blocks.field36397,
         Blocks.field36398,
         Blocks.field36540,
         Blocks.field36395,
         Blocks.GRAVEL,
         Blocks.field36640,
         Blocks.SAND,
         Blocks.RED_SAND,
         Blocks.SNOW_BLOCK,
         Blocks.SNOW,
         Blocks.SOUL_SAND,
         Blocks.field36885,
         Blocks.field36945,
         Blocks.field36946,
         Blocks.field36947,
         Blocks.field36948,
         Blocks.field36949,
         Blocks.field36950,
         Blocks.field36951,
         Blocks.field36952,
         Blocks.field36953,
         Blocks.field36954,
         Blocks.field36955,
         Blocks.field36956,
         Blocks.field36957,
         Blocks.field36958,
         Blocks.field36959,
         Blocks.field36960,
         Blocks.SOUL_SOIL
      }
   );
   public static final Map<Block, Class7380> field18770 = Maps.newHashMap(ImmutableMap.of(Blocks.field36395, Blocks.field36885.method11579()));

   public Class3270(Class2283 var1, float var2, float var3, Class5643 var4) {
      super(var2, var3, var1, field18769, var4);
   }

   @Override
   public boolean method11715(Class7380 var1) {
      return var1.method23448(Blocks.SNOW) || var1.method23448(Blocks.SNOW_BLOCK);
   }

   @Override
   public Class2274 method11707(Class5911 var1) {
      Class1655 var4 = var1.method18360();
      BlockPos var5 = var1.method18345();
      Class7380 var6 = var4.method6738(var5);
      if (var1.method18354() == Direction.field672) {
         return Class2274.field14820;
      } else {
         PlayerEntity var7 = var1.method18358();
         Class7380 var8 = field18770.get(var6.method23383());
         Class7380 var9 = null;
         if (var8 != null && var4.method6738(var5.method8311()).method23393()) {
            var4.method6742(var7, var5, Class6067.field27042, Class2266.field14732, 1.0F, 1.0F);
            var9 = var8;
         } else if (var6.method23383() instanceof Class3244 && var6.<Boolean>method23463(Class3244.field18698)) {
            if (!var4.method6714()) {
               var4.method6869((PlayerEntity)null, 1009, var5, 0);
            }

            Class3244.method11652(var4, var5, var6);
            var9 = var6.method23465(Class3244.field18698, Boolean.valueOf(false));
         }

         if (var9 == null) {
            return Class2274.field14820;
         } else {
            if (!var4.field9020) {
               var4.method6725(var5, var9, 11);
               if (var7 != null) {
                  var1.method18357().method32121(1, var7, var1x -> var1x.method3185(var1.method18359()));
               }
            }

            return Class2274.method9002(var4.field9020);
         }
      }
   }
}
