package mapped;

public class Class8489 {
   private String field37150;
   private String field37151;

   public Class8489(String var1, String var2) {
      this.field37150 = var1;
      this.field37151 = var2;
   }

   public String method30066() {
      return this.field37150;
   }

   public String method30067() {
      return this.field37151;
   }

   public String method30068() {
      return "#define " + this.field37150 + " " + this.field37151;
   }

   @Override
   public String toString() {
      return this.method30068();
   }
}
