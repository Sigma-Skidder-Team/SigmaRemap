package mapped;

public class Class4838 extends Class4837 {
   private static String[] field22615;

   public Class4838(ResourceLocation var1) {
      super(var1);
   }

   public boolean method14963(Class926 var1, Class1655 var2) {
      int var5 = 0;
      int var6 = 0;

      for (int var7 = 0; var7 < var1.method3629(); var7++) {
         Class8848 var8 = var1.method3618(var7);
         if (!var8.method32105()) {
            if (!(Class3209.method11537(var8.method32107()) instanceof Class3368)) {
               if (!(var8.method32107() instanceof Class3321)) {
                  return false;
               }

               var6++;
            } else {
               var5++;
            }

            if (var6 > 1 || var5 > 1) {
               return false;
            }
         }
      }

      return var5 == 1 && var6 == 1;
   }

   public Class8848 method14962(Class926 var1) {
      Class8848 var4 = Class8848.field39973;
      Class3321 var5 = (Class3321)Class8514.field37918;

      for (int var6 = 0; var6 < var1.method3629(); var6++) {
         Class8848 var7 = var1.method3618(var6);
         if (!var7.method32105()) {
            Class3257 var8 = var7.method32107();
            if (!(Class3209.method11537(var8) instanceof Class3368)) {
               if (var8 instanceof Class3321) {
                  var5 = (Class3321)var8;
               }
            } else {
               var4 = var7;
            }
         }
      }

      Class8848 var9 = Class3368.method11958(var5.method11876());
      if (var4.method32141()) {
         var9.method32148(var4.method32142().method79());
      }

      return var9;
   }

   @Override
   public boolean method14960(int var1, int var2) {
      return var1 * var2 >= 2;
   }

   @Override
   public Class6504<?> method14961() {
      return Class6504.field28482;
   }
}
