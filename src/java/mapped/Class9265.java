package mapped;

import java.util.Optional;
import java.util.OptionalInt;

public class Class9265 {
   private OptionalInt field42612 = OptionalInt.empty();
   private OptionalInt field42613 = OptionalInt.empty();
   private OptionalInt field42614 = OptionalInt.empty();
   private OptionalInt field42615 = OptionalInt.empty();
   private Optional<Integer> field42616 = Optional.<Integer>empty();
   private Optional<Integer> field42617 = Optional.<Integer>empty();
   private Class88 field42618 = Class88.field230;
   private Optional<Class7737> field42619 = Optional.<Class7737>empty();
   private Optional<Class9455> field42620 = Optional.<Class9455>empty();
   private Optional<Class7959> field42621 = Optional.<Class7959>empty();
   private Optional<Class8217> field42622 = Optional.<Class8217>empty();
   private Optional<Class3496> field42623 = Optional.<Class3496>empty();

   public Class9265 method34868(int var1) {
      this.field42612 = OptionalInt.of(var1);
      return this;
   }

   public Class9265 method34869(int var1) {
      this.field42613 = OptionalInt.of(var1);
      return this;
   }

   public Class9265 method34870(int var1) {
      this.field42614 = OptionalInt.of(var1);
      return this;
   }

   public Class9265 method34871(int var1) {
      this.field42615 = OptionalInt.of(var1);
      return this;
   }

   public Class9265 method34872(int var1) {
      this.field42616 = Optional.<Integer>of(var1);
      return this;
   }

   public Class9265 method34873(int var1) {
      this.field42617 = Optional.<Integer>of(var1);
      return this;
   }

   public Class9265 method34874(Class88 var1) {
      this.field42618 = var1;
      return this;
   }

   public Class9265 method34875(Class7737 var1) {
      this.field42619 = Optional.<Class7737>of(var1);
      return this;
   }

   public Class9265 method34876(Class9455 var1) {
      this.field42620 = Optional.<Class9455>of(var1);
      return this;
   }

   public Class9265 method34877(Class7959 var1) {
      this.field42621 = Optional.<Class7959>of(var1);
      return this;
   }

   public Class9265 method34878(Class8217 var1) {
      this.field42622 = Optional.<Class8217>of(var1);
      return this;
   }

   public Class9265 method34879(Class3496 var1) {
      this.field42623 = Optional.<Class3496>of(var1);
      return this;
   }

   public Class7752 method34880() {
      return new Class7752(
         this.field42612.orElseThrow(() -> new IllegalStateException("Missing 'fog' color.")),
         this.field42613.orElseThrow(() -> new IllegalStateException("Missing 'water' color.")),
         this.field42614.orElseThrow(() -> new IllegalStateException("Missing 'water fog' color.")),
         this.field42615.orElseThrow(() -> new IllegalStateException("Missing 'sky' color.")),
         this.field42616,
         this.field42617,
         this.field42618,
         this.field42619,
         this.field42620,
         this.field42621,
         this.field42622,
         this.field42623
      );
   }
}
