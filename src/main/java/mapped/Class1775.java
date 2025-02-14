package mapped;

import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioFormat;

public class Class1775 extends Class1774 {
   private static String[] field9601;
   private final Class9120 field9602;
   private final Decoder field9603;
   private final SampleBuffer field9604;
   private AudioFormat field9605 = null;
   private byte[] field9606;

   public Class1775(InputStream var1, AudioFormat var2, long var3) throws IOException {
      super(var1, var2, var3);
      this.field9602 = new Class9120(var1);
      this.field9603 = new Decoder(this.field9602.method34012());
      this.field9604 = new SampleBuffer();
   }

   @Override
   public AudioFormat getFormat() {
      if (this.field9605 == null) {
         try {
            this.field9603.decodeFrame(this.field9602.method34013(), this.field9604);
            this.field9605 = new AudioFormat((float)this.field9604.method28524(), this.field9604.method28526(), this.field9604.method28525(), true, true);
            this.field9606 = this.field9604.getData();
         } catch (IOException var4) {
            return null;
         }
      }

      return this.field9605;
   }

   @Override
   public void method7753() {
      try {
         if (this.field9606 == null) {
            this.field9603.decodeFrame(this.field9602.method34013(), this.field9604);
            this.field9600.method21047(this.field9604.getData());
         } else {
            this.field9600.method21047(this.field9606);
            this.field9606 = null;
         }
      } catch (IOException var4) {
         this.field9600.method21039();
      }
   }
}
