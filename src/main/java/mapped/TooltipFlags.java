package mapped;

public enum TooltipFlags implements Class2216 {
   NORMAL(false),
   field14481(true);

   private final boolean field14482;
   private static final TooltipFlags[] field14483 = new TooltipFlags[]{NORMAL, field14481};

   private TooltipFlags(boolean var3) {
      this.field14482 = var3;
   }

   @Override
   public boolean method8944() {
      return this.field14482;
   }
}
