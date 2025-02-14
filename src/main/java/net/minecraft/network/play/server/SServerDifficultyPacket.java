package net.minecraft.network.play.server;

import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.world.Difficulty;

import java.io.IOException;

public class SServerDifficultyPacket implements IPacket<IClientPlayNetHandler> {
   private static String[] field24574;
   private Difficulty field24575;
   private boolean field24576;

   public SServerDifficultyPacket() {
   }

   public SServerDifficultyPacket(Difficulty var1, boolean var2) {
      this.field24575 = var1;
      this.field24576 = var2;
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleServerDifficulty(this);
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24575 = Difficulty.byId(var1.readUnsignedByte());
      this.field24576 = var1.readBoolean();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.field24575.getId());
      var1.writeBoolean(this.field24576);
   }

   public boolean method17399() {
      return this.field24576;
   }

   public Difficulty method17400() {
      return this.field24575;
   }
}
