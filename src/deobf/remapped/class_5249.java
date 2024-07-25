package remapped;

import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLEngineResult.HandshakeStatus;
import javax.net.ssl.SSLEngineResult.Status;

public class class_5249 implements ByteChannel, class_3775 {
   public static ByteBuffer field_26885 = ByteBuffer.allocate(0);
   public ExecutorService field_26880;
   public List<Future<?>> field_26887;
   public ByteBuffer field_26886;
   public ByteBuffer field_26883;
   public ByteBuffer field_26877;
   public SocketChannel field_26889;
   public SelectionKey field_26879;
   public SSLEngine field_26878;
   public SSLEngineResult field_26888;
   public SSLEngineResult field_26882;
   public int field_26884 = 0;

   public class_5249(SocketChannel var1, SSLEngine var2, ExecutorService var3, SelectionKey var4) throws IOException {
      if (var1 != null && var2 != null && var3 != null) {
         this.field_26889 = var1;
         this.field_26878 = var2;
         this.field_26880 = var3;
         this.field_26888 = this.field_26882 = new SSLEngineResult(Status.BUFFER_UNDERFLOW, var2.getHandshakeStatus(), 0, 0);
         this.field_26887 = new ArrayList<Future<?>>(3);
         if (var4 != null) {
            var4.interestOps(var4.interestOps() | 4);
            this.field_26879 = var4;
         }

         this.method_24008(var2.getSession());
         this.field_26889.write(this.method_24011(field_26885));
         this.method_24009();
      } else {
         throw new IllegalArgumentException("parameter must not be null");
      }
   }

   private void method_24004(Future<?> var1) {
      try {
         while (true) {
            try {
               var1.get();
               return;
            } catch (InterruptedException var5) {
               Thread.currentThread().interrupt();
            }
         }
      } catch (ExecutionException var6) {
         throw new RuntimeException(var6);
      }
   }

   private synchronized void method_24009() throws IOException {
      if (this.field_26878.getHandshakeStatus() != HandshakeStatus.NOT_HANDSHAKING) {
         if (!this.field_26887.isEmpty()) {
            Iterator var3 = this.field_26887.iterator();

            while (var3.hasNext()) {
               Future var4 = (Future)var3.next();
               if (!var4.isDone()) {
                  if (this.method_17473()) {
                     this.method_24004(var4);
                  }

                  return;
               }

               var3.remove();
            }
         }

         if (this.field_26878.getHandshakeStatus() == HandshakeStatus.NEED_UNWRAP) {
            if (!this.method_17473() || this.field_26888.getStatus() == Status.BUFFER_UNDERFLOW) {
               this.field_26877.compact();
               int var5 = this.field_26889.read(this.field_26877);
               if (var5 == -1) {
                  throw new IOException("connection closed unexpectedly by peer");
               }

               ((Buffer)this.field_26877).flip();
            }

            this.field_26886.compact();
            this.method_24000();
            if (this.field_26888.getHandshakeStatus() == HandshakeStatus.FINISHED) {
               this.method_24008(this.field_26878.getSession());
               return;
            }
         }

         this.method_24013();
         if (this.field_26887.isEmpty() || this.field_26878.getHandshakeStatus() == HandshakeStatus.NEED_WRAP) {
            this.field_26889.write(this.method_24011(field_26885));
            if (this.field_26882.getHandshakeStatus() == HandshakeStatus.FINISHED) {
               this.method_24008(this.field_26878.getSession());
               return;
            }
         }

         assert this.field_26878.getHandshakeStatus() != HandshakeStatus.NOT_HANDSHAKING;

         this.field_26884 = 1;
      }
   }

   private synchronized ByteBuffer method_24011(ByteBuffer var1) throws SSLException {
      this.field_26883.compact();
      this.field_26882 = this.field_26878.wrap(var1, this.field_26883);
      ((Buffer)this.field_26883).flip();
      return this.field_26883;
   }

   private synchronized ByteBuffer method_24000() throws SSLException {
      if (this.field_26888.getStatus() == Status.CLOSED && this.field_26878.getHandshakeStatus() == HandshakeStatus.NOT_HANDSHAKING) {
         try {
            this.close();
         } catch (IOException var5) {
         }
      }

      int var4;
      do {
         var4 = this.field_26886.remaining();
         this.field_26888 = this.field_26878.unwrap(this.field_26877, this.field_26886);
      } while (
         this.field_26888.getStatus() == Status.OK
            && (var4 != this.field_26886.remaining() || this.field_26878.getHandshakeStatus() == HandshakeStatus.NEED_UNWRAP)
      );

      ((Buffer)this.field_26886).flip();
      return this.field_26886;
   }

   public void method_24013() {
      Runnable var3;
      while ((var3 = this.field_26878.getDelegatedTask()) != null) {
         this.field_26887.add(this.field_26880.submit(var3));
      }
   }

