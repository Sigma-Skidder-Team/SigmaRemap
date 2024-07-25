package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class class_4069 implements class_6157 {
   public static final Codec<class_4069> field_19822 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter(var0x -> var0x.field_19819),
               class_9191.field_47012.listOf().fieldOf("spikes").forGetter(var0x -> var0x.field_19820),
               class_1331.field_7305.optionalFieldOf("crystal_beam_target").forGetter(var0x -> Optional.<class_1331>ofNullable(var0x.field_19823))
            )
            .apply(var0, class_4069::new)
   );
   private final boolean field_19819;
   private final List<class_9191> field_19820;
   private final class_1331 field_19823;

   public class_4069(boolean var1, List<class_9191> var2, class_1331 var3) {
      this(var1, var2, Optional.<class_1331>ofNullable(var3));
   }

   private class_4069(boolean var1, List<class_9191> var2, Optional<class_1331> var3) {
      this.field_19819 = var1;
      this.field_19820 = var2;
      this.field_19823 = (class_1331)var3.orElse((class_1331)null);
   }

   public boolean method_18767() {
      return this.field_19819;
   }

   public List<class_9191> method_18769() {
      return this.field_19820;
   }

   @Nullable
   public class_1331 method_18768() {
      return this.field_19823;
   }
}
