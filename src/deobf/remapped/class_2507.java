package remapped;

import java.util.ArrayList;
import java.util.Collections;

public class class_2507 {
   private static String[] field_12455;
   private class_8571 field_12449;
   private class_8571 field_12453;
   private ArrayList<class_3027> field_12448 = new ArrayList<class_3027>();
   private ArrayList<class_3027> field_12452 = new ArrayList<class_3027>();
   private ArrayList<class_3027> field_12446 = new ArrayList<class_3027>();
   private double field_12451 = 9.0;
   private boolean field_12454 = true;
   private static MinecraftClient field_12447 = MinecraftClient.getInstance();
   private static class_8571[] field_12450 = new class_8571[]{
      new class_8571(1.0, 0.0, 0.0),
      new class_8571(-1.0, 0.0, 0.0),
      new class_8571(0.0, 0.0, 1.0),
      new class_8571(0.0, 0.0, -1.0),
      new class_8571(0.0, -1.0, 0.0),
      new class_8571(0.0, 1.0, 0.0)
   };

   public class_2507(class_8571 var1, class_8571 var2) {
      this.field_12449 = var1.method_39422(0.0, 0.0, 0.0).method_39419();
      this.field_12453 = var2.method_39422(0.0, 0.0, 0.0).method_39419();
   }

   public ArrayList<class_3027> method_11426() {
      return this.field_12448;
   }

   public void method_11427() {
      this.method_11428(2000, 4);
   }

   public void method_11428(int var1, int var2) {
      this.field_12448.clear();
      this.field_12446.clear();
      ArrayList var5 = new ArrayList();
      var5.add(this.field_12449);
      this.field_12446.add(new class_3027(this.field_12449, null, var5, this.field_12449.method_39418(this.field_12453), class_407.field_1700, 0.0, 0.0));

      label60:
      for (int var6 = 0; var6 < var1; var6++) {
         Collections.sort(this.field_12446, new class_4708(this));
         int var7 = 0;
         if (this.field_12446.size() == 0) {
            break;
         }

         for (class_3027 var9 : new ArrayList<class_3027>(this.field_12446)) {
            if (++var7 <= var2) {
               this.field_12446.remove(var9);
               this.field_12452.add(var9);

               for (class_8571 var13 : field_12450) {
                  class_407 var14 = this.method_11424(var9, var13, false);
                  if (this.method_11424(var9, var13, false) != class_407.field_1697
                     && this.method_11431(var9, var13, var14, var14 != class_407.field_1696 ? 0.0 : 1.0)) {
                     break label60;
                  }
               }
               continue;
            }
         }
      }

      if (this.field_12454) {
         Collections.sort(this.field_12452, new class_4708(this));
         this.field_12448 = this.method_11434();
      }
   }

   public ArrayList<class_3027> method_11434() {
      Collections.sort(this.field_12452, new class_4708(this));
      class_3027 var3 = this.field_12452.get(0);

      ArrayList var4;
      for (var4 = new ArrayList(); var3.method_13826() != null; var3 = var3.method_13826()) {
         var4.add(var3);
      }

      return var4;
   }

   public static ArrayList<class_3027> method_11423(class_8571 var0, class_8571 var1) {
      class_2507 var4 = new class_2507(var0, var1);
      var4.method_11427();
      return var4.method_11426();
   }

   public boolean method_11429(class_1331 var1) {
      for (class_8571 var7 : field_12450) {
         class_2522 var8 = field_12447.field_9601.method_28262(var1.method_6103(var7.field_43941, var7.field_43940, var7.field_43942));
         if (var8.method_8360() == class_4783.field_23900 || var8.method_8360() == class_4783.field_23811) {
            return true;
         }
      }

      return false;
   }

   public boolean method_11425(int var1, int var2, int var3) {
      class_1331 var6 = new class_1331(var1, var2, var3);
      return field_12447.field_9601.method_28262(new class_1331(var1, var2 - 1, var3)).method_8360() != class_4783.field_23184
         ? !this.method_11429(var6) && !this.method_11429(var6.method_6081())
         : false;
   }

