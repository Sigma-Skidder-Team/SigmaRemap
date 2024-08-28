package mapped;

public class Class894 extends Class890 {
   private static String[] field5129;

   public Class894(Class8992<? extends Class894> var1, Class1655 var2) {
      super(var1, var2);
   }

   public Class894(Class1655 var1, Class880 var2) {
      super(Class8992.field41083, var2, var1);
   }

   public Class894(Class1655 var1, double var2, double var4, double var6) {
      super(Class8992.field41083, var2, var4, var6, var1);
   }

   @Override
   public Class3257 method3512() {
      return Class8514.field37888;
   }

   private Class7436 method3516() {
      Class8848 var3 = this.method3513();
      return (Class7436)(!var3.method32105() ? new Class7438(Class7940.field34082, var3) : Class7940.field34084);
   }

   @Override
   public void method2866(byte var1) {
      if (var1 == 3) {
         Class7436 var4 = this.method3516();

         for (int var5 = 0; var5 < 8; var5++) {
            this.field5024.method6746(var4, this.getPosX(), this.getPosY(), this.getPosZ(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public void method3465(Class8709 var1) {
      super.method3465(var1);
      Entity var4 = var1.method31416();
      int var5 = !(var4 instanceof Class1103) ? 0 : 3;
      var4.method2741(Class8654.method31123(this, this.method3460()), (float)var5);
   }

   @Override
   public void method3464(Class8710 var1) {
      super.method3464(var1);
      if (!this.field5024.field9020) {
         this.field5024.method6786(this, (byte)3);
         this.method2904();
      }
   }
}
