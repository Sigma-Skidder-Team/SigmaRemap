package net.minecraft.world.biome;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public class MoodSoundAmbience {
   public static final Codec<MoodSoundAmbience> field34223 = RecordCodecBuilder.create(
      var0 -> var0.group(
               SoundEvent.field43936.fieldOf("sound").forGetter(var0x -> var0x.field34225),
               Codec.INT.fieldOf("tick_delay").forGetter(var0x -> var0x.field34226),
               Codec.INT.fieldOf("block_search_extent").forGetter(var0x -> var0x.field34227),
               Codec.DOUBLE.fieldOf("offset").forGetter(var0x -> var0x.field34228)
            )
            .apply(var0, MoodSoundAmbience::new)
   );
   public static final MoodSoundAmbience field34224 = new MoodSoundAmbience(SoundEvents.field26313, 6000, 8, 2.0);
   private SoundEvent field34225;
   private int field34226;
   private int field34227;
   private double field34228;

   public MoodSoundAmbience(SoundEvent var1, int var2, int var3, double var4) {
      this.field34225 = var1;
      this.field34226 = var2;
      this.field34227 = var3;
      this.field34228 = var4;
   }

   public SoundEvent method27073() {
      return this.field34225;
   }

   public int method27074() {
      return this.field34226;
   }

   public int method27075() {
      return this.field34227;
   }

   public double method27076() {
      return this.field34228;
   }
}
