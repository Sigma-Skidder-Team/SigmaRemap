package mapped;

import com.google.common.collect.Sets;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.Set;

public class Class7118 extends Class7114 {
   private static final Set<String> field30635 = Sets.newHashSet();
   private static final Set<String> field30636 = Sets.newHashSet();
   private static final Set<String> field30637 = Sets.newHashSet();
   private static final Set<String> field30638 = Sets.newHashSet();
   private static final Set<String> field30639 = Sets.newHashSet();
   private static final Set<String> field30640 = Sets.newHashSet();

   public Class7118(Schema var1) {
      super(var1, Class8239.field35391);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped("EntityUUIDFixes", this.getInputSchema().getType(this.field30634), var1 -> {
         var1 = var1.update(DSL.remainderFinder(), Class7118::method22208);

         for (String var5 : field30635) {
            var1 = this.method22155(var1, var5, Class7118::method22203);
         }

         for (String var20 : field30636) {
            var1 = this.method22155(var1, var20, Class7118::method22203);
         }

         for (String var21 : field30637) {
            var1 = this.method22155(var1, var21, Class7118::method22204);
         }

         for (String var22 : field30638) {
            var1 = this.method22155(var1, var22, Class7118::method22205);
         }

         for (String var23 : field30639) {
            var1 = this.method22155(var1, var23, Class7118::method22206);
         }

         for (String var24 : field30640) {
            var1 = this.method22155(var1, var24, Class7118::method22207);
         }

         var1 = this.method22155(var1, "minecraft:bee", Class7118::method22202);
         var1 = this.method22155(var1, "minecraft:zombified_piglin", Class7118::method22202);
         var1 = this.method22155(var1, "minecraft:fox", Class7118::method22201);
         var1 = this.method22155(var1, "minecraft:item", Class7118::method22200);
         var1 = this.method22155(var1, "minecraft:shulker_bullet", Class7118::method22199);
         var1 = this.method22155(var1, "minecraft:area_effect_cloud", Class7118::method22198);
         var1 = this.method22155(var1, "minecraft:zombie_villager", Class7118::method22197);
         var1 = this.method22155(var1, "minecraft:evoker_fangs", Class7118::method22196);
         return this.method22155(var1, "minecraft:piglin", Class7118::method22195);
      });
   }

   private static Dynamic<?> method22195(Dynamic<?> var0) {
      return var0.update(
         "Brain",
         var0x -> var0x.update("memories", var0xx -> var0xx.update("minecraft:angry_at", var0xxx -> method22156(var0xxx, "value", "value").orElseGet(() -> {
                     field30633.warn("angry_at has no value.");
                     return var0xxx;
                  })))
      );
   }

   private static Dynamic<?> method22196(Dynamic<?> var0) {
      return method22158(var0, "OwnerUUID", "Owner").orElse(var0);
   }

   private static Dynamic<?> method22197(Dynamic<?> var0) {
      return method22158(var0, "ConversionPlayer", "ConversionPlayer").orElse(var0);
   }

   private static Dynamic<?> method22198(Dynamic<?> var0) {
      return method22158(var0, "OwnerUUID", "Owner").orElse(var0);
   }

   private static Dynamic<?> method22199(Dynamic<?> var0) {
      var0 = method22157(var0, "Owner", "Owner").orElse(var0);
      return method22157(var0, "Target", "Target").orElse(var0);
   }

   private static Dynamic<?> method22200(Dynamic<?> var0) {
      var0 = method22157(var0, "Owner", "Owner").orElse(var0);
      return method22157(var0, "Thrower", "Thrower").orElse(var0);
   }

   private static Dynamic<?> method22201(Dynamic<?> var0) {
      Optional<Dynamic> var3 = var0.get("TrustedUUIDs")
         .result()
         .map(var1 -> var0.createList(var1.asStream().map(var0xx -> method22160(var0xx).orElseGet(() -> {
                  field30633.warn("Trusted contained invalid data.");
                  return var0xx;
               }))));
      return (Dynamic<?>)DataFixUtils.orElse(var3.<Dynamic>map(var1 -> var0.remove("TrustedUUIDs").set("Trusted", var1)), var0);
   }

   private static Dynamic<?> method22202(Dynamic<?> var0) {
      return method22156(var0, "HurtBy", "HurtBy").orElse(var0);
   }

   private static Dynamic<?> method22203(Dynamic<?> var0) {
      Dynamic var3 = method22204(var0);
      return method22156(var3, "OwnerUUID", "Owner").orElse(var3);
   }

   private static Dynamic<?> method22204(Dynamic<?> var0) {
      Dynamic var3 = method22205(var0);
      return method22158(var3, "LoveCause", "LoveCause").orElse(var3);
   }

