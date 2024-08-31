package mapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;
import java.util.function.Function;

public class Class8183 implements Class8184 {
   private final ResourceLocation field35201;

   public Class8183(ResourceLocation var1) {
      this.field35201 = var1;
   }

   @Override
   public <T> boolean method28480(Function<ResourceLocation, ITag<T>> var1, Function<ResourceLocation, T> var2, Consumer<T> var3) {
      T var6 = var2.apply(this.field35201);
      if (var6 != null) {
         var3.accept(var6);
      }

      return true;
   }

   @Override
   public void method28481(JsonArray var1) {
      JsonObject var4 = new JsonObject();
      var4.addProperty("id", this.field35201.toString());
      var4.addProperty("required", false);
      var1.add(var4);
   }

   @Override
   public String toString() {
      return this.field35201.toString() + "?";
   }
}
