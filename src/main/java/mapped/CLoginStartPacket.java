package mapped;

import com.mojang.authlib.GameProfile;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;
import java.util.UUID;

public class CLoginStartPacket implements IPacket<Class5108> {
   private static String[] field24421;
   private GameProfile field24422;

   public CLoginStartPacket() {
   }

   public CLoginStartPacket(GameProfile var1) {
      this.field24422 = var1;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24422 = new GameProfile((UUID)null, var1.readString(16));
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeString(this.field24422.getName());
   }

   public void processPacket(Class5108 var1) {
      var1.method15596(this);
   }

   public GameProfile method17302() {
      return this.field24422;
   }
}