   private static Dynamic<?> method22205(Dynamic<?> var0) {
      return method22206(var0).update("Leash", var0x -> method22158(var0x, "UUID", "UUID").orElse(var0x));
   }

   public static Dynamic<?> method22206(Dynamic<?> var0) {
      return var0.update(
         "Attributes",
         var1 -> var0.createList(
               var1.asStream()
                  .map(
                     var0xx -> var0xx.update(
                           "Modifiers",
                           var1x -> var0xx.createList(
                                 var1x.asStream()
                                    .map(var0xxxx -> method22158(var0xxxx, "UUID", "UUID").orElse(var0xxxx))
                              )
                        )
                  )
            )
      );
   }

   private static Dynamic<?> method22207(Dynamic<?> var0) {
      return (Dynamic<?>)DataFixUtils.orElse(var0.get("OwnerUUID").result().<Dynamic>map(var1 -> var0.remove("OwnerUUID").set("Owner", var1)), var0);
   }

   public static Dynamic<?> method22208(Dynamic<?> var0) {
      return method22158(var0, "UUID", "UUID").orElse(var0);
   }

   static {
      field30635.add("minecraft:donkey");
      field30635.add("minecraft:horse");
      field30635.add("minecraft:llama");
      field30635.add("minecraft:mule");
      field30635.add("minecraft:skeleton_horse");
      field30635.add("minecraft:trader_llama");
      field30635.add("minecraft:zombie_horse");
      field30636.add("minecraft:cat");
      field30636.add("minecraft:parrot");
      field30636.add("minecraft:wolf");
      field30637.add("minecraft:bee");
      field30637.add("minecraft:chicken");
      field30637.add("minecraft:cow");
      field30637.add("minecraft:fox");
      field30637.add("minecraft:mooshroom");
      field30637.add("minecraft:ocelot");
      field30637.add("minecraft:panda");
      field30637.add("minecraft:pig");
      field30637.add("minecraft:polar_bear");
      field30637.add("minecraft:rabbit");
      field30637.add("minecraft:sheep");
      field30637.add("minecraft:turtle");
      field30637.add("minecraft:hoglin");
      field30638.add("minecraft:bat");
      field30638.add("minecraft:blaze");
      field30638.add("minecraft:cave_spider");
      field30638.add("minecraft:cod");
      field30638.add("minecraft:creeper");
      field30638.add("minecraft:dolphin");
      field30638.add("minecraft:drowned");
      field30638.add("minecraft:elder_guardian");
      field30638.add("minecraft:ender_dragon");
      field30638.add("minecraft:enderman");
      field30638.add("minecraft:endermite");
      field30638.add("minecraft:evoker");
      field30638.add("minecraft:ghast");
      field30638.add("minecraft:giant");
      field30638.add("minecraft:guardian");
      field30638.add("minecraft:husk");
      field30638.add("minecraft:illusioner");
      field30638.add("minecraft:magma_cube");
      field30638.add("minecraft:pufferfish");
      field30638.add("minecraft:zombified_piglin");
      field30638.add("minecraft:salmon");
      field30638.add("minecraft:shulker");
      field30638.add("minecraft:silverfish");
      field30638.add("minecraft:skeleton");
      field30638.add("minecraft:slime");
      field30638.add("minecraft:snow_golem");
      field30638.add("minecraft:spider");
      field30638.add("minecraft:squid");
      field30638.add("minecraft:stray");
      field30638.add("minecraft:tropical_fish");
      field30638.add("minecraft:vex");
      field30638.add("minecraft:villager");
      field30638.add("minecraft:iron_golem");
      field30638.add("minecraft:vindicator");
      field30638.add("minecraft:pillager");
      field30638.add("minecraft:wandering_trader");
      field30638.add("minecraft:witch");
      field30638.add("minecraft:wither");
      field30638.add("minecraft:wither_skeleton");
      field30638.add("minecraft:zombie");
      field30638.add("minecraft:zombie_villager");
      field30638.add("minecraft:phantom");
      field30638.add("minecraft:ravager");
      field30638.add("minecraft:piglin");
      field30639.add("minecraft:armor_stand");
      field30640.add("minecraft:arrow");
      field30640.add("minecraft:dragon_fireball");
      field30640.add("minecraft:firework_rocket");
      field30640.add("minecraft:fireball");
      field30640.add("minecraft:llama_spit");
      field30640.add("minecraft:small_fireball");
      field30640.add("minecraft:snowball");
      field30640.add("minecraft:spectral_arrow");
      field30640.add("minecraft:egg");
      field30640.add("minecraft:ender_pearl");
      field30640.add("minecraft:experience_bottle");
      field30640.add("minecraft:potion");
      field30640.add("minecraft:trident");
      field30640.add("minecraft:wither_skull");
   }
}
