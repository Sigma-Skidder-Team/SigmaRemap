package mapped;

import com.mentalfrostbyte.jello.unmapped.AudioStreamer;

import java.io.IOException;
import java.io.InputStream;

public class MusicStream extends InputStream {
   private final AudioProcessor audioProcessor;
   private MusicByteStream byteStream;
   private volatile int bufferEnd;
   private volatile int bufferPosition;
   private volatile boolean endOfStream;
   private Thread streamingThread;

   public MusicStream(InputStream var1, AudioProcessor var2) {
      this.audioProcessor = var2;
      this.byteStream = new MusicByteStream(this);
      this.bufferEnd = 0;
      this.bufferPosition = 0;
      this.endOfStream = false;
      this.streamingThread = new Thread(new AudioStreamer(this, var1));
      this.streamingThread.start();
   }

   public int method7755() {
      return this.bufferEnd;
   }

   public int method7756() {
      return this.bufferPosition;
   }

   @Override
   public void close() throws IOException {
      this.byteStream.close();
      this.streamingThread.interrupt();
      this.streamingThread = null;
      this.byteStream = null;
      this.bufferEnd = 0;
      this.bufferPosition = 0;
      this.endOfStream = false;
      super.close();
   }


   public int getBufferEnd() {
      return this.bufferEnd;
   }

   public void setBufferEnd(int bufferEnd) {
      this.bufferEnd = bufferEnd;
   }

   public void incrementBufferEnd(int increment) {
      this.bufferEnd += increment;
   }

   public int getBufferPosition() {
      return this.bufferPosition;
   }

   public void setBufferPosition(int bufferPosition) {
      this.bufferPosition = bufferPosition;
   }

   public boolean isEndOfStream() {
      return this.endOfStream;
   }

   public void setEndOfStream(boolean endOfStream) {
      this.endOfStream = endOfStream;
   }

   public AudioProcessor getAudioProcessor() {
      return this.audioProcessor;
   }

   public MusicByteStream getByteStream() {
      return this.byteStream;
   }

   @Override
   public int available() throws IOException {
      return this.bufferEnd - this.bufferPosition;
   }

   @Override
   public int read() throws IOException {
      if (this.endOfStream && this.bufferPosition > this.bufferEnd) {
         return -1;
      } else {
         while (this.bufferEnd < this.bufferPosition || this.byteStream.getBuffer().length <= this.bufferPosition) {
            try {
               if (this.endOfStream) {
                  return -1;
               }
            } catch (Exception var4) {
            }
         }

         return this.byteStream.getBuffer()[this.bufferPosition++] & 0xFF;
      }
   }

   @Override
   public int read(byte[] var1) throws IOException {
      return this.read(var1, 0, var1.length);
   }

   @Override
   public void reset() throws IOException {
      this.bufferPosition = 0;
   }

   @Override
   public int read(byte[] var1, int var2, int var3) throws IOException {
      while (this.bufferEnd < this.bufferPosition + var3) {
         try {
            if (this.endOfStream) {
               return -1;
            }
         } catch (Exception var7) {
         }
      }

      byte[] var6 = this.byteStream.getBuffer();
      System.arraycopy(var6, this.bufferPosition, var1, var2, var3);
      this.bufferPosition += var3;
      return var3;
   }

   @Override
   public long skip(long var1) throws IOException {
      this.bufferPosition = (int)((long)this.bufferPosition + var1);
      return var1;
   }

   // $VF: synthetic method
   public static MusicByteStream method7757(MusicStream var0) {
      return var0.byteStream;
   }

   // $VF: synthetic method
   public static int method7758(MusicStream var0) {
      return var0.bufferEnd;
   }

   // $VF: synthetic method
   public static int method7759(MusicStream var0, int var1) {
      return var0.bufferEnd = var1;
   }

   // $VF: synthetic method
   public static boolean method7760(MusicStream var0, boolean var1) {
      return var0.endOfStream = var1;
   }

   // $VF: synthetic method
   public static AudioProcessor method7761(MusicStream var0) {
      return var0.audioProcessor;
   }
}
