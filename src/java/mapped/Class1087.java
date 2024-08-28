package mapped;

public class Class1087 extends Class1018 {
   private static String[] field5955;

   public Class1087(Class8992<? extends Class1087> var1, Class1655 var2) {
      super(var1, var2);
   }

   @Override
   public void method4219() {
      this.field5600.method20002(0, new Class2603(this));
      this.field5600.method20002(1, new Class2747(this, 2.0));
      this.field5600.method20002(2, new Class2785(this, 1.0));
      this.field5600.method20002(3, new Class2680(this, 1.25, Class120.method339(Class8514.field37842), false));
      this.field5600.method20002(4, new Class2764(this, 1.25));
      this.field5600.method20002(5, new Class2737(this, 1.0));
      this.field5600.method20002(6, new Class2612(this, PlayerEntity.class, 6.0F));
      this.field5600.method20002(7, new Class2668(this));
   }

   public static Class7037 method5040() {
      return Class1006.method4220().method21849(Class9173.field42105, 10.0).method21849(Class9173.field42108, 0.2F);
   }

   @Override
   public Class9455 method4241() {
      return Class6067.field26477;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field26479;
   }

   @Override
   public Class9455 method2880() {
      return Class6067.field26478;
   }

   @Override
   public void method3241(BlockPos var1, Class7380 var2) {
      this.method2863(Class6067.field26481, 0.15F, 1.0F);
   }

   @Override
   public float method3099() {
      return 0.4F;
   }

   @Override
   public Class2274 method4285(PlayerEntity var1, Class79 var2) {
      Class8848 var5 = var1.method3094(var2);
      if (var5.method32107() == Class8514.field37882 && !this.method3005()) {
         var1.method2863(Class6067.field26480, 1.0F, 1.0F);
         Class8848 var6 = Class8482.method29979(var5, var1, Class8514.field37891.method11742());
         var1.method3095(var2, var6);
         return Class2274.method9002(this.field5024.field9020);
      } else {
         return super.method4285(var1, var2);
      }
   }

   public Class1087 method4389(Class1657 var1, Class1045 var2) {
      return Class8992.field41016.method33215(var1);
   }

   @Override
   public float method2957(Class2090 var1, Class8847 var2) {
      return !this.method3005() ? 1.3F : var2.field39969 * 0.95F;
   }
}
