package mapped;

import java.util.Arrays;
import java.util.Comparator;

public enum Class1904 {
   field11184(0, "options.off"),
   field11185(1, "options.clouds.fast"),
   field11186(2, "options.clouds.fancy");

   private static final Class1904[] field11187 = Arrays.<Class1904>stream(values())
      .sorted(Comparator.comparingInt(Class1904::method8173))
      .<Class1904>toArray(Class1904[]::new);
   private final int field11188;
   private final String field11189;
   private static final Class1904[] field11190 = new Class1904[]{field11184, field11185, field11186};

   private Class1904(int var3, String var4) {
      this.field11188 = var3;
      this.field11189 = var4;
   }

   public int method8173() {
      return this.field11188;
   }

   public String method8174() {
      return this.field11189;
   }

   public static Class1904 method8175(int var0) {
      return field11187[MathHelper.normalizeAngle(var0, field11187.length)];
   }
}
