package remapped;

import com.google.common.collect.ImmutableList;
import java.util.List;

public class class_4600 {
   private static String[] field_22368;
   public final class_7732 field_22370;
   public final class_7732 field_22366;
   private final class_2062 field_22364;
   private final class_1131 field_22371;
   private final class_8294 field_22363;
   private List<class_6291> field_22367 = ImmutableList.of();
   private int field_22365;
   private boolean field_22362;
   private class_3801 field_22369 = class_3801.field_18599;

   public class_4600(class_7732 var1, class_7732 var2, class_2062 var3, class_1131 var4, class_8294 var5) {
      this.field_22370 = var1;
      this.field_22366 = var2;
      this.field_22364 = var3;
      this.field_22371 = var4;
      this.field_22363 = var5;
   }

   public class_4600 method_21313(List<class_6291> var1) {
      this.field_22367 = var1;
      return this;
   }

   public class_4600 method_21315(int var1) {
      this.field_22365 = var1;
      return this;
   }

   public class_4600 method_21310() {
      this.field_22362 = true;
      return this;
   }

   public class_4600 method_21312(class_3801 var1) {
      this.field_22369 = var1;
      return this;
   }

   public class_1297 method_21311() {
      return new class_1297(
         this.field_22370,
         this.field_22366,
         this.field_22364,
         this.field_22371,
         this.field_22363,
         this.field_22367,
         this.field_22365,
         this.field_22362,
         this.field_22369
      );
   }
}
