package mapped;

public class Class978 extends Class927 {
   private static String[] field5453;
   public final Class5837 field5454;

   public Class978(Class5837 var1, int var2) {
      super(var2);
      this.field5454 = var1;
   }

   @Override
   public void markDirty() {
      super.markDirty();
      this.field5454.onCraftMatrixChanged(this);
      Class5837.method18253(this.field5454).run();
   }
}
