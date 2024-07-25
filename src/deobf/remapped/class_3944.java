package remapped;

import java.util.stream.Stream;

public class class_3944 extends class_4240 {
   public class_3944(TextureManager var1) {
      super(var1, new Identifier("textures/atlas/mob_effects.png"), "mob_effect");
   }

   @Override
   public Stream<Identifier> method_19778() {
      return class_8669.field_44436.method_39805().stream();
   }

   public class_5155 method_18228(class_1425 var1) {
      return this.method_19780(class_8669.field_44436.method_39797(var1));
   }
}
