package mapped;

import com.mentalfrostbyte.jello.network.PacketHandler;

public @interface Handler {
   Object packetHandler = new PacketHandler();
}
