package mapped;

public enum Class2045 {
   field13352(0),
   field13353(1),
   field13354(2);

   private static final Class2045[] field13355 = new Class2045[]{field13352, field13353, field13354};
   private final int field13356;
   private static final Class2045[] field13357 = new Class2045[]{field13352, field13353, field13354};

   private Class2045(int var3) {
      this.field13356 = var3;
   }

   public int method8685() {
      return this.field13356;
   }

   public static Class2045 method8686(int var0) {
      if (var0 >= 0 && var0 < field13355.length) {
         return field13355[var0];
      } else {
         throw new IllegalArgumentException("No operation with value " + var0);
      }
   }
}
