package mapped;

import com.google.gson.JsonArray;
import net.minecraft.tags.ITag;
import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;
import java.util.function.Function;

public class Class8186 implements Class8184 {
   private static String[] field35203;
   private final ResourceLocation field35204;

   public Class8186(ResourceLocation var1) {
      this.field35204 = var1;
   }

   @Override
   public <T> boolean method28480(Function<ResourceLocation, ITag<T>> var1, Function<ResourceLocation, T> var2, Consumer<T> var3) {
      T var6 = var2.apply(this.field35204);
      if (var6 != null) {
         var3.accept(var6);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method28481(JsonArray var1) {
      var1.add(this.field35204.toString());
   }

   @Override
   public String toString() {
      return this.field35204.toString();
   }
}
