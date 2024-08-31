package net.minecraft.network.play.server;

import mapped.Effect;
import net.minecraft.network.PacketBuffer;
import mapped.World;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;

import java.io.IOException;
import javax.annotation.Nullable;

public class SRemoveEntityEffectPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24481;
   private int field24482;
   private Effect field24483;

   public SRemoveEntityEffectPacket() {
   }

   public SRemoveEntityEffectPacket(int var1, Effect var2) {
      this.field24482 = var1;
      this.field24483 = var2;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24482 = var1.readVarInt();
      this.field24483 = Effect.method22287(var1.readUnsignedByte());
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24482);
      var1.writeByte(Effect.method22288(this.field24483));
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleRemoveEntityEffect(this);
   }

   @Nullable
   public Entity method17349(World var1) {
      return var1.getEntityByID(this.field24482);
   }

   @Nullable
   public Effect method17350() {
      return this.field24483;
   }
}
