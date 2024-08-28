package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.account.Class8794;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.ImageUtil;
import com.mentalfrostbyte.jello.util.TextureUtil;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import org.apache.commons.codec.binary.Base64;
import org.lwjgl.opengl.GL11;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Date;

public class Class4348 extends Class4278 {
   public Class8794 field21243 = null;
   public Class7730 field21244 = null;
   public Texture field21245 = null;
   public Texture field21246 = null;
   private BufferedImage field21247;
   private Animation field21248;

   public Class4348(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Class8794 var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field21243 = var7;
      this.field21244 = var7.method31736();
      this.field21248 = new Animation(200, 200, Direction.BACKWARDS);
   }

   @Override
   public void finalize() throws Throwable {
      try {
         if (this.field21246 != null) {
            Client.getInstance().method19927(this.field21246);
         }

         if (this.field21245 != null) {
            Client.getInstance().method19927(this.field21245);
         }
      } finally {
         super.finalize();
      }
   }

   @Override
   public void method13027(float var1) {
      this.method13225();
      float var4 = Class9747.method38214(this.field21248.calcPercent(), 0.0F, 1.0F, 1.0F);
      float var5 = Class9782.method38556(this.field21248.calcPercent(), 0.0F, 1.0F, 1.0F);
      if (this.method13298()) {
         this.field21248.changeDirection(Direction.FORWARDS);
      } else if ((double)Math.abs(var4 - var5) < 0.7) {
         this.field21248.changeDirection(Direction.BACKWARDS);
      }

      if (this.method13272() + this.method13282() < Minecraft.getInstance().field1283.method8044() - 36 && this.method13272() + this.method13282() > 52) {
         if (this.field21244 != null && this.field21246 == null) {
            try {
               BufferedImage var6 = method13578(this.field21244.method25580());
               if (var6 != null) {
                  this.field21245 = TextureUtil.method32933("servericon", var6);
                  this.field21246 = TextureUtil.method32933(
                     "servericon", ImageUtil.method35032(ImageUtil.method35042(method13579(var6, 2.5, 2.5), 0.0F, 1.1F, 0.0F), 25)
                  );
               }
            } catch (IOException var8) {
               var8.printStackTrace();
            }
         }

         Class3192.method11415(this);
         Class3192.method11426(
            (float)this.field20895,
            (float)this.field20896,
            (float)(this.field20895 + this.field20897),
            (float)(this.field20896 + this.field20898),
            Class1979.field12896.field12910
         );
         GL11.glTexParameteri(3553, 10241, 9728);
         GL11.glPushMatrix();
         int var9 = this.field20897 / 2;
         int var7 = this.field20898 / 2;
         if (this.field21248.method25319() == Direction.BACKWARDS) {
            var4 = Class9782.method38556(this.field21248.calcPercent(), 0.0F, 1.0F, 1.0F);
         }

         GL11.glTranslatef((float)(this.method13263() + var9), (float)(this.method13265() + var7), 0.0F);
         GL11.glScaled(1.0 + 0.4 * (double)var4, 1.0 + 0.4 * (double)var4, 0.0);
         GL11.glTranslatef((float)(-this.method13263() - var9), (float)(-this.method13265() - var7), 0.0F);
         if (this.field21246 != null) {
            Class3192.method11449(
               (float)this.field20895,
               (float)(this.field20896 - (this.field20897 - this.field20898) / 2),
               (float)this.field20897,
               (float)this.field20897,
               this.field21246,
               Class5628.method17688(Class5628.method17690(Class1979.field12896.field12910, Class1979.field12891.field12910, 0.7F), 0.8F)
            );
         }

         GL11.glPopMatrix();
         Class3192.method11422();
         Class3192.method11426(
            (float)this.field20895,
            (float)this.field20896,
            (float)(this.field20895 + this.field20897),
            (float)(this.field20896 + this.field20898),
            Class5628.method17688(Class1979.field12891.field12910, 0.3F + 0.3F * this.field21248.calcPercent())
         );
      }

      if (this.field21243 != null) {
         if (this.field21244 != null) {
            this.method13576();
            this.method13577();
            ResourcesDecrypter.shoutIconPNG.bind();
            ResourcesDecrypter.shoutIconPNG.bind();
            super.method13027(var1);
         }
      }
   }

   public void method13576() {
      GL11.glPushMatrix();
      byte var3 = 44;
      byte var4 = 44;
      float var5 = Class9747.method38214(this.field21248.calcPercent(), 0.0F, 1.0F, 1.0F);
      if (this.field21248.method25319() == Direction.BACKWARDS) {
         var5 = Class9782.method38556(this.field21248.calcPercent(), 0.0F, 1.0F, 1.0F);
      }

      GL11.glTranslatef((float)(this.method13263() + 44), (float)(this.method13265() + 44), 0.0F);
      GL11.glScaled(1.0 + 0.1 * (double)var5, 1.0 + 0.1 * (double)var5, 0.0);
      GL11.glTranslatef((float)(-this.method13263() - 44), (float)(-this.method13265() - 44), 0.0F);
      if (this.field21245 == null) {
         Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("textures/misc/unknown_server.png"));
         Class3192.method11457(
            (float)(this.field20895 + 12), (float)(this.field20896 + 12), 64.0F, 64.0F, Class1979.field12896.field12910, 0.0F, 0.0F, 64.0F, 64.0F
         );
      } else {
         Class3192.method11450(
            (float)(this.field20895 + 12), (float)(this.field20896 + 12), 64.0F, 64.0F, this.field21245, Class1979.field12896.field12910, true
         );
      }

