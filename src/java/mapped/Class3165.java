package mapped;

public class Class3165 implements Class2982 {
   private static String[] field18405;
   public final Class4017 field18406;

   public Class3165(Class4017 var1) {
      this.field18406 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      byte var4 = var1.<Byte>method30555(Class4750.field22518, 0);
      if (var4 == 0 || var4 == 2) {
         String var5 = var1.<String>method30559(Class4750.field22539);
         var1.method30560(Class4750.field22538, Class2980.method11394(var5));
         String var6 = var1.<String>method30559(Class4750.field22539);
         String var7 = var1.<String>method30559(Class4750.field22539);
         var1.<Byte>method30561(Class4750.field22518);
         var1.<String>method30561(Class4750.field22539);
         var1.<String>method30561(Class4750.field22539);
         int var8 = var1.<Byte>method30559(Class4750.field22518).intValue();
         if (var8 == -1) {
            var8 = 21;
         }

         if (Class8042.method27612().method21923()) {
            Class2307 var9 = this.field18406.field20335.method19395(var6);
            var8 = var9.ordinal();
            var7 = var9.toString() + var7;
         }

         var1.method30560(Class4750.field22544, var8);
         var1.method30560(Class4750.field22538, Class2980.method11394(var6));
         var1.method30560(Class4750.field22538, Class2980.method11394(var7));
      }

      if (var4 == 0 || var4 == 3 || var4 == 4) {
         String[] var10 = var1.<String[]>method30559(Class4750.field22540);

         for (int var11 = 0; var11 < var10.length; var11++) {
            var10[var11] = this.field18406.field20335.method19396(var10[var11]);
         }

         var1.method30560(Class4750.field22540, var10);
      }
   }
}
