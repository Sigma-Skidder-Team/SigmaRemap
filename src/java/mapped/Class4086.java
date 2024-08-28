package mapped;

public class Class4086 extends Class4057 {
   public Class4086() {
      super(Class8992.field41076, "shulker_bullet", 0.0F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2821();
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2821) {
         Class2821 var5 = (Class2821)var1;
         return !var2.equals("bullet") ? null : (Class7219)Class9299.field43098.method20235(var5);
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"bullet"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      Class8853 var5 = Minecraft.getInstance().method1554();
      Class5730 var6 = new Class5730(var5);
      if (Class9299.field43146.method20238()) {
         Class9299.method35082(var6, Class9299.field43146, var1);
         var6.field25098 = var2;
         return (Class9492)var6;
      } else {
         Class7944.method26811("Field not found: RenderShulkerBullet.model");
         return null;
      }
   }
}
