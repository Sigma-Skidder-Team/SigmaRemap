package mapped;

import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.Util;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import java.util.Optional;
import java.util.function.Consumer;

public class CustomResourceLoadProgressGui extends LoadingGui {
   private static final ResourceLocation field6766 = new ResourceLocation("textures/gui/title/mojang.png");
   private final Minecraft field6767;
   private final Class8335 field6768;
   private final Consumer<Optional<Throwable>> field6769;
   private final boolean field6770;
   private float field6771;
   private long field6772 = -1L;
   private long field6773 = -1L;
   private int field6774 = 0;
   private int field6775 = 16777215;
   private int field6776 = 14821431;
   private boolean field6777 = false;
   public static Texture field6778;
   public static Texture field6779;
   public static Texture field6780;
   private float field6781;

   public CustomResourceLoadProgressGui(Minecraft var1, Class8335 var2, Consumer<Optional<Throwable>> var3, boolean var4) {
      this.field6767 = var1;
      this.field6768 = var2;
      this.field6769 = var3;
      this.field6770 = var4;
   }

   public static void method6014() {
      field6778 = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/sigma/logo.png");
      field6779 = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/loading/back.png");
      field6780 = ResourcesDecrypter.createScaledAndProcessedTexture2("com/mentalfrostbyte/gui/resources/loading/back.png", 0.25F, 25);
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      int var7 = this.field6767.mainWindow.getScaledWidth();
      int var8 = this.field6767.mainWindow.getScaledHeight();
      long var9 = Util.milliTime();
      if (this.field6770 && (this.field6768.method29225() || this.field6767.currentScreen != null) && this.field6773 == -1L) {
         this.field6773 = var9;
      }

      float var11 = this.field6772 > -1L ? (float)(var9 - this.field6772) / 200.0F : -1.0F;
      float var12 = this.field6773 > -1L ? (float)(var9 - this.field6773) / 100.0F : -1.0F;
      float var13 = 1.0F;
      int var14 = (this.field6767.mainWindow.getScaledWidth() - 256) / 2;
      int var15 = (this.field6767.mainWindow.getScaledHeight() - 256) / 2;
      float var16 = this.field6768.method29224();
      this.field6771 = this.field6771 * 0.95F + var16 * 0.050000012F;
      GL11.glPushMatrix();
      float var17 = 1111.0F;
      if (this.field6767.mainWindow.getWidth() != 0) {
         var17 = (float)(this.field6767.mainWindow.getFramebufferWidth() / this.field6767.mainWindow.getWidth());
      }

      float var18 = (float)this.field6767.mainWindow.calcGuiScale(this.field6767.gameSettings.guiScale, this.field6767.getForceUnicodeFont()) * var17;
      GL11.glScalef(1.0F / var18, 1.0F / var18, 0.0F);
      method6015(var13, this.field6771);
      GL11.glPopMatrix();
      if (var11 >= 2.0F) {
         this.field6767.setLoadingGui(null);
      }

      if (this.field6772 == -1L && this.field6768.method29226() && (!this.field6770 || var12 >= 2.0F)) {
         try {
            this.field6768.method29227();
            this.field6769.accept(Optional.empty());
         } catch (Throwable var20) {
            this.field6769.accept(Optional.of(var20));
         }

         this.field6772 = Util.milliTime();
         if (this.field6767.currentScreen != null) {
            this.field6767.currentScreen.init(this.field6767, this.field6767.getMainWindow().getScaledWidth(), this.field6767.getMainWindow().getScaledHeight());
         }
      }
   }

   public static void method6015(float var0, float var1) {
      if (field6778 == null) {
         method6014();
      }

      GL11.glEnable(3008);
      GL11.glEnable(3042);
      RenderUtil.method11454(
         0.0F, 0.0F, (float) Minecraft.getInstance().mainWindow.getWidth(), (float) Minecraft.getInstance().mainWindow.getHeight(), field6780, var0
      );
      RenderUtil.method11424(
         0.0F, 0.0F, (float) Minecraft.getInstance().mainWindow.getWidth(), (float) Minecraft.getInstance().mainWindow.getHeight(), MultiUtilities.applyAlpha(0, 0.75F)
      );
      short var4 = 455;
      byte var5 = 78;
      int var6 = (Minecraft.getInstance().mainWindow.getWidth() - var4) / 2;
      int var7 = Math.round((float)((Minecraft.getInstance().mainWindow.getHeight() - var5) / 2) - 14.0F * var0);
      float var8 = 0.75F + var0 * var0 * var0 * var0 * 0.25F;
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(Minecraft.getInstance().mainWindow.getWidth() / 2), (float)(Minecraft.getInstance().mainWindow.getHeight() / 2), 0.0F);
      GL11.glScalef(var8, var8, 0.0F);
      GL11.glTranslatef((float)(-Minecraft.getInstance().mainWindow.getWidth() / 2), (float)(-Minecraft.getInstance().mainWindow.getHeight() / 2), 0.0F);
      RenderUtil.drawImage((float)var6, (float)var7, (float)var4, (float)var5, field6778, MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var0));
      float var9 = Math.min(1.0F, var1 * 1.02F);
      float var10 = 1.0F - var0;
      byte var11 = 80;
      if (var0 == 1.0F) {
         RenderUtil.drawRect(
            (float)var6, (float)(var7 + var5 + var11), (float)var4, 20.0F, 10.0F, MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.3F * var0)
         );
         RenderUtil.drawRect(
            (float)(var6 + 1),
            (float)(var7 + var5 + var11 + 1),
            (float)(var4 - 2),
            18.0F,
            9.0F,
            MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, 1.0F * var0)
         );
      }

      RenderUtil.drawRect(
         (float)(var6 + 2),
         (float)(var7 + var5 + var11 + 2),
         (float)((int)((float)(var4 - 4) * var9)),
         16.0F,
         8.0F,
         MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.9F * var0)
      );
      GL11.glPopMatrix();
   }

   @Override
   public boolean isPauseScreen() {
      return true;
   }

   public void method6016() {
      this.field6774 = 16777215;
      this.field6775 = 16777215;
      this.field6776 = 14821431;
   }

   private static int method6017(String var0, int var1) {
      if (var0 == null) {
         return var1;
      } else {
         var0 = var0.trim();

         try {
            return Integer.parseInt(var0, 16) & 16777215;
         } catch (NumberFormatException var5) {
            return var1;
         }
      }
   }

   public boolean method6018() {
      return this.field6777;
   }

   // $VF: synthetic method
   public static ResourceLocation method6019() {
      return field6766;
   }
}
