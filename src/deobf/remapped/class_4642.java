package remapped;

import java.util.stream.Stream;

public class class_4642 extends class_4240 {
   private static final Identifier field_22665 = new Identifier("back");

   public class_4642(TextureManager var1) {
      super(var1, new Identifier("textures/atlas/paintings.png"), "painting");
   }

   @Override
   public Stream<Identifier> method_19778() {
      return Stream.<Identifier>concat(class_8669.field_44450.method_39805().stream(), Stream.of(field_22665));
   }

   public class_5155 method_21477(class_6933 var1) {
      return this.method_19780(class_8669.field_44450.method_39797(var1));
   }

   public class_5155 method_21478() {
      return this.method_19780(field_22665);
   }
}
