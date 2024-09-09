package mapped;

public class Class3086 implements Class2982 {
   public final Class4037 field18264;

   public Class3086(Class4037 var1) {
      this.field18264 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      byte var4 = var1.<Byte>method30555(Class4750.field22518, 0);
      if (var4 == 0 || var4 == 2) {
         var1.<String>method30561(Class4750.field22539);
         var1.<String>method30561(Class4750.field22539);
         var1.<String>method30561(Class4750.field22539);
         var1.<Byte>method30561(Class4750.field22518);
         var1.<String>method30561(Class4750.field22539);
         var1.method30560(Class4750.field22539, !ViaVersion3.method27612().method21891() ? "" : "never");
         var1.<Byte>method30561(Class4750.field22518);
      }

      if (var4 == 0 || var4 == 3 || var4 == 4) {
         String[] var5 = var1.<String[]>method30561(Class4750.field22540);
         Class6057 var6 = var1.method30580().<Class6057>method22438(Class6057.class);
         String var7 = var1.method30580().method22465().method18679();
         String var8 = var1.<String>method30555(Class4750.field22539, 0);

         for (String var12 : var5) {
            if (var6.method18763() && var12.equalsIgnoreCase(var7)) {
               if (var4 != 4) {
                  var6.method18750(false, true);
                  var6.method18771(var8);
               } else {
                  var1.method30568(Class6363.class, true, true);
                  var1.method30578();
                  var6.method18750(true, true);
                  var6.method18771("viaversion");
               }
            }
         }
      }

      if (var4 == 1) {
         Class6057 var13 = var1.method30580().<Class6057>method22438(Class6057.class);
         String var14 = var1.<String>method30555(Class4750.field22539, 0);
         if (var13.method18763() && var14.equals(var13.method18770())) {
            var1.method30568(Class6363.class, true, true);
            var1.method30578();
            var13.method18750(true, true);
            var13.method18771("viaversion");
         }
      }
   }
}
