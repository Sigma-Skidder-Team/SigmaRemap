package mapped;

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

public class Class1790 implements ByteChannel, Class1788 {
   public static ByteBuffer field9646 = ByteBuffer.allocate(0);
   public ExecutorService field9647;
   public List<Future<?>> field9648;
   public ByteBuffer field9649;
   public ByteBuffer field9650;
   public ByteBuffer field9651;
   public SocketChannel field9652;
   public SelectionKey field9653;
   public SSLEngine field9654;
   public SSLEngineResult field9655;
   public SSLEngineResult field9656;
   public int field9657 = 0;
   public static final boolean field9658 = !Class1790.class.desiredAssertionStatus();

   public Class1790(SocketChannel var1, SSLEngine var2, ExecutorService var3, SelectionKey var4) throws IOException {
      if (var1 != null && var2 != null && var3 != null) {
         this.field9652 = var1;
         this.field9654 = var2;
         this.field9647 = var3;
         this.field9655 = this.field9656 = new SSLEngineResult(Status.BUFFER_UNDERFLOW, var2.getHandshakeStatus(), 0, 0);
         this.field9648 = new ArrayList<Future<?>>(3);
         if (var4 != null) {
            var4.interestOps(var4.interestOps() | 4);
            this.field9653 = var4;
         }

         this.method7803(var2.getSession());
         this.field9652.write(this.method7800(field9646));
         this.method7799();
      } else {
         throw new IllegalArgumentException("parameter must not be null");
      }
   }

