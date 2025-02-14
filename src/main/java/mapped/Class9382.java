package mapped;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;

public class Class9382 {
   private final Cipher field43530;
   private byte[] field43531 = new byte[0];
   private byte[] field43532 = new byte[0];

   public Class9382(Cipher var1) {
      this.field43530 = var1;
   }

   private byte[] method35607(ByteBuf var1) {
      int var4 = var1.readableBytes();
      if (this.field43531.length < var4) {
         this.field43531 = new byte[var4];
      }

      var1.readBytes(this.field43531, 0, var4);
      return this.field43531;
   }

   public ByteBuf method35608(ChannelHandlerContext var1, ByteBuf var2) throws ShortBufferException {
      int var5 = var2.readableBytes();
      byte[] var6 = this.method35607(var2);
      ByteBuf var7 = var1.alloc().heapBuffer(this.field43530.getOutputSize(var5));
      var7.writerIndex(this.field43530.update(var6, 0, var5, var7.array(), var7.arrayOffset()));
      return var7;
   }

   public void method35609(ByteBuf var1, ByteBuf var2) throws ShortBufferException {
      int var5 = var1.readableBytes();
      byte[] var6 = this.method35607(var1);
      int var7 = this.field43530.getOutputSize(var5);
      if (this.field43532.length < var7) {
         this.field43532 = new byte[var7];
      }

      var2.writeBytes(this.field43532, 0, this.field43530.update(var6, 0, var5, this.field43532));
   }
}
