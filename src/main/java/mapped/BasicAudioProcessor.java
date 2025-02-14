package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.music.MusicManager;

public class BasicAudioProcessor implements AudioProcessor {
   public final MusicManager field39642;

   public BasicAudioProcessor(MusicManager var1) {
      this.field39642 = var1;
   }

   @Override
   public void processBuffer(byte[] var1, int var2, int var3) {
      Client.getClientLogger().setThreadName("DONE");
   }
}
