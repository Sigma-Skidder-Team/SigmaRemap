package mapped;

import com.mojang.authlib.GameProfile;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;
import java.util.UUID;

public class Class5598 implements Packet<Class5103> {
   private static String[] field24843;
   private GameProfile field24844;

   public Class5598() {
   }

   public Class5598(GameProfile var1) {
      this.field24844 = var1;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      int[] var4 = new int[4];

      for (int var5 = 0; var5 < var4.length; var5++) {
         var4[var5] = var1.readInt();
      }

      UUID var7 = Class8749.method31563(var4);
      String var6 = var1.method35728(16);
      this.field24844 = new GameProfile(var7, var6);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      for (int var7 : Class8749.method31564(this.field24844.getId())) {
         var1.writeInt(var7);
      }

      var1.method35729(this.field24844.getName());
   }

   public void method17180(Class5103 var1) {
      var1.method15587(this);
   }

   public GameProfile method17601() {
      return this.field24844;
   }
}
