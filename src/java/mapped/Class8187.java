package mapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;
import java.util.function.Function;

public class Class8187 implements Class8184 {
   private final ResourceLocation field35205;

   public Class8187(ResourceLocation var1) {
      this.field35205 = var1;
   }

   @Override
   public <T> boolean method28480(Function<ResourceLocation, ITag<T>> var1, Function<ResourceLocation, T> var2, Consumer<T> var3) {
      ITag var6 = (ITag)var1.apply(this.field35205);
      if (var6 != null) {
         var6.getAllElements().forEach(var3);
      }

      return true;
   }

   @Override
   public void method28481(JsonArray var1) {
      JsonObject var4 = new JsonObject();
      var4.addProperty("id", "#" + this.field35205);
      var4.addProperty("required", false);
      var1.add(var4);
   }

   @Override
   public String toString() {
      return "#" + this.field35205 + "?";
   }
}
