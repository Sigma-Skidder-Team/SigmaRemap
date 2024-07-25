package remapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.HashMap;
import java.util.Map.Entry;

public class class_387 extends class_6150 {
   private IntSet field_1574;
   private IntSet field_1575;

   public class_387() {
      super("1.13.2", "1.14");
   }

   @Override
   public void method_28216(JsonObject var1, JsonObject var2, JsonObject var3) {
      JsonObject var6 = var2.getAsJsonObject("blockstates");
      HashMap var7 = new HashMap(var6.entrySet().size());

      for (Entry var9 : var6.entrySet()) {
         var7.put(((JsonElement)var9.getValue()).getAsString(), Integer.parseInt((String)var9.getKey()));
      }

      JsonObject var14 = class_3792.method_17613("heightMapData-1.14.json");
      JsonArray var15 = var14.getAsJsonArray("MOTION_BLOCKING");
      this.field_1574 = new IntOpenHashSet(var15.size(), 1.0F);

      for (JsonElement var11 : var15) {
         String var12 = var11.getAsString();
         Integer var13 = (Integer)var7.get(var12);
         if (var13 != null) {
            this.field_1574.add(var13);
         } else {
            class_3446.method_15886().method_34617().warning("Unknown blockstate " + var12 + " :(");
         }
      }

      if (class_3446.method_15884().method_25838()) {
         this.field_1575 = new IntOpenHashSet(1611, 1.0F);

         for (Entry var18 : var1.getAsJsonObject("blockstates").entrySet()) {
            String var19 = ((JsonElement)var18.getValue()).getAsString();
            if (var19.contains("_slab") || var19.contains("_stairs") || var19.contains("_wall[")) {
               this.field_1575.add(this.field_31506.method_6437(Integer.parseInt((String)var18.getKey())));
            }
         }

         this.field_1575.add(this.field_31506.method_6437(8163));

         for (int var17 = 3060; var17 <= 3067; var17++) {
            this.field_1575.add(this.field_31506.method_6437(var17));
         }
      }
   }

   public IntSet method_1882() {
      return this.field_1574;
   }

   public IntSet method_1881() {
      return this.field_1575;
   }
}
