package remapped;

import java.nio.ByteBuffer;
import java.util.OptionalInt;
import javax.sound.sampled.AudioFormat;
import org.lwjgl.openal.AL10;

public class class_7493 {
   private ByteBuffer field_38234;
   private final AudioFormat field_38237;
   private boolean field_38233;
   private int field_38236;

   public class_7493(ByteBuffer var1, AudioFormat var2) {
      this.field_38234 = var1;
      this.field_38237 = var2;
   }

   public OptionalInt method_34066() {
      if (!this.field_38233) {
         if (this.field_38234 == null) {
            return OptionalInt.empty();
         }

         int var3 = class_7604.method_34514(this.field_38237);
         int[] var4 = new int[1];
         AL10.alGenBuffers(var4);
         if (class_7604.method_34512("Creating buffer")) {
            return OptionalInt.empty();
         }

         AL10.alBufferData(var4[0], var3, this.field_38234, (int)this.field_38237.getSampleRate());
         if (class_7604.method_34512("Assigning buffer data")) {
            return OptionalInt.empty();
         }

         this.field_38236 = var4[0];
         this.field_38233 = true;
         this.field_38234 = null;
      }

      return OptionalInt.of(this.field_38236);
   }

   public void method_34068() {
      if (this.field_38233) {
         AL10.alDeleteBuffers(new int[]{this.field_38236});
         if (class_7604.method_34512("Deleting stream buffers")) {
            return;
         }
      }

      this.field_38233 = false;
   }

   public OptionalInt method_34069() {
      OptionalInt var3 = this.method_34066();
      this.field_38233 = false;
      return var3;
   }
}
