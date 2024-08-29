package mapped;

public class Class4120 extends Class4117 {
   public Class4120() {
      super(EntityType.field41097, "vex", 0.3F);
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2896) {
         Class7219 var5 = super.method12823(var1, var2);
         if (var5 == null) {
            Class2896 var6 = (Class2896)var1;
            if (!var2.equals("left_wing")) {
               return !var2.equals("right_wing") ? null : (Class7219)Class9299.method35072(var6, Class9299.field43123);
            } else {
               return (Class7219)Class9299.method35072(var6, Class9299.field43122);
            }
         } else {
            return var5;
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      String[] var3 = super.method12824();
      return (String[])Class7944.method26950(var3, new String[]{"left_wing", "right_wing"});
   }

   @Override
   public Class2828 method12822() {
      return new Class2896();
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5670 var6 = new Class5670(var5);
      var6.field25086 = (Class2896)var1;
      var6.field25098 = var2;
      return (Class9492)var6;
   }
}
