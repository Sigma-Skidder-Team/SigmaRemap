package mapped;

public class Class6147 implements Class6144 {
   private boolean field27545;
   public final Class6980 field27546;

   public Class6147(Class6980 var1, boolean var2) {
      this.field27546 = var1;
      this.field27545 = false;
      this.field27545 = var2;
   }

   @Override
   public Class5931 method19048() {
      if (!this.field27546.field30202.method22329(Class2228.field14598)) {
         if (!this.field27545) {
            if (!this.field27546.field30202.method22329(Class2228.field14597)) {
               Class6553 var6 = this.field27546.field30202.method22330();
               throw new Class2480(
                  "while parsing a flow mapping",
                  (Class2512)Class6980.method21564(this.field27546).method36684(),
                  "expected ',' or '}', but got " + var6.method19894(),
                  var6.method19895()
               );
            }

            this.field27546.field30202.method22331();
         }

         if (this.field27546.field30202.method22329(Class2228.field14602)) {
            Class6553 var5 = this.field27546.field30202.method22331();
            if (this.field27546.field30202.method22329(Class2228.field14607, Class2228.field14597, Class2228.field14598)) {
               Class6980.method21559(this.field27546, new Class6155(this.field27546));
               return Class6980.method21565(this.field27546, var5.method19896());
            }

            Class6980.method21562(this.field27546).method36683(new Class6155(this.field27546));
            return Class6980.method21568(this.field27546);
         }

         if (!this.field27546.field30202.method22329(Class2228.field14598)) {
            Class6980.method21562(this.field27546).method36683(new Class6161(this.field27546));
            return Class6980.method21568(this.field27546);
         }
      }

      Class6553 var3 = this.field27546.field30202.method22331();
      Class5936 var4 = new Class5936(var3.method19895(), var3.method19896());
      Class6980.method21559(this.field27546, (Class6144)Class6980.method21562(this.field27546).method36684());
      Class6980.method21564(this.field27546).method36684();
      return var4;
   }
}
