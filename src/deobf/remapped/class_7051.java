package remapped;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_7051 implements class_6867, class_9875 {
   public final class_2831<class_6098> field_36401 = class_2831.<class_6098>method_12872(36, class_6098.field_31203);
   public final class_2831<class_6098> field_36405 = class_2831.<class_6098>method_12872(4, class_6098.field_31203);
   public final class_2831<class_6098> field_36406 = class_2831.<class_6098>method_12872(1, class_6098.field_31203);
   private final List<class_2831<class_6098>> field_36407 = ImmutableList.of(this.field_36401, this.field_36405, this.field_36406);
   public int field_36404;
   public final class_704 field_36409;
   private class_6098 field_36408 = class_6098.field_31203;
   private int field_36403;

   public class_7051(class_704 var1) {
      this.field_36409 = var1;
   }

   public class_6098 method_32403() {
      return !method_32417(this.field_36404) ? class_6098.field_31203 : this.field_36401.get(this.field_36404);
   }

   public static int method_32422() {
      return 9;
   }

   private boolean method_32406(class_6098 var1, class_6098 var2) {
      return !var1.method_28022()
         && this.method_32412(var1, var2)
         && var1.method_28005()
         && var1.method_27997() < var1.method_28016()
         && var1.method_27997() < this.method_31506();
   }

   private boolean method_32412(class_6098 var1, class_6098 var2) {
      return var1.method_27960() == var2.method_27960() && class_6098.method_27956(var1, var2);
   }

   public int method_32398() {
      for (int var3 = 0; var3 < this.field_36401.size(); var3++) {
         if (this.field_36401.get(var3).method_28022()) {
            return var3;
         }
      }

      return -1;
   }

   public void method_32427(class_6098 var1) {
      int var4 = this.method_32407(var1);
      if (!method_32417(var4)) {
         if (var4 != -1) {
            this.method_32426(var4);
         } else {
            this.field_36404 = this.method_32401();
            if (!this.field_36401.get(this.field_36404).method_28022()) {
               int var5 = this.method_32398();
               if (var5 != -1) {
                  this.field_36401.set(var5, this.field_36401.get(this.field_36404));
               }
            }

            this.field_36401.set(this.field_36404, var1);
         }
      } else {
         this.field_36404 = var4;
      }
   }

   public void method_32426(int var1) {
      this.field_36404 = this.method_32401();
      class_6098 var4 = this.field_36401.get(this.field_36404);
      this.field_36401.set(this.field_36404, this.field_36401.get(var1));
      this.field_36401.set(var1, var4);
   }

   public static boolean method_32417(int var0) {
      return var0 >= 0 && var0 < 9;
   }

   public int method_32407(class_6098 var1) {
      for (int var4 = 0; var4 < this.field_36401.size(); var4++) {
         if (!this.field_36401.get(var4).method_28022() && this.method_32412(var1, this.field_36401.get(var4))) {
            return var4;
         }
      }

      return -1;
   }

   public int method_32425(class_6098 var1) {
      for (int var4 = 0; var4 < this.field_36401.size(); var4++) {
         class_6098 var5 = this.field_36401.get(var4);
         if (!this.field_36401.get(var4).method_28022()
            && this.method_32412(var1, this.field_36401.get(var4))
            && !this.field_36401.get(var4).method_27995()
            && !var5.method_28020()
            && !var5.method_28018()) {
            return var4;
         }
      }

      return -1;
   }

   public int method_32401() {
      for (int var3 = 0; var3 < 9; var3++) {
         int var4 = (this.field_36404 + var3) % 9;
         if (this.field_36401.get(var4).method_28022()) {
            return var4;
         }
      }

      for (int var5 = 0; var5 < 9; var5++) {
         int var6 = (this.field_36404 + var5) % 9;
         if (!this.field_36401.get(var6).method_28020()) {
            return var6;
         }
      }

      return this.field_36404;
   }

   public void method_32415(double var1) {
      if (var1 > 0.0) {
         var1 = 1.0;
      }

      if (var1 < 0.0) {
         var1 = -1.0;
      }

      this.field_36404 = (int)((double)this.field_36404 - var1);

      while (this.field_36404 < 0) {
         this.field_36404 += 9;
      }

      while (this.field_36404 >= 9) {
         this.field_36404 -= 9;
      }
   }

   public int method_32428(Predicate<class_6098> var1, int var2, class_6867 var3) {
      int var6 = 0;
      boolean var7 = var2 == 0;
      var6 += class_3037.method_13877(this, var1, var2 - var6, var7);
      var6 += class_3037.method_13877(var3, var1, var2 - var6, var7);
      var6 += class_3037.method_13875(this.field_36408, var1, var2 - var6, var7);
      if (this.field_36408.method_28022()) {
         this.field_36408 = class_6098.field_31203;
      }

      return var6;
   }

   private int method_32397(class_6098 var1) {
      int var4 = this.method_32402(var1);
      if (var4 == -1) {
         var4 = this.method_32398();
      }

      return var4 != -1 ? this.method_32410(var4, var1) : var1.method_27997();
   }

   private int method_32410(int var1, class_6098 var2) {
      class_2451 var5 = var2.method_27960();
      int var6 = var2.method_27997();
      class_6098 var7 = this.method_31498(var1);
      if (var7.method_28022()) {
         var7 = new class_6098(var5, 0);
         if (var2.method_28002()) {
            var7.method_27965(var2.method_27990().method_25944());
         }

         this.method_31503(var1, var7);
      }

      int var8 = var6;
      if (var6 > var7.method_28016() - var7.method_27997()) {
         var8 = var7.method_28016() - var7.method_27997();
      }

      if (var8 > this.method_31506() - var7.method_27997()) {
         var8 = this.method_31506() - var7.method_27997();
      }

      if (var8 != 0) {
         var6 -= var8;
         var7.method_28030(var8);
         var7.method_27968(5);
         return var6;
      } else {
         return var6;
      }
   }

   public int method_32402(class_6098 var1) {
      if (this.method_32406(this.method_31498(this.field_36404), var1)) {
         return this.field_36404;
      } else if (this.method_32406(this.method_31498(40), var1)) {
         return 40;
      } else {
         for (int var4 = 0; var4 < this.field_36401.size(); var4++) {
            if (this.method_32406(this.field_36401.get(var4), var1)) {
               return var4;
            }
         }

         return -1;
      }
   }

   public void method_32429() {
      for (class_2831 var4 : this.field_36407) {
         for (int var5 = 0; var5 < var4.size(); var5++) {
            if (!((class_6098)var4.get(var5)).method_28022()) {
               ((class_6098)var4.get(var5)).method_28007(this.field_36409.field_41768, this.field_36409, var5, this.field_36404 == var5);
            }
         }
      }
   }

   public boolean method_32414(class_6098 var1) {
      return this.method_32404(-1, var1);
   }

   public boolean method_32404(int var1, class_6098 var2) {
      if (var2.method_28022()) {
         return false;
      } else {
         try {
            if (var2.method_27995()) {
               if (var1 == -1) {
                  var1 = this.method_32398();
               }

               if (var1 >= 0) {
                  this.field_36401.set(var1, var2.method_27973());
                  this.field_36401.get(var1).method_27968(5);
                  var2.method_28017(0);
                  return true;
               } else if (this.field_36409.field_3876.field_4944) {
                  var2.method_28017(0);
                  return true;
               } else {
                  return false;
               }
            } else {
               int var5;
               do {
                  var5 = var2.method_27997();
                  if (var1 == -1) {
                     var2.method_28017(this.method_32397(var2));
                  } else {
                     var2.method_28017(this.method_32410(var1, var2));
                  }
               } while (!var2.method_28022() && var2.method_27997() < var5);

               if (var2.method_27997() == var5 && this.field_36409.field_3876.field_4944) {
                  var2.method_28017(0);
                  return true;
               } else {
                  return var2.method_27997() < var5;
               }
            }
         } catch (Throwable var8) {
            class_159 var6 = class_159.method_643(var8, "Adding item to inventory");
            class_6544 var7 = var6.method_639("Item being added");
            var7.method_29850("Item ID", class_2451.method_11244(var2.method_27960()));
            var7.method_29850("Item data", var2.method_28026());
            var7.method_29851("Item name", () -> var2.method_28008().getString());
            throw new class_3297(var6);
         }
      }
   }

   public void method_32395(class_6486 var1, class_6098 var2) {
      if (!var1.field_33055) {
         while (!var2.method_28022()) {
            int var5 = this.method_32402(var2);
            if (var5 == -1) {
               var5 = this.method_32398();
            }

            if (var5 == -1) {
               this.field_36409.method_3153(var2, false);
               break;
            }

            int var6 = var2.method_28016() - this.method_31498(var5).method_27997();
            if (this.method_32404(var5, var2.method_27953(var6))) {
               ((class_9359)this.field_36409).field_47794.method_4156(new class_5491(-2, var5, this.method_31498(var5)));
            }
         }
      }
   }

   @Override
   public class_6098 method_31497(int var1, int var2) {
      class_2831 var5 = null;

      for (class_2831 var7 : this.field_36407) {
         if (var1 < var7.size()) {
            var5 = var7;
            break;
         }

         var1 -= var7.size();
      }

      return var5 != null && !((class_6098)var5.get(var1)).method_28022() ? class_3037.method_13881(var5, var1, var2) : class_6098.field_31203;
   }

   public void method_32419(class_6098 var1) {
      for (class_2831 var5 : this.field_36407) {
         for (int var6 = 0; var6 < var5.size(); var6++) {
            if (var5.get(var6) == var1) {
               var5.set(var6, class_6098.field_31203);
               break;
            }
         }
      }
   }

   @Override
   public class_6098 method_31507(int var1) {
      class_2831 var4 = null;

      for (class_2831 var6 : this.field_36407) {
         if (var1 < var6.size()) {
            var4 = var6;
            break;
         }

         var1 -= var6.size();
      }

      if (var4 != null && !((class_6098)var4.get(var1)).method_28022()) {
         class_6098 var7 = (class_6098)var4.get(var1);
         var4.set(var1, class_6098.field_31203);
         return var7;
      } else {
         return class_6098.field_31203;
      }
   }

   @Override
   public void method_31503(int var1, class_6098 var2) {
      class_2831 var5 = null;

      for (class_2831 var7 : this.field_36407) {
         if (var1 < var7.size()) {
            var5 = var7;
            break;
         }

         var1 -= var7.size();
      }

      if (var5 != null) {
         var5.set(var1, var2);
      }
   }

   public float method_32413(class_2522 var1) {
      return this.field_36401.get(this.field_36404).method_28035(var1);
   }

   public class_3416 method_32396(class_3416 var1) {
      for (int var4 = 0; var4 < this.field_36401.size(); var4++) {
         if (!this.field_36401.get(var4).method_28022()) {
            class_5734 var5 = new class_5734();
            var5.method_25921("Slot", (byte)var4);
            this.field_36401.get(var4).method_27998(var5);
            var1.add(var5);
         }
      }

      for (int var6 = 0; var6 < this.field_36405.size(); var6++) {
         if (!this.field_36405.get(var6).method_28022()) {
            class_5734 var8 = new class_5734();
            var8.method_25921("Slot", (byte)(var6 + 100));
            this.field_36405.get(var6).method_27998(var8);
            var1.add(var8);
         }
      }

      for (int var7 = 0; var7 < this.field_36406.size(); var7++) {
         if (!this.field_36406.get(var7).method_28022()) {
            class_5734 var9 = new class_5734();
            var9.method_25921("Slot", (byte)(var7 + 150));
            this.field_36406.get(var7).method_27998(var9);
            var1.add(var9);
         }
      }

      return var1;
   }

   public void method_32423(class_3416 var1) {
      this.field_36401.clear();
      this.field_36405.clear();
      this.field_36406.clear();

      for (int var4 = 0; var4 < var1.size(); var4++) {
         class_5734 var5 = var1.method_15764(var4);
         int var6 = var5.method_25950("Slot") & 255;
         class_6098 var7 = class_6098.method_28015(var5);
         if (!var7.method_28022()) {
            if (var6 >= 0 && var6 < this.field_36401.size()) {
               this.field_36401.set(var6, var7);
            } else if (var6 >= 100 && var6 < this.field_36405.size() + 100) {
               this.field_36405.set(var6 - 100, var7);
            } else if (var6 >= 150 && var6 < this.field_36406.size() + 150) {
               this.field_36406.set(var6 - 150, var7);
            }
         }
      }
   }

   @Override
   public int method_31505() {
      return this.field_36401.size() + this.field_36405.size() + this.field_36406.size();
   }

   @Override
   public boolean method_31495() {
      for (class_6098 var4 : this.field_36401) {
         if (!var4.method_28022()) {
            return false;
         }
      }

      for (class_6098 var7 : this.field_36405) {
         if (!var7.method_28022()) {
            return false;
         }
      }

      for (class_6098 var8 : this.field_36406) {
         if (!var8.method_28022()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public class_6098 method_31498(int var1) {
      class_2831 var4 = null;

      for (class_2831 var6 : this.field_36407) {
         if (var1 < var6.size()) {
            var4 = var6;
            break;
         }

         var1 -= var6.size();
      }

      return var4 != null ? (class_6098)var4.get(var1) : class_6098.field_31203;
   }

   @Override
   public ITextComponent method_45509() {
      return new TranslationTextComponent("container.inventory");
   }

   public class_6098 method_32416(int var1) {
      return this.field_36405.get(var1);
   }

   public void method_32400(class_6199 var1, float var2) {
      if (!(var2 <= 0.0F)) {
         var2 /= 4.0F;
         if (var2 < 1.0F) {
            var2 = 1.0F;
         }

         for (int var5 = 0; var5 < this.field_36405.size(); var5++) {
            class_6098 var6 = this.field_36405.get(var5);
            if ((!var1.method_28360() || !var6.method_27960().method_11208()) && var6.method_27960() instanceof class_8228) {
               int var7 = var5;
               var6.method_28003((int)var2, this.field_36409, var1x -> var1x.method_26448(class_6943.method_31768(class_7268.field_37219, var7)));
            }
         }
      }
   }

   public void method_32411() {
      for (List var4 : this.field_36407) {
         for (int var5 = 0; var5 < var4.size(); var5++) {
            class_6098 var6 = (class_6098)var4.get(var5);
            if (!var6.method_28022()) {
               this.field_36409.method_3154(var6, true, false);
               var4.set(var5, class_6098.field_31203);
            }
         }
      }
   }

   @Override
   public void method_17407() {
      this.field_36403++;
   }

   public int method_32399() {
      return this.field_36403;
   }

   public void method_32408(class_6098 var1) {
      this.field_36408 = var1;
   }

   public class_6098 method_32424() {
      return this.field_36408;
   }

   @Override
   public boolean method_31502(class_704 var1) {
      return !this.field_36409.field_41751 ? !(var1.method_37275(this.field_36409) > 64.0) : false;
   }

   public boolean method_32405(class_6098 var1) {
      for (List var5 : this.field_36407) {
         for (class_6098 var7 : var5) {
            if (!var7.method_28022() && var7.method_27991(var1)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean method_32418(class_2307<class_2451> var1) {
      for (List var5 : this.field_36407) {
         for (class_6098 var7 : var5) {
            if (!var7.method_28022() && var1.method_10609(var7.method_27960())) {
               return true;
            }
         }
      }

      return false;
   }

   public void method_32421(class_7051 var1) {
      for (int var4 = 0; var4 < this.method_31505(); var4++) {
         this.method_31503(var4, var1.method_31498(var4));
      }

      this.field_36404 = var1.field_36404;
   }

   @Override
   public void method_24975() {
      for (List var4 : this.field_36407) {
         var4.clear();
      }
   }

   public void method_32409(class_534 var1) {
      for (class_6098 var5 : this.field_36401) {
         var1.method_2606(var5);
      }
   }
}
