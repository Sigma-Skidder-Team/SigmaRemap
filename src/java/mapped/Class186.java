package mapped;

import java.util.*;
import java.util.stream.Collectors;

public enum Class186 {
   field691(
      0,
      "red",
      Class9495.field44126,
      Class9495.field44140,
      Class9495.field44177,
      Class9495.field44153,
      Class9495.field44186,
      Class9495.field44154,
      Class9495.field44187
   ),
   field692(1, "snow", Class9495.field44151, Class9495.field44152, Class9495.field44185);

   private static final Class186[] field693 = Arrays.<Class186>stream(values())
      .sorted(Comparator.comparingInt(Class186::method568))
      .<Class186>toArray(Class186[]::new);
   private static final Map<String, Class186> field694 = Arrays.<Class186>stream(values())
      .collect(Collectors.toMap(Class186::method567, var0 -> (Class186)var0));
   private final int field695;
   private final String field696;
   private final List<Class8705<Class8907>> field697;
   private static final Class186[] field698 = new Class186[]{field691, field692};

   private Class186(int var3, String var4, Class8705<Class8907>... var5) {
      this.field695 = var3;
      this.field696 = var4;
      this.field697 = Arrays.<Class8705<Class8907>>asList(var5);
   }

   public String method567() {
      return this.field696;
   }

   public int method568() {
      return this.field695;
   }

   public static Class186 method569(String var0) {
      return field694.getOrDefault(var0, field691);
   }

   public static Class186 method570(int var0) {
      if (var0 < 0 || var0 > field693.length) {
         var0 = 0;
      }

      return field693[var0];
   }

   public static Class186 method571(Optional<Class8705<Class8907>> var0) {
      return var0.isPresent() && field692.field697.contains(var0.get()) ? field692 : field691;
   }
}
