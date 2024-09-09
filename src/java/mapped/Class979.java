package mapped;

public class Class979 extends Class927 {
   private static String[] field5455;
   public final Class5837 field5456;

   public Class979(Class5837 var1, int var2) {
      super(var2);
      this.field5456 = var1;
   }

   @Override
   public void markDirty() {
      super.markDirty();
      Class5837.method18253(this.field5456).run();
   }
}
