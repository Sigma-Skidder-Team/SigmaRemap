package mapped;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import net.minecraft.util.datafix.TypeReferences;

import java.util.Map;

public class Class8725 extends DataFix {
   private static final Map<String, String> field39364 = ImmutableMap.<String, String>builder()
      .put("generic.maxHealth", "generic.max_health")
      .put("Max Health", "generic.max_health")
      .put("zombie.spawnReinforcements", "zombie.spawn_reinforcements")
      .put("Spawn Reinforcements Chance", "zombie.spawn_reinforcements")
      .put("horse.jumpStrength", "horse.jump_strength")
      .put("Jump Strength", "horse.jump_strength")
      .put("generic.followRange", "generic.follow_range")
      .put("Follow Range", "generic.follow_range")
      .put("generic.knockbackResistance", "generic.knockback_resistance")
      .put("Knockback Resistance", "generic.knockback_resistance")
      .put("generic.movementSpeed", "generic.movement_speed")
      .put("Movement Speed", "generic.movement_speed")
      .put("generic.flyingSpeed", "generic.flying_speed")
      .put("Flying Speed", "generic.flying_speed")
      .put("generic.attackDamage", "generic.attack_damage")
      .put("generic.attackKnockback", "generic.attack_knockback")
      .put("generic.attackSpeed", "generic.attack_speed")
      .put("generic.armorToughness", "generic.armor_toughness")
      .build();

   public Class8725(Schema var1) {
      super(var1, false);
   }

   public TypeRewriteRule makeRule() {
      Type var3 = this.getInputSchema().getType(TypeReferences.ITEM_STACK);
      OpticFinder var4 = var3.findField("tag");
      return TypeRewriteRule.seq(
         this.fixTypeEverywhereTyped("Rename ItemStack Attributes", var3, var1 -> var1.updateTyped(var4, Class8725::method31485)),
         new TypeRewriteRule[]{
            this.fixTypeEverywhereTyped("Rename Entity Attributes", this.getInputSchema().getType(TypeReferences.ENTITY), Class8725::method31486),
            this.fixTypeEverywhereTyped("Rename Player Attributes", this.getInputSchema().getType(TypeReferences.PLAYER), Class8725::method31486)
         }
      );
   }

   private static Dynamic<?> method31484(Dynamic<?> var0) {
      return (Dynamic<?>)DataFixUtils.orElse(var0.asString().result().<String>map(var0x -> field39364.getOrDefault(var0x, var0x)).map(var0::createString), var0);
   }

   private static Typed<?> method31485(Typed<?> var0) {
      return var0.update(
         DSL.remainderFinder(),
         var0x -> var0x.update(
               "AttributeModifiers",
               var0xx -> DataFixUtils.orElse(
                     var0xx.asStreamOpt()
                        .result()
                        .map(var0xxx -> var0xxx.map(var0xxxx -> var0xxxx.update("AttributeName", Class8725::method31484)))
                        .map(var0xx::createList),
                     var0xx
                  )
            )
      );
   }

   private static Typed<?> method31486(Typed<?> var0) {
      return var0.update(
         DSL.remainderFinder(),
         var0x -> var0x.update(
               "Attributes",
               var0xx -> DataFixUtils.orElse(
                     var0xx.asStreamOpt()
                        .result()
                        .map(var0xxx -> var0xxx.map(var0xxxx -> var0xxxx.update("Name", Class8725::method31484)))
                        .map(var0xx::createList),
                     var0xx
                  )
            )
      );
   }
}
