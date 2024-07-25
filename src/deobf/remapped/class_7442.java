package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class class_7442 {
   private static String[] field_37933;
   private final class_6486 field_37939;
   private final class_1331 field_37935;
   private final boolean field_37936;
   private final class_1331 field_37932;
   private final class_240 field_37937;
   private final List<class_1331> field_37934 = Lists.newArrayList();
   private final List<class_1331> field_37940 = Lists.newArrayList();
   private final class_240 field_37938;

   public class_7442(class_6486 var1, class_1331 var2, class_240 var3, boolean var4) {
      this.field_37939 = var1;
      this.field_37935 = var2;
      this.field_37938 = var3;
      this.field_37936 = var4;
      if (!var4) {
         this.field_37937 = var3.method_1046();
         this.field_37932 = var2.method_6099(var3, 2);
      } else {
         this.field_37937 = var3;
         this.field_37932 = var2.method_6098(var3);
      }
   }

   public boolean method_33869() {
      this.field_37934.clear();
      this.field_37940.clear();
      class_2522 var3 = this.field_37939.method_28262(this.field_37932);
      if (class_1990.method_9171(var3, this.field_37939, this.field_37932, this.field_37937, false, this.field_37938)) {
         if (this.method_33861(this.field_37932, this.field_37937)) {
            for (int var4 = 0; var4 < this.field_37934.size(); var4++) {
               class_1331 var5 = this.field_37934.get(var4);
               if (method_33865(this.field_37939.method_28262(var5).method_8360()) && !this.method_33868(var5)) {
                  return false;
               }
            }

            return true;
         } else {
            return false;
         }
      } else if (this.field_37936 && var3.method_8366() == class_718.field_3916) {
         this.field_37940.add(this.field_37932);
         return true;
      } else {
         return false;
      }
   }

   private static boolean method_33865(class_6414 var0) {
      return var0 == class_4783.field_23498 || var0 == class_4783.field_23899;
   }

   private static boolean method_33863(class_6414 var0, class_6414 var1) {
      if (var0 == class_4783.field_23899 && var1 == class_4783.field_23498) {
         return false;
      } else {
         return var0 == class_4783.field_23498 && var1 == class_4783.field_23899 ? false : method_33865(var0) || method_33865(var1);
      }
   }

   private boolean method_33861(class_1331 var1, class_240 var2) {
      class_2522 var5 = this.field_37939.method_28262(var1);
      class_6414 var6 = var5.method_8360();
      if (var5.method_8345()) {
         return true;
      } else if (!class_1990.method_9171(var5, this.field_37939, var1, this.field_37937, false, var2)) {
         return true;
      } else if (var1.equals(this.field_37935)) {
         return true;
      } else if (this.field_37934.contains(var1)) {
         return true;
      } else {
         int var7 = 1;
         if (var7 + this.field_37934.size() > 12) {
            return false;
         } else {
            while (method_33865(var6)) {
               class_1331 var8 = var1.method_6099(this.field_37937.method_1046(), var7);
               class_6414 var9 = var6;
               var5 = this.field_37939.method_28262(var8);
               var6 = var5.method_8360();
               if (var5.method_8345()
                  || !method_33863(var9, var6)
                  || !class_1990.method_9171(var5, this.field_37939, var8, this.field_37937, false, this.field_37937.method_1046())
                  || var8.equals(this.field_37935)) {
                  break;
               }

               if (++var7 + this.field_37934.size() > 12) {
                  return false;
               }
            }

            int var16 = 0;

            for (int var17 = var7 - 1; var17 >= 0; var17--) {
               this.field_37934.add(var1.method_6099(this.field_37937.method_1046(), var17));
               var16++;
            }

            int var18 = 1;

            while (true) {
               class_1331 var10 = var1.method_6099(this.field_37937, var18);
               int var11 = this.field_37934.indexOf(var10);
               if (var11 > -1) {
                  this.method_33867(var16, var11);

                  for (int var12 = 0; var12 <= var11 + var16; var12++) {
                     class_1331 var13 = this.field_37934.get(var12);
                     if (method_33865(this.field_37939.method_28262(var13).method_8360()) && !this.method_33868(var13)) {
                        return false;
                     }
                  }

                  return true;
               }

               var5 = this.field_37939.method_28262(var10);
               if (var5.method_8345()) {
                  return true;
               }

               if (!class_1990.method_9171(var5, this.field_37939, var10, this.field_37937, true, this.field_37937) || var10.equals(this.field_37935)) {
                  return false;
               }

               if (var5.method_8366() == class_718.field_3916) {
                  this.field_37940.add(var10);
                  return true;
               }

               if (this.field_37934.size() >= 12) {
                  return false;
               }

               this.field_37934.add(var10);
               var16++;
               var18++;
            }
         }
      }
   }

   private void method_33867(int var1, int var2) {
      ArrayList var5 = Lists.newArrayList();
      ArrayList var6 = Lists.newArrayList();
      ArrayList var7 = Lists.newArrayList();
      var5.addAll(this.field_37934.subList(0, var2));
      var6.addAll(this.field_37934.subList(this.field_37934.size() - var1, this.field_37934.size()));
      var7.addAll(this.field_37934.subList(var2, this.field_37934.size() - var1));
      this.field_37934.clear();
      this.field_37934.addAll(var5);
      this.field_37934.addAll(var6);
      this.field_37934.addAll(var7);
   }

   private boolean method_33868(class_1331 var1) {
      class_2522 var4 = this.field_37939.method_28262(var1);

      for (class_240 var8 : class_240.values()) {
         if (var8.method_1029() != this.field_37937.method_1029()) {
            class_1331 var9 = var1.method_6098(var8);
            class_2522 var10 = this.field_37939.method_28262(var9);
            if (method_33863(var10.method_8360(), var4.method_8360()) && !this.method_33861(var9, var8)) {
               return false;
            }
         }
      }

      return true;
   }

   public List<class_1331> method_33866() {
      return this.field_37934;
   }

   public List<class_1331> method_33862() {
      return this.field_37940;
   }
}
