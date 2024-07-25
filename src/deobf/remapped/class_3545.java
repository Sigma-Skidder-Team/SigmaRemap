package remapped;

import java.util.List;
import java.util.Random;

public class class_3545 implements class_7373 {
   private static String[] field_17348;
   private final int field_17350;
   private final List<class_876> field_17349;
   private final class_7373 field_17347;

   public class_3545(List<class_876> var1) {
      this.field_17349 = var1;
      this.field_17350 = class_6242.method_28508(var1);
      this.field_17347 = ((class_876)var1.get(0)).field_4522;
   }

   @Override
   public List<class_5024> method_33580(class_2522 var1, Direction var2, Random var3) {
      return class_6242.<class_876>method_28509(this.field_17349, Math.abs((int)var3.nextLong()) % this.field_17350).field_4522.method_33580(var1, var2, var3);
   }

   @Override
   public boolean method_33581() {
      return this.field_17347.method_33581();
   }

   @Override
   public boolean method_33583() {
      return this.field_17347.method_33583();
   }

   @Override
   public boolean method_33585() {
      return this.field_17347.method_33585();
   }

   @Override
   public boolean method_33582() {
      return this.field_17347.method_33582();
   }

   @Override
   public class_5155 method_33587() {
      return this.field_17347.method_33587();
   }

   @Override
   public class_7729 method_33586() {
      return this.field_17347.method_33586();
   }

   @Override
   public class_602 method_33584() {
      return this.field_17347.method_33584();
   }
}
