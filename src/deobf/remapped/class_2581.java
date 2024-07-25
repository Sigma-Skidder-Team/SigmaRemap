package remapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;
import java.util.List;

public class class_2581 {
   private final class_3315[] field_12779;
   private final Identifier field_12780;

   public class_2581(Identifier var1, class_3315[] var2) {
      this.field_12780 = var1;
      this.field_12779 = var2;
   }

   public Identifier method_11746() {
      return this.field_12780;
   }

   public class_3315[] method_11748() {
      return this.field_12779;
   }

   public static class_2581 method_11750(Identifier var0, CommandDispatcher<class_9155> var1, class_9155 var2, List<String> var3) {
      ArrayList var6 = Lists.newArrayListWithCapacity(var3.size());

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
                  throw class_465.method_2234(var11);
               }

               var6.add(new class_960(var11));
            } catch (CommandSyntaxException var12) {
               throw new IllegalArgumentException("Whilst parsing command on line " + var8 + ": " + var12.getMessage());
            }
         }
      }

      return new class_2581(var0, var6.<class_3315>toArray(new class_3315[0]));
   }
}
