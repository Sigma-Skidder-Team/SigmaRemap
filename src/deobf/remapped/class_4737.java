package remapped;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class class_4737 {
   private final Multimap<String, String> field_22952;
   private final Supplier<String> field_22957;
   private final class_2144 field_22958;
   private final Function<class_4639, class_7279> field_22951;
   private final Set<class_4639> field_22959;
   private final Function<class_4639, class_1758> field_22956;
   private final Set<class_4639> field_22953;
   private String field_22955;

   public class_4737(class_2144 var1, Function<class_4639, class_7279> var2, Function<class_4639, class_1758> var3) {
      this(HashMultimap.create(), () -> "", var1, var2, ImmutableSet.of(), var3, ImmutableSet.of());
   }

   public class_4737(
      Multimap<String, String> var1,
      Supplier<String> var2,
      class_2144 var3,
      Function<class_4639, class_7279> var4,
      Set<class_4639> var5,
      Function<class_4639, class_1758> var6,
      Set<class_4639> var7
   ) {
      this.field_22952 = var1;
      this.field_22957 = var2;
      this.field_22958 = var3;
      this.field_22951 = var4;
      this.field_22959 = var5;
      this.field_22956 = var6;
      this.field_22953 = var7;
   }

   private String method_21889() {
      if (this.field_22955 == null) {
         this.field_22955 = this.field_22957.get();
      }

      return this.field_22955;
   }

   public void method_21892(String var1) {
      this.field_22952.put(this.method_21889(), var1);
   }

   public class_4737 method_21888(String var1) {
      return new class_4737(
         this.field_22952, () -> this.method_21889() + var1, this.field_22958, this.field_22951, this.field_22959, this.field_22956, this.field_22953
      );
   }

   public class_4737 method_21894(String var1, class_4639 var2) {
      ImmutableSet var5 = ImmutableSet.builder().addAll(this.field_22953).add(var2).build();
      return new class_4737(this.field_22952, () -> this.method_21889() + var1, this.field_22958, this.field_22951, this.field_22959, this.field_22956, var5);
   }

   public class_4737 method_21887(String var1, class_4639 var2) {
      ImmutableSet var5 = ImmutableSet.builder().addAll(this.field_22959).add(var2).build();
      return new class_4737(this.field_22952, () -> this.method_21889() + var1, this.field_22958, this.field_22951, var5, this.field_22956, this.field_22953);
   }

   public boolean method_21890(class_4639 var1) {
      return this.field_22953.contains(var1);
   }

   public boolean method_21882(class_4639 var1) {
      return this.field_22959.contains(var1);
   }

   public Multimap<String, String> method_21883() {
      return ImmutableMultimap.copyOf(this.field_22952);
   }

   public void method_21884(class_2790 var1) {
      this.field_22958.method_10019(this, var1);
   }

   @Nullable
   public class_1758 method_21886(class_4639 var1) {
      return this.field_22956.apply(var1);
   }

   @Nullable
   public class_7279 method_21893(class_4639 var1) {
      return this.field_22951.apply(var1);
   }

   public class_4737 method_21891(class_2144 var1) {
      return new class_4737(this.field_22952, this.field_22957, var1, this.field_22951, this.field_22959, this.field_22956, this.field_22953);
   }
}
