package remapped;

import java.util.Arrays;

public final class class_679 {
   private static String[] field_3756;
   private static final Direction[] field_3752 = Direction.values();
   private static final int field_3754 = class_3397.values().length;
   public final boolean field_3748;
   private final boolean field_3750;
   private final int field_3746;
   private final class_4190[] field_3755;
   public final class_4190 field_3747;
   public final boolean field_3753;
   private final boolean[] field_3751;
   public final boolean field_3749;

   private class_679(class_2522 var1) {
      class_6414 var4 = var1.method_8360();
      this.field_3748 = var1.method_8321(class_8034.field_41115, class_1331.field_7306);
      this.field_3750 = var4.method_29275(var1, class_8034.field_41115, class_1331.field_7306);
      this.field_3746 = var4.method_10794(var1, class_8034.field_41115, class_1331.field_7306);
      if (var1.method_8302()) {
         this.field_3755 = new class_4190[field_3752.length];
         class_4190 var5 = var4.method_10790(var1, class_8034.field_41115, class_1331.field_7306);

         for (Direction var9 : field_3752) {
            this.field_3755[var9.ordinal()] = class_3370.method_15526(var5, var9);
         }
      } else {
         this.field_3755 = null;
      }

      this.field_3747 = var4.method_10775(var1, class_8034.field_41115, class_1331.field_7306, class_214.method_928());
      this.field_3753 = Arrays.<class_9249>stream(class_9249.values())
         .anyMatch(var1x -> this.field_3747.method_19491(var1x) < 0.0 || this.field_3747.method_19495(var1x) > 1.0);
      this.field_3751 = new boolean[field_3752.length * field_3754];

      for (Direction var16 : field_3752) {
         for (class_3397 var12 : class_3397.values()) {
            this.field_3751[method_3091(var16, var12)] = var12.method_15689(var1, class_8034.field_41115, class_1331.field_7306, var16);
         }
      }

      this.field_3749 = class_6414.method_29301(var1.method_8324(class_8034.field_41115, class_1331.field_7306));
   }

   public boolean method_3090(Direction var1, class_3397 var2) {
      return this.field_3751[method_3091(var1, var2)];
   }

   private static int method_3091(Direction var0, class_3397 var1) {
      return var0.ordinal() * field_3754 + var1.ordinal();
   }
}
