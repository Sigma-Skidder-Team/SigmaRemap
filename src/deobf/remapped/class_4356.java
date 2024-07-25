package remapped;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Date;
import javax.imageio.ImageIO;
import org.apache.commons.codec.binary.Base64;
import org.lwjgl.opengl.GL11;

public class class_4356 extends class_446 {
   public class_5933 field_21339 = null;
   public class_2560 field_21335 = null;
   public class_8343 field_21333 = null;
   public class_8343 field_21338 = null;
   private BufferedImage field_21334;
   private class_2440 field_21337;

   public class_4356(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_5933 var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field_21339 = var7;
      this.field_21335 = var7.method_27123();
      this.field_21337 = new class_2440(200, 200, class_4043.field_19618);
   }

   @Override
   public void finalize() throws Throwable {
      try {
         if (this.field_21338 != null) {
            SigmaMainClass.method_3328().method_3329(this.field_21338);
         }

         if (this.field_21333 != null) {
            SigmaMainClass.method_3328().method_3329(this.field_21333);
         }
      } finally {
         super.finalize();
      }
   }

   @Override
   public void method_32178(float var1) {
      this.method_32130();
      float var4 = class_9556.method_44073(this.field_21337.method_11123(), 0.0F, 1.0F, 1.0F);
      float var5 = class_9681.method_44757(this.field_21337.method_11123(), 0.0F, 1.0F, 1.0F);
      if (this.method_32183()) {
         this.field_21337.method_11119(class_4043.field_19620);
      } else if ((double)Math.abs(var4 - var5) < 0.7) {
         this.field_21337.method_11119(class_4043.field_19618);
      }

      if (this.method_32093() + this.method_32164() < MinecraftClient.getInstance().field_9602.method_43163() - 36 && this.method_32093() + this.method_32164() > 52
         )
       {
         if (this.field_21335 != null && this.field_21338 == null) {
            try {
               BufferedImage var6 = method_20215(this.field_21335.method_11622());
               if (var6 != null) {
                  this.field_21333 = class_6568.method_30015("servericon", var6);
                  this.field_21338 = class_6568.method_30015(
                     "servericon", class_7849.method_35510(class_7849.method_35501(method_20214(var6, 2.5, 2.5), 0.0F, 1.1F, 0.0F), 25)
                  );
               }
            } catch (IOException var8) {
               var8.printStackTrace();
            }
         }

         class_73.method_151(this);
         class_73.method_94(
            (float)this.field_36270,
            (float)this.field_36261,
            (float)(this.field_36270 + this.field_36278),
            (float)(this.field_36261 + this.field_36257),
            class_1255.field_6918.field_6917
         );
         GL11.glTexParameteri(3553, 10241, 9728);
         GL11.glPushMatrix();
         int var9 = this.field_36278 / 2;
         int var7 = this.field_36257 / 2;
         if (this.field_21337.method_11128() == class_4043.field_19618) {
            var4 = class_9681.method_44757(this.field_21337.method_11123(), 0.0F, 1.0F, 1.0F);
         }

         GL11.glTranslatef((float)(this.method_32132() + var9), (float)(this.method_32173() + var7), 0.0F);
         GL11.glScaled(1.0 + 0.4 * (double)var4, 1.0 + 0.4 * (double)var4, 0.0);
         GL11.glTranslatef((float)(-this.method_32132() - var9), (float)(-this.method_32173() - var7), 0.0F);
         if (this.field_21338 != null) {
            class_73.method_99(
               (float)this.field_36270,
               (float)(this.field_36261 - (this.field_36278 - this.field_36257) / 2),
               (float)this.field_36278,
               (float)this.field_36278,
               this.field_21338,
               class_314.method_1444(class_314.method_1442(class_1255.field_6918.field_6917, class_1255.field_6929.field_6917, 0.7F), 0.8F)
            );
         }

         GL11.glPopMatrix();
         class_73.method_141();
         class_73.method_94(
            (float)this.field_36270,
            (float)this.field_36261,
            (float)(this.field_36270 + this.field_36278),
            (float)(this.field_36261 + this.field_36257),
            class_314.method_1444(class_1255.field_6929.field_6917, 0.3F + 0.3F * this.field_21337.method_11123())
         );
      }

      if (this.field_21339 != null) {
         if (this.field_21335 != null) {
            this.method_20216();
            this.method_20217();
            class_2209.field_11044.method_38419();
            class_2209.field_11044.method_38419();
            super.method_32178(var1);
         }
      }
   }

