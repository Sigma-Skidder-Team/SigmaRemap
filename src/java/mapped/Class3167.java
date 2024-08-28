package mapped;

import com.google.common.primitives.Ints;

public class Class3167 implements Class2982 {
   private static String[] field18409;
   public final Class3864 field18410;

   public Class3167(Class3864 var1) {
      this.field18410 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      int var4 = var1.<Integer>method30555(Class4750.field22544, 0);
      if (var4 == 0) {
         String var5 = var1.<String>method30559(Class4750.field22539);
         Integer var6;
         if (var5.length() < 19 || (var6 = Ints.tryParse(var5.substring(18))) == null) {
            var1.method30578();
            return;
         }

         var1.method30560(Class4750.field22526, var6);
      }

      if (var4 == 1) {
         var1.<Boolean>method30561(Class4750.field22524);
         var1.<Boolean>method30561(Class4750.field22524);
         var1.<Boolean>method30559(Class4750.field22524);
         var1.<Boolean>method30559(Class4750.field22524);
      }
   }
}
