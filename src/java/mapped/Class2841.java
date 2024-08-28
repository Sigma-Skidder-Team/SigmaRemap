package mapped;

import java.util.function.Consumer;
import net.minecraft.util.text.TranslationTextComponent;

public class Class2841 implements Consumer<Consumer<Class7952>> {
   public void accept(Consumer<Class7952> var1) {
      Class7952 var4 = Class7999.method27304()
         .method27308(
            Blocks.field36651,
            new TranslationTextComponent("advancements.end.root.title"),
            new TranslationTextComponent("advancements.end.root.description"),
            new ResourceLocation("textures/gui/advancements/backgrounds/end.png"),
            Class1965.field12814,
            false,
            false,
            false
         )
         .method27312("entered_end", Class4488.method14156(Class1655.field9001))
         .method27317(var1, "end/root");
      Class7952 var5 = Class7999.method27304()
         .method27305(var4)
         .method27308(
            Blocks.field36711,
            new TranslationTextComponent("advancements.end.kill_dragon.title"),
            new TranslationTextComponent("advancements.end.kill_dragon.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("killed_dragon", Class4476.method14134(Class7552.method24700().method24701(Class8992.field41024)))
         .method27317(var1, "end/kill_dragon");
      Class7952 var6 = Class7999.method27304()
         .method27305(var5)
         .method27308(
            Class8514.field37966,
            new TranslationTextComponent("advancements.end.enter_end_gateway.title"),
            new TranslationTextComponent("advancements.end.enter_end_gateway.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("entered_end_gateway", Class4466.method14113(Blocks.field36886))
         .method27317(var1, "end/enter_end_gateway");
      Class7999.method27304()
         .method27305(var5)
         .method27308(
            Class8514.field38108,
            new TranslationTextComponent("advancements.end.respawn_dragon.title"),
            new TranslationTextComponent("advancements.end.respawn_dragon.description"),
            (ResourceLocation)null,
            Class1965.field12816,
            true,
            true,
            false
         )
         .method27312("summoned_dragon", Class4456.method14090(Class7552.method24700().method24701(Class8992.field41024)))
         .method27317(var1, "end/respawn_dragon");
      Class7952 var7 = Class7999.method27304()
         .method27305(var6)
         .method27308(
            Blocks.field36880,
            new TranslationTextComponent("advancements.end.find_end_city.title"),
            new TranslationTextComponent("advancements.end.find_end_city.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("in_city", Class4474.method14130(Class8576.method30649(Class2961.field18071)))
         .method27317(var1, "end/find_end_city");
      Class7999.method27304()
         .method27305(var5)
         .method27308(
            Class8514.field38114,
            new TranslationTextComponent("advancements.end.dragon_breath.title"),
            new TranslationTextComponent("advancements.end.dragon_breath.description"),
            (ResourceLocation)null,
            Class1965.field12816,
            true,
            true,
            false
         )
         .method27312("dragon_breath", Class4491.method14164(Class8514.field38114))
         .method27317(var1, "end/dragon_breath");
      Class7999.method27304()
         .method27305(var7)
         .method27308(
            Class8514.field38127,
            new TranslationTextComponent("advancements.end.levitate.title"),
            new TranslationTextComponent("advancements.end.levitate.description"),
            (ResourceLocation)null,
            Class1965.field12815,
            true,
            true,
            false
         )
         .method27310(Class9182.method34343(50))
         .method27312("levitated", Class4463.method14108(Class8884.method32327(Class8841.method32022(50.0F))))
         .method27317(var1, "end/levitate");
      Class7999.method27304()
         .method27305(var7)
         .method27308(
            Class8514.field38120,
            new TranslationTextComponent("advancements.end.elytra.title"),
            new TranslationTextComponent("advancements.end.elytra.description"),
            (ResourceLocation)null,
            Class1965.field12816,
            true,
            true,
            false
         )
         .method27312("elytra", Class4491.method14164(Class8514.field38120))
         .method27317(var1, "end/elytra");
      Class7999.method27304()
         .method27305(var5)
         .method27308(
            Blocks.field36652,
            new TranslationTextComponent("advancements.end.dragon_egg.title"),
            new TranslationTextComponent("advancements.end.dragon_egg.description"),
            (ResourceLocation)null,
            Class1965.field12816,
            true,
            true,
            false
         )
         .method27312("dragon_egg", Class4491.method14164(Blocks.field36652))
         .method27317(var1, "end/dragon_egg");
   }
}
