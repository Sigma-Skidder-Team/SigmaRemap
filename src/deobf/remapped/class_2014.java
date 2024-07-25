package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;

public class class_2014 extends class_6131 {
   public class_2014(Schema var1, boolean var2) {
      super("EntityHorseSplitFix", var1, var2);
   }

   @Override
   public Pair<String, Typed<?>> method_28172(String var1, Typed<?> var2) {
      Dynamic var5 = (Dynamic)var2.get(DSL.remainderFinder());
      if (Objects.equals("EntityHorse", var1)) {
         int var6 = var5.get("Type").asInt(0);
         String var7;
         switch (var6) {
            case 0:
            default:
               var7 = "Horse";
               break;
            case 1:
               var7 = "Donkey";
               break;
            case 2:
               var7 = "Mule";
               break;
            case 3:
               var7 = "ZombieHorse";
               break;
            case 4:
               var7 = "SkeletonHorse";
         }

         var5.remove("Type");
         Type var8 = (Type)this.getOutputSchema().findChoiceType(class_4002.field_19444).types().get(var7);
         return Pair.of(
            var7,
            (Typed)((Pair)var2.write().flatMap(var8::readTyped).result().orElseThrow(() -> new IllegalStateException("Could not parse the new horse")))
               .getFirst()
         );
      } else {
         return Pair.of(var1, var2);
      }
   }
}
