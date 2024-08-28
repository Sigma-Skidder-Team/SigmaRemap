package mapped;

public class Class4088 extends Class4057 {
   public Class4088() {
      super(Class8992.field41080, "slime", 0.25F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2826(16);
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2826) {
         Class2826 var5 = (Class2826)var1;
         if (!var2.equals("body")) {
            if (!var2.equals("left_eye")) {
               if (!var2.equals("right_eye")) {
                  return !var2.equals("mouth") ? null : (Class7219)Class9299.method35075(var5, Class9299.field43107, 3);
               } else {
                  return (Class7219)Class9299.method35075(var5, Class9299.field43107, 2);
               }
            } else {
               return (Class7219)Class9299.method35075(var5, Class9299.field43107, 1);
            }
         } else {
            return (Class7219)Class9299.method35075(var5, Class9299.field43107, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"body", "left_eye", "right_eye", "mouth"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      Class8853 var5 = Minecraft.getInstance().method1554();
      Class5675 var6 = new Class5675(var5);
      var6.field25086 = (Class2826<Class1108>)var1;
      var6.field25098 = var2;
      return (Class9492)var6;
   }
}
