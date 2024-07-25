package remapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class class_9339 {
   private static String[] field_47668;
   private final String field_47669;
   private final class_8126[] field_47670;

   public class_9339(String var1, class_8126[] var2) {
      this.field_47669 = var1;
      this.field_47670 = var2;
   }

   public ITextComponent method_43112(class_9155 var1, boolean var2) throws CommandSyntaxException {
      if (this.field_47670.length != 0 && var2) {
         StringTextComponent var5 = new StringTextComponent(this.field_47669.substring(0, this.field_47670[0].method_36969()));
         int var6 = this.field_47670[0].method_36969();

         for (class_8126 var10 : this.field_47670) {
            ITextComponent var11 = var10.method_36971(var1);
            if (var6 < var10.method_36969()) {
               var5.appendString(this.field_47669.substring(var6, var10.method_36969()));
            }

            if (var11 != null) {
               var5.append(var11);
            }

            var6 = var10.method_36970();
         }

         if (var6 < this.field_47669.length()) {
            var5.appendString(this.field_47669.substring(var6, this.field_47669.length()));
         }

         return var5;
      } else {
         return new StringTextComponent(this.field_47669);
      }
   }

   public static class_9339 method_43113(StringReader var0, boolean var1) throws CommandSyntaxException {
      String var4 = var0.getString().substring(var0.getCursor(), var0.getTotalLength());
      if (!var1) {
         var0.setCursor(var0.getTotalLength());
         return new class_9339(var4, new class_8126[0]);
      } else {
         ArrayList var5 = Lists.newArrayList();
         int var6 = var0.getCursor();

         while (true) {
            int var7;
            class_4550 var9;
            while (true) {
               if (!var0.canRead()) {
                  return new class_9339(var4, var5.<class_8126>toArray(new class_8126[var5.size()]));
               }

               if (var0.peek() == '@') {
                  var7 = var0.getCursor();

                  try {
                     class_4964 var8 = new class_4964(var0);
                     var9 = var8.method_22744();
                     break;
                  } catch (CommandSyntaxException var10) {
                     if (var10.getType() != class_4964.field_25695 && var10.getType() != class_4964.field_25683) {
                        throw var10;
                     }

                     var0.setCursor(var7 + 1);
                  }
               } else {
                  var0.skip();
               }
            }

            var5.add(new class_8126(var7 - var6, var0.getCursor() - var6, var9));
         }
      }
   }
}
