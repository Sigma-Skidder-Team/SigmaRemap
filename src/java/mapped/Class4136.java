package mapped;

public class Class4136 extends Class4135 {
   public Class4136() {
      super(EntityType.field41055, "spawner_minecart", 0.5F);
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5732 var6 = new Class5732(var5);
      if (Class9299.field43144.method20238()) {
         Class9299.method35082(var6, Class9299.field43144, var1);
         var6.field25098 = var2;
         return (Class9492)var6;
      } else {
         Class7944.method26811("Field not found: RenderMinecart.modelMinecart");
         return null;
      }
   }
}
