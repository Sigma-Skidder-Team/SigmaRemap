package mapped;

public class Class6792 {
   private static String[] field29587;
   public static final Class6792 field29588 = new Class6792(new Class7680(), new Class7680(), new Class7680(1.0F, 1.0F, 1.0F));
   public final Class7680 field29589;
   public final Class7680 field29590;
   public final Class7680 field29591;

   public Class6792(Class7680 var1, Class7680 var2, Class7680 var3) {
      this.field29589 = var1.method25287();
      this.field29590 = var2.method25287();
      this.field29591 = var3.method25287();
   }

   public void method20691(boolean var1, MatrixStack var2) {
      if (this != field29588) {
         float var5 = this.field29589.method25269();
         float var6 = this.field29589.method25270();
         float var7 = this.field29589.method25271();
         if (var1) {
            var6 = -var6;
            var7 = -var7;
         }

         int var8 = !var1 ? 1 : -1;
         var2.method35291((double)((float)var8 * this.field29590.method25269()), (double)this.field29590.method25270(), (double)this.field29590.method25271());
         var2.method35293(new Class8661(var5, var6, var7, true));
         var2.method35292(this.field29591.method25269(), this.field29591.method25270(), this.field29591.method25271());
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (this.getClass() != var1.getClass()) {
            return false;
         } else {
            Class6792 var4 = (Class6792)var1;
            return this.field29589.equals(var4.field29589) && this.field29591.equals(var4.field29591) && this.field29590.equals(var4.field29590);
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field29589.hashCode();
      var3 = 31 * var3 + this.field29590.hashCode();
      return 31 * var3 + this.field29591.hashCode();
   }
}
