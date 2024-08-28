package mapped;

public enum Class2030 {
   field13174(51, true),
   field13175(59, true),
   field13176(10, true),
   field13177(11, true);

   public int field13178;
   public boolean field13179;
   private static final Class2030[] field13180 = new Class2030[]{field13174, field13175, field13176, field13177};

   private Class2030(int var3, boolean var4) {
      this.field13178 = var3;
      this.field13179 = var4;
   }

   public static boolean method8663(int var0) {
      for (Class2030 var6 : values()) {
         if (var6.field13178 == var0) {
            return true;
         }
      }

      return false;
   }
}
