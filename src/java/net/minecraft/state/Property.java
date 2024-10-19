package net.minecraft.state;

import com.google.common.base.MoreObjects;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Stream;

public abstract class Property<T extends Comparable<T>> {
   private final Class<T> field38436;
   private final String field38437;
   private Integer field38438;
   private final Codec<T> field38439 = Codec.STRING
      .comapFlatMap(
         var1x -> this.method30476(var1x)
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error("Unable to read property: " + this + " with value: " + var1x)),
         this::getName
      );
   private final Codec<ValuePair<T>> field38440 = this.field38439.xmap(this::method30468, ValuePair::method22835);

   public Property(String var1, Class<T> var2) {
      this.field38436 = var2;
      this.field38437 = var1;
   }

   public ValuePair<T> method30468(T var1) {
      return new ValuePair<T>(this, var1);
   }

   public ValuePair<T> method30469(StateHolder<?, ?> var1) {
      return new ValuePair<T>(this, var1.get(this));
   }

   public Stream<ValuePair<T>> method30470() {
      return this.method30474().stream().<ValuePair<T>>map(this::method30468);
   }

   public Codec<ValuePair<T>> method30471() {
      return this.field38440;
   }

   public String method30472() {
      return this.field38437;
   }

   public Class<T> method30473() {
      return this.field38436;
   }

   public abstract Collection<T> method30474();

   public abstract String getName(T var1);

   public abstract Optional<T> method30476(String var1);

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("name", this.field38437).add("clazz", this.field38436).add("values", this.method30474()).toString();
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof Property)) {
            return false;
         } else {
            Property var4 = (Property)var1;
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

   public static final class ValuePair<T extends Comparable<T>> {
      private final Property<T> field31190;
      private final T field31191;

      public ValuePair(Property<T> var1, T var2) {
         if (var1.method30474().contains(var2)) {
            this.field31190 = var1;
            this.field31191 = (T)var2;
         } else {
            throw new IllegalArgumentException("Value " + var2 + " does not belong to property " + var1);
         }
      }

      public Property<T> method22834() {
         return this.field31190;
      }

      public T method22835() {
         return this.field31191;
      }

      @Override
      public String toString() {
         return this.field31190.method30472() + "=" + this.field31190.getName(this.field31191);
      }

      @Override
      public boolean equals(Object var1) {
         if (this != var1) {
            if (!(var1 instanceof Property.ValuePair)) {
               return false;
            } else {
               ValuePair var4 = (ValuePair)var1;
               return this.field31190 == var4.field31190 && this.field31191.equals(var4.field31191);
            }
         } else {
            return true;
         }
      }

      @Override
      public int hashCode() {
         int var3 = this.field31190.hashCode();
         return 31 * var3 + this.field31191.hashCode();
      }
   }
}
