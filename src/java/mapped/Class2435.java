package mapped;

public class Class2435 extends Exception {
   public final int field16472;
   public final String field16473;
   public final int field16474;
   public final String field16475;

   public Class2435(int var1, String var2, Class9636 var3) {
      super(var2);
      this.field16472 = var1;
      this.field16473 = var2;
      this.field16474 = var3.method37561();
      this.field16475 = var3.method37560();
   }

   public Class2435(int var1, String var2, int var3, String var4) {
      super(var2);
      this.field16472 = var1;
      this.field16473 = var2;
      this.field16474 = var3;
      this.field16475 = var4;
   }

   @Override
   public String toString() {
      if (this.field16474 != -1) {
         String var3 = "mco.errorMessage." + this.field16474;
         String var4 = I18n.format(var3);
         return (!var4.equals(var3) ? var4 : this.field16475) + " - " + this.field16474;
      } else {
         return "Realms (" + this.field16472 + ") " + this.field16473;
      }
   }
}
