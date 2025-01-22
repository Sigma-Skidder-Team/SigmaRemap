package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.mojang.serialization.JsonOps;
import java.util.Optional;

import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.server.ServerWorld;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class8576 {
   private static final Logger field38558 = LogManager.getLogger();
   public static final Class8576 field38559 = new Class8576(
      Class8841.field39940,
      Class8841.field39940,
      Class8841.field39940,
      (RegistryKey<Biome>)null,
      (Structure<?>)null,
      (RegistryKey<World>)null,
      (Boolean)null,
      Class7231.field31074,
      Class9449.field43899,
      Class8463.field36278
   );
   private final Class8841 field38560;
   private final Class8841 field38561;
   private final Class8841 field38562;
   private final RegistryKey<Biome> field38563;
   private final Structure<?> field38564;
   private final RegistryKey<World> field38565;
   private final Boolean field38566;
   private final Class7231 field38567;
   private final Class9449 field38568;
   private final Class8463 field38569;

   public Class8576(
      Class8841 var1,
      Class8841 var2,
      Class8841 var3,
      RegistryKey<Biome> var4,
      Structure<?> var5,
      RegistryKey<World> var6,
      Boolean var7,
      Class7231 var8,
      Class9449 var9,
      Class8463 var10
   ) {
      this.field38560 = var1;
      this.field38561 = var2;
      this.field38562 = var3;
      this.field38563 = var4;
      this.field38564 = var5;
      this.field38565 = var6;
      this.field38566 = var7;
      this.field38567 = var8;
      this.field38568 = var9;
      this.field38569 = var10;
   }

   public static Class8576 method30647(RegistryKey<Biome> var0) {
      return new Class8576(
         Class8841.field39940,
         Class8841.field39940,
         Class8841.field39940,
         var0,
         (Structure<?>)null,
         (RegistryKey<World>)null,
         (Boolean)null,
         Class7231.field31074,
         Class9449.field43899,
         Class8463.field36278
      );
   }

   public static Class8576 method30648(RegistryKey<World> var0) {
      return new Class8576(
         Class8841.field39940,
         Class8841.field39940,
         Class8841.field39940,
         (RegistryKey<Biome>)null,
         (Structure<?>)null,
         var0,
         (Boolean)null,
         Class7231.field31074,
         Class9449.field43899,
         Class8463.field36278
      );
   }

   public static Class8576 method30649(Structure<?> var0) {
      return new Class8576(
         Class8841.field39940,
         Class8841.field39940,
         Class8841.field39940,
         (RegistryKey<Biome>)null,
         var0,
         (RegistryKey<World>)null,
         (Boolean)null,
         Class7231.field31074,
         Class9449.field43899,
         Class8463.field36278
      );
   }

   public boolean method30650(ServerWorld var1, double var2, double var4, double var6) {
      return this.method30651(var1, (float)var2, (float)var4, (float)var6);
   }

   public boolean method30651(ServerWorld var1, float var2, float var3, float var4) {
      if (!this.field38560.method32023(var2)) {
         return false;
      } else if (this.field38561.method32023(var3)) {
         if (!this.field38562.method32023(var4)) {
            return false;
         } else if (this.field38565 != null && this.field38565 != var1.getDimensionKey()) {
            return false;
         } else {
            BlockPos var7 = new BlockPos((double)var2, (double)var3, (double)var4);
            boolean var8 = var1.method6763(var7);
            Optional var9 = var1.func_241828_r().<Biome>getRegistry(Registry.BIOME_KEY).method9182(var1.getBiome(var7));
            if (!var9.isPresent()) {
               return false;
            } else if (this.field38563 == null || var8 && this.field38563 == var9.get()) {
               if (this.field38564 == null || var8 && var1.func_241112_a_().method24345(var7, true, this.field38564).method17117()) {
                  if (this.field38566 == null || var8 && this.field38566 == CampfireBlock.method11654(var1, var7)) {
                     if (!this.field38567.method22704(var1, var7)) {
                        return false;
                     } else {
                        return this.field38568.method36328(var1, var7) ? this.field38569.method29762(var1, var7) : false;
                     }
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   public JsonElement method30652() {
      if (this == field38559) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var3 = new JsonObject();
         if (!this.field38560.method32004() || !this.field38561.method32004() || !this.field38562.method32004()) {
            JsonObject var4 = new JsonObject();
            var4.add("x", this.field38560.method32005());
            var4.add("y", this.field38561.method32005());
            var4.add("z", this.field38562.method32005());
            var3.add("position", var4);
         }

         if (this.field38565 != null) {
            World.CODEC
               .encodeStart(JsonOps.INSTANCE, this.field38565)
               .resultOrPartial(field38558::error)
               .ifPresent(var1 -> var3.add("dimension", var1));
         }

         if (this.field38564 != null) {
            var3.addProperty("feature", this.field38564.method11373());
         }

         if (this.field38563 != null) {
            var3.addProperty("biome", this.field38563.getLocation().toString());
         }

         if (this.field38566 != null) {
            var3.addProperty("smokey", this.field38566);
         }

         var3.add("light", this.field38567.method22705());
         var3.add("block", this.field38568.method36330());
         var3.add("fluid", this.field38569.method29764());
         return var3;
      }
   }

   public static Class8576 method30653(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var3 = JSONUtils.getJSONObject(var0, "location");
         JsonObject var4 = JSONUtils.getJSONObject(var3, "position", new JsonObject());
         Class8841 var5 = Class8841.method32025(var4.get("x"));
         Class8841 var6 = Class8841.method32025(var4.get("y"));
         Class8841 var7 = Class8841.method32025(var4.get("z"));
         RegistryKey var8 = !var3.has("dimension")
            ? null
            : ResourceLocation.CODEC
               .parse(JsonOps.INSTANCE, var3.get("dimension"))
               .resultOrPartial(field38558::error)
               .<RegistryKey>map(var0x -> RegistryKey.<World>getOrCreateKey(Registry.WORLD_KEY, var0x))
               .orElse((RegistryKey)null);
         Structure var9 = !var3.has("feature") ? null : (Structure) Structure.field_236365_a_.get(JSONUtils.getString(var3, "feature"));
         RegistryKey var10 = null;
         if (var3.has("biome")) {
            ResourceLocation var11 = new ResourceLocation(JSONUtils.getString(var3, "biome"));
            var10 = RegistryKey.<Biome>getOrCreateKey(Registry.BIOME_KEY, var11);
         }

         Boolean var15 = !var3.has("smokey") ? null : var3.get("smokey").getAsBoolean();
         Class7231 var12 = Class7231.method22706(var3.get("light"));
         Class9449 var13 = Class9449.method36329(var3.get("block"));
         Class8463 var14 = Class8463.method29763(var3.get("fluid"));
         return new Class8576(var5, var6, var7, var10, var9, var8, var15, var12, var13, var14);
      } else {
         return field38559;
      }
   }
}
