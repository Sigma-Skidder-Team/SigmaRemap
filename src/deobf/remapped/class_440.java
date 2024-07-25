package remapped;

import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public enum class_440 {
   field_1847(1.0F),
   field_1840(0.75F),
   field_1842(0.5F),
   field_1844(0.25F);

   private static final List<class_440> field_1845 = Stream.<class_440>of(values())
      .sorted(Comparator.comparingDouble(var0 -> (double)var0.field_1841))
      .collect(ImmutableList.toImmutableList());
   private final float field_1841;

   private class_440(float var3) {
      this.field_1841 = var3;
   }

   public static class_440 method_2138(float var0) {
      for (class_440 var4 : field_1845) {
         if (var0 < var4.field_1841) {
            return var4;
         }
      }

      return field_1847;
   }
}
