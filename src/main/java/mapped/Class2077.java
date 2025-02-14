package mapped;

public enum Class2077 {
   field13527(0),
   field13528(1),
   field13529(2),
   field13530(3),
   field13531(7),
   field13532(8);

   public final int field13533;
   private static final Class2077[] field13534 = new Class2077[]{field13527, field13528, field13529, field13530, field13531, field13532};

   private Class2077(int var3) {
      this.field13533 = var3;
   }

   public static Class2077 method8733(int var0) {
      for (Class2077 var6 : values()) {
         if (var6.field13533 == var0) {
            return var6;
         }
      }

      return null;
   }
}
