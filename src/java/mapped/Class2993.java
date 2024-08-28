package mapped;

public class Class2993 implements Class2982 {
   private static String[] field18112;
   public final Class3904 field18113;

   public Class2993(Class3904 var1) {
      this.field18113 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      Class6047 var4 = var1.method30580().<Class6047>method22438(Class6047.class);
      Class8173 var5 = var1.<Class8173>method30561(new Class4749(var4));

      for (Class8225 var9 : var5.method28446()) {
         if (var9 != null) {
            for (int var10 = 0; var10 < var9.method28631(); var10++) {
               var9.method28633(var10, this.field18113.field20157.method19376().method18528(var9.method28632(var10)));
            }
         }
      }
   }
}
