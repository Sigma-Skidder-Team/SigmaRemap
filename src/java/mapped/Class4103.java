package mapped;

public class Class4103 extends Class4057 {
   public Class4103() {
      super(Class8992.field41045, "lead_knot", 0.0F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2889();
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2889) {
         Class2889 var5 = (Class2889)var1;
         return !var2.equals("knot") ? null : (Class7219)Class9299.field43065.method20235(var5);
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"knot"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      Class8853 var5 = Minecraft.getInstance().method1554();
      Class5739 var6 = new Class5739(var5);
      if (Class9299.field43067.method20238()) {
         Class9299.method35082(var6, Class9299.field43067, var1);
         var6.field25098 = var2;
         return (Class9492)var6;
      } else {
         Class7944.method26811("Field not found: RenderLeashKnot.leashKnotModel");
         return null;
      }
   }
}
