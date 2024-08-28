package mapped;

public enum Class2079 {
   field13539("survival", Class1894.field11102),
   field13540("hardcore", Class1894.field11102),
   field13541("creative", Class1894.field11103),
   field13542("spectator", Class1894.field11105);

   private final String field13543;
   private final Class1894 field13544;
   private static final Class2079[] field13545 = new Class2079[]{field13539, field13540, field13541, field13542};

   private Class2079(String var3, Class1894 var4) {
      this.field13543 = var3;
      this.field13544 = var4;
   }

   // $VF: synthetic method
   public static String method8734(Class2079 var0) {
      return var0.field13543;
   }

   // $VF: synthetic method
   public static Class1894 method8735(Class2079 var0) {
      return var0.field13544;
   }
}
