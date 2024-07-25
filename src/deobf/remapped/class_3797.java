package remapped;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_3797 implements class_7832 {
   private static final Logger field_18529 = LogManager.getLogger();
   public final List<class_8169> field_18527 = Lists.newArrayList();
   private final class_3168 field_18526;
   private final String field_18530;

   public class_3797(class_3168 var1, String var2) {
      this.field_18526 = var1;
      this.field_18530 = var2;
   }

   public void method_17629(class_8169 var1) {
      this.field_18527.add(var1);
   }

   @Override
   public Set<String> method_35455() {
      return ImmutableSet.of(this.field_18530);
   }

   @Override
   public class_4038 method_35458(class_4639 var1) throws IOException {
      this.method_17634(var1);
      class_8169 var4 = null;
      class_4639 var5 = method_17630(var1);

      for (int var6 = this.field_18527.size() - 1; var6 >= 0; var6--) {
         class_8169 var7 = this.field_18527.get(var6);
         if (var4 == null && var7.method_37467(this.field_18526, var5)) {
            var4 = var7;
         }

         if (var7.method_37467(this.field_18526, var1)) {
            InputStream var8 = null;
            if (var4 != null) {
               var8 = this.method_17635(var5, var4);
            }

            return new class_4481(var7.method_37470(), var1, this.method_17635(var1, var7), var8);
         }
      }

      throw new FileNotFoundException(var1.toString());
   }

   @Override
   public boolean method_35456(class_4639 var1) {
      if (!this.method_17631(var1)) {
         return false;
      } else {
         for (int var4 = this.field_18527.size() - 1; var4 >= 0; var4--) {
            class_8169 var5 = this.field_18527.get(var4);
            if (var5.method_37467(this.field_18526, var1)) {
               return true;
            }
         }

         return false;
      }
   }

   public InputStream method_17635(class_4639 var1, class_8169 var2) throws IOException {
      InputStream var5 = var2.method_37466(this.field_18526, var1);
      return (InputStream)(!field_18529.isDebugEnabled() ? var5 : new class_8790(var5, var1, var2.method_37470()));
   }

   private void method_17634(class_4639 var1) throws IOException {
      if (!this.method_17631(var1)) {
         throw new IOException("Invalid relative path to resource: " + var1);
      }
   }

   private boolean method_17631(class_4639 var1) {
      return !var1.method_21456().contains("..");
   }

   @Override
   public List<class_4038> method_35457(class_4639 var1) throws IOException {
      this.method_17634(var1);
      ArrayList var4 = Lists.newArrayList();
      class_4639 var5 = method_17630(var1);

      for (class_8169 var7 : this.field_18527) {
         if (var7.method_37467(this.field_18526, var1)) {
            InputStream var8 = !var7.method_37467(this.field_18526, var5) ? null : this.method_17635(var5, var7);
            var4.add(new class_4481(var7.method_37470(), var1, this.method_17635(var1, var7), var8));
         }
      }

      if (!var4.isEmpty()) {
         return var4;
      } else {
         throw new FileNotFoundException(var1.toString());
      }
   }

   @Override
   public Collection<class_4639> method_35460(String var1, Predicate<String> var2) {
      ArrayList var5 = Lists.newArrayList();

      for (class_8169 var7 : this.field_18527) {
         var5.addAll(var7.method_37464(this.field_18526, this.field_18530, var1, Integer.MAX_VALUE, var2));
      }

      Collections.sort(var5);
      return var5;
   }

   @Override
   public Stream<class_8169> method_35459() {
      return this.field_18527.stream();
   }

   public static class_4639 method_17630(class_4639 var0) {
      return new class_4639(var0.method_21461(), var0.method_21456() + ".mcmeta");
   }
}
