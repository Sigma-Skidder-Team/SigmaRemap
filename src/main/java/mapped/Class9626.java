package mapped;

public class Class9626 {
   private final String field45035;
   private final String field45036;

   public Class9626(String var1, Object var2) {
      this.field45035 = var1;
      if (var2 != null) {
         if (!(var2 instanceof Throwable)) {
            this.field45036 = var2.toString();
         } else {
            Throwable var5 = (Throwable)var2;
            this.field45036 = "~~ERROR~~ " + var5.getClass().getSimpleName() + ": " + var5.getMessage();
         }
      } else {
         this.field45036 = "~~NULL~~";
      }
   }

   public String method37523() {
      return this.field45035;
   }

   public String method37524() {
      return this.field45036;
   }
}
