package mapped;

public class Class7861 extends Class7859 {
   private static String[] field33670;
   public final Class9110 field33671;
   public final boolean field33672;

   public Class7861(Class9110 var1, boolean var2) {
      this.field33671 = var1;
      this.field33672 = var2;
   }

   @Override
   public boolean method26354(Class9110 var1) {
      return !this.field33672 ? var1.method33978(this.field33671) == 0.0 : var1.method33978(this.field33671) == 1.0;
   }

   @Override
   public double method26355(Class9110 var1) {
      return this.field33671.method33976(var1);
   }
}
