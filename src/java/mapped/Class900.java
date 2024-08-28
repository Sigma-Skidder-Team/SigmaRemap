package mapped;

public class Class900 extends Class898 {
   private static String[] field5140;

   public Class900(Class8992<? extends Class900> var1, Class1655 var2) {
      super(var1, var2);
   }

   public Class900(Class1655 var1, Class880 var2, double var3, double var5, double var7) {
      super(Class8992.field41081, var2, var3, var5, var7, var1);
   }

   public Class900(Class1655 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(Class8992.field41081, var2, var4, var6, var8, var10, var12, var1);
   }

   @Override
   public void method3465(Class8709 var1) {
      super.method3465(var1);
      if (!this.field5024.field9020) {
         Entity var4 = var1.method31416();
         if (!var4.method3249()) {
            Entity var5 = this.method3460();
            int var6 = var4.method3222();
            var4.method3221(5);
            boolean var7 = var4.method2741(Class8654.method31121(this, var5), 5.0F);
            if (var7) {
               if (var5 instanceof Class880) {
                  this.method3399((Class880)var5, var4);
               }
            } else {
               var4.method2966(var6);
            }
         }
      }
   }

   @Override
   public void method3466(Class8711 var1) {
      super.method3466(var1);
      if (!this.field5024.field9020) {
         Entity var4 = this.method3460();
         if (var4 == null || !(var4 instanceof Class1006) || this.field5024.method6789().method17135(Class5462.field24224)) {
            BlockPos var5 = var1.method31423().method8349(var1.method31424());
            if (this.field5024.method7007(var5)) {
               this.field5024.method6730(var5, Class3397.method12009(this.field5024, var5));
            }
         }
      }
   }

   @Override
   public void method3464(Class8710 var1) {
      super.method3464(var1);
      if (!this.field5024.field9020) {
         this.method2904();
      }
   }

   @Override
   public boolean method3139() {
      return false;
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      return false;
   }
}
