package mapped;

public enum Class2031 {
   field13181(0, 0.0, 0.0, 0.0),
   field13182(1, 0.7, 0.7, 0.8),
   field13183(2, 0.4, 0.3, 0.35),
   field13184(3, 0.7, 0.5, 0.2),
   field13185(4, 0.3, 0.3, 0.8),
   field13186(5, 0.1, 0.1, 0.2);

   private final int field13187;
   private final double[] field13188;
   private static final Class2031[] field13189 = new Class2031[]{field13181, field13182, field13183, field13184, field13185, field13186};

   private Class2031(int var3, double var4, double var6, double var8) {
      this.field13187 = var3;
      this.field13188 = new double[]{var4, var6, var8};
   }

   public static Class2031 method8664(int var0) {
      for (Class2031 var6 : values()) {
         if (var0 == var6.field13187) {
            return var6;
         }
      }

      return field13181;
   }

   // $VF: synthetic method
   public static int method8665(Class2031 var0) {
      return var0.field13187;
   }

   // $VF: synthetic method
   public static double[] method8666(Class2031 var0) {
      return var0.field13188;
   }
}
