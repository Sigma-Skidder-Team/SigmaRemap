package mapped;

public class Class3275 extends Class3257 {
   private final int field18775;
   private final String field18776;

   public Class3275(int var1, String var2, Class5643 var3) {
      super(var3);
      this.field18775 = var1;
      this.field18776 = "textures/entity/horse/armor/horse_armor_" + var2 + ".png";
   }

   public ResourceLocation method11797() {
      return new ResourceLocation(this.field18776);
   }

   public int method11798() {
      return this.field18775;
   }
}
