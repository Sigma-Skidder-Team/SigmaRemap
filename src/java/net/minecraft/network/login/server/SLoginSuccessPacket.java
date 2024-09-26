package net.minecraft.network.login.server;

import com.mojang.authlib.GameProfile;
import net.minecraft.client.network.login.IClientLoginNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.UUIDCodec;

import java.io.IOException;
import java.util.UUID;

public class SLoginSuccessPacket implements IPacket<IClientLoginNetHandler> {
    private GameProfile profile;

   public SLoginSuccessPacket() {
   }

   public SLoginSuccessPacket(GameProfile var1) {
      this.profile = var1;
   }

   @Override
   public void readPacketData(PacketBuffer buf) throws IOException {
      int[] aint = new int[4];

      for (int i = 0; i < aint.length; i++) {
         aint[i] = buf.readInt();
      }

      UUID var7 = UUIDCodec.decodeUUID(aint);
      String var6 = buf.readString(16);
      this.profile = new GameProfile(var7, var6);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      for (int var7 : UUIDCodec.encodeUUID(this.profile.getId())) {
         var1.writeInt(var7);
      }

      var1.writeString(this.profile.getName());
   }

   public void processPacket(IClientLoginNetHandler var1) {
      var1.handleLoginSuccess(this);
   }

   public GameProfile getProfile() {
      return this.profile;
   }
}
