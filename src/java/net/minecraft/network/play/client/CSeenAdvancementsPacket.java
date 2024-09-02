package net.minecraft.network.play.client;

import net.minecraft.advancements.Advancement;
import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;

public class CSeenAdvancementsPacket implements Packet<IServerPlayNetHandler> {
   private Action action;
   private ResourceLocation tab;

   public CSeenAdvancementsPacket() {
   }

   public CSeenAdvancementsPacket(Action var1, ResourceLocation var2) {
      this.action = var1;
      this.tab = var2;
   }

   public static CSeenAdvancementsPacket openedTab(Advancement var0) {
      return new CSeenAdvancementsPacket(Action.OPENED_TAB, var0.getId());
   }

   public static CSeenAdvancementsPacket closedScreen() {
      return new CSeenAdvancementsPacket(Action.CLOSED_SCREEN, (ResourceLocation)null);
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.action = var1.<Action>readEnumValue(Action.class);
      if (this.action == Action.OPENED_TAB) {
         this.tab = var1.readResourceLocation();
      }
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeEnumValue(this.action);
      if (this.action == Action.OPENED_TAB) {
         var1.writeResourceLocation(this.tab);
      }
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.handleSeenAdvancements(this);
   }

   public Action getAction() {
      return this.action;
   }

   public ResourceLocation getTab() {
      return this.tab;
   }

   public enum Action {
      OPENED_TAB,
      CLOSED_SCREEN;
   }
}
