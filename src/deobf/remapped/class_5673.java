package remapped;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;

public class class_5673 extends class_446 {
   public static class_590 field_28755 = new class_590(
      class_1255.field_6929.field_6917,
      class_1255.field_6929.field_6917,
      class_1255.field_6929.field_6917,
      class_1255.field_6929.field_6917,
      class_6206.field_31724,
      class_6206.field_31726
   );
   public URL field_28757 = null;
   public BufferedImage field_28752;
   public boolean field_28751 = false;
   private class_8343 field_28756;
   private class_8343 field_28753;
   private class_2440 field_28754;

   @Override
   public void finalize() throws Throwable {
      try {
         if (this.field_28756 != null) {
            SigmaMainClass.method_3328().method_3329(this.field_28756);
         }

         if (this.field_28753 != null) {
            SigmaMainClass.method_3328().method_3329(this.field_28753);
         }
      } finally {
         super.finalize();
      }
   }

   public class_5673(class_7038 var1, int var2, int var3, int var4, int var5, class_7144 var6) {
      super(var1, var6.field_36800, var2, var3, var4, var5, field_28755, var6.field_36798, false);
      URL var9 = null;

      try {
         var9 = new URL(var6.field_36801);
      } catch (MalformedURLException var11) {
         var11.printStackTrace();
      }

      this.field_28757 = var9;
      this.field_28754 = new class_2440(125, 125);
   }

   @Override
   public void method_32145(int var1, int var2) {
      boolean var5 = this.method_32183() && this.method_32167().method_32167().method_32120(var1, var2);
      this.field_28754.method_11119(!var5 ? class_4043.field_19618 : class_4043.field_19620);
      if (var5) {
         SigmaMainClass.method_3328().method_3299().method_30984(class_6763.field_34905);
      }

      super.method_32145(var1, var2);
   }

   public boolean method_25658() {
      if (this.method_32167() != null && this.method_32167().method_32167() != null) {
         class_7038 var3 = this.method_32167().method_32167();
         if (var3 instanceof class_2612) {
            class_2612 var4 = (class_2612)var3;
            int var5 = var4.method_11853() + var4.method_32137() + this.method_32137();
            int var6 = var4.method_11853() - this.method_32137();
            return this.method_32173() <= var5 && this.method_32173() >= var6;
         }
      }

      return true;
   }

   @Override
   public void method_32178(float var1) {
      if (!this.method_25658()) {
         if (this.field_28756 != null) {
            this.field_28756.method_38413();
            this.field_28756 = null;
         }

         if (this.field_28753 != null) {
            this.field_28753.method_38413();
            this.field_28753 = null;
         }
      } else {
         if (this.method_25658() && !this.field_28751) {
            this.field_28751 = true;
            new Thread(() -> {
               try {
                  BufferedImage var3 = ImageIO.read(this.field_28757);
                  if (var3.getHeight() != var3.getWidth()) {
                     if (this.method_32165().contains("[NCS Release]")) {
                        this.field_28752 = var3.getSubimage(1, 3, 170, 170);
                     } else {
                        this.field_28752 = var3.getSubimage(70, 0, 180, 180);
                     }
                  } else {
                     this.field_28752 = var3;
                  }
               } catch (IOException | NumberFormatException var5x) {
                  var5x.printStackTrace();
               }
            }).start();
         }

         float var4 = this.field_28754.method_11123();
         float var5 = (float)Math.round((float)(this.method_32132() + 15) - 5.0F * var4);
         float var6 = (float)Math.round((float)(this.method_32173() + 15) - 5.0F * var4);
         float var7 = (float)Math.round((float)(this.method_32109() - 30) + 10.0F * var4);
         float var8 = (float)Math.round((float)(this.method_32109() - 30) + 10.0F * var4);
         class_73.method_128(
            (float)(this.method_32132() + 15) - 5.0F * var4,
            (float)(this.method_32173() + 15) - 5.0F * var4,
            (float)(this.method_32109() - 30) + 10.0F * var4,
            (float)(this.method_32109() - 30) + 10.0F * var4,
            20.0F,
            var1
         );
         if (this.field_28756 == null && this.field_28752 == null) {
            class_73.method_99(var5, var6, var7, var8, class_2209.field_11009, class_314.method_1444(class_1255.field_6918.field_6917, var1 * (1.0F - var4)));
            if (this.field_28753 != null) {
               class_73.method_99(var5, var6, var7, var8, class_2209.field_11009, class_314.method_1444(class_1255.field_6918.field_6917, var4 * var1));
            }
         } else {
            if (this.field_28756 == null) {
               try {
                  if (this.field_28756 != null) {
                     this.field_28756.method_38413();
                  }

                  this.field_28756 = class_6568.method_30015("picture", this.field_28752);
               } catch (IOException var14) {
                  var14.printStackTrace();
               }
            }

            if (this.field_28753 == null && var4 > 0.0F) {
               try {
                  if (this.field_28753 != null) {
                     this.field_28753.method_38413();
                  }

                  this.field_28753 = class_6568.method_30015("picture", class_7849.method_35510(this.field_28752, 14));
               } catch (IOException var13) {
                  var13.printStackTrace();
               }
            } else if (var4 == 0.0F && this.field_28753 != null) {
               this.field_28753 = null;
            }

            class_73.method_99(var5, var6, var7, var8, this.field_28756, class_314.method_1444(class_1255.field_6918.field_6917, var1 * (1.0F - var4)));
            if (this.field_28753 != null) {
               class_73.method_99(var5, var6, var7, var8, this.field_28753, class_314.method_1444(class_1255.field_6918.field_6917, var4 * var1));
            }
         }

         byte var9 = 50;
         if (this.method_32185()) {
            var9 = 40;
         }

         float var10 = 0.5F + var4 / 2.0F;
         class_73.method_99(
            (float)(this.method_32132() + this.method_32109() / 2) - (float)(var9 / 2) * var10,
            (float)(this.method_32173() + this.method_32109() / 2) - (float)(var9 / 2) * var10,
            (float)var9 * var10,
            (float)var9 * var10,
            class_2209.field_11028,
            class_314.method_1444(class_1255.field_6918.field_6917, var4 * var1)
         );
         class_3384 var11 = class_5320.field_27145;
         if (this.field_36275 != null) {
            class_73.method_151(this);
            String[] var12 = this.method_32165().replaceAll("\\(.*\\)", "").replaceAll("\\[.*\\]", "").split(" - ");
            if (var12.length > 1) {
               class_73.method_87(
                  var11,
                  (float)(this.method_32132() + (this.method_32109() - var11.method_18547(var12[1])) / 2),
                  (float)(this.method_32173() + this.method_32109() - 2),
                  var12[1],
                  class_314.method_1444(class_1255.field_6918.field_6917, var1)
               );
               class_73.method_87(
                  var11,
                  (float)(this.method_32132() + (this.method_32109() - var11.method_18547(var12[0])) / 2),
                  (float)(this.method_32173() + this.method_32109() - 2 + 13),
                  var12[0],
                  class_314.method_1444(class_1255.field_6918.field_6917, var1)
               );
            } else {
               class_73.method_87(
                  var11,
                  (float)(this.method_32132() + (this.method_32109() - var11.method_18547(var12[0])) / 2),
                  (float)(this.method_32173() + this.method_32109() - 2 + 6),
                  var12[0],
                  class_314.method_1444(class_1255.field_6918.field_6917, var1)
               );
            }

            class_73.method_141();
         }
      }
   }
}
