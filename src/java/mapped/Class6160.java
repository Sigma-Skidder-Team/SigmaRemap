package mapped;

public class Class6160 implements Class6144 {
   private static String[] field27571;
   public final Class6980 field27572;

   public Class6160(Class6980 var1) {
      this.field27572 = var1;
   }

   @Override
   public Class5931 method19048() {
      Class6553 var3 = this.field27572.field30202.method22330();
      Class2512 var4 = var3.method19895();
      Class2512 var5 = var4;
      boolean var6 = false;
      if (this.field27572.field30202.method22329(Class2228.field14595)) {
         var3 = this.field27572.field30202.method22331();
         var5 = var3.method19896();
         var6 = true;
      }

      Class5932 var7 = new Class5932(var4, var5, var6);
      Class6980.method21559(this.field27572, new Class6145(this.field27572));
      return var7;
   }
}
