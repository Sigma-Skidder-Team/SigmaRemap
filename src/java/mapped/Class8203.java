package mapped;

public class Class8203 implements Class8202 {
   private static String[] field35234;
   public final Class931 field35235;

   public Class8203(Class931 var1) {
      this.field35235 = var1;
   }

   @Override
   public int method28505(int var1) {
      switch (var1) {
         case 0:
            return Class931.method3691(this.field35235);
         case 1:
            return Class931.method3692(this.field35235);
         default:
            return 0;
      }
   }

   @Override
   public void method28506(int var1, int var2) {
      switch (var1) {
         case 0:
            Class931.method3693(this.field35235, var2);
            break;
         case 1:
            Class931.method3694(this.field35235, var2);
      }
   }

   @Override
   public int method28507() {
      return 2;
   }
}
