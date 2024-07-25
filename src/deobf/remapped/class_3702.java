package remapped;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class class_3702 {
   private static String[] field_18161;
   private int field_18167;
   private float field_18162;
   private boolean field_18163;
   private boolean field_18164;
   private boolean field_18166;
   private final List<Pair<class_2250, Float>> field_18165 = Lists.newArrayList();

   public class_3702 method_17201(int var1) {
      this.field_18167 = var1;
      return this;
   }

   public class_3702 method_17197(float var1) {
      this.field_18162 = var1;
      return this;
   }

   public class_3702 method_17202() {
      this.field_18163 = true;
      return this;
   }

   public class_3702 method_17196() {
      this.field_18164 = true;
      return this;
   }

   public class_3702 method_17199() {
      this.field_18166 = true;
      return this;
   }

   public class_3702 method_17203(class_2250 var1, float var2) {
      this.field_18165.add(Pair.of(var1, var2));
      return this;
   }

   public class_8341 method_17198() {
      return new class_8341(this.field_18167, this.field_18162, this.field_18163, this.field_18164, this.field_18166, this.field_18165, null);
   }
}
