package net.minecraft.network;

import java.io.IOException;

public interface Packet<T extends INetHandler> {
   void readPacketData(PacketBuffer var1) throws IOException;

   void writePacketData(PacketBuffer var1) throws IOException;

   void method17180(T var1);

   default boolean method17181() {
      return false;
   }
}
