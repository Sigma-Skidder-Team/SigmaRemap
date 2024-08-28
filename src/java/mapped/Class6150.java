package mapped;

public class Class6150 implements Class6144 {
   private static String[] field27551;
   public final Class6980 field27552;

   public Class6150(Class6980 var1) {
      this.field27552 = var1;
   }

   @Override
   public Class5931 method19048() {
      if (this.field27552.field30202.method22329(Class2228.field14594, Class2228.field14596, Class2228.field14604)) {
         Class6145 var7 = new Class6145(this.field27552);
         return var7.method19048();
      } else {
         Class6980.method21560(this.field27552, new Class8342(null, Class6980.method21561()));
         Class6553 var3 = this.field27552.field30202.method22330();
         Class2512 var4 = var3.method19895();
         Class5938 var6 = new Class5938(var4, var4, false, null, null);
         Class6980.method21562(this.field27552).method36683(new Class6160(this.field27552));
         Class6980.method21559(this.field27552, new Class6157(this.field27552));
         return var6;
      }
   }
}
