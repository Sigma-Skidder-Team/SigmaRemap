package remapped;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;

public class class_3946 implements class_1496 {
   private static String[] field_19160;
   private BufferedImageOp field_19161;

   public class_3946() {
   }

   public class_3946(BufferedImageOp var1) {
      this.field_19161 = var1;
   }

   @Override
   public void method_6895(BufferedImage var1, Graphics2D var2, class_3786 var3, class_6060 var4) {
      BufferedImage var7 = class_8391.method_38663();
      this.field_19161.filter(var1, var7);
      var1.getGraphics().drawImage(var7, 0, 0, null);
   }

   public BufferedImageOp method_18232() {
      return this.field_19161;
   }

   public void method_18231(BufferedImageOp var1) {
      this.field_19161 = var1;
   }
}
