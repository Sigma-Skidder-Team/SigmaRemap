package mapped;

public enum Class1989 {
   field12984,
   field12985,
   field12986;

   private static final Class1989[] field12987 = new Class1989[]{field12984, field12985, field12986};

   public static Class1989 method8276(Class1655 var0, float var1) {
      float var4 = var0.method6790(var1);
      if (!(var4 > 0.5F)) {
         float var5 = var0.method6792(var1);
         return !(var5 > 0.5F) ? field12984 : field12985;
      } else {
         return field12986;
      }
   }
}
