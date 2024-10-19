package mapped;

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

import net.minecraft.util.JSONUtils;
import net.minecraft.util.text.TranslationTextComponent;

public abstract class Class8839<T extends Number> {
   public static final SimpleCommandExceptionType field39931 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.range.empty"));
   public static final SimpleCommandExceptionType field39932 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.range.swapped"));
   public final T field39933;
   public final T field39934;

   public Class8839(T var1, T var2) {
      this.field39933 = (T)var1;
      this.field39934 = (T)var2;
   }

   @Nullable
   public T method32002() {
      return this.field39933;
   }

   @Nullable
   public T method32003() {
      return this.field39934;
   }

   public boolean method32004() {
      return this.field39933 == null && this.field39934 == null;
   }

   public JsonElement method32005() {
      if (!this.method32004()) {
         if (this.field39933 != null && this.field39933.equals(this.field39934)) {
            return new JsonPrimitive(this.field39933);
         } else {
            JsonObject var3 = new JsonObject();
            if (this.field39933 != null) {
               var3.addProperty("min", this.field39933);
            }

            if (this.field39934 != null) {
               var3.addProperty("max", this.field39934);
            }

            return var3;
         }
      } else {
         return JsonNull.INSTANCE;
      }
   }

   public static <T extends Number, R extends Class8839<T>> R method32006(
      JsonElement var0, R var1, BiFunction<JsonElement, String, T> var2, Class9360<T, R> var3
   ) {
      if (var0 == null || var0.isJsonNull()) {
         return var1;
      } else if (!JSONUtils.method32757(var0)) {
         JsonObject var9 = JSONUtils.getJSONObject(var0, "value");
         T var7 = !var9.has("min") ? null : var2.apply(var9.get("min"), "min");
         T var8 = !var9.has("max") ? null : var2.apply(var9.get("max"), "max");
         return var3.method35440(var7, var8);
      } else {
         T var6 = var2.apply(var0, "value");
         return var3.method35440(var6, var6);
      }
   }

   public static <T extends Number, R extends Class8839<T>> R method32007(
      StringReader var0, Class9521<T, R> var1, Function<String, T> var2, Supplier<DynamicCommandExceptionType> var3, Function<T, T> var4
   ) throws CommandSyntaxException {
      if (!var0.canRead()) {
         throw field39931.createWithContext(var0);
      } else {
         int var7 = var0.getCursor();

         try {
            T var8 = method32010(method32008(var0, var2, var3), var4);
            T var9;
            if (var0.canRead(2) && var0.peek() == '.' && var0.peek(1) == '.') {
               var0.skip();
               var0.skip();
               var9 = method32010(method32008(var0, var2, var3), var4);
               if (var8 == null && var9 == null) {
                  throw field39931.createWithContext(var0);
               }
            } else {
               var9 = var8;
            }

            if (var8 == null && var9 == null) {
               throw field39931.createWithContext(var0);
            } else {
               return (R)var1.method36787(var0, var8, var9);
            }
         } catch (CommandSyntaxException var10) {
            var0.setCursor(var7);
            throw new CommandSyntaxException(var10.getType(), var10.getRawMessage(), var10.getInput(), var7);
         }
      }
   }

   @Nullable
   private static <T extends Number> T method32008(StringReader var0, Function<String, T> var1, Supplier<DynamicCommandExceptionType> var2) throws CommandSyntaxException {
      int var5 = var0.getCursor();

      while (var0.canRead() && method32009(var0)) {
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

   private static boolean method32009(StringReader var0) {
      char var3 = var0.peek();
      if ((var3 < '0' || var3 > '9') && var3 != '-') {
         return var3 != '.' ? false : !var0.canRead(2) || var0.peek(1) != '.';
      } else {
         return true;
      }
   }

   @Nullable
   private static <T> T method32010(T var0, Function<T, T> var1) {
      return (T)(var0 != null ? var1.apply(var0) : null);
   }
}
