package mapped;

public enum Class2091 {
   field13627("\r\n"),
   field13628("\r"),
   field13629("\n");

   private String field13630;
   private static final Class2091[] field13631 = new Class2091[]{field13627, field13628, field13629};

   private Class2091(String var3) {
      this.field13630 = var3;
   }

   public String method8752() {
      return this.field13630;
   }

   @Override
   public String toString() {
      return "Line break: " + this.name();
   }

   public static Class2091 method8753() {
      String var2 = System.getProperty("line.separator");

      for (Class2091 var6 : values()) {
         if (var6.field13630.equals(var2)) {
            return var6;
         }
      }

      return field13629;
   }
}
