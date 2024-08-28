package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class Class7818 {
   public static final Class7818 field33531 = new Class7818(ImmutableList.of("vanilla"), ImmutableList.of());
   public static final Codec<Class7818> field33532 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.STRING.listOf().fieldOf("Enabled").forGetter(var0x -> var0x.field33533),
               Codec.STRING.listOf().fieldOf("Disabled").forGetter(var0x -> var0x.field33534)
            )
            .apply(var0, Class7818::new)
   );
   private final List<String> field33533;
   private final List<String> field33534;

   public Class7818(List<String> var1, List<String> var2) {
      this.field33533 = ImmutableList.copyOf(var1);
      this.field33534 = ImmutableList.copyOf(var2);
   }

   public List<String> method26104() {
      return this.field33533;
   }

   public List<String> method26105() {
      return this.field33534;
   }
}
