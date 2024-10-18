package net.minecraft.client.audio;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.SoundEvent;

public class BackgroundMusicSelector {
   public static final Codec<BackgroundMusicSelector> field19366 = RecordCodecBuilder.create(
      var0 -> var0.group(
               SoundEvent.field43936.fieldOf("sound").forGetter(var0x -> var0x.field19367),
               Codec.INT.fieldOf("min_delay").forGetter(var0x -> var0x.field19368),
               Codec.INT.fieldOf("max_delay").forGetter(var0x -> var0x.field19369),
               Codec.BOOL.fieldOf("replace_current_music").forGetter(var0x -> var0x.field19370)
            )
            .apply(var0, BackgroundMusicSelector::new)
   );
   private final SoundEvent field19367;
   private final int field19368;
   private final int field19369;
   private final boolean field19370;

   public BackgroundMusicSelector(SoundEvent var1, int var2, int var3, boolean var4) {
      this.field19367 = var1;
      this.field19368 = var2;
      this.field19369 = var3;
      this.field19370 = var4;
   }

   public SoundEvent method12189() {
      return this.field19367;
   }

   public int method12190() {
      return this.field19368;
   }

   public int method12191() {
      return this.field19369;
   }

   public boolean method12192() {
      return this.field19370;
   }
}
