package mapped;

public class Class4841 extends Class4837 {
   public Class4841(ResourceLocation var1) {
      super(var1);
   }

   public boolean method14963(Class926 var1, Class1655 var2) {
      Class8848 var5 = Class8848.field39973;
      Class8848 var6 = Class8848.field39973;

      for (int var7 = 0; var7 < var1.method3629(); var7++) {
         Class8848 var8 = var1.method3618(var7);
         if (!var8.method32105()) {
            if (!(var8.method32107() instanceof Class3301)) {
               if (var8.method32107() != Class8514.field38119) {
                  return false;
               }

               if (!var5.method32105()) {
                  return false;
               }

               if (var8.method32145("BlockEntityTag") != null) {
                  return false;
               }

               var5 = var8;
            } else {
               if (!var6.method32105()) {
                  return false;
               }

               var6 = var8;
            }
         }
      }

      return !var5.method32105() && !var6.method32105();
   }

   public Class8848 method14962(Class926 var1) {
      Class8848 var4 = Class8848.field39973;
      Class8848 var5 = Class8848.field39973;

      for (int var6 = 0; var6 < var1.method3629(); var6++) {
         Class8848 var7 = var1.method3618(var6);
         if (!var7.method32105()) {
            if (!(var7.method32107() instanceof Class3301)) {
               if (var7.method32107() == Class8514.field38119) {
                  var5 = var7.method32126();
               }
            } else {
               var4 = var7;
            }
         }
      }

      if (!var5.method32105()) {
         Class39 var8 = var4.method32145("BlockEntityTag");
         Class39 var9 = var8 != null ? var8.method79() : new Class39();
         var9.method102("Base", ((Class3301)var4.method32107()).method11849().method309());
         var5.method32164("BlockEntityTag", var9);
         return var5;
      } else {
         return var5;
      }
   }

   @Override
   public boolean method14960(int var1, int var2) {
      return var1 * var2 >= 2;
   }

   @Override
   public Class6504<?> method14961() {
      return Class6504.field28481;
   }
}
