package net.minecraft.network.play.client;

import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.CommandBlockTileEntity;
import net.minecraft.util.math.BlockPos;

import java.io.IOException;

public class CUpdateCommandBlockPacket implements IPacket<IServerPlayNetHandler> {
   private BlockPos pos;
   private String command;
   private boolean trackOutput;
   private boolean conditional;
   private boolean auto;
   private CommandBlockTileEntity.Mode mode;

   public CUpdateCommandBlockPacket() {
   }

   public CUpdateCommandBlockPacket(BlockPos var1, String var2, CommandBlockTileEntity.Mode var3, boolean var4, boolean var5, boolean var6) {
      this.pos = var1;
      this.command = var2;
      this.trackOutput = var4;
      this.conditional = var5;
      this.auto = var6;
      this.mode = var3;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.pos = var1.readBlockPos();
      this.command = var1.readString(32767);
      this.mode = var1.readEnumValue(CommandBlockTileEntity.Mode.class);
      int i = var1.readByte();
      this.trackOutput =  (i & 1) != 0;
      this.conditional = (i & 2) != 0;
      this.auto = (i & 4) != 0;
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeBlockPos(this.pos);
      var1.writeString(this.command);
      var1.writeEnumValue(this.mode);
      int var4 = 0;
      if (this.trackOutput) {
         var4 |= 1;
      }

      if (this.conditional) {
         var4 |= 2;
      }

      if (this.auto) {
         var4 |= 4;
      }

      var1.writeByte(var4);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processUpdateCommandBlock(this);
   }

   public BlockPos getPos() {
      return this.pos;
   }

   public String getCommand() {
      return this.command;
   }

   public boolean shouldTrackOutput() {
      return this.trackOutput;
   }

   public boolean isConditional() {
      return this.conditional;
   }

   public boolean isAuto() {
      return this.auto;
   }

   public CommandBlockTileEntity.Mode getMode() {
      return this.mode;
   }
}
