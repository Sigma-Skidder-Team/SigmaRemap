package remapped;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import org.newdawn.slick.SlickException;

public class class_8864 {
   private class_8112 field_45323;
   private String field_45327;
   private HashMap field_45325 = new HashMap();
   private int field_45324 = 2;

   public class_8864(String var1) throws SlickException {
      this(var1, null);
   }

   public class_8864(String var1, class_8709 var2) throws SlickException {
      var1 = var1.replace('\\', '/');
      this.field_45327 = var1.substring(0, var1.lastIndexOf("/") + 1);
      this.method_40764(var1, var2);
   }

   public class_8864(String var1, int var2) throws SlickException {
      this(var1, var2, null);
   }

   public class_8864(String var1, int var2, class_8709 var3) throws SlickException {
      this.field_45324 = var2;
      var1 = var1.replace('\\', '/');
      this.field_45327 = var1.substring(0, var1.lastIndexOf("/") + 1);
      this.method_40764(var1, var3);
   }

   public class_8112 method_40766() {
      return this.field_45323;
   }

   public class_8112 method_40762(String var1) {
      class_664 var4 = (class_664)this.field_45325.get(var1);
      if (var4 != null) {
         return this.field_45323.method_36858(var4.field_3682, var4.field_3686, var4.field_3684, var4.field_3683);
      } else {
         throw new RuntimeException("Unknown sprite from packed sheet: " + var1);
      }
   }

   public class_1888 method_40765(String var1) {
      class_8112 var4 = this.method_40762(var1);
      class_664 var5 = (class_664)this.field_45325.get(var1);
      return new class_1888(var4, var5.field_3684 / var5.field_3680, var5.field_3683 / var5.field_3685);
   }

   private void method_40764(String var1, class_8709 var2) throws SlickException {
      BufferedReader var5 = new BufferedReader(new InputStreamReader(class_8975.method_41153(var1)));

      try {
         this.field_45323 = new class_8112(this.field_45327 + var5.readLine(), false, this.field_45324, var2);

         while (var5.ready() && var5.readLine() != null) {
            class_664 var6 = new class_664(this, var5);
            this.field_45325.put(var6.field_3678, var6);
            if (var5.readLine() == null) {
               break;
            }
         }
      } catch (Exception var7) {
         class_2598.method_11785(var7);
         throw new class_1162("Failed to process definitions file - invalid format?", var7);
      }
   }
}
