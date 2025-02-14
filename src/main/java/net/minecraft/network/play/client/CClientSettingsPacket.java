package net.minecraft.network.play.client;

import net.minecraft.entity.player.ChatVisibility;
import net.minecraft.util.HandSide;
import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CClientSettingsPacket implements IPacket<IServerPlayNetHandler> {
   private String lang;
   private int view;
   private ChatVisibility chatVisibility;
   private boolean enableColors;
   private int modelPartFlags;
   private HandSide mainHand;

   public CClientSettingsPacket() {
   }

   public CClientSettingsPacket(String var1, int var2, ChatVisibility var3, boolean var4, int var5, HandSide var6) {
      this.lang = var1;
      this.view = var2;
      this.chatVisibility = var3;
      this.enableColors = var4;
      this.modelPartFlags = var5;
      this.mainHand = var6;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.lang = var1.readString(16);
      this.view = var1.readByte();
      this.chatVisibility = var1.readEnumValue(ChatVisibility.class);
      this.enableColors = var1.readBoolean();
      this.modelPartFlags = var1.readUnsignedByte();
      this.mainHand = var1.readEnumValue(HandSide.class);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeString(this.lang);
      var1.writeByte(this.view);
      var1.writeEnumValue(this.chatVisibility);
      var1.writeBoolean(this.enableColors);
      var1.writeByte(this.modelPartFlags);
      var1.writeEnumValue(this.mainHand);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processClientSettings(this);
   }

   public ChatVisibility getChatVisibility() {
      return this.chatVisibility;
   }

   public boolean isColorsEnabled() {
      return this.enableColors;
   }

   public int getModelPartFlags() {
      return this.modelPartFlags;
   }

   public HandSide getMainHand() {
      return this.mainHand;
   }
}
