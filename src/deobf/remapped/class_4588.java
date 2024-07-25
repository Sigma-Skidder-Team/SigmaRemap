package remapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class class_4588 extends class_8403 {
   private static final class_2522 field_22309 = class_4783.field_23788.method_29260();
   private static final class_2522 field_22305 = class_4783.field_23785.method_29260();
   private static final class_2522 field_22307 = class_4783.field_23709.method_29260();
   private static final ImmutableList<class_2522> field_22306 = ImmutableList.of(field_22309, field_22305);
   private static final ImmutableList<class_2522> field_22308 = ImmutableList.of(field_22309);

   public class_4588(Codec<class_5194> var1) {
      super(var1);
   }

   @Override
   public ImmutableList<class_2522> method_38696() {
      return field_22306;
   }

   @Override
   public ImmutableList<class_2522> method_38695() {
      return field_22308;
   }

   @Override
   public class_2522 method_38697() {
      return field_22307;
   }
}
