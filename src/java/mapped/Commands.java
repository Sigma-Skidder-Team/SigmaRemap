package mapped;

public enum Commands {
   field13575(true, true),
   DEDICATED(false, true),
   INTEGRATED(true, false);

   private final boolean field13578;
   private final boolean field13579;
   private static final Commands[] field13580 = new Commands[]{field13575, DEDICATED, INTEGRATED};

   private Commands(boolean var3, boolean var4) {
      this.field13578 = var3;
      this.field13579 = var4;
   }

   // $VF: synthetic method
   public static boolean method8739(Commands var0) {
      return var0.field13579;
   }

   // $VF: synthetic method
   public static boolean method8740(Commands var0) {
      return var0.field13578;
   }
}
