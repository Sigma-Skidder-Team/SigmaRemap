package mapped;

public class Class3127 implements Class2982 {
   private static String[] field18336;
   public final Class3937 field18337;

   public Class3127(Class3937 var1) {
      this.field18337 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      int var4 = var1.<Integer>method30555(Class4750.field22526, 0);
      int var5 = var1.<Integer>method30555(Class4750.field22526, 1);
      if (var4 != 1010) {
         if (var4 == 2001) {
            int var6 = var5 & 4095;
            int var7 = var5 >> 12;
            var1.method30558(Class4750.field22526, 1, Class7795.method25886(var6 << 4 | var7));
         }
      } else {
         var1.method30558(Class4750.field22526, 1, this.field18337.field20212.method19376().method18533().get(var5 << 4));
      }
   }
}
