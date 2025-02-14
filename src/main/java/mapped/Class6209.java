package mapped;

public class Class6209 extends Class6208 {
   private String field27695;

   public Class6209(String var1) {
      this.field27695 = var1;
   }

   @Override
   public Class<?> method19143(String var1) throws ClassNotFoundException {
      if (var1.indexOf(46) < 0) {
         try {
            return Class.forName(this.field27695 + "." + var1);
         } catch (ClassNotFoundException var5) {
         }
      }

      return super.method19143(var1);
   }
}
