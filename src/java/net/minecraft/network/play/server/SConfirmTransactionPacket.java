package net.minecraft.network.play.server;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;

import java.io.IOException;

public class SConfirmTransactionPacket implements IPacket<IClientPlayNetHandler> {
   private int windowId;
   private short actionNumber;
   private boolean accepted;

   public SConfirmTransactionPacket() {
   }

   public SConfirmTransactionPacket(int var1, short var2, boolean var3) {
      this.windowId = var1;
      this.actionNumber = var2;
      this.accepted = var3;
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleConfirmTransaction(this);
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      if (ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_17)) {
         this.windowId = var1.readInt();
      } else {
         this.windowId = var1.readUnsignedByte();
         this.actionNumber = var1.readShort();
         this.accepted = var1.readBoolean();
      }
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.windowId);
      var1.writeShort(this.actionNumber);
      var1.writeBoolean(this.accepted);
   }

   public int getWindowId() {
      return this.windowId;
   }

   public short getActionNumber() {
      return this.actionNumber;
   }

   public boolean getAccepted() {
      return this.accepted;
   }
}
