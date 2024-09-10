package mapped;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableSet.Builder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.util.ResourceLocation;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public class Class6879 {
   private final List<Class7794> field29819 = Lists.newArrayList();

   public static Class6879 method20942() {
      return new Class6879();
   }

   public Class6879 method20943(Class7794 var1) {
      this.field29819.add(var1);
      return this;
   }

   public Class6879 method20944(Class8184 var1, String var2) {
      return this.method20943(new Class7794(var1, var2));
   }

   public Class6879 method20945(ResourceLocation var1, String var2) {
      return this.method20944(new Class8186(var1), var2);
   }

   public Class6879 method20946(ResourceLocation var1, String var2) {
      return this.method20944(new Class8185(var1), var2);
   }

   public <T> Optional<ITag<T>> method20947(Function<ResourceLocation, ITag<T>> var1, Function<ResourceLocation, T> var2) {
      Builder var5 = ImmutableSet.builder();

      for (Class7794 var7 : this.field29819) {
         if (!var7.method25884().method28480(var1, var2, var5::add)) {
            return Optional.<ITag<T>>empty();
         }
      }

      return Optional.<ITag<T>>of(ITag.<T>method24920(var5.build()));
   }

   public Stream<Class7794> method20948() {
      return this.field29819.stream();
   }

   public <T> Stream<Class7794> method20949(Function<ResourceLocation, ITag<T>> var1, Function<ResourceLocation, T> var2) {
      return this.method20948().filter(var2x -> !var2x.method25884().method28480(var1, var2, var0x -> {
         }));
   }

   public Class6879 method20950(JsonObject var1, String var2) {
      JsonArray var5 = JSONUtils.method32785(var1, "values");
      List<Class8184> var6 = Lists.newArrayList();

      for (JsonElement var8 : var5) {
         var6.add(method20951(var8));
      }

      if (JSONUtils.getBoolean(var1, "replace", false)) {
         this.field29819.clear();
      }

      var6.forEach(var2x -> this.field29819.add(new Class7794(var2x, var2)));
      return this;
   }

   private static Class8184 method20951(JsonElement var0) {
      String var3;
      boolean var4;
      if (!var0.isJsonObject()) {
         var3 = JSONUtils.method32762(var0, "id");
         var4 = true;
      } else {
         JsonObject var5 = var0.getAsJsonObject();
         var3 = JSONUtils.getString(var5, "id");
         var4 = JSONUtils.getBoolean(var5, "required", true);
      }

      if (!var3.startsWith("#")) {
         ResourceLocation var7 = new ResourceLocation(var3);
         return (Class8184)(!var4 ? new Class8183(var7) : new Class8186(var7));
      } else {
         ResourceLocation var6 = new ResourceLocation(var3.substring(1));
         return (Class8184)(!var4 ? new Class8187(var6) : new Class8185(var6));
      }
   }

   public JsonObject method20952() {
      JsonObject var3 = new JsonObject();
      JsonArray var4 = new JsonArray();

      for (Class7794 var6 : this.field29819) {
         var6.method25884().method28481(var4);
      }

      var3.addProperty("replace", false);
      var3.add("values", var4);
      return var3;
   }
}
