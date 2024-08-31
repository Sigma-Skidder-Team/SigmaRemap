package mapped;

import com.google.gson.JsonArray;
import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;
import java.util.function.Function;

public interface Class8184 {
   <T> boolean method28480(Function<ResourceLocation, ITag<T>> var1, Function<ResourceLocation, T> var2, Consumer<T> var3);

   void method28481(JsonArray var1);
}
