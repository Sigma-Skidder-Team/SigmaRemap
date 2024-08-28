package mapped;

public class Class8201 implements Class8202 {
   private static String[] field35232;
   public final Class950 field35233;

   public Class8201(Class950 var1) {
      this.field35233 = var1;
   }

   @Override
   public int method28505(int var1) {
      switch (var1) {
         case 0:
            return Class950.method3827(this.field35233);
         case 1:
            return Class7144.method22288(Class950.method3828(this.field35233));
         case 2:
            return Class7144.method22288(Class950.method3829(this.field35233));
         default:
            return 0;
      }
   }

   @Override
   public void method28506(int var1, int var2) {
      switch (var1) {
         case 0:
            Class950.method3830(this.field35233, var2);
            break;
         case 1:
            if (!this.field35233.field5324.field9020 && !Class950.method3831(this.field35233).isEmpty()) {
               this.field35233.method3822(Class6067.field26388);
            }

            Class950.method3832(this.field35233, Class950.method3833(var2));
            break;
         case 2:
            Class950.method3834(this.field35233, Class950.method3833(var2));
      }
   }

   @Override
   public int method28507() {
      return 3;
   }
}
