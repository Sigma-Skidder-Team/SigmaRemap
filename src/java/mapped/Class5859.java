package mapped;

public class Class5859 extends Class5839 {
   private static String[] field25620;
   public final AbstractHorseEntity field25621;
   public final Class5827 field25622;

   public Class5859(Class5827 var1, Class920 var2, int var3, int var4, int var5, AbstractHorseEntity var6) {
      super(var2, var3, var4, var5);
      this.field25622 = var1;
      this.field25621 = var6;
   }

   @Override
   public boolean method18259(ItemStack var1) {
      return var1.getItem() == Items.field37886 && !this.method18266() && this.field25621.method4901();
   }

   @Override
   public boolean method18274() {
      return this.field25621.method4901();
   }
}
