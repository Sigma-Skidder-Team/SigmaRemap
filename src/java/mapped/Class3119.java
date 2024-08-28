package mapped;

public class Class3119 implements Class2982 {
   public final Class3985 field18324;

   public Class3119(Class3985 var1) {
      this.field18324 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      String var4 = var1.<String>method30555(Class4750.field22539, 0);
      if (var4.equalsIgnoreCase("MC|BOpen")) {
         var1.<byte[]>method30559(Class4750.field22521);
         var1.method30560(Class4750.field22544, 0);
      }

      if (var4.equalsIgnoreCase("MC|TrList")) {
         var1.<Integer>method30561(Class4750.field22526);
         Short var5 = var1.<Short>method30561(Class4750.field22522);

         for (int var6 = 0; var6 < var5; var6++) {
            Class9738 var7 = var1.<Class9738>method30561(Class4750.field22561);
            Class8768.method31628(var7);
            Class9738 var8 = var1.<Class9738>method30561(Class4750.field22561);
            Class8768.method31628(var8);
            boolean var9 = var1.<Boolean>method30561(Class4750.field22524);
            if (var9) {
               Class9738 var10 = var1.<Class9738>method30561(Class4750.field22561);
               Class8768.method31628(var10);
            }

            var1.<Boolean>method30561(Class4750.field22524);
            var1.<Integer>method30561(Class4750.field22526);
            var1.<Integer>method30561(Class4750.field22526);
         }
      }
   }
}
