package mapped;

public enum Class2106 {
   field13731(Class1969.field12836, 0, 0, "mainhand"),
   field13732(Class1969.field12836, 1, 5, "offhand"),
   field13733(Class1969.field12837, 0, 1, "feet"),
   field13734(Class1969.field12837, 1, 2, "legs"),
   field13735(Class1969.field12837, 2, 3, "chest"),
   field13736(Class1969.field12837, 3, 4, "head");

   private final Class1969 field13737;
   private final int field13738;
   private final int field13739;
   private final String field13740;
   private static final Class2106[] field13741 = new Class2106[]{field13731, field13732, field13733, field13734, field13735, field13736};

   private Class2106(Class1969 var3, int var4, int var5, String var6) {
      this.field13737 = var3;
      this.field13738 = var4;
      this.field13739 = var5;
      this.field13740 = var6;
   }

   public Class1969 method8772() {
      return this.field13737;
   }

   public int method8773() {
      return this.field13738;
   }

   public int method8774() {
      return this.field13739;
   }

   public String method8775() {
      return this.field13740;
   }

   public static Class2106 method8776(String var0) {
      for (Class2106 var6 : values()) {
         if (var6.method8775().equals(var0)) {
            return var6;
         }
      }

      throw new IllegalArgumentException("Invalid slot '" + var0 + "'");
   }

   public static Class2106 method8777(Class1969 var0, int var1) {
      for (Class2106 var7 : values()) {
         if (var7.method8772() == var0 && var7.method8773() == var1) {
            return var7;
         }
      }

      throw new IllegalArgumentException("Invalid slot '" + var0 + "': " + var1);
   }
}
