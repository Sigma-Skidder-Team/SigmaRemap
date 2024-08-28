package mapped;

public class Class3029 implements Class3008 {
   public final Class3863 field18178;

   public Class3029(Class3863 var1) {
      this.field18178 = var1;
   }

   @Override
   public void method11400(Class8563 var1) throws Exception {
      var1.method30560(Class4750.field22544, var1.method30580().<Class6043>method22438(Class6043.class).method18709());
      String var4 = var1.method30580().<Class6043>method22438(Class6043.class).method18711();
      int var5;
      int var6;
      if (!var4.endsWith(" ") && !var4.isEmpty()) {
         int var7 = var4.lastIndexOf(32) + 1;
         var5 = var7;
         var6 = var4.length() - var7;
      } else {
         var5 = var4.length();
         var6 = 0;
      }

      var1.method30560(Class4750.field22544, var5);
      var1.method30560(Class4750.field22544, var6);
      int var10 = var1.<Integer>method30561(Class4750.field22544);

      for (int var8 = 0; var8 < var10; var8++) {
         String var9 = var1.<String>method30559(Class4750.field22539);
         if (var9.startsWith("/") && var5 == 0) {
            var9 = var9.substring(1);
         }

         var1.method30560(Class4750.field22539, var9);
         var1.method30560(Class4750.field22524, false);
      }
   }
}
