package mapped;

public class Class4118 extends Class4117 {
   public Class4118() {
      super(Class8992.field41006, "armor_stand", 0.0F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2893();
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2893) {
         Class2893 var5 = (Class2893)var1;
         if (!var2.equals("right")) {
            if (!var2.equals("left")) {
               if (!var2.equals("waist")) {
                  return !var2.equals("base") ? super.method12823(var5, var2) : (Class7219)Class9299.method35075(var5, Class9299.field43024, 3);
               } else {
                  return (Class7219)Class9299.method35075(var5, Class9299.field43024, 2);
               }
            } else {
               return (Class7219)Class9299.method35075(var5, Class9299.field43024, 1);
            }
         } else {
            return (Class7219)Class9299.method35075(var5, Class9299.field43024, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      String[] var3 = super.method12824();
      return (String[])Class7944.method26950(var3, new String[]{"right", "left", "waist", "base"});
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      Class8853 var5 = Minecraft.getInstance().method1554();
      Class5742 var6 = new Class5742(var5);
      var6.field25086 = (Class2892)var1;
      var6.field25098 = var2;
      return (Class9492)var6;
   }
}