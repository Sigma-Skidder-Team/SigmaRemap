package mapped;

public enum Class2210 {
   field14452("red", Blocks.field36520.method11579()),
   field14453("brown", Blocks.field36519.method11579());

   private final String field14454;
   private final Class7380 field14455;
   private static final Class2210[] field14456 = new Class2210[]{field14452, field14453};

   private Class2210(String var3, Class7380 var4) {
      this.field14454 = var3;
      this.field14455 = var4;
   }

   public Class7380 method8934() {
      return this.field14455;
   }

   private static Class2210 method8935(String var0) {
      for (Class2210 var6 : values()) {
         if (var6.field14454.equals(var0)) {
            return var6;
         }
      }

      return field14452;
   }

   // $VF: synthetic method
   public static String method8936(Class2210 var0) {
      return var0.field14454;
   }

   // $VF: synthetic method
   public static Class7380 method8937(Class2210 var0) {
      return var0.field14455;
   }

   // $VF: synthetic method
   public static Class2210 method8938(String var0) {
      return method8935(var0);
   }
}
