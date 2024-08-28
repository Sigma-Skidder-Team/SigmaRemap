package mapped;

public class Class4119 extends Class4117 {
   public Class4119() {
      super(Class8992.field41109, "zombie_villager", 0.5F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2800(0.0F, false);
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      Class192 var5 = (Class192) Minecraft.getInstance().method1537();
      Class8853 var6 = Minecraft.getInstance().method1554();
      Class5669 var7 = new Class5669(var6, var5);
      var7.field25086 = (Class2800<Class1040>)var1;
      var7.field25098 = var2;
      return (Class9492)var7;
   }
}
