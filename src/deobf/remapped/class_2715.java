package remapped;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public enum class_2715 {
   field_13271(
      0,
      "red",
      class_8606.field_44138,
      class_8606.field_44133,
      class_8606.field_44102,
      class_8606.field_44093,
      class_8606.field_44117,
      class_8606.field_44145,
      class_8606.field_44134
   ),
   field_13276(1, "snow", class_8606.field_44119, class_8606.field_44083, class_8606.field_44125);

   private static final class_2715[] field_13269 = Arrays.<class_2715>stream(values())
      .sorted(Comparator.comparingInt(class_2715::method_12219))
      .<class_2715>toArray(class_2715[]::new);
   private static final Map<String, class_2715> field_13274 = Arrays.<class_2715>stream(values())
      .collect(Collectors.toMap(class_2715::method_12224, var0 -> (class_2715)var0));
   private final int field_13273;
   private final String field_13272;
   private final List<class_5621<class_6325>> field_13277;

   private class_2715(int var3, String var4, class_5621<class_6325>... var5) {
      this.field_13273 = var3;
      this.field_13272 = var4;
      this.field_13277 = Arrays.<class_5621<class_6325>>asList(var5);
   }

   public String method_12224() {
      return this.field_13272;
   }

   public int method_12219() {
      return this.field_13273;
   }

   public static class_2715 method_12222(String var0) {
      return field_13274.getOrDefault(var0, field_13271);
   }

   public static class_2715 method_12220(int var0) {
      if (var0 < 0 || var0 > field_13269.length) {
         var0 = 0;
      }

      return field_13269[var0];
   }

   public static class_2715 method_12223(Optional<class_5621<class_6325>> var0) {
      return var0.isPresent() && field_13276.field_13277.contains(var0.get()) ? field_13276 : field_13271;
   }
}
