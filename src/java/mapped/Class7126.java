package mapped;

public class Class7126 {
   private int field30653;
   private int field30654;
   private final int field30655;

   public Class7126(int var1, int var2) {
      this.field30653 = var1;
      this.field30654 = var2;
      this.field30655 = var1 + 37 * var2;
   }

   public static Class7126 method22234(int var0, int var1) {
      return new Class7126(var0, var1);
   }

   public int method22235() {
      return this.field30653;
   }

   public int method22236() {
      return this.field30654;
   }

   @Override
   public int hashCode() {
      return this.field30655;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 != this) {
         if (!(var1 instanceof Class7126)) {
            return false;
         } else {
            Class7126 var4 = (Class7126)var1;
            return this.field30653 == var4.field30653 && this.field30654 == var4.field30654;
         }
      } else {
         return true;
      }
   }

   @Override
   public String toString() {
      return "(" + this.field30653 + ", " + this.field30654 + ")";
   }
}
