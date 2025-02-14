package mapped;

public class Class8486 {
   private static String[] field36385;
   private Class8494[] field36386;

   public Class8486(Class8494[] var1) {
      this.field36386 = var1;
   }

   public void method30009() {
      for (int var3 = 0; var3 < this.field36386.length; var3++) {
         Class8494 var4 = this.field36386[var3];
         var4.method30080();
      }
   }

   public boolean method30010(Class6266 var1) {
      for (int var4 = 0; var4 < this.field36386.length; var4++) {
         Class8494 var5 = this.field36386[var4];
         if (!var5.method30079(var1)) {
            return false;
         }
      }

      return true;
   }
}
