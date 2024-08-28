package mapped;

public class Class4861 extends Class4837 {
   private static String[] field22663;

   public Class4861(ResourceLocation var1) {
      super(var1);
   }

   public boolean method14963(Class926 var1, Class1655 var2) {
      Class112 var5 = null;
      Class8848 var6 = null;
      Class8848 var7 = null;

      for (int var8 = 0; var8 < var1.method3629(); var8++) {
         Class8848 var9 = var1.method3618(var8);
         Class3257 var10 = var9.method32107();
         if (var10 instanceof Class3301) {
            Class3301 var11 = (Class3301)var10;
            if (var5 != null) {
               if (var5 != var11.method11849()) {
                  return false;
               }
            } else {
               var5 = var11.method11849();
            }

            int var12 = Class958.method3889(var9);
            if (var12 > 6) {
               return false;
            }

            if (var12 <= 0) {
               if (var7 != null) {
                  return false;
               }

               var7 = var9;
            } else {
               if (var6 != null) {
                  return false;
               }

               var6 = var9;
            }
         }
      }

      return var6 != null && var7 != null;
   }

   public Class8848 method14962(Class926 var1) {
      for (int var4 = 0; var4 < var1.method3629(); var4++) {
         Class8848 var5 = var1.method3618(var4);
         if (!var5.method32105()) {
            int var6 = Class958.method3889(var5);
            if (var6 > 0 && var6 <= 6) {
               Class8848 var7 = var5.method32126();
               var7.method32180(1);
               return var7;
            }
         }
      }

      return Class8848.field39973;
   }

   public Class25<Class8848> method14968(Class926 var1) {
      Class25 var4 = Class25.<Class8848>method68(var1.method3629(), Class8848.field39973);

      for (int var5 = 0; var5 < var4.size(); var5++) {
         Class8848 var6 = var1.method3618(var5);
         if (!var6.method32105()) {
            if (!var6.method32107().method11723()) {
               if (var6.method32141() && Class958.method3889(var6) > 0) {
                  Class8848 var7 = var6.method32126();
                  var7.method32180(1);
                  var4.set(var5, var7);
               }
            } else {
               var4.set(var5, new Class8848(var6.method32107().method11722()));
            }
         }
      }

      return var4;
   }

   @Override
   public Class6504<?> method14961() {
      return Class6504.field28480;
   }

   @Override
   public boolean method14960(int var1, int var2) {
      return var1 * var2 >= 2;
   }
}
