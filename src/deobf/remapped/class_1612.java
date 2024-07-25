package remapped;

import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLEngineResult.HandshakeStatus;

public class class_1612 implements class_3775, ByteChannel {
   private final SocketChannel field_8366;
   private final SSLEngine field_8371;
   private ByteBuffer field_8367;
   private ByteBuffer field_8369;
   private ByteBuffer field_8364;
   private ByteBuffer field_8368;
   private ExecutorService field_8365;

   public class_1612(SocketChannel var1, SSLEngine var2, ExecutorService var3, SelectionKey var4) throws IOException {
      if (var1 != null && var2 != null && this.field_8365 != var3) {
         this.field_8366 = var1;
         this.field_8371 = var2;
         this.field_8365 = var3;
         this.field_8369 = ByteBuffer.allocate(this.field_8371.getSession().getPacketBufferSize());
         this.field_8368 = ByteBuffer.allocate(this.field_8371.getSession().getPacketBufferSize());
         this.field_8371.beginHandshake();
         if (this.method_7193()) {
            if (var4 != null) {
               var4.interestOps(var4.interestOps() | 4);
            }
         } else {
            try {
               this.field_8366.close();
            } catch (IOException var8) {
               var8.printStackTrace();
            }
         }
      } else {
         throw new IllegalArgumentException("parameter must not be null");
      }
   }

   @Override
   public synchronized int read(ByteBuffer var1) throws IOException {
      if (!var1.hasRemaining()) {
         return 0;
      } else if (this.field_8364.hasRemaining()) {
         ((Buffer)this.field_8364).flip();
         return class_7476.method_33997(this.field_8364, var1);
      } else {
         this.field_8368.compact();
         int var4 = this.field_8366.read(this.field_8368);
         if (var4 > 0 || this.field_8368.hasRemaining()) {
            ((Buffer)this.field_8368).flip();
            if (this.field_8368.hasRemaining()) {
               this.field_8364.compact();

               SSLEngineResult var5;
               try {
                  var5 = this.field_8371.unwrap(this.field_8368, this.field_8364);
               } catch (SSLException var7) {
                  var7.printStackTrace();
                  throw var7;
               }

               switch (var5.getStatus()) {
                  case OK:
                     ((Buffer)this.field_8364).flip();
                     return class_7476.method_33997(this.field_8364, var1);
                  case BUFFER_UNDERFLOW:
                     ((Buffer)this.field_8364).flip();
                     return class_7476.method_33997(this.field_8364, var1);
                  case BUFFER_OVERFLOW:
                     this.field_8364 = this.method_7194(this.field_8364);
                     return this.read(var1);
                  case CLOSED:
                     this.method_7195();
                     ((Buffer)var1).clear();
                     return -1;
                  default:
                     throw new IllegalStateException("Invalid SSL status: " + var5.getStatus());
               }
            }
         } else if (var4 < 0) {
            this.method_7198();
         }

         class_7476.method_33997(this.field_8364, var1);
         return var4;
      }
   }

   @Override
   public synchronized int write(ByteBuffer var1) throws IOException {
      int var4 = 0;

      while (var1.hasRemaining()) {
         ((Buffer)this.field_8369).clear();
         SSLEngineResult var5 = this.field_8371.wrap(var1, this.field_8369);
         switch (var5.getStatus()) {
            case OK:
               ((Buffer)this.field_8369).flip();

               while (this.field_8369.hasRemaining()) {
                  var4 += this.field_8366.write(this.field_8369);
               }
               break;
            case BUFFER_UNDERFLOW:
               throw new SSLException("Buffer underflow occured after a wrap. I don't think we should ever get here.");
            case BUFFER_OVERFLOW:
               this.field_8369 = this.method_7200(this.field_8369);
               break;
            case CLOSED:
               this.method_7195();
               return 0;
            default:
               throw new IllegalStateException("Invalid SSL status: " + var5.getStatus());
         }
      }

      return var4;
   }

