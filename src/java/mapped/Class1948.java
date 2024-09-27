package mapped;

public enum Class1948 implements Class1949 {
   field12618(0, BruhMotha.field22518),
   field12619(1, BruhMotha.field22534),
   field12620(2, BruhMotha.field22526),
   field12621(3, BruhMotha.field22532),
   field12622(4, BruhMotha.field22539),
   field12623(5, BruhMotha.field22561),
   field12624(6, BruhMotha.field22554),
   field12625(7, BruhMotha.field22553),
   field12626(-1, BruhMotha.field22550);

   private final int field12627;
   private final BruhMotha field12628;
   private static final Class1948[] field12629 = new Class1948[]{
      field12618, field12619, field12620, field12621, field12622, field12623, field12624, field12625, field12626
   };

   private Class1948(int var3, BruhMotha var4) {
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
   public BruhMotha method8208() {
      return this.field12628;
   }
}
