package mapped;

import java.io.IOException;

public class Class5005 extends Class4975 {
   private AudioByteManager field22942;

   public Class5005() {
      super("Object Descriptor Box");
   }

   @Override
   public void method15262(Class8827 var1) throws IOException {
      super.method15262(var1);
      this.field22942 = AudioByteManager.method19559(var1);
   }

   public AudioByteManager method15357() {
      return this.field22942;
   }
}
