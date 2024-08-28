package mapped;

public class Class4279 extends Class4278 {
   public Class4250 field20737;

   public Class4279(Class4250 var1, int var2, String var3) {
      super(var1, "bezierButton-" + var3, 0, 0, var2, var2, true);
      this.method13215(true);
      this.field20886 = true;
      this.field20737 = var1;
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
      int var5 = this.field20737.method13267() - this.field20737.field20610;
      int var6 = this.field20737.method13269() - this.method13269();
      int var7 = this.field20737.field20610;
      if (this.method13263() > var5) {
         this.method13264(var5);
      }

      if (this.method13265() > var6) {
         this.method13266(var6);
      }

      if (this.method13263() < var7) {
         this.method13264(var7);
      }
   }

   public void method13144(float var1, float var2) {
      this.field20895 = (int)var1;
      this.field20896 = (int)var2;
   }

   @Override
   public void method13027(float var1) {
      Class3192.method11438(
         (float)(this.field20895 + 5),
         (float)(this.field20896 + 5),
         10.0F,
         Class5628.method17688(!this.method13216() ? Class1979.field12893.field12910 : Class1979.field12892.field12910, var1)
      );
      super.method13027(var1);
   }
}
