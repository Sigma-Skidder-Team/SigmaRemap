package mapped;

import com.google.common.collect.ImmutableList;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public enum Class2286 {
   field15131(1.0F),
   field15132(0.75F),
   field15133(0.5F),
   field15134(0.25F);

   private static final List<Class2286> field15135 = Stream.<Class2286>of(values())
      .sorted(Comparator.comparingDouble(var0 -> (double)var0.field15136))
      .collect(ImmutableList.toImmutableList());
   private final float field15136;
   private static final Class2286[] field15137 = new Class2286[]{field15131, field15132, field15133, field15134};

   private Class2286(float var3) {
      this.field15136 = var3;
   }

   public static Class2286 method9024(float var0) {
      for (Class2286 var4 : field15135) {
         if (var0 < var4.field15136) {
            return var4;
         }
      }

      return field15131;
   }
}
