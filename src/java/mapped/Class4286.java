package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.gui.GuiManager;
import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.unmapped.Class9133;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.ColorUtils;
import com.mentalfrostbyte.jello.util.ImageUtil;
import com.mentalfrostbyte.jello.util.TextureUtil;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Class4286 extends Class4278 {
   public static ColorHelper field20771 = new ColorHelper(
      ClientColors.DEEP_TEAL.getColor,
      ClientColors.DEEP_TEAL.getColor,
      ClientColors.DEEP_TEAL.getColor,
      ClientColors.DEEP_TEAL.getColor,
      Class2218.field14488,
      Class2218.field14492
   );
   public URL field20772 = null;
   public BufferedImage field20773;
   public boolean field20774 = false;
   private Texture field20775;
   private Texture field20776;
   private Animation field20777;

   @Override
   public void finalize() throws Throwable {
      try {
         if (this.field20775 != null) {
            Client.getInstance().method19927(this.field20775);
         }

         if (this.field20776 != null) {
            Client.getInstance().method19927(this.field20776);
         }
      } finally {
         super.finalize();
      }
   }

   public Class4286(IconPanel var1, int var2, int var3, int var4, int var5, Class9133 var6) {
      super(var1, var6.field41970, var2, var3, var4, var5, field20771, var6.field41971, false);
      URL var9 = null;

      try {
         var9 = new URL(var6.field41972);
      } catch (MalformedURLException var11) {
         var11.printStackTrace();
      }

      this.field20772 = var9;
      this.field20777 = new Animation(125, 125);
   }

   @Override
   public void method13028(int var1, int var2) {
      boolean var5 = this.method13298() && this.method13258().method13258().method13114(var1, var2);
      this.field20777.changeDirection(!var5 ? Direction.BACKWARDS : Direction.FORWARDS);
      if (var5) {
         Client.getInstance().getGuiManager().method33459(GuiManager.field41345);
      }

      super.method13028(var1, var2);
   }

   public boolean method13157() {
      if (this.method13258() != null && this.method13258().method13258() != null) {
         IconPanel var3 = this.method13258().method13258();
         if (var3 instanceof Class4339) {
            Class4339 var4 = (Class4339)var3;
            int var5 = var4.method13513() + var4.method13269() + this.method13269();
            int var6 = var4.method13513() - this.method13269();
            return this.method13265() <= var5 && this.method13265() >= var6;
         }
      }

      return true;
   }

   @Override
   public void draw(float var1) {
      if (!this.method13157()) {
         if (this.field20775 != null) {
            this.field20775.release();
            this.field20775 = null;
         }

         if (this.field20776 != null) {
            this.field20776.release();
            this.field20776 = null;
         }
      } else {
         if (this.method13157() && !this.field20774) {
            this.field20774 = true;
            new Thread(() -> {
               try {
                  BufferedImage var3 = ImageIO.read(this.field20772);
                  if (var3.getHeight() != var3.getWidth()) {
                     if (this.method13303().contains("[NCS Release]")) {
                        this.field20773 = var3.getSubimage(1, 3, 170, 170);
                     } else {
                        this.field20773 = var3.getSubimage(70, 0, 180, 180);
                     }
                  } else {
                     this.field20773 = var3;
                  }
               } catch (IOException | NumberFormatException var5x) {
                  var5x.printStackTrace();
               }
            }).start();
         }

         float var4 = this.field20777.calcPercent();
         float var5 = (float)Math.round((float)(this.method13263() + 15) - 5.0F * var4);
         float var6 = (float)Math.round((float)(this.method13265() + 15) - 5.0F * var4);
         float var7 = (float)Math.round((float)(this.method13267() - 30) + 10.0F * var4);
         float var8 = (float)Math.round((float)(this.method13267() - 30) + 10.0F * var4);
         RenderUtil.method11463(
            (float)(this.method13263() + 15) - 5.0F * var4,
            (float)(this.method13265() + 15) - 5.0F * var4,
            (float)(this.method13267() - 30) + 10.0F * var4,
            (float)(this.method13267() - 30) + 10.0F * var4,
            20.0F,
            var1
         );
         if (this.field20775 == null && this.field20773 == null) {
            RenderUtil.method11449(var5, var6, var7, var8, ResourcesDecrypter.artworkPNG, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1 * (1.0F - var4)));
            if (this.field20776 != null) {
               RenderUtil.method11449(var5, var6, var7, var8, ResourcesDecrypter.artworkPNG, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var4 * var1));
            }
         } else {
            if (this.field20775 == null) {
               try {
                  if (this.field20775 != null) {
                     this.field20775.release();
                  }

                  this.field20775 = TextureUtil.method32933("picture", this.field20773);
               } catch (IOException var14) {
                  var14.printStackTrace();
               }
            }

            if (this.field20776 == null && var4 > 0.0F) {
               try {
                  if (this.field20776 != null) {
                     this.field20776.release();
                  }

                  this.field20776 = TextureUtil.method32933("picture", ImageUtil.method35032(this.field20773, 14));
               } catch (IOException var13) {
                  var13.printStackTrace();
               }
            } else if (var4 == 0.0F && this.field20776 != null) {
               this.field20776 = null;
            }

            RenderUtil.method11449(var5, var6, var7, var8, this.field20775, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1 * (1.0F - var4)));
            if (this.field20776 != null) {
               RenderUtil.method11449(var5, var6, var7, var8, this.field20776, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var4 * var1));
            }
         }

         byte var9 = 50;
         if (this.method13212()) {
            var9 = 40;
         }

         float var10 = 0.5F + var4 / 2.0F;
         RenderUtil.method11449(
            (float)(this.method13263() + this.method13267() / 2) - (float)(var9 / 2) * var10,
            (float)(this.method13265() + this.method13267() / 2) - (float)(var9 / 2) * var10,
            (float)var9 * var10,
            (float)var9 * var10,
            ResourcesDecrypter.playIconPNG,
            ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var4 * var1)
         );
         ClientResource var11 = ResourceRegistry.JelloLightFont12;
         if (this.field20912 != null) {
            RenderUtil.method11415(this);
            String[] var12 = this.method13303().replaceAll("\\(.*\\)", "").replaceAll("\\[.*\\]", "").split(" - ");
            if (var12.length > 1) {
               RenderUtil.drawString(
                  var11,
                  (float)(this.method13263() + (this.method13267() - var11.method23942(var12[1])) / 2),
                  (float)(this.method13265() + this.method13267() - 2),
                  var12[1],
                  ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1)
               );
               RenderUtil.drawString(
                  var11,
                  (float)(this.method13263() + (this.method13267() - var11.method23942(var12[0])) / 2),
                  (float)(this.method13265() + this.method13267() - 2 + 13),
                  var12[0],
                  ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1)
               );
            } else {
               RenderUtil.drawString(
                  var11,
                  (float)(this.method13263() + (this.method13267() - var11.method23942(var12[0])) / 2),
                  (float)(this.method13265() + this.method13267() - 2 + 6),
                  var12[0],
                  ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1)
               );
            }

            RenderUtil.endScissor();
         }
      }
   }
}
