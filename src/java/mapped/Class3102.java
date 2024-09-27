package mapped;

public class Class3102 implements Class2982 {
   private static String[] field18292;
   public final Class4041 field18293;

   public Class3102(Class4041 var1) {
      this.field18293 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      String var4 = var1.<String>method30555(BruhMotha.field22539, 0);
      Class2280 var5 = Class2280.method9004(var4);
      int var6 = 0;
      String var7 = var4;
      if (var5 != null) {
         var6 = var5.method9007().method8892();
         var7 = var5.method9006();
      }

      var1.method30558(BruhMotha.field22539, 0, var7);
      var1.method30560(BruhMotha.field22544, var6);
      if (var5 != null && var5.method9008()) {
         Class6057 var8 = var1.method30580().<Class6057>method22438(Class6057.class);
         int var9 = var1.<Integer>method30561(BruhMotha.field22526);
         int var10 = var1.<Integer>method30561(BruhMotha.field22526);
         int var11 = var1.<Integer>method30561(BruhMotha.field22526);
         if (var8.method18746((int)Math.floor((double)var9 / 8.0), (int)Math.floor((double)var10 / 8.0), (int)Math.floor((double)var11 / 8.0))) {
            var1.method30578();
         }
      }
   }
}
