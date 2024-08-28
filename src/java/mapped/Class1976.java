package mapped;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public enum Class1976 {
   field12863(Direction.NORTH),
   field12864(Direction.NORTH, Direction.EAST),
   field12865(Direction.EAST),
   field12866(Direction.SOUTH, Direction.EAST),
   field12867(Direction.SOUTH),
   field12868(Direction.SOUTH, Direction.WEST),
   field12869(Direction.WEST),
   field12870(Direction.NORTH, Direction.WEST);

   private static final int field12871 = 1 << field12870.ordinal();
   private static final int field12872 = 1 << field12869.ordinal();
   private static final int field12873 = 1 << field12868.ordinal();
   private static final int field12874 = 1 << field12867.ordinal();
   private static final int field12875 = 1 << field12866.ordinal();
   private static final int field12876 = 1 << field12865.ordinal();
   private static final int field12877 = 1 << field12864.ordinal();
   private static final int field12878 = 1 << field12863.ordinal();
   private final Set<Direction> field12879;
   private static final Class1976[] field12880 = new Class1976[]{
      field12863, field12864, field12865, field12866, field12867, field12868, field12869, field12870
   };

   private Class1976(Direction... var3) {
      this.field12879 = Sets.immutableEnumSet(Arrays.<Direction>asList(var3));
   }

   public Set<Direction> method8262() {
      return this.field12879;
   }
}
