package mapped;

import java.util.Map;
import java.util.TimeZone;

public class Class8324 {
   private Class1857 field35753 = Class1857.field9898;
   private Class2214 field35754 = Class2214.field14477;
   private boolean field35755 = false;
   private boolean field35756 = true;
   private boolean field35757 = false;
   private int field35758 = 2;
   private int field35759 = 0;
   private int field35760 = 80;
   private boolean field35761 = true;
   private Class2091 field35762 = Class2091.field13629;
   private boolean field35763 = false;
   private boolean field35764 = false;
   private TimeZone field35765 = null;
   private Class2148 field35766 = null;
   private Map<String, String> field35767 = null;
   private Boolean field35768 = false;
   private Class7391 field35769 = new Class7392(0);

   public boolean method29152() {
      return this.field35756;
   }

   public void method29153(boolean var1) {
      this.field35756 = var1;
   }

   public Class1857 method29154() {
      return this.field35753;
   }

   public void method29155(Class1857 var1) {
      if (var1 != null) {
         this.field35753 = var1;
      } else {
         throw new NullPointerException("Use ScalarStyle enum.");
      }
   }

   public void method29156(int var1) {
      if (var1 >= 1) {
         if (var1 <= 10) {
            this.field35758 = var1;
         } else {
            throw new Class2478("Indent must be at most 10");
         }
      } else {
         throw new Class2478("Indent must be at least 1");
      }
   }

   public int method29157() {
      return this.field35758;
   }

   public void method29158(int var1) {
      if (var1 >= 0) {
         if (var1 <= 9) {
            this.field35759 = var1;
         } else {
            throw new Class2478("Indicator indent must be at most Emitter.MAX_INDENT-1: 9");
         }
      } else {
         throw new Class2478("Indicator indent must be non-negative.");
      }
   }

   public int method29159() {
      return this.field35759;
   }

   public void method29160(Class2148 var1) {
      this.field35766 = var1;
   }

   public Class2148 method29161() {
      return this.field35766;
   }

   public void method29162(boolean var1) {
      this.field35755 = var1;
   }

   public boolean method29163() {
      return this.field35755;
   }

   public void method29164(boolean var1) {
      this.field35768 = var1;
   }

   public boolean method29165() {
      return this.field35768;
   }

   public void method29166(int var1) {
      this.field35760 = var1;
   }

   public int method29167() {
      return this.field35760;
   }

   public void method29168(boolean var1) {
      this.field35761 = var1;
   }

   public boolean method29169() {
      return this.field35761;
   }

   public Class2091 method29170() {
      return this.field35762;
   }

   public void method29171(Class2214 var1) {
      if (var1 != null) {
         this.field35754 = var1;
      } else {
         throw new NullPointerException("Use FlowStyle enum.");
      }
   }

   public Class2214 method29172() {
      return this.field35754;
   }

   public void method29173(Class2091 var1) {
      if (var1 != null) {
         this.field35762 = var1;
      } else {
         throw new NullPointerException("Specify line break.");
      }
   }

   public boolean method29174() {
      return this.field35763;
   }

   public void method29175(boolean var1) {
      this.field35763 = var1;
   }

   public boolean method29176() {
      return this.field35764;
   }

   public void method29177(boolean var1) {
      this.field35764 = var1;
   }

   public Map<String, String> method29178() {
      return this.field35767;
   }

   public void method29179(Map<String, String> var1) {
      this.field35767 = var1;
   }

   public boolean method29180() {
      return this.field35757;
   }

   public void method29181(boolean var1) {
      this.field35757 = var1;
   }

   public TimeZone method29182() {
      return this.field35765;
   }

   public void method29183(TimeZone var1) {
      this.field35765 = var1;
   }

   public Class7391 method29184() {
      return this.field35769;
   }

   public void method29185(Class7391 var1) {
      this.field35769 = var1;
   }
}
