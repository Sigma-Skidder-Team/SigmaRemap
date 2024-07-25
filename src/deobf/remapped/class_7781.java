package remapped;

import com.google.gson.JsonElement;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Function;
import javax.annotation.Nullable;

public class class_7781 extends class_6083<Integer> {
   private static String[] field_39440;
   public static final class_7781 field_39439 = new class_7781((Integer)null, (Integer)null);
   private final Long field_39442;
   private final Long field_39441;

   private static class_7781 method_35306(StringReader var0, Integer var1, Integer var2) throws CommandSyntaxException {
      if (var1 != null && var2 != null && var1 > var2) {
         throw field_31130.createWithContext(var0);
      } else {
         return new class_7781(var1, var2);
      }
   }

   @Nullable
   private static Long method_35311(Integer var0) {
      return var0 != null ? var0.longValue() * var0.longValue() : null;
   }

   private class_7781(Integer var1, Integer var2) {
      super(var1, var2);
      this.field_39442 = method_35311(var1);
      this.field_39441 = method_35311(var2);
   }

   public static class_7781 method_35312(int var0) {
      return new class_7781(var0, var0);
   }

   public static class_7781 method_35305(int var0) {
      return new class_7781(var0, (Integer)null);
   }

   public boolean method_35307(int var1) {
      return this.field_31129 != null && this.field_31129 > var1 ? false : this.field_31128 == null || this.field_31128 >= var1;
   }

   public static class_7781 method_35310(JsonElement var0) {
      return method_27857(var0, field_39439, class_6539::method_29766, class_7781::new);
   }

   public static class_7781 method_35308(StringReader var0) throws CommandSyntaxException {
      return method_35309(var0, var0x -> var0x);
   }

   public static class_7781 method_35309(StringReader var0, Function<Integer, Integer> var1) throws CommandSyntaxException {
      return method_27856(var0, class_7781::method_35306, Integer::parseInt, CommandSyntaxException.BUILT_IN_EXCEPTIONS::readerInvalidInt, var1);
   }
}
