package mapped;

public class Class7520 implements Class7519 {
   private static String[] field32252;
   private final Block field32253;
   private Class7340 field32254 = Class7340.field31445;

   public Class7520(Block var1) {
      this.field32253 = var1;
   }

   public Class7520 method24519(Class9178 var1) {
      this.field32254 = var1.method34330();
      return this;
   }

   @Override
   public Class122 method24517() {
      return new Class161(this.field32253, this.field32254);
   }
}
