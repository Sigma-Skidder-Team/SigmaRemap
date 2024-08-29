package mapped;

public class Class1164 extends Class1155<Class1164> {
   private static String[] field6320;
   private final Class2019 field6321;
   public final Class1284 field6322;

   public Class1164(Class1284 var1, Class2019 var2) {
      this.field6322 = var1;
      this.field6321 = var2;
   }

   @Override
   public void method5544(MatrixStack var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      String var13 = this.field6321.toString();
      this.field6322
         .field6848
         .field4568
         .method38800(
            var1,
            var13,
            (float)(Class1284.method6105(this.field6322) / 2 - this.field6322.field6848.field4568.getStringWidth(var13) / 2),
            (float)(var3 + 1),
            16777215,
            true
         );
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      if (var5 != 0) {
         return false;
      } else {
         this.method5564();
         return true;
      }
   }

   private void method5564() {
      this.field6322.method6024(this);
   }

   // $VF: synthetic method
   public static Class2019 method5565(Class1164 var0) {
      return var0.field6321;
   }
}