   public void method_24008(SSLSession var1) {
      int var4 = var1.getPacketBufferSize();
      int var5 = Math.max(var1.getApplicationBufferSize(), var4);
      if (this.field_26886 != null) {
         if (this.field_26886.capacity() != var5) {
            this.field_26886 = ByteBuffer.allocate(var5);
         }

         if (this.field_26883.capacity() != var4) {
            this.field_26883 = ByteBuffer.allocate(var4);
         }

         if (this.field_26877.capacity() != var4) {
            this.field_26877 = ByteBuffer.allocate(var4);
         }
      } else {
         this.field_26886 = ByteBuffer.allocate(var5);
         this.field_26883 = ByteBuffer.allocate(var4);
         this.field_26877 = ByteBuffer.allocate(var4);
      }

      ((Buffer)this.field_26886).rewind();
      ((Buffer)this.field_26886).flip();
      ((Buffer)this.field_26877).rewind();
      ((Buffer)this.field_26877).flip();
      ((Buffer)this.field_26883).rewind();
      ((Buffer)this.field_26883).flip();
      this.field_26884++;
   }

   @Override
   public int write(ByteBuffer var1) throws IOException {
      if (this.method_24002()) {
         int var4 = this.field_26889.write(this.method_24011(var1));
         if (this.field_26882.getStatus() != Status.CLOSED) {
            return var4;
         } else {
            throw new EOFException("Connection is closed");
         }
      } else {
         this.method_24009();
         return 0;
      }
   }

   @Override
   public int read(ByteBuffer var1) throws IOException {
      while (var1.hasRemaining()) {
         if (!this.method_24002()) {
            if (!this.method_17473()) {
               this.method_24009();
               if (!this.method_24002()) {
                  return 0;
               }
            } else {
               while (!this.method_24002()) {
                  this.method_24009();
               }
            }
         }

         int var4 = this.method_24006(var1);
         if (var4 != 0) {
            return var4;
         }

         assert this.field_26886.position() == 0;

         ((Buffer)this.field_26886).clear();
         if (this.field_26877.hasRemaining()) {
            this.field_26877.compact();
         } else {
            ((Buffer)this.field_26877).clear();
         }

         if ((this.method_17473() || this.field_26888.getStatus() == Status.BUFFER_UNDERFLOW) && this.field_26889.read(this.field_26877) == -1) {
            return -1;
         }

         ((Buffer)this.field_26877).flip();
         this.method_24000();
         int var5 = this.method_24001(this.field_26886, var1);
         if (var5 != 0 || !this.method_17473()) {
            return var5;
         }
      }

      return 0;
   }

   private int method_24006(ByteBuffer var1) throws SSLException {
      if (!this.field_26886.hasRemaining()) {
         if (!this.field_26886.hasRemaining()) {
            ((Buffer)this.field_26886).clear();
         }

         if (this.field_26877.hasRemaining()) {
            this.method_24000();
            int var4 = this.method_24001(this.field_26886, var1);
            if (this.field_26888.getStatus() == Status.CLOSED) {
               return -1;
            }

            if (var4 > 0) {
               return var4;
            }
         }

         return 0;
      } else {
         return this.method_24001(this.field_26886, var1);
      }
   }

   public boolean method_24003() {
      return this.field_26889.isConnected();
   }

   @Override
   public void close() throws IOException {
      this.field_26878.closeOutbound();
      this.field_26878.getSession().invalidate();
      if (this.field_26889.isOpen()) {
         this.field_26889.write(this.method_24011(field_26885));
      }

      this.field_26889.close();
   }

   private boolean method_24002() {
      HandshakeStatus var3 = this.field_26878.getHandshakeStatus();
      return var3 == HandshakeStatus.FINISHED || var3 == HandshakeStatus.NOT_HANDSHAKING;
   }

   public SelectableChannel method_24014(boolean var1) throws IOException {
      return this.field_26889.configureBlocking(var1);
   }

   public boolean method_24010(SocketAddress var1) throws IOException {
      return this.field_26889.connect(var1);
   }

   public boolean method_24007() throws IOException {
      return this.field_26889.finishConnect();
   }

   public Socket method_24012() {
      return this.field_26889.socket();
   }

   public boolean method_23999() {
      return this.field_26878.isInboundDone();
   }

   @Override
   public boolean isOpen() {
      return this.field_26889.isOpen();
   }

   @Override
   public boolean method_17469() {
      return this.field_26883.hasRemaining() || !this.method_24002();
   }

   @Override
   public void method_17471() throws IOException {
      this.write(this.field_26883);
   }

   @Override
   public boolean method_17472() {
      return this.field_26886.hasRemaining()
         || this.field_26877.hasRemaining() && this.field_26888.getStatus() != Status.BUFFER_UNDERFLOW && this.field_26888.getStatus() != Status.CLOSED;
   }

   @Override
   public int method_17470(ByteBuffer var1) throws SSLException {
      return this.method_24006(var1);
   }

   private int method_24001(ByteBuffer var1, ByteBuffer var2) {
      int var5 = var1.remaining();
      int var6 = var2.remaining();
      if (var5 <= var6) {
         var2.put(var1);
         return var5;
      } else {
         int var7 = Math.min(var5, var6);

         for (int var8 = 0; var8 < var7; var8++) {
            var2.put(var1.get());
         }

         return var7;
      }
   }

   @Override
   public boolean method_17473() {
      return this.field_26889.isBlocking();
   }
}
