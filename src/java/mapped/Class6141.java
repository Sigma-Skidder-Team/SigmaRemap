package mapped;

import it.unimi.dsi.fastutil.floats.Float2FloatFunction;

public final class Class6141 implements Class6139<Class941, Float2FloatFunction> {
   private static String[] field27538;
   public final Class942 field27539;

   public Class6141(Class942 var1) {
      this.field27539 = var1;
   }

   public Float2FloatFunction method19043(Class941 var1, Class941 var2) {
      return var2x -> Math.max(var1.method3762(var2x), var2.method3762(var2x));
   }

   public Float2FloatFunction method19042(Class941 var1) {
      return var1::method3762;
   }

   public Float2FloatFunction method19041() {
      return this.field27539::method3762;
   }
}
