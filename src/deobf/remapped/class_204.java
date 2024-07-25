package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public class class_204 implements class_6157 {
   public static final Codec<class_204> field_681 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_4774.field_23136.fieldOf("state").forGetter(var0x -> var0x.field_679),
               Codec.BOOL.fieldOf("requires_block_below").orElse(true).forGetter(var0x -> var0x.field_683),
               Codec.INT.fieldOf("rock_count").orElse(4).forGetter(var0x -> var0x.field_684),
               Codec.INT.fieldOf("hole_count").orElse(1).forGetter(var0x -> var0x.field_682),
               class_8669.field_44462.listOf().fieldOf("valid_blocks").xmap(ImmutableSet::copyOf, ImmutableList::copyOf).forGetter(var0x -> var0x.field_685)
            )
            .apply(var0, class_204::new)
   );
   public final class_4774 field_679;
   public final boolean field_683;
   public final int field_684;
   public final int field_682;
   public final Set<class_6414> field_685;

   public class_204(class_4774 var1, boolean var2, int var3, int var4, Set<class_6414> var5) {
      this.field_679 = var1;
      this.field_683 = var2;
      this.field_684 = var3;
      this.field_682 = var4;
      this.field_685 = var5;
   }
}
