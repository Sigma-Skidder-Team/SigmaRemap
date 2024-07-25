package remapped;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class class_5976 implements class_7373 {
   private static String[] field_30475;
   private final class_7729 field_30477;
   private final class_602 field_30478;
   private final class_5155 field_30476;
   private final boolean field_30479;

   public class_5976(class_7729 var1, class_602 var2, class_5155 var3, boolean var4) {
      this.field_30477 = var1;
      this.field_30478 = var2;
      this.field_30476 = var3;
      this.field_30479 = var4;
   }

   @Override
   public List<class_5024> method_33580(class_2522 var1, Direction var2, Random var3) {
      return Collections.<class_5024>emptyList();
   }

   @Override
   public boolean method_33581() {
      return false;
   }

   @Override
   public boolean method_33583() {
      return true;
   }

   @Override
   public boolean method_33585() {
      return this.field_30479;
   }

   @Override
   public boolean method_33582() {
      return true;
   }

   @Override
   public class_5155 method_33587() {
      return this.field_30476;
   }

   @Override
   public class_7729 method_33586() {
      return this.field_30477;
   }

   @Override
   public class_602 method_33584() {
      return this.field_30478;
   }
}
