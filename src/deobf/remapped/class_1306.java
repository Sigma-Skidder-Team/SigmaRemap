package remapped;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import javax.crypto.Cipher;

public class class_1306 extends MessageToMessageDecoder<ByteBuf> {
   private static String[] field_7222;
   private final class_8167 field_7223;

   public class_1306(Cipher var1) {
      this.field_7223 = new class_8167(var1);
   }

   public void decode(ChannelHandlerContext var1, ByteBuf var2, List<Object> var3) throws Exception {
      var3.add(this.field_7223.method_37459(var1, var2));
   }
}
