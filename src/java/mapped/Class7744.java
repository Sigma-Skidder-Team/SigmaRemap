package mapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.util.ResourceLocation;

import java.util.List;

public class Class7744 {
   private final Class6797[] field33250;
   private final ResourceLocation field33251;

   public Class7744(ResourceLocation var1, Class6797[] var2) {
      this.field33251 = var1;
      this.field33250 = var2;
   }

   public ResourceLocation method25652() {
      return this.field33251;
   }

   public Class6797[] method25653() {
      return this.field33250;
   }

   public static Class7744 method25654(ResourceLocation var0, CommandDispatcher<Class6619> var1, Class6619 var2, List<String> var3) {
      List<Class6797> var6 = Lists.newArrayListWithCapacity(var3.size());

      for (int var7 = 0; var7 < var3.size(); var7++) {
         int var8 = var7 + 1;
         String var9 = ((String)var3.get(var7)).trim();
         StringReader var10 = new StringReader(var9);
         if (var10.canRead() && var10.peek() != '#') {
            if (var10.peek() == '/') {
               var10.skip();
               if (var10.peek() == '/') {
                  throw new IllegalArgumentException(
                     "Unknown or invalid command '" + var9 + "' on line " + var8 + " (if you intended to make a comment, use '#' not '//')"
                  );
               }

               String var13 = var10.readUnquotedString();
               throw new IllegalArgumentException(
                  "Unknown or invalid command '" + var9 + "' on line " + var8 + " (did you mean '" + var13 + "'? Do not use a preceding forwards slash.)"
               );
            }

            try {
               ParseResults var11 = var1.parse(var10, var2);
               if (var11.getReader().canRead()) {
                  throw Class6099.method18843(var11);
               }

               var6.add(new Class6796(var11));
            } catch (CommandSyntaxException var12) {
               throw new IllegalArgumentException("Whilst parsing command on line " + var8 + ": " + var12.getMessage());
            }
         }
      }

      return new Class7744(var0, var6.toArray(new Class6797[0]));
   }

   // $VF: synthetic method
   public static ResourceLocation method25655(Class7744 var0) {
      return var0.field33251;
   }
}
