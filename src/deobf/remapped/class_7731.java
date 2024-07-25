package remapped;

import java.util.Optional;
import java.util.OptionalInt;

public class class_7731 {
   private OptionalInt field_39210 = OptionalInt.empty();
   private OptionalInt field_39208 = OptionalInt.empty();
   private OptionalInt field_39220 = OptionalInt.empty();
   private OptionalInt field_39216 = OptionalInt.empty();
   private Optional<Integer> field_39209 = Optional.<Integer>empty();
   private Optional<Integer> field_39219 = Optional.<Integer>empty();
   private class_4184 field_39215 = class_4184.field_20366;
   private Optional<class_2569> field_39218 = Optional.<class_2569>empty();
   private Optional<SoundEvent> field_39212 = Optional.<SoundEvent>empty();
   private Optional<class_3161> field_39211 = Optional.<class_3161>empty();
   private Optional<class_3902> field_39217 = Optional.<class_3902>empty();
   private Optional<class_75> field_39213 = Optional.<class_75>empty();

   public class_7731 method_34993(int var1) {
      this.field_39210 = OptionalInt.of(var1);
      return this;
   }

   public class_7731 method_34995(int var1) {
      this.field_39208 = OptionalInt.of(var1);
      return this;
   }

   public class_7731 method_34997(int var1) {
      this.field_39220 = OptionalInt.of(var1);
      return this;
   }

   public class_7731 method_34999(int var1) {
      this.field_39216 = OptionalInt.of(var1);
      return this;
   }

   public class_7731 method_34998(int var1) {
      this.field_39209 = Optional.<Integer>of(var1);
      return this;
   }

   public class_7731 method_34990(int var1) {
      this.field_39219 = Optional.<Integer>of(var1);
      return this;
   }

   public class_7731 method_34992(class_4184 var1) {
      this.field_39215 = var1;
      return this;
   }

   public class_7731 method_34989(class_2569 var1) {
      this.field_39218 = Optional.<class_2569>of(var1);
      return this;
   }

   public class_7731 method_35000(SoundEvent var1) {
      this.field_39212 = Optional.<SoundEvent>of(var1);
      return this;
   }

   public class_7731 method_35001(class_3161 var1) {
      this.field_39211 = Optional.<class_3161>of(var1);
      return this;
   }

   public class_7731 method_34991(class_3902 var1) {
      this.field_39217 = Optional.<class_3902>of(var1);
      return this;
   }

   public class_7731 method_34996(class_75 var1) {
      this.field_39213 = Optional.<class_75>of(var1);
      return this;
   }

   public class_2625 method_34988() {
      return new class_2625(
         this.field_39210.orElseThrow(() -> new IllegalStateException("Missing 'fog' color.")),
         this.field_39208.orElseThrow(() -> new IllegalStateException("Missing 'water' color.")),
         this.field_39220.orElseThrow(() -> new IllegalStateException("Missing 'water fog' color.")),
         this.field_39216.orElseThrow(() -> new IllegalStateException("Missing 'sky' color.")),
         this.field_39209,
         this.field_39219,
         this.field_39215,
         this.field_39218,
         this.field_39212,
         this.field_39211,
         this.field_39217,
         this.field_39213,
         null
      );
   }
}
