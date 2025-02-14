package mapped;

public final class Class7045 {
   private static String[] field30430;
   public final Class7045[] field30431;
   public final int field30432;
   public final int field30433;

   public Class7045() {
      this.field30431 = new Class7045[256];
      this.field30432 = 0;
      this.field30433 = 0;
   }

   public Class7045(int var1, int var2) {
      this.field30431 = null;
      this.field30432 = var1;
      int var5 = var2 & 7;
      this.field30433 = var5 != 0 ? var5 : 8;
   }
}
