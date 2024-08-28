package mapped;

import java.util.List;

public class Class3050 implements Class2982 {
   private static String[] field18206;
   public final Class3850 field18207;

   public Class3050(Class3850 var1) {
      this.field18207 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      int var4 = var1.<Integer>method30555(Class4750.field22544, 0);
      int var5 = var1.<Integer>method30555(Class4750.field22544, 1);
      Class1868 var6 = Class6906.method21112(var5, var1.<List<Class8656>>method30555(Class7593.field32598, 0));
      if (var6 != null) {
         var1.method30558(Class4750.field22544, 1, var6.method8121());
         var1.method30580().<Class6055>method22438(Class6055.class).method18666(var4, var6);
         this.field18207.field20070.method21090(var4, var1.<List<Class8656>>method30555(Class7593.field32598, 0), var1.method30580());
      }
   }
}
