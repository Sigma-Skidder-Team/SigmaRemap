package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import net.minecraft.util.text.TranslationTextComponent;

public abstract class class_6083<T extends Number> {
   public static final SimpleCommandExceptionType field_31131 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.range.empty"));
   public static final SimpleCommandExceptionType field_31130 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.range.swapped"));
   public final T field_31129;
   public final T field_31128;

   public class_6083(T var1, T var2) {
      this.field_31129 = (T)var1;
      this.field_31128 = (T)var2;
   }

   @Nullable
   public T method_27854() {
      return this.field_31129;
   }

   @Nullable
   public T method_27855() {
      return this.field_31128;
   }

   public boolean method_27852() {
      return this.field_31129 == null && this.field_31128 == null;
   }

   public JsonElement method_27853() {
      if (!this.method_27852()) {
         if (this.field_31129 != null && this.field_31129.equals(this.field_31128)) {
            return new JsonPrimitive(this.field_31129);
         } else {
            JsonObject var3 = new JsonObject();
            if (this.field_31129 != null) {
               var3.addProperty("min", this.field_31129);
            }

            if (this.field_31128 != null) {
               var3.addProperty("max", this.field_31128);
            }

            return var3;
         }
      } else {
         return JsonNull.INSTANCE;
      }
   }

   public static <T extends Number, R extends class_6083<T>> R method_27857(
      JsonElement var0, R var1, BiFunction<JsonElement, String, T> var2, class_8072<T, R> var3
   ) {
      if (var0 == null || var0.isJsonNull()) {
         return (R)var1;
      } else if (!class_6539.method_29769(var0)) {
         JsonObject var9 = class_6539.method_29782(var0, "value");
         Number var7 = !var9.has("min") ? null : (Number)var2.apply(var9.get("min"), "min");
         Number var8 = !var9.has("max") ? null : (Number)var2.apply(var9.get("max"), "max");
         return (R)var3.method_36628(var7, var8);
      } else {
         Number var6 = (Number)var2.apply(var0, "value");
         return (R)var3.method_36628(var6, var6);
      }
   }

   public static <T extends Number, R extends class_6083<T>> R method_27856(
      StringReader var0, class_8699<T, R> var1, Function<String, T> var2, Supplier<DynamicCommandExceptionType> var3, Function<T, T> var4
   ) throws CommandSyntaxException {
      if (!var0.canRead()) {
         throw field_31131.createWithContext(var0);
      } else {
         int var7 = var0.getCursor();

         try {
            Number var8 = method_27850(method_27849(var0, var2, var3), var4);
            Number var9;
            if (var0.canRead(2) && var0.peek() == '.' && var0.peek(1) == '.') {
               var0.skip();
               var0.skip();
               var9 = method_27850(method_27849(var0, var2, var3), var4);
               if (var8 == null && var9 == null) {
                  throw field_31131.createWithContext(var0);
               }
            } else {
               var9 = var8;
            }

            if (var8 == null && var9 == null) {
               throw field_31131.createWithContext(var0);
            } else {
               return (R)var1.method_39931(var0, var8, var9);
            }
         } catch (CommandSyntaxException var10) {
            var0.setCursor(var7);
            throw new CommandSyntaxException(var10.getType(), var10.getRawMessage(), var10.getInput(), var7);
         }
      }
   }

   @Nullable
   private static <T extends Number> T method_27849(StringReader var0, Function<String, T> var1, Supplier<DynamicCommandExceptionType> var2) throws CommandSyntaxException {
      int var5 = var0.getCursor();

      while (var0.canRead() && method_27858(var0)) {
         var0.skip();
      }

      String var6 = var0.getString().substring(var5, var0.getCursor());
      if (var6.isEmpty()) {
         return null;
      } else {
         try {
            return (T)var1.apply(var6);
         } catch (NumberFormatException var8) {
            throw ((DynamicCommandExceptionType)var2.get()).createWithContext(var0, var6);
         }
      }
   }

   private static boolean method_27858(StringReader var0) {
      char var3 = var0.peek();
      if ((var3 < '0' || var3 > '9') && var3 != '-') {
         return var3 != '.' ? false : !var0.canRead(2) || var0.peek(1) != '.';
      } else {
         return true;
      }
   }

   @Nullable
   private static <T> T method_27850(T var0, Function<T, T> var1) {
      return (T)(var0 != null ? var1.apply(var0) : null);
   }
}
