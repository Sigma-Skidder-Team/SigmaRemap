package mapped;

public class Class7813 {
   private final boolean field33521;
   private final boolean field33522;

   public Class7813(boolean var1, boolean var2) {
      this.field33521 = var1;
      this.field33522 = var2;
   }

   public boolean method26091() {
      return this.field33521;
   }

   public boolean method26092() {
      return this.field33522;
   }

   public boolean method26093() {
      return !this.field33521 && !this.field33522;
   }

   @Override
   public String toString() {
      return "implicit=[" + this.field33521 + ", " + this.field33522 + "]";
   }
}
