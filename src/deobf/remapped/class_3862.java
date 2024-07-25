package remapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class class_3862 extends class_8403 {
   private static final class_2522 field_18818 = class_4783.field_23784.method_29260();
   private static final class_2522 field_18815 = class_4783.field_23531.method_29260();
   private static final class_2522 field_18817 = class_4783.field_23709.method_29260();
   private static final ImmutableList<class_2522> field_18816 = ImmutableList.of(field_18818, field_18815);

   public class_3862(Codec<class_5194> var1) {
      super(var1);
   }

   @Override
   public ImmutableList<class_2522> method_38696() {
      return field_18816;
   }

   @Override
   public ImmutableList<class_2522> method_38695() {
      return field_18816;
   }

   @Override
   public class_2522 method_38697() {
      return field_18817;
   }
}
