package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.stream.Stream;
import net.minecraft.util.text.ITextComponent$class_40;
import net.minecraft.util.text.StringTextComponent;

public class class_5767 extends DataFix {
   public class_5767(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type var3 = this.getInputSchema().getType(class_4002.field_19433);
      OpticFinder var4 = var3.findField("tag");
      return this.fixTypeEverywhereTyped(
         "Item Lore componentize",
         var3,
         var1 -> var1.updateTyped(
               var4,
               var0x -> var0x.update(
                     DSL.remainderFinder(),
                     var0xx -> var0xx.update(
                           "display",
                           var0xxx -> var0xxx.update(
                                 "Lore",
                                 var0xxxx -> (Dynamic)DataFixUtils.orElse(
                                       var0xxxx.asStreamOpt().map(class_5767::method_26077).map(var0xxxx::createList).result(), var0xxxx
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static <T> Stream<Dynamic<T>> method_26077(Stream<Dynamic<T>> var0) {
      return var0.<Dynamic<T>>map(
         var0x -> (Dynamic<T>)DataFixUtils.orElse(var0x.asString().map(class_5767::method_26078).map(var0x::createString).result(), var0x)
      );
   }

   private static String method_26078(String var0) {
      return ITextComponent$class_40.toJson(new StringTextComponent(var0));
   }
}
