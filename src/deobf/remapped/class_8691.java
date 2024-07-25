package remapped;

import com.mojang.authlib.exceptions.AuthenticationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class class_8691 {
   public ArrayList<class_7309> field_44583 = new ArrayList<class_7309>();
   public File field_44579 = new File(SigmaMainClass.getInstance().getSigmaFolder() + "/alts.json");
   private String field_44581;
   private class_5190 field_44580 = new class_5190();

   public class_8691() {
      this.method_39904();
   }

   public void method_39914() {
      SigmaMainClass.getInstance().getEventManager().subscribe2(this);
      SigmaMainClass.getInstance().getEventManager().subscribe2(this.field_44580);
   }

   @Deprecated
   public void method_39905(class_7309 var1) {
      this.field_44583.add(var1);
   }

   public void method_39911(class_7309 var1) {
      for (int var4 = 0; var4 < this.field_44583.size(); var4++) {
         if (this.field_44583.get(var4).method_33344().equals(var1.method_33344())) {
            this.field_44583.set(var4, var1);
            return;
         }
      }

      this.field_44583.add(var1);
   }

   public void method_39915(class_7309 var1) {
      for (int var4 = 0; var4 < this.field_44583.size(); var4++) {
         if (this.field_44583.get(var4).method_33344().equals(var1.method_33344())) {
            this.field_44583.remove(var4);
            return;
         }
      }
   }

   public boolean method_39910(class_7309 var1) {
      for (int var4 = 0; var4 < this.field_44583.size(); var4++) {
         if (this.field_44583.get(var4).method_33344().equals(var1.method_33344())) {
            return true;
         }
      }

      return false;
   }

   public class_7309 method_39912() {
      for (class_7309 var4 : this.field_44583) {
         if (var4.method_33344().equals(this.field_44581)) {
            return var4;
         }
      }

      return null;
   }

   public boolean method_39906(class_7309 var1) {
      try {
         class_7039.field_36337 = null;
         Session var4 = MinecraftClient.getInstance().session;
         Session var5 = var1.method_33346();
         var4.field_6749 = var5.method_5366();
         var4.field_6748 = var5.method_5367();
         var4.field_6746 = var5.method_5365();
         this.field_44581 = var1.method_33344();
         return true;
      } catch (AuthenticationException var6) {
         return false;
      }
   }

   public boolean method_39913(class_7309 var1) {
      try {
         var1.method_33346();
         this.field_44581 = var1.method_33344();
         return true;
      } catch (AuthenticationException var5) {
         return false;
      }
   }

   public void method_39916(class_7309 var1) {
      this.field_44583.remove(var1);
   }

   public ArrayList<class_7309> method_39908() {
      return this.field_44583;
   }

   public void method_39909() {
      JSONArray var3 = new JSONArray();

      for (class_7309 var5 : this.field_44583) {
         var3.method_6159(var5.method_33323());
      }

      JSONObjectImpl var7 = new JSONObjectImpl();
      var7.method_5820("alts", var3);

      try {
         class_357.method_1791(var7, new File(SigmaMainClass.getInstance().getSigmaFolder() + "/alts.json"));
      } catch (IOException | class_7584 var6) {
         SigmaMainClass.getInstance().method_3326().method_12864(var6.getMessage());
      }
   }

   private void method_39904() {
      try {
         JSONObjectImpl var3 = class_357.method_1789(this.field_44579);
         if (!var3.method_5850("alts")) {
            var3.method_5820("alts", new JSONArray());
         }

         for (Object var5 : var3.method_5849("alts")) {
            this.field_44583.add(new class_7309((JSONObjectImpl)var5));
         }
      } catch (IOException var6) {
         SigmaMainClass.getInstance().method_3326().method_12864(var6.getMessage());
      }
   }

   public String method_39903() {
      return this.field_44581;
   }

   public boolean method_39907(class_7309 var1) {
      return this.method_39903() != null
         ? var1.method_33344().equals(this.method_39903())
         : var1.method_33321().equals(MinecraftClient.getInstance().method_8502().method_5366());
   }
}
