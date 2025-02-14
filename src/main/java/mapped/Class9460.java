package mapped;

public final class Class9460 {
   private Class7255 field43958;
   private Class7255 field43959;

   public Class9460(Class7255 var1, Class7255 var2) {
      if (var1 != null && var2 != null) {
         this.field43958 = var1;
         this.field43959 = var2;
      } else {
         throw new NullPointerException("Nodes must be provided.");
      }
   }

   public Class7255 method36417() {
      return this.field43958;
   }

   public Class7255 method36418() {
      return this.field43959;
   }

   @Override
   public String toString() {
      return "<NodeTuple keyNode=" + this.field43958.toString() + "; valueNode=" + this.field43959.toString() + ">";
   }
}
