package mapped;

public final class Class9248 {
   private boolean field42551;
   private boolean field42552;

   public Class9248(boolean var1, boolean var2) {
      this.field42551 = var1;
      this.field42552 = var2;
   }

   public Class9248 method34788() {
      return new Class9248(this.field42551, this.field42552);
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof Class9248)) {
            return false;
         } else {
            Class9248 var4 = (Class9248)var1;
            return this.field42551 == var4.field42551 && this.field42552 == var4.field42552;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = !this.field42551 ? 0 : 1;
      return 31 * var3 + (!this.field42552 ? 0 : 1);
   }

   @Override
   public String toString() {
      return "[open=" + this.field42551 + ", filtering=" + this.field42552 + ']';
   }

   // $VF: synthetic method
   public static boolean method34789(Class9248 var0) {
      return var0.field42551;
   }

   // $VF: synthetic method
   public static boolean method34790(Class9248 var0, boolean var1) {
      return var0.field42551 = var1;
   }

   // $VF: synthetic method
   public static boolean method34791(Class9248 var0) {
      return var0.field42552;
   }

   // $VF: synthetic method
   public static boolean method34792(Class9248 var0, boolean var1) {
      return var0.field42552 = var1;
   }
}
