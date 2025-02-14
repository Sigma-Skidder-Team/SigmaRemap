package mapped;

public class Class5964 implements Class5962 {
   private static String[] field25998;
   private int field25999;

   public Class5964(int var1) {
      this.field25999 = var1;
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof Class5964) ? false : ((Class5964)var1).field25999 == this.field25999;
   }

   @Override
   public int hashCode() {
      return this.field25999;
   }
}
