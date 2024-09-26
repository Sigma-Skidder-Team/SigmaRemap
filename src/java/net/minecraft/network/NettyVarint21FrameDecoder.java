package net.minecraft.network;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.CorruptedFrameException;

import java.util.List;

public class NettyVarint21FrameDecoder extends ByteToMessageDecoder {
   public void decode(ChannelHandlerContext var1, ByteBuf var2, List<Object> var3) throws Exception {
      var2.markReaderIndex();
      byte[] var6 = new byte[3];

      for (int var7 = 0; var7 < var6.length; var7++) {
         if (!var2.isReadable()) {
            var2.resetReaderIndex();
            return;
         }

         var6[var7] = var2.readByte();
         if (var6[var7] >= 0) {
            PacketBuffer var8 = new PacketBuffer(Unpooled.wrappedBuffer(var6));

            try {
               int var9 = var8.readVarInt();
               if (var2.readableBytes() < var9) {
                  var2.resetReaderIndex();
                  return;
               }

               var3.add(var2.readBytes(var9));
            } finally {
               var8.release();
            }

            return;
         }
      }

      throw new CorruptedFrameException("length wider than 21-bit");
   }
}
