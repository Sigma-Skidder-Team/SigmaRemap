package mapped;

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

public class Class1817 implements Class191 {
   private static final Logger field9813 = LogManager.getLogger();
   public final List<Class303> field9814 = Lists.newArrayList();
   private final Class1946 field9815;
   private final String field9816;

   public Class1817(Class1946 var1, String var2) {
      this.field9815 = var1;
      this.field9816 = var2;
   }

   public void method8062(Class303 var1) {
      this.field9814.add(var1);
   }

   @Override
   public Set<String> method579() {
      return ImmutableSet.of(this.field9816);
   }

   @Override
   public Class1783 method580(ResourceLocation var1) throws IOException {
      this.method8064(var1);
      Class303 var4 = null;
      ResourceLocation var5 = method8066(var1);

      for (int var6 = this.field9814.size() - 1; var6 >= 0; var6--) {
         Class303 var7 = this.field9814.get(var6);
         if (var4 == null && var7.method1225(this.field9815, var5)) {
            var4 = var7;
         }

         if (var7.method1225(this.field9815, var1)) {
            InputStream var8 = null;
            if (var4 != null) {
               var8 = this.method8063(var5, var4);
            }

            return new Class1785(var7.method1228(), var1, this.method8063(var1, var7), var8);
         }
      }

      throw new FileNotFoundException(var1.toString());
   }

   @Override
   public boolean method581(ResourceLocation var1) {
      if (!this.method8065(var1)) {
         return false;
      } else {
         for (int var4 = this.field9814.size() - 1; var4 >= 0; var4--) {
            Class303 var5 = this.field9814.get(var4);
            if (var5.method1225(this.field9815, var1)) {
               return true;
            }
         }

         return false;
      }
   }

   public InputStream method8063(ResourceLocation var1, Class303 var2) throws IOException {
      InputStream var5 = var2.method1223(this.field9815, var1);
      return (InputStream)(!field9813.isDebugEnabled() ? var5 : new Class1780(var5, var1, var2.method1228()));
   }

   private void method8064(ResourceLocation var1) throws IOException {
      if (!this.method8065(var1)) {
         throw new IOException("Invalid relative path to resource: " + var1);
      }
   }

   private boolean method8065(ResourceLocation var1) {
      return !var1.method8292().contains("..");
   }

   @Override
   public List<Class1783> method582(ResourceLocation var1) throws IOException {
      this.method8064(var1);
      ArrayList var4 = Lists.newArrayList();
      ResourceLocation var5 = method8066(var1);

      for (Class303 var7 : this.field9814) {
         if (var7.method1225(this.field9815, var1)) {
            InputStream var8 = !var7.method1225(this.field9815, var5) ? null : this.method8063(var5, var7);
            var4.add(new Class1785(var7.method1228(), var1, this.method8063(var1, var7), var8));
         }
      }

      if (!var4.isEmpty()) {
         return var4;
      } else {
         throw new FileNotFoundException(var1.toString());
      }
   }

   @Override
   public Collection<ResourceLocation> method583(String var1, Predicate<String> var2) {
      ArrayList var5 = Lists.newArrayList();

      for (Class303 var7 : this.field9814) {
         var5.addAll(var7.method1224(this.field9815, this.field9816, var1, Integer.MAX_VALUE, var2));
      }

      Collections.sort(var5);
      return var5;
   }

   @Override
   public Stream<Class303> method584() {
      return this.field9814.stream();
   }

   public static ResourceLocation method8066(ResourceLocation var0) {
      return new ResourceLocation(var0.method8293(), var0.method8292() + ".mcmeta");
   }

   // $VF: synthetic method
   public static Logger method8067() {
      return field9813;
   }
}