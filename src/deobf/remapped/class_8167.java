package remapped;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;

public class class_8167 {
   private static String[] field_41831;
   private final Cipher field_41834;
   private byte[] field_41833 = new byte[0];
   private byte[] field_41832 = new byte[0];

   public class_8167(Cipher var1) {
      this.field_41834 = var1;
   }

   private byte[] method_37462(ByteBuf var1) {
      int var4 = var1.readableBytes();
      if (this.field_41833.length < var4) {
         this.field_41833 = new byte[var4];
      }

      var1.readBytes(this.field_41833, 0, var4);
      return this.field_41833;
   }

   public ByteBuf method_37459(ChannelHandlerContext var1, ByteBuf var2) throws ShortBufferException {
      int var5 = var2.readableBytes();
      byte[] var6 = this.method_37462(var2);
      ByteBuf var7 = var1.alloc().heapBuffer(this.field_41834.getOutputSize(var5));
      var7.writerIndex(this.field_41834.update(var6, 0, var5, var7.array(), var7.arrayOffset()));
      return var7;
   }

   public void method_37460(ByteBuf var1, ByteBuf var2) throws ShortBufferException {
      int var5 = var1.readableBytes();
      byte[] var6 = this.method_37462(var1);
      int var7 = this.field_41834.getOutputSize(var5);
      if (this.field_41832.length < var7) {
         this.field_41832 = new byte[var7];
      }

      var2.writeBytes(this.field_41832, 0, this.field_41834.update(var6, 0, var5, this.field_41832));
   }
}
