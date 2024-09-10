package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import net.minecraft.util.text.ITextComponent$Serializer;
import net.minecraft.util.text.StringTextComponent;

public class Class7467 extends DataFix {
   public Class7467(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      OpticFinder var3 = DSL.fieldFinder("id", Class3639.method12354());
      return this.fixTypeEverywhereTyped(
         "EntityCustomNameToComponentFix", this.getInputSchema().getType(TypeReferences.ENTITY), var1 -> var1.update(DSL.remainderFinder(), var2 -> {
               Optional var5 = var1.getOptional(var3);
               return var5.isPresent() && Objects.equals(var5.get(), "minecraft:commandblock_minecart") ? var2 : method24180(var2);
            })
      );
   }

   public static Dynamic<?> method24180(Dynamic<?> var0) {
      String var3 = var0.get("CustomName").asString("");
      return !var3.isEmpty()
         ? var0.set("CustomName", var0.createString(ITextComponent$Serializer.toJson(new StringTextComponent(var3))))
         : var0.remove("CustomName");
   }
}
