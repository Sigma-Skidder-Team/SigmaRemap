package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Function3;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class Class9546 {
   private static final Map<ResourceLocation, Class9546> field44450 = Maps.newHashMap();
   public static final Class9546 field44451 = new Class9546(
      new ResourceLocation("nether"),
      (var0, var1, var2) -> new Class1686(var2, ImmutableList.of(
               Pair.of(new Class7150(0.0F, 0.0F, 0.0F, 0.0F, 0.0F), () -> var1.method9189(Class9495.field44129)),
               Pair.of(new Class7150(0.0F, -0.5F, 0.0F, 0.0F, 0.0F), () -> var1.method9189(Class9495.field44196)),
               Pair.of(new Class7150(0.4F, 0.0F, 0.0F, 0.0F, 0.0F), () -> var1.method9189(Class9495.field44197)),
               Pair.of(new Class7150(0.0F, 0.5F, 0.0F, 0.0F, 0.375F), () -> var1.method9189(Class9495.field44198)),
               Pair.of(new Class7150(-0.5F, 0.0F, 0.0F, 0.0F, 0.175F), () -> var1.method9189(Class9495.field44199))
            ), Optional.of(Pair.of(var1, var0))
         )
   );
   private final ResourceLocation field44452;
   private final Function3<Class9546, Class2348<Class8907>, Long, Class1686> field44453;

   public Class9546(ResourceLocation var1, Function3<Class9546, Class2348<Class8907>, Long, Class1686> var2) {
      this.field44452 = var1;
      this.field44453 = var2;
      field44450.put(var1, this);
   }

   public Class1686 method36963(Class2348<Class8907> var1, long var2) {
      return (Class1686)this.field44453.apply(this, var1, var2);
   }

   // $VF: synthetic method
   public static ResourceLocation method36970(Class9546 var0) {
      return var0.field44452;
   }

   // $VF: synthetic method
   public static Map method36971() {
      return field44450;
   }
}
