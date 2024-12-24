package mapped;

import java.util.ArrayList;
import java.util.List;

public abstract class Class7626 {
   public Class7626 field32690;
   private TextFormatting field32691;
   private Boolean field32692;
   private Boolean field32693;
   private Boolean field32694;
   private Boolean field32695;
   private Boolean field32696;
   private String field32697;
   private List<Class7626> field32698;
   private Class7576 field32699;
   private Class8632 field32700;

   public Class7626(Class7626 var1) {
      this.method24993(var1, Class2081.field13558, true);
      if (var1.method25027() != null) {
         for (Class7626 var5 : var1.method25027()) {
            this.method25012(var5.method24990());
         }
      }
   }

   public void method24991(Class7626 var1) {
      this.method24993(var1, Class2081.field13558, true);
   }

   public void method24992(Class7626 var1, boolean var2) {
      this.method24993(var1, Class2081.field13558, var2);
   }

   public void method24993(Class7626 var1, Class2081 var2, boolean var3) {
      if (var2 == Class2081.field13557 || var2 == Class2081.field13558) {
         if (var3 || this.field32699 == null) {
            this.method25024(var1.method25028());
         }

         if (var3 || this.field32700 == null) {
            this.method25025(var1.method25029());
         }
      }

      if (var2 == Class2081.field13556 || var2 == Class2081.field13558) {
         if (var3 || this.field32691 == null) {
            this.method25017(var1.method24999());
         }

         if (var3 || this.field32692 == null) {
            this.method25018(var1.method25001());
         }

         if (var3 || this.field32693 == null) {
            this.method25019(var1.method25003());
         }

         if (var3 || this.field32694 == null) {
            this.method25020(var1.method25005());
         }

         if (var3 || this.field32695 == null) {
            this.method25021(var1.method25007());
         }

         if (var3 || this.field32696 == null) {
            this.method25022(var1.method25009());
         }

         if (var3 || this.field32697 == null) {
            this.method25023(var1.method25026());
         }
      }
   }

   public void method24994(Class2081 var1) {
      if (var1 == Class2081.field13556 || var1 == Class2081.field13555) {
         this.method25024(null);
         this.method25025(null);
      }

      if (var1 == Class2081.field13557 || var1 == Class2081.field13555) {
         this.method25017(null);
         this.method25018(null);
         this.method25019(null);
         this.method25020(null);
         this.method25021(null);
         this.method25022(null);
         this.method25023(null);
      }
   }

   public abstract Class7626 method24990();

   @Deprecated
   public Class7626 method24995() {
      Class7626 var3 = this.method24990();
      var3.method24994(Class2081.field13555);
      return var3;
   }

   public static String method24996(Class7626... var0) {
      StringBuilder var3 = new StringBuilder();

      for (Class7626 var7 : var0) {
         var3.append(var7.method25016());
      }

      return var3.toString();
   }

   public static String method24997(Class7626... var0) {
      StringBuilder var3 = new StringBuilder();

      for (Class7626 var7 : var0) {
         var3.append(var7.method25014());
      }

      return var3.toString();
   }

   public TextFormatting method24998() {
      if (this.field32691 != null) {
         return this.field32691;
      } else {
         return this.field32690 != null ? this.field32690.method24998() : TextFormatting.WHITE;
      }
   }

   public TextFormatting method24999() {
      return this.field32691;
   }

   public boolean method25000() {
      return this.field32692 != null ? this.field32692 : this.field32690 != null && this.field32690.method25000();
   }

   public Boolean method25001() {
      return this.field32692;
   }

   public boolean method25002() {
      return this.field32693 != null ? this.field32693 : this.field32690 != null && this.field32690.method25002();
   }

   public Boolean method25003() {
      return this.field32693;
   }

   public boolean method25004() {
      return this.field32694 != null ? this.field32694 : this.field32690 != null && this.field32690.method25004();
   }

   public Boolean method25005() {
      return this.field32694;
   }

   public boolean method25006() {
      return this.field32695 != null ? this.field32695 : this.field32690 != null && this.field32690.method25006();
   }

   public Boolean method25007() {
      return this.field32695;
   }

   public boolean method25008() {
      return this.field32696 != null ? this.field32696 : this.field32690 != null && this.field32690.method25008();
   }

   public Boolean method25009() {
      return this.field32696;
   }

   public void method25010(List<Class7626> var1) {
      for (Class7626 var5 : var1) {
         var5.field32690 = this;
      }

      this.field32698 = var1;
   }

   public void method25011(String var1) {
      this.method25012(new Class7630(var1));
   }

   public void method25012(Class7626 var1) {
      if (this.field32698 == null) {
         this.field32698 = new ArrayList<Class7626>();
      }

      var1.field32690 = this;
      this.field32698.add(var1);
   }

   public boolean method25013() {
      return this.field32691 != null
         || this.field32692 != null
         || this.field32693 != null
         || this.field32694 != null
         || this.field32695 != null
         || this.field32696 != null
         || this.field32697 != null
         || this.field32700 != null
         || this.field32699 != null;
   }

   public String method25014() {
      StringBuilder var3 = new StringBuilder();
      this.method25015(var3);
      return var3.toString();
   }

   public void method25015(StringBuilder var1) {
      if (this.field32698 != null) {
         for (Class7626 var5 : this.field32698) {
            var5.method25015(var1);
         }
      }
   }

   public String method25016() {
      StringBuilder var3 = new StringBuilder();
      this.method24983(var3);
      return var3.toString();
   }

   public void method24983(StringBuilder var1) {
      if (this.field32698 != null) {
         for (Class7626 var5 : this.field32698) {
            var5.method24983(var1);
         }
      }
   }

   public void method25017(TextFormatting var1) {
      this.field32691 = var1;
   }

   public void method25018(Boolean var1) {
      this.field32692 = var1;
   }

   public void method25019(Boolean var1) {
      this.field32693 = var1;
   }

   public void method25020(Boolean var1) {
      this.field32694 = var1;
   }

   public void method25021(Boolean var1) {
      this.field32695 = var1;
   }

   public void method25022(Boolean var1) {
      this.field32696 = var1;
   }

   public void method25023(String var1) {
      this.field32697 = var1;
   }

   public void method25024(Class7576 var1) {
      this.field32699 = var1;
   }

   public void method25025(Class8632 var1) {
      this.field32700 = var1;
   }

   @Override
   public String toString() {
      return "BaseComponent(color="
         + this.method24998()
         + ", bold="
         + this.field32692
         + ", italic="
         + this.field32693
         + ", underlined="
         + this.field32694
         + ", strikethrough="
         + this.field32695
         + ", obfuscated="
         + this.field32696
         + ", insertion="
         + this.method25026()
         + ", extra="
         + this.method25027()
         + ", clickEvent="
         + this.method25028()
         + ", hoverEvent="
         + this.method25029()
         + ")";
   }

   public Class7626() {
   }

   public String method25026() {
      return this.field32697;
   }

   public List<Class7626> method25027() {
      return this.field32698;
   }

   public Class7576 method25028() {
      return this.field32699;
   }

   public Class8632 method25029() {
      return this.field32700;
   }
}
