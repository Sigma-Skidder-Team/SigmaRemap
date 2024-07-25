package remapped;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$class_40;
import net.minecraft.util.text.StringTextComponent;
import org.apache.commons.lang3.StringUtils;

public class class_2128 extends class_7449 {
   public static final Gson field_10652 = new GsonBuilder().registerTypeAdapter(ITextComponent.class, new class_5873()).create();

   public class_2128(Schema var1, boolean var2) {
      super(var1, var2, "BlockEntitySignTextStrictJsonFix", class_4002.field_19434, "Sign");
   }

   private Dynamic<?> method_9936(Dynamic<?> var1, String var2) {
      String var5 = var1.get(var2).asString("");
      Object var6 = null;
      if (!"null".equals(var5) && !StringUtils.isEmpty(var5)) {
         if (var5.charAt(0) == '"' && var5.charAt(var5.length() - 1) == '"' || var5.charAt(0) == '{' && var5.charAt(var5.length() - 1) == '}') {
            try {
               var6 = class_6539.<ITextComponent>method_29804(field_10652, var5, ITextComponent.class, true);
               if (var6 == null) {
                  var6 = StringTextComponent.EMPTY;
               }
            } catch (JsonParseException var10) {
            }

            if (var6 == null) {
               try {
                  var6 = ITextComponent$class_40.func_240643_a_(var5);
               } catch (JsonParseException var9) {
               }
            }

            if (var6 == null) {
               try {
                  var6 = ITextComponent$class_40.func_240644_b_(var5);
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

      return var1.set(var2, var1.createString(ITextComponent$class_40.toJson((ITextComponent)var6)));
   }

   @Override
   public Typed<?> method_33892(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), var1x -> {
         var1x = this.method_9936(var1x, "Text1");
         var1x = this.method_9936(var1x, "Text2");
         var1x = this.method_9936(var1x, "Text3");
         return this.method_9936(var1x, "Text4");
      });
   }
}
