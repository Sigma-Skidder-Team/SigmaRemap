package mapped;

import com.mojang.authlib.GameProfile;
import java.io.IOException;
import java.util.UUID;

public class CLoginStartPacket implements Packet<Class5108> {
   private static String[] field24421;
   private GameProfile field24422;

   public CLoginStartPacket() {
   }

   public CLoginStartPacket(GameProfile var1) {
      this.field24422 = var1;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24422 = new GameProfile((UUID)null, var1.method35728(16));
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35729(this.field24422.getName());
   }

   public void method17180(Class5108 var1) {
      var1.method15596(this);
   }

   public GameProfile method17302() {
      return this.field24422;
   }
}
