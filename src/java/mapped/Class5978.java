package mapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.HashMap;
import java.util.Map.Entry;

public class Class5978 extends Class5979 {
   private IntSet field26036;
   private IntSet field26037;

   public Class5978() {
      super("1.13.2", "1.14");
   }

   @Override
   public void method18524(JsonObject var1, JsonObject var2, JsonObject var3) {
      JsonObject var6 = var2.getAsJsonObject("blockstates");
      HashMap var7 = new HashMap(var6.entrySet().size());

      for (Entry var9 : var6.entrySet()) {
         var7.put(((JsonElement)var9.getValue()).getAsString(), Integer.parseInt((String)var9.getKey()));
      }

      JsonObject var14 = Class8159.method28358("heightMapData-1.14.json");
      JsonArray var15 = var14.getAsJsonArray("MOTION_BLOCKING");
      this.field26036 = new IntOpenHashSet(var15.size(), 1.0F);

      for (JsonElement var11 : var15) {
         String var12 = var11.getAsString();
         Integer var13 = (Integer)var7.get(var12);
         if (var13 != null) {
            this.field26036.add(var13);
         } else {
            ViaVersion3.method27613().getLogger().warning("Unknown blockstate " + var12 + " :(");
         }
      }

      if (ViaVersion3.method27612().method21935()) {
         this.field26037 = new IntOpenHashSet(1611, 1.0F);

         for (Entry var18 : var1.getAsJsonObject("blockstates").entrySet()) {
            String var19 = ((JsonElement)var18.getValue()).getAsString();
            if (var19.contains("_slab") || var19.contains("_stairs") || var19.contains("_wall[")) {
               this.field26037.add(this.field26044.method22147(Integer.parseInt((String)var18.getKey())));
            }
         }

         this.field26037.add(this.field26044.method22147(8163));

         for (int var17 = 3060; var17 <= 3067; var17++) {
            this.field26037.add(this.field26044.method22147(var17));
         }
      }
   }

   public IntSet method18525() {
      return this.field26036;
   }

   public IntSet method18526() {
      return this.field26037;
   }
}
