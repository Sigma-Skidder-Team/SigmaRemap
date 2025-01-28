package net.minecraft.network.play.server;

import mapped.SoundCategory;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;

import java.io.IOException;

public class SPlaySoundPacket implements IPacket<IClientPlayNetHandler> {
   public ResourceLocation soundName;
   private SoundCategory category;
   private int x;
   private int y = Integer.MAX_VALUE;
   private int z;
   private float volume;
   private float pitch;

   public SPlaySoundPacket() {
   }

   public SPlaySoundPacket(ResourceLocation soundName, SoundCategory soundCategory, Vector3d pos, float volume, float pitch) {
      this.soundName = soundName;
      this.category = soundCategory;
      this.x = (int)(pos.x * 8.0);
      this.y = (int)(pos.y * 8.0);
      this.z = (int)(pos.z * 8.0);
      this.volume = volume;
      this.pitch = pitch;
   }

   @Override
   public void readPacketData(PacketBuffer buf) throws IOException {
      this.soundName = buf.readResourceLocation();
      this.category = buf.<SoundCategory>readEnumValue(SoundCategory.class);
      this.x = buf.readInt();
      this.y = buf.readInt();
      this.z = buf.readInt();
      this.volume = buf.readFloat();
      this.pitch = buf.readFloat();
   }

   @Override
   public void writePacketData(PacketBuffer buf) throws IOException {
      buf.writeResourceLocation(this.soundName);
      buf.writeEnumValue(this.category);
      buf.writeInt(this.x);
      buf.writeInt(this.y);
      buf.writeInt(this.z);
      buf.writeFloat(this.volume);
      buf.writeFloat(this.pitch);
   }

   public ResourceLocation getSoundName() {
      return this.soundName;
   }

   public SoundCategory getCategory() {
      return this.category;
   }

   public double getX() {
      return ((float)this.x / 8.0F);
   }

   public double getY() {
      return ((float)this.y / 8.0F);
   }

   public double getZ() {
      return ((float)this.z / 8.0F);
   }

   public float getVolume() {
      return this.volume;
   }

   public float method17228() {
      return this.pitch;
   }

   public void processPacket(IClientPlayNetHandler handler) {
      handler.handleCustomSound(this);
   }
}
