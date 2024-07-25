package remapped;

import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class class_7727 {
   private static final class_7727 field_39189 = new class_7727(ImmutableList.of());
   private static final Comparator<class_1632<?>> field_39192 = Comparator.<class_1632<?>, String>comparing(var0 -> var0.method_7264().method_23109());
   private final List<class_1632<?>> field_39191;

   public class_7727 method_34967(class_1632<?> var1) {
      return new class_7727(ImmutableList.builder().addAll(this.field_39191).add(var1).build());
   }

   public class_7727 method_34968(class_7727 var1) {
      return new class_7727(ImmutableList.builder().addAll(this.field_39191).addAll(var1.field_39191).build());
   }

   private class_7727(List<class_1632<?>> var1) {
      this.field_39191 = var1;
   }

   public static class_7727 method_34970() {
      return field_39189;
   }

   public static class_7727 method_34971(class_1632<?>... var0) {
      return new class_7727(ImmutableList.copyOf(var0));
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 || var1 instanceof class_7727 && this.field_39191.equals(((class_7727)var1).field_39191);
   }

   @Override
   public int hashCode() {
      return this.field_39191.hashCode();
   }

   public String method_34969() {
      return this.field_39191.stream().sorted(field_39192).<CharSequence>map(class_1632::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.method_34969();
   }
}
