package mapped;

public abstract class Class5931 {
   private final Class2512 field25822;
   private final Class2512 field25823;

   public Class5931(Class2512 var1, Class2512 var2) {
      this.field25822 = var1;
      this.field25823 = var2;
   }

   @Override
   public String toString() {
      return "<" + this.getClass().getName() + "(" + this.method18429() + ")>";
   }

   public Class2512 method18438() {
      return this.field25822;
   }

   public Class2512 method18439() {
      return this.field25823;
   }

   public String method18429() {
      return "";
   }

   public abstract boolean method18431(Class78 var1);

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof Class5931) ? false : this.toString().equals(var1.toString());
   }

   @Override
   public int hashCode() {
      return this.toString().hashCode();
   }
}
