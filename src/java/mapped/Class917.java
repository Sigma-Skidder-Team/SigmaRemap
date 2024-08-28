package mapped;

public class Class917 extends Class916 {
   private static String[] field5231;

   public Class917(Class8992<?> var1, Class1655 var2) {
      super(var1, var2);
   }

   public Class917(Class1655 var1, double var2, double var4, double var6) {
      super(Class8992.field41050, var1, var2, var4, var6);
   }

   @Override
   public Class2274 method3304(PlayerEntity var1, Hand var2) {
      if (!var1.method2851()) {
         if (!this.method3329()) {
            if (this.field5024.field9020) {
               return Class2274.field14818;
            } else {
               return !var1.method3311(this) ? Class2274.field14820 : Class2274.field14819;
            }
         } else {
            return Class2274.field14820;
         }
      } else {
         return Class2274.field14820;
      }
   }

   @Override
   public void method3589(int var1, int var2, int var3, boolean var4) {
      if (var4) {
         if (this.method3329()) {
            this.method3315();
         }

         if (this.method3599() == 0) {
            this.method3600(-this.method3601());
            this.method3598(10);
            this.method3596(50.0F);
            this.method3141();
         }
      }
   }

   @Override
   public Class2177 method3602() {
      return Class2177.field14287;
   }
}
