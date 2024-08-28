package mapped;

import com.google.common.collect.ImmutableMap.Builder;
import com.google.common.collect.Sets;

import java.util.Map;
import java.util.Set;

public class Class3265 extends Class3264 {
   private static String[] field18755;
   private static final Set<Class8649> field18756 = Sets.newHashSet(
      new Class8649[]{Class8649.field38956, Class8649.field38957, Class8649.field38936, Class8649.field38938, Class8649.field38959, Class8649.field38973}
   );
   private static final Set<Class3209> field18757 = Sets.newHashSet(
      new Class3209[]{
         Class8487.field36549,
         Class8487.field37053,
         Class8487.field36695,
         Class8487.field36696,
         Class8487.field36697,
         Class8487.field36698,
         Class8487.field36700,
         Class8487.field36699,
         Class8487.field37105,
         Class8487.field37106
      }
   );
   public static final Map<Class3209, Class3209> field18758 = new Builder()
      .put(Class8487.field36434, Class8487.field36440)
      .put(Class8487.field36422, Class8487.field36433)
      .put(Class8487.field36439, Class8487.field36445)
      .put(Class8487.field36427, Class8487.field36432)
      .put(Class8487.field36438, Class8487.field36444)
      .put(Class8487.field36426, Class8487.field36431)
      .put(Class8487.field36436, Class8487.field36442)
      .put(Class8487.field36424, Class8487.field36429)
      .put(Class8487.field36437, Class8487.field36443)
      .put(Class8487.field36425, Class8487.field36430)
      .put(Class8487.field36435, Class8487.field36441)
      .put(Class8487.field36423, Class8487.field36428)
      .put(Class8487.field37070, Class8487.field37071)
      .put(Class8487.field37072, Class8487.field37073)
      .put(Class8487.field37079, Class8487.field37080)
      .put(Class8487.field37081, Class8487.field37082)
      .build();

   public Class3265(Class2283 var1, float var2, float var3, Class5643 var4) {
      super(var2, var3, var1, field18757, var4);
   }

   @Override
   public float method11708(Class8848 var1, Class7380 var2) {
      Class8649 var5 = var2.method23384();
      return !field18756.contains(var5) ? super.method11708(var1, var2) : this.field18752;
   }

   @Override
   public Class2274 method11707(Class5911 var1) {
      Class1655 var4 = var1.method18360();
      BlockPos var5 = var1.method18345();
      Class7380 var6 = var4.method6738(var5);
      Class3209 var7 = field18758.get(var6.method23383());
      if (var7 == null) {
         return Class2274.field14820;
      } else {
         PlayerEntity var8 = var1.method18358();
         var4.method6742(var8, var5, Class6067.field26364, Class2266.field14732, 1.0F, 1.0F);
         if (!var4.field9020) {
            var4.method6725(var5, var7.method11579().method23465(Class3386.field18994, var6.<Class113>method23463(Class3386.field18994)), 11);
            if (var8 != null) {
               var1.method18357().method32121(1, var8, var1x -> var1x.method3185(var1.method18359()));
            }
         }

         return Class2274.method9002(var4.field9020);
      }
   }
}
