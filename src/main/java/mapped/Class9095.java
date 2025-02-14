package mapped;

public class Class9095 implements Class9096 {
   private String field41618;

   public Class9095(String var1) {
      this.field41618 = var1;
   }

   public String method33923() {
      return this.field41618;
   }

   @Override
   public int hashCode() {
      return this.field41618.hashCode();
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof Class9095) ? false : ((Class9095)var1).field41618.equals(this.field41618);
   }

   @Override
   public String toString() {
      return "[Command=" + this.field41618 + "]";
   }
}
