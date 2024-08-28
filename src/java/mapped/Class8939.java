package mapped;

import com.google.gson.JsonArray;
import it.unimi.dsi.fastutil.objects.Object2IntMap;

public class Class8939 {
   private final Class7112 field40431;
   private final int field40432;
   private final int field40433;
   private final int field40434;

   public Class8939(JsonArray var1, Class7112 var2) {
      this.field40431 = var2;
      Object2IntMap var5 = Class8159.method28367(var1);
      this.field40432 = var5.getInt("block");
      this.field40433 = var5.getInt("falling_dust");
      this.field40434 = var5.getInt("item");
   }

   public Class7112 method32666() {
      return this.field40431;
   }

   public int method32667() {
      return this.field40432;
   }

   public int method32668() {
      return this.field40433;
   }

   public int method32669() {
      return this.field40434;
   }
}
