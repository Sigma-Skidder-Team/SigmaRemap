package mapped;

import net.sourceforge.jaad.mp4.api.Frame;
import net.sourceforge.jaad.mp4.api.Movie;
import net.sourceforge.jaad.spi.javasound.AsynchronousAudioInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import javax.sound.sampled.AudioFormat;

public class MP4AudioInputStream extends AsynchronousAudioInputStream {
   private final AudioTrack track;
   private final Decoder decoder;
   private final SampleBuffer sampleBuffer;
   private AudioFormat field9610;
   private byte[] field9611;

   public MP4AudioInputStream(InputStream var1, AudioFormat var2, long var3) throws IOException {
      super(var1, var2, var3);
      Class8490 var7 = new Class8490(var1);
      Movie var8 = var7.method30073();
      List var9 = var8.getTracks(AudioTrack.AudioCodec.AAC);
      if (!var9.isEmpty()) {
         this.track = (AudioTrack)var9.get(0);
         this.decoder = new Decoder(this.track.getDecoderSpecificInfo());
         this.sampleBuffer = new SampleBuffer();
      } else {
         throw new IOException("movie does not contain any AAC track");
      }
   }

   @Override
   public AudioFormat getFormat() {
      if (this.field9610 == null) {
         this.method7754();
         this.field9610 = new AudioFormat((float)this.sampleBuffer.method28524(), this.sampleBuffer.method28526(), this.sampleBuffer.method28525(), true, true);
         this.field9611 = this.sampleBuffer.getData();
      }

      return this.field9610;
   }

   @Override
   public void execute() {
      if (this.field9611 != null) {
         this.field9600.method21047(this.field9611);
         this.field9611 = null;
      } else {
         this.method7754();
         if (this.field9600.method21040()) {
            this.field9600.method21047(this.sampleBuffer.getData());
         }
      }
   }

   private void method7754() {
      if (!this.track.hasMoreFrames()) {
         this.field9600.method21039();
      } else {
         try {
            Frame var3 = this.track.method23324();
            if (var3 == null) {
               this.field9600.method21039();
            } else {
               this.decoder.decodeFrame(var3.getData(), this.sampleBuffer);
            }
         } catch (IOException var4) {
            this.field9600.method21039();
         }
      }
   }
}
