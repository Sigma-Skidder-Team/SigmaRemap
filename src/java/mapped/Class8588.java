package mapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import net.minecraft.entity.player.PlayerEntity;

import java.util.Arrays;

public class Class8588 {
   public static final Class8588 field38664 = new Class8588(0, new ResourceLocation[0], new ResourceLocation[0], Class9137.field41987);
   private final int field38665;
   private final ResourceLocation[] field38666;
   private final ResourceLocation[] field38667;
   private final Class9137 field38668;

   public Class8588(int var1, ResourceLocation[] var2, ResourceLocation[] var3, Class9137 var4) {
      this.field38665 = var1;
      this.field38666 = var2;
      this.field38667 = var3;
      this.field38668 = var4;
   }

   public void method30722(ServerPlayerEntity var1) {
      var1.method2781(this.field38665);
      LootContext var4 = new Class9464(var1.getServerWorld())
         .method36454(Class9525.field44330, var1)
         .method36454(Class9525.field44335, var1.getPositionVec())
         .method36450(var1.method3013())
         .method36460(Class8524.field38289);
      boolean var5 = false;

      for (ResourceLocation var9 : this.field38666) {
         for (ItemStack var11 : var1.field4856.method1411().method1058(var9).method23182(var4)) {
            if (!var1.method2945(var11)) {
               ItemEntity var12 = var1.method2882(var11, false);
               if (var12 != null) {
                  var12.method4132();
                  var12.method4127(var1.getUniqueID());
               }
            } else {
               var1.world
                  .method6743(
                     (PlayerEntity)null,
                     var1.getPosX(),
                     var1.getPosY(),
                     var1.getPosZ(),
                     Sounds.field26714,
                     Class2266.field14735,
                     0.2F,
                     ((var1.method3013().nextFloat() - var1.method3013().nextFloat()) * 0.7F + 1.0F) * 2.0F
                  );
               var5 = true;
            }
         }
      }

      if (var5) {
         var1.field4904.method18130();
      }

      if (this.field38667.length > 0) {
         var1.method2779(this.field38667);
      }

      MinecraftServer var13 = var1.field4856;
      this.field38668.method34115(var13.method1397()).ifPresent(var2 -> var13.method1397().method22825(var2, var1.getCommandSource().method20162().method20163(2)));
   }

   @Override
   public String toString() {
      return "AdvancementRewards{experience="
         + this.field38665
         + ", loot="
         + Arrays.toString(this.field38666)
         + ", recipes="
         + Arrays.toString(this.field38667)
         + ", function="
         + this.field38668
         + '}';
   }

   public JsonElement method30723() {
      if (this != field38664) {
         JsonObject var3 = new JsonObject();
         if (this.field38665 != 0) {
            var3.addProperty("experience", this.field38665);
         }

         if (this.field38666.length > 0) {
            JsonArray var4 = new JsonArray();

            for (ResourceLocation var8 : this.field38666) {
               var4.add(var8.toString());
            }

            var3.add("loot", var4);
         }

         if (this.field38667.length > 0) {
            JsonArray var9 = new JsonArray();

            for (ResourceLocation var13 : this.field38667) {
               var9.add(var13.toString());
            }

            var3.add("recipes", var9);
         }

         if (this.field38668.method34116() != null) {
            var3.addProperty("function", this.field38668.method34116().toString());
         }

         return var3;
      } else {
         return JsonNull.INSTANCE;
      }
   }

   public static Class8588 method30724(JsonObject var0) throws JsonParseException {
      int var3 = JSONUtils.getInt(var0, "experience", 0);
      JsonArray var4 = JSONUtils.method32786(var0, "loot", new JsonArray());
      ResourceLocation[] var5 = new ResourceLocation[var4.size()];

      for (int var6 = 0; var6 < var5.length; var6++) {
         var5[var6] = new ResourceLocation(JSONUtils.method32762(var4.get(var6), "loot[" + var6 + "]"));
      }

      JsonArray var9 = JSONUtils.method32786(var0, "recipes", new JsonArray());
      ResourceLocation[] var7 = new ResourceLocation[var9.size()];

      for (int var8 = 0; var8 < var7.length; var8++) {
         var7[var8] = new ResourceLocation(JSONUtils.method32762(var9.get(var8), "recipes[" + var8 + "]"));
      }

      Class9137 var10;
      if (!var0.has("function")) {
         var10 = Class9137.field41987;
      } else {
         var10 = new Class9137(new ResourceLocation(JSONUtils.method32763(var0, "function")));
      }

      return new Class8588(var3, var5, var7, var10);
   }
}
