package mapped;

import com.mentalfrostbyte.jello.unmapped.ResourceList;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mojang.blaze3d.matrix.MatrixStack;
import lol.ClientColors;
import org.newdawn.slick.opengl.Texture;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.IAsyncReloader;
import net.minecraft.util.Util;
import org.lwjgl.opengl.GL11;

import java.util.Optional;
import java.util.function.Consumer;

public class CustomResourceLoadProgressGui extends LoadingGui {
   private final Minecraft mc;
   private final IAsyncReloader iAsyncReloader;
   private final Consumer<Optional<Throwable>> throwable;
   private final boolean b;
   private float field6771;
   private long field6772 = -1L;
   private long field6773 = -1L;
   public static Texture sigmaLogo;
   public static Texture back;
   public static Texture background;

   public CustomResourceLoadProgressGui(Minecraft mc, IAsyncReloader reloader, Consumer<Optional<Throwable>> throwable, boolean b) {
      this.mc = mc;
      this.iAsyncReloader = reloader;
      this.throwable = throwable;
      this.b = b;
   }

   public static void initPNGS() {
      sigmaLogo = ResourceList.loadTexture("com/mentalfrostbyte/gui/resources/sigma/logo.png");
      back = ResourceList.loadTexture("com/mentalfrostbyte/gui/resources/loading/back.png");
      background = ResourceList.createScaledAndProcessedTexture2("com/mentalfrostbyte/gui/resources/loading/back.png", 0.25F, 25);
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      int var7 = this.mc.mainWindow.getScaledWidth();
      int var8 = this.mc.mainWindow.getScaledHeight();
      long var9 = Util.milliTime();
      if (this.b && (this.iAsyncReloader.asyncPartDone() || this.mc.currentScreen != null) && this.field6773 == -1L) {
         this.field6773 = var9;
      }

      float var11 = this.field6772 > -1L ? (float)(var9 - this.field6772) / 200.0F : -1.0F;
      float var12 = this.field6773 > -1L ? (float)(var9 - this.field6773) / 100.0F : -1.0F;
      float var13 = 1.0F;
      float var16 = this.iAsyncReloader.estimateExecutionSpeed();
      this.field6771 = this.field6771 * 0.95F + var16 * 0.050000012F;
      GL11.glPushMatrix();
      float var17 = 1111.0F;
      if (this.mc.mainWindow.getWidth() != 0) {
         var17 = (float)(this.mc.mainWindow.getFramebufferWidth() / this.mc.mainWindow.getWidth());
      }

      float var18 = (float)this.mc.mainWindow.calcGuiScale(this.mc.gameSettings.guiScale, this.mc.getForceUnicodeFont()) * var17;
      GL11.glScalef(1.0F / var18, 1.0F / var18, 0.0F);
      method6015(var13, this.field6771);
      GL11.glPopMatrix();
      if (var11 >= 2.0F) {
         this.mc.setLoadingGui(null);
      }

      if (this.field6772 == -1L && this.iAsyncReloader.fullyDone() && (!this.b || var12 >= 2.0F)) {
         try {
            this.iAsyncReloader.join();
            this.throwable.accept(Optional.empty());
         } catch (Throwable var20) {
            this.throwable.accept(Optional.of(var20));
         }

         this.field6772 = Util.milliTime();
         if (this.mc.currentScreen != null) {
            this.mc.currentScreen.init(this.mc, this.mc.getMainWindow().getScaledWidth(), this.mc.getMainWindow().getScaledHeight());
         }
      }
   }

   public static void method6015(float var0, float var1) {
      if (sigmaLogo == null) {
         initPNGS();
      }

      GL11.glEnable(3008);
      GL11.glEnable(3042);
      RenderUtil.drawImage(
         0.0F, 0.0F, (float) Minecraft.getInstance().mainWindow.getWidth(), (float) Minecraft.getInstance().mainWindow.getHeight(), background, var0
      );
      RenderUtil.renderBackgroundBox(
         0.0F, 0.0F, (float) Minecraft.getInstance().mainWindow.getWidth(), (float) Minecraft.getInstance().mainWindow.getHeight(), MultiUtilities.applyAlpha(0, 0.75F)
      );
      int var4 = 455;
      int var5 = 78;
      int var6 = (Minecraft.getInstance().mainWindow.getWidth() - var4) / 2;
      int var7 = Math.round((float)((Minecraft.getInstance().mainWindow.getHeight() - var5) / 2) - 14.0F * var0);
      float var8 = 0.75F + var0 * var0 * var0 * var0 * 0.25F;
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(Minecraft.getInstance().mainWindow.getWidth() / 2), (float)(Minecraft.getInstance().mainWindow.getHeight() / 2), 0.0F);
      GL11.glScalef(var8, var8, 0.0F);
      GL11.glTranslatef((float)(-Minecraft.getInstance().mainWindow.getWidth() / 2), (float)(-Minecraft.getInstance().mainWindow.getHeight() / 2), 0.0F);
      RenderUtil.drawImage((float)var6, (float)var7, (float)var4, (float)var5, sigmaLogo, MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, var0));
      float var9 = Math.min(1.0F, var1 * 1.02F);
      float var11 = 80;
      if (var0 == 1.0F) {
         RenderUtil.drawRect(
            (float)var6, (float)(var7 + var5 + var11), (float)var4, 20.0F, 10.0F, MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.3F * var0)
         );
         RenderUtil.drawRect(
            (float)(var6 + 1),
            (float)(var7 + var5 + var11 + 1),
            (float)(var4 - 2),
            18.0F,
            9.0F,
            MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.color, 1.0F * var0)
         );
      }

      RenderUtil.drawRect(
         (float)(var6 + 2),
         (float)(var7 + var5 + var11 + 2),
         (float)((int)((float)(var4 - 4) * var9)),
         16.0F,
         8.0F,
         MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.9F * var0)
      );
      GL11.glPopMatrix();
   }

   @Override
   public boolean isPauseScreen() {
      return true;
   }
}