   private boolean method_7193() throws IOException {
      int var3 = this.field_8371.getSession().getApplicationBufferSize();
      this.field_8367 = ByteBuffer.allocate(var3);
      this.field_8364 = ByteBuffer.allocate(var3);
      ((Buffer)this.field_8369).clear();
      ((Buffer)this.field_8368).clear();
      HandshakeStatus var4 = this.field_8371.getHandshakeStatus();
      boolean var5 = false;

      label133:
      while (!var5) {
         switch (var4) {
            case FINISHED:
               var5 = !this.field_8368.hasRemaining();
               if (var5) {
                  return true;
               }

               this.field_8366.write(this.field_8368);
               break;
            case NEED_UNWRAP:
               if (this.field_8366.read(this.field_8368) < 0) {
                  if (this.field_8371.isInboundDone() && this.field_8371.isOutboundDone()) {
                     return false;
                  }

                  try {
                     this.field_8371.closeInbound();
                  } catch (SSLException var8) {
                  }

                  this.field_8371.closeOutbound();
                  var4 = this.field_8371.getHandshakeStatus();
                  break;
               } else {
                  ((Buffer)this.field_8368).flip();

                  SSLEngineResult var12;
                  try {
                     var12 = this.field_8371.unwrap(this.field_8368, this.field_8364);
                     this.field_8368.compact();
                     var4 = var12.getHandshakeStatus();
                  } catch (SSLException var10) {
                     this.field_8371.closeOutbound();
                     var4 = this.field_8371.getHandshakeStatus();
                     break;
                  }

                  switch (var12.getStatus()) {
                     case OK:
                        continue;
                     case BUFFER_UNDERFLOW:
                        this.field_8368 = this.method_7196(this.field_8368);
                        continue;
                     case BUFFER_OVERFLOW:
                        this.field_8364 = this.method_7194(this.field_8364);
                        continue;
                     case CLOSED:
                        if (this.field_8371.isOutboundDone()) {
                           return false;
                        }

                        this.field_8371.closeOutbound();
                        var4 = this.field_8371.getHandshakeStatus();
                        continue;
                     default:
                        throw new IllegalStateException("Invalid SSL status: " + var12.getStatus());
                  }
               }
            case NEED_WRAP:
               ((Buffer)this.field_8369).clear();

               SSLEngineResult var7;
               try {
                  var7 = this.field_8371.wrap(this.field_8367, this.field_8369);
                  var4 = var7.getHandshakeStatus();
               } catch (SSLException var9) {
                  this.field_8371.closeOutbound();
                  var4 = this.field_8371.getHandshakeStatus();
                  break;
               }

               switch (var7.getStatus()) {
                  case OK:
                     ((Buffer)this.field_8369).flip();

                     while (true) {
                        if (!this.field_8369.hasRemaining()) {
                           continue label133;
                        }

                        this.field_8366.write(this.field_8369);
                     }
                  case BUFFER_UNDERFLOW:
                     throw new SSLException("Buffer underflow occured after a wrap. I don't think we should ever get here.");
                  case BUFFER_OVERFLOW:
                     this.field_8369 = this.method_7200(this.field_8369);
                     continue;
                  case CLOSED:
                     try {
                        ((Buffer)this.field_8369).flip();

                        while (this.field_8369.hasRemaining()) {
                           this.field_8366.write(this.field_8369);
                        }

                        ((Buffer)this.field_8368).clear();
                     } catch (Exception var11) {
                        var4 = this.field_8371.getHandshakeStatus();
                     }
                     continue;
                  default:
                     throw new IllegalStateException("Invalid SSL status: " + var7.getStatus());
               }
            case NEED_TASK:
               Runnable var6;
               while ((var6 = this.field_8371.getDelegatedTask()) != null) {
                  this.field_8365.execute(var6);
               }

               var4 = this.field_8371.getHandshakeStatus();
            case NOT_HANDSHAKING:
               break;
            default:
               throw new IllegalStateException("Invalid SSL status: " + var4);
         }
      }

      return true;
   }

   private ByteBuffer method_7200(ByteBuffer var1) {
      return this.method_7197(var1, this.field_8371.getSession().getPacketBufferSize());
   }

   private ByteBuffer method_7194(ByteBuffer var1) {
      return this.method_7197(var1, this.field_8371.getSession().getApplicationBufferSize());
   }

   private ByteBuffer method_7197(ByteBuffer var1, int var2) {
      if (var2 <= var1.capacity()) {
         var1 = ByteBuffer.allocate(var1.capacity() * 2);
      } else {
         var1 = ByteBuffer.allocate(var2);
      }

      return var1;
   }

   private ByteBuffer method_7196(ByteBuffer var1) {
      if (this.field_8371.getSession().getPacketBufferSize() >= var1.limit()) {
         ByteBuffer var4 = this.method_7200(var1);
         ((Buffer)var1).flip();
         var4.put(var1);
         return var4;
      } else {
         return var1;
      }
   }

   private void method_7195() throws IOException {
      this.field_8371.closeOutbound();

      try {
         this.method_7193();
      } catch (IOException var4) {
      }

      this.field_8366.close();
   }

   private void method_7198() throws IOException {
      try {
         this.field_8371.closeInbound();
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      this.method_7195();
   }

   @Override
   public boolean method_17469() {
      return false;
   }

   @Override
   public void method_17471() throws IOException {
   }

   @Override
   public boolean method_17472() {
      return this.field_8368.hasRemaining() || this.field_8364.hasRemaining();
   }

   @Override
   public int method_17470(ByteBuffer var1) throws IOException {
      return this.read(var1);
   }

   @Override
   public boolean method_17473() {
      return this.field_8366.isBlocking();
   }

   @Override
   public boolean isOpen() {
      return this.field_8366.isOpen();
   }

   @Override
   public void close() throws IOException {
      this.method_7195();
   }
}
