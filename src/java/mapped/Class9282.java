package mapped;

public class Class9282<T extends Class4477> {
   private static String[] field42703;
   private final T field42704;
   private final Class7952 field42705;
   private final String field42706;

   public Class9282(T var1, Class7952 var2, String var3) {
      this.field42704 = (T)var1;
      this.field42705 = var2;
      this.field42706 = var3;
   }

   public T method35005() {
      return this.field42704;
   }

   public void method35006(Class8019 var1) {
      var1.method27410(this.field42705, this.field42706);
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            Class9282 var4 = (Class9282)var1;
            if (this.field42704.equals(var4.field42704)) {
               return this.field42705.equals(var4.field42705) ? this.field42706.equals(var4.field42706) : false;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field42704.hashCode();
      var3 = 31 * var3 + this.field42705.hashCode();
      return 31 * var3 + this.field42706.hashCode();
   }
}
