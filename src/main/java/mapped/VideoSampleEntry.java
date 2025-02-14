package mapped;

import java.io.IOException;

public class VideoSampleEntry extends SampleEntry {
   private int field23035;
   private int field23036;
   private int field23037;

   public VideoSampleEntry(String var1) {
      super(var1);
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      var1.skipBytes(8L);
      this.field23035 = (int)var1.readBits(2);
      this.field23036 = (int)var1.readBits(2);
      var1.skipBytes(2L);
      var1.skipBytes(2L);
      this.field23037 = (int)var1.readBits(2);
      var1.skipBytes(2L);
      this.method15441(var1);
   }

   public int getWidth() {
      return this.field23035;
   }

   public int getHeight() {
      return this.field23037;
   }

   public int getDepth() {
      return this.field23036;
   }
}
