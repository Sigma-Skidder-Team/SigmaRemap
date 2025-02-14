package net.minecraft.network.play.client;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CConfirmTransactionPacket implements IPacket<IServerPlayNetHandler> {
   private int windowId;
   private short uid;
   private boolean accepted;

   public CConfirmTransactionPacket() {
   }

   public CConfirmTransactionPacket(int windowID, short uid, boolean accepted) {
      this.windowId = windowID;
      this.uid = uid;
      this.accepted = accepted;
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processConfirmTransaction(this);
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.windowId = var1.readByte();
      this.uid = var1.readShort();
      this.accepted = var1.readByte() != 0;
   }

   @Override
   public void writePacketData(PacketBuffer buf) throws IOException {
      if (ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_17)) {
         buf.writeInt(this.windowId);
      } else {
         buf.writeByte(this.windowId);
         buf.writeShort(this.uid);
         buf.writeByte(this.accepted ? 1 : 0);
      }
   }

   public boolean accepted() {
      return this.accepted;
   }

   public int getWindowId() {
      return this.windowId;
   }

   public short getUid() {
      return this.uid;
   }
}
