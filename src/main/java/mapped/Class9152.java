package mapped;

import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class Class9152 {
   private Class2226 field42029;
   private byte[] field42030;
   private Image field42031;

   public Class9152(Class2226 var1, byte[] var2) {
      this.field42029 = var1;
      this.field42030 = var2;
   }

   public Class2226 method34172() {
      return this.field42029;
   }

   public byte[] method34173() {
      return this.field42030;
   }

   public Image method34174() throws IOException {
      try {
         if (this.field42031 == null) {
            this.field42031 = ImageIO.read(new ByteArrayInputStream(this.field42030));
         }

         return this.field42031;
      } catch (IOException var4) {
         Logger.getLogger("MP4 API").log(Level.SEVERE, "Artwork.getImage failed: {0}", var4.toString());
         throw var4;
      }
   }
}
