package mapped;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;

public class Class4658 extends Class4653 {
   public Class4658(Schema var1, boolean var2) {
      super("EntityElderGuardianSplitFix", var1, var2);
   }

   @Override
   public Pair<String, Dynamic<?>> method14619(String var1, Dynamic<?> var2) {
      return Pair.of(Objects.equals(var1, "Guardian") && var2.get("Elder").asBoolean(false) ? "ElderGuardian" : var1, var2);
   }
}
