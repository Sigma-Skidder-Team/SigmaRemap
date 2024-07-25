package remapped;

import com.google.common.base.MoreObjects;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Stream;

public abstract class class_5019<T extends Comparable<T>> {
   private final Class<T> field_25966;
   private final String field_25965;
   private Integer field_25962;
   private final Codec<T> field_25964 = Codec.STRING
      .comapFlatMap(
         var1x -> this.method_23108(var1x)
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error("Unable to read property: " + this + " with value: " + var1x)),
         this::method_23110
      );
   private final Codec<class_1632<T>> field_25963 = this.field_25964.xmap(this::method_23113, class_1632::method_7263);

   public class_5019(String var1, Class<T> var2) {
      this.field_25966 = var2;
      this.field_25965 = var1;
   }

   public class_1632<T> method_23113(T var1) {
      return new class_1632<T>(this, var1, null);
   }

   public class_1632<T> method_23107(class_2243<?, ?> var1) {
      return new class_1632<T>(this, var1.<Comparable>method_10313(this), null);
   }

   public Stream<class_1632<T>> method_23114() {
      return this.method_23105().stream().<class_1632<T>>map(this::method_23113);
   }

   public Codec<class_1632<T>> method_23111() {
      return this.field_25963;
   }

   public String method_23109() {
      return this.field_25965;
   }

   public Class<T> method_23112() {
      return this.field_25966;
   }

   public abstract Collection<T> method_23105();

   public abstract String method_23110(T var1);

   public abstract Optional<T> method_23108(String var1);

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("name", this.field_25965).add("clazz", this.field_25966).add("values", this.method_23105()).toString();
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof class_5019)) {
            return false;
         } else {
            class_5019 var4 = (class_5019)var1;
            return this.field_25966.equals(var4.field_25966) && this.field_25965.equals(var4.field_25965);
         }
      } else {
         return true;
      }
   }

   @Override
   public final int hashCode() {
      if (this.field_25962 == null) {
         this.field_25962 = this.method_23106();
      }

      return this.field_25962;
   }

   public int method_23106() {
      return 31 * this.field_25966.hashCode() + this.field_25965.hashCode();
   }
}
