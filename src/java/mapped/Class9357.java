package mapped;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import javax.crypto.Cipher;

public class Class9357 extends MessageToByteEncoder<ByteBuf> {
   private final Class9382 field43425;

   public Class9357(Cipher var1) {
      this.field43425 = new Class9382(var1);
   }

   public void encode(ChannelHandlerContext var1, ByteBuf var2, ByteBuf var3) throws Exception {
      this.field43425.method35609(var2, var3);
   }
}
