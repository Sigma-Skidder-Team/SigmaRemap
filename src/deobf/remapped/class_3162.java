package remapped;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public enum class_3162 {
   field_15717(class_240.field_818),
   field_15730(class_240.field_818, class_240.field_804),
   field_15729(class_240.field_804),
   field_15719(class_240.field_800, class_240.field_804),
   field_15723(class_240.field_800),
   field_15716(class_240.field_800, class_240.field_809),
   field_15721(class_240.field_809),
   field_15727(class_240.field_818, class_240.field_809);

   private static final int field_15726 = 1 << field_15727.ordinal();
   private static final int field_15734 = 1 << field_15721.ordinal();
   private static final int field_15724 = 1 << field_15716.ordinal();
   private static final int field_15728 = 1 << field_15723.ordinal();
   private static final int field_15732 = 1 << field_15719.ordinal();
   private static final int field_15718 = 1 << field_15729.ordinal();
   private static final int field_15720 = 1 << field_15730.ordinal();
   private static final int field_15731 = 1 << field_15717.ordinal();
   private final Set<class_240> field_15722;

   private class_3162(class_240... var3) {
      this.field_15722 = Sets.immutableEnumSet(Arrays.<class_240>asList(var3));
   }

   public Set<class_240> method_14594() {
      return this.field_15722;
   }
}
