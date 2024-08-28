package mapped;

public class Class816 extends Class798 {
   private static final ResourceLocation field4436 = new ResourceLocation("realms", "textures/gui/realms/invite_icon.png");
   private static final ResourceLocation field4437 = new ResourceLocation("realms", "textures/gui/realms/trial_icon.png");
   private static final ResourceLocation field4438 = new ResourceLocation("realms", "textures/gui/realms/news_notification_mainscreen.png");
   private static final Class9408 field4439 = new Class9408();
   private volatile int field4440;
   private static boolean field4441;
   private static boolean field4442;
   private static boolean field4443;
   private static boolean field4444;

   @Override
   public void method1921() {
      this.method2321();
      this.field4562.field1302.method36347(true);
   }

   @Override
   public void method1919() {
      if ((!this.method2319() || !this.method2320() || !field4443) && !field4439.method36014()) {
         field4439.method36026();
      } else if (field4443 && this.method2319()) {
         field4439.method36016();
         if (field4439.method36017(Class2310.field15835)) {
            this.field4440 = field4439.method36021();
         }

         if (field4439.method36017(Class2310.field15836)) {
            field4442 = field4439.method36022();
         }

         if (field4439.method36017(Class2310.field15838)) {
            field4444 = field4439.method36024();
         }

         field4439.method36018();
      }
   }

   private boolean method2319() {
      return this.field4562.gameSettings.field44620;
   }

   private boolean method2320() {
      return this.field4562.currentScreen instanceof MainMenuScreen;
   }

   private void method2321() {
      if (!field4441) {
         field4441 = true;
         new Class353(this, "Realms Notification Availability checker #1").start();
      }
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      if (field4443) {
         this.method2322(var1, var2, var3);
      }

      super.method1923(var1, var2, var3, var4);
   }

   private void method2322(MatrixStack var1, int var2, int var3) {
      int var6 = this.field4440;
      byte var7 = 24;
      int var8 = this.field4565 / 4 + 48;
      int var9 = this.field4564 / 2 + 80;
      int var10 = var8 + 48 + 2;
      byte var11 = 0;
      if (field4444) {
         this.field4562.getTextureManager().bindTexture(field4438);
         RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.pushMatrix();
         RenderSystem.scalef(0.4F, 0.4F, 0.4F);
         Class1193.method5699(var1, (int)((double)(var9 + 2 - var11) * 2.5), (int)((double)var10 * 2.5), 0.0F, 0.0F, 40, 40, 40, 40);
         RenderSystem.popMatrix();
         var11 += 14;
      }

      if (var6 != 0) {
         this.field4562.getTextureManager().bindTexture(field4436);
         RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
         Class1193.method5699(var1, var9 - var11, var10 - 6, 0.0F, 0.0F, 15, 25, 31, 25);
         var11 += 16;
      }

      if (field4442) {
         this.field4562.getTextureManager().bindTexture(field4437);
         RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
         byte var12 = 0;
         if ((Util.milliTime() / 800L & 1L) == 1L) {
            var12 = 8;
         }

         Class1193.method5699(var1, var9 + 4 - var11, var10 + 4, 0.0F, (float)var12, 8, 8, 8, 16);
      }
   }

   @Override
   public void onClose() {
      field4439.method36026();
   }

   // $VF: synthetic method
   public static boolean method2323(boolean var0) {
      field4441 = var0;
      return var0;
   }

   // $VF: synthetic method
   public static boolean method2324(boolean var0) {
      field4443 = var0;
      return var0;
   }
}
