package mapped;

public class Class4840 extends Class4837 {
   private static String[] field22617;

   public Class4840(ResourceLocation var1) {
      super(var1);
   }

   public boolean method14963(Class926 var1, Class1655 var2) {
      int var5 = 0;
      Class8848 var6 = Class8848.field39973;

      for (int var7 = 0; var7 < var1.method3629(); var7++) {
         Class8848 var8 = var1.method3618(var7);
         if (!var8.method32105()) {
            if (var8.method32107() != Class8514.field37955) {
               if (var8.method32107() != Class8514.field38056) {
                  return false;
               }

               var5++;
            } else {
               if (!var6.method32105()) {
                  return false;
               }

               var6 = var8;
            }
         }
      }

      return !var6.method32105() && var5 > 0;
   }

   public Class8848 method14962(Class926 var1) {
      int var4 = 0;
      Class8848 var5 = Class8848.field39973;

      for (int var6 = 0; var6 < var1.method3629(); var6++) {
         Class8848 var7 = var1.method3618(var6);
         if (!var7.method32105()) {
            if (var7.method32107() != Class8514.field37955) {
               if (var7.method32107() != Class8514.field38056) {
                  return Class8848.field39973;
               }

               var4++;
            } else {
               if (!var5.method32105()) {
                  return Class8848.field39973;
               }

               var5 = var7;
            }
         }
      }

      if (!var5.method32105() && var4 >= 1) {
         Class8848 var8 = var5.method32126();
         var8.method32180(var4 + 1);
         return var8;
      } else {
         return Class8848.field39973;
      }
   }

   @Override
   public boolean method14960(int var1, int var2) {
      return var1 >= 3 && var2 >= 3;
   }

   @Override
   public Class6504<?> method14961() {
      return Class6504.field28474;
   }
}
