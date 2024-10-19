package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

import net.minecraft.util.datafix.TypeReferences;
import net.minecraft.util.text.ITextComponent$Serializer;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class7912 extends DataFix {
   public Class7912(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private Dynamic<?> method26541(Dynamic<?> var1) {
      Optional var4 = var1.get("display").result();
      if (!var4.isPresent()) {
         return var1;
      } else {
         Dynamic var5 = (Dynamic)var4.get();
         Optional var6 = var5.get("Name").asString().result();
         if (!var6.isPresent()) {
            Optional var7 = var5.get("LocName").asString().result();
            if (var7.isPresent()) {
               var5 = var5.set("Name", var5.createString(ITextComponent$Serializer.toJson(new TranslationTextComponent((String)var7.get()))));
               var5 = var5.remove("LocName");
            }
         } else {
            var5 = var5.set("Name", var5.createString(ITextComponent$Serializer.toJson(new StringTextComponent((String)var6.get()))));
         }

         return var1.set("display", var5);
      }
   }

   public TypeRewriteRule makeRule() {
      Type var3 = this.getInputSchema().getType(TypeReferences.ITEM_STACK);
      OpticFinder var4 = var3.findField("tag");
      return this.fixTypeEverywhereTyped(
         "ItemCustomNameToComponentFix", var3, var2 -> var2.updateTyped(var4, var1x -> var1x.update(DSL.remainderFinder(), this::method26541))
      );
   }
}
