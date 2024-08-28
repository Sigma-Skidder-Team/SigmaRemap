package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Supplier;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Class193 implements Class192 {
   private static final Logger field723 = LogManager.getLogger();
   private final Map<String, Class1817> field724 = Maps.newHashMap();
   private final List<Class268> field725 = Lists.newArrayList();
   private final List<Class268> field726 = Lists.newArrayList();
   private final Set<String> field727 = Sets.newLinkedHashSet();
   private final List<Class303> field728 = Lists.newArrayList();
   private final Class1946 field729;

   public Class193(Class1946 var1) {
      this.field729 = var1;
   }

   public void method588(Class303 var1) {
      this.field728.add(var1);

      for (String var5 : var1.method1226(this.field729)) {
         this.field727.add(var5);
         Class1817 var6 = this.field724.get(var5);
         if (var6 == null) {
            var6 = new Class1817(this.field729, var5);
            this.field724.put(var5, var6);
         }

         var6.method8062(var1);
      }
   }

   @Override
   public Set<String> method579() {
      return this.field727;
   }

   @Override
   public Class1783 method580(ResourceLocation var1) throws IOException {
      Class191 var4 = this.field724.get(var1.method8293());
      if (var4 == null) {
         throw new FileNotFoundException(var1.toString());
      } else {
         return var4.method580(var1);
      }
   }

   @Override
   public boolean method581(ResourceLocation var1) {
      Class191 var4 = this.field724.get(var1.method8293());
      return var4 == null ? false : var4.method581(var1);
   }

   @Override
   public List<Class1783> method582(ResourceLocation var1) throws IOException {
      Class191 var4 = this.field724.get(var1.method8293());
      if (var4 == null) {
         throw new FileNotFoundException(var1.toString());
      } else {
         return var4.method582(var1);
      }
   }

   @Override
   public Collection<ResourceLocation> method583(String var1, Predicate<String> var2) {
      HashSet var5 = Sets.newHashSet();

      for (Class1817 var7 : this.field724.values()) {
         var5.addAll(var7.method583(var1, var2));
      }

      ArrayList var8 = Lists.newArrayList(var5);
      Collections.sort(var8);
      return var8;
   }

   private void method589() {
      this.field724.clear();
      this.field727.clear();
      this.field728.forEach(Class303::close);
      this.field728.clear();
   }

   @Override
   public void close() {
      this.method589();
   }

   @Override
   public void method587(Class268 var1) {
      this.field725.add(var1);
      this.field726.add(var1);
   }

   public Class8335 method590(Executor var1, Executor var2, List<Class268> var3, CompletableFuture<Class2341> var4) {
      Object var7;
      if (!field723.isDebugEnabled()) {
         var7 = Class8337.method29228(this, Lists.newArrayList(var3), var1, var2, var4);
      } else {
         var7 = new Class8338(this, Lists.newArrayList(var3), var1, var2, var4);
      }

      this.field726.clear();
      return (Class8335)var7;
   }

   @Override
   public Class8335 method586(Executor var1, Executor var2, CompletableFuture<Class2341> var3, List<Class303> var4) {
      this.method589();
      field723.info(
         "Reloading ResourceManager: {}", new Supplier[]{() -> var4.stream().<CharSequence>map(Class303::method1228).collect(Collectors.joining(", "))}
      );

      for (Class303 var8 : var4) {
         try {
            this.method588(var8);
         } catch (Exception var10) {
            field723.error("Failed to add resource pack {}", var8.method1228(), var10);
            return new Class8336(new Class2507(var8, var10));
         }
      }

      return this.method590(var1, var2, this.field725, var3);
   }

   @Override
   public Stream<Class303> method584() {
      return this.field728.stream();
   }
}
