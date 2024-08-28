package mapped;

public enum Class2063 {
   field13447("this", Class9525.field44330),
   field13448("killer", Class9525.field44333),
   field13449("direct_killer", Class9525.field44334),
   field13450("killer_player", Class9525.field44331);

   private final String field13451;
   private final Class9821<? extends Entity> field13452;
   private static final Class2063[] field13453 = new Class2063[]{field13447, field13448, field13449, field13450};

   private Class2063(String var3, Class9821<? extends Entity> var4) {
      this.field13451 = var3;
      this.field13452 = var4;
   }

   public Class9821<? extends Entity> method8717() {
      return this.field13452;
   }

   public static Class2063 method8718(String var0) {
      for (Class2063 var6 : values()) {
         if (var6.field13451.equals(var0)) {
            return var6;
         }
      }

      throw new IllegalArgumentException("Invalid entity target " + var0);
   }

   // $VF: synthetic method
   public static String method8719(Class2063 var0) {
      return var0.field13451;
   }
}
