package mapped;

public class Class3013 implements Class3008 {
   private static String[] field18147;
   public final Class3886 field18148;

   public Class3013(Class3886 var1) {
      this.field18148 = var1;
   }

   @Override
   public void method11400(Class8563 var1) throws Exception {
      var1.method30560(Class4750.field22524, false);
      var1.method30560(Class4750.field22559, null);
      if (!var1.method30579() && Class8042.method27612().method21930() > 0) {
         Class6043 var4 = var1.method30580().<Class6043>method22438(Class6043.class);
         var1.method30578();
         var4.method18716(System.currentTimeMillis() + (long)Class8042.method27612().method21930() * 50L);
         var4.method18714(var1.<String>method30555(Class4750.field22539, 0));
      }
   }
}
