package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.HashMap;
import java.util.Map;

public class class_1358 extends class_9078 {
   private final Map<String, String> field_7393 = new HashMap<String, String>();

   public class_1358(class_4106 var1) {
      super(var1);
      this.field_7393.put("block.minecraft.flowing_water", "Flowing Water");
      this.field_7393.put("block.minecraft.flowing_lava", "Flowing Lava");
      this.field_7393.put("block.minecraft.bed", "Bed");
      this.field_7393.put("block.minecraft.bed.not_valid", "Your home bed was missing or obstructed");
      this.field_7393.put("block.minecraft.bed.set_spawn", "Respawn point set");
      this.field_7393.put("block.minecraft.two_turtle_eggs", "Two Turtle Eggs");
      this.field_7393.put("block.minecraft.three_turtle_eggs", "Three Turtle Eggs");
      this.field_7393.put("block.minecraft.four_turtle_eggs", "Four Turtle Eggs");
      this.field_7393.put("block.minecraft.banner", "Banner");
      this.field_7393.put("block.minecraft.wall_banner", "Wall Banner");
      this.field_7393.put("item.minecraft.zombie_pigman_spawn_egg", "Zombie Pigman Spawn Egg");
      this.field_7393.put("item.minecraft.skeleton_skull", "Skeleton Skull");
      this.field_7393.put("item.minecraft.wither_skeleton_skull", "Wither Skeleton Skull");
      this.field_7393.put("item.minecraft.zombie_head", "Zombie Head");
      this.field_7393.put("item.minecraft.creeper_head", "Creeper Head");
      this.field_7393.put("item.minecraft.dragon_head", "Dragon Head");
      this.field_7393.put("entity.minecraft.zombie_pigman", "Zombie Pigman");
      this.field_7393.put("death.fell.accident.water", "%1$s fell out of the water");
      this.field_7393.put("death.attack.netherBed.message", "%1$s was killed by %2$s");
      this.field_7393.put("death.attack.netherBed.link", "Intentional Game Design");
      this.field_7393.put("advancements.husbandry.break_diamond_hoe.title", "Serious Dedication");
      this.field_7393.put("advancements.husbandry.break_diamond_hoe.description", "Completely use up a diamond hoe, and then reevaluate your life choices");
      this.field_7393.put("biome.minecraft.nether", "Nether");
   }

   @Override
   public void method_41802(JsonElement var1) {
      super.method_41802(var1);
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
   public void method_41798(JsonObject var1, String var2) {
      String var5 = this.field_7393.get(var2);
      if (var5 != null) {
         var1.addProperty("translate", var5);
      }
   }
}
