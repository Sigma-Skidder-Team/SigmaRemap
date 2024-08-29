package mapped;

public class Class224 extends Class223<Class1079, Class2881<Class1079>> {
   private static final ResourceLocation field868 = new ResourceLocation("textures/entity/wither/wither_armor.png");
   private final Class2881<Class1079> field869 = new Class2881<Class1079>(0.5F);

   public Class224(Class5714<Class1079, Class2881<Class1079>> var1) {
      super(var1);
   }

   @Override
   public float method831(float var1) {
      return MathHelper.cos(var1 * 0.02F) * 3.0F;
   }

   @Override
   public ResourceLocation method832() {
      return field868;
   }

   @Override
   public Class2827<Class1079> method833() {
      return this.field869;
   }
}
