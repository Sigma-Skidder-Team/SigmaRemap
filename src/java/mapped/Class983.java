package mapped;

public class Class983 extends Class927 {
   private static String[] field5462;
   public final Class5822 field5463;

   public Class983(Class5822 var1, int var2) {
      super(var2);
      this.field5463 = var1;
   }

   @Override
   public void markDirty() {
      super.markDirty();
      this.field5463.onCraftMatrixChanged(this);
   }
}
