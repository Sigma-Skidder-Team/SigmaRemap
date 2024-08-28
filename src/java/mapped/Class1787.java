package mapped;

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

public class Class1787 implements Class1788, ByteChannel {
   private final SocketChannel field9637;
   private final SSLEngine field9638;
   private ByteBuffer field9639;
   private ByteBuffer field9640;
   private ByteBuffer field9641;
   private ByteBuffer field9642;
   private ExecutorService field9643;

   public Class1787(SocketChannel var1, SSLEngine var2, ExecutorService var3, SelectionKey var4) throws IOException {
      if (var1 != null && var2 != null && this.field9643 != var3) {
         this.field9637 = var1;
         this.field9638 = var2;
         this.field9643 = var3;
         this.field9640 = ByteBuffer.allocate(this.field9638.getSession().getPacketBufferSize());
         this.field9642 = ByteBuffer.allocate(this.field9638.getSession().getPacketBufferSize());
         this.field9638.beginHandshake();
         if (this.method7786()) {
            if (var4 != null) {
               var4.interestOps(var4.interestOps() | 4);
            }
         } else {
            try {
               this.field9637.close();
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
      } else if (this.field9641.hasRemaining()) {
         ((Buffer)this.field9641).flip();
         return Class9209.method34508(this.field9641, var1);
      } else {
         this.field9642.compact();
         int var4 = this.field9637.read(this.field9642);
         if (var4 > 0 || this.field9642.hasRemaining()) {
            ((Buffer)this.field9642).flip();
            if (this.field9642.hasRemaining()) {
               this.field9641.compact();

               SSLEngineResult var5;
               try {
                  var5 = this.field9638.unwrap(this.field9642, this.field9641);
               } catch (SSLException var7) {
                  var7.printStackTrace();
                  throw var7;
               }

               switch (Class7494.field32197[var5.getStatus().ordinal()]) {
                  case 1:
                     ((Buffer)this.field9641).flip();
                     return Class9209.method34508(this.field9641, var1);
                  case 2:
                     ((Buffer)this.field9641).flip();
                     return Class9209.method34508(this.field9641, var1);
                  case 3:
                     this.field9641 = this.method7788(this.field9641);
                     return this.read(var1);
                  case 4:
                     this.method7791();
                     ((Buffer)var1).clear();
                     return -1;
                  default:
                     throw new IllegalStateException("Invalid SSL status: " + var5.getStatus());
               }
            }
         } else if (var4 < 0) {
            this.method7792();
         }

         Class9209.method34508(this.field9641, var1);
         return var4;
      }
   }

   @Override
   public synchronized int write(ByteBuffer var1) throws IOException {
      int var4 = 0;

      while (var1.hasRemaining()) {
         ((Buffer)this.field9640).clear();
         SSLEngineResult var5 = this.field9638.wrap(var1, this.field9640);
         switch (Class7494.field32197[var5.getStatus().ordinal()]) {
            case 1:
               ((Buffer)this.field9640).flip();

               while (this.field9640.hasRemaining()) {
                  var4 += this.field9637.write(this.field9640);
               }
               break;
            case 2:
               throw new SSLException("Buffer underflow occured after a wrap. I don't think we should ever get here.");
            case 3:
               this.field9640 = this.method7787(this.field9640);
               break;
            case 4:
               this.method7791();
               return 0;
            default:
               throw new IllegalStateException("Invalid SSL status: " + var5.getStatus());
         }
      }

      return var4;
   }

   private boolean method7786() throws IOException {
      int var3 = this.field9638.getSession().getApplicationBufferSize();
      this.field9639 = ByteBuffer.allocate(var3);
      this.field9641 = ByteBuffer.allocate(var3);
      ((Buffer)this.field9640).clear();
      ((Buffer)this.field9642).clear();
      HandshakeStatus var4 = this.field9638.getHandshakeStatus();
      boolean var5 = false;

      label133:
      while (!var5) {
         switch (Class7494.field32198[var4.ordinal()]) {
            case 1:
               var5 = !this.field9642.hasRemaining();
               if (var5) {
                  return true;
               }

               this.field9637.write(this.field9642);
               break;
            case 2:
               if (this.field9637.read(this.field9642) < 0) {
                  if (this.field9638.isInboundDone() && this.field9638.isOutboundDone()) {
                     return false;
                  }

                  try {
                     this.field9638.closeInbound();
                  } catch (SSLException var8) {
                  }

                  this.field9638.closeOutbound();
                  var4 = this.field9638.getHandshakeStatus();
                  break;
               } else {
                  ((Buffer)this.field9642).flip();

                  SSLEngineResult var12;
                  try {
                     var12 = this.field9638.unwrap(this.field9642, this.field9641);
                     this.field9642.compact();
                     var4 = var12.getHandshakeStatus();
                  } catch (SSLException var10) {
                     this.field9638.closeOutbound();
                     var4 = this.field9638.getHandshakeStatus();
                     break;
                  }

                  switch (Class7494.field32197[var12.getStatus().ordinal()]) {
                     case 1:
                        continue;
                     case 2:
                        this.field9642 = this.method7790(this.field9642);
                        continue;
                     case 3:
                        this.field9641 = this.method7788(this.field9641);
                        continue;
                     case 4:
                        if (this.field9638.isOutboundDone()) {
                           return false;
                        }

                        this.field9638.closeOutbound();
                        var4 = this.field9638.getHandshakeStatus();
                        continue;
                     default:
                        throw new IllegalStateException("Invalid SSL status: " + var12.getStatus());
                  }
               }
            case 3:
               ((Buffer)this.field9640).clear();

               SSLEngineResult var7;
               try {
                  var7 = this.field9638.wrap(this.field9639, this.field9640);
                  var4 = var7.getHandshakeStatus();
               } catch (SSLException var9) {
                  this.field9638.closeOutbound();
                  var4 = this.field9638.getHandshakeStatus();
                  break;
               }

               switch (Class7494.field32197[var7.getStatus().ordinal()]) {
                  case 1:
                     ((Buffer)this.field9640).flip();

                     while (true) {
                        if (!this.field9640.hasRemaining()) {
                           continue label133;
                        }

                        this.field9637.write(this.field9640);
                     }
                  case 2:
                     throw new SSLException("Buffer underflow occured after a wrap. I don't think we should ever get here.");
                  case 3:
                     this.field9640 = this.method7787(this.field9640);
                     continue;
                  case 4:
                     try {
                        ((Buffer)this.field9640).flip();

                        while (this.field9640.hasRemaining()) {
                           this.field9637.write(this.field9640);
                        }

                        ((Buffer)this.field9642).clear();
                     } catch (Exception var11) {
                        var4 = this.field9638.getHandshakeStatus();
                     }
                     continue;
                  default:
                     throw new IllegalStateException("Invalid SSL status: " + var7.getStatus());
               }
            case 4:
               Runnable var6;
               while ((var6 = this.field9638.getDelegatedTask()) != null) {
                  this.field9643.execute(var6);
               }

               var4 = this.field9638.getHandshakeStatus();
            case 5:
               break;
            default:
               throw new IllegalStateException("Invalid SSL status: " + var4);
         }
      }

      return true;
   }

   private ByteBuffer method7787(ByteBuffer var1) {
      return this.method7789(var1, this.field9638.getSession().getPacketBufferSize());
   }

   private ByteBuffer method7788(ByteBuffer var1) {
      return this.method7789(var1, this.field9638.getSession().getApplicationBufferSize());
   }

   private ByteBuffer method7789(ByteBuffer var1, int var2) {
      if (var2 <= var1.capacity()) {
         var1 = ByteBuffer.allocate(var1.capacity() * 2);
      } else {
         var1 = ByteBuffer.allocate(var2);
      }

      return var1;
   }

   private ByteBuffer method7790(ByteBuffer var1) {
      if (this.field9638.getSession().getPacketBufferSize() >= var1.limit()) {
         ByteBuffer var4 = this.method7787(var1);
         ((Buffer)var1).flip();
         var4.put(var1);
         return var4;
      } else {
         return var1;
      }
   }

   private void method7791() throws IOException {
      this.field9638.closeOutbound();

      try {
         this.method7786();
      } catch (IOException var4) {
      }

      this.field9637.close();
   }

   private void method7792() throws IOException {
      try {
         this.field9638.closeInbound();
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      this.method7791();
   }

   @Override
   public boolean method7793() {
      return false;
   }

   @Override
   public void method7794() throws IOException {
   }

   @Override
   public boolean method7795() {
      return this.field9642.hasRemaining() || this.field9641.hasRemaining();
   }

   @Override
   public int method7796(ByteBuffer var1) throws IOException {
      return this.read(var1);
   }

   @Override
   public boolean method7797() {
      return this.field9637.isBlocking();
   }

   @Override
   public boolean isOpen() {
      return this.field9637.isOpen();
   }

   @Override
   public void close() throws IOException {
      this.method7791();
   }
}
