package mapped;

public class Class4095 extends Class4094 {
   public Class4095() {
      super(Class8992.field41101, "witch", 0.5F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2891(0.0F);
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2891) {
         Class2891 var5 = (Class2891)var1;
         return !var2.equals("mole") ? super.method12823(var5, var2) : (Class7219)Class9299.method35072(var5, Class9299.field43127);
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      String[] var3 = super.method12824();
      return (String[])Class7944.method26948(var3, "mole");
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      Class8853 var5 = Minecraft.getInstance().method1554();
      Class5708 var6 = new Class5708(var5);
      var6.field25086 = (Class2891<Class1027>)var1;
      var6.field25098 = var2;
      return (Class9492)var6;
   }
}