package remapped;

import com.google.common.collect.Sets;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.Set;

public class class_8306 extends class_7784 {
   private static final Set<String> field_42551 = Sets.newHashSet();
   private static final Set<String> field_42554 = Sets.newHashSet();
   private static final Set<String> field_42549 = Sets.newHashSet();
   private static final Set<String> field_42553 = Sets.newHashSet();
   private static final Set<String> field_42552 = Sets.newHashSet();
   private static final Set<String> field_42548 = Sets.newHashSet();

   public class_8306(Schema var1) {
      super(var1, class_4002.field_19444);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped("EntityUUIDFixes", this.getInputSchema().getType(this.field_39450), var1 -> {
         var1 = var1.update(DSL.remainderFinder(), class_8306::method_38319);

         for (String var5 : field_42551) {
            var1 = this.method_35324(var1, var5, class_8306::method_38317);
         }

         for (String var20 : field_42554) {
            var1 = this.method_35324(var1, var20, class_8306::method_38317);
         }

         for (String var21 : field_42549) {
            var1 = this.method_35324(var1, var21, class_8306::method_38307);
         }

         for (String var22 : field_42553) {
            var1 = this.method_35324(var1, var22, class_8306::method_38310);
         }

         for (String var23 : field_42552) {
            var1 = this.method_35324(var1, var23, class_8306::method_38306);
         }

         for (String var24 : field_42548) {
            var1 = this.method_35324(var1, var24, class_8306::method_38316);
         }

         var1 = this.method_35324(var1, "minecraft:bee", class_8306::method_38312);
         var1 = this.method_35324(var1, "minecraft:zombified_piglin", class_8306::method_38312);
         var1 = this.method_35324(var1, "minecraft:fox", class_8306::method_38311);
         var1 = this.method_35324(var1, "minecraft:item", class_8306::method_38315);
         var1 = this.method_35324(var1, "minecraft:shulker_bullet", class_8306::method_38314);
         var1 = this.method_35324(var1, "minecraft:area_effect_cloud", class_8306::method_38318);
         var1 = this.method_35324(var1, "minecraft:zombie_villager", class_8306::method_38309);
         var1 = this.method_35324(var1, "minecraft:evoker_fangs", class_8306::method_38308);
         return this.method_35324(var1, "minecraft:piglin", class_8306::method_38313);
      });
   }

   private static Dynamic<?> method_38313(Dynamic<?> var0) {
      return var0.update(
         "Brain",
         var0x -> var0x.update("memories", var0xx -> var0xx.update("minecraft:angry_at", var0xxx -> method_35319(var0xxx, "value", "value").orElseGet(() -> {
                     field_39451.warn("angry_at has no value.");
                     return var0xxx;
                  })))
      );
   }

   private static Dynamic<?> method_38308(Dynamic<?> var0) {
      return method_35321(var0, "OwnerUUID", "Owner").orElse(var0);
   }

   private static Dynamic<?> method_38309(Dynamic<?> var0) {
      return method_35321(var0, "ConversionPlayer", "ConversionPlayer").orElse(var0);
   }

   private static Dynamic<?> method_38318(Dynamic<?> var0) {
      return method_35321(var0, "OwnerUUID", "Owner").orElse(var0);
   }

   private static Dynamic<?> method_38314(Dynamic<?> var0) {
      var0 = method_35322(var0, "Owner", "Owner").orElse(var0);
      return method_35322(var0, "Target", "Target").orElse(var0);
   }

   private static Dynamic<?> method_38315(Dynamic<?> var0) {
      var0 = method_35322(var0, "Owner", "Owner").orElse(var0);
      return method_35322(var0, "Thrower", "Thrower").orElse(var0);
   }

   private static Dynamic<?> method_38311(Dynamic<?> var0) {
      Optional var3 = var0.get("TrustedUUIDs")
         .result()
         .<Dynamic>map(var1 -> var0.createList(var1.asStream().<Dynamic>map(var0xx -> (Dynamic)method_35326((Dynamic<?>)var0xx).orElseGet(() -> {
                  field_39451.warn("Trusted contained invalid data.");
                  return (Dynamic<?>)var0xx;
               }))));
      return (Dynamic<?>)DataFixUtils.orElse(var3.<Dynamic>map(var1 -> var0.remove("TrustedUUIDs").set("Trusted", var1)), var0);
   }

   private static Dynamic<?> method_38312(Dynamic<?> var0) {
      return method_35319(var0, "HurtBy", "HurtBy").orElse(var0);
   }

   private static Dynamic<?> method_38317(Dynamic<?> var0) {
      Dynamic var3 = method_38307(var0);
      return method_35319(var3, "OwnerUUID", "Owner").orElse(var3);
   }

   private static Dynamic<?> method_38307(Dynamic<?> var0) {
      Dynamic var3 = method_38310(var0);
      return method_35321(var3, "LoveCause", "LoveCause").orElse(var3);
   }