      GL11.glPopMatrix();
      ResourcesDecrypter.shoutIconPNG.bind();
      ResourcesDecrypter.shoutIconPNG.bind();
   }

   public void method13577() {
      long var3 = this.field21243.method31735().getTime() - new Date().getTime();
      int var5 = (int)(var3 / 1000L) % 60;
      int var6 = (int)(var3 / 60000L % 60L);
      int var7 = (int)(var3 / 3600000L % 24L);
      int var8 = (int)(var3 / 86400000L);
      Class3192.method11420(
         this.method13271() + this.method13280(),
         this.method13272() + this.method13282(),
         this.method13271() + this.method13280() + this.field20897,
         this.method13272() + this.method13282() + this.field20898
      );
      GL11.glPushMatrix();
      byte var9 = 76;
      byte var10 = 44;
      float var11 = Class9747.method38214(this.field21248.calcPercent(), 0.0F, 1.0F, 1.0F);
      if (this.field21248.method25319() == Direction.BACKWARDS) {
         var11 = Class9782.method38556(this.field21248.calcPercent(), 0.0F, 1.0F, 1.0F);
      }

      GL11.glTranslatef((float)(this.method13263() + 76), (float)(this.method13265() + 44), 0.0F);
      GL11.glScaled(1.0 - 0.1 * (double)var11, 1.0 - 0.1 * (double)var11, 0.0);
      GL11.glTranslatef((float)(-this.method13263() - 76), (float)(-this.method13265() - 44), 0.0F);
      Class3192.method11439(
         ResourceRegistry.JelloMediumFont25,
         (float)(this.field20895 + 94),
         (float)(this.field20896 + 16),
         !this.field21244.field33188.equals("Minecraft Server")
            ? this.field21244.field33188
            : this.field21244.field33189.substring(0, 1).toUpperCase() + this.field21244.field33189.substring(1, this.field21244.field33189.length()),
         Class5628.method17688(Class1979.field12896.field12910, 0.9F)
      );
      byte var12 = 94;
      byte var13 = 46;
      if (this.field21243.method31735().getTime() != 9223372036854775806L) {
         if (var3 > 0L && this.field21243.method31735().getTime() != Long.MAX_VALUE) {
            Class3192.method11439(
               ResourceRegistry.JelloLightFont18,
               (float)(this.field20895 + var12),
               (float)(this.field20896 + var13),
               "Unban: " + var8 + " days, " + var7 + "h " + var6 + "m " + var5 + "s",
               Class5628.method17690(Class1979.field12891.field12910, Class1979.field12896.field12910, 0.2F)
            );
         } else if (this.field21243.method31735().getTime() != Long.MAX_VALUE) {
            Class3192.method11439(
               ResourceRegistry.JelloLightFont18,
               (float)(this.field20895 + var12),
               (float)(this.field20896 + var13),
               "Unbanned!",
               Class5628.method17690(Class1979.field12894.field12910, Class1979.field12896.field12910, 0.3F)
            );
         } else {
            Class3192.method11439(
               ResourceRegistry.JelloLightFont18,
               (float)(this.field20895 + var12),
               (float)(this.field20896 + var13),
               "Permanently banned!",
               Class5628.method17690(Class1979.field12901.field12910, Class1979.field12896.field12910, 0.3F)
            );
         }
      } else {
         Class3192.method11439(
            ResourceRegistry.JelloLightFont18,
            (float)(this.field20895 + var12),
            (float)(this.field20896 + var13),
            "Compromised ban (unbannable)!",
            Class5628.method17690(Class1979.field12902.field12910, Class1979.field12896.field12910, 0.3F)
         );
      }

      GL11.glPopMatrix();
      Class3192.method11422();
   }

   public static BufferedImage method13578(String var0) {
      if (var0 == null) {
         return null;
      } else if (!Base64.isBase64(var0)) {
         return null;
      } else {
         try {
            return ImageIO.read(new ByteArrayInputStream(Base64.decodeBase64(var0)));
         } catch (IOException var4) {
            return null;
         }
      }
   }

   public static BufferedImage method13579(BufferedImage var0, double var1, double var3) {
      BufferedImage var7 = null;
      if (var0 != null) {
         int var8 = (int)((double)var0.getHeight() * var3);
         int var9 = (int)((double)var0.getWidth() * var1);
         var7 = new BufferedImage(var9, var8, var0.getType());
         Graphics2D var10 = var7.createGraphics();
         AffineTransform var11 = AffineTransform.getScaleInstance(var1, var3);
         var10.drawRenderedImage(var0, var11);
      }

      return var7;
   }

   @Override
   public boolean method13078(int var1, int var2, int var3) {
      return false;
   }
}
