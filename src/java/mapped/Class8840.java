package mapped;

import com.google.gson.JsonElement;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Function;
import javax.annotation.Nullable;

public class Class8840 extends Class8839<Integer> {
   private static String[] field39935;
   public static final Class8840 field39936 = new Class8840((Integer)null, (Integer)null);
   private final Long field39937;
   private final Long field39938;

   private static Class8840 method32011(StringReader var0, Integer var1, Integer var2) throws CommandSyntaxException {
      if (var1 != null && var2 != null && var1 > var2) {
         throw field39932.createWithContext(var0);
      } else {
         return new Class8840(var1, var2);
      }
   }

   @Nullable
   private static Long method32012(Integer var0) {
      return var0 != null ? var0.longValue() * var0.longValue() : null;
   }

   private Class8840(Integer var1, Integer var2) {
      super(var1, var2);
      this.field39937 = method32012(var1);
      this.field39938 = method32012(var2);
   }

   public static Class8840 method32013(int var0) {
      return new Class8840(var0, var0);
   }

   public static Class8840 method32014(int var0) {
      return new Class8840(var0, (Integer)null);
   }

   public boolean method32015(int var1) {
      return this.field39933 != null && this.field39933 > var1 ? false : this.field39934 == null || this.field39934 >= var1;
   }

   public static Class8840 method32016(JsonElement var0) {
      return method32006(var0, field39936, JSONUtils::method32776, Class8840::new);
   }

   public static Class8840 method32017(StringReader var0) throws CommandSyntaxException {
      return method32018(var0, var0x -> var0x);
   }

   public static Class8840 method32018(StringReader var0, Function<Integer, Integer> var1) throws CommandSyntaxException {
      return method32007(var0, Class8840::method32011, Integer::parseInt, CommandSyntaxException.BUILT_IN_EXCEPTIONS::readerInvalidInt, var1);
   }
}
