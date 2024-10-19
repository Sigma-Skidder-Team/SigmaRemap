package mapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;

import net.minecraft.command.CommandSource;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.JSONToNBT;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8320 implements ArgumentType<Class9670> {
   private static final Collection<String> field35742 = Arrays.<String>asList("foo", "foo.bar", "foo[0]", "[0]", "[]", "{foo=bar}");
   public static final SimpleCommandExceptionType field35743 = new SimpleCommandExceptionType(new TranslationTextComponent("arguments.nbtpath.node.invalid"));
   public static final DynamicCommandExceptionType field35744 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("arguments.nbtpath.nothing_found", var0)
   );

   public static Class8320 method29128() {
      return new Class8320();
   }

   public static Class9670 method29129(CommandContext<CommandSource> var0, String var1) {
      return (Class9670)var0.getArgument(var1, Class9670.class);
   }

   public Class9670 parse(StringReader var1) throws CommandSyntaxException {
      ArrayList<Class8356> var4 = Lists.newArrayList();
      int var5 = var1.getCursor();
      Object2IntOpenHashMap var6 = new Object2IntOpenHashMap();
      boolean var7 = true;

      while (var1.canRead() && var1.peek() != ' ') {
         Class8356 var8 = method29130(var1, var7);
         var4.add(var8);
         var6.put(var8, var1.getCursor() - var5);
         var7 = false;
         if (var1.canRead()) {
            char var9 = var1.peek();
            if (var9 != ' ' && var9 != '[' && var9 != '{') {
               var1.expect('.');
            }
         }
      }

      return new Class9670(var1.getString().substring(var5, var1.getCursor()), var4.toArray(new Class8356[0]), var6);
   }

   private static Class8356 method29130(StringReader var0, boolean var1) throws CommandSyntaxException {
      switch (var0.peek()) {
         case '"':
            String var4 = var0.readString();
            return method29131(var0, var4);
         case '[':
            var0.skip();
            char var5 = var0.peek();
            if (var5 == '{') {
               CompoundNBT var9 = new JSONToNBT(var0).method25195();
               var0.expect(']');
               return new Class8360(var9);
            } else {
               if (var5 == ']') {
                  var0.skip();
                  return Class8361.field35911;
               }

               int var8 = var0.readInt();
               var0.expect(']');
               return new Class8355(var8);
            }
         case '{':
            if (!var1) {
               throw field35743.createWithContext(var0);
            }

            CompoundNBT var6 = new JSONToNBT(var0).method25195();
            return new Class8358(var6);
         default:
            String var7 = method29132(var0);
            return method29131(var0, var7);
      }
   }

   private static Class8356 method29131(StringReader var0, String var1) throws CommandSyntaxException {
      if (var0.canRead() && var0.peek() == '{') {
         CompoundNBT var4 = new JSONToNBT(var0).method25195();
         return new Class8357(var1, var4);
      } else {
         return new Class8359(var1);
      }
   }

   private static String method29132(StringReader var0) throws CommandSyntaxException {
      int var3 = var0.getCursor();

      while (var0.canRead() && method29133(var0.peek())) {
         var0.skip();
      }

      if (var0.getCursor() != var3) {
         return var0.getString().substring(var3, var0.getCursor());
      } else {
         throw field35743.createWithContext(var0);
      }
   }

   public Collection<String> getExamples() {
      return field35742;
   }

   private static boolean method29133(char var0) {
      return var0 != ' ' && var0 != '"' && var0 != '[' && var0 != ']' && var0 != '.' && var0 != '{' && var0 != '}';
   }

   private static Predicate<INBT> method29134(CompoundNBT var0) {
      return var1 -> NBTUtil.areNBTEquals(var0, var1, true);
   }

   // $VF: synthetic method
   public static Predicate method29137(CompoundNBT var0) {
      return method29134(var0);
   }
}
