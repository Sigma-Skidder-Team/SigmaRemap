package mapped;

public class Class9483 {
   private static String[] field44076;
   private final Class7287 field44077;
   public final Class9407 field44078;

   public Class9483(Class9407 var1, Class7287 var2) {
      this.field44078 = var1;
      this.field44077 = var2;
   }

   public Class9483 method36611(Block var1) {
      Class7287 var4 = this.field44077.method22995(Class9588.field44828, this.field44077.method22994(Class9588.field44833));
      ResourceLocation var5 = Class9756.field45539.method34805(var1, var4, Class9407.method35999(this.field44078));
      Class9407.method36001(this.field44078).accept(Class9407.method36012(var1, var5));
      return this;
   }

   public Class9483 method36612(Block var1) {
      ResourceLocation var4 = Class9756.field45539.method34805(var1, this.field44077, Class9407.method35999(this.field44078));
      Class9407.method36001(this.field44078).accept(Class9407.method36012(var1, var4));
      return this;
   }

   public Class9483 method36613(Block var1) {
      ResourceLocation var4 = Class9756.field45539.method34805(var1, this.field44077, Class9407.method35999(this.field44078));
      ResourceLocation var5 = Class9756.field45540.method34805(var1, this.field44077, Class9407.method35999(this.field44078));
      Class9407.method36001(this.field44078).accept(Class9407.method36013(var1, var4, var5));
      return this;
   }
}
