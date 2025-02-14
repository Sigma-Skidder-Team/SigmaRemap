package net.minecraft.network.play.server;

import java.io.IOException;

import mapped.SoundCategory;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.registry.Registry;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.util.SoundEvent;
import org.apache.commons.lang3.Validate;

public class SPlaySoundEffectPacket implements IPacket<IClientPlayNetHandler> {
   private SoundEvent sound;
   private SoundCategory category;
   private int posX;
   private int posY;
   private int posZ;
   private float soundVolume;
   private float soundPitch;

   public SPlaySoundEffectPacket() {
   }

   public SPlaySoundEffectPacket(SoundEvent soundIn, SoundCategory categoryIn, double xIn, double yIn, double zIn, float volumeIn, float pitchIn) {
      Validate.notNull(soundIn, "sound");
      this.sound = soundIn;
      this.category = categoryIn;
      this.posX = (int)(xIn * 8.0);
      this.posY = (int)(yIn * 8.0);
      this.posZ = (int)(zIn * 8.0);
      this.soundVolume = volumeIn;
      this.soundPitch = pitchIn;
   }

   @Override
   public void readPacketData(PacketBuffer buf) throws IOException {
      this.sound = Registry.SOUND_EVENT.getByValue(buf.readVarInt());
      this.category = buf.readEnumValue(SoundCategory.class);
      this.posX = buf.readInt();
      this.posY = buf.readInt();
      this.posZ = buf.readInt();
      this.soundVolume = buf.readFloat();
      this.soundPitch = buf.readFloat();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(Registry.SOUND_EVENT.getId(this.sound));
      var1.writeEnumValue(this.category);
      var1.writeInt(this.posX);
      var1.writeInt(this.posY);
      var1.writeInt(this.posZ);
      var1.writeFloat(this.soundVolume);
      var1.writeFloat(this.soundPitch);
   }

   public SoundEvent getSound() {
      return this.sound;
   }

   public SoundCategory getCategory() {
      return this.category;
   }

   public double getX() {
      return ((float)this.posX / 8.0F);
   }

   public double getY() {
      return ((float)this.posY / 8.0F);
   }

   public double getZ() {
      return ((float)this.posZ / 8.0F);
   }

   public float getVolume() {
      return this.soundVolume;
   }

   public float getPitch() {
      return this.soundPitch;
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleSoundEffect(this);
   }
}
