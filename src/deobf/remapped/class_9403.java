package remapped;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_9403 implements class_2053 {
   private static final Logger field_48081 = LogManager.getLogger();
   private static final class_7265 field_48079 = new class_7265();
   public static final Gson field_48080 = new GsonBuilder()
      .registerTypeAdapter(class_9403.class, new class_6032())
      .registerTypeAdapter(class_9487.class, new class_8533())
      .registerTypeAdapter(class_7300.class, new class_592())
      .registerTypeAdapter(class_9874.class, new class_6921())
      .registerTypeAdapter(class_944.class, new class_6920())
      .registerTypeAdapter(class_7729.class, new class_3691())
      .registerTypeAdapter(class_2729.class, new class_8344())
      .create();
   private final List<class_9487> field_48077;
   private final class_683 field_48073;
   private final boolean field_48082;
   private final class_7729 field_48071;
   private final List<class_2729> field_48074;
   public String field_48083 = "";
   public final Map<String, Either<class_2843, String>> field_48076;
   public class_9403 field_48075;
   public class_4639 field_48072;

   public static class_9403 method_43559(Reader var0) {
      return class_6539.<class_9403>method_29801(field_48080, var0, class_9403.class);
   }

   public static class_9403 method_43560(String var0) {
      return method_43559(new StringReader(var0));
   }

   public class_9403(
      class_4639 var1,
      List<class_9487> var2,
      Map<String, Either<class_2843, String>> var3,
      boolean var4,
      class_683 var5,
      class_7729 var6,
      List<class_2729> var7
   ) {
      this.field_48077 = var2;
      this.field_48082 = var4;
      this.field_48073 = var5;
      this.field_48076 = var3;
      this.field_48072 = var1;
      this.field_48071 = var6;
      this.field_48074 = var7;
   }

   public List<class_9487> method_43566() {
      return this.field_48077.isEmpty() && this.field_48075 != null ? this.field_48075.method_43566() : this.field_48077;
   }

   public boolean method_43551() {
      return this.field_48075 == null ? this.field_48082 : this.field_48075.method_43551();
   }

   public class_683 method_43552() {
      if (this.field_48073 == null) {
         return this.field_48075 == null ? class_683.field_3767 : this.field_48075.method_43552();
      } else {
         return this.field_48073;
      }
   }

   public List<class_2729> method_43553() {
      return this.field_48074;
   }

   private class_602 method_43556(class_6560 var1, class_9403 var2) {
      return !this.field_48074.isEmpty() ? new class_602(var1, var2, var1::method_29951, this.field_48074) : class_602.field_3453;
   }

   @Override
   public Collection<class_4639> method_9589() {
      HashSet var3 = Sets.newHashSet();

      for (class_2729 var5 : this.field_48074) {
         var3.add(var5.method_12263());
      }

      if (this.field_48072 != null) {
         var3.add(this.field_48072);
      }

      return var3;
   }

   @Override
   public Collection<class_2843> method_9591(Function<class_4639, class_2053> var1, Set<Pair<String, String>> var2) {
      LinkedHashSet var5 = Sets.newLinkedHashSet();

      for (class_9403 var6 = this; var6.field_48072 != null && var6.field_48075 == null; var6 = var6.field_48075) {
         var5.add(var6);
         class_2053 var7 = (class_2053)var1.apply(var6.field_48072);
         if (var7 == null) {
            field_48081.warn("No parent '{}' while loading model '{}'", this.field_48072, var6);
         }

         if (var5.contains(var7)) {
            field_48081.warn(
               "Found 'parent' loop while loading model '{}' in chain: {} -> {}",
               var6,
               var5.stream().<CharSequence>map(Object::toString).collect(Collectors.joining(" -> ")),
               this.field_48072
            );
            var7 = null;
         }

         if (var7 == null) {
            var6.field_48072 = class_6560.field_33445;
            var7 = (class_2053)var1.apply(var6.field_48072);
         }

         if (!(var7 instanceof class_9403)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         var6.field_48075 = (class_9403)var7;
      }

      HashSet var12 = Sets.newHashSet(new class_2843[]{this.method_43564("particle")});

      for (class_9487 var8 : this.method_43566()) {
         for (class_7300 var10 : var8.field_48353.values()) {
            class_2843 var11 = this.method_43564(var10.field_37317);
            if (Objects.equals(var11.method_12948(), class_2008.method_9327())) {
               var2.add(Pair.of(var10.field_37317, this.field_48083));
            }

            var12.add(var11);
         }
      }

      this.field_48074.forEach(var4 -> {
         class_2053 var7x = (class_2053)var1.apply(var4.method_12263());
         if (!Objects.equals(var7x, this)) {
            var12.addAll(var7x.method_9591(var1, var2));
         }
      });
      if (this.method_43567() == class_6560.field_33462) {
         class_4644.field_22672.forEach(var2x -> var12.add(this.method_43564(var2x)));
      }

      return var12;
   }

   @Override
   public class_7373 method_9590(class_6560 var1, Function<class_2843, class_5155> var2, class_5598 var3, class_4639 var4) {
      return this.method_43561(var1, this, var2, var3, var4, true);
   }

   public class_7373 method_43561(class_6560 var1, class_9403 var2, Function<class_2843, class_5155> var3, class_5598 var4, class_4639 var5, boolean var6) {
      class_5155 var9 = (class_5155)var3.apply(this.method_43564("particle"));
      if (this.method_43567() == class_6560.field_33459) {
         return new class_5976(this.method_43563(), this.method_43556(var1, var2), var9, this.method_43552().method_3100());
      } else {
         class_6911 var10 = new class_6911(this, this.method_43556(var1, var2), var6).method_31664(var9);

         for (class_9487 var12 : this.method_43566()) {
            for (class_240 var14 : var12.field_48353.keySet()) {
               class_7300 var15 = var12.field_48353.get(var14);
               class_5155 var16 = (class_5155)var3.apply(this.method_43564(var15.field_37317));
               if (var15.field_37318 != null) {
                  var10.method_31667(
                     class_240.method_1048(var4.method_25403().method_5410(), var15.field_37318), method_43565(var12, var15, var16, var14, var4, var5)
                  );
               } else {
                  var10.method_31666(method_43565(var12, var15, var16, var14, var4, var5));
               }
            }
         }

         return var10.method_31665();
      }
   }

   private static class_5024 method_43565(class_9487 var0, class_7300 var1, class_5155 var2, class_240 var3, class_5598 var4, class_4639 var5) {
      return field_48079.method_33202(var0.field_48352, var0.field_48350, var1, var2, var3, var4, var0.field_48351, var0.field_48348, var5);
   }

   public boolean method_43562(String var1) {
      return !class_2008.method_9327().equals(this.method_43564(var1).method_12948());
   }

   public class_2843 method_43564(String var1) {
      if (method_43558(var1)) {
         var1 = var1.substring(1);
      }

      ArrayList var4 = Lists.newArrayList();

      while (true) {
         Either var5 = this.method_43554(var1);
         Optional var6 = var5.left();
         if (var6.isPresent()) {
            return (class_2843)var6.get();
         }

         var1 = (String)var5.right().get();
         if (var4.contains(var1)) {
            field_48081.warn("Unable to resolve texture due to reference chain {}->{} in {}", Joiner.on("->").join(var4), var1, this.field_48083);
            return new class_2843(class_8359.field_42824, class_2008.method_9327());
         }

         var4.add(var1);
      }
   }

   private Either<class_2843, String> method_43554(String var1) {
      for (class_9403 var4 = this; var4 != null; var4 = var4.field_48075) {
         Either var5 = var4.field_48076.get(var1);
         if (var5 != null) {
            return var5;
         }
      }

      return Either.left(new class_2843(class_8359.field_42824, class_2008.method_9327()));
   }

   private static boolean method_43558(String var0) {
      return var0.charAt(0) == '#';
   }

   public class_9403 method_43567() {
      return this.field_48075 != null ? this.field_48075.method_43567() : this;
   }

   public class_7729 method_43563() {
      class_944 var3 = this.method_43557(class_5612.field_28492);
      class_944 var4 = this.method_43557(class_5612.field_28493);
      class_944 var5 = this.method_43557(class_5612.field_28498);
      class_944 var6 = this.method_43557(class_5612.field_28499);
      class_944 var7 = this.method_43557(class_5612.field_28497);
      class_944 var8 = this.method_43557(class_5612.field_28489);
      class_944 var9 = this.method_43557(class_5612.field_28496);
      class_944 var10 = this.method_43557(class_5612.field_28495);
      return new class_7729(var3, var4, var5, var6, var7, var8, var9, var10);
   }

   private class_944 method_43557(class_5612 var1) {
      return this.field_48075 != null && !this.field_48071.method_34980(var1) ? this.field_48075.method_43557(var1) : this.field_48071.method_34982(var1);
   }

   @Override
   public String toString() {
      return this.field_48083;
   }
}
