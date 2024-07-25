package remapped;

import com.mojang.datafixers.schemas.Schema;
import java.util.Objects;

public class class_2530 extends class_9785 {
   public class_2530(Schema var1, boolean var2) {
      super("EntityTippedArrowFix", var1, var2);
   }

   @Override
   public String method_45177(String var1) {
      return !Objects.equals(var1, "TippedArrow") ? var1 : "Arrow";
   }
}
