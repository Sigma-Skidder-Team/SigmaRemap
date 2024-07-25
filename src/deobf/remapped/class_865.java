package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;

public class class_865 {
   public static final class_865 field_4485 = new class_865(
      class_6411.field_32747,
      class_6254.field_31981,
      class_5093.field_26274,
      class_8286.field_42476,
      class_6000.field_30559,
      class_7269.field_37227,
      class_766.field_4155,
      class_7780.field_39437,
      class_5640.field_28605,
      (String)null,
      (class_4639)null
   );
   private final class_6411 field_4487;
   private final class_6254 field_4489;
   private final class_5093 field_4491;
   private final class_8286 field_4481;
   private final class_6000 field_4486;
   private final class_7269 field_4482;
   private final class_766 field_4488;
   private final class_7780 field_4479;
   private final class_5640 field_4477;
   private final class_865 field_4478;
   private final class_865 field_4490;
   private final String field_4484;
   private final class_4639 field_4483;

   private class_865(
      class_6411 var1,
      class_6254 var2,
      class_5093 var3,
      class_8286 var4,
      class_6000 var5,
      class_7269 var6,
      class_766 var7,
      class_7780 var8,
      class_5640 var9,
      String var10,
      class_4639 var11
   ) {
      this.field_4487 = var1;
      this.field_4489 = var2;
      this.field_4491 = var3;
      this.field_4481 = var4;
      this.field_4486 = var5;
      this.field_4482 = var6;
      this.field_4488 = var7;
      this.field_4479 = var8;
      this.field_4477 = var9;
      this.field_4478 = this;
      this.field_4490 = this;
      this.field_4484 = var10;
      this.field_4483 = var11;
   }

   private class_865(
      class_6411 var1,
      class_6254 var2,
      class_5093 var3,
      class_8286 var4,
      class_6000 var5,
      class_7269 var6,
      class_766 var7,
      class_7780 var8,
      class_5640 var9,
      class_865 var10,
      class_865 var11,
      String var12,
      class_4639 var13
   ) {
      this.field_4487 = var1;
      this.field_4489 = var2;
      this.field_4491 = var3;
      this.field_4481 = var4;
      this.field_4486 = var5;
      this.field_4482 = var6;
      this.field_4488 = var7;
      this.field_4479 = var8;
      this.field_4477 = var9;
      this.field_4478 = var10;
      this.field_4490 = var11;
      this.field_4484 = var12;
      this.field_4483 = var13;
   }

   public boolean method_3737(class_9359 var1, class_8145 var2) {
      return this.method_3736(var1.method_43235(), var1.method_37245(), var2);
   }

   public boolean method_3736(class_6331 var1, class_1343 var2, class_8145 var3) {
      if (this != field_4485) {
         if (var3 == null) {
            return false;
         } else if (this.field_4487.method_29249(var3.method_37387())) {
            if (var2 != null) {
               if (!this.field_4489
                  .method_28548(var2.field_7336, var2.field_7333, var2.field_7334, var3.method_37302(), var3.method_37309(), var3.method_37156())) {
                  return false;
               }
            } else if (this.field_4489 != class_6254.field_31981) {
               return false;
            }

            if (!this.field_4491.method_23401(var1, var3.method_37302(), var3.method_37309(), var3.method_37156())) {
               return false;
            } else if (this.field_4481.method_38241(var3)) {
               if (!this.field_4486.method_27392(var3)) {
                  return false;
               } else if (this.field_4482.method_33214(var3)) {
                  if (!this.field_4488.method_3453(var3)) {
                     return false;
                  } else if (this.field_4479.method_35301(var3)) {
                     if (!this.field_4477.method_25539(var3)) {
                        return false;
                     } else if (this.field_4478.method_3736(var1, var2, var3.method_37243())) {
                        if (!this.field_4490.method_3736(var1, var2, !(var3 instanceof class_5886) ? null : ((class_5886)var3).method_17809())) {
                           return false;
                        } else {
                           if (this.field_4484 != null) {
                              class_5086 var6 = var3.method_37095();
                              if (var6 == null || !this.field_4484.equals(var6.method_23383())) {
                                 return false;
                              }
                           }

                           return this.field_4483 == null || var3 instanceof class_5583 && ((class_5583)var3).method_25352().equals(this.field_4483);
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

   public static class_865 method_3740(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var3 = class_6539.method_29782(var0, "entity");
         class_6411 var4 = class_6411.method_29245(var3.get("type"));
         class_6254 var5 = class_6254.method_28552(var3.get("distance"));
         class_5093 var6 = class_5093.method_23396(var3.get("location"));
         class_8286 var7 = class_8286.method_38243(var3.get("effects"));
         class_6000 var8 = class_6000.method_27395(var3.get("nbt"));
         class_7269 var9 = class_7269.method_33213(var3.get("flags"));
         class_766 var10 = class_766.method_3454(var3.get("equipment"));
         class_7780 var11 = class_7780.method_35297(var3.get("player"));
         class_5640 var12 = class_5640.method_25537(var3.get("fishing_hook"));
         class_865 var13 = method_3740(var3.get("vehicle"));
         class_865 var14 = method_3740(var3.get("targeted_entity"));
         String var15 = class_6539.method_29797(var3, "team", (String)null);
         class_4639 var16 = !var3.has("catType") ? null : new class_4639(class_6539.method_29796(var3, "catType"));
         return new class_2184()
            .method_10133(var4)
            .method_10128(var5)
            .method_10141(var6)
            .method_10142(var7)
            .method_10124(var8)
            .method_10126(var9)
            .method_10137(var10)
            .method_10140(var11)
            .method_10130(var12)
            .method_10136(var15)
            .method_10131(var13)
            .method_10129(var14)
            .method_10135(var16)
            .method_10139();
      } else {
         return field_4485;
      }
   }

   public JsonElement method_3735() {
      if (this != field_4485) {
         JsonObject var3 = new JsonObject();
         var3.add("type", this.field_4487.method_29250());
         var3.add("distance", this.field_4489.method_28551());
         var3.add("location", this.field_4491.method_23398());
         var3.add("effects", this.field_4481.method_38236());
         var3.add("nbt", this.field_4486.method_27396());
         var3.add("flags", this.field_4482.method_33211());
         var3.add("equipment", this.field_4488.method_3452());
         var3.add("player", this.field_4479.method_35298());
         var3.add("fishing_hook", this.field_4477.method_25538());
         var3.add("vehicle", this.field_4478.method_3735());
         var3.add("targeted_entity", this.field_4490.method_3735());
         var3.addProperty("team", this.field_4484);
         if (this.field_4483 != null) {
            var3.addProperty("catType", this.field_4483.toString());
         }

         return var3;
      } else {
         return JsonNull.INSTANCE;
      }
   }

   public static class_2792 method_3739(class_9359 var0, class_8145 var1) {
      return new class_8480(var0.method_43235())
         .method_39065(class_8712.field_44676, var1)
         .method_39065(class_8712.field_44671, var0.method_37245())
         .method_39068(var0.method_26594())
         .method_39064(class_4933.field_25573);
   }
}
