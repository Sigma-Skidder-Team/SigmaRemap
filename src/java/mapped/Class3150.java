package mapped;

import com.google.gson.JsonElement;

public class Class3150 implements Class2982 {
   private static String[] field18376;
   public final Class3938 field18377;

   public Class3150(Class3938 var1) {
      this.field18377 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      int var4 = var1.<Integer>method30555(Class4750.field22544, 0);
      if (var4 >= 0 && var4 <= 2) {
         Class2980.method11397(var1.<JsonElement>method30561(Class4750.field22538));
      }
   }
}
