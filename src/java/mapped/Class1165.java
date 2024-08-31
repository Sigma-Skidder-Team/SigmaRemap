package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class1165 extends Class1155<Class1165> {
   private final Class2024 field6323;
   private final String field6324;
   private final String field6325;
   private final ITextComponent field6326;
   public final Class811 field6327;

   public Class1165(Class811 var1, Class2024 var2) {
      this.field6327 = var1;
      this.field6323 = var2;
      this.field6324 = var2.method8644();
      this.field6325 = var2.method8643() + " (" + Class811.method2218(var2) + ")";
      if (!var2.method8646()) {
         Object var5;
         if (!var2.method8649()) {
            var5 = Class811.method2221(var2);
         } else {
            var5 = Class811.method2220();
         }

         if (var2.method8650()) {
            var5 = ((ITextComponent)var5).deepCopy().appendString(", ").append(Class811.method2222());
         }

         this.field6326 = (ITextComponent)var5;
      } else {
         this.field6326 = Class811.method2219();
      }
   }

   @Override
   public void method5544(MatrixStack var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      this.method5566(var1, this.field6323, var2, var4, var3);
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      Class811.method2224(this.field6327).method6109(Class811.method2223(this.field6327).indexOf(this.field6323));
      return true;
   }

   public void method5566(MatrixStack var1, Class2024 var2, int var3, int var4, int var5) {
      String var8;
      if (!this.field6324.isEmpty()) {
         var8 = this.field6324;
      } else {
         var8 = Class811.method2225() + " " + (var3 + 1);
      }

      Class811.method2226(this.field6327).method38801(var1, var8, (float)(var4 + 2), (float)(var5 + 1), 16777215);
      Class811.method2227(this.field6327).method38801(var1, this.field6325, (float)(var4 + 2), (float)(var5 + 12), 8421504);
      Class811.method2228(this.field6327).func_243248_b(var1, this.field6326, (float)(var4 + 2), (float)(var5 + 12 + 10), 8421504);
   }
}
