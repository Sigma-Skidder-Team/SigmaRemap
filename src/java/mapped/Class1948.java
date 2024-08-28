package mapped;

public enum Class1948 implements Class1949 {
   field12618(0, Class4750.field22518),
   field12619(1, Class4750.field22534),
   field12620(2, Class4750.field22526),
   field12621(3, Class4750.field22532),
   field12622(4, Class4750.field22539),
   field12623(5, Class4750.field22561),
   field12624(6, Class4750.field22554),
   field12625(7, Class4750.field22553),
   field12626(-1, Class4750.field22550);

   private final int field12627;
   private final Class4750 field12628;
   private static final Class1948[] field12629 = new Class1948[]{
      field12618, field12619, field12620, field12621, field12622, field12623, field12624, field12625, field12626
   };

   private Class1948(int var3, Class4750 var4) {
      this.field12627 = var3;
      this.field12628 = var4;
   }

   public static Class1948 method8206(int var0) {
      return values()[var0];
   }

   @Override
   public int method8207() {
      return this.field12627;
   }

   @Override
   public Class4750 method8208() {
      return this.field12628;
   }
}
