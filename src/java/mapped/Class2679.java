package mapped;

public class Class2679 extends Class2595 {
   private static String[] field17075;
   private final Class1055 field17076;
   public final Class1055 field17077;

   public Class2679(Class1055 var1, Class1055 var2) {
      this.field17077 = var1;
      this.field17076 = var2;
   }

   @Override
   public boolean method10803() {
      return true;
   }

   @Override
   public void method10805() {
      int var3 = this.field17076.method3021();
      if (var3 <= 100) {
         if (this.field17076.method3013().nextInt(50) == 0 || !Class1055.method4842(this.field17076) || !this.field17076.method4841()) {
            float var4 = this.field17076.method3013().nextFloat() * (float) (Math.PI * 2);
            float var5 = MathHelper.method37764(var4) * 0.2F;
            float var6 = -0.1F + this.field17076.method3013().nextFloat() * 0.2F;
            float var7 = MathHelper.method37763(var4) * 0.2F;
            this.field17076.method4840(var5, var6, var7);
         }
      } else {
         this.field17076.method4840(0.0F, 0.0F, 0.0F);
      }
   }
}