   private void method7798(Future<?> var1) {
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

   private synchronized void method7799() throws IOException {
      if (this.field9654.getHandshakeStatus() != HandshakeStatus.NOT_HANDSHAKING) {
         if (!this.field9648.isEmpty()) {
            Iterator var3 = this.field9648.iterator();

            while (var3.hasNext()) {
               Future var4 = (Future)var3.next();
               if (!var4.isDone()) {
                  if (this.method7797()) {
                     this.method7798(var4);
                  }

                  return;
               }

               var3.remove();
            }
         }

         if (this.field9654.getHandshakeStatus() == HandshakeStatus.NEED_UNWRAP) {
            if (!this.method7797() || this.field9655.getStatus() == Status.BUFFER_UNDERFLOW) {
               this.field9651.compact();
               int var5 = this.field9652.read(this.field9651);
               if (var5 == -1) {
                  throw new IOException("connection closed unexpectedly by peer");
               }

               ((Buffer)this.field9651).flip();
            }

            this.field9649.compact();
            this.method7801();
            if (this.field9655.getHandshakeStatus() == HandshakeStatus.FINISHED) {
               this.method7803(this.field9654.getSession());
               return;
            }
         }

         this.method7802();
         if (this.field9648.isEmpty() || this.field9654.getHandshakeStatus() == HandshakeStatus.NEED_WRAP) {
            this.field9652.write(this.method7800(field9646));
            if (this.field9656.getHandshakeStatus() == HandshakeStatus.FINISHED) {
               this.method7803(this.field9654.getSession());
               return;
            }
         }

         if (!field9658 && this.field9654.getHandshakeStatus() == HandshakeStatus.NOT_HANDSHAKING) {
            throw new AssertionError();
         } else {
            this.field9657 = 1;
         }
      }
   }

   private synchronized ByteBuffer method7800(ByteBuffer var1) throws SSLException {
      this.field9650.compact();
      this.field9656 = this.field9654.wrap(var1, this.field9650);
      ((Buffer)this.field9650).flip();
      return this.field9650;
   }

   private synchronized ByteBuffer method7801() throws SSLException {
      if (this.field9655.getStatus() == Status.CLOSED && this.field9654.getHandshakeStatus() == HandshakeStatus.NOT_HANDSHAKING) {
         try {
            this.close();
         } catch (IOException var5) {
         }
      }

      int var4;
      do {
         var4 = this.field9649.remaining();
         this.field9655 = this.field9654.unwrap(this.field9651, this.field9649);
      } while (
         this.field9655.getStatus() == Status.OK && (var4 != this.field9649.remaining() || this.field9654.getHandshakeStatus() == HandshakeStatus.NEED_UNWRAP)
      );

      ((Buffer)this.field9649).flip();
      return this.field9649;
   }

   public void method7802() {
      Runnable var3;
      while ((var3 = this.field9654.getDelegatedTask()) != null) {
         this.field9648.add(this.field9647.submit(var3));
      }
   }

   public void method7803(SSLSession var1) {
      int var4 = var1.getPacketBufferSize();
      int var5 = Math.max(var1.getApplicationBufferSize(), var4);
      if (this.field9649 != null) {
         if (this.field9649.capacity() != var5) {
            this.field9649 = ByteBuffer.allocate(var5);
         }

         if (this.field9650.capacity() != var4) {
            this.field9650 = ByteBuffer.allocate(var4);
         }

         if (this.field9651.capacity() != var4) {
            this.field9651 = ByteBuffer.allocate(var4);
         }
      } else {
         this.field9649 = ByteBuffer.allocate(var5);
         this.field9650 = ByteBuffer.allocate(var4);
         this.field9651 = ByteBuffer.allocate(var4);
      }

      ((Buffer)this.field9649).rewind();
      ((Buffer)this.field9649).flip();
      ((Buffer)this.field9651).rewind();
      ((Buffer)this.field9651).flip();
      ((Buffer)this.field9650).rewind();
      ((Buffer)this.field9650).flip();
      this.field9657++;
   }

   @Override
   public int write(ByteBuffer var1) throws IOException {
      if (this.method7806()) {
         int var4 = this.field9652.write(this.method7800(var1));
         if (this.field9656.getStatus() != Status.CLOSED) {
            return var4;
         } else {
            throw new EOFException("Connection is closed");
         }
      } else {
         this.method7799();
         return 0;
      }
   }

   @Override
   public int read(ByteBuffer var1) throws IOException {
      while (var1.hasRemaining()) {
         if (!this.method7806()) {
            if (!this.method7797()) {
               this.method7799();
               if (!this.method7806()) {
                  return 0;
               }
            } else {
               while (!this.method7806()) {
                  this.method7799();
               }
            }
         }

         int var4 = this.method7804(var1);
         if (var4 != 0) {
            return var4;
         }

         if (!field9658 && this.field9649.position() != 0) {
            throw new AssertionError();
         }

         ((Buffer)this.field9649).clear();
         if (this.field9651.hasRemaining()) {
            this.field9651.compact();
         } else {
            ((Buffer)this.field9651).clear();
         }

         if ((this.method7797() || this.field9655.getStatus() == Status.BUFFER_UNDERFLOW) && this.field9652.read(this.field9651) == -1) {
            return -1;
         }

         ((Buffer)this.field9651).flip();
         this.method7801();
         int var5 = this.method7812(this.field9649, var1);
         if (var5 != 0 || !this.method7797()) {
            return var5;
         }
      }

      return 0;
   }

   private int method7804(ByteBuffer var1) throws SSLException {
      if (!this.field9649.hasRemaining()) {
         if (!this.field9649.hasRemaining()) {
            ((Buffer)this.field9649).clear();
         }

         if (this.field9651.hasRemaining()) {
            this.method7801();
            int var4 = this.method7812(this.field9649, var1);
            if (this.field9655.getStatus() == Status.CLOSED) {
               return -1;
            }

            if (var4 > 0) {
               return var4;
            }
         }

         return 0;
      } else {
         return this.method7812(this.field9649, var1);
      }
   }

   public boolean method7805() {
      return this.field9652.isConnected();
   }

   @Override
   public void close() throws IOException {
      this.field9654.closeOutbound();
      this.field9654.getSession().invalidate();
      if (this.field9652.isOpen()) {
         this.field9652.write(this.method7800(field9646));
      }

      this.field9652.close();
   }

   private boolean method7806() {
      HandshakeStatus var3 = this.field9654.getHandshakeStatus();
      return var3 == HandshakeStatus.FINISHED || var3 == HandshakeStatus.NOT_HANDSHAKING;
   }

   public SelectableChannel method7807(boolean var1) throws IOException {
      return this.field9652.configureBlocking(var1);
   }

   public boolean method7808(SocketAddress var1) throws IOException {
      return this.field9652.connect(var1);
   }

   public boolean method7809() throws IOException {
      return this.field9652.finishConnect();
   }

   public Socket method7810() {
      return this.field9652.socket();
   }

   public boolean method7811() {
      return this.field9654.isInboundDone();
   }

   @Override
   public boolean isOpen() {
      return this.field9652.isOpen();
   }

   @Override
   public boolean method7793() {
      return this.field9650.hasRemaining() || !this.method7806();
   }

   @Override
   public void method7794() throws IOException {
      this.write(this.field9650);
   }

   @Override
   public boolean method7795() {
      return this.field9649.hasRemaining()
         || this.field9651.hasRemaining() && this.field9655.getStatus() != Status.BUFFER_UNDERFLOW && this.field9655.getStatus() != Status.CLOSED;
   }

   @Override
   public int method7796(ByteBuffer var1) throws SSLException {
      return this.method7804(var1);
   }

   private int method7812(ByteBuffer var1, ByteBuffer var2) {
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
   public boolean method7797() {
      return this.field9652.isBlocking();
   }
}
