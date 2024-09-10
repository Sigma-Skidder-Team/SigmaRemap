package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.stream.Stream;
import net.minecraft.util.text.ITextComponent$Serializer;
import net.minecraft.util.text.StringTextComponent;

public class Class8754 extends DataFix {
   public Class8754(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type var3 = this.getInputSchema().getType(TypeReferences.field35387);
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
                                       var0xxxx.asStreamOpt().map(Class8754::method31580).map(var0xxxx::createList).result(), var0xxxx
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static <T> Stream<Dynamic<T>> method31580(Stream<Dynamic<T>> var0) {
      return var0.<Dynamic<T>>map(
         var0x -> (Dynamic<T>)DataFixUtils.orElse(var0x.asString().map(Class8754::method31581).map(var0x::createString).result(), var0x)
      );
   }

   private static String method31581(String var0) {
      return ITextComponent$Serializer.toJson(new StringTextComponent(var0));
   }
}
