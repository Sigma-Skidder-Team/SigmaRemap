package mapped;

public class Class5728 extends Class5727<Class887> {
   public static final ResourceLocation field25135 = new ResourceLocation("textures/entity/projectiles/arrow.png");
   public static final ResourceLocation field25136 = new ResourceLocation("textures/entity/projectiles/tipped_arrow.png");

   public Class5728(Class8853 var1) {
      super(var1);
   }

   public ResourceLocation method17843(Class887 var1) {
      return var1.method3502() <= 0 ? field25135 : field25136;
   }
}
