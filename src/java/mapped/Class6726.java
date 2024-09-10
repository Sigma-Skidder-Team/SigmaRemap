package mapped;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$Serializer;
import net.minecraft.util.text.StringTextComponent;
import org.apache.commons.lang3.StringUtils;

public class Class6726 extends Class6717 {
   public static final Gson field29439 = new GsonBuilder().registerTypeAdapter(ITextComponent.class, new Class2554()).create();

   public Class6726(Schema var1, boolean var2) {
      super(var1, var2, "BlockEntitySignTextStrictJsonFix", TypeReferences.field35386, "Sign");
   }

   private Dynamic<?> method20525(Dynamic<?> var1, String var2) {
      String var5 = var1.get(var2).asString("");
      Object var6 = null;
      if (!"null".equals(var5) && !StringUtils.isEmpty(var5)) {
         if (var5.charAt(0) == '"' && var5.charAt(var5.length() - 1) == '"' || var5.charAt(0) == '{' && var5.charAt(var5.length() - 1) == '}') {
            try {
               var6 = JSONUtils.<ITextComponent>method32793(field29439, var5, ITextComponent.class, true);
               if (var6 == null) {
                  var6 = StringTextComponent.EMPTY;
               }
            } catch (JsonParseException var10) {
            }

            if (var6 == null) {
               try {
                  var6 = ITextComponent$Serializer.func_240643_a_(var5);
               } catch (JsonParseException var9) {
               }
            }

            if (var6 == null) {
               try {
                  var6 = ITextComponent$Serializer.getComponentFromJsonLenient(var5);
               } catch (JsonParseException var8) {
               }
            }

            if (var6 == null) {
               var6 = new StringTextComponent(var5);
            }
         } else {
            var6 = new StringTextComponent(var5);
         }
      } else {
         var6 = StringTextComponent.EMPTY;
      }

      return var1.set(var2, var1.createString(ITextComponent$Serializer.toJson((ITextComponent)var6)));
   }

   @Override
   public Typed<?> method20508(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), var1x -> {
         var1x = this.method20525(var1x, "Text1");
         var1x = this.method20525(var1x, "Text2");
         var1x = this.method20525(var1x, "Text3");
         return this.method20525(var1x, "Text4");
      });
   }
}
