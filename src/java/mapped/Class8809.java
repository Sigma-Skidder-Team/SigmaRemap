package mapped;

import com.google.gson.JsonParseException;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$Serializer;
import net.minecraft.util.text.StringTextComponent;
import org.apache.commons.lang3.StringUtils;

public class Class8809 extends DataFix {
   public Class8809(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public Dynamic<?> method31804(Dynamic<?> var1) {
      return var1.update("pages", var1x -> DataFixUtils.orElse(var1x.asStreamOpt().map(var0x -> var0x.map(var0xx -> {
               if (!var0xx.asString().result().isPresent()) {
                  return var0xx;
               } else {
                  String var3 = var0xx.asString("");
                  Object var4 = null;
                  if (!"null".equals(var3) && !StringUtils.isEmpty(var3)) {
                     if (var3.charAt(0) == '"' && var3.charAt(var3.length() - 1) == '"' || var3.charAt(0) == '{' && var3.charAt(var3.length() - 1) == '}') {
                        try {
                           var4 = JSONUtils.<ITextComponent>method32793(Class6726.field29439, var3, ITextComponent.class, true);
                           if (var4 == null) {
                              var4 = StringTextComponent.EMPTY;
                           }
                        } catch (JsonParseException var8) {
                        }

                        if (var4 == null) {
                           try {
                              var4 = ITextComponent$Serializer.func_240643_a_(var3);
                           } catch (JsonParseException var7) {
                           }
                        }

                        if (var4 == null) {
                           try {
                              var4 = ITextComponent$Serializer.func_240644_b_(var3);
                           } catch (JsonParseException var6) {
                           }
                        }

                        if (var4 == null) {
                           var4 = new StringTextComponent(var3);
                        }
                     } else {
                        var4 = new StringTextComponent(var3);
                     }
                  } else {
                     var4 = StringTextComponent.EMPTY;
                  }

                  return var0xx.createString(ITextComponent$Serializer.toJson((ITextComponent)var4));
               }
            })).map(var1::createList).result(), var1.emptyList()));
   }

   public TypeRewriteRule makeRule() {
      Type var3 = this.getInputSchema().getType(Class8239.field35387);
      OpticFinder var4 = var3.findField("tag");
      return this.fixTypeEverywhereTyped(
         "ItemWrittenBookPagesStrictJsonFix", var3, var2 -> var2.updateTyped(var4, var1x -> var1x.update(DSL.remainderFinder(), this::method31804))
      );
   }
}
