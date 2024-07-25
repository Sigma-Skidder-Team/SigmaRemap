package remapped;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.gson.JsonObject;

public class class_1907 extends class_6150 {
   private final BiMap<String, String> field_9728 = HashBiMap.create();

   public class_1907() {
      super("1.15", "1.16", true);
   }

   @Override
   public void method_28216(JsonObject var1, JsonObject var2, JsonObject var3) {
      this.field_9728.put("generic.maxHealth", "minecraft:generic.max_health");
      this.field_9728.put("zombie.spawnReinforcements", "minecraft:zombie.spawn_reinforcements");
      this.field_9728.put("horse.jumpStrength", "minecraft:horse.jump_strength");
      this.field_9728.put("generic.followRange", "minecraft:generic.follow_range");
      this.field_9728.put("generic.knockbackResistance", "minecraft:generic.knockback_resistance");
      this.field_9728.put("generic.movementSpeed", "minecraft:generic.movement_speed");
      this.field_9728.put("generic.flyingSpeed", "minecraft:generic.flying_speed");
      this.field_9728.put("generic.attackDamage", "minecraft:generic.attack_damage");
      this.field_9728.put("generic.attackKnockback", "minecraft:generic.attack_knockback");
      this.field_9728.put("generic.attackSpeed", "minecraft:generic.attack_speed");
      this.field_9728.put("generic.armorToughness", "minecraft:generic.armor_toughness");
   }

   public BiMap<String, String> method_8667() {
      return this.field_9728;
   }
}
