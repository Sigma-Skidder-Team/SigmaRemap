package mapped;

import java.io.IOException;

public interface Packet<T extends Class5104> {
   void method17175(PacketBuffer var1) throws IOException;

   void writePacketData(PacketBuffer var1) throws IOException;

   void method17180(T var1);

   default boolean method17181() {
      return false;
   }
}
