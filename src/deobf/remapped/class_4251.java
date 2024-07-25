package remapped;

import java.util.Map;
import java.util.TimeZone;

public class class_4251 {
   private class_7587 field_20616 = class_7587.field_38646;
   private class_435 field_20614 = class_435.field_1823;
   private boolean field_20599 = false;
   private boolean field_20615 = true;
   private boolean field_20608 = false;
   private int field_20605 = 2;
   private int field_20613 = 0;
   private int field_20604 = 80;
   private boolean field_20607 = true;
   private class_149 field_20610 = class_149.field_430;
   private boolean field_20611 = false;
   private boolean field_20603 = false;
   private TimeZone field_20606 = null;
   private class_7826 field_20601 = null;
   private Map<String, String> field_20600 = null;
   private Boolean field_20612 = false;
   private class_1889 field_20602 = new class_5690(0);

   public boolean method_19802() {
      return this.field_20615;
   }

   public void method_19796(boolean var1) {
      this.field_20615 = var1;
   }

   public class_7587 method_19809() {
      return this.field_20616;
   }

   public void method_19808(class_7587 var1) {
      if (var1 != null) {
         this.field_20616 = var1;
      } else {
         throw new NullPointerException("Use ScalarStyle enum.");
      }
   }

   public void method_19814(int var1) {
      if (var1 >= 1) {
         if (var1 <= 10) {
            this.field_20605 = var1;
         } else {
            throw new class_5251("Indent must be at most 10");
         }
      } else {
         throw new class_5251("Indent must be at least 1");
      }
   }

   public int method_19819() {
      return this.field_20605;
   }

   public void method_19799(int var1) {
      if (var1 >= 0) {
         if (var1 <= 9) {
            this.field_20613 = var1;
         } else {
            throw new class_5251("Indicator indent must be at most Emitter.MAX_INDENT-1: 9");
         }
      } else {
         throw new class_5251("Indicator indent must be non-negative.");
      }
   }

   public int method_19801() {
      return this.field_20613;
   }

   public void method_19794(class_7826 var1) {
      this.field_20601 = var1;
   }

   public class_7826 method_19793() {
      return this.field_20601;
   }

   public void method_19810(boolean var1) {
      this.field_20599 = var1;
   }

   public boolean method_19791() {
      return this.field_20599;
   }

   public void method_19823(boolean var1) {
      this.field_20612 = var1;
   }

   public boolean method_19821() {
      return this.field_20612;
   }

   public void method_19820(int var1) {
      this.field_20604 = var1;
   }

   public int method_19813() {
      return this.field_20604;
   }

   public void method_19815(boolean var1) {
      this.field_20607 = var1;
   }

   public boolean method_19816() {
      return this.field_20607;
   }

   public class_149 method_19797() {
      return this.field_20610;
   }

   public void method_19804(class_435 var1) {
      if (var1 != null) {
         this.field_20614 = var1;
      } else {
         throw new NullPointerException("Use FlowStyle enum.");
      }
   }

   public class_435 method_19792() {
      return this.field_20614;
   }

   public void method_19818(class_149 var1) {
      if (var1 != null) {
         this.field_20610 = var1;
      } else {
         throw new NullPointerException("Specify line break.");
      }
   }

   public boolean method_19806() {
      return this.field_20611;
   }

   public void method_19807(boolean var1) {
      this.field_20611 = var1;
   }

   public boolean method_19803() {
      return this.field_20603;
   }

   public void method_19798(boolean var1) {
      this.field_20603 = var1;
   }

   public Map<String, String> method_19800() {
      return this.field_20600;
   }

   public void method_19812(Map<String, String> var1) {
      this.field_20600 = var1;
   }

   public boolean method_19805() {
      return this.field_20608;
   }

   public void method_19825(boolean var1) {
      this.field_20608 = var1;
   }

   public TimeZone method_19795() {
      return this.field_20606;
   }

   public void method_19811(TimeZone var1) {
      this.field_20606 = var1;
   }

   public class_1889 method_19824() {
      return this.field_20602;
   }

   public void method_19822(class_1889 var1) {
      this.field_20602 = var1;
   }
}
