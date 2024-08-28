package mapped;

import java.util.Map;
import java.util.stream.Collectors;

public class Class7828 {
   private static String[] field33612;
   private final Map<Class4520, Class5425> field33613 = Class4520.method14349()
      .stream()
      .collect(Collectors.toMap(var0 -> (Class4520)var0, var0 -> new Class5425(var0.method14350())));

   public Class5425 method26203(Class4520 var1) {
      return this.field33613.get(var1);
   }

   public void method26204() {
      this.field33613.values().forEach(Class5425::method17071);
   }

   public void method26205() {
      this.field33613.values().forEach(Class5425::method17072);
   }
}