   public void method_20216() {
      GL11.glPushMatrix();
      byte var3 = 44;
      byte var4 = 44;
      float var5 = class_9556.method_44073(this.field_21337.method_11123(), 0.0F, 1.0F, 1.0F);
      if (this.field_21337.method_11128() == class_4043.field_19618) {
         var5 = class_9681.method_44757(this.field_21337.method_11123(), 0.0F, 1.0F, 1.0F);
      }

      GL11.glTranslatef((float)(this.method_32132() + 44), (float)(this.method_32173() + 44), 0.0F);
      GL11.glScaled(1.0 + 0.1 * (double)var5, 1.0 + 0.1 * (double)var5, 0.0);
      GL11.glTranslatef((float)(-this.method_32132() - 44), (float)(-this.method_32173() - 44), 0.0F);
      if (this.field_21333 == null) {
         MinecraftClient.getInstance().method_8577().method_35674(new class_4639("textures/misc/unknown_server.png"));
         class_73.method_137(
            (float)(this.field_36270 + 12), (float)(this.field_36261 + 12), 64.0F, 64.0F, class_1255.field_6918.field_6917, 0.0F, 0.0F, 64.0F, 64.0F
         );
      } else {
         class_73.method_102(
            (float)(this.field_36270 + 12), (float)(this.field_36261 + 12), 64.0F, 64.0F, this.field_21333, class_1255.field_6918.field_6917, true
         );
      }

      GL11.glPopMatrix();
      class_2209.field_11044.method_38419();
      class_2209.field_11044.method_38419();
   }

   public void method_20217() {
      long var3 = this.field_21339.method_27122().getTime() - new Date().getTime();
      int var5 = (int)(var3 / 1000L) % 60;
      int var6 = (int)(var3 / 60000L % 60L);
      int var7 = (int)(var3 / 3600000L % 24L);
      int var8 = (int)(var3 / 86400000L);
      class_73.method_149(
         this.method_32155() + this.method_32181(),
         this.method_32093() + this.method_32164(),
         this.method_32155() + this.method_32181() + this.field_36278,
         this.method_32093() + this.method_32164() + this.field_36257
      );
      GL11.glPushMatrix();
      byte var9 = 76;
      byte var10 = 44;
      float var11 = class_9556.method_44073(this.field_21337.method_11123(), 0.0F, 1.0F, 1.0F);
      if (this.field_21337.method_11128() == class_4043.field_19618) {
         var11 = class_9681.method_44757(this.field_21337.method_11123(), 0.0F, 1.0F, 1.0F);
      }

      GL11.glTranslatef((float)(this.method_32132() + 76), (float)(this.method_32173() + 44), 0.0F);
      GL11.glScaled(1.0 - 0.1 * (double)var11, 1.0 - 0.1 * (double)var11, 0.0);
      GL11.glTranslatef((float)(-this.method_32132() - 76), (float)(-this.method_32173() - 44), 0.0F);
      class_73.method_87(
         class_5320.field_27155,
         (float)(this.field_36270 + 94),
         (float)(this.field_36261 + 16),
         !this.field_21335.field_12670.equals("Minecraft Server")
            ? this.field_21335.field_12670
            : this.field_21335.field_12675.substring(0, 1).toUpperCase() + this.field_21335.field_12675.substring(1, this.field_21335.field_12675.length()),
         class_314.method_1444(class_1255.field_6918.field_6917, 0.9F)
      );
      byte var12 = 94;
      byte var13 = 46;
      if (this.field_21339.method_27122().getTime() != 9223372036854775806L) {
         if (var3 > 0L && this.field_21339.method_27122().getTime() != Long.MAX_VALUE) {
            class_73.method_87(
               class_5320.field_27139,
               (float)(this.field_36270 + var12),
               (float)(this.field_36261 + var13),
               "Unban: " + var8 + " days, " + var7 + "h " + var6 + "m " + var5 + "s",
               class_314.method_1442(class_1255.field_6929.field_6917, class_1255.field_6918.field_6917, 0.2F)
            );
         } else if (this.field_21339.method_27122().getTime() != Long.MAX_VALUE) {
            class_73.method_87(
               class_5320.field_27139,
               (float)(this.field_36270 + var12),
               (float)(this.field_36261 + var13),
               "Unbanned!",
               class_314.method_1442(class_1255.field_6932.field_6917, class_1255.field_6918.field_6917, 0.3F)
            );
         } else {
            class_73.method_87(
               class_5320.field_27139,
               (float)(this.field_36270 + var12),
               (float)(this.field_36261 + var13),
               "Permanently banned!",
               class_314.method_1442(class_1255.field_6928.field_6917, class_1255.field_6918.field_6917, 0.3F)
            );
         }
      } else {
         class_73.method_87(
            class_5320.field_27139,
            (float)(this.field_36270 + var12),
            (float)(this.field_36261 + var13),
            "Compromised ban (unbannable)!",
            class_314.method_1442(class_1255.field_6923.field_6917, class_1255.field_6918.field_6917, 0.3F)
         );
      }

      GL11.glPopMatrix();
      class_73.method_141();
   }

   public static BufferedImage method_20215(String var0) {
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

   public static BufferedImage method_20214(BufferedImage var0, double var1, double var3) {
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
   public boolean method_29508(int var1, int var2, int var3) {
      return false;
   }
}
