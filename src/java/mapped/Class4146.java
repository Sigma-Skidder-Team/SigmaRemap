package mapped;

public class Class4146 extends Class4051 {
   public Class4146() {
      super(EntityType.field41058, "mooshroom", 0.7F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2870();
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5694 var6 = new Class5694(var5);
      var6.field25086 = (Class2870<Class1086>)var1;
      var6.field25098 = var2;
      return (Class9492)var6;
   }
}
