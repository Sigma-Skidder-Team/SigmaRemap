package mapped;

import java.util.List;

public class Class5825 extends Class5823 {
   private static String[] field25521;
   private final Class1655 field25522;
   private Class4846 field25523;
   private final List<Class4846> field25524;

   public Class5825(int var1, Class974 var2) {
      this(var1, var2, Class8786.field39521);
   }

   public Class5825(int var1, Class974 var2, Class8786 var3) {
      super(Class8298.field35668, var1, var2, var3);
      this.field25522 = var2.field5444.field5024;
      this.field25524 = this.field25522.method6816().<Class920, Class4846>method1031(Class7207.field30941);
   }

   @Override
   public boolean method18191(Class7380 var1) {
      return var1.method23448(Blocks.field37062);
   }

   @Override
   public boolean method18189(PlayerEntity var1, boolean var2) {
      return this.field25523 != null && this.field25523.method14963(this.field25513, this.field25522);
   }

   @Override
   public ItemStack method18190(PlayerEntity var1, ItemStack var2) {
      var2.method32136(var1.field5024, var1, var2.method32179());
      this.field25512.method3638(var1);
      this.method18200(0);
      this.method18200(1);
      this.field25514.method31716((var0, var1x) -> var0.method6999(1044, var1x, 0));
      return var2;
   }

   private void method18200(int var1) {
      ItemStack var4 = this.field25513.method3618(var1);
      var4.method32182(1);
      this.field25513.method3621(var1, var4);
   }

   @Override
   public void method18192() {
      List var3 = this.field25522.method6816().<Class920, Class4846>method1032(Class7207.field30941, this.field25513, this.field25522);
      if (!var3.isEmpty()) {
         this.field25523 = (Class4846)var3.get(0);
         ItemStack var4 = this.field25523.method14962(this.field25513);
         this.field25512.method3636(this.field25523);
         this.field25512.method3621(0, var4);
      } else {
         this.field25512.method3621(0, ItemStack.EMPTY);
      }
   }

   @Override
   public boolean method18193(ItemStack var1) {
      return this.field25524.stream().anyMatch(var1x -> var1x.method14972(var1));
   }

   @Override
   public boolean method18111(ItemStack var1, Class5839 var2) {
      return var2.field25578 != this.field25512 && super.method18111(var1, var2);
   }
}
