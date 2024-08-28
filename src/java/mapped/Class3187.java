package mapped;

public class Class3187 implements Class2982 {
   private static String[] field18446;
   public final Class3838 field18447;

   public Class3187(Class3838 var1) {
      this.field18447 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      int var4 = var1.<Integer>method30555(Class4750.field22544, 0);
      byte var5 = var1.<Byte>method30555(Class4750.field22518, 0);
      Class1866 var6 = Class8753.method31579(var5, true);
      if (var6 != null) {
         if (var6.method8127(Class1866.field10056)) {
            int var7 = var1.<Integer>method30555(Class4750.field22526, 0);
            int var8 = (var7 & 4095) << 4 | var7 >> 12 & 15;
            var1.method30558(Class4750.field22526, 0, Class7795.method25886(var8));
         }

         if (var6.method8127(Class1866.field10142)) {
            int var9 = var1.<Integer>method30555(Class4750.field22526, 0);
            switch (var9) {
               case 0:
                  var9 = 3;
                  break;
               case 1:
                  var9 = 4;
               case 2:
               default:
                  break;
               case 3:
                  var9 = 5;
            }

            var1.method30558(Class4750.field22526, 0, var9);
            var1.method30580().<Class6054>method22438(Class6054.class).method18666(var4, var6);
         }
      }
   }
}
