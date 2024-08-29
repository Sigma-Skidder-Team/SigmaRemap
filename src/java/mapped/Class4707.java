package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.math.BlockPos;

import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class Class4707 implements Class4698 {
   public static final Codec<Class4707> field22325 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter(var0x -> var0x.field22326),
               Class9648.field45108.listOf().fieldOf("spikes").forGetter(var0x -> var0x.field22327),
               BlockPos.field13030.optionalFieldOf("crystal_beam_target").forGetter(var0x -> Optional.<BlockPos>ofNullable(var0x.field22328))
            )
            .apply(var0, Class4707::new)
   );
   private final boolean field22326;
   private final List<Class9648> field22327;
   private final BlockPos field22328;

   public Class4707(boolean var1, List<Class9648> var2, BlockPos var3) {
      this(var1, var2, Optional.<BlockPos>ofNullable(var3));
   }

   private Class4707(boolean var1, List<Class9648> var2, Optional<BlockPos> var3) {
      this.field22326 = var1;
      this.field22327 = var2;
      this.field22328 = (BlockPos)var3.orElse((BlockPos)null);
   }

   public boolean method14775() {
      return this.field22326;
   }

   public List<Class9648> method14776() {
      return this.field22327;
   }

   @Nullable
   public BlockPos method14777() {
      return this.field22328;
   }
}
