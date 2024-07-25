package remapped;

import java.util.ArrayList;
import java.util.List;

public abstract class class_6349 {
   public class_6349 field_32415;
   private class_2909 field_32408;
   private Boolean field_32414;
   private Boolean field_32405;
   private Boolean field_32406;
   private Boolean field_32411;
   private Boolean field_32409;
   private String field_32413;
   private List<class_6349> field_32412;
   private class_2257 field_32407;
   private class_5316 field_32410;

   public class_6349(class_6349 var1) {
      this.method_29056(var1, class_4998.field_25860, true);
      if (var1.method_29048() != null) {
         for (class_6349 var5 : var1.method_29048()) {
            this.method_29080(var5.method_29059());
         }
      }
   }

   public void method_29055(class_6349 var1) {
      this.method_29056(var1, class_4998.field_25860, true);
   }

   public void method_29057(class_6349 var1, boolean var2) {
      this.method_29056(var1, class_4998.field_25860, var2);
   }

   public void method_29056(class_6349 var1, class_4998 var2, boolean var3) {
      if (var2 == class_4998.field_25863 || var2 == class_4998.field_25860) {
         if (var3 || this.field_32407 == null) {
            this.method_29060(var1.method_29041());
         }

         if (var3 || this.field_32410 == null) {
            this.method_29072(var1.method_29074());
         }
      }

      if (var2 == class_4998.field_25862 || var2 == class_4998.field_25860) {
         if (var3 || this.field_32408 == null) {
            this.method_29073(var1.method_29076());
         }

         if (var3 || this.field_32414 == null) {
            this.method_29050(var1.method_29058());
         }

         if (var3 || this.field_32405 == null) {
            this.method_29053(var1.method_29064());
         }

         if (var3 || this.field_32406 == null) {
            this.method_29068(var1.method_29061());
         }

         if (var3 || this.field_32411 == null) {
            this.method_29075(var1.method_29081());
         }

         if (var3 || this.field_32409 == null) {
            this.method_29082(var1.method_29046());
         }

         if (var3 || this.field_32413 == null) {
            this.method_29062(var1.method_29078());
         }
      }
   }

   public void method_29045(class_4998 var1) {
      if (var1 == class_4998.field_25862 || var1 == class_4998.field_25858) {
         this.method_29060(null);
         this.method_29072(null);
      }

      if (var1 == class_4998.field_25863 || var1 == class_4998.field_25858) {
         this.method_29073(null);
         this.method_29050(null);
         this.method_29053(null);
         this.method_29068(null);
         this.method_29075(null);
         this.method_29082(null);
         this.method_29062(null);
      }
   }

   public abstract class_6349 method_29059();

   @Deprecated
   public class_6349 method_29049() {
      class_6349 var3 = this.method_29059();
      var3.method_29045(class_4998.field_25858);
      return var3;
   }

   public static String method_29071(class_6349... var0) {
      StringBuilder var3 = new StringBuilder();

      for (class_6349 var7 : var0) {
         var3.append(var7.method_29069());
      }

      return var3.toString();
   }

   public static String method_29067(class_6349... var0) {
      StringBuilder var3 = new StringBuilder();

      for (class_6349 var7 : var0) {
         var3.append(var7.method_29065());
      }

      return var3.toString();
   }

   public class_2909 method_29077() {
      if (this.field_32408 != null) {
         return this.field_32408;
      } else {
         return this.field_32415 != null ? this.field_32415.method_29077() : class_2909.field_14206;
      }
   }

   public class_2909 method_29076() {
      return this.field_32408;
   }

   public boolean method_29051() {
      return this.field_32414 != null ? this.field_32414 : this.field_32415 != null && this.field_32415.method_29051();
   }

   public Boolean method_29058() {
      return this.field_32414;
   }

   public boolean method_29042() {
      return this.field_32405 != null ? this.field_32405 : this.field_32415 != null && this.field_32415.method_29042();
   }

   public Boolean method_29064() {
      return this.field_32405;
   }

   public boolean method_29044() {
      return this.field_32406 != null ? this.field_32406 : this.field_32415 != null && this.field_32415.method_29044();
   }

   public Boolean method_29061() {
      return this.field_32406;
   }

   public boolean method_29047() {
      return this.field_32411 != null ? this.field_32411 : this.field_32415 != null && this.field_32415.method_29047();
   }

   public Boolean method_29081() {
      return this.field_32411;
   }

   public boolean method_29063() {
      return this.field_32409 != null ? this.field_32409 : this.field_32415 != null && this.field_32415.method_29063();
   }

   public Boolean method_29046() {
      return this.field_32409;
   }

   public void method_29043(List<class_6349> var1) {
      for (class_6349 var5 : var1) {
         var5.field_32415 = this;
      }

      this.field_32412 = var1;
   }

   public void method_29079(String var1) {
      this.method_29080(new class_5028(var1));
   }

   public void method_29080(class_6349 var1) {
      if (this.field_32412 == null) {
         this.field_32412 = new ArrayList<class_6349>();
      }

      var1.field_32415 = this;
      this.field_32412.add(var1);
   }

   public boolean method_29054() {
      return this.field_32408 != null
         || this.field_32414 != null
         || this.field_32405 != null
         || this.field_32406 != null
         || this.field_32411 != null
         || this.field_32409 != null
         || this.field_32413 != null
         || this.field_32410 != null
         || this.field_32407 != null;
   }

   public String method_29065() {
      StringBuilder var3 = new StringBuilder();
      this.method_29066(var3);
      return var3.toString();
   }

   public void method_29066(StringBuilder var1) {
      if (this.field_32412 != null) {
         for (class_6349 var5 : this.field_32412) {
            var5.method_29066(var1);
         }
      }
   }

   public String method_29069() {
      StringBuilder var3 = new StringBuilder();
      this.method_29070(var3);
      return var3.toString();
   }

   public void method_29070(StringBuilder var1) {
      if (this.field_32412 != null) {
         for (class_6349 var5 : this.field_32412) {
            var5.method_29070(var1);
         }
      }
   }

   public void method_29073(class_2909 var1) {
      this.field_32408 = var1;
   }

   public void method_29050(Boolean var1) {
      this.field_32414 = var1;
   }

   public void method_29053(Boolean var1) {
      this.field_32405 = var1;
   }

   public void method_29068(Boolean var1) {
      this.field_32406 = var1;
   }

   public void method_29075(Boolean var1) {
      this.field_32411 = var1;
   }

   public void method_29082(Boolean var1) {
      this.field_32409 = var1;
   }

   public void method_29062(String var1) {
      this.field_32413 = var1;
   }

   public void method_29060(class_2257 var1) {
      this.field_32407 = var1;
   }

   public void method_29072(class_5316 var1) {
      this.field_32410 = var1;
   }

   @Override
   public String toString() {
      return "BaseComponent(color="
         + this.method_29077()
         + ", bold="
         + this.field_32414
         + ", italic="
         + this.field_32405
         + ", underlined="
         + this.field_32406
         + ", strikethrough="
         + this.field_32411
         + ", obfuscated="
         + this.field_32409
         + ", insertion="
         + this.method_29078()
         + ", extra="
         + this.method_29048()
         + ", clickEvent="
         + this.method_29041()
         + ", hoverEvent="
         + this.method_29074()
         + ")";
   }

   public class_6349() {
   }

   public String method_29078() {
      return this.field_32413;
   }

   public List<class_6349> method_29048() {
      return this.field_32412;
   }

   public class_2257 method_29041() {
      return this.field_32407;
   }

   public class_5316 method_29074() {
      return this.field_32410;
   }
}
