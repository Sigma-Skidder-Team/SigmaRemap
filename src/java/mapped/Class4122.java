package mapped;

public class Class4122 extends Class4117 {
   public Class4122() {
      super(EntityType.field41078, "skeleton", 0.7F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2798();
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5666 var6 = new Class5666(var5);
      var6.field25086 = (Class2798<Class1082>)var1;
      var6.field25098 = var2;
      return (Class9492)var6;
   }
}
