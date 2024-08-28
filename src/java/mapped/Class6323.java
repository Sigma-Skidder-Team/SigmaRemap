package mapped;

import com.mojang.datafixers.schemas.Schema;
import java.util.Objects;

public class Class6323 extends Class6319 {
   public Class6323(Schema var1, boolean var2) {
      super("EntityTippedArrowFix", var1, var2);
   }

   @Override
   public String method19259(String var1) {
      return !Objects.equals(var1, "TippedArrow") ? var1 : "Arrow";
   }
}
