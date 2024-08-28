package mapped;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.ImageObserver;
import javax.annotation.Nullable;

public class Class8089 {
   private static String[] field34764;
   private int[] field34765;
   private int field34766;
   private int field34767;

   @Nullable
   public BufferedImage method27991(BufferedImage var1) {
      if (var1 != null) {
         this.field34766 = 64;
         this.field34767 = 64;
         BufferedImage var4 = new BufferedImage(this.field34766, this.field34767, 2);
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
         this.field34765 = ((DataBufferInt)var4.getRaster().getDataBuffer()).getData();
         this.method27993(0, 0, 32, 16);
         if (var6) {
            this.method27992(32, 0, 64, 32);
         }

         this.method27993(0, 16, 64, 32);
         this.method27993(16, 48, 48, 64);
         return var4;
      } else {
         return null;
      }
   }

   private void method27992(int var1, int var2, int var3, int var4) {
      for (int var7 = var1; var7 < var3; var7++) {
         for (int var8 = var2; var8 < var4; var8++) {
            int var9 = this.field34765[var7 + var8 * this.field34766];
            if ((var9 >> 24 & 0xFF) < 128) {
               return;
            }
         }
      }

      for (int var10 = var1; var10 < var3; var10++) {
         for (int var11 = var2; var11 < var4; var11++) {
            this.field34765[var10 + var11 * this.field34766] = this.field34765[var10 + var11 * this.field34766] & 16777215;
         }
      }
   }

   private void method27993(int var1, int var2, int var3, int var4) {
      for (int var7 = var1; var7 < var3; var7++) {
         for (int var8 = var2; var8 < var4; var8++) {
            this.field34765[var7 + var8 * this.field34766] = this.field34765[var7 + var8 * this.field34766] | 0xFF000000;
         }
      }
   }
}
