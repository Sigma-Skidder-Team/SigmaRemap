package mapped;

import net.minecraft.util.text.TranslationTextComponent;

public class InventoryScreen extends Class860<Class5830> implements Class854 {
   private static final ResourceLocation field4765 = new ResourceLocation("textures/gui/recipe_button.png");
   private float field4766;
   private float field4767;
   private final Class1254 field4768 = new Class1254();
   private boolean field4769;
   private boolean field4770;
   private boolean field4771;

   public InventoryScreen(PlayerEntity var1) {
      super(var1.field4904, var1.inventory, new TranslationTextComponent("container.crafting"));
      this.field4567 = true;
      this.field4723 = 97;
   }

   @Override
   public void tick() {
      if (!this.field4562.playerController.isInCreativeMode()) {
         this.field4768.method5844();
      } else {
         this.field4562.displayGuiScreen(new CreativeScreen(this.field4562.player));
      }
   }

   @Override
   public void method1921() {
      if (!this.field4562.playerController.isInCreativeMode()) {
         super.method1921();
         this.field4770 = this.field4564 < 379;
         this.field4768.method5833(this.field4564, this.field4565, this.field4562, this.field4770, this.field4727);
         this.field4769 = true;
         this.field4734 = this.field4768.method5837(this.field4770, this.field4564, this.field4721);
         this.field4561.add(this.field4768);
         this.method5536(this.field4768);
         this.<Class1243>method2455(new Class1243(this.field4734 + 104, this.field4565 / 2 - 22, 20, 18, 0, 0, 19, field4765, var1 -> {
            this.field4768.method5834(this.field4770);
            this.field4768.method5838();
            this.field4734 = this.field4768.method5837(this.field4770, this.field4564, this.field4721);
            ((Class1243)var1).method5819(this.field4734 + 104, this.field4565 / 2 - 22);
            this.field4771 = true;
         }));
      } else {
         this.field4562.displayGuiScreen(new CreativeScreen(this.field4562.player));
      }
   }

   @Override
   public void method2617(MatrixStack var1, int var2, int var3) {
      this.field4568.method38805(var1, this.field4560, (float)this.field4723, (float)this.field4724, 4210752);
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      this.field4772 = !this.field4768.method5839();
      if (this.field4768.method5839() && this.field4770) {
         this.method2618(var1, var4, var2, var3);
         this.field4768.method1923(var1, var2, var3, var4);
      } else {
         this.field4768.method1923(var1, var2, var3, var4);
         super.method1923(var1, var2, var3, var4);
         this.field4768.method5850(var1, this.field4734, this.field4735, false, var4);
      }

      this.method2615(var1, var2, var3);
      this.field4768.method5846(var1, this.field4734, this.field4735, var2, var3);
      this.field4766 = (float)var2;
      this.field4767 = (float)var3;
   }

   @Override
   public void method2618(MatrixStack var1, float var2, int var3, int var4) {
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      this.field4562.getTextureManager().bindTexture(field4720);
      int var7 = this.field4734;
      int var8 = this.field4735;
      this.method5696(var1, var7, var8, 0, 0, this.field4721, this.field4722);
      method2635(var7 + 51, var8 + 75, 30, (float)(var7 + 51) - this.field4766, (float)(var8 + 75 - 50) - this.field4767, this.field4562.player);
   }

   public static void method2635(int var0, int var1, int var2, float var3, float var4, Class880 var5) {
      float var8 = (float)Math.atan((double)(var3 / 40.0F));
      float var9 = (float)Math.atan((double)(var4 / 40.0F));
      RenderSystem.pushMatrix();
      RenderSystem.translatef((float)var0, (float)var1, 1050.0F);
      RenderSystem.scalef(1.0F, 1.0F, -1.0F);
      MatrixStack var10 = new MatrixStack();
      var10.translate(0.0, 0.0, 1000.0);
      var10.method35292((float)var2, (float)var2, (float)var2);
      Class8661 var11 = Class7680.field32902.method25286(180.0F);
      Class8661 var12 = Class7680.field32898.method25286(var9 * 20.0F);
      var11.method31182(var12);
      var10.method35293(var11);
      float var13 = var5.field4965;
      float var14 = var5.rotationYaw;
      float var15 = var5.rotationPitch;
      float var16 = var5.field4968;
      float var17 = var5.field4967;
      var5.field4965 = 180.0F + var8 * 20.0F;
      var5.rotationYaw = 180.0F + var8 * 40.0F;
      var5.rotationPitch = -var9 * 20.0F;
      var5.field4967 = var5.rotationYaw;
      var5.field4968 = var5.rotationYaw;
      EntityRendererManager var18 = Minecraft.getInstance().getRenderManager();
      var12.method31184();
      var18.method32214(var12);
      var18.method32215(false);
      Class7735 var19 = Minecraft.getInstance().getRenderTypeBuffers().method26536();
      RenderSystem.method27940(() -> var18.method32219(var5, 0.0, 0.0, 0.0, 0.0F, 1.0F, var10, var19, 15728880));
      var19.method25602();
      var18.method32215(true);
      var5.field4965 = var13;
      var5.rotationYaw = var14;
      var5.rotationPitch = var15;
      var5.field4968 = var16;
      var5.field4967 = var17;
      RenderSystem.popMatrix();
   }

   @Override
   public boolean method2625(int var1, int var2, int var3, int var4, double var5, double var7) {
      return (!this.field4770 || !this.field4768.method5839()) && super.method2625(var1, var2, var3, var4, var5, var7);
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      if (this.field4768.method1958(var1, var3, var5)) {
         this.method5534(this.field4768);
         return true;
      } else {
         return this.field4770 && this.field4768.method5839() ? false : super.method1958(var1, var3, var5);
      }
   }

   @Override
   public boolean method2565(double var1, double var3, int var5) {
      if (!this.field4771) {
         return super.method2565(var1, var3, var5);
      } else {
         this.field4771 = false;
         return true;
      }
   }

   @Override
   public boolean method2623(double var1, double var3, int var5, int var6, int var7) {
      boolean var10 = var1 < (double)var5 || var3 < (double)var6 || var1 >= (double)(var5 + this.field4721) || var3 >= (double)(var6 + this.field4722);
      return this.field4768.method5852(var1, var3, this.field4734, this.field4735, this.field4721, this.field4722, var7) && var10;
   }

   @Override
   public void method2626(Class5839 var1, int var2, int var3, Class2259 var4) {
      super.method2626(var1, var2, var3, var4);
      this.field4768.method5841(var1);
   }

   @Override
   public void method2631() {
      this.field4768.method5856();
   }

   @Override
   public void onClose() {
      if (this.field4769) {
         this.field4768.method5836();
      }

      super.onClose();
   }

   @Override
   public Class1254 method2632() {
      return this.field4768;
   }
}
