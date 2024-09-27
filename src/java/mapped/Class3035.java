package mapped;

public class Class3035 extends Class3032<Boolean, Void> {
   private static String[] field18185;
   public final Class3907 field18186;

   public Class3035(Class3907 var1, BruhMotha var2) {
      super(var2);
      this.field18186 = var1;
   }

   public Void method11402(Class8563 var1, Boolean var2) throws Exception {
      Class6057 var5 = var1.method30580().<Class6057>method22438(Class6057.class);
      if (!var2) {
         int var6 = var1.<Integer>method30555(BruhMotha.field22526, 0);
         int var7 = var1.<Integer>method30555(BruhMotha.field22526, 1);
         var1.method30578();
         Class8563 var8 = var1.method30573(64);
         if (var7 != -1) {
            var8.method30560(BruhMotha.field22544, var7);
            var8.method30560(BruhMotha.field22546, new int[]{var6});
            var5.method18756().put(var6, var7);
         } else {
            if (!var5.method18756().containsKey(var6)) {
               return null;
            }

            var8.method30560(BruhMotha.field22544, var5.method18756().remove(var6));
            var8.method30560(BruhMotha.field22546, new int[0]);
         }

         var8.method30570(Class6363.class);
      }

      return null;
   }
}
