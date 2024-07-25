package remapped;

import com.google.common.collect.Lists;
import java.util.List;

public class class_9518 {
   private static String[] field_48452;
   private final List<class_5187> field_48456 = Lists.newArrayList();
   private final List<class_5187> field_48453 = Lists.newArrayList();
   private class_2451 field_48454;
   private class_2307<class_2451> field_48458;
   private class_7781 field_48451 = class_7781.field_39439;
   private class_7781 field_48457 = class_7781.field_39439;
   private class_6004 field_48455;
   private class_6000 field_48459 = class_6000.field_30559;

   private class_9518() {
   }

   public static class_9518 method_43918() {
      return new class_9518();
   }

   public class_9518 method_43915(class_8525 var1) {
      this.field_48454 = var1.method_10803();
      return this;
   }

   public class_9518 method_43919(class_2307<class_2451> var1) {
      this.field_48458 = var1;
      return this;
   }

   public class_9518 method_43916(CompoundNBT var1) {
      this.field_48459 = new class_6000(var1);
      return this;
   }

   public class_9518 method_43920(class_5187 var1) {
      this.field_48456.add(var1);
      return this;
   }

   public class_5319 method_43921() {
      return new class_5319(
         this.field_48458,
         this.field_48454,
         this.field_48451,
         this.field_48457,
         this.field_48456.<class_5187>toArray(class_5187.field_26690),
         this.field_48453.<class_5187>toArray(class_5187.field_26690),
         this.field_48455,
         this.field_48459
      );
   }
}
