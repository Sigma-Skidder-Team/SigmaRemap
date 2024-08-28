package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.HashMap;
import java.util.Map;

public class Class7079 extends Class7080 {
   private final Map<String, String> field30482 = new HashMap<String, String>();

   public Class7079(Class6355 var1) {
      super(var1);
      this.field30482.put("block.minecraft.flowing_water", "Flowing Water");
      this.field30482.put("block.minecraft.flowing_lava", "Flowing Lava");
      this.field30482.put("block.minecraft.bed", "Bed");
      this.field30482.put("block.minecraft.bed.not_valid", "Your home bed was missing or obstructed");
      this.field30482.put("block.minecraft.bed.set_spawn", "Respawn point set");
      this.field30482.put("block.minecraft.two_turtle_eggs", "Two Turtle Eggs");
      this.field30482.put("block.minecraft.three_turtle_eggs", "Three Turtle Eggs");
      this.field30482.put("block.minecraft.four_turtle_eggs", "Four Turtle Eggs");
      this.field30482.put("block.minecraft.banner", "Banner");
      this.field30482.put("block.minecraft.wall_banner", "Wall Banner");
      this.field30482.put("item.minecraft.zombie_pigman_spawn_egg", "Zombie Pigman Spawn Egg");
      this.field30482.put("item.minecraft.skeleton_skull", "Skeleton Skull");
      this.field30482.put("item.minecraft.wither_skeleton_skull", "Wither Skeleton Skull");
      this.field30482.put("item.minecraft.zombie_head", "Zombie Head");
      this.field30482.put("item.minecraft.creeper_head", "Creeper Head");
      this.field30482.put("item.minecraft.dragon_head", "Dragon Head");
      this.field30482.put("entity.minecraft.zombie_pigman", "Zombie Pigman");
      this.field30482.put("death.fell.accident.water", "%1$s fell out of the water");
      this.field30482.put("death.attack.netherBed.message", "%1$s was killed by %2$s");
      this.field30482.put("death.attack.netherBed.link", "Intentional Game Design");
      this.field30482.put("advancements.husbandry.break_diamond_hoe.title", "Serious Dedication");
      this.field30482.put("advancements.husbandry.break_diamond_hoe.description", "Completely use up a diamond hoe, and then reevaluate your life choices");
      this.field30482.put("biome.minecraft.nether", "Nether");
   }

   @Override
   public void method21999(JsonElement var1) {
      super.method21999(var1);
      if (var1 != null && var1.isJsonObject()) {
         JsonObject var4 = var1.getAsJsonObject();
         JsonObject var5 = var4.getAsJsonObject("score");
         if (var5 != null && !var4.has("text")) {
            JsonPrimitive var6 = var5.getAsJsonPrimitive("value");
            if (var6 != null) {
               var4.remove("score");
               var4.add("text", var6);
            }
         }
      }
   }

   @Override
   public void method22000(JsonObject var1, String var2) {
      String var5 = this.field30482.get(var2);
      if (var5 != null) {
         var1.addProperty("translate", var5);
      }
   }
}
