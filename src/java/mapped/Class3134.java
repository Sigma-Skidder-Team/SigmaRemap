package mapped;

import com.google.gson.JsonElement;

public class Class3134 implements Class2982 {
   private static String[] field18348;
   public final Class4030 field18349;

   public Class3134(Class4030 var1) {
      this.field18349 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      if (Class8042.method27612().method21915()) {
         try {
            JsonElement var4 = Class6363.field27929.method11402(null, var1.<JsonElement>method30561(Class4750.field22538).toString());
            Class9256.method34813(var4, var1.method30580());
            Class7743.method25651(var4, var1.method30580());
            var1.method30558(Class4750.field22538, 0, var4);
         } catch (Exception var5) {
            var5.printStackTrace();
         }
      }
   }
}
