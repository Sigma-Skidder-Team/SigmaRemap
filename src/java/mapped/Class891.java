package mapped;

public class Class891 extends Class890 {
   private static String[] field5127;

   public Class891(Class8992<? extends Class891> var1, Class1655 var2) {
      super(var1, var2);
   }

   public Class891(Class1655 var1, Class880 var2) {
      super(Class8992.field41091, var2, var1);
   }

   public Class891(Class1655 var1, double var2, double var4, double var6) {
      super(Class8992.field41091, var2, var4, var6, var1);
   }

   @Override
   public Class3257 method3512() {
      return Class8514.field38045;
   }

   @Override
   public float method3515() {
      return 0.07F;
   }

   @Override
   public void method3464(Class8710 var1) {
      super.method3464(var1);
      if (!this.field5024.field9020) {
         this.field5024.method6999(2002, this.method3432(), Class9741.method38183(Class8137.field34977));
         int var4 = 3 + this.field5024.field9016.nextInt(5) + this.field5024.field9016.nextInt(5);

         while (var4 > 0) {
            int var5 = Class1003.method4179(var4);
            var4 -= var5;
            this.field5024.method6916(new Class1003(this.field5024, this.getPosX(), this.getPosY(), this.getPosZ(), var5));
         }

         this.method2904();
      }
   }
}
