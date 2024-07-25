package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Supplier;

public class class_9483 implements class_550 {
   private static final Logger field_48328 = LogManager.getLogger();
   private final Map<String, class_3797> field_48325 = Maps.newHashMap();
   private final List<class_2231> field_48327 = Lists.newArrayList();
   private final List<class_2231> field_48332 = Lists.newArrayList();
   private final Set<String> field_48329 = Sets.newLinkedHashSet();
   private final List<class_8169> field_48326 = Lists.newArrayList();
   private final class_3168 field_48331;

   public class_9483(class_3168 var1) {
      this.field_48331 = var1;
   }

   public void method_43806(class_8169 var1) {
      this.field_48326.add(var1);

      for (String var5 : var1.method_37468(this.field_48331)) {
         this.field_48329.add(var5);
         class_3797 var6 = this.field_48325.get(var5);
         if (var6 == null) {
            var6 = new class_3797(this.field_48331, var5);
            this.field_48325.put(var5, var6);
         }

         var6.method_17629(var1);
      }
   }

   @Override
   public Set<String> method_35455() {
      return this.field_48329;
   }

   @Override
   public class_4038 method_35458(class_4639 var1) throws IOException {
      class_7832 var4 = this.field_48325.get(var1.method_21461());
      if (var4 == null) {
         throw new FileNotFoundException(var1.toString());
      } else {
         return var4.method_35458(var1);
      }
   }

   @Override
   public boolean method_35456(class_4639 var1) {
      class_7832 var4 = this.field_48325.get(var1.method_21461());
      return var4 == null ? false : var4.method_35456(var1);
   }

   @Override
   public List<class_4038> method_35457(class_4639 var1) throws IOException {
      class_7832 var4 = this.field_48325.get(var1.method_21461());
      if (var4 == null) {
         throw new FileNotFoundException(var1.toString());
      } else {
         return var4.method_35457(var1);
      }
   }

   @Override
   public Collection<class_4639> method_35460(String var1, Predicate<String> var2) {
      HashSet var5 = Sets.newHashSet();

      for (class_3797 var7 : this.field_48325.values()) {
         var5.addAll(var7.method_35460(var1, var2));
      }

      ArrayList var8 = Lists.newArrayList(var5);
      Collections.sort(var8);
      return var8;
   }

   private void method_43803() {
      this.field_48325.clear();
      this.field_48329.clear();
      this.field_48326.forEach(class_8169::close);
      this.field_48326.clear();
   }

   @Override
   public void close() {
      this.method_43803();
   }

   @Override
   public void method_2649(class_2231 var1) {
      this.field_48327.add(var1);
      this.field_48332.add(var1);
   }

   public class_4302 method_43804(Executor var1, Executor var2, List<class_2231> var3, CompletableFuture<class_3256> var4) {
      Object var7;
      if (!field_48328.isDebugEnabled()) {
         var7 = class_6535.method_29756(this, Lists.newArrayList(var3), var1, var2, var4);
      } else {
         var7 = new class_9878(this, Lists.newArrayList(var3), var1, var2, var4);
      }

      this.field_48332.clear();
      return (class_4302)var7;
   }

   @Override
   public class_4302 method_2650(Executor var1, Executor var2, CompletableFuture<class_3256> var3, List<class_8169> var4) {
      this.method_43803();
      field_48328.info(
         "Reloading ResourceManager: {}", new Supplier[]{() -> var4.stream().<CharSequence>map(class_8169::method_37470).collect(Collectors.joining(", "))}
      );

      for (class_8169 var8 : var4) {
         try {
            this.method_43806(var8);
         } catch (Exception var10) {
            field_48328.error("Failed to add resource pack {}", var8.method_37470(), var10);
            return new class_4817(new class_1782(var8, var10));
         }
      }

      return this.method_43804(var1, var2, this.field_48327, var3);
   }

   @Override
   public Stream<class_8169> method_35459() {
      return this.field_48326.stream();
   }
}
