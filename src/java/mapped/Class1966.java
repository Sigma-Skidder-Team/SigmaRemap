package mapped;

public enum Class1966 {
   field12822(true, false),
   field12823(false, false),
   field12824(false, true);

   private static final Class1966[] field12825 = values();
   private boolean field12826;
   private boolean field12827;
   private static final Class1966[] field12828 = new Class1966[]{field12822, field12823, field12824};

   private Class1966(boolean var3, boolean var4) {
      this.field12826 = var3;
      this.field12827 = var4;
   }

   public boolean method8246() {
      return this.field12826;
   }

   public boolean method8247() {
      return this.field12827;
   }

   public Class1966 method8248() {
      return field12825[(this.ordinal() + 1) % field12825.length];
   }
}
