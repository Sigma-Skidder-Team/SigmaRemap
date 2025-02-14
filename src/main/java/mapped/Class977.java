package mapped;

public class Class977 extends Class927 {
   private static String[] field5451;
   public final Class5811 field5452;

   public Class977(Class5811 var1, int var2) {
      super(var2);
      this.field5452 = var1;
   }

   @Override
   public void markDirty() {
      super.markDirty();
      this.field5452.onCraftMatrixChanged(this);
      Class5811.method18116(this.field5452).run();
   }
}
