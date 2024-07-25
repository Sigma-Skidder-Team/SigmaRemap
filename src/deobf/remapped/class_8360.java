package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class class_8360 {
   private static String[] field_42827;
   private final World field_42830;
   private final BlockPos field_42828;
   private final class_6788 field_42831;
   private class_2522 field_42826;
   private final boolean field_42829;
   private final List<BlockPos> field_42832 = Lists.newArrayList();

   public class_8360(World var1, BlockPos var2, class_2522 var3) {
      this.field_42830 = var1;
      this.field_42828 = var2;
      this.field_42826 = var3;
      this.field_42831 = (class_6788)var3.method_8360();
      class_3665 var6 = var3.<class_3665>method_10313(this.field_42831.method_31121());
      this.field_42829 = this.field_42831.method_31119();
      this.method_38535(var6);
   }

   public List<BlockPos> method_38542() {
      return this.field_42832;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void method_38535(class_3665 var1) {
      this.field_42832.clear();
      switch (var1) {
         case field_17829:
            this.field_42832.add(this.field_42828.method_6094());
            this.field_42832.add(this.field_42828.method_6073());
            break;
         case field_17831:
            this.field_42832.add(this.field_42828.method_6108());
            this.field_42832.add(this.field_42828.method_6090());
            break;
         case field_17835:
            this.field_42832.add(this.field_42828.method_6108());
            this.field_42832.add(this.field_42828.method_6090().method_6081());
            break;
         case field_17826:
            this.field_42832.add(this.field_42828.method_6108().method_6081());
            this.field_42832.add(this.field_42828.method_6090());
            break;
         case field_17833:
            this.field_42832.add(this.field_42828.method_6094().method_6081());
            this.field_42832.add(this.field_42828.method_6073());
            break;
         case field_17836:
            this.field_42832.add(this.field_42828.method_6094());
            this.field_42832.add(this.field_42828.method_6073().method_6081());
            break;
         case field_17830:
            this.field_42832.add(this.field_42828.method_6090());
            this.field_42832.add(this.field_42828.method_6073());
            break;
         case field_17825:
            this.field_42832.add(this.field_42828.method_6108());
            this.field_42832.add(this.field_42828.method_6073());
            break;
         case field_17837:
            this.field_42832.add(this.field_42828.method_6108());
            this.field_42832.add(this.field_42828.method_6094());
            break;
         case field_17832:
            this.field_42832.add(this.field_42828.method_6090());
            this.field_42832.add(this.field_42828.method_6094());
      }
   }

   private void method_38541() {
      for (int var3 = 0; var3 < this.field_42832.size(); var3++) {
         class_8360 var4 = this.method_38544(this.field_42832.get(var3));
         if (var4 != null && var4.method_38540(this)) {
            this.field_42832.set(var3, var4.field_42828);
         } else {
            this.field_42832.remove(var3--);
         }
      }
   }

   private boolean method_38537(BlockPos var1) {
      return class_6788.method_31116(this.field_42830, var1)
         || class_6788.method_31116(this.field_42830, var1.method_6081())
         || class_6788.method_31116(this.field_42830, var1.method_6100());
   }

   @Nullable
   private class_8360 method_38544(BlockPos var1) {
      class_2522 var4 = this.field_42830.method_28262(var1);
      if (!class_6788.method_31115(var4)) {
         BlockPos var5 = var1.method_6081();
         var4 = this.field_42830.method_28262(var5);
         if (!class_6788.method_31115(var4)) {
            var5 = var1.method_6100();
            var4 = this.field_42830.method_28262(var5);
            return !class_6788.method_31115(var4) ? null : new class_8360(this.field_42830, var5, var4);
         } else {
            return new class_8360(this.field_42830, var5, var4);
         }
      } else {
         return new class_8360(this.field_42830, var1, var4);
      }
   }

   private boolean method_38540(class_8360 var1) {
      return this.method_38539(var1.field_42828);
   }

   private boolean method_38539(BlockPos var1) {
      for (int var4 = 0; var4 < this.field_42832.size(); var4++) {
         BlockPos var5 = this.field_42832.get(var4);
         if (var5.getX() == var1.getX() && var5.method_12185() == var1.method_12185()) {
            return true;
         }
      }

      return false;
   }

   public int method_38538() {
      int var3 = 0;

      for (Direction var5 : class_9594.field_48893) {
         if (this.method_38537(this.field_42828.method_6098(var5))) {
            var3++;
         }
      }

      return var3;
   }

   private boolean method_38547(class_8360 var1) {
      return this.method_38540(var1) || this.field_42832.size() != 2;
   }

   private void method_38536(class_8360 var1) {
      this.field_42832.add(var1.field_42828);
      BlockPos var4 = this.field_42828.method_6094();
      BlockPos var5 = this.field_42828.method_6073();
      BlockPos var6 = this.field_42828.method_6108();
      BlockPos var7 = this.field_42828.method_6090();
      boolean var8 = this.method_38539(var4);
      boolean var9 = this.method_38539(var5);
      boolean var10 = this.method_38539(var6);
      boolean var11 = this.method_38539(var7);
      class_3665 var12 = null;
      if (var8 || var9) {
         var12 = class_3665.field_17829;
      }

      if (var10 || var11) {
         var12 = class_3665.field_17831;
      }

      if (!this.field_42829) {
         if (var9 && var11 && !var8 && !var10) {
            var12 = class_3665.field_17830;
         }

         if (var9 && var10 && !var8 && !var11) {
            var12 = class_3665.field_17825;
         }

         if (var8 && var10 && !var9 && !var11) {
            var12 = class_3665.field_17837;
         }

         if (var8 && var11 && !var9 && !var10) {
            var12 = class_3665.field_17832;
         }
      }

      if (var12 == class_3665.field_17829) {
         if (class_6788.method_31116(this.field_42830, var4.method_6081())) {
            var12 = class_3665.field_17833;
         }

         if (class_6788.method_31116(this.field_42830, var5.method_6081())) {
            var12 = class_3665.field_17836;
         }
      }

      if (var12 == class_3665.field_17831) {
         if (class_6788.method_31116(this.field_42830, var7.method_6081())) {
            var12 = class_3665.field_17835;
         }

         if (class_6788.method_31116(this.field_42830, var6.method_6081())) {
            var12 = class_3665.field_17826;
         }
      }

      if (var12 == null) {
         var12 = class_3665.field_17829;
      }

      this.field_42826 = this.field_42826.method_10308(this.field_42831.method_31121(), var12);
      this.field_42830.method_7513(this.field_42828, this.field_42826, 3);
   }

   private boolean method_38546(BlockPos var1) {
      class_8360 var4 = this.method_38544(var1);
      if (var4 != null) {
         var4.method_38541();
         return var4.method_38547(this);
      } else {
         return false;
      }
   }

   public class_8360 method_38534(boolean var1, boolean var2, class_3665 var3) {
      BlockPos var6 = this.field_42828.method_6094();
      BlockPos var7 = this.field_42828.method_6073();
      BlockPos var8 = this.field_42828.method_6108();
      BlockPos var9 = this.field_42828.method_6090();
      boolean var10 = this.method_38546(var6);
      boolean var11 = this.method_38546(var7);
      boolean var12 = this.method_38546(var8);
      boolean var13 = this.method_38546(var9);
      class_3665 var14 = null;
      boolean var15 = var10 || var11;
      boolean var16 = var12 || var13;
      if (var15 && !var16) {
         var14 = class_3665.field_17829;
      }

      if (var16 && !var15) {
         var14 = class_3665.field_17831;
      }

      boolean var17 = var11 && var13;
      boolean var18 = var11 && var12;
      boolean var19 = var10 && var13;
      boolean var20 = var10 && var12;
      if (!this.field_42829) {
         if (var17 && !var10 && !var12) {
            var14 = class_3665.field_17830;
         }

         if (var18 && !var10 && !var13) {
            var14 = class_3665.field_17825;
         }

         if (var20 && !var11 && !var13) {
            var14 = class_3665.field_17837;
         }

         if (var19 && !var11 && !var12) {
            var14 = class_3665.field_17832;
         }
      }

      if (var14 == null) {
         if (var15 && var16) {
            var14 = var3;
         } else if (!var15) {
            if (var16) {
               var14 = class_3665.field_17831;
            }
         } else {
            var14 = class_3665.field_17829;
         }

         if (!this.field_42829) {
            if (!var1) {
               if (var20) {
                  var14 = class_3665.field_17837;
               }

               if (var19) {
                  var14 = class_3665.field_17832;
               }

               if (var18) {
                  var14 = class_3665.field_17825;
               }

               if (var17) {
                  var14 = class_3665.field_17830;
               }
            } else {
               if (var17) {
                  var14 = class_3665.field_17830;
               }

               if (var18) {
                  var14 = class_3665.field_17825;
               }

               if (var19) {
                  var14 = class_3665.field_17832;
               }

               if (var20) {
                  var14 = class_3665.field_17837;
               }
            }
         }
      }

      if (var14 == class_3665.field_17829) {
         if (class_6788.method_31116(this.field_42830, var6.method_6081())) {
            var14 = class_3665.field_17833;
         }

         if (class_6788.method_31116(this.field_42830, var7.method_6081())) {
            var14 = class_3665.field_17836;
         }
      }

      if (var14 == class_3665.field_17831) {
         if (class_6788.method_31116(this.field_42830, var9.method_6081())) {
            var14 = class_3665.field_17835;
         }

         if (class_6788.method_31116(this.field_42830, var8.method_6081())) {
            var14 = class_3665.field_17826;
         }
      }

      if (var14 == null) {
         var14 = var3;
      }

      this.method_38535(var14);
      this.field_42826 = this.field_42826.method_10308(this.field_42831.method_31121(), var14);
      if (var2 || this.field_42830.method_28262(this.field_42828) != this.field_42826) {
         this.field_42830.method_7513(this.field_42828, this.field_42826, 3);

         for (int var21 = 0; var21 < this.field_42832.size(); var21++) {
            class_8360 var22 = this.method_38544(this.field_42832.get(var21));
            if (var22 != null) {
               var22.method_38541();
               if (var22.method_38547(this)) {
                  var22.method_38536(this);
               }
            }
         }
      }

      return this;
   }

   public class_2522 method_38543() {
      return this.field_42826;
   }
}
