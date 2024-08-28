package mapped;

public class Class4846 implements Class4843<Class920> {
   private static String[] field22625;
   private final Class120 field22626;
   private final Class120 field22627;
   private final Class8848 field22628;
   private final ResourceLocation field22629;

   public Class4846(ResourceLocation var1, Class120 var2, Class120 var3, Class8848 var4) {
      this.field22629 = var1;
      this.field22626 = var2;
      this.field22627 = var3;
      this.field22628 = var4;
   }

   @Override
   public boolean method14963(Class920 var1, Class1655 var2) {
      return this.field22626.test(var1.method3618(0)) && this.field22627.test(var1.method3618(1));
   }

   @Override
   public Class8848 method14962(Class920 var1) {
      Class8848 var4 = this.field22628.method32126();
      Class39 var5 = var1.method3618(0).method32142();
      if (var5 != null) {
         var4.method32148(var5.method79());
      }

      return var4;
   }

   @Override
   public boolean method14960(int var1, int var2) {
      return var1 * var2 >= 2;
   }

   @Override
   public Class8848 method14966() {
      return this.field22628;
   }

   public boolean method14972(Class8848 var1) {
      return this.field22627.test(var1);
   }

   @Override
   public Class8848 method14971() {
      return new Class8848(Class8487.field37062);
   }

   @Override
   public ResourceLocation method14964() {
      return this.field22629;
   }

   @Override
   public Class6504<?> method14961() {
      return Class6504.field28490;
   }

   @Override
   public Class7207<?> method14967() {
      return Class7207.field30941;
   }

   // $VF: synthetic method
   public static Class120 method14973(Class4846 var0) {
      return var0.field22626;
   }

   // $VF: synthetic method
   public static Class120 method14974(Class4846 var0) {
      return var0.field22627;
   }

   // $VF: synthetic method
   public static Class8848 method14975(Class4846 var0) {
      return var0.field22628;
   }
}
