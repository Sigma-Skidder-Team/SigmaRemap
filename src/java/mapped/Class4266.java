package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.util.ColorUtils;
import com.mentalfrostbyte.jello.util.ImageUtil;
import com.mentalfrostbyte.jello.util.TextureUtil;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class4266 extends Class4247 {
   public int field20684;
   public List<Class7086> field20685 = new ArrayList<Class7086>();
   public int field20686 = 0;
   public boolean field20687 = true;
   private Texture field20688;

   public Class4266(IconPanel var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.method13300(false);
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
      if (this.field20909 && this.field20686 <= 0) {
         if (var2 >= this.method13272() + this.getHeightA() / 2) {
            ((Class4259)this.icoPanel).method13076(false);
            this.field20685.add(new Class7086(this, false));
         } else {
            ((Class4259)this.icoPanel).method13076(true);
            this.field20685.add(new Class7086(this, true));
         }

         if (this.field20686 != 0) {
            this.field20686 = 14;
         } else {
            this.field20686 = 3;
         }
      }

      this.field20686--;
      if (!this.field20909) {
         this.field20686 = -1;
      }
   }

   @Override
   public void finalize() throws Throwable {
      try {
         if (this.field20688 != null) {
            Client.getInstance().method19927(this.field20688);
         }
      } finally {
         super.finalize();
      }
   }

   @Override
   public void draw(float var1) {
      Iterator var4 = this.field20685.iterator();
      byte var5 = 8;

      try {
         if (this.field20687) {
            BufferedImage var6 = ImageUtil.method35039(this.method13271(), this.method13272(), this.widthA, this.heightA, 3, 10, true);
            this.field20684 = ColorUtils.method17682(new Color(var6.getRGB(6, 7)), new Color(var6.getRGB(6, 22))).getRGB();
            this.field20684 = ColorUtils.method17691(this.field20684, 0.25F);
            if (this.field20688 != null) {
               this.field20688.release();
            }

            this.field20688 = TextureUtil.method32933("blur", var6);
            this.field20687 = false;
         }

         if (this.field20688 != null) {
            RenderUtil.drawRoundedRect(
               (float)(this.xA + var5),
               (float)(this.yA + var5),
               (float)(this.widthA - var5 * 2),
               (float)(this.heightA - var5 * 2),
               20.0F,
               var1 * 0.5F
            );
            RenderUtil.drawRoundedRect(
               (float)(this.xA + var5),
               (float)(this.yA + var5),
               (float)(this.widthA - var5 * 2),
               (float)(this.heightA - var5 * 2),
               14.0F,
               var1
            );
            GL11.glPushMatrix();
            RenderUtil.method11476();
            RenderUtil.method11474(
               (float)this.xA, (float)this.yA, (float)this.widthA, (float)this.heightA, 8.0F, ClientColors.LIGHT_GREYISH_BLUE.getColor
            );
            RenderUtil.method11477(Class2329.field15940);
            RenderUtil.method11448(
               (float)(this.xA - 1),
               (float)(this.yA - 1),
               (float)(this.widthA + 2),
               (float)(this.heightA + 2),
               this.field20688,
               ClientColors.LIGHT_GREYISH_BLUE.getColor
            );

            while (var4.hasNext()) {
               Class7086 var11 = (Class7086)var4.next();
               int var7 = this.heightA / 2;
               int var8 = this.yA + (var11.field30491 ? 0 : var7);
               int var9 = this.widthA / 2;
               RenderUtil.method11421(this.xA, var8, this.xA + this.widthA, var8 + var7, true);
               RenderUtil.method11436(
                  (float)(this.xA + var9),
                  (float)(var8 + this.heightA / 4),
                  (float)(var9 * 2 - 4) * var11.field30490 + 4.0F,
                  ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, (1.0F - var11.field30490 * (0.5F + var11.field30490 * 0.5F)) * 0.4F)
               );
               RenderUtil.endScissor();
               var11.field30490 = Math.min(var11.field30490 + 3.0F / (float) Minecraft.getFps(), 1.0F);
               if (var11.field30490 == 1.0F) {
                  var4.remove();
               }
            }

            RenderUtil.method11478();
            RenderUtil.drawRect(
               (float)this.xA,
               (float)this.yA,
               (float)this.widthA,
               (float)this.heightA,
               6.0F,
               ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.3F)
            );
            GL11.glPopMatrix();
            RenderUtil.drawString(
               ResourceRegistry.JelloMediumFont20,
               (float)(this.xA + 14),
               (float)(this.yA + 8),
               "+",
               ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.8F)
            );
            RenderUtil.method11424(
               (float)(this.xA + 16), (float)(this.yA + 65), 8.0F, 2.0F, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.8F)
            );
         }
      } catch (IOException var10) {
      }

      super.draw(var1);
   }
}
