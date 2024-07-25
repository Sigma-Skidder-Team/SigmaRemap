package remapped;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import javax.crypto.Cipher;

public class class_8066 extends MessageToByteEncoder<ByteBuf> {
   private static String[] field_41276;
   private final class_8167 field_41275;

   public class_8066(Cipher var1) {
      this.field_41275 = new class_8167(var1);
   }

   public void encode(ChannelHandlerContext var1, ByteBuf var2, ByteBuf var3) throws Exception {
      this.field_41275.method_37460(var2, var3);
   }
}