   public class_407 method_11424(class_3027 var1, class_8571 var2, boolean var3) {
      class_8571 var6 = var1.method_13825().method_39421(var2).method_39419();
      if (method_11432((int)var6.method_39427(), (int)var6.method_39425(), (int)var6.method_39423())) {
         if (var1.method_13826().method_13814() == class_407.field_1700
            && this.method_11425((int)var6.method_39427(), (int)var6.method_39425(), (int)var6.method_39423())) {
            return class_407.field_1699;
         }
      } else {
         if (this.method_11433(var6)) {
            return class_407.field_1700;
         }

         if (this.method_11435(var1) && (var2.field_43940 <= 0.0 || this.method_11433(var1.method_13825()))) {
            return class_407.field_1696;
         }
      }

      return class_407.field_1697;
   }

   public boolean method_11433(class_8571 var1) {
      return field_12447.field_9601
            .method_28262(new class_1331((int)var1.method_39427(), (int)var1.method_39425() - 1, (int)var1.method_39423()))
            .method_8360()
         != class_4783.field_23184;
   }

   public boolean method_11435(class_3027 var1) {
      for (int var4 = 0; var4 < 2; var4++) {
         if (var1.method_13826() == null || var1.method_13826().method_13814() == class_407.field_1700) {
            return true;
         }

         var1 = var1.method_13826();
      }

      return false;
   }

   public static boolean method_11432(int var0, int var1, int var2) {
      return field_12447.field_9601.method_28262(new class_1331(var0, var1 + 1, var2)).method_8360() != class_4783.field_23184
         || field_12447.field_9601.method_28262(new class_1331(var0, var1, var2)).method_8360() != class_4783.field_23184;
   }

   public class_3027 method_11436(class_8571 var1, class_407 var2) {
      for (class_3027 var6 : this.field_12452) {
         if (var6.method_13825().method_39427() == var1.method_39427()
            && var6.method_13825().method_39425() == var1.method_39425()
            && var6.method_13825().method_39423() == var1.method_39423()
            && var6.method_13814() == var2) {
            return var6;
         }
      }

      for (class_3027 var8 : this.field_12446) {
         if (var8.method_13825().method_39427() == var1.method_39427()
            && var8.method_13825().method_39425() == var1.method_39425()
            && var8.method_13825().method_39423() == var1.method_39423()
            && var8.method_13814() == var2) {
            return var8;
         }
      }

      return null;
   }

   public boolean method_11431(class_3027 var1, class_8571 var2, class_407 var3, double var4) {
      class_8571 var8 = var1.method_13825().method_39421(var2).method_39419();
      class_3027 var9 = this.method_11436(var8, var3);
      double var10 = var4;
      if (var1 != null) {
         var10 = var4 + var1.method_13815();
      }

      if (var9 == null || var9.method_13814() == class_407.field_1696) {
         if (var8.method_39427() == this.field_12453.method_39427()
               && var8.method_39425() == this.field_12453.method_39425()
               && var8.method_39423() == this.field_12453.method_39423()
            || this.field_12451 != 0.0 && var8.method_39418(this.field_12453) <= this.field_12451) {
            return true;
         }

         ArrayList var13 = new ArrayList<class_8571>(var1.method_13813());
         var13.add(var8);
         this.field_12446.add(new class_3027(var8, var1, var13, var8.method_39418(this.field_12453), var3, var4, var10));
      } else if (var9.method_13818() > var4) {
         ArrayList var12 = new ArrayList<class_8571>(var1.method_13813());
         var12.add(var8);
         var9.method_13823(var8);
         var9.method_13821(var1);
         var9.method_13817(var12);
         var9.method_13822(var8.method_39418(this.field_12453));
         var9.method_13816(var4);
         var9.method_13824(var10);
      }

      return false;
   }
}
