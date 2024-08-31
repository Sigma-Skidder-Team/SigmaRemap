package mapped;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import net.minecraft.network.PacketBuffer;

import java.util.zip.Deflater;

public class Class8546 extends MessageToByteEncoder<ByteBuf> {
   private static String[] field38413;
   private final byte[] field38414 = new byte[8192];
   private final Deflater field38415;
   private int field38416;

   public Class8546(int var1) {
      this.field38416 = var1;
      this.field38415 = new Deflater();
   }

   public void encode(ChannelHandlerContext var1, ByteBuf var2, ByteBuf var3) throws Exception {
      int var6 = var2.readableBytes();
      PacketBuffer var7 = new PacketBuffer(var3);
      if (var6 >= this.field38416) {
         byte[] var8 = new byte[var6];
         var2.readBytes(var8);
         var7.writeVarInt(var8.length);
         this.field38415.setInput(var8, 0, var6);
         this.field38415.finish();

         while (!this.field38415.finished()) {
            int var9 = this.field38415.deflate(this.field38414);
            var7.writeBytes(this.field38414, 0, var9);
         }

         this.field38415.reset();
      } else {
         var7.writeVarInt(0);
         var7.writeBytes(var2);
      }
   }

   public void method30445(int var1) {
      this.field38416 = var1;
   }
}
