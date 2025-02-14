package mapped;

public enum BorderStatus {
   field13693(4259712),
   field13694(16724016),
   STATIONARY(2138367);

   private final int field13696;
   private static final BorderStatus[] field13697 = new BorderStatus[]{field13693, field13694, STATIONARY};

   private BorderStatus(int var3) {
      this.field13696 = var3;
   }

   public int method8765() {
      return this.field13696;
   }
}
