package mapped;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;

public class Class7191 implements Class7183 {
   private static String[] field30886;
   private BufferedImageOp field30887;

   public Class7191() {
   }

   public Class7191(BufferedImageOp var1) {
      this.field30887 = var1;
   }

   @Override
   public void method22539(BufferedImage var1, Graphics2D var2, Class7431 var3, Class8140 var4) {
      BufferedImage var7 = Class9439.method36283();
      this.field30887.filter(var1, var7);
      var1.getGraphics().drawImage(var7, 0, 0, null);
   }

   public BufferedImageOp method22589() {
      return this.field30887;
   }

   public void method22590(BufferedImageOp var1) {
      this.field30887 = var1;
   }
}
