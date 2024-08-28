package mapped;

public final class Class7270<T extends Comparable<T>> {
   private final Class8550<T> field31190;
   private final T field31191;

   Class7270(Class8550<T> var1, T var2) {
      if (var1.method30474().contains(var2)) {
         this.field31190 = var1;
         this.field31191 = (T)var2;
      } else {
         throw new IllegalArgumentException("Value " + var2 + " does not belong to property " + var1);
      }
   }

   public Class8550<T> method22834() {
      return this.field31190;
   }

   public T method22835() {
      return this.field31191;
   }

   @Override
   public String toString() {
      return this.field31190.method30472() + "=" + this.field31190.method30475(this.field31191);
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof Class7270)) {
            return false;
         } else {
            Class7270 var4 = (Class7270)var1;
            return this.field31190 == var4.field31190 && this.field31191.equals(var4.field31191);
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field31190.hashCode();
      return 31 * var3 + this.field31191.hashCode();
   }
}
