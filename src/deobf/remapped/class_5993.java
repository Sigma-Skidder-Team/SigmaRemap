package remapped;

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
import net.minecraft.util.text.ITextComponent$class_40;
import net.minecraft.util.text.StringTextComponent;
import org.apache.commons.lang3.StringUtils;

public class class_5993 extends DataFix {
   public class_5993(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public Dynamic<?> method_27380(Dynamic<?> var1) {
      return var1.update("pages", var1x -> (Dynamic)DataFixUtils.orElse(var1x.asStreamOpt().map(var0x -> var0x.<Dynamic>map(var0xx -> {
               if (!var0xx.asString().result().isPresent()) {
                  return (Dynamic)var0xx;
               } else {
                  String var3 = var0xx.asString("");
                  Object var4 = null;
                  if (!"null".equals(var3) && !StringUtils.isEmpty(var3)) {
                     if (var3.charAt(0) == '"' && var3.charAt(var3.length() - 1) == '"' || var3.charAt(0) == '{' && var3.charAt(var3.length() - 1) == '}') {
                        try {
                           var4 = class_6539.<ITextComponent>method_29804(class_2128.field_10652, var3, ITextComponent.class, true);
                           if (var4 == null) {
                              var4 = StringTextComponent.EMPTY;
                           }
                        } catch (JsonParseException var8) {
                        }

                        if (var4 == null) {
                           try {
                              var4 = ITextComponent$class_40.func_240643_a_(var3);
                           } catch (JsonParseException var7) {
                           }
                        }

                        if (var4 == null) {
                           try {
                              var4 = ITextComponent$class_40.func_240644_b_(var3);
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

                  return var0xx.createString(ITextComponent$class_40.toJson((ITextComponent)var4));
               }
            })).map(var1::createList).result(), var1.emptyList()));
   }

   public TypeRewriteRule makeRule() {
      Type var3 = this.getInputSchema().getType(class_4002.field_19433);
      OpticFinder var4 = var3.findField("tag");
      return this.fixTypeEverywhereTyped(
         "ItemWrittenBookPagesStrictJsonFix", var3, var2 -> var2.updateTyped(var4, var1x -> var1x.update(DSL.remainderFinder(), this::method_27380))
      );
   }
}
