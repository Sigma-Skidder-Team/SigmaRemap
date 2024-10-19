package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import net.minecraft.util.JSONUtils;

import java.util.Locale;

public class ExplorationMapSerializer extends LootFunctionSerializer<ExplorationMap> {
   public void serialize(JsonObject var1, ExplorationMap var2, JsonSerializationContext var3) {
      super.serialize(var1, var2, var3);
      if (!ExplorationMap.destination(var2).equals(ExplorationMap.field_237425_a_)) {
         var1.add("destination", var3.serialize(ExplorationMap.destination(var2).method11373()));
      }

      if (ExplorationMap.decoration(var2) != ExplorationMap.field_215910_a) {
         var1.add("decoration", var3.serialize(ExplorationMap.decoration(var2).toString().toLowerCase(Locale.ROOT)));
      }

      if (ExplorationMap.zoom(var2) != 2) {
         var1.addProperty("zoom", ExplorationMap.zoom(var2));
      }

      if (ExplorationMap.searchRadius(var2) != 50) {
         var1.addProperty("search_radius", ExplorationMap.searchRadius(var2));
      }

      if (!ExplorationMap.skipExistingChunks(var2)) {
         var1.addProperty("skip_existing_chunks", ExplorationMap.skipExistingChunks(var2));
      }
   }

   public ExplorationMap deserialize(JsonObject var1, JsonDeserializationContext var2, ILootCondition[] conditionsIn) {
      Structure<?> structure = func_237428_a_(var1);
      String s = var1.has("decoration") ? JSONUtils.getString(var1, "decoration") : "mansion";
      MapDecorationType mapdecoration = ExplorationMap.field_215910_a;

      try {
         mapdecoration = MapDecorationType.valueOf(s.toUpperCase(Locale.ROOT));
      } catch (IllegalArgumentException var12) {
         ExplorationMap.LOGGER().error("Error while parsing loot table decoration entry. Found {}. Defaulting to " + ExplorationMap.field_215910_a, s);
      }

      byte b0 = JSONUtils.getByte(var1, "zoom", (byte)2);
      int i = JSONUtils.getInt(var1, "search_radius", 50);
      boolean flag = JSONUtils.getBoolean(var1, "skip_existing_chunks", true);
      return new ExplorationMap(conditionsIn, structure, mapdecoration, b0, i, flag);
   }

   private static Structure<?> func_237428_a_(JsonObject p_237428_0_) {
      if (p_237428_0_.has("destination")) {
         String s = JSONUtils.getString(p_237428_0_, "destination");
         Structure structure = (Structure) Structure.field_236365_a_.get(s.toLowerCase(Locale.ROOT));
         if (structure != null) {
            return structure;
         }
      }

      return ExplorationMap.field_237425_a_;
   }
}
