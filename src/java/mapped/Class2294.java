package mapped;

import java.util.Arrays;
import java.util.Comparator;

public enum Class2294 {
   field15246(0, "options.particles.all"),
   field15247(1, "options.particles.decreased"),
   field15248(2, "options.particles.minimal");

   private static final Class2294[] field15249 = Arrays.<Class2294>stream(values())
      .sorted(Comparator.comparingInt(Class2294::method9052))
      .<Class2294>toArray(Class2294[]::new);
   private final int field15250;
   private final String field15251;
   private static final Class2294[] field15252 = new Class2294[]{field15246, field15247, field15248};

   private Class2294(int var3, String var4) {
      this.field15250 = var3;
      this.field15251 = var4;
   }

   public String method9051() {
      return this.field15251;
   }

   public int method9052() {
      return this.field15250;
   }

   public static Class2294 method9053(int var0) {
      return field15249[MathHelper.normalizeAngle(var0, field15249.length)];
   }
}
