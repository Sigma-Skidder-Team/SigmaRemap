package mapped;

public final class Class9824 {
   private final String field45901;
   private final String field45902;

   public Class9824(String var1, String var2) {
      if (var1 != null) {
         if (var2 != null) {
            this.field45901 = var1;
            this.field45902 = var2;
         } else {
            throw new NullPointerException("realm == null");
         }
      } else {
         throw new NullPointerException("scheme == null");
      }
   }

   public String method38781() {
      return this.field45901;
   }

   public String method38782() {
      return this.field45902;
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof Class9824 && ((Class9824)var1).field45901.equals(this.field45901) && ((Class9824)var1).field45902.equals(this.field45902);
   }

   @Override
   public int hashCode() {
      int var3 = 29;
      var3 = 31 * var3 + this.field45902.hashCode();
      return 31 * var3 + this.field45901.hashCode();
   }

   @Override
   public String toString() {
      return this.field45901 + " realm=\"" + this.field45902 + "\"";
   }
}
