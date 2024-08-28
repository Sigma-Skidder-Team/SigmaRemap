package mapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;
import java.util.List;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class Class9688 {
   private static String[] field45298;
   private final String field45299;
   private final Class9373[] field45300;

   public Class9688(String var1, Class9373[] var2) {
      this.field45299 = var1;
      this.field45300 = var2;
   }

   public ITextComponent method37928(Class6619 var1, boolean var2) throws CommandSyntaxException {
      if (this.field45300.length != 0 && var2) {
         StringTextComponent var5 = new StringTextComponent(this.field45299.substring(0, this.field45300[0].method35555()));
         int var6 = this.field45300[0].method35555();

         for (Class9373 var10 : this.field45300) {
            ITextComponent var11 = var10.method35557(var1);
            if (var6 < var10.method35555()) {
               var5.appendString(this.field45299.substring(var6, var10.method35555()));
            }

            if (var11 != null) {
               var5.append(var11);
            }

            var6 = var10.method35556();
         }

         if (var6 < this.field45299.length()) {
            var5.appendString(this.field45299.substring(var6, this.field45299.length()));
         }

         return var5;
      } else {
         return new StringTextComponent(this.field45299);
      }
   }

   public static Class9688 method37929(StringReader var0, boolean var1) throws CommandSyntaxException {
      String var4 = var0.getString().substring(var0.getCursor(), var0.getTotalLength());
      if (!var1) {
         var0.setCursor(var0.getTotalLength());
         return new Class9688(var4, new Class9373[0]);
      } else {
         List<Class9373> var5 = Lists.newArrayList();
         int var6 = var0.getCursor();

         while (true) {
            int var7;
            Class8429 var9;
            while (true) {
               if (!var0.canRead()) {
                  return new Class9688(var4, var5.toArray(new Class9373[var5.size()]));
               }

               if (var0.peek() == '@') {
                  var7 = var0.getCursor();

                  try {
                     Class8533 var8 = new Class8533(var0);
                     var9 = var8.method30303();
                     break;
                  } catch (CommandSyntaxException var10) {
                     if (var10.getType() != Class8533.field38331 && var10.getType() != Class8533.field38329) {
                        throw var10;
                     }

                     var0.setCursor(var7 + 1);
                  }
               } else {
                  var0.skip();
               }
            }

            var5.add(new Class9373(var7 - var6, var0.getCursor() - var6, var9));
         }
      }
   }
}
