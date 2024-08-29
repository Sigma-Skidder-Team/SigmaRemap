package mapped;

public class Class4090 extends Class4089 {
   public Class4090() {
      super(EntityType.field41012, "cat", 0.4F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2861(0.0F);
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5747 var6 = new Class5747(var5);
      var6.field25086 = (Class2861<Class1098>)var1;
      var6.field25098 = var2;
      return (Class9492)var6;
   }
}
