package remapped;

import com.google.common.base.MoreObjects;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.Properties;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class class_8377<T extends class_8377<T>> {
   private static final Logger field_42877 = LogManager.getLogger();
   private final Properties field_42876;

   public class_8377(Properties var1) {
      this.field_42876 = var1;
   }

   public static Properties method_38613(Path var0) {
      Properties var3 = new Properties();

      try (InputStream var4 = Files.newInputStream(var0)) {
         var3.load(var4);
      } catch (IOException var17) {
         field_42877.error("Failed to load properties from file: " + var0);
      }

      return var3;
   }

   public void method_38598(Path var1) {
      try (OutputStream var4 = Files.newOutputStream(var1)) {
         this.field_42876.store(var4, "Minecraft server properties");
      } catch (IOException var17) {
         field_42877.error("Failed to store properties to file: " + var1);
      }
   }

   private static <V extends Number> Function<String, V> method_38609(Function<String, V> var0) {
      return var1 -> {
         try {
            return (V)var0.apply(var1);
         } catch (NumberFormatException var5) {
            return null;
         }
      };
   }

   public static <V> Function<String, V> method_38607(IntFunction<V> var0, Function<String, V> var1) {
      return var2 -> {
         try {
            return (V)var0.apply(Integer.parseInt(var2));
         } catch (NumberFormatException var6) {
            return (V)var1.apply(var2);
         }
      };
   }

   @Nullable
   private String method_38618(String var1) {
      return (String)this.field_42876.get(var1);
   }

   @Nullable
   public <V> V method_38610(String var1, Function<String, V> var2) {
      String var5 = this.method_38618(var1);
      if (var5 != null) {
         this.field_42876.remove(var1);
         return (V)var2.apply(var5);
      } else {
         return null;
      }
   }

   public <V> V method_38602(String var1, Function<String, V> var2, Function<V, String> var3, V var4) {
      String var7 = this.method_38618(var1);
      Object var8 = MoreObjects.firstNonNull(var7 == null ? null : var2.apply(var7), var4);
      this.field_42876.put(var1, var3.apply(var8));
      return (V)var8;
   }

   public <V> class_8377<T>.Property<V> method_38596(String var1, Function<String, V> var2, Function<V, String> var3, V var4) {
      String var7 = this.method_38618(var1);
      Object var8 = MoreObjects.firstNonNull(var7 == null ? null : var2.apply(var7), var4);
      this.field_42876.put(var1, var3.apply(var8));
      return new class_8082<V>(this, var1, var8, var3, null);
   }

   public <V> V method_38597(String var1, Function<String, V> var2, UnaryOperator<V> var3, Function<V, String> var4, V var5) {
      return this.<V>method_38602(var1, var2x -> {
         Object var5x = var2.apply(var2x);
         return (V)(var5x == null ? null : var3.apply(var5x));
      }, var4, (V)var5);
   }

   public <V> V method_38617(String var1, Function<String, V> var2, V var3) {
      return this.<V>method_38602(var1, var2, Objects::toString, (V)var3);
   }

   public <V> class_8377<T>.Property<V> method_38612(String var1, Function<String, V> var2, V var3) {
      return this.<V>method_38596(var1, var2, Objects::toString, (V)var3);
   }

   public String method_38611(String var1, String var2) {
      return this.<String>method_38602(var1, Function.<String>identity(), Function.<String>identity(), var2);
   }

   @Nullable
   public String method_38614(String var1) {
      return this.<String>method_38610(var1, Function.<String>identity());
   }

   public int method_38600(String var1, int var2) {
      return this.<Integer>method_38617(var1, method_38609(Integer::parseInt), var2);
   }

   public class_8377<T>.Property<Integer> method_38608(String var1, int var2) {
      return this.<Integer>method_38612(var1, method_38609(Integer::parseInt), var2);
   }

   public int method_38603(String var1, UnaryOperator<Integer> var2, int var3) {
      return this.<Integer>method_38597(var1, method_38609(Integer::parseInt), var2, Objects::toString, var3);
   }

   public long method_38616(String var1, long var2) {
      return this.<Long>method_38617(var1, method_38609(Long::parseLong), var2);
   }

   public boolean method_38605(String var1, boolean var2) {
      return this.<Boolean>method_38617(var1, Boolean::valueOf, var2);
   }

   public class_8377<T>.Property<Boolean> method_38606(String var1, boolean var2) {
      return this.<Boolean>method_38612(var1, Boolean::valueOf, var2);
   }

   @Nullable
   public Boolean method_38599(String var1) {
      return this.<Boolean>method_38610(var1, Boolean::valueOf);
   }

   public Properties method_38604() {
      Properties var3 = new Properties();
      var3.putAll(this.field_42876);
      return var3;
   }

   public abstract T method_38601(class_6322 var1, Properties var2);
}
