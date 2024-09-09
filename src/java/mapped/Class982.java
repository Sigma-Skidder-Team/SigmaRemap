package mapped;

public class Class982 extends Class927 {
   private static String[] field5460;
   public final Class5815 field5461;

   public Class982(Class5815 var1, int var2) {
      super(var2);
      this.field5461 = var1;
   }

   @Override
   public void markDirty() {
      super.markDirty();
      this.field5461.onCraftMatrixChanged(this);
   }
}
