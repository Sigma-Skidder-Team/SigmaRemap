package remapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class class_2805 {
   public static final class_2805 field_13766 = new class_2805(ImmutableList.of("vanilla"), ImmutableList.of());
   public static final Codec<class_2805> field_13767 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.STRING.listOf().fieldOf("Enabled").forGetter(var0x -> var0x.field_13768),
               Codec.STRING.listOf().fieldOf("Disabled").forGetter(var0x -> var0x.field_13770)
            )
            .apply(var0, class_2805::new)
   );
   private final List<String> field_13768;
   private final List<String> field_13770;

   public class_2805(List<String> var1, List<String> var2) {
      this.field_13768 = ImmutableList.copyOf(var1);
      this.field_13770 = ImmutableList.copyOf(var2);
   }

   public List<String> method_12755() {
      return this.field_13768;
   }

   public List<String> method_12753() {
      return this.field_13770;
   }
}
