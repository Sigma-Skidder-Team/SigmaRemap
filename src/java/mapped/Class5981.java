package mapped;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.gson.JsonObject;

public class Class5981 extends Class5979 {
   private final BiMap<String, String> field26056 = HashBiMap.create();

   public Class5981() {
      super("1.15", "1.16", true);
   }

   @Override
   public void method18524(JsonObject var1, JsonObject var2, JsonObject var3) {
      this.field26056.put("generic.maxHealth", "minecraft:generic.max_health");
      this.field26056.put("zombie.spawnReinforcements", "minecraft:zombie.spawn_reinforcements");
      this.field26056.put("horse.jumpStrength", "minecraft:horse.jump_strength");
      this.field26056.put("generic.followRange", "minecraft:generic.follow_range");
      this.field26056.put("generic.knockbackResistance", "minecraft:generic.knockback_resistance");
      this.field26056.put("generic.movementSpeed", "minecraft:generic.movement_speed");
      this.field26056.put("generic.flyingSpeed", "minecraft:generic.flying_speed");
      this.field26056.put("generic.attackDamage", "minecraft:generic.attack_damage");
      this.field26056.put("generic.attackKnockback", "minecraft:generic.attack_knockback");
      this.field26056.put("generic.attackSpeed", "minecraft:generic.attack_speed");
      this.field26056.put("generic.armorToughness", "minecraft:generic.armor_toughness");
   }

   public BiMap<String, String> method18555() {
      return this.field26056;
   }
}
