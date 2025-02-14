package mapped;

public class Class6145 implements Class6144 {
   public final Class6980 field27543;

   public Class6145(Class6980 var1) {
      this.field27543 = var1;
   }

   @Override
   public Class5931 method19048() {
      while (this.field27543.field30202.method22329(Class2228.field14595)) {
         this.field27543.field30202.method22331();
      }

      Object var4;
      if (this.field27543.field30202.method22329(Class2228.field14604)) {
         Class6569 var3 = (Class6569)this.field27543.field30202.method22331();
         var4 = new Class5937(var3.method19895(), var3.method19896());
         if (!Class6980.method21562(this.field27543).method36685()) {
            throw new Class2478("Unexpected end of stream. States left: " + Class6980.method21562(this.field27543));
         }

         if (!Class6980.method21564(this.field27543).method36685()) {
            throw new Class2478("Unexpected end of stream. Marks left: " + Class6980.method21564(this.field27543));
         }

         Class6980.method21559(this.field27543, null);
      } else {
         Class6553 var8 = this.field27543.field30202.method22330();
         Class2512 var5 = var8.method19895();
         Class8342 var6 = Class6980.method21563(this.field27543);
         if (!this.field27543.field30202.method22329(Class2228.field14596)) {
            throw new Class2480(
               null,
               null,
               "expected '<document start>', but found '" + this.field27543.field30202.method22330().method19894() + "'",
               this.field27543.field30202.method22330().method19895()
            );
         }

         var8 = this.field27543.field30202.method22331();
         Class2512 var7 = var8.method19896();
         var4 = new Class5938(var5, var7, true, var6.method29248(), var6.method29249());
         Class6980.method21562(this.field27543).method36683(new Class6160(this.field27543));
         Class6980.method21559(this.field27543, new Class6143(this.field27543));
      }

      return (Class5931)var4;
   }
}
