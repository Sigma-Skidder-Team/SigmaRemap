package mapped;

public class Class3273 extends Class3257 {
   private static String[] field18773;

   public Class3273(Class5643 var1) {
      super(var1);
   }

   @Override
   public Class2274 method11707(Class5911 var1) {
      Class1655 var4 = var1.method18360();
      BlockPos var5 = var1.method18345();
      Class7380 var6 = var4.method6738(var5);
      boolean var7 = false;
      if (!Class3244.method11656(var6)) {
         var5 = var5.method8349(var1.method18354());
         if (Class3397.method12012(var4, var5, var1.method18350())) {
            this.method11796(var4, var5);
            var4.method6730(var5, Class3397.method12009(var4, var5));
            var7 = true;
         }
      } else {
         this.method11796(var4, var5);
         var4.method6730(var5, var6.method23465(Class3244.field18698, Boolean.valueOf(true)));
         var7 = true;
      }

      if (!var7) {
         return Class2274.field14821;
      } else {
         var1.method18357().method32182(1);
         return Class2274.method9002(var4.field9020);
      }
   }

   private void method11796(Class1655 var1, BlockPos var2) {
      var1.method6742((PlayerEntity)null, var2, Class6067.field26572, Class2266.field14732, 1.0F, (field18735.nextFloat() - field18735.nextFloat()) * 0.2F + 1.0F);
   }
}
