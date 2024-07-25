package remapped;

import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class class_3758 implements class_2565 {
   private static String[] field_18368;
   public final class_9633 field_18367;
   public final Map<class_3581, class_9633> field_18366;
   public class_3581 field_18370 = null;
   public final Set<class_9633> field_18369 = Sets.newHashSet();
   private final class_7907 field_18365 = new class_6018(this);

   public class_3758(class_9633 var1, Map<class_3581, class_9633> var2) {
      this.field_18367 = var1;
      this.field_18366 = var2;
      this.field_18367.method_44470(this);

      for (class_9633 var6 : var2.values()) {
         var6.method_44470(this);
      }
   }

   @Override
   public class_7907 method_11645(class_3581 var1) {
      class_9633 var4 = this.method_17420(var1);
      if (!Objects.equals(this.field_18370, var1)) {
         if (this.field_18370 != null) {
            class_3581 var5 = this.field_18370;
            if (!this.field_18366.containsKey(var5)) {
               this.method_17416(var5);
            }
         }

         if (this.field_18369.add(var4)) {
            var4.method_44471(var1.method_16764(), var1.method_16718());
         }

         this.field_18370 = var1;
      }

      return (class_7907)(var1.method_16758() != class_5525.field_28154 ? var4 : this.field_18365);
   }

   private class_9633 method_17420(class_3581 var1) {
      return this.field_18366.getOrDefault(var1, this.field_18367);
   }

   public void method_17415() {
      if (!this.field_18369.isEmpty()) {
         if (this.field_18370 != null) {
            class_7907 var3 = this.method_11645(this.field_18370);
            if (var3 == this.field_18367) {
               this.method_17416(this.field_18370);
            }
         }

         for (class_3581 var4 : this.field_18366.keySet()) {
            this.method_17416(var4);
         }
      }
   }

   public void method_17416(class_3581 var1) {
      class_9633 var4 = this.method_17420(var1);
      boolean var5 = Objects.equals(this.field_18370, var1);
      if ((var5 || var4 != this.field_18367) && this.field_18369.remove(var4)) {
         var1.method_16745(var4, 0, 0, 0);
         if (var5) {
            this.field_18370 = null;
         }
      }
   }

   public class_7907 method_17417(class_4639 var1, class_7907 var2) {
      if (this.field_18370 instanceof class_7634) {
         var1 = class_3581.method_16768(var1);
         class_7634 var5 = (class_7634)this.field_18370;
         class_7634 var6 = var5.method_34592(var1);
         return this.method_11645(var6);
      } else {
         return var2;
      }
   }

   public class_3581 method_17419() {
      return this.field_18370;
   }

   @Override
   public void method_11646() {
      class_3581 var3 = this.field_18370;
      this.method_17415();
      if (var3 != null) {
         this.method_11645(var3);
      }
   }

   public class_7907 method_17418() {
      return this.field_18365;
   }
}
