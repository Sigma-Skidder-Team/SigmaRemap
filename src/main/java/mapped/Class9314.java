package mapped;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;

public class Class9314 extends DataFix {
   private static String[] field43250;
   private final String field43251;
   private final TypeReference field43252;

   public Class9314(Schema var1, String var2, TypeReference var3) {
      super(var1, true);
      this.field43251 = var2;
      this.field43252 = var3;
   }

   public TypeRewriteRule makeRule() {
      return this.writeAndRead(this.field43251, this.getInputSchema().getType(this.field43252), this.getOutputSchema().getType(this.field43252));
   }
}
