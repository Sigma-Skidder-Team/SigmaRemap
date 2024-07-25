package remapped;

import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class class_7241 {
   private class_5918 field_37144;
   private byte[] field_37145;
   private Image field_37143;

   public class_7241(class_5918 var1, byte[] var2) {
      this.field_37144 = var1;
      this.field_37145 = var2;
   }

   public class_5918 method_33136() {
      return this.field_37144;
   }

   public byte[] method_33135() {
      return this.field_37145;
   }

   public Image method_33137() throws IOException {
      try {
         if (this.field_37143 == null) {
            this.field_37143 = ImageIO.read(new ByteArrayInputStream(this.field_37145));
         }

         return this.field_37143;
      } catch (IOException var4) {
         Logger.getLogger("MP4 API").log(Level.SEVERE, "Artwork.getImage failed: {0}", var4.toString());
         throw var4;
      }
   }
}
