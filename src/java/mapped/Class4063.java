package mapped;

public class Class4063 extends Class4060 {
   public Class4063() {
      super(EntityType.field41099, "vindicator", 0.5F, new String[]{"vindication_illager"});
   }

   @Override
   public Class2828 method12822() {
      return new Class2823(0.0F, 0.0F, 64, 64);
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5678 var6 = new Class5678(var5);
      var6.field25086 = (Class2823<Class1030>) var1;
      var6.field25098 = var2;
      return (Class9492)var6;
   }
}
