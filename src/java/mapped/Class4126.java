package mapped;

public class Class4126 extends Class4124 {
   public Class4126() {
      super(EntityType.field41021, "drowned", 0.5F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2793(0.0F, 0.0F, 64, 64);
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5665 var6 = new Class5665(var5);
      var6.field25086 = (Class2793<Class1037>)var1;
      var6.field25098 = var2;
      return (Class9492)var6;
   }
}
