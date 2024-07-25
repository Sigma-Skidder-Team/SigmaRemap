package remapped;

import java.util.stream.Stream;

public class class_4642 extends class_4240 {
   private static final class_4639 field_22665 = new class_4639("back");

   public class_4642(class_7889 var1) {
      super(var1, new class_4639("textures/atlas/paintings.png"), "painting");
   }

   @Override
   public Stream<class_4639> method_19778() {
      return Stream.<class_4639>concat(class_8669.field_44450.method_39805().stream(), Stream.of(field_22665));
   }

   public class_5155 method_21477(class_6933 var1) {
      return this.method_19780(class_8669.field_44450.method_39797(var1));
   }

   public class_5155 method_21478() {
      return this.method_19780(field_22665);
   }
}
