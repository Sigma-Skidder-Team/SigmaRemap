package remapped;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class class_670 extends class_3077 {
   private static String[] field_3722;
   private static final Set<class_6414> field_3721 = ImmutableSet.of(
      class_4783.field_23285,
      class_4783.field_23867,
      class_4783.field_23808,
      class_4783.field_23517,
      class_4783.field_23527,
      class_4783.field_23681,
      new class_6414[]{
         class_4783.field_23385,
         class_4783.field_23692,
         class_4783.field_23481,
         class_4783.field_23249,
         class_4783.field_23496,
         class_4783.field_23810,
         class_4783.field_23272,
         class_4783.field_23803,
         class_4783.field_23584,
         class_4783.field_23774,
         class_4783.field_23700,
         class_4783.field_23829,
         class_4783.field_23437,
         class_4783.field_23540,
         class_4783.field_23515,
         class_4783.field_23459,
         class_4783.field_23250,
         class_4783.field_23863,
         class_4783.field_23236,
         class_4783.field_23610,
         class_4783.field_23160,
         class_4783.field_23644,
         class_4783.field_23695,
         class_4783.field_23716,
         class_4783.field_23440,
         class_4783.field_23514,
         class_4783.field_23271,
         class_4783.field_23582,
         class_4783.field_23326,
         class_4783.field_23547,
         class_4783.field_23575,
         class_4783.field_23822,
         class_4783.field_23351,
         class_4783.field_23676,
         class_4783.field_23449,
         class_4783.field_23737,
         class_4783.field_23506,
         class_4783.field_23911,
         class_4783.field_23828,
         class_4783.field_23412,
         class_4783.field_23743,
         class_4783.field_23505,
         class_4783.field_23468,
         class_4783.field_23448,
         class_4783.field_23820,
         class_4783.field_23177,
         class_4783.field_23849,
         class_4783.field_23869,
         class_4783.field_23667,
         class_4783.field_23550,
         class_4783.field_23453,
         class_4783.field_23620,
         class_4783.field_23451,
         class_4783.field_23651,
         class_4783.field_23191,
         class_4783.field_23354,
         class_4783.field_23710,
         class_4783.field_23836,
         class_4783.field_23761,
         class_4783.field_23169,
         class_4783.field_23190,
         class_4783.field_23475,
         class_4783.field_23352,
         class_4783.field_23533,
         class_4783.field_23507,
         class_4783.field_23564,
         class_4783.field_23476,
         class_4783.field_23524,
         class_4783.field_23858,
         class_4783.field_23228,
         class_4783.field_23777,
         class_4783.field_23293,
         class_4783.field_23819,
         class_4783.field_23873,
         class_4783.field_23400,
         class_4783.field_23649,
         class_4783.field_23861,
         class_4783.field_23336
      }
   );

   public class_670(class_1525 var1, int var2, float var3, class_317 var4) {
      super((float)var2, var3, var1, field_3721, var4);
   }

   @Override
   public boolean method_11222(class_2522 var1) {
      int var4 = this.method_44987().method_6961();
      if (var1.method_8350(class_4783.field_23881)
         || var1.method_8350(class_4783.field_23222)
         || var1.method_8350(class_4783.field_23211)
         || var1.method_8350(class_4783.field_23807)
         || var1.method_8350(class_4783.field_23161)) {
         return var4 >= 3;
      } else if (var1.method_8350(class_4783.field_23527)
         || var1.method_8350(class_4783.field_23681)
         || var1.method_8350(class_4783.field_23463)
         || var1.method_8350(class_4783.field_23897)
         || var1.method_8350(class_4783.field_23692)
         || var1.method_8350(class_4783.field_23481)
         || var1.method_8350(class_4783.field_23515)) {
         return var4 >= 2;
      } else if (!var1.method_8350(class_4783.field_23810)
         && !var1.method_8350(class_4783.field_23272)
         && !var1.method_8350(class_4783.field_23803)
         && !var1.method_8350(class_4783.field_23584)) {
         class_5371 var5 = var1.method_8362();
         return var5 == class_5371.field_27438 || var5 == class_5371.field_27408 || var5 == class_5371.field_27435 || var1.method_8350(class_4783.field_23249);
      } else {
         return var4 >= 1;
      }
   }

   @Override
   public float method_11235(ItemStack var1, class_2522 var2) {
      class_5371 var5 = var2.method_8362();
      return var5 != class_5371.field_27408 && var5 != class_5371.field_27435 && var5 != class_5371.field_27438
         ? super.method_11235(var1, var2)
         : this.field_15134;
   }
}
