package net.minecraft.entity.ai.attributes;

import net.minecraft.util.registry.Registry;

public class Attributes {
   public static final Attribute MAX_HEALTH = register("generic.max_health", new RangedAttribute("attribute.name.generic.max_health", 20.0, 1.0, 1024.0).setShouldWatch(true));
   public static final Attribute FOLLOW_RANGE = register("generic.follow_range", new RangedAttribute("attribute.name.generic.follow_range", 32.0, 0.0, 2048.0));
   public static final Attribute KNOCKBACK_RESISTANCE = register("generic.knockback_resistance", new RangedAttribute("attribute.name.generic.knockback_resistance", 0.0, 0.0, 1.0));
   public static final Attribute MOVEMENT_SPEED = register("generic.movement_speed", new RangedAttribute("attribute.name.generic.movement_speed", 0.7F, 0.0, 1024.0).setShouldWatch(true));
   public static final Attribute FLYING_SPEED = register("generic.flying_speed", new RangedAttribute("attribute.name.generic.flying_speed", 0.4F, 0.0, 1024.0).setShouldWatch(true));
   public static final Attribute ATTACK_DAMAGE = register("generic.attack_damage", new RangedAttribute("attribute.name.generic.attack_damage", 2.0, 0.0, 2048.0));
   public static final Attribute ATTACK_KNOCKBACK = register("generic.attack_knockback", new RangedAttribute("attribute.name.generic.attack_knockback", 0.0, 0.0, 5.0));
   public static final Attribute ATTACK_SPEED = register("generic.attack_speed", new RangedAttribute("attribute.name.generic.attack_speed", 4.0, 0.0, 1024.0).setShouldWatch(true));
   public static final Attribute ARMOR = register("generic.armor", new RangedAttribute("attribute.name.generic.armor", 0.0, 0.0, 30.0).setShouldWatch(true));
   public static final Attribute ARMOR_TOUGHNESS = register("generic.armor_toughness", new RangedAttribute("attribute.name.generic.armor_toughness", 0.0, 0.0, 20.0).setShouldWatch(true));
   public static final Attribute LUCK = register("generic.luck", new RangedAttribute("attribute.name.generic.luck", 0.0, -1024.0, 1024.0).setShouldWatch(true));
   public static final Attribute ZOMBIE_SPAWN_REINFORCEMENTS = register("zombie.spawn_reinforcements", new RangedAttribute("attribute.name.zombie.spawn_reinforcements", 0.0, 0.0, 1.0));
   public static final Attribute HORSE_JUMP_STRENGTH = register("horse.jump_strength", new RangedAttribute("attribute.name.horse.jump_strength", 0.7, 0.0, 2.0).setShouldWatch(true));

   private static Attribute register(String var0, Attribute var1) {
      return Registry.<Attribute>register(Registry.ATTRIBUTE, var0, var1);
   }
}
