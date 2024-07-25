package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;
import javax.annotation.Nullable;

public class class_4963 {
   private final List<Identifier> field_25663;

   private class_4963(List<Identifier> var1) {
      this.field_25663 = var1;
   }

   @Nullable
   public List<Identifier> method_22719() {
      return this.field_25663;
   }

   public static class_4963 method_22720(JsonObject var0) {
      JsonArray var3 = class_6539.method_29788(var0, "textures", (JsonArray)null);
      List var4;
      if (var3 == null) {
         var4 = null;
      } else {
         var4 = Streams.stream(var3)
            .<String>map(var0x -> class_6539.method_29795(var0x, "texture"))
            .<Identifier>map(Identifier::new)
            .collect(ImmutableList.toImmutableList());
      }

      return new class_4963(var4);
   }
}
