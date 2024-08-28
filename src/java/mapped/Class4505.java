package mapped;

public class Class4505 extends Class4510 {
   private static String[] field21732;
   private final boolean field21733;

   public Class4505(String var1, Runnable var2, Runnable var3, boolean var4) {
      super(var1, var2, var3);
      this.field21733 = var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            Class4505 var4 = (Class4505)var1;
            return this.field21733 == var4.field21733;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return Boolean.hashCode(this.field21733);
   }

   @Override
   public String toString() {
      return this.field21734 + '[' + this.field21733 + ']';
   }
}
