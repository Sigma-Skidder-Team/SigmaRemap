package remapped;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class class_6221 implements class_7373 {
   private static String[] field_31785;
   public final List<class_5024> field_31782;
   public final Map<Direction, List<class_5024>> field_31786;
   public final boolean field_31779;
   public final boolean field_31778;
   public final boolean field_31781;
   public final class_5155 field_31780;
   public final class_7729 field_31783;
   public final class_602 field_31784;

   public class_6221(
           List<class_5024> var1, Map<Direction, List<class_5024>> var2, boolean var3, boolean var4, boolean var5, class_5155 var6, class_7729 var7, class_602 var8
   ) {
      this.field_31782 = var1;
      this.field_31786 = var2;
      this.field_31779 = var3;
      this.field_31778 = var5;
      this.field_31781 = var4;
      this.field_31780 = var6;
      this.field_31783 = var7;
      this.field_31784 = var8;
   }

   @Override
   public List<class_5024> method_33580(class_2522 var1, Direction var2, Random var3) {
      return var2 != null ? this.field_31786.get(var2) : this.field_31782;
   }

   @Override
   public boolean method_33581() {
      return this.field_31779;
   }

   @Override
   public boolean method_33583() {
      return this.field_31778;
   }

   @Override
   public boolean method_33585() {
      return this.field_31781;
   }

   @Override
   public boolean method_33582() {
      return false;
   }

   @Override
   public class_5155 method_33587() {
      return this.field_31780;
   }

   @Override
   public class_7729 method_33586() {
      return this.field_31783;
   }

   @Override
   public class_602 method_33584() {
      return this.field_31784;
   }
}
