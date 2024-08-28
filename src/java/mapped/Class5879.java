package mapped;

public class Class5879 extends Class5876<Class5879> {
   private static String[] field25671;
   private final Class6870 field25672;
   private boolean field25673;

   public Class5879(Class6870 var1) {
      this.field25672 = var1;
   }

   public Class5879 method18305() {
      return this;
   }

   public Class5879 method18311() {
      this.field25673 = true;
      return this;
   }

   @Override
   public Class127 method18309() {
      return new Class143(this.method18306(), this.field25672, this.field25673);
   }
}
