package mapped;

public class Class6163 implements Class6144 {
   public final Class6980 field27577;

   public Class6163(Class6980 var1) {
      this.field27577 = var1;
   }

   @Override
   public Class5931 method19048() {
      if (!this.field27577.field30202.method22329(Class2228.field14591)) {
         if (this.field27577.field30202.method22329(Class2228.field14590)) {
            Class6553 var6 = this.field27577.field30202.method22331();
            Class5935 var4 = new Class5935(var6.method19895(), var6.method19896());
            Class6980.method21559(this.field27577, (Class6144)Class6980.method21562(this.field27577).method36684());
            Class6980.method21564(this.field27577).method36684();
            return var4;
         } else {
            Class6553 var5 = this.field27577.field30202.method22330();
            throw new Class2480(
               "while parsing a block collection",
               (Class2512)Class6980.method21564(this.field27577).method36684(),
               "expected <block end>, but found '" + var5.method19894() + "'",
               var5.method19895()
            );
         }
      } else {
         Class6560 var3 = (Class6560)this.field27577.field30202.method22331();
         if (this.field27577.field30202.method22329(Class2228.field14591, Class2228.field14590)) {
            Class6980.method21559(this.field27577, new Class6163(this.field27577));
            return Class6980.method21565(this.field27577, var3.method19896());
         } else {
            Class6980.method21562(this.field27577).method36683(new Class6163(this.field27577));
            return new Class6157(this.field27577).method19048();
         }
      }
   }
}
