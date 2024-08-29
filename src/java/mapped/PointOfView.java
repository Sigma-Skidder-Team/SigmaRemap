package mapped;

public enum PointOfView {
   field12822(true, false),
   field12823(false, false),
   field12824(false, true);

   private static final PointOfView[] field12825 = values();
   private boolean field12826;
   private boolean field12827;
   private static final PointOfView[] field12828 = new PointOfView[]{field12822, field12823, field12824};

   private PointOfView(boolean var3, boolean var4) {
      this.field12826 = var3;
      this.field12827 = var4;
   }

   public boolean func_243192_a() {
      return this.field12826;
   }

   public boolean method8247() {
      return this.field12827;
   }

   public PointOfView method8248() {
      return field12825[(this.ordinal() + 1) % field12825.length];
   }
}
