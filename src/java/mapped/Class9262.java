package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.state.Property;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class Class9262 {
   private static final Class9262 field42595 = new Class9262(ImmutableList.of());
   private static final Comparator<Property.ValuePair<?>> field42596 = Comparator.comparing(var0 -> var0.method22834().method30472());
   private final List<Property.ValuePair<?>> field42597;

   public Class9262 method34854(Property.ValuePair<?> var1) {
      return new Class9262(ImmutableList.<Property.ValuePair<?>>builder().addAll(this.field42597).add(var1).build());
   }

   public Class9262 method34855(Class9262 var1) {
      return new Class9262(ImmutableList.<Property.ValuePair<?>>builder().addAll(this.field42597).addAll(var1.field42597).build());
   }

   private Class9262(List<Property.ValuePair<?>> var1) {
      this.field42597 = var1;
   }

   public static Class9262 method34856() {
      return field42595;
   }

   public static Class9262 method34857(Property.ValuePair<?>... var0) {
      return new Class9262(ImmutableList.copyOf(var0));
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 || var1 instanceof Class9262 && this.field42597.equals(((Class9262)var1).field42597);
   }

   @Override
   public int hashCode() {
      return this.field42597.hashCode();
   }

   public String method34858() {
      return this.field42597.stream().sorted(field42596).<CharSequence>map(Property.ValuePair::toString).collect(Collectors.joining(","));
   }

   @Override
   public String toString() {
      return this.method34858();
   }
}
