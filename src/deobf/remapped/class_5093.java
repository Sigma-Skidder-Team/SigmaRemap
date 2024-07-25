package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.mojang.serialization.JsonOps;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_5093 {
   private static final Logger field_26280 = LogManager.getLogger();
   public static final class_5093 field_26274 = new class_5093(
      class_6115.field_31261,
      class_6115.field_31261,
      class_6115.field_31261,
      (class_5621<class_6325>)null,
      (class_5390<?>)null,
      (class_5621<World>)null,
      (Boolean)null,
      class_1562.field_8232,
      class_8431.field_43143,
      class_4689.field_22823
   );
   private final class_6115 field_26272;
   private final class_6115 field_26283;
   private final class_6115 field_26277;
   private final class_5621<class_6325> field_26275;
   private final class_5390<?> field_26279;
   private final class_5621<World> field_26273;
   private final Boolean field_26282;
   private final class_1562 field_26276;
   private final class_8431 field_26278;
   private final class_4689 field_26281;

   public class_5093(
      class_6115 var1,
      class_6115 var2,
      class_6115 var3,
      class_5621<class_6325> var4,
      class_5390<?> var5,
      class_5621<World> var6,
      Boolean var7,
      class_1562 var8,
      class_8431 var9,
      class_4689 var10
   ) {
      this.field_26272 = var1;
      this.field_26283 = var2;
      this.field_26277 = var3;
      this.field_26275 = var4;
      this.field_26279 = var5;
      this.field_26273 = var6;
      this.field_26282 = var7;
      this.field_26276 = var8;
      this.field_26278 = var9;
      this.field_26281 = var10;
   }

   public static class_5093 method_23400(class_5621<class_6325> var0) {
      return new class_5093(
         class_6115.field_31261,
         class_6115.field_31261,
         class_6115.field_31261,
         var0,
         (class_5390<?>)null,
         (class_5621<World>)null,
         (Boolean)null,
         class_1562.field_8232,
         class_8431.field_43143,
         class_4689.field_22823
      );
   }

   public static class_5093 method_23399(class_5621<World> var0) {
      return new class_5093(
         class_6115.field_31261,
         class_6115.field_31261,
         class_6115.field_31261,
         (class_5621<class_6325>)null,
         (class_5390<?>)null,
         var0,
         (Boolean)null,
         class_1562.field_8232,
         class_8431.field_43143,
         class_4689.field_22823
      );
   }

   public static class_5093 method_23397(class_5390<?> var0) {
      return new class_5093(
         class_6115.field_31261,
         class_6115.field_31261,
         class_6115.field_31261,
         (class_5621<class_6325>)null,
         var0,
         (class_5621<World>)null,
         (Boolean)null,
         class_1562.field_8232,
         class_8431.field_43143,
         class_4689.field_22823
      );
   }

   public boolean method_23401(class_6331 var1, double var2, double var4, double var6) {
      return this.method_23402(var1, (float)var2, (float)var4, (float)var6);
   }

   public boolean method_23402(class_6331 var1, float var2, float var3, float var4) {
      if (!this.field_26272.method_28088(var2)) {
         return false;
      } else if (this.field_26283.method_28088(var3)) {
         if (!this.field_26277.method_28088(var4)) {
            return false;
         } else if (this.field_26273 != null && this.field_26273 != var1.method_29545()) {
            return false;
         } else {
            class_1331 var7 = new class_1331((double)var2, (double)var3, (double)var4);
            boolean var8 = var1.method_29585(var7);
            Optional var9 = var1.method_2755().<class_6325>method_28813(class_8669.field_44359).method_39800(var1.method_22561(var7));
            if (!var9.isPresent()) {
               return false;
            } else if (this.field_26275 == null || var8 && this.field_26275 == var9.get()) {
               if (this.field_26279 == null || var8 && var1.method_28991().method_9525(var7, true, this.field_26279).method_14731()) {
                  if (this.field_26282 == null || var8 && this.field_26282 == class_8474.method_39005(var1, var7)) {
                     if (!this.field_26276.method_7073(var1, var7)) {
                        return false;
                     } else {
                        return this.field_26278.method_38797(var1, var7) ? this.field_26281.method_21653(var1, var7) : false;
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

   public JsonElement method_23398() {
      if (this == field_26274) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var3 = new JsonObject();
         if (!this.field_26272.method_27852() || !this.field_26283.method_27852() || !this.field_26277.method_27852()) {
            JsonObject var4 = new JsonObject();
            var4.add("x", this.field_26272.method_27853());
            var4.add("y", this.field_26283.method_27853());
            var4.add("z", this.field_26277.method_27853());
            var3.add("position", var4);
         }

         if (this.field_26273 != null) {
            World.field_33043
               .encodeStart(JsonOps.INSTANCE, this.field_26273)
               .resultOrPartial(field_26280::error)
               .ifPresent(var1 -> var3.add("dimension", var1));
         }

         if (this.field_26279 != null) {
            var3.addProperty("feature", this.field_26279.method_24556());
         }

         if (this.field_26275 != null) {
            var3.addProperty("biome", this.field_26275.method_25499().toString());
         }

         if (this.field_26282 != null) {
            var3.addProperty("smokey", this.field_26282);
         }

         var3.add("light", this.field_26276.method_7074());
         var3.add("block", this.field_26278.method_38794());
         var3.add("fluid", this.field_26281.method_21655());
         return var3;
      }
   }

   public static class_5093 method_23396(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var3 = class_6539.method_29782(var0, "location");
         JsonObject var4 = class_6539.method_29784(var3, "position", new JsonObject());
         class_6115 var5 = class_6115.method_28093(var4.get("x"));
         class_6115 var6 = class_6115.method_28093(var4.get("y"));
         class_6115 var7 = class_6115.method_28093(var4.get("z"));
         class_5621 var8 = !var3.has("dimension")
            ? null
            : Identifier.field_22655
               .parse(JsonOps.INSTANCE, var3.get("dimension"))
               .resultOrPartial(field_26280::error)
               .<class_5621>map(var0x -> class_5621.<World>method_25497(class_8669.field_44372, var0x))
               .orElse((class_5621)null);
         class_5390 var9 = !var3.has("feature") ? null : (class_5390)class_5390.field_27500.get(class_6539.method_29796(var3, "feature"));
         class_5621 var10 = null;
         if (var3.has("biome")) {
            Identifier var11 = new Identifier(class_6539.method_29796(var3, "biome"));
            var10 = class_5621.<class_6325>method_25497(class_8669.field_44359, var11);
         }

         Boolean var15 = !var3.has("smokey") ? null : var3.get("smokey").getAsBoolean();
         class_1562 var12 = class_1562.method_7071(var3.get("light"));
         class_8431 var13 = class_8431.method_38796(var3.get("block"));
         class_4689 var14 = class_4689.method_21656(var3.get("fluid"));
         return new class_5093(var5, var6, var7, var10, var9, var8, var15, var12, var13, var14);
      } else {
         return field_26274;
      }
   }
}
