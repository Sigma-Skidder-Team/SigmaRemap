package remapped;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public class class_1421 {
   private static String[] field_7694;
   private static final int[] field_7699 = new int[0];
   private final class_4106 field_7697;
   private final class_3227 field_7696;
   private final List<class_5839> field_7695 = new ArrayList<class_5839>();
   private final List<class_5839> field_7698 = new ArrayList<class_5839>();
   private final List<class_5839> field_7693 = new ArrayList<class_5839>();

   public class_1421(class_4106 var1, class_3227 var2) {
      this.field_7697 = var1;
      this.field_7696 = var2;
   }

   public void method_6519(class_1121 var1, String var2) {
      this.method_6523(var1).add(new class_5839(var2, field_7699, null));
   }

   public void method_6514(class_1121 var1, String... var2) {
      List var5 = this.method_6523(var1);

      for (String var9 : var2) {
         var5.add(new class_5839(var9, field_7699, null));
      }
   }

   public void method_6515(class_1121 var1, String var2, int... var3) {
      List var6 = this.method_6523(var1);
      class_3227 var7 = this.method_6522(var1);

      for (int var8 = 0; var8 < var3.length; var8++) {
         int var9 = var3[var8];
         var3[var8] = var7.method_14784(var9);
      }

      var6.add(new class_5839(var2, var3, null));
   }

   public void method_6520(class_1372 var1) {
      this.field_7697.method_19015(var1, new class_5063(this));
   }

   private void method_6526(class_5051 var1, class_3227 var2, List<class_5839> var3) throws Exception {
      int var6 = var1.<Integer>method_23242(class_8039.field_41157);
      var1.method_23236(class_8039.field_41157, var3 == null ? var6 : var6 + var3.size());

      for (int var7 = 0; var7 < var6; var7++) {
         var1.<String>method_23261(class_8039.field_41171);
         int[] var8 = var1.<int[]>method_23242(class_8039.field_41144);
         if (var2 == null) {
            var1.method_23236(class_8039.field_41144, var8);
         } else {
            IntArrayList var9 = new IntArrayList(var8.length);

            for (int var13 : var8) {
               int var14 = var2.method_14784(var13);
               if (var14 != -1) {
                  var9.add(var14);
               }
            }

            var1.method_23236(class_8039.field_41144, var9.toArray(field_7699));
         }
      }

      if (var3 != null && !var3.isEmpty()) {
         for (class_5839 var16 : var3) {
            var1.method_23236(class_8039.field_41171, class_5839.method_26629(var16));
            var1.method_23236(class_8039.field_41144, class_5839.method_26630(var16));
         }
      }
   }

   private List<class_5839> method_6523(class_1121 var1) {
      switch (var1) {
         case field_6407:
            return this.field_7695;
         case field_6409:
            return this.field_7698;
         case field_6410:
            return this.field_7693;
         case field_6411:
         default:
            return null;
      }
   }

   @Nullable
   private class_3227 method_6522(class_1121 var1) {
      switch (var1) {
         case field_6407:
            return this.field_7697.method_19008().method_28211() != null ? var1x -> this.field_7697.method_19008().method_28207(var1x) : null;
         case field_6409:
            return this.field_7697.method_19008().method_28215() != null ? var1x -> this.field_7697.method_19008().method_28210(var1x) : null;
         case field_6410:
            return this.field_7696;
         case field_6411:
         default:
            return null;
      }
   }
}
