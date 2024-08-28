package mapped;

public class Class6151 implements Class6144 {
   private static String[] field27553;
   public final Class6980 field27554;

   public Class6151(Class6980 var1) {
      this.field27554 = var1;
   }

   @Override
   public Class5931 method19048() {
      if (!this.field27554.field30202.method22329(Class2228.field14607)) {
         Class6980.method21559(this.field27554, new Class6146(this.field27554));
         Class6553 var4 = this.field27554.field30202.method22330();
         return Class6980.method21565(this.field27554, var4.method19895());
      } else {
         Class6553 var3 = this.field27554.field30202.method22331();
         if (this.field27554.field30202.method22329(Class2228.field14602, Class2228.field14607, Class2228.field14590)) {
            Class6980.method21559(this.field27554, new Class6146(this.field27554));
            return Class6980.method21565(this.field27554, var3.method19896());
         } else {
            Class6980.method21562(this.field27554).method36683(new Class6146(this.field27554));
            return Class6980.method21567(this.field27554);
         }
      }
   }
}
