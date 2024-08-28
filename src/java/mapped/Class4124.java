package mapped;

public class Class4124 extends Class4117 {
   public Class4124() {
      super(Class8992.field41107, "zombie", 0.5F);
   }

   public Class4124(Class8992 var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public Class2828 method12822() {
      return new Class2794(0.0F, false);
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      Class8853 var5 = Minecraft.getInstance().method1554();
      Class5663 var6 = new Class5663(var5);
      var6.field25086 = (Class2794<Class1038>)var1;
      var6.field25098 = var2;
      return (Class9492)var6;
   }
}
