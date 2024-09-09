package mapped;

public class Class3125 implements Class2982 {
   private static String[] field18332;
   public final Class3815 field18333;

   public Class3125(Class3815 var1) {
      this.field18333 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      int var4 = var1.<Integer>method30559(Class4750.field22544);
      var1.method30564();
      var1.method30587(8);
      var1.method30560(Class4750.field22551, new Class9695(-1, (short)-1, -1));
      var1.method30560(Class4750.field22522, (short)255);
      Class9738 var5 = Class6363.method19383(var1.method30580());
      if (ViaVersion3.method27612().method21895()) {
         Class6057 var6 = var1.method30580().<Class6057>method22438(Class6057.class);
         if (var5 == null || !Class6363.method19384(var5.method38161())) {
            var6.method18744(null);
            var6.method18762(false);
         } else if (var4 == 0) {
            if (!var6.method18761()) {
               var6.method18762(true);
               Class9738 var7 = new Class9738(442, (byte)1, (short)0, null);
               var6.method18744(var7);
            }

            var1.method30578();
         }
      }

      var1.method30560(Class4750.field22561, var5);
      var1.method30560(Class4750.field22522, (short)0);
      var1.method30560(Class4750.field22522, (short)0);
      var1.method30560(Class4750.field22522, (short)0);
   }
}
