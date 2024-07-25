package remapped;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.io.IOUtils;

public class class_986 {
   private List<class_1675> field_5025 = new ArrayList<class_1675>();
   private class_1675 field_5020;
   private class_1675 field_5023;
   public static final String field_5022 = ".profile";
   public static final String field_5024 = "/profiles/";
   public static final String field_5021 = "Default";

   public void method_4298(class_1675 var1) {
      this.field_5025.add(0, var1);
   }

   public boolean method_4303(class_1675 var1) {
      if (SigmaMainClass.method_3328().method_3312() == class_6015.field_30644 && var1.field_8677.equals("Classic")) {
         return false;
      } else if (this.field_5025.size() <= 1) {
         return false;
      } else {
         this.field_5025.remove(var1);
         if (var1 == this.field_5020) {
            this.method_4300(this.field_5025.get(0));
         }

         return true;
      }
   }

   public boolean method_4302(String var1) {
      for (class_1675 var5 : this.field_5025) {
         if (var5.field_8677.equals(var1) && this.method_4303(var5)) {
            return true;
         }
      }

      return false;
   }

   public class_1675 method_4307(String var1) {
      for (class_1675 var5 : this.field_5025) {
         if (var5.field_8677.toLowerCase().equals(var1.toLowerCase())) {
            return var5;
         }
      }

      return null;
   }

   public void method_4304(String var1) throws IOException {
      File var4 = new File(SigmaMainClass.method_3328().method_3334() + "/profiles/");
      if (!var4.exists()) {
         var4.mkdirs();
      }

      File[] var5 = var4.listFiles((var0, var1x) -> var1x.toLowerCase().endsWith(".profile"));

      for (File var9 : var5) {
         try {
            class_1293 var10 = new class_1293(IOUtils.toString(new FileInputStream(var9)));
            class_1675 var11 = new class_1675().method_7504(var10);
            var11.field_8677 = var9.getName().substring(0, var9.getName().length() - ".profile".length());
            this.field_5025.add(var11);
            if (var1 != null && var11.field_8677.toLowerCase().equals(var1.toLowerCase())) {
               this.field_5020 = var11;
            }
         } catch (class_7584 var12) {
            SigmaMainClass.method_3328().method_3326().method_12862("Unable to load profile from " + var9.getName());
         }
      }

      if (this.field_5025.size() == 0 || this.field_5020 == null) {
         if (var1 == null || var1.length() == 0) {
            var1 = "Default";
         }

         this.field_5025.add(this.field_5020 = new class_1675(var1, new class_1293()));
      }

      SigmaMainClass.method_3328().method_3298().method_838(this.field_5020.field_8678);
   }

   public boolean method_4299(String var1) {
      for (class_1675 var5 : this.field_5025) {
         if (var5.field_8677.toLowerCase().equals(var1.toLowerCase())) {
            return true;
         }
      }

      return false;
   }

   public void method_4306() throws IOException {
      this.field_5020.field_8678 = SigmaMainClass.method_3328().method_3298().method_839(new class_1293());
      File var3 = new File(SigmaMainClass.method_3328().method_3334() + "/profiles/");
      if (!var3.exists()) {
         var3.mkdirs();
      }

      File[] var4 = var3.listFiles((var0, var1) -> var1.toLowerCase().endsWith(".profile"));

      for (File var8 : var4) {
         var8.delete();
      }

      for (class_1675 var10 : this.field_5025) {
         File var11 = new File(SigmaMainClass.method_3328().method_3334() + "/profiles/" + var10.field_8677 + ".profile");
         if (!var11.exists()) {
            var11.createNewFile();
         }

         IOUtils.write(var10.method_7500(new class_1293()).toString(0), new FileOutputStream(var11));
      }
   }

   public class_1675 method_4301() {
      return this.field_5020;
   }

   public void method_4300(class_1675 var1) {
      SigmaMainClass.method_3328().method_3318();
      class_1235.field_6813 = new HashMap<Object, Integer>();
      if (SigmaMainClass.method_3328().method_3312() != class_6015.field_30644) {
         this.field_5020.field_8678 = SigmaMainClass.method_3328().method_3298().method_839(new class_1293());
         this.field_5020 = var1;
         SigmaMainClass.method_3328().method_3304().method_5820("profile", var1.field_8677);
         SigmaMainClass.method_3328().method_3298().method_838(var1.field_8678);
         SigmaMainClass.method_3328().method_3318();
      } else {
         this.field_5020.field_8678 = var1.method_7499();
         SigmaMainClass.method_3328().method_3304().method_5820("profile", "Classic");
         SigmaMainClass.method_3328().method_3298().method_838(var1.field_8678);
         SigmaMainClass.method_3328().method_3318();
      }
   }

   public List<class_1675> method_4305() {
      return this.field_5025;
   }
}
