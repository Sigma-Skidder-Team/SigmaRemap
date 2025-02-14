package mapped;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.DecoderException;
import net.minecraft.network.PacketBuffer;

import java.util.List;
import java.util.zip.Inflater;

public class NettyCompressionDecoder extends ByteToMessageDecoder {
   private final Inflater field33817;
   private int field33818;

   public NettyCompressionDecoder(int var1) {
      this.field33818 = var1;
      this.field33817 = new Inflater();
   }

   public void decode(ChannelHandlerContext var1, ByteBuf var2, List<Object> var3) throws Exception {
      if (var2.readableBytes() != 0) {
         PacketBuffer var6 = new PacketBuffer(var2);
         int var7 = var6.readVarInt();
         if (var7 != 0) {
            if (var7 < this.field33818) {
               throw new DecoderException("Badly compressed packet - size of " + var7 + " is below server threshold of " + this.field33818);
            }

            if (var7 > 2097152) {
               throw new DecoderException("Badly compressed packet - size of " + var7 + " is larger than protocol maximum of " + 2097152);
            }

            byte[] var8 = new byte[var6.readableBytes()];
            var6.readBytes(var8);
            this.field33817.setInput(var8);
            byte[] var9 = new byte[var7];
            this.field33817.inflate(var9);
            var3.add(Unpooled.wrappedBuffer(var9));
            this.field33817.reset();
         } else {
            var3.add(var6.readBytes(var6.readableBytes()));
         }
      }
   }

   public void setCompressionThreshold(int var1) {
      this.field33818 = var1;
   }
}
