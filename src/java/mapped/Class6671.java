package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.scoreboard.Team;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.server.ServerWorld;

public class Class6671 {
   public static final Class6671 field29242 = new Class6671(
      Class8924.field40401,
      Class8884.field40200,
      Class8576.field38559,
      Class9415.field43676,
      Class8811.field39645,
      Class9157.field42036,
      Class6597.field29027,
      Class9281.field42697,
      Class8713.field39324,
      (String)null,
      (ResourceLocation)null
   );
   private final Class8924 field29243;
   private final Class8884 field29244;
   private final Class8576 field29245;
   private final Class9415 field29246;
   private final Class8811 field29247;
   private final Class9157 field29248;
   private final Class6597 field29249;
   private final Class9281 field29250;
   private final Class8713 field29251;
   private final Class6671 field29252;
   private final Class6671 field29253;
   private final String field29254;
   private final ResourceLocation field29255;

   private Class6671(
      Class8924 var1,
      Class8884 var2,
      Class8576 var3,
      Class9415 var4,
      Class8811 var5,
      Class9157 var6,
      Class6597 var7,
      Class9281 var8,
      Class8713 var9,
      String var10,
      ResourceLocation var11
   ) {
      this.field29243 = var1;
      this.field29244 = var2;
      this.field29245 = var3;
      this.field29246 = var4;
      this.field29247 = var5;
      this.field29248 = var6;
      this.field29249 = var7;
      this.field29250 = var8;
      this.field29251 = var9;
      this.field29252 = this;
      this.field29253 = this;
      this.field29254 = var10;
      this.field29255 = var11;
   }

   public Class6671(
           Class8924 var1,
           Class8884 var2,
           Class8576 var3,
           Class9415 var4,
           Class8811 var5,
           Class9157 var6,
           Class6597 var7,
           Class9281 var8,
           Class8713 var9,
           Class6671 var10,
           Class6671 var11,
           String var12,
           ResourceLocation var13
   ) {
      this.field29243 = var1;
      this.field29244 = var2;
      this.field29245 = var3;
      this.field29246 = var4;
      this.field29247 = var5;
      this.field29248 = var6;
      this.field29249 = var7;
      this.field29250 = var8;
      this.field29251 = var9;
      this.field29252 = var10;
      this.field29253 = var11;
      this.field29254 = var12;
      this.field29255 = var13;
   }

   public boolean method20328(ServerPlayerEntity var1, Entity var2) {
      return this.method20329(var1.getServerWorld(), var1.getPositionVec(), var2);
   }

   public boolean method20329(ServerWorld var1, Vector3d var2, Entity var3) {
      if (this != field29242) {
         if (var3 == null) {
            return false;
         } else if (this.field29243.method32624(var3.getType())) {
            if (var2 != null) {
               if (!this.field29244.method32328(var2.x, var2.y, var2.z, var3.getPosX(), var3.getPosY(), var3.getPosZ())) {
                  return false;
               }
            } else if (this.field29244 != Class8884.field40200) {
               return false;
            }

            if (!this.field29245.method30650(var1, var3.getPosX(), var3.getPosY(), var3.getPosZ())) {
               return false;
            } else if (this.field29246.method36121(var3)) {
               if (!this.field29247.method31809(var3)) {
                  return false;
               } else if (this.field29248.method34187(var3)) {
                  if (!this.field29249.method19997(var3)) {
                     return false;
                  } else if (this.field29250.method34996(var3)) {
                     if (!this.field29251.method31429(var3)) {
                        return false;
                     } else if (this.field29252.method20329(var1, var2, var3.getRidingEntity())) {
                        if (!this.field29253.method20329(var1, var2, !(var3 instanceof MobEntity) ? null : ((MobEntity)var3).method4232())) {
                           return false;
                        } else {
                           if (this.field29254 != null) {
                              Team var6 = var3.getTeam();
                              if (var6 == null || !this.field29254.equals(var6.method28567())) {
                                 return false;
                              }
                           }

                           return this.field29255 == null || var3 instanceof Class1098 && ((Class1098)var3).method5249().equals(this.field29255);
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
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   public static Class6671 method20330(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var3 = JSONUtils.getJSONObject(var0, "entity");
         Class8924 var4 = Class8924.method32626(var3.get("type"));
         Class8884 var5 = Class8884.method32329(var3.get("distance"));
         Class8576 var6 = Class8576.method30653(var3.get("location"));
         Class9415 var7 = Class9415.method36124(var3.get("effects"));
         Class8811 var8 = Class8811.method31812(var3.get("nbt"));
         Class9157 var9 = Class9157.method34189(var3.get("flags"));
         Class6597 var10 = Class6597.method19998(var3.get("equipment"));
         Class9281 var11 = Class9281.method34997(var3.get("player"));
         Class8713 var12 = Class8713.method31427(var3.get("fishing_hook"));
         Class6671 var13 = method20330(var3.get("vehicle"));
         Class6671 var14 = method20330(var3.get("targeted_entity"));
         String var15 = JSONUtils.getString(var3, "team", (String)null);
         ResourceLocation var16 = !var3.has("catType") ? null : new ResourceLocation(JSONUtils.getString(var3, "catType"));
         return new Class7552()
            .method24704(var4)
            .method24705(var5)
            .method24706(var6)
            .method24707(var7)
            .method24708(var8)
            .method24709(var9)
            .method24710(var10)
            .method24711(var11)
            .method24712(var12)
            .method24715(var15)
            .method24713(var13)
            .method24714(var14)
            .method24716(var16)
            .method24717();
      } else {
         return field29242;
      }
   }

   public JsonElement method20331() {
      if (this != field29242) {
         JsonObject var3 = new JsonObject();
         var3.add("type", this.field29243.method32625());
         var3.add("distance", this.field29244.method32330());
         var3.add("location", this.field29245.method30652());
         var3.add("effects", this.field29246.method36125());
         var3.add("nbt", this.field29247.method31811());
         var3.add("flags", this.field29248.method34191());
         var3.add("equipment", this.field29249.method19999());
         var3.add("player", this.field29250.method35000());
         var3.add("fishing_hook", this.field29251.method31428());
         var3.add("vehicle", this.field29252.method20331());
         var3.add("targeted_entity", this.field29253.method20331());
         var3.addProperty("team", this.field29254);
         if (this.field29255 != null) {
            var3.addProperty("catType", this.field29255.toString());
         }

         return var3;
      } else {
         return JsonNull.INSTANCE;
      }
   }

   public static LootContext method20332(ServerPlayerEntity var0, Entity var1) {
      return new Class9464(var0.getServerWorld())
         .method36454(Class9525.field44330, var1)
         .method36454(Class9525.field44335, var0.getPositionVec())
         .method36450(var0.getRNG())
         .method36460(Class8524.field38290);
   }
}
