package mapped;

public enum Class2069 {
   field13477(0, "Survival Mode"),
   field13478(1, "Creative Mode"),
   field13479(2, "Adventure Mode"),
   field13480(3, "Spectator Mode");

   private final int field13481;
   private final String field13482;
   private static final Class2069[] field13483 = new Class2069[]{field13477, field13478, field13479, field13480};

   private Class2069(int var3, String var4) {
      this.field13481 = var3;
      this.field13482 = var4;
   }

   public int method8724() {
      return this.field13481;
   }

   public String method8725() {
      return this.field13482;
   }

   public static Class2069 method8726(int var0) {
      for (Class2069 var6 : values()) {
         if (var6.method8724() == var0) {
            return var6;
         }
      }

      return null;
   }
}
