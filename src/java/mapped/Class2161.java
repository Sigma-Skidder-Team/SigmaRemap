package mapped;

public enum Class2161 {
   field14170("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_:."),
   field14171("0123456789", "0123456789."),
   field14172("+-*/%!&|<>=", "&|="),
   field14173(","),
   field14174("("),
   field14175(")");

   private String field14176;
   private String field14177;
   public static final Class2161[] field14178 = values();
   private static final Class2161[] field14179 = new Class2161[]{field14170, field14171, field14172, field14173, field14174, field14175};

   private Class2161(String var3) {
      this(var3, "");
   }

   private Class2161(String var3, String var4) {
      this.field14176 = var3;
      this.field14177 = var4;
   }

   public String method8880() {
      return this.field14176;
   }

   public String method8881() {
      return this.field14177;
   }

   public static Class2161 method8882(char var0) {
      for (int var3 = 0; var3 < field14178.length; var3++) {
         Class2161 var4 = field14178[var3];
         if (var4.method8880().indexOf(var0) >= 0) {
            return var4;
         }
      }

      return null;
   }

   public boolean method8883(char var1) {
      return this.field14177.indexOf(var1) >= 0;
   }
}
