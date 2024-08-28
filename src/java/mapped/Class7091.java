package mapped;

import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public class Class7091 extends Class7092 {
   private static String[] field30517;
   public static final Codec<Class7091> field30518 = Codec.unit(() -> Class7091.field30519);
   public static final Class7091 field30519 = new Class7091();
   private final Map<Class3209, Class3209> field30520 = Util.<Map<Class3209, Class3209>>method38508(Maps.newHashMap(), var0 -> {
      var0.put(Class8487.field36399, Class8487.field37130);
      var0.put(Class8487.field36526, Class8487.field37130);
      var0.put(Class8487.field36388, Class8487.field37134);
      var0.put(Class8487.field36615, Class8487.field37135);
      var0.put(Class8487.field36616, Class8487.field37135);
      var0.put(Class8487.field36551, Class8487.field37131);
      var0.put(Class8487.field37018, Class8487.field37131);
      var0.put(Class8487.field37020, Class8487.field37142);
      var0.put(Class8487.field36639, Class8487.field37139);
      var0.put(Class8487.field37016, Class8487.field37139);
      var0.put(Class8487.field36850, Class8487.field37133);
      var0.put(Class8487.field37032, Class8487.field37133);
      var0.put(Class8487.field36846, Class8487.field37143);
      var0.put(Class8487.field36845, Class8487.field37143);
      var0.put(Class8487.field36852, Class8487.field37138);
      var0.put(Class8487.field37030, Class8487.field37138);
      var0.put(Class8487.field37046, Class8487.field37140);
      var0.put(Class8487.field37044, Class8487.field37140);
      var0.put(Class8487.field36666, Class8487.field37132);
      var0.put(Class8487.field36667, Class8487.field37132);
      var0.put(Class8487.field36618, Class8487.field37137);
      var0.put(Class8487.field36617, Class8487.field37136);
      var0.put(Class8487.field36628, Class8487.field36629);
   });

   private Class7091() {
   }

   @Override
   public Class8266 method22068(Class1662 var1, BlockPos var2, BlockPos var3, Class8266 var4, Class8266 var5, Class9463 var6) {
      Class3209 var9 = this.field30520.get(var5.field35531.method23383());
      if (var9 != null) {
         Class7380 var10 = var5.field35531;
         Class7380 var11 = var9.method11579();
         if (var10.method23462(Class3421.field19131)) {
            var11 = var11.method23465(Class3421.field19131, var10.<Direction>method23463(Class3421.field19131));
         }

         if (var10.method23462(Class3421.field19132)) {
            var11 = var11.method23465(Class3421.field19132, var10.<Class99>method23463(Class3421.field19132));
         }

         if (var10.method23462(Class3208.field18605)) {
            var11 = var11.method23465(Class3208.field18605, var10.<Class86>method23463(Class3208.field18605));
         }

         return new Class8266(var5.field35530, var11, var5.field35532);
      } else {
         return var5;
      }
   }

   @Override
   public Class7525<?> method22069() {
      return Class7525.field32301;
   }
}
