package mapped;

public final class Class7951 {
   private final String field34184;
   private final String field34185;

   public Class7951(String var1, String var2) {
      if (var2 != null) {
         this.field34184 = var1;
         this.field34185 = var2;
      } else {
         throw new NullPointerException("Suffix must be provided.");
      }
   }

   public String method27023() {
      return this.field34184;
   }

   public String method27024() {
      return this.field34185;
   }
}
