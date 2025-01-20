package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.math.BlockPos;

import java.util.Optional;

public class Class4701 implements Class4698 {
   public static final Codec<Class4701> field22299 = RecordCodecBuilder.create(
      var0 -> var0.group(
               BlockPos.CODEC.optionalFieldOf("exit").forGetter(var0x -> var0x.field22300),
               Codec.BOOL.fieldOf("exact").forGetter(var0x -> var0x.field22301)
            )
            .apply(var0, Class4701::new)
   );
   private final Optional<BlockPos> field22300;
   private final boolean field22301;

   private Class4701(Optional<BlockPos> var1, boolean var2) {
      this.field22300 = var1;
      this.field22301 = var2;
   }

   public static Class4701 method14745(BlockPos var0, boolean var1) {
      return new Class4701(Optional.<BlockPos>of(var0), var1);
   }

   public static Class4701 method14746() {
      return new Class4701(Optional.<BlockPos>empty(), false);
   }

   public Optional<BlockPos> method14747() {
      return this.field22300;
   }

   public boolean method14748() {
      return this.field22301;
   }
}
