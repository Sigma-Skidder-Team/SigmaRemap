package mapped;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.handler.codec.MessageToByteEncoder;

@Sharable
public class Class8577 extends MessageToByteEncoder<ByteBuf> {
   public void encode(ChannelHandlerContext var1, ByteBuf var2, ByteBuf var3) throws Exception {
      int var6 = var2.readableBytes();
      int var7 = PacketBuffer.method35695(var6);
      if (var7 <= 3) {
         PacketBuffer var8 = new PacketBuffer(var3);
         var8.ensureWritable(var7 + var6);
         var8.writeVarInt(var6);
         var8.writeBytes(var2, var2.readerIndex(), var6);
      } else {
         throw new IllegalArgumentException("unable to fit " + var6 + " into " + 3);
      }
   }
}
