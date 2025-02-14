package mapped;

public class Class928 extends Class927 {
   private static String[] field5264;
   public final Class5823 field5265;

   public Class928(Class5823 var1, int var2) {
      super(var2);
      this.field5265 = var1;
   }

   @Override
   public void markDirty() {
      super.markDirty();
      this.field5265.onCraftMatrixChanged(this);
   }
}
