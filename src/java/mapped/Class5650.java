package mapped;

public class Class5650 extends Class5651<Class1095, Class2864<Class1095>> {
   private static final ResourceLocation field25000 = new ResourceLocation("textures/entity/fox/fox.png");
   private static final ResourceLocation field25001 = new ResourceLocation("textures/entity/fox/fox_sleep.png");
   private static final ResourceLocation field25002 = new ResourceLocation("textures/entity/fox/snow_fox.png");
   private static final ResourceLocation field25003 = new ResourceLocation("textures/entity/fox/snow_fox_sleep.png");

   public Class5650(Class8853 var1) {
      super(var1, new Class2864<Class1095>(), 0.4F);
      this.method17880(new Class257(this));
   }

   public void method17842(Class1095 var1, Class9332 var2, float var3, float var4, float var5) {
      super.method17842(var1, var2, var3, var4, var5);
      if (var1.method5140() || var1.method5131()) {
         float var8 = -MathHelper.method37821(var5, var1.field5034, var1.field5032);
         var2.method35293(Class7680.field32898.method25286(var8));
      }
   }

   public ResourceLocation method17843(Class1095 var1) {
      if (var1.method5125() != Class186.field691) {
         return !var1.isSleeping() ? field25002 : field25003;
      } else {
         return !var1.isSleeping() ? field25000 : field25001;
      }
   }
}
