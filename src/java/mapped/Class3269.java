package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;

import java.util.Map;
import java.util.Set;

public class Class3269 extends Class3264 {
   private static String[] field18765;
   private static final Set<Class3209> field18766 = ImmutableSet.of(
      Class8487.field36891,
      Class8487.field37076,
      Class8487.field36777,
      Class8487.field36963,
      Class8487.field37116,
      Class8487.field37085,
      new Class3209[]{
         Class8487.field36452,
         Class8487.field36453,
         Class8487.field36449,
         Class8487.field36446,
         Class8487.field36447,
         Class8487.field36451,
         Class8487.field36450,
         Class8487.field36448
      }
   );
   public static final Map<Class3209, Class7380> field18767 = Maps.newHashMap(
      ImmutableMap.of(
         Class8487.field36395,
         Class8487.field36540.method11579(),
         Class8487.field36885,
         Class8487.field36540.method11579(),
         Class8487.field36396,
         Class8487.field36540.method11579(),
         Class8487.field36397,
         Class8487.field36396.method11579()
      )
   );

   public Class3269(Class2283 var1, int var2, float var3, Class5643 var4) {
      super((float)var2, var3, var1, field18766, var4);
   }

   @Override
   public Class2274 method11707(Class5911 var1) {
      Class1655 var4 = var1.method18360();
      BlockPos var5 = var1.method18345();
      if (var1.method18354() != Direction.field672 && var4.method6738(var5.method8311()).method23393()) {
         Class7380 var6 = field18767.get(var4.method6738(var5).method23383());
         if (var6 != null) {
            PlayerEntity var7 = var1.method18358();
            var4.method6742(var7, var5, Class6067.field26651, Class2266.field14732, 1.0F, 1.0F);
            if (!var4.field9020) {
               var4.method6725(var5, var6, 11);
               if (var7 != null) {
                  var1.method18357().method32121(1, var7, var1x -> var1x.method3185(var1.method18359()));
               }
            }

            return Class2274.method9002(var4.field9020);
         }
      }

      return Class2274.field14820;
   }
}
