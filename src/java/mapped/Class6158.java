package mapped;

public class Class6158 implements Class6144 {
   private static String[] field27567;
   public final Class6980 field27568;

   public Class6158(Class6980 var1) {
      this.field27568 = var1;
   }

   @Override
   public Class5931 method19048() {
      if (!this.field27568.field30202.method22329(Class2228.field14607)) {
         Class6980.method21559(this.field27568, new Class6148(this.field27568));
         Class6553 var4 = this.field27568.field30202.method22330();
         return Class6980.method21565(this.field27568, var4.method19895());
      } else {
         Class6553 var3 = this.field27568.field30202.method22331();
         if (this.field27568.field30202.method22329(Class2228.field14597, Class2228.field14600)) {
            Class6980.method21559(this.field27568, new Class6148(this.field27568));
            return Class6980.method21565(this.field27568, var3.method19896());
         } else {
            Class6980.method21562(this.field27568).method36683(new Class6148(this.field27568));
            return Class6980.method21568(this.field27568);
         }
      }
   }
}
