package mapped;

public class Class3901 extends Class3758 {
   public final Class6386 field20151;

   public Class3901(Class6386 var1) {
      this.field20151 = var1;
   }

   @Override
   public void method12725() {
      this.map(Class4750.field22526);
      this.map(Class4750.field22551);
      this.map(Class4750.field22526);
      this.map(Class4750.field22524);
      this.method12733(var0 -> {
         int var3 = var0.<Integer>method30555(Class4750.field22526, 0);
         if (var3 == 2002) {
            int var4 = var0.<Integer>method30555(Class4750.field22526, 1);
            boolean var5 = false;
            Class9284 var6 = Class5442.method17106(var4);
            if (var6 != null) {
               var4 = (Integer)var6.method35008();
               var5 = (Boolean)var6.method35009();
            } else {
               ViaVersion3.method27613().method27366().warning("Received unknown 1.11 -> 1.10.2 potion data (" + var4 + ")");
               var4 = 0;
            }

            if (var5) {
               var0.method30558(Class4750.field22526, 0, 2007);
            }

            var0.method30558(Class4750.field22526, 1, var4);
         }
      });
   }
}
