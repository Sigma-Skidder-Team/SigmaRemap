package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class class_4657 implements class_6867, class_3957 {
   private static String[] field_22719;
   private final int field_22720;
   private final class_2831<class_6098> field_22722;
   private List<class_8129> field_22721;

   public class_4657(int var1) {
      this.field_22720 = var1;
      this.field_22722 = class_2831.<class_6098>method_12872(var1, class_6098.field_31203);
   }

   public class_4657(class_6098... var1) {
      this.field_22720 = var1.length;
      this.field_22722 = class_2831.<class_6098>method_12871(class_6098.field_31203, var1);
   }

   public void method_21548(class_8129 var1) {
      if (this.field_22721 == null) {
         this.field_22721 = Lists.newArrayList();
      }

      this.field_22721.add(var1);
   }

   public void method_21543(class_8129 var1) {
      this.field_22721.remove(var1);
   }

   @Override
   public class_6098 method_31498(int var1) {
      return var1 >= 0 && var1 < this.field_22722.size() ? this.field_22722.get(var1) : class_6098.field_31203;
   }

   public List<class_6098> method_21553() {
      List var3 = this.field_22722.stream().filter(var0 -> !var0.method_28022()).collect(Collectors.toList());
      this.method_24975();
      return var3;
   }

   @Override
   public class_6098 method_31497(int var1, int var2) {
      class_6098 var5 = class_3037.method_13881(this.field_22722, var1, var2);
      if (!var5.method_28022()) {
         this.method_17407();
      }

      return var5;
   }

   public class_6098 method_21547(class_2451 var1, int var2) {
      class_6098 var5 = new class_6098(var1, 0);

      for (int var6 = this.field_22720 - 1; var6 >= 0; var6--) {
         class_6098 var7 = this.method_31498(var6);
         if (var7.method_27960().equals(var1)) {
            int var8 = var2 - var5.method_27997();
            class_6098 var9 = var7.method_27953(var8);
            var5.method_28030(var9.method_27997());
            if (var5.method_27997() == var2) {
               break;
            }
         }
      }

      if (!var5.method_28022()) {
         this.method_17407();
      }

      return var5;
   }

   public class_6098 method_21542(class_6098 var1) {
      class_6098 var4 = var1.method_27973();
      this.method_21551(var4);
      if (!var4.method_28022()) {
         this.method_21550(var4);
         return !var4.method_28022() ? var4 : class_6098.field_31203;
      } else {
         return class_6098.field_31203;
      }
   }

   public boolean method_21541(class_6098 var1) {
      boolean var4 = false;

      for (class_6098 var6 : this.field_22722) {
         if (var6.method_28022() || this.method_21544(var6, var1) && var6.method_27997() < var6.method_28016()) {
            var4 = true;
            break;
         }
      }

      return var4;
   }

   @Override
   public class_6098 method_31507(int var1) {
      class_6098 var4 = this.field_22722.get(var1);
      if (!var4.method_28022()) {
         this.field_22722.set(var1, class_6098.field_31203);
         return var4;
      } else {
         return class_6098.field_31203;
      }
   }

   @Override
   public void method_31503(int var1, class_6098 var2) {
      this.field_22722.set(var1, var2);
      if (!var2.method_28022() && var2.method_27997() > this.method_31506()) {
         var2.method_28017(this.method_31506());
      }

      this.method_17407();
   }

   @Override
   public int method_31505() {
      return this.field_22720;
   }

   @Override
   public boolean method_31495() {
      for (class_6098 var4 : this.field_22722) {
         if (!var4.method_28022()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void method_17407() {
      if (this.field_22721 != null) {
         for (class_8129 var4 : this.field_22721) {
            var4.method_36982(this);
         }
      }
   }

   @Override
   public boolean method_31502(class_704 var1) {
      return true;
   }

   @Override
   public void method_24975() {
      this.field_22722.clear();
      this.method_17407();
   }

   @Override
   public void method_18279(class_534 var1) {
      for (class_6098 var5 : this.field_22722) {
         var1.method_2598(var5);
      }
   }

   @Override
   public String toString() {
      return this.field_22722.stream().filter(var0 -> !var0.method_28022()).collect(Collectors.toList()).toString();
   }

   private void method_21550(class_6098 var1) {
      for (int var4 = 0; var4 < this.field_22720; var4++) {
         class_6098 var5 = this.method_31498(var4);
         if (var5.method_28022()) {
            this.method_31503(var4, var1.method_27973());
            var1.method_28017(0);
            return;
         }
      }
   }

   private void method_21551(class_6098 var1) {
      for (int var4 = 0; var4 < this.field_22720; var4++) {
         class_6098 var5 = this.method_31498(var4);
         if (this.method_21544(var5, var1)) {
            this.method_21546(var1, var5);
            if (var1.method_28022()) {
               return;
            }
         }
      }
   }

   private boolean method_21544(class_6098 var1, class_6098 var2) {
      return var1.method_27960() == var2.method_27960() && class_6098.method_27956(var1, var2);
   }

   private void method_21546(class_6098 var1, class_6098 var2) {
      int var5 = Math.min(this.method_31506(), var2.method_28016());
      int var6 = Math.min(var1.method_27997(), var5 - var2.method_27997());
      if (var6 > 0) {
         var2.method_28030(var6);
         var1.method_27970(var6);
         this.method_17407();
      }
   }

   public void method_21549(class_3416 var1) {
      for (int var4 = 0; var4 < var1.size(); var4++) {
         class_6098 var5 = class_6098.method_28015(var1.method_15764(var4));
         if (!var5.method_28022()) {
            this.method_21542(var5);
         }
      }
   }

   public class_3416 method_21552() {
      class_3416 var3 = new class_3416();

      for (int var4 = 0; var4 < this.method_31505(); var4++) {
         class_6098 var5 = this.method_31498(var4);
         if (!var5.method_28022()) {
            var3.add(var5.method_27998(new class_5734()));
         }
      }

      return var3;
   }
}
