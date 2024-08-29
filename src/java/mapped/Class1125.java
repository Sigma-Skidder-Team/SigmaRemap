package mapped;

public class Class1125 extends Class851<Class5827> {
   private static final ResourceLocation field6161 = new ResourceLocation("textures/gui/container/horse.png");
   private final AbstractHorseEntity field6162;
   private float field6163;
   private float field6164;

   public Class1125(Class5827 var1, PlayerInventory var2, AbstractHorseEntity var3) {
      super(var1, var2, var3.getDisplayName());
      this.field6162 = var3;
      this.field4567 = false;
   }

   @Override
   public void method2618(MatrixStack var1, float var2, int var3, int var4) {
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      this.field4562.getTextureManager().bindTexture(field6161);
      int var7 = (this.field4564 - this.field4721) / 2;
      int var8 = (this.field4565 - this.field4722) / 2;
      this.method5696(var1, var7, var8, 0, 0, this.field4721, this.field4722);
      if (this.field6162 instanceof Class1066) {
         Class1066 var9 = (Class1066)this.field6162;
         if (var9.method4927()) {
            this.method5696(var1, var7 + 79, var8 + 17, 0, this.field4722, var9.method4897() * 18, 54);
         }
      }

      if (this.field6162.method4901()) {
         this.method5696(var1, var7 + 7, var8 + 35 - 18, 18, this.field4722 + 54, 18, 18);
      }

      if (this.field6162.method4898()) {
         if (!(this.field6162 instanceof Class1064)) {
            this.method5696(var1, var7 + 7, var8 + 35, 0, this.field4722 + 54, 18, 18);
         } else {
            this.method5696(var1, var7 + 7, var8 + 35, 36, this.field4722 + 54, 18, 18);
         }
      }

      InventoryScreen.method2635(var7 + 51, var8 + 60, 17, (float)(var7 + 51) - this.field6163, (float)(var8 + 75 - 50) - this.field6164, this.field6162);
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      this.field6163 = (float)var2;
      this.field6164 = (float)var3;
      super.method1923(var1, var2, var3, var4);
      this.method2615(var1, var2, var3);
   }
}
