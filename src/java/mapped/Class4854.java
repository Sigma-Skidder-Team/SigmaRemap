package mapped;

import it.unimi.dsi.fastutil.ints.IntList;

public class Class4854 implements Class4842 {
   private static String[] field22647;
   private final ResourceLocation field22648;
   private final String field22649;
   private final Class8848 field22650;
   private final Class25<Class120> field22651;

   public Class4854(ResourceLocation var1, String var2, Class8848 var3, Class25<Class120> var4) {
      this.field22648 = var1;
      this.field22649 = var2;
      this.field22650 = var3;
      this.field22651 = var4;
   }

   @Override
   public ResourceLocation method14964() {
      return this.field22648;
   }

   @Override
   public Class6504<?> method14961() {
      return Class6504.field28471;
   }

   @Override
   public String method14970() {
      return this.field22649;
   }

   @Override
   public Class8848 method14966() {
      return this.field22650;
   }

   @Override
   public Class25<Class120> method14969() {
      return this.field22651;
   }

   public boolean method14963(Class926 var1, Class1655 var2) {
      Class6207 var5 = new Class6207();
      int var6 = 0;

      for (int var7 = 0; var7 < var1.method3629(); var7++) {
         Class8848 var8 = var1.method3618(var7);
         if (!var8.method32105()) {
            var6++;
            var5.method19118(var8, 1);
         }
      }

      return var6 == this.field22651.size() && var5.method19123(this, (IntList)null);
   }

   public Class8848 method14962(Class926 var1) {
      return this.field22650.method32126();
   }

   @Override
   public boolean method14960(int var1, int var2) {
      return var1 * var2 >= this.field22651.size();
   }

   // $VF: synthetic method
   public static String method14998(Class4854 var0) {
      return var0.field22649;
   }

   // $VF: synthetic method
   public static Class25<Class120> method14999(Class4854 var0) {
      return var0.field22651;
   }

   // $VF: synthetic method
   public static Class8848 method15000(Class4854 var0) {
      return var0.field22650;
   }
}
