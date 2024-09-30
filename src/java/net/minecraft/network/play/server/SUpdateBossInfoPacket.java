package net.minecraft.network.play.server;

import java.io.IOException;
import java.util.UUID;

import mapped.*;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.text.ITextComponent;

public class SUpdateBossInfoPacket implements IPacket<IClientPlayNetHandler> {
   private UUID uniqueId;
   private Operation operation;
   public ITextComponent name;
   private float percent;
   private Class2303 color;
   private Class2300 overlay;
   private boolean darkenSky;
   private boolean playEndBossMusic;
   private boolean createFog;

   public SUpdateBossInfoPacket() {
   }

   public SUpdateBossInfoPacket(Operation var1, Class3625 var2) {
      this.operation = var1;
      this.uniqueId = var2.getUniqueId();
      this.name = var2.getName();
      this.percent = var2.getPercent();
      this.color = var2.getColor();
      this.overlay = var2.getOverlay();
      this.darkenSky = var2.shouldDarkenSky();
      this.playEndBossMusic = var2.shouldPlayEndBossMusic();
      this.createFog = var2.shouldCreateFog();
   }

   @Override
   public void readPacketData(PacketBuffer buf) throws IOException {
      this.uniqueId = buf.readUniqueId();
      this.operation = buf.readEnumValue(Operation.class);
      switch (this.operation) {
         case ADD:
            this.name = buf.readTextComponent();
            this.percent = buf.readFloat();
            this.color = buf.readEnumValue(Class2303.class);
            this.overlay = buf.readEnumValue(Class2300.class);
            this.setFlags(buf.readUnsignedByte());
         case REMOVE:
         default:
            break;
         case UPDATE_PCT:
            this.percent = buf.readFloat();
            break;
         case UPDATE_NAME:
            this.name = buf.readTextComponent();
            break;
         case UPDATE_STYLE:
            this.color = buf.readEnumValue(Class2303.class);
            this.overlay = buf.readEnumValue(Class2300.class);
            break;
         case UPDATE_PROPERTIES:
            this.setFlags(buf.readUnsignedByte());
      }
   }

   private void setFlags(int flags) {
      this.darkenSky = (flags & 1) > 0;
      this.playEndBossMusic = (flags & 2) > 0;
      this.createFog = (flags & 4) > 0;
   }

   @Override
   public void writePacketData(PacketBuffer buf) throws IOException {
      buf.writeUniqueId(this.uniqueId);
      buf.writeEnumValue(this.operation);
      switch (this.operation)
      {
         case ADD:
            buf.writeTextComponent(this.name);
            buf.writeFloat(this.percent);
            buf.writeEnumValue(this.color);
            buf.writeEnumValue(this.overlay);
            buf.writeByte(this.getFlags());

         case REMOVE:
         default:
            break;

         case UPDATE_PCT:
            buf.writeFloat(this.percent);
            break;

         case UPDATE_NAME:
            buf.writeTextComponent(this.name);
            break;

         case UPDATE_STYLE:
            buf.writeEnumValue(this.color);
            buf.writeEnumValue(this.overlay);
            break;

         case UPDATE_PROPERTIES:
            buf.writeByte(this.getFlags());
      }
   }

   private int getFlags() {
      int i = 0;
      if (this.darkenSky) {
         i |= 1;
      }

      if (this.playEndBossMusic) {
         i |= 2;
      }

      if (this.createFog) {
         i |= 4;
      }

      return i;
   }

   public void processPacket(IClientPlayNetHandler handler) {
      handler.handleUpdateBossInfo(this);
   }

   public UUID getUniqueId() {
      return this.uniqueId;
   }

   public Operation getOperation() {
      return this.operation;
   }

   public ITextComponent getName() {
      return this.name;
   }

   public float getPercent() {
      return this.percent;
   }

   public Class2303 getColor() {
      return this.color;
   }

   public Class2300 getOverlay() {
      return this.overlay;
   }

   public boolean shouldDarkenSky() {
      return this.darkenSky;
   }

   public boolean shouldPlayEndBossMusic() {
      return this.playEndBossMusic;
   }

   public boolean shouldCreateFog() {
      return this.createFog;
   }

   public enum Operation {
      ADD,
      REMOVE,
      UPDATE_PCT,
      UPDATE_NAME,
      UPDATE_STYLE,
      UPDATE_PROPERTIES;
   }
}
