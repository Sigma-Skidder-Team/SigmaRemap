package mapped;

public class Class5963 implements Class5962 {
   private static String[] field25996;
   private int field25997;

   public Class5963(int var1) {
      this.field25997 = var1;
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof Class5963) ? false : ((Class5963)var1).field25997 == this.field25997;
   }

   @Override
   public int hashCode() {
      return this.field25997;
   }
}
