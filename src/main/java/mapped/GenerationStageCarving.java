package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.IStringSerializable;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum GenerationStageCarving implements IStringSerializable {
   field259("air"),
   field260("liquid");

   public static final Codec<GenerationStageCarving> field261 = IStringSerializable.<GenerationStageCarving>createEnumCodec(GenerationStageCarving::values, GenerationStageCarving::method277);
   private static final Map<String, GenerationStageCarving> field262 = Arrays.<GenerationStageCarving>stream(values()).collect(Collectors.toMap(GenerationStageCarving::method276, var0 -> (GenerationStageCarving)var0));
   private final String field263;
   private static final GenerationStageCarving[] field264 = new GenerationStageCarving[]{field259, field260};

   private GenerationStageCarving(String var3) {
      this.field263 = var3;
   }

   public String method276() {
      return this.field263;
   }

   @Nullable
   public static GenerationStageCarving method277(String var0) {
      return field262.get(var0);
   }

   @Override
   public String getString() {
      return this.field263;
   }
}
