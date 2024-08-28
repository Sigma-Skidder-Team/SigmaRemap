package mapped;

public class Class1167 extends Class1155<Class1167> {
   private static String[] field6331;
   public final Class1281 field6332;

   public Class1167(Class1281 var1) {
      this.field6332 = var1;
   }

   @Override
   public void method5544(Class9332 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      Class5966 var13 = (Class5966)Class1313.method6213().get(var2);
      this.method5570(var1, var4, var3, var13.field26006);
      this.field6332.field6836.field4568.method38805(var1, var13.field26007, (float)(var4 + 18 + 5), (float)(var3 + 6), 16777215);
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      if (var5 == 0) {
         this.method5569();
      }

      return false;
   }

   private void method5569() {
      this.field6332.method6024(this);
      Class5966 var3 = (Class5966)Class1313.method6213().get(this.field6332.method2468().indexOf(this));
      Class2349 var4 = Class1313.method6214(this.field6332.field6836).field7000.field7092.method5789().<Class8907>method32453(Class2348.field16106);
      Class1313.method6215(this.field6332.field6836, var3.field26008.apply(var4));
      Class1313.method6218(this.field6332.field6836).method5635(Class1313.method6217(var4, Class1313.method6216(this.field6332.field6836)));
      Class1313.method6218(this.field6332.field6836).method5651();
   }

   private void method5570(Class9332 var1, int var2, int var3, Class3257 var4) {
      this.method5571(var1, var2 + 1, var3 + 1);
      RenderSystem.method27867();
      this.field6332.field6836.field4563.method791(new ItemStack(var4), var2 + 2, var3 + 2);
      RenderSystem.method27868();
   }

   private void method5571(Class9332 var1, int var2, int var3) {
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      Class1281.method6097(this.field6332).getTextureManager().bindTexture(Class1193.field6452);
      Class1193.method5697(var1, var2, var3, this.field6332.field6836.method5702(), 0.0F, 0.0F, 18, 18, 128, 128);
   }

   // $VF: synthetic method
   public static void method5572(Class1167 var0) {
      var0.method5569();
   }
}
