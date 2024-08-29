package mapped;

public enum Class2085 {
   field13575(true, true),
   field13576(false, true),
   INTEGRATED(true, false);

   private final boolean field13578;
   private final boolean field13579;
   private static final Class2085[] field13580 = new Class2085[]{field13575, field13576, INTEGRATED};

   private Class2085(boolean var3, boolean var4) {
      this.field13578 = var3;
      this.field13579 = var4;
   }

   // $VF: synthetic method
   public static boolean method8739(Class2085 var0) {
      return var0.field13579;
   }

   // $VF: synthetic method
   public static boolean method8740(Class2085 var0) {
      return var0.field13578;
   }
}
