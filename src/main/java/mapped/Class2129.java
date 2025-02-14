package mapped;

public enum Class2129 {
   field13891("front"),
   field13892("side");

   private final String field13893;
   private static final Class2129[] field13894 = new Class2129[]{field13891, field13892};

   private Class2129(String var3) {
      this.field13893 = var3;
   }

   public static Class2129 method8811(String var0) {
      for (Class2129 var6 : values()) {
         if (var6.field13893.equals(var0)) {
            return var6;
         }
      }

      throw new IllegalArgumentException("Invalid gui light: " + var0);
   }

   public boolean method8812() {
      return this == field13892;
   }
}
