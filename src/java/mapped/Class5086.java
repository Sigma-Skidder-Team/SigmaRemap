package mapped;

import com.mentalfrostbyte.jello.music.AudioByteManager;

import java.io.IOException;

public class Class5086 extends Class4975 {
   private AudioByteManager.TextDescriptor field23146;

   public Class5086() {
      super("ESD Box");
   }

   @Override
   public void method15262(DataStreamReader var1) throws IOException {
      super.method15262(var1);
      this.field23146 = (AudioByteManager.TextDescriptor) AudioByteManager.AudioDescriptor.readDescriptor(var1);
   }

   public AudioByteManager.TextDescriptor method15544() {
      return this.field23146;
   }
}
