package mapped;

import net.sourceforge.jaad.mp4.MP4InputStream;

import java.io.IOException;

public class Class5058 extends Class5056 {
   private int field23062;
   private int field23063;

   public Class5058() {
      super("H.263 Specific Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      this.method15468(var1);
      this.field23062 = var1.readInt();
      this.field23063 = var1.readInt();
   }

   public int method15472() {
      return this.field23062;
   }

   public int method15473() {
      return this.field23063;
   }
}
