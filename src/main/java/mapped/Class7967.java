package mapped;

import com.google.common.collect.Iterables;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import java.nio.charset.StandardCharsets;

import net.minecraft.client.network.ServerPinger;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.StringTextComponent;

public class Class7967 extends SimpleChannelInboundHandler<ByteBuf> {
   public final Class7272 field34256;

   public Class7967(Class7272 var1) {
      this.field34256 = var1;
   }

   public void channelActive(ChannelHandlerContext var1) throws Exception {
      super.channelActive(var1);
      ByteBuf var4 = Unpooled.buffer();

      try {
         var4.writeByte(254);
         var4.writeByte(1);
         var4.writeByte(250);
         char[] var5 = "MC|PingHost".toCharArray();
         var4.writeShort(var5.length);

         for (char var9 : var5) {
            var4.writeChar(var9);
         }

         var4.writeShort(7 + 2 * this.field34256.field31195.method35572().length());
         var4.writeByte(127);
         var5 = this.field34256.field31195.method35572().toCharArray();
         var4.writeShort(var5.length);

         for (char var17 : var5) {
            var4.writeChar(var17);
         }

         var4.writeInt(this.field34256.field31195.method35573());
         var1.channel().writeAndFlush(var4).addListener(ChannelFutureListener.CLOSE_ON_FAILURE);
      } finally {
         var4.release();
      }
   }

   public void channelRead0(ChannelHandlerContext var1, ByteBuf var2) throws Exception {
      short var5 = var2.readUnsignedByte();
      if (var5 == 255) {
         String var6 = new String(var2.readBytes(var2.readShort() * 2).array(), StandardCharsets.UTF_16BE);
         String[] var7 = (String[])Iterables.toArray(ServerPinger.method34011().split(var6), String.class);
         if ("§1".equals(var7[0])) {
            int var8 = MathHelper.method37799(var7[1], 0);
            String var9 = var7[2];
            String var10 = var7[3];
            int var11 = MathHelper.method37799(var7[4], -1);
            int var12 = MathHelper.method37799(var7[5], -1);
            this.field34256.field31196.field33193 = -1;
            this.field34256.field31196.field33194 = new StringTextComponent(var9);
            this.field34256.field31196.serverMOTD = new StringTextComponent(var10);
            this.field34256.field31196.populationInfo = ServerPinger.method34008(var11, var12);
         }
      }

      var1.close();
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) throws Exception {
      var1.close();
   }
}
