package net.minecraft.network.play.server;

import mapped.PacketBuffer;
import mapped.ResourceLocation;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;

import java.io.IOException;

public class SCustomPayloadPlayPacket implements Packet<IClientPlayNetHandler> {
   public static final ResourceLocation field24537 = new ResourceLocation("brand");
   public static final ResourceLocation field24538 = new ResourceLocation("debug/path");
   public static final ResourceLocation field24539 = new ResourceLocation("debug/neighbors_update");
   public static final ResourceLocation field24540 = new ResourceLocation("debug/caves");
   public static final ResourceLocation field24541 = new ResourceLocation("debug/structures");
   public static final ResourceLocation field24542 = new ResourceLocation("debug/worldgen_attempt");
   public static final ResourceLocation field24543 = new ResourceLocation("debug/poi_ticket_count");
   public static final ResourceLocation field24544 = new ResourceLocation("debug/poi_added");
   public static final ResourceLocation field24545 = new ResourceLocation("debug/poi_removed");
   public static final ResourceLocation field24546 = new ResourceLocation("debug/village_sections");
   public static final ResourceLocation field24547 = new ResourceLocation("debug/goal_selector");
   public static final ResourceLocation field24548 = new ResourceLocation("debug/brain");
   public static final ResourceLocation field24549 = new ResourceLocation("debug/bee");
   public static final ResourceLocation field24550 = new ResourceLocation("debug/hive");
   public static final ResourceLocation field24551 = new ResourceLocation("debug/game_test_add_marker");
   public static final ResourceLocation field24552 = new ResourceLocation("debug/game_test_clear");
   public static final ResourceLocation field24553 = new ResourceLocation("debug/raids");
   private ResourceLocation field24554;
   private PacketBuffer field24555;

   public SCustomPayloadPlayPacket() {
   }

   public SCustomPayloadPlayPacket(ResourceLocation var1, PacketBuffer var2) {
      this.field24554 = var1;
      this.field24555 = var2;
      if (var2.writerIndex() > 1048576) {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24554 = var1.method35731();
      int var4 = var1.readableBytes();
      if (var4 >= 0 && var4 <= 1048576) {
         this.field24555 = new PacketBuffer(var1.readBytes(var4));
      } else {
         throw new IOException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35732(this.field24554);
      var1.writeBytes(this.field24555.copy());
   }

   public void method17180(IClientPlayNetHandler var1) {
      var1.handleCustomPayload(this);
   }

   public ResourceLocation method17393() {
      return this.field24554;
   }

   public PacketBuffer method17394() {
      return new PacketBuffer(this.field24555.copy());
   }
}
