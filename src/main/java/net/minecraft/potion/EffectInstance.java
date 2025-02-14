package net.minecraft.potion;

import com.google.common.collect.ComparisonChain;
import mapped.Effect;
import net.minecraft.entity.LivingEntity;
import net.minecraft.nbt.CompoundNBT;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EffectInstance implements Comparable<EffectInstance> {
   private static final Logger LOGGER = LogManager.getLogger();
   private final Effect potion;
   private int duration;
   private int amplifier;
   private boolean isSplashPotion;
   private boolean ambient;
   private boolean isPotionDurationMax;
   private boolean showParticles;
   private boolean showIcon;
   private EffectInstance hiddenEffects;

   public EffectInstance(Effect potionIn) {
      this(potionIn, 0, 0);
   }

   public EffectInstance(Effect potionIn, int durationIn) {
      this(potionIn, durationIn, 0);
   }

   public EffectInstance(Effect potionIn, int durationIn, int amplifierIn) {
      this(potionIn, durationIn, amplifierIn, false, true);
   }

   public EffectInstance(Effect potionIn, int durationIn, int amplifierIn, boolean ambientIn, boolean showParticles) {
      this(potionIn, durationIn, amplifierIn, ambientIn, showParticles, showParticles);
   }

   public EffectInstance(Effect potionIn, int durationIn, int amplifierIn, boolean ambientIn, boolean showParticles, boolean showIcon) {
      this(potionIn, durationIn, amplifierIn, ambientIn, showParticles, showIcon, (EffectInstance)null);
   }

   public EffectInstance(Effect potionIn, int durationIn, int amplifier, boolean ambient, boolean showParticles, boolean showIcon, EffectInstance hiddenEffects) {
      this.potion = potionIn;
      this.duration = durationIn;
      this.amplifier = amplifier;
      this.ambient = ambient;
      this.showParticles = showParticles;
      this.showIcon = showIcon;
      this.hiddenEffects = hiddenEffects;
   }

   public EffectInstance(EffectInstance other) {
      this.potion = other.potion;
      this.copy(other);
   }

   public void copy(EffectInstance var1) {
      this.duration = var1.duration;
      this.amplifier = var1.amplifier;
      this.ambient = var1.ambient;
      this.showParticles = var1.showParticles;
      this.showIcon = var1.showIcon;
   }

   public boolean combine(EffectInstance other) {
      if (this.potion != other.potion) {
         LOGGER.warn("This method should only be called for matching effects!");
      }

      boolean notEqual = false;
      if (other.amplifier <= this.amplifier) {
         if (other.duration > this.duration) {
            if (other.amplifier != this.amplifier) {
               if (this.hiddenEffects != null) {
                  this.hiddenEffects.combine(other);
               } else {
                  this.hiddenEffects = new EffectInstance(other);
               }
            } else {
               this.duration = other.duration;
               notEqual = true;
            }
         }
      } else {
         if (other.duration < this.duration) {
            EffectInstance var5 = this.hiddenEffects;
            this.hiddenEffects = new EffectInstance(this);
            this.hiddenEffects.hiddenEffects = var5;
         }

         this.amplifier = other.amplifier;
         this.duration = other.duration;
         notEqual = true;
      }

      if (!other.ambient && this.ambient || notEqual) {
         this.ambient = other.ambient;
         notEqual = true;
      }

      if (other.showParticles != this.showParticles) {
         this.showParticles = other.showParticles;
         notEqual = true;
      }

      if (other.showIcon != this.showIcon) {
         this.showIcon = other.showIcon;
         notEqual = true;
      }

      return notEqual;
   }

   public Effect getPotion() {
      return this.potion;
   }

   public int getDuration() {
      return this.duration;
   }

   public int getAmplifier() {
      return this.amplifier;
   }

   public boolean isAmbient() {
      return this.ambient;
   }

   public boolean doesShowParticles() {
      return this.showParticles;
   }

   public boolean doesShowIcon() {
      return this.showIcon;
   }

   public boolean tick(LivingEntity entityIn, Runnable onDurationDone) {
      if (this.duration > 0) {
         if (this.potion.isReady(this.duration, this.amplifier)) {
            this.performEffect(entityIn);
         }

         this.decrementDuration();
         if (this.duration == 0 && this.hiddenEffects != null) {
            this.copy(this.hiddenEffects);
            this.hiddenEffects = this.hiddenEffects.hiddenEffects;
            onDurationDone.run();
         }
      }

      return this.duration > 0;
   }

   private int decrementDuration() {
      if (this.hiddenEffects != null) {
         this.hiddenEffects.decrementDuration();
      }

      return --this.duration;
   }

   public void performEffect(LivingEntity to) {
      if (this.duration > 0) {
         this.potion.performEffect(to, this.amplifier);
      }
   }

   public String getPotionName() {
      return this.potion.getName();
   }

   @Override
   public String toString() {
      String result;
      if (this.amplifier <= 0) {
         result = this.getPotionName() + ", Duration: " + this.duration;
      } else {
         result = this.getPotionName() + " x " + (this.amplifier + 1) + ", Duration: " + this.duration;
      }

      if (this.isSplashPotion) {
         result = result + ", Splash: true";
      }

      if (!this.showParticles) {
         result = result + ", Particles: false";
      }

      if (!this.showIcon) {
         result = result + ", Show Icon: false";
      }

      return result;
   }

   @Override
   public boolean equals(Object other) {
      if (this != other) {
         if (!(other instanceof EffectInstance)) {
            return false;
         } else {
            EffectInstance otherInstance = (EffectInstance)other;
            return this.duration == otherInstance.duration
               && this.amplifier == otherInstance.amplifier
               && this.isSplashPotion == otherInstance.isSplashPotion
               && this.ambient == otherInstance.ambient
               && this.potion.equals(otherInstance.potion);
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int hash = this.potion.hashCode();
      hash = 31 * hash + this.duration;
      hash = 31 * hash + this.amplifier;
      hash = 31 * hash + (!this.isSplashPotion ? 0 : 1);
      return 31 * hash + (!this.ambient ? 0 : 1);
   }

   public CompoundNBT write(CompoundNBT nbt) {
      nbt.putByte("Id", (byte) Effect.getId(this.getPotion()));
      this.writeInternal(nbt);
      return nbt;
   }

   private void writeInternal(CompoundNBT nbt) {
      nbt.putByte("Amplifier", (byte)this.getAmplifier());
      nbt.putInt("Duration", this.getDuration());
      nbt.putBoolean("Ambient", this.isAmbient());
      nbt.putBoolean("ShowParticles", this.doesShowParticles());
      nbt.putBoolean("ShowIcon", this.doesShowIcon());
      if (this.hiddenEffects != null) {
         CompoundNBT nbt2 = new CompoundNBT();
         this.hiddenEffects.write(nbt2);
         nbt.put("HiddenEffect", nbt2);
      }
   }

   public static EffectInstance read(CompoundNBT nbt) {
      byte id = nbt.getByte("Id");
      Effect effect = Effect.get(id);
      return effect != null ? readInternal(effect, nbt) : null;
   }

   private static EffectInstance readInternal(Effect effect, CompoundNBT nbt) {
      byte amplifier = nbt.getByte("Amplifier");
      int duration = nbt.getInt("Duration");
      boolean ambient = nbt.getBoolean("Ambient");
      boolean showParticles = true;
      if (nbt.contains("ShowParticles", 1)) {
         showParticles = nbt.getBoolean("ShowParticles");
      }

      boolean var8 = showParticles;
      if (nbt.contains("ShowIcon", 1)) {
         var8 = nbt.getBoolean("ShowIcon");
      }

      EffectInstance var9 = null;
      if (nbt.contains("HiddenEffect", 10)) {
         var9 = readInternal(effect, nbt.getCompound("HiddenEffect"));
      }

      return new EffectInstance(effect, duration, amplifier >= 0 ? amplifier : 0, ambient, showParticles, var8, var9);
   }

   public void setIsPotionDurationMax(boolean var1) {
      this.isPotionDurationMax = var1;
   }

   public boolean isPotionDurationMax() {
      return this.isPotionDurationMax;
   }

   public int compareTo(EffectInstance that) {
      return this.getDuration() > 32147 && that.getDuration() > 32147 || this.isAmbient() && that.isAmbient()
         ? ComparisonChain.start()
            .compare(this.isAmbient(), that.isAmbient())
            .compare(this.getPotion().getLiquidColor(), that.getPotion().getLiquidColor())
            .result()
         : ComparisonChain.start()
            .compare(this.isAmbient(), that.isAmbient())
            .compare(this.getDuration(), that.getDuration())
            .compare(this.getPotion().getLiquidColor(), that.getPotion().getLiquidColor())
            .result();
   }
}
