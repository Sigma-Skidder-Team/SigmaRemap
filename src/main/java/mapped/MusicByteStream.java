package mapped;

import java.io.ByteArrayOutputStream;

public final class MusicByteStream extends ByteArrayOutputStream {
   public final MusicStream musicStream;

   public MusicByteStream(MusicStream musicStream) {
      this.musicStream = musicStream;
   }

   public byte[] getBuffer() {
      return this.buf;
   }
}
