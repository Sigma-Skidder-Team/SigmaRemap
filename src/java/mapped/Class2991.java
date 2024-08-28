package mapped;

public class Class2991 implements Class2982 {
   public final Class3980 field18109;

   public Class2991(Class3980 var1) {
      this.field18109 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      String var4 = var1.<String>method30555(Class4750.field22539, 0);
      if (var4.equals("minecraft:trader_list") || var4.equals("trader_list")) {
         var1.method30587(39);
         var1.method30581();
         var1.<String>method30559(Class4750.field22539);
         int var9 = var1.<Integer>method30559(Class4750.field22526);
         var1.method30580().<Class6058>method22438(Class6058.class).method18782(var9);
         var1.method30560(Class4750.field22544, var9);
         short var6 = var1.<Short>method30561(Class4750.field22522);

         for (int var7 = 0; var7 < var6; var7++) {
            Class8770.method31635(var1.<Class9738>method30561(Class4750.field22569));
            Class8770.method31635(var1.<Class9738>method30561(Class4750.field22569));
            boolean var8 = var1.<Boolean>method30561(Class4750.field22524);
            if (var8) {
               Class8770.method31635(var1.<Class9738>method30561(Class4750.field22569));
            }

            var1.<Boolean>method30561(Class4750.field22524);
            var1.<Integer>method30561(Class4750.field22526);
            var1.<Integer>method30561(Class4750.field22526);
            var1.method30560(Class4750.field22526, 0);
            var1.method30560(Class4750.field22526, 0);
            var1.method30560(Class4750.field22532, 0.0F);
         }

         var1.method30560(Class4750.field22544, 0);
         var1.method30560(Class4750.field22544, 0);
         var1.method30560(Class4750.field22524, false);
      } else if (var4.equals("minecraft:book_open") || var4.equals("book_open")) {
         int var5 = var1.<Integer>method30559(Class4750.field22544);
         var1.method30565();
         var1.method30587(45);
         var1.method30560(Class4750.field22544, var5);
      }
   }
}
