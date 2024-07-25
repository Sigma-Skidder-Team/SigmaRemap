package remapped;

import java.util.Arrays;
import java.util.Comparator;

public enum class_9761 {
   field_49571(0, "options.particles.all"),
   field_49576(1, "options.particles.decreased"),
   field_49573(2, "options.particles.minimal");

   private static final class_9761[] field_49574 = Arrays.<class_9761>stream(values())
      .sorted(Comparator.comparingInt(class_9761::method_45045))
      .<class_9761>toArray(class_9761[]::new);
   private final int field_49569;
   private final String field_49570;

   private class_9761(int var3, String var4) {
      this.field_49569 = var3;
      this.field_49570 = var4;
   }

   public String method_45043() {
      return this.field_49570;
   }

   public int method_45045() {
      return this.field_49569;
   }

   public static class_9761 method_45046(int var0) {
      return field_49574[class_9299.method_42788(var0, field_49574.length)];
   }
}
