package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.SoundEvent;

public class Class8217 {
   public static final Codec<Class8217> field35292 = RecordCodecBuilder.create(
      var0 -> var0.group(
               SoundEvent.field43936.fieldOf("sound").forGetter(var0x -> var0x.field35293),
               Codec.DOUBLE.fieldOf("tick_chance").forGetter(var0x -> var0x.field35294)
            )
            .apply(var0, Class8217::new)
   );
   private SoundEvent field35293;
   private double field35294;

   public Class8217(SoundEvent var1, double var2) {
      this.field35293 = var1;
      this.field35294 = var2;
   }

   public SoundEvent method28562() {
      return this.field35293;
   }

   public double method28563() {
      return this.field35294;
   }
}
