package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.registry.Registry;

import java.util.Set;

public class Class4697 implements Class4698 {
   public static final Codec<Class4697> field22284 = RecordCodecBuilder.create(
      var0 -> var0.group(
               FluidState.field31584.fieldOf("state").forGetter(var0x -> var0x.field22285),
               Codec.BOOL.fieldOf("requires_block_below").orElse(true).forGetter(var0x -> var0x.field22286),
               Codec.INT.fieldOf("rock_count").orElse(4).forGetter(var0x -> var0x.field22287),
               Codec.INT.fieldOf("hole_count").orElse(1).forGetter(var0x -> var0x.field22288),
               Registry.BLOCK.listOf().fieldOf("valid_blocks").<Set<Block>>xmap(ImmutableSet::copyOf, ImmutableList::copyOf).forGetter(var0x -> var0x.field22289)
            )
            .apply(var0, Class4697::new)
   );
   public final FluidState field22285;
   public final boolean field22286;
   public final int field22287;
   public final int field22288;
   public final Set<Block> field22289;

   public Class4697(FluidState var1, boolean var2, int var3, int var4, Set<Block> var5) {
      this.field22285 = var1;
      this.field22286 = var2;
      this.field22287 = var3;
      this.field22288 = var4;
      this.field22289 = var5;
   }
}
