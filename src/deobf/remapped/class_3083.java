package remapped;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class class_3083 extends class_6349 {
   private final Pattern field_15156 = Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)");
   private String field_15155;
   private List<class_6349> field_15154;

   public class_3083(class_3083 var1) {
      super(var1);
      this.method_14137(var1.method_14138());
      if (var1.method_14133() != null) {
         ArrayList var4 = new ArrayList();

         for (class_6349 var6 : var1.method_14133()) {
            var4.add(var6.method_29059());
         }

         this.method_14132(var4);
      }
   }

   public class_3083(String var1, Object... var2) {
      this.method_14137(var1);
      if (var2 != null && var2.length != 0) {
         ArrayList var5 = new ArrayList();

         for (Object var9 : var2) {
            if (!(var9 instanceof class_6349)) {
               var5.add(new class_5028(String.valueOf(var9)));
            } else {
               var5.add((class_6349)var9);
            }
         }

         this.method_14132(var5);
      }
   }

   @Override
   public class_6349 method_29059() {
      return new class_3083(this);
   }

   public void method_14132(List<class_6349> var1) {
      for (class_6349 var5 : var1) {
         var5.field_32415 = this;
      }

      this.field_15154 = var1;
   }

   public void method_14134(String var1) {
      this.method_14135(new class_5028(var1));
   }

   public void method_14135(class_6349 var1) {
      if (this.field_15154 == null) {
         this.field_15154 = new ArrayList<class_6349>();
      }

      var1.field_32415 = this;
      this.field_15154.add(var1);
   }

   @Override
   public void method_29066(StringBuilder var1) {
      String var4 = class_1035.field_5716.method_4591(this.field_15155);
      Matcher var5 = this.field_15156.matcher(var4);
      int var6 = 0;
      int var7 = 0;

      while (var5.find(var6)) {
         int var8 = var5.start();
         if (var8 != var6) {
            var1.append(var4.substring(var6, var8));
         }

         var6 = var5.end();
         String var9 = var5.group(2);
         switch (var9.charAt(0)) {
            case '%':
               var1.append('%');
               break;
            case 'd':
            case 's':
               String var10 = var5.group(1);
               this.field_15154.get(var10 != null ? Integer.parseInt(var10) - 1 : var7++).method_29066(var1);
         }
      }

      if (var4.length() != var6) {
         var1.append(var4.substring(var6, var4.length()));
      }

      super.method_29066(var1);
   }

   @Override
   public void method_29070(StringBuilder var1) {
      String var4 = class_1035.field_5716.method_4591(this.field_15155);
      Matcher var5 = this.field_15156.matcher(var4);
      int var6 = 0;
      int var7 = 0;

      while (var5.find(var6)) {
         int var8 = var5.start();
         if (var8 != var6) {
            this.method_14139(var1);
            var1.append(var4.substring(var6, var8));
         }

         var6 = var5.end();
         String var9 = var5.group(2);
         switch (var9.charAt(0)) {
            case '%':
               this.method_14139(var1);
               var1.append('%');
               break;
            case 'd':
            case 's':
               String var10 = var5.group(1);
               this.field_15154.get(var10 != null ? Integer.parseInt(var10) - 1 : var7++).method_29070(var1);
         }
      }

      if (var4.length() != var6) {
         this.method_14139(var1);
         var1.append(var4.substring(var6, var4.length()));
      }

      super.method_29070(var1);
   }

   private void method_14139(StringBuilder var1) {
      var1.append(this.method_29077());
      if (this.method_29051()) {
         var1.append(class_2909.field_14199);
      }

      if (this.method_29042()) {
         var1.append(class_2909.field_14211);
      }

      if (this.method_29044()) {
         var1.append(class_2909.field_14202);
      }

      if (this.method_29047()) {
         var1.append(class_2909.field_14193);
      }

      if (this.method_29063()) {
         var1.append(class_2909.field_14190);
      }
   }

   public Pattern method_14136() {
      return this.field_15156;
   }

   public String method_14138() {
      return this.field_15155;
   }

   public List<class_6349> method_14133() {
      return this.field_15154;
   }

   public void method_14137(String var1) {
      this.field_15155 = var1;
   }

   @Override
   public String toString() {
      return "TranslatableComponent(format=" + this.method_14136() + ", translate=" + this.method_14138() + ", with=" + this.method_14133() + ")";
   }

   public class_3083() {
   }
}
