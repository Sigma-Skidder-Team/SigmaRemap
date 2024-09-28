package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateContainer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class Class7340 {
   public static final Class7340 field31445 = new Class7340(ImmutableList.of());
   private final List<Class8646> field31446;

   private static Class8646 method23255(String var0, JsonElement var1) {
      if (!var1.isJsonPrimitive()) {
         JsonObject var7 = JSONUtils.method32781(var1, "value");
         String var5 = !var7.has("min") ? null : method23256(var7.get("min"));
         String var6 = !var7.has("max") ? null : method23256(var7.get("max"));
         return (Class8646)(var5 != null && var5.equals(var6) ? new Class8647(var0, var5) : new Class8645(var0, var5, var6));
      } else {
         String var4 = var1.getAsString();
         return new Class8647(var0, var4);
      }
   }

   @Nullable
   private static String method23256(JsonElement var0) {
      return !var0.isJsonNull() ? var0.getAsString() : null;
   }

   public Class7340(List<Class8646> var1) {
      this.field31446 = ImmutableList.copyOf(var1);
   }

   public <S extends Class7378<?, S>> boolean method23257(StateContainer<?, S> var1, S var2) {
      for (Class8646 var6 : this.field31446) {
         if (!var6.method31078(var1, (S)var2)) {
            return false;
         }
      }

      return true;
   }

   public boolean method23258(BlockState var1) {
      return this.method23257(var1.getBlock().getStateContainer(), var1);
   }

   public boolean method23259(FluidState var1) {
      return this.method23257(var1.method23472().method25047(), var1);
   }

   public void method23260(StateContainer<?, ?> var1, Consumer<String> var2) {
      this.field31446.forEach(var2x -> var2x.method31080(var1, var2));
   }

   public static Class7340 method23261(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var3 = JSONUtils.method32781(var0, "properties");
         ArrayList var4 = Lists.newArrayList();

         for (Entry var6 : var3.entrySet()) {
            var4.add(method23255((String)var6.getKey(), (JsonElement)var6.getValue()));
         }

         return new Class7340(var4);
      } else {
         return field31445;
      }
   }

   public JsonElement method23262() {
      if (this != field31445) {
         JsonObject var3 = new JsonObject();
         if (!this.field31446.isEmpty()) {
            this.field31446.forEach(var1 -> var3.add(var1.method31079(), var1.method31077()));
         }

         return var3;
      } else {
         return JsonNull.INSTANCE;
      }
   }
}
