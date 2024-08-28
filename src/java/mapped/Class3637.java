package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;

public class Class3637 {
   private final int field19674;
   private final int field19675;
   private final int field19676;
   private final int field19677;
   private final Class109 field19678;

   public Class3637(int var1, int var2, int var3, int var4, Class109 var5) {
      this.field19674 = var1;
      this.field19675 = var2;
      this.field19676 = var3;
      this.field19677 = var4;
      this.field19678 = var5;
   }

   public int method12345() {
      return this.field19674;
   }

   public int method12346() {
      return this.field19675;
   }

   public int method12347() {
      return this.field19676;
   }

   public <T> Dynamic<T> method12348(DynamicOps<T> var1) {
      Builder var4 = ImmutableMap.builder();
      var4.put(var1.createString("source_x"), var1.createInt(this.field19674))
         .put(var1.createString("source_ground_y"), var1.createInt(this.field19675))
         .put(var1.createString("source_z"), var1.createInt(this.field19676))
         .put(var1.createString("delta_y"), var1.createInt(this.field19677))
         .put(var1.createString("dest_proj"), var1.createString(this.field19678.method301()));
      return new Dynamic(var1, var1.createMap(var4.build()));
   }

   public static <T> Class3637 method12349(Dynamic<T> var0) {
      return new Class3637(
         var0.get("source_x").asInt(0),
         var0.get("source_ground_y").asInt(0),
         var0.get("source_z").asInt(0),
         var0.get("delta_y").asInt(0),
         Class109.method302(var0.get("dest_proj").asString(""))
      );
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            Class3637 var4 = (Class3637)var1;
            if (this.field19674 != var4.field19674) {
               return false;
            } else if (this.field19676 != var4.field19676) {
               return false;
            } else {
               return this.field19677 == var4.field19677 ? this.field19678 == var4.field19678 : false;
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
      int var3 = this.field19674;
      var3 = 31 * var3 + this.field19675;
      var3 = 31 * var3 + this.field19676;
      var3 = 31 * var3 + this.field19677;
      return 31 * var3 + this.field19678.hashCode();
   }

   @Override
   public String toString() {
      return "JigsawJunction{sourceX="
         + this.field19674
         + ", sourceGroundY="
         + this.field19675
         + ", sourceZ="
         + this.field19676
         + ", deltaY="
         + this.field19677
         + ", destProjection="
         + this.field19678
         + '}';
   }
}
