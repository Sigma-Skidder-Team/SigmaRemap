package mapped;

public class Class9316 {
   public static void method35206(Class6357 var0) {
      Class6913 var3 = var0.<Class6913>method19373(Class6913.class);
      var3.method21093(Class1917.field11628, Class1874.field10879);
      var3.method21092(Class1917.field11630);
      var3.method21094(Class1917.field11632, Class1874.field10888);
      var3.method21097(Class1917.field11696, Class9218.field42416);
      var3.method21095(Class1917.field11683);
      var0.method19360(Class1917.field11665, new Class4022(var0));
      var0.method19360(Class1917.field11686, new Class3865());
   }

   public static Class72 method35207(String var0) {
      Class72 var3 = Class6357.field27920.method18556().get(var0);
      if (var3 != null) {
         return var3;
      } else {
         ViaVersion3.method27613().method27366().severe("Could not get dimension data of " + var0);
         throw new NullPointerException("Dimension data for " + var0 + " is null!");
      }
   }
}
