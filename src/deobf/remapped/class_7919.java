package remapped;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;

public class class_7919 extends DataFix {
   private static String[] field_40536;
   private final String field_40537;
   private final TypeReference field_40538;

   public class_7919(Schema var1, String var2, TypeReference var3) {
      super(var1, true);
      this.field_40537 = var2;
      this.field_40538 = var3;
   }

   public TypeRewriteRule makeRule() {
      return this.writeAndRead(this.field_40537, this.getInputSchema().getType(this.field_40538), this.getOutputSchema().getType(this.field_40538));
   }
}
