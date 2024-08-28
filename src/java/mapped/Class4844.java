package mapped;

public abstract class Class4844 implements Class4843<Class920> {
   public final Class120 field22618;
   public final Class8848 field22619;
   private final Class7207<?> field22620;
   private final Class6504<?> field22621;
   public final ResourceLocation field22622;
   public final String field22623;

   public Class4844(Class7207<?> var1, Class6504<?> var2, ResourceLocation var3, String var4, Class120 var5, Class8848 var6) {
      this.field22620 = var1;
      this.field22621 = var2;
      this.field22622 = var3;
      this.field22623 = var4;
      this.field22618 = var5;
      this.field22619 = var6;
   }

   @Override
   public Class7207<?> method14967() {
      return this.field22620;
   }

   @Override
   public Class6504<?> method14961() {
      return this.field22621;
   }

   @Override
   public ResourceLocation method14964() {
      return this.field22622;
   }

   @Override
   public String method14970() {
      return this.field22623;
   }

   @Override
   public Class8848 method14966() {
      return this.field22619;
   }

   @Override
   public Class25<Class120> method14969() {
      Class25 var3 = Class25.method67();
      var3.add(this.field22618);
      return var3;
   }

   @Override
   public boolean method14960(int var1, int var2) {
      return true;
   }

   @Override
   public Class8848 method14962(Class920 var1) {
      return this.field22619.method32126();
   }
}
