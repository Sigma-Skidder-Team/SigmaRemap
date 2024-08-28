package mapped;

public class Class4857 extends Class4837 {
   public Class4857(ResourceLocation var1) {
      super(var1);
   }

   public boolean method14963(Class926 var1, Class1655 var2) {
      int var5 = 0;
      Class8848 var6 = Class8848.field39973;

      for (int var7 = 0; var7 < var1.method3629(); var7++) {
         Class8848 var8 = var1.method3618(var7);
         if (!var8.method32105()) {
            if (var8.method32107() != Class8514.field38048) {
               if (var8.method32107() != Class8514.field38047) {
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

      return !var6.method32105() && var6.method32141() && var5 > 0;
   }

   public Class8848 method14962(Class926 var1) {
      int var4 = 0;
      Class8848 var5 = Class8848.field39973;

      for (int var6 = 0; var6 < var1.method3629(); var6++) {
         Class8848 var7 = var1.method3618(var6);
         if (!var7.method32105()) {
            if (var7.method32107() != Class8514.field38048) {
               if (var7.method32107() != Class8514.field38047) {
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

      if (!var5.method32105() && var5.method32141() && var4 >= 1 && Class3285.method11818(var5) < 2) {
         Class8848 var8 = new Class8848(Class8514.field38048, var4);
         Class39 var9 = var5.method32142().method79();
         var9.method102("generation", Class3285.method11818(var5) + 1);
         var8.method32148(var9);
         return var8;
      } else {
         return Class8848.field39973;
      }
   }

   public Class25<Class8848> method14968(Class926 var1) {
      Class25 var4 = Class25.<Class8848>method68(var1.method3629(), Class8848.field39973);

      for (int var5 = 0; var5 < var4.size(); var5++) {
         Class8848 var6 = var1.method3618(var5);
         if (!var6.method32107().method11723()) {
            if (var6.method32107() instanceof Class3285) {
               Class8848 var7 = var6.method32126();
               var7.method32180(1);
               var4.set(var5, var7);
               break;
            }
         } else {
            var4.set(var5, new Class8848(var6.method32107().method11722()));
         }
      }

      return var4;
   }

   @Override
   public Class6504<?> method14961() {
      return Class6504.field28473;
   }

   @Override
   public boolean method14960(int var1, int var2) {
      return var1 >= 3 && var2 >= 3;
   }
}
