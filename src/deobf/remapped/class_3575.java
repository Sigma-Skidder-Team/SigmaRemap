package remapped;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.ImageObserver;
import javax.annotation.Nullable;

public class class_3575 {
   private static String[] field_17499;
   private int[] field_17497;
   private int field_17498;
   private int field_17500;

   @Nullable
   public BufferedImage method_16620(BufferedImage var1) {
      if (var1 != null) {
         this.field_17498 = 64;
         this.field_17500 = 64;
         BufferedImage var4 = new BufferedImage(this.field_17498, this.field_17500, 2);
         Graphics var5 = var4.getGraphics();
         var5.drawImage(var1, 0, 0, (ImageObserver)null);
         boolean var6 = var1.getHeight() == 32;
         if (var6) {
            var5.setColor(new Color(0, 0, 0, 0));
            var5.fillRect(0, 32, 64, 32);
            var5.drawImage(var4, 24, 48, 20, 52, 4, 16, 8, 20, (ImageObserver)null);
            var5.drawImage(var4, 28, 48, 24, 52, 8, 16, 12, 20, (ImageObserver)null);
            var5.drawImage(var4, 20, 52, 16, 64, 8, 20, 12, 32, (ImageObserver)null);
            var5.drawImage(var4, 24, 52, 20, 64, 4, 20, 8, 32, (ImageObserver)null);
            var5.drawImage(var4, 28, 52, 24, 64, 0, 20, 4, 32, (ImageObserver)null);
            var5.drawImage(var4, 32, 52, 28, 64, 12, 20, 16, 32, (ImageObserver)null);
            var5.drawImage(var4, 40, 48, 36, 52, 44, 16, 48, 20, (ImageObserver)null);
            var5.drawImage(var4, 44, 48, 40, 52, 48, 16, 52, 20, (ImageObserver)null);
            var5.drawImage(var4, 36, 52, 32, 64, 48, 20, 52, 32, (ImageObserver)null);
            var5.drawImage(var4, 40, 52, 36, 64, 44, 20, 48, 32, (ImageObserver)null);
            var5.drawImage(var4, 44, 52, 40, 64, 40, 20, 44, 32, (ImageObserver)null);
            var5.drawImage(var4, 48, 52, 44, 64, 52, 20, 56, 32, (ImageObserver)null);
         }

         var5.dispose();
         this.field_17497 = ((DataBufferInt)var4.getRaster().getDataBuffer()).getData();
         this.method_16622(0, 0, 32, 16);
         if (var6) {
            this.method_16621(32, 0, 64, 32);
         }

         this.method_16622(0, 16, 64, 32);
         this.method_16622(16, 48, 48, 64);
         return var4;
      } else {
         return null;
      }
   }

   private void method_16621(int var1, int var2, int var3, int var4) {
      for (int var7 = var1; var7 < var3; var7++) {
         for (int var8 = var2; var8 < var4; var8++) {
            int var9 = this.field_17497[var7 + var8 * this.field_17498];
            if ((var9 >> 24 & 0xFF) < 128) {
               return;
            }
         }
      }

      for (int var10 = var1; var10 < var3; var10++) {
         for (int var11 = var2; var11 < var4; var11++) {
            this.field_17497[var10 + var11 * this.field_17498] = this.field_17497[var10 + var11 * this.field_17498] & 16777215;
         }
      }
   }

   private void method_16622(int var1, int var2, int var3, int var4) {
      for (int var7 = var1; var7 < var3; var7++) {
         for (int var8 = var2; var8 < var4; var8++) {
            this.field_17497[var7 + var8 * this.field_17498] = this.field_17497[var7 + var8 * this.field_17498] | 0xFF000000;
         }
      }
   }
}
