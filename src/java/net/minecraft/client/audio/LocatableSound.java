package net.minecraft.client.audio;

import net.minecraft.util.SoundCategory;
import mapped.Class6648;
import mapped.SoundHandler;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public abstract class LocatableSound implements ISound {
   public Sound sound;
   public final SoundCategory category;
   public final ResourceLocation positionedSoundLocation;
   public float volume = 1.0F;
   public float pitch = 1.0F;
   public double x;
   public double y;
   public double z;
   public boolean repeat;
   public int repeatDelay;
   public AttenuationType attenuationType = AttenuationType.LINEAR;
   public boolean priority;
   public boolean global;

   public LocatableSound(SoundEvent var1, SoundCategory var2) {
      this(var1.method36383(), var2);
   }

   public LocatableSound(ResourceLocation var1, SoundCategory var2) {
      this.positionedSoundLocation = var1;
      this.category = var2;
   }

   @Override
   public ResourceLocation method19279() {
      return this.positionedSoundLocation;
   }

   @Override
   public Class6648 method19280(SoundHandler var1) {
      Class6648 var4 = var1.method997(this.positionedSoundLocation);
      if (var4 != null) {
         this.sound = var4.method20290();
      } else {
         this.sound = SoundHandler.field1051;
      }

      return var4;
   }

   @Override
   public Sound method19281() {
      return this.sound;
   }

   @Override
   public SoundCategory method19282() {
      return this.category;
   }

   @Override
   public boolean method19283() {
      return this.repeat;
   }

   @Override
   public int method19284() {
      return this.repeatDelay;
   }

   @Override
   public float method19285() {
      return this.volume * this.sound.method20293();
   }

   @Override
   public float method19286() {
      return this.pitch * this.sound.method20294();
   }

   @Override
   public double method19287() {
      return this.x;
   }

   @Override
   public double method19288() {
      return this.y;
   }

   @Override
   public double method19289() {
      return this.z;
   }

   @Override
   public AttenuationType method19290() {
      return this.attenuationType;
   }

   @Override
   public boolean method19291() {
      return this.global;
   }

   @Override
   public String toString() {
      return "SoundInstance[" + this.positionedSoundLocation + "]";
   }
}
