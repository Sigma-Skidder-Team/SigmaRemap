package mapped;

public final class Class7939 extends Class7938 {
   private static String[] field34040;
   private final Class7938 field34041;
   private final int field34042;
   private final int field34043;
   private final int field34044;
   private final int field34045;
   private final int field34046;
   private final int field34047;

   public Class7939(Class7938 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      super(var5 - var2, var6 - var3, var7 - var4);
      this.field34041 = var1;
      this.field34042 = var2;
      this.field34043 = var3;
      this.field34044 = var4;
      this.field34045 = var5;
      this.field34046 = var6;
      this.field34047 = var7;
   }

   @Override
   public boolean method26717(int var1, int var2, int var3) {
      return this.field34041.method26717(this.field34042 + var1, this.field34043 + var2, this.field34044 + var3);
   }

   @Override
   public void method26718(int var1, int var2, int var3, boolean var4, boolean var5) {
      this.field34041.method26718(this.field34042 + var1, this.field34043 + var2, this.field34044 + var3, var4, var5);
   }

   @Override
   public int method26720(Direction var1) {
      return Math.max(0, this.field34041.method26720(var1) - var1.method327(this.field34042, this.field34043, this.field34044));
   }

   @Override
   public int method26721(Direction var1) {
      return Math.min(
         var1.method327(this.field34045, this.field34046, this.field34047),
         this.field34041.method26721(var1) - var1.method327(this.field34042, this.field34043, this.field34044)
      );
   }
}
