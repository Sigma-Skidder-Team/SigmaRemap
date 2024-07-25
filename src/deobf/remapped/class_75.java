package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class_75 {
   public static final Codec<class_75> field_117 = RecordCodecBuilder.create(
      var0 -> var0.group(
               SoundEvent.field_43261.fieldOf("sound").forGetter(var0x -> var0x.field_115),
               Codec.INT.fieldOf("min_delay").forGetter(var0x -> var0x.field_116),
               Codec.INT.fieldOf("max_delay").forGetter(var0x -> var0x.field_114),
               Codec.BOOL.fieldOf("replace_current_music").forGetter(var0x -> var0x.field_118)
            )
            .apply(var0, class_75::new)
   );
   private final SoundEvent field_115;
   private final int field_116;
   private final int field_114;
   private final boolean field_118;

   public class_75(SoundEvent var1, int var2, int var3, boolean var4) {
      this.field_115 = var1;
      this.field_116 = var2;
      this.field_114 = var3;
      this.field_118 = var4;
   }

   public SoundEvent method_163() {
      return this.field_115;
   }

   public int method_162() {
      return this.field_116;
   }

   public int method_160() {
      return this.field_114;
   }

   public boolean method_164() {
      return this.field_118;
   }
}
