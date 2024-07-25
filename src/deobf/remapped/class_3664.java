package remapped;

import java.util.function.Consumer;
import net.minecraft.util.text.TranslationTextComponent;

public class class_3664 implements Consumer<Consumer<class_3139>> {
   public void accept(Consumer<class_3139> var1) {
      class_3139 var4 = class_3321.method_15269()
         .method_15263(
            class_4783.field_23894,
            new TranslationTextComponent("advancements.end.root.title"),
            new TranslationTextComponent("advancements.end.root.description"),
            new class_4639("textures/gui/advancements/backgrounds/end.png"),
            class_3361.field_16556,
            false,
            false,
            false
         )
         .method_15272("entered_end", class_7888.method_35667(class_6486.field_33038))
         .method_15270(var1, "end/root");
      class_3139 var5 = class_3321.method_15269()
         .method_15274(var4)
         .method_15263(
            class_4783.field_23363,
            new TranslationTextComponent("advancements.end.kill_dragon.title"),
            new TranslationTextComponent("advancements.end.kill_dragon.description"),
            (class_4639)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272("killed_dragon", class_3780.method_17504(class_2184.method_10127().method_10134(class_6629.field_34310)))
         .method_15270(var1, "end/kill_dragon");
      class_3139 var6 = class_3321.method_15269()
         .method_15274(var5)
         .method_15263(
            class_4897.field_24664,
            new TranslationTextComponent("advancements.end.enter_end_gateway.title"),
            new TranslationTextComponent("advancements.end.enter_end_gateway.description"),
            (class_4639)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272("entered_end_gateway", class_5483.method_24904(class_4783.field_23824))
         .method_15270(var1, "end/enter_end_gateway");
      class_3321.method_15269()
         .method_15274(var5)
         .method_15263(
            class_4897.field_24665,
            new TranslationTextComponent("advancements.end.respawn_dragon.title"),
            new TranslationTextComponent("advancements.end.respawn_dragon.description"),
            (class_4639)null,
            class_3361.field_16561,
            true,
            true,
            false
         )
         .method_15272("summoned_dragon", class_146.method_566(class_2184.method_10127().method_10134(class_6629.field_34310)))
         .method_15270(var1, "end/respawn_dragon");
      class_3139 var7 = class_3321.method_15269()
         .method_15274(var6)
         .method_15263(
            class_4783.field_23403,
            new TranslationTextComponent("advancements.end.find_end_city.title"),
            new TranslationTextComponent("advancements.end.find_end_city.description"),
            (class_4639)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272("in_city", class_2270.method_10475(class_5093.method_23397(class_5390.field_27504)))
         .method_15270(var1, "end/find_end_city");
      class_3321.method_15269()
         .method_15274(var5)
         .method_15263(
            class_4897.field_25220,
            new TranslationTextComponent("advancements.end.dragon_breath.title"),
            new TranslationTextComponent("advancements.end.dragon_breath.description"),
            (class_4639)null,
            class_3361.field_16561,
            true,
            true,
            false
         )
         .method_15272("dragon_breath", class_6459.method_29434(class_4897.field_25220))
         .method_15270(var1, "end/dragon_breath");
      class_3321.method_15269()
         .method_15274(var7)
         .method_15263(
            class_4897.field_24877,
            new TranslationTextComponent("advancements.end.levitate.title"),
            new TranslationTextComponent("advancements.end.levitate.description"),
            (class_4639)null,
            class_3361.field_16559,
            true,
            true,
            false
         )
         .method_15258(class_7365.method_33541(50))
         .method_15272("levitated", class_7104.method_32647(class_6254.method_28549(class_6115.method_28094(50.0F))))
         .method_15270(var1, "end/levitate");
      class_3321.method_15269()
         .method_15274(var7)
         .method_15263(
            class_4897.field_24503,
            new TranslationTextComponent("advancements.end.elytra.title"),
            new TranslationTextComponent("advancements.end.elytra.description"),
            (class_4639)null,
            class_3361.field_16561,
            true,
            true,
            false
         )
         .method_15272("elytra", class_6459.method_29434(class_4897.field_24503))
         .method_15270(var1, "end/elytra");
      class_3321.method_15269()
         .method_15274(var5)
         .method_15263(
            class_4783.field_23615,
            new TranslationTextComponent("advancements.end.dragon_egg.title"),
            new TranslationTextComponent("advancements.end.dragon_egg.description"),
            (class_4639)null,
            class_3361.field_16561,
            true,
            true,
            false
         )
         .method_15272("dragon_egg", class_6459.method_29434(class_4783.field_23615))
         .method_15270(var1, "end/dragon_egg");
   }
}
