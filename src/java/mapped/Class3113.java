package mapped;

public class Class3113 implements Class2982 {
   private static String[] field18313;
   public final Class4025 field18314;

   public Class3113(Class4025 var1) {
      this.field18314 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      String var4 = var1.<String>method30555(Class4750.field22539, 0);
      if (var4.length() > 100) {
         var1.method30558(Class4750.field22539, 0, var4.substring(0, 100));
      }
   }
}
