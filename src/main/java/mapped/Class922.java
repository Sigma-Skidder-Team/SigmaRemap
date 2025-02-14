package mapped;

public class Class922 extends Class921 {
   private static String[] field5240;
   public final Class5836 field5243;

   public Class922(Class5836 var1) {
      this.field5243 = var1;
   }

   @Override
   public void markDirty() {
      this.field5243.onCraftMatrixChanged(this);
      super.markDirty();
   }
}
