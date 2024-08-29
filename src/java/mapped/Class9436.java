package mapped;

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
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Class9436<T extends Class9436<T>> {
   private static final Logger field43783 = LogManager.getLogger();
   private final Properties field43784;

   public Class9436(Properties var1) {
      this.field43784 = var1;
   }

   public static Properties method36246(Path var0) {
      Properties var3 = new Properties();

      try (InputStream var4 = Files.newInputStream(var0)) {
         var3.load(var4);
      } catch (IOException var17) {
         field43783.error("Failed to load properties from file: " + var0);
      }

      return var3;
   }

   public void method36247(Path var1) {
      try (OutputStream var4 = Files.newOutputStream(var1)) {
         this.field43784.store(var4, "Minecraft server properties");
      } catch (IOException var17) {
         field43783.error("Failed to store properties to file: " + var1);
      }
   }

   private static <V extends Number> Function<String, V> method36248(Function<String, V> var0) {
      return var1 -> {
         try {
            return (V)var0.apply(var1);
         } catch (NumberFormatException var5) {
            return null;
         }
      };
   }

   public static <V> Function<String, V> method36249(IntFunction<V> var0, Function<String, V> var1) {
      return var2 -> {
         try {
            return (V)var0.apply(Integer.parseInt(var2));
         } catch (NumberFormatException var6) {
            return (V)var1.apply(var2);
         }
      };
   }

   @Nullable
   private String method36250(String var1) {
      return (String)this.field43784.get(var1);
   }

   @Nullable
   public <V> V method36251(String var1, Function<String, V> var2) {
      String var5 = this.method36250(var1);
      if (var5 != null) {
         this.field43784.remove(var1);
         return (V)var2.apply(var5);
      } else {
         return null;
      }
   }

   public <V> V method36252(String var1, Function<String, V> var2, Function<V, String> var3, V var4) {
      String var7 = this.method36250(var1);
      Object var8 = MoreObjects.firstNonNull(var7 == null ? null : var2.apply(var7), var4);
      this.field43784.put(var1, var3.apply((V) var8));
      return (V)var8;
   }

   public <V> Property method36253(String var1, Function<String, V> var2, Function<V, String> var3, V var4) {
      String var7 = this.method36250(var1);
      Object var8 = MoreObjects.firstNonNull(var7 == null ? null : var2.apply(var7), var4);
      this.field43784.put(var1, var3.apply((V) var8));
      return new Property(var1, var8, var3);
   }

   public <V> V method36254(String var1, Function<String, V> var2, UnaryOperator<V> var3, Function<V, String> var4, V var5) {
      return this.<V>method36252(var1, var2x -> {
         Object var5x = var2.apply(var2x);
         return (V)(var5x == null ? null : var3.apply((V) var5x));
      }, var4, (V)var5);
   }

   public <V> V method36255(String var1, Function<String, V> var2, V var3) {
      return this.<V>method36252(var1, var2, Objects::toString, (V)var3);
   }

   public <V> Class9436<T>.Property<V> method36256(String var1, Function<String, V> var2, V var3) {
      return this.<V>method36253(var1, var2, Objects::toString, (V)var3);
   }

   public String method36257(String var1, String var2) {
      return this.<String>method36252(var1, Function.<String>identity(), Function.<String>identity(), var2);
   }

   @Nullable
   public String method36258(String var1) {
      return this.<String>method36251(var1, Function.<String>identity());
   }

   public int method36259(String var1, int var2) {
      return this.<Integer>method36255(var1, method36248(Integer::parseInt), var2);
   }

   public Class9436<T>.Property<Integer> method36260(String var1, int var2) {
      return this.<Integer>method36256(var1, method36248(Integer::parseInt), var2);
   }

   public int method36261(String var1, UnaryOperator<Integer> var2, int var3) {
      return this.<Integer>method36254(var1, method36248(Integer::parseInt), var2, Objects::toString, var3);
   }

   public long method36262(String var1, long var2) {
      return this.<Long>method36255(var1, method36248(Long::parseLong), var2);
   }

   public boolean method36263(String var1, boolean var2) {
      return this.<Boolean>method36255(var1, Boolean::valueOf, var2);
   }

   public Class9436<T>.Property<Boolean> method36264(String var1, boolean var2) {
      return this.<Boolean>method36256(var1, Boolean::valueOf, var2);
   }

   @Nullable
   public Boolean method36265(String var1) {
      return this.<Boolean>method36251(var1, Boolean::valueOf);
   }

   public Properties method36266() {
      Properties var3 = new Properties();
      var3.putAll(this.field43784);
      return var3;
   }

   public abstract T method36267(DynamicRegistries var1, Properties var2);

   public class Property<V> implements Supplier<V> {
      private final String field23360;
      private final V field23361;
      private final Function<V, String> field23362;

      Property(String var1, V var2, Function<V, String> var3) {
         this.field23360 = var1;
         this.field23361 = var2;
         this.field23362 = var3;
      }

      @Override
      public V get() {
         return this.field23361;
      }

      public T method15917(DynamicRegistries var1, V var2) {
         Properties var5 = Class9436.this.method36266();
         var5.put(this.field23360, this.field23362.apply((V)var2));
         return (T)Class9436.this.method36267(var1, var5);
      }
   }
}
