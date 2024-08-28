package mapped;

public class Class6156 implements Class6144 {
   private static String[] field27563;
   public final Class6980 field27564;

   public Class6156(Class6980 var1) {
      this.field27564 = var1;
   }

   @Override
   public Class5931 method19048() {
      if (!this.field27564.field30202.method22329(Class2228.field14591)) {
         Class6553 var5 = this.field27564.field30202.method22330();
         Class5935 var4 = new Class5935(var5.method19895(), var5.method19896());
         Class6980.method21559(this.field27564, (Class6144)Class6980.method21562(this.field27564).method36684());
         return var4;
      } else {
         Class6553 var3 = this.field27564.field30202.method22331();
         if (this.field27564.field30202.method22329(Class2228.field14591, Class2228.field14602, Class2228.field14607, Class2228.field14590)) {
            Class6980.method21559(this.field27564, new Class6156(this.field27564));
            return Class6980.method21565(this.field27564, var3.method19896());
         } else {
            Class6980.method21562(this.field27564).method36683(new Class6156(this.field27564));
            return new Class6157(this.field27564).method19048();
         }
      }
   }
}
