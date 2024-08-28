package mapped;

public abstract class Class4847 implements Class4843<Class920> {
   public final Class7207<?> field22630;
   public final ResourceLocation field22631;
   public final String field22632;
   public final Class120 field22633;
   public final Class8848 field22634;
   public final float field22635;
   public final int field22636;

   public Class4847(Class7207<?> var1, ResourceLocation var2, String var3, Class120 var4, Class8848 var5, float var6, int var7) {
      this.field22630 = var1;
      this.field22631 = var2;
      this.field22632 = var3;
      this.field22633 = var4;
      this.field22634 = var5;
      this.field22635 = var6;
      this.field22636 = var7;
   }

   @Override
   public boolean method14963(Class920 var1, Class1655 var2) {
      return this.field22633.test(var1.method3618(0));
   }

   @Override
   public Class8848 method14962(Class920 var1) {
      return this.field22634.method32126();
   }

   @Override
   public boolean method14960(int var1, int var2) {
      return true;
   }

   @Override
   public Class25<Class120> method14969() {
      Class25 var3 = Class25.method67();
      var3.add(this.field22633);
      return var3;
   }

   public float method14976() {
      return this.field22635;
   }

   @Override
   public Class8848 method14966() {
      return this.field22634;
   }

   @Override
   public String method14970() {
      return this.field22632;
   }

   public int method14977() {
      return this.field22636;
   }

   @Override
   public ResourceLocation method14964() {
      return this.field22631;
   }

   @Override
   public Class7207<?> method14967() {
      return this.field22630;
   }
}
