package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;

public class class_98 {
   private final int field_230;
   private final int field_228;
   private final int field_227;
   private final int field_225;
   private final class_7599 field_229;

   public class_98(int var1, int var2, int var3, int var4, class_7599 var5) {
      this.field_230 = var1;
      this.field_228 = var2;
      this.field_227 = var3;
      this.field_225 = var4;
      this.field_229 = var5;
   }

   public int method_290() {
      return this.field_230;
   }

   public int method_285() {
      return this.field_228;
   }

   public int method_286() {
      return this.field_227;
   }

   public <T> Dynamic<T> method_289(DynamicOps<T> var1) {
      Builder var4 = ImmutableMap.builder();
      var4.put(var1.createString("source_x"), var1.createInt(this.field_230))
         .put(var1.createString("source_ground_y"), var1.createInt(this.field_228))
         .put(var1.createString("source_z"), var1.createInt(this.field_227))
         .put(var1.createString("delta_y"), var1.createInt(this.field_225))
         .put(var1.createString("dest_proj"), var1.createString(this.field_229.method_34507()));
      return new Dynamic(var1, var1.createMap(var4.build()));
   }

   public static <T> class_98 method_287(Dynamic<T> var0) {
      return new class_98(
         var0.get("source_x").asInt(0),
         var0.get("source_ground_y").asInt(0),
         var0.get("source_z").asInt(0),
         var0.get("delta_y").asInt(0),
         class_7599.method_34509(var0.get("dest_proj").asString(""))
      );
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            class_98 var4 = (class_98)var1;
            if (this.field_230 != var4.field_230) {
               return false;
            } else if (this.field_227 != var4.field_227) {
               return false;
            } else {
               return this.field_225 == var4.field_225 ? this.field_229 == var4.field_229 : false;
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field_230;
      var3 = 31 * var3 + this.field_228;
      var3 = 31 * var3 + this.field_227;
      var3 = 31 * var3 + this.field_225;
      return 31 * var3 + this.field_229.hashCode();
   }

   @Override
   public String toString() {
      return "JigsawJunction{sourceX="
         + this.field_230
         + ", sourceGroundY="
         + this.field_228
         + ", sourceZ="
         + this.field_227
         + ", deltaY="
         + this.field_225
         + ", destProjection="
         + this.field_229
         + '}';
   }
}
