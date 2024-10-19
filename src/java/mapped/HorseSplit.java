package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import net.minecraft.util.datafix.TypeReferences;

import java.util.Objects;

public class HorseSplit extends EntityRename {
   public HorseSplit(Schema var1, boolean var2) {
      super("EntityHorseSplitFix", var1, var2);
   }

   @Override
   public Pair<String, Typed<?>> method14620(String p_209149_1_, Typed<?> p_209149_2_) {
      Dynamic dynamic = (Dynamic)p_209149_2_.get(DSL.remainderFinder());
      if (Objects.equals("EntityHorse", p_209149_1_)) {
         int var6 = dynamic.get("Type").asInt(0);
         String s;
         switch (var6) {
            case 0:
            default:
               s = "Horse";
               break;
            case 1:
               s = "Donkey";
               break;
            case 2:
               s = "Mule";
               break;
            case 3:
               s = "ZombieHorse";
               break;
            case 4:
               s = "SkeletonHorse";
         }

         dynamic.remove("Type");
         Type<?> type = this.getOutputSchema().findChoiceType(TypeReferences.ENTITY).types().get(s);
         return Pair.of(s, (Typed<?>)((Pair)((com.mojang.serialization.DataResult < Dynamic<? >>)p_209149_2_.write()).flatMap(type::readTyped).result().orElseThrow(() ->
         {
            return new IllegalStateException("Could not parse the new horse");
         })).getFirst());
      }
      else
      {
         return Pair.of(p_209149_1_, p_209149_2_);
      }
   }
}
