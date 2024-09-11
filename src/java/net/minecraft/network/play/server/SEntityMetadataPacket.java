package net.minecraft.network.play.server;

import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.datasync.EntityDataManager;

import java.io.IOException;
import java.util.List;

public class SEntityMetadataPacket implements Packet<IClientPlayNetHandler> {
   private int entityId;
   private List < EntityDataManager.DataEntry<? >> dataManagerEntries;

   public SEntityMetadataPacket() {
   }

   public SEntityMetadataPacket(int var1, EntityDataManager dataManagerIn, boolean var3) {
      this.entityId = var1;
      if (!var3) {
         this.dataManagerEntries = dataManagerIn.getDirty();
      } else {
         this.dataManagerEntries = dataManagerIn.getAll();
         dataManagerIn.setClean();
      }
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.entityId = var1.readVarInt();
      this.dataManagerEntries = EntityDataManager.readEntries(var1);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.entityId);
      EntityDataManager.writeEntries(this.dataManagerEntries, var1);
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleEntityMetadata(this);
   }

   public List<EntityDataManager.DataEntry<?>> getDataManagerEntries() {
      return this.dataManagerEntries;
   }

   public int getEntityId() {
      return this.entityId;
   }
}
