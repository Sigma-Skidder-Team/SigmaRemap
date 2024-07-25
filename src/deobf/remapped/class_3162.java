package remapped;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public enum class_3162 {
   field_15717(Direction.field_818),
   field_15730(Direction.field_818, Direction.field_804),
   field_15729(Direction.field_804),
   field_15719(Direction.field_800, Direction.field_804),
   field_15723(Direction.field_800),
   field_15716(Direction.field_800, Direction.field_809),
   field_15721(Direction.field_809),
   field_15727(Direction.field_818, Direction.field_809);

   private static final int field_15726 = 1 << field_15727.ordinal();
   private static final int field_15734 = 1 << field_15721.ordinal();
   private static final int field_15724 = 1 << field_15716.ordinal();
   private static final int field_15728 = 1 << field_15723.ordinal();
   private static final int field_15732 = 1 << field_15719.ordinal();
   private static final int field_15718 = 1 << field_15729.ordinal();
   private static final int field_15720 = 1 << field_15730.ordinal();
   private static final int field_15731 = 1 << field_15717.ordinal();
   private final Set<Direction> field_15722;

   private class_3162(Direction... var3) {
      this.field_15722 = Sets.immutableEnumSet(Arrays.<Direction>asList(var3));
   }

   public Set<Direction> method_14594() {
      return this.field_15722;
   }
}
