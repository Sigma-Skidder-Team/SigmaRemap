package mapped;

import com.google.common.base.MoreObjects;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Stream;

public abstract class Class8550<T extends Comparable<T>> {
   private final Class<T> field38436;
   private final String field38437;
   private Integer field38438;
   private final Codec<T> field38439 = Codec.STRING
      .comapFlatMap(
         var1x -> this.method30476(var1x)
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error("Unable to read property: " + this + " with value: " + var1x)),
         this::method30475
      );
   private final Codec<Class7270<T>> field38440 = this.field38439.xmap(this::method30468, Class7270::method22835);

   public Class8550(String var1, Class<T> var2) {
      this.field38436 = var2;
      this.field38437 = var1;
   }

   public Class7270<T> method30468(T var1) {
      return new Class7270<T>(this, var1);
   }

   public Class7270<T> method30469(Class7378<?, ?> var1) {
      return new Class7270<T>(this, var1.method23463(this));
   }

   public Stream<Class7270<T>> method30470() {
      return this.method30474().stream().<Class7270<T>>map(this::method30468);
   }

   public Codec<Class7270<T>> method30471() {
      return this.field38440;
   }

   public String method30472() {
      return this.field38437;
   }

   public Class<T> method30473() {
      return this.field38436;
   }

   public abstract Collection<T> method30474();

   public abstract String method30475(T var1);

   public abstract Optional<T> method30476(String var1);

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("name", this.field38437).add("clazz", this.field38436).add("values", this.method30474()).toString();
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof Class8550)) {
            return false;
         } else {
            Class8550 var4 = (Class8550)var1;
            return this.field38436.equals(var4.field38436) && this.field38437.equals(var4.field38437);
         }
      } else {
         return true;
      }
   }

   @Override
   public final int hashCode() {
      if (this.field38438 == null) {
         this.field38438 = this.method30477();
      }

      return this.field38438;
   }

   public int method30477() {
      return 31 * this.field38436.hashCode() + this.field38437.hashCode();
   }
}
