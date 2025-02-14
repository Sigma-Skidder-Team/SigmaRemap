package mapped;

public class Class6146 implements Class6144 {
   public final Class6980 field27544;

   public Class6146(Class6980 var1) {
      this.field27544 = var1;
   }

   @Override
   public Class5931 method19048() {
      if (!this.field27544.field30202.method22329(Class2228.field14602)) {
         if (this.field27544.field30202.method22329(Class2228.field14590)) {
            Class6553 var6 = this.field27544.field30202.method22331();
            Class5936 var4 = new Class5936(var6.method19895(), var6.method19896());
            Class6980.method21559(this.field27544, (Class6144)Class6980.method21562(this.field27544).method36684());
            Class6980.method21564(this.field27544).method36684();
            return var4;
         } else {
            Class6553 var5 = this.field27544.field30202.method22330();
            throw new Class2480(
               "while parsing a block mapping",
               (Class2512)Class6980.method21564(this.field27544).method36684(),
               "expected <block end>, but found '" + var5.method19894() + "'",
               var5.method19895()
            );
         }
      } else {
         Class6553 var3 = this.field27544.field30202.method22331();
         if (this.field27544.field30202.method22329(Class2228.field14602, Class2228.field14607, Class2228.field14590)) {
            Class6980.method21559(this.field27544, new Class6151(this.field27544));
            return Class6980.method21565(this.field27544, var3.method19896());
         } else {
            Class6980.method21562(this.field27544).method36683(new Class6151(this.field27544));
            return Class6980.method21567(this.field27544);
         }
      }
   }
}
