package mapped;

import java.nio.ByteBuffer;
import java.util.OptionalInt;
import javax.sound.sampled.AudioFormat;
import org.lwjgl.openal.AL10;

public class Class9216 {
   private ByteBuffer field42409;
   private final AudioFormat field42410;
   private boolean field42411;
   private int field42412;

   public Class9216(ByteBuffer var1, AudioFormat var2) {
      this.field42409 = var1;
      this.field42410 = var2;
   }

   public OptionalInt method34532() {
      if (!this.field42411) {
         if (this.field42409 == null) {
            return OptionalInt.empty();
         }

         int var3 = Class9237.method34748(this.field42410);
         int[] var4 = new int[1];
         AL10.alGenBuffers(var4);
         if (Class9237.method34745("Creating buffer")) {
            return OptionalInt.empty();
         }

         AL10.alBufferData(var4[0], var3, this.field42409, (int)this.field42410.getSampleRate());
         if (Class9237.method34745("Assigning buffer data")) {
            return OptionalInt.empty();
         }

         this.field42412 = var4[0];
         this.field42411 = true;
         this.field42409 = null;
      }

      return OptionalInt.of(this.field42412);
   }

   public void method34533() {
      if (this.field42411) {
         AL10.alDeleteBuffers(new int[]{this.field42412});
         if (Class9237.method34745("Deleting stream buffers")) {
            return;
         }
      }

      this.field42411 = false;
   }

   public OptionalInt method34534() {
      OptionalInt var3 = this.method34532();
      this.field42411 = false;
      return var3;
   }
}
