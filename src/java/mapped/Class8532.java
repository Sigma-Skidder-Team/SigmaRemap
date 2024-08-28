package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;
import javax.annotation.Nullable;

public class Class8532 {
   private final List<ResourceLocation> field38327;

   private Class8532(List<ResourceLocation> var1) {
      this.field38327 = var1;
   }

   @Nullable
   public List<ResourceLocation> method30265() {
      return this.field38327;
   }

   public static Class8532 method30266(JsonObject var0) {
      JsonArray var3 = Class8963.method32786(var0, "textures", (JsonArray)null);
      List var4;
      if (var3 == null) {
         var4 = null;
      } else {
         var4 = Streams.stream(var3)
            .<String>map(var0x -> Class8963.method32762(var0x, "texture"))
            .<ResourceLocation>map(ResourceLocation::new)
            .collect(ImmutableList.toImmutableList());
      }

      return new Class8532(var4);
   }
}