   private static Dynamic<?> method_38310(Dynamic<?> var0) {
      return method_38306(var0).update("Leash", var0x -> method_35321(var0x, "UUID", "UUID").orElse(var0x));
   }

   public static Dynamic<?> method_38306(Dynamic<?> var0) {
      return var0.update(
         "Attributes",
         var1 -> var0.createList(
               var1.asStream()
                  .<Dynamic>map(
                     var0xx -> var0xx.update(
                           "Modifiers",
                           var1x -> var0xx.createList(
                                 var1x.asStream()
                                    .<Dynamic>map(var0xxxx -> (Dynamic)method_35321((Dynamic<?>)var0xxxx, "UUID", "UUID").orElse((Dynamic<?>)var0xxxx))
                              )
                        )
                  )
            )
      );
   }

   private static Dynamic<?> method_38316(Dynamic<?> var0) {
      return (Dynamic<?>)DataFixUtils.orElse(var0.get("OwnerUUID").result().<Dynamic>map(var1 -> var0.remove("OwnerUUID").set("Owner", var1)), var0);
   }

   public static Dynamic<?> method_38319(Dynamic<?> var0) {
      return method_35321(var0, "UUID", "UUID").orElse(var0);
   }

   static {
      field_42551.add("minecraft:donkey");
      field_42551.add("minecraft:horse");
      field_42551.add("minecraft:llama");
      field_42551.add("minecraft:mule");
      field_42551.add("minecraft:skeleton_horse");
      field_42551.add("minecraft:trader_llama");
      field_42551.add("minecraft:zombie_horse");
      field_42554.add("minecraft:cat");
      field_42554.add("minecraft:parrot");
      field_42554.add("minecraft:wolf");
      field_42549.add(field_42550[20]);
      field_42549.add("minecraft:chicken");
      field_42549.add("minecraft:cow");
      field_42549.add(field_42550[22]);
      field_42549.add("minecraft:mooshroom");
      field_42549.add("minecraft:ocelot");
      field_42549.add("minecraft:panda");
      field_42549.add("minecraft:pig");
      field_42549.add("minecraft:polar_bear");
      field_42549.add("minecraft:rabbit");
      field_42549.add("minecraft:sheep");
      field_42549.add("minecraft:turtle");
      field_42549.add("minecraft:hoglin");
      field_42553.add("minecraft:bat");
      field_42553.add("minecraft:blaze");
      field_42553.add("minecraft:cave_spider");
      field_42553.add("minecraft:cod");
      field_42553.add("minecraft:creeper");
      field_42553.add("minecraft:dolphin");
      field_42553.add("minecraft:drowned");
      field_42553.add("minecraft:elder_guardian");
      field_42553.add("minecraft:ender_dragon");
      field_42553.add("minecraft:enderman");
      field_42553.add("minecraft:endermite");
      field_42553.add("minecraft:evoker");
      field_42553.add("minecraft:ghast");
      field_42553.add("minecraft:giant");
      field_42553.add("minecraft:guardian");
      field_42553.add("minecraft:husk");
      field_42553.add("minecraft:illusioner");
      field_42553.add("minecraft:magma_cube");
      field_42553.add("minecraft:pufferfish");
      field_42553.add(field_42550[21]);
      field_42553.add("minecraft:salmon");
      field_42553.add("minecraft:shulker");
      field_42553.add("minecraft:silverfish");
      field_42553.add("minecraft:skeleton");
      field_42553.add("minecraft:slime");
      field_42553.add("minecraft:snow_golem");
      field_42553.add("minecraft:spider");
      field_42553.add("minecraft:squid");
      field_42553.add("minecraft:stray");
      field_42553.add("minecraft:tropical_fish");
      field_42553.add("minecraft:vex");
      field_42553.add("minecraft:villager");
      field_42553.add("minecraft:iron_golem");
      field_42553.add("minecraft:vindicator");
      field_42553.add("minecraft:pillager");
      field_42553.add("minecraft:wandering_trader");
      field_42553.add("minecraft:witch");
      field_42553.add("minecraft:wither");
      field_42553.add("minecraft:wither_skeleton");
      field_42553.add("minecraft:zombie");
      field_42553.add(field_42550[26]);
      field_42553.add("minecraft:phantom");
      field_42553.add("minecraft:ravager");
      field_42553.add(field_42550[28]);
      field_42552.add("minecraft:armor_stand");
      field_42548.add("minecraft:arrow");
      field_42548.add("minecraft:dragon_fireball");
      field_42548.add("minecraft:firework_rocket");
      field_42548.add("minecraft:fireball");
      field_42548.add("minecraft:llama_spit");
      field_42548.add("minecraft:small_fireball");
      field_42548.add("minecraft:snowball");
      field_42548.add("minecraft:spectral_arrow");
      field_42548.add("minecraft:egg");
      field_42548.add("minecraft:ender_pearl");
      field_42548.add("minecraft:experience_bottle");
      field_42548.add("minecraft:potion");
      field_42548.add("minecraft:trident");
      field_42548.add("minecraft:wither_skull");
   }
}
