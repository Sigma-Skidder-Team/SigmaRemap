package net.minecraft.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class NettyPacketEncoder extends MessageToByteEncoder<IPacket<?>> {
   private static final Logger field24933 = LogManager.getLogger();
   private static final Marker field24934 = MarkerManager.getMarker("PACKET_SENT", NetworkManager.NETWORK_PACKETS_MARKER);
   private final PacketDirection field24935;

   public NettyPacketEncoder(PacketDirection var1) {
      this.field24935 = var1;
   }

   public void encode(ChannelHandlerContext var1, IPacket<?> var2, ByteBuf var3) throws Exception {
      ProtocolType var6 = var1.channel().attr(NetworkManager.PROTOCOL_ATTRIBUTE_KEY).get();
      if (var6 == null) {
         throw new RuntimeException("ConnectionProtocol unknown: " + var2);
      } else {
         Integer var7 = var6.method8102(this.field24935, var2);
         if (field24933.isDebugEnabled()) {
            field24933.debug(field24934, "OUT: [{}:{}] {}", var1.channel().attr(NetworkManager.PROTOCOL_ATTRIBUTE_KEY).get(), var7, var2.getClass().getName());
         }

         if (var7 == null) {
            throw new IOException("Can't serialize unregistered packet");
         } else {
            PacketBuffer var8 = new PacketBuffer(var3);
            var8.writeVarInt(var7);

            try {
               var2.writePacketData(var8);
            } catch (Throwable var10) {
               field24933.error(var10);
               if (var2.method17181()) {
                  throw new SkipableEncoderException(var10);
               } else {
                  throw var10;
               }
            }
         }
      }
   }
}
