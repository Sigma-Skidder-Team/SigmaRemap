package mapped;

public enum Class2221 {
   field14506("file"),
   field14507("event");

   private final String field14508;
   private static final Class2221[] field14509 = new Class2221[]{field14506, field14507};

   private Class2221(String var3) {
      this.field14508 = var3;
   }

   public static Class2221 method8948(String var0) {
      for (Class2221 var6 : values()) {
         if (var6.field14508.equals(var0)) {
            return var6;
         }
      }

      return null;
   }
}
