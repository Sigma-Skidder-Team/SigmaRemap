package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public enum Class1896 {
   field11113(new ItemStack(Items.field37905)),
   field11114(new ItemStack(Blocks.field36523)),
   field11115(new ItemStack(Items.field37887)),
   field11116(new ItemStack(Items.field37823), new ItemStack(Items.field37815)),
   field11117(new ItemStack(Items.field37884), new ItemStack(Items.field37795)),
   field11118(new ItemStack(Items.field37905)),
   field11119(new ItemStack(Items.field37869)),
   field11120(new ItemStack(Blocks.STONE)),
   field11121(new ItemStack(Items.field37884), new ItemStack(Items.field38049)),
   field11122(new ItemStack(Items.field37905)),
   field11123(new ItemStack(Blocks.field36567)),
   field11124(new ItemStack(Items.field37821), new ItemStack(Items.field37862)),
   field11125(new ItemStack(Items.field37905)),
   field11126(new ItemStack(Items.field37869)),
   field11127(new ItemStack(Items.field37465)),
   field11128(new ItemStack(Items.field37865)),
   field11129(new ItemStack(Items.field37869)),
   field11130(new ItemStack(Items.field37569));

   public static final List<Class1896> field11131 = ImmutableList.of(field11125, field11126);
   public static final List<Class1896> field11132 = ImmutableList.of(field11122, field11123, field11124);
   public static final List<Class1896> field11133 = ImmutableList.of(field11118, field11119, field11120, field11121);
   public static final List<Class1896> field11134 = ImmutableList.of(field11113, field11116, field11114, field11117, field11115);
   public static final Map<Class1896, List<Class1896>> field11135 = ImmutableMap.of(
      field11113,
      ImmutableList.of(field11116, field11114, field11117, field11115),
      field11118,
      ImmutableList.of(field11119, field11120, field11121),
      field11122,
      ImmutableList.of(field11123, field11124),
      field11125,
      ImmutableList.of(field11126)
   );
   private final List<ItemStack> field11136;
   private static final Class1896[] field11137 = new Class1896[]{
      field11113,
      field11114,
      field11115,
      field11116,
      field11117,
      field11118,
      field11119,
      field11120,
      field11121,
      field11122,
      field11123,
      field11124,
      field11125,
      field11126,
      field11127,
      field11128,
      field11129,
      field11130
   };

   private Class1896(ItemStack... var3) {
      this.field11136 = ImmutableList.copyOf(var3);
   }

   public static List<Class1896> method8163(Class1939 var0) {
      switch (Class8964.field40488[var0.ordinal()]) {
         case 1:
            return field11134;
         case 2:
            return field11133;
         case 3:
            return field11132;
         case 4:
            return field11131;
         default:
            return ImmutableList.of();
      }
   }

   public List<ItemStack> method8164() {
      return this.field11136;
   }
}
