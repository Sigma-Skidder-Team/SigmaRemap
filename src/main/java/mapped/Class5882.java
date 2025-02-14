package mapped;

public class Class5882 extends Class5876<Class5882> {
   private static String[] field25682;
   private final Class6872 field25683;
   private int field25684 = 0;

   public Class5882(Class6872 var1) {
      this.field25683 = var1;
   }

   public Class5882 method18305() {
      return this;
   }

   public Class5882 method18317(int var1) {
      this.field25684 = var1;
      return this;
   }

   @Override
   public ILootFunction method18309() {
      return new Class130(this.method18306(), this.field25683, this.field25684);
   }
}
