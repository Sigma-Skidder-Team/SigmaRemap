package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class class_5655 {
   private static String[] field_28676;
   private final class_6354 field_28677;
   private final List<class_5522> field_28678;
   private final List<class_5522> field_28680;
   private final Function<class_5522, class_4639> field_28679;
   private final Runnable field_28681;
   private final Consumer<class_6354> field_28682;

   public class_5655(Runnable var1, Function<class_5522, class_4639> var2, class_6354 var3, Consumer<class_6354> var4) {
      this.field_28681 = var1;
      this.field_28679 = var2;
      this.field_28677 = var3;
      this.field_28678 = Lists.newArrayList(var3.method_29125());
      Collections.reverse(this.field_28678);
      this.field_28680 = Lists.newArrayList(var3.method_29117());
      this.field_28680.removeAll(this.field_28678);
      this.field_28682 = var4;
   }

   public Stream<class_3178> method_25585() {
      return this.field_28680.stream().<class_3178>map(var1 -> new class_198(this, var1));
   }

   public Stream<class_3178> method_25579() {
      return this.field_28678.stream().<class_3178>map(var1 -> new class_1276(this, var1));
   }

   public void method_25582() {
      this.field_28677.method_29121(Lists.reverse(this.field_28678).stream().<String>map(class_5522::method_25023).collect(ImmutableList.toImmutableList()));
      this.field_28682.accept(this.field_28677);
   }

   public void method_25583() {
      this.field_28677.method_29122();
      this.field_28678.retainAll(this.field_28677.method_29117());
      this.field_28680.clear();
      this.field_28680.addAll(this.field_28677.method_29117());
      this.field_28680.removeAll(this.field_28678);
   }
}
