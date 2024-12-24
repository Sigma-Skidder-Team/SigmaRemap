package mapped;

import com.google.gson.JsonArray;
import net.minecraft.tags.ITag;
import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;
import java.util.function.Function;

public class Class8185 implements Class8184 {
   private final ResourceLocation field35202;

   public Class8185(ResourceLocation var1) {
      this.field35202 = var1;
   }

   @Override
   public <T> boolean method28480(Function<ResourceLocation, ITag<T>> var1, Function<ResourceLocation, T> var2, Consumer<T> var3) {
      ITag var6 = (ITag)var1.apply(this.field35202);
      if (var6 != null) {
         var6.getAllElements().forEach(var3);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method28481(JsonArray var1) {
      var1.add("#" + this.field35202);
   }

   @Override
   public String toString() {
      return "#" + this.field35202;
   }
}
