package remapped;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class class_5111 {
   private static String[] field_26368;
   private final class_6041 field_26364;
   private final class_3485 field_26363;
   private final List<class_1856> field_26367;
   private final class_6688 field_26365;
   private final List<class_623> field_26366;

   public class_5111(class_7641 var1, class_6041 var2) {
      this.field_26364 = var2;
      this.field_26363 = (class_3485)var1.method_34607(1836476516L);
      List var5 = var1.method_34612(1953653099L);
      this.field_26367 = new ArrayList<class_1856>(var5.size());

      for (int var6 = 0; var6 < var5.size(); var6++) {
         class_1856 var7 = this.method_23448((class_7641)var5.get(var6));
         if (var7 != null) {
            this.field_26367.add(var7);
         }
      }

      this.field_26365 = new class_6688();
      if (!var1.method_34608(1835365473L)) {
         if (var1.method_34608(1969517665L)) {
            class_7641 var10 = var1.method_34607(1969517665L);
            if (var10.method_34608(1835365473L)) {
               this.field_26365.method_30672(var10, var10.method_34607(1835365473L));
            }
         }
      } else {
         this.field_26365.method_30672(null, var1.method_34607(1835365473L));
      }

      this.field_26366 = new ArrayList<class_623>();
      if (var1.method_34608(1768977007L)) {
         class_7641 var11 = var1.method_34607(1768977007L);

         for (class_7641 var9 : var11.method_34612(1936289382L)) {
            this.field_26366.add(class_623.method_2906(var9));
         }
      }
   }

   private class_1856 method_23448(class_7641 var1) {
      class_6303 var4 = (class_6303)var1.method_34607(1835297121L).method_34607(1751411826L);
      Object var5;
      switch ((int)var4.method_28758()) {
         case 1936684398:
            var5 = new class_5043(var1, this.field_26364);
            break;
         case 1986618469:
            var5 = new class_7112(var1, this.field_26364);
            break;
         default:
            var5 = null;
      }

      return (class_1856)var5;
   }

   public List<class_1856> method_23445() {
      return Collections.<class_1856>unmodifiableList(this.field_26367);
   }

   public List<class_1856> method_23446(class_4923 var1) {
      ArrayList var4 = new ArrayList();

      for (class_1856 var6 : this.field_26367) {
         if (var6.method_8214().equals(var1)) {
            var4.add(var6);
         }
      }

      return Collections.<class_1856>unmodifiableList(var4);
   }

   public List<class_1856> method_23447(class_4926 var1) {
      ArrayList var4 = new ArrayList();

      for (class_1856 var6 : this.field_26367) {
         if (var6.method_8217().equals(var1)) {
            var4.add(var6);
         }
      }

      return Collections.<class_1856>unmodifiableList(var4);
   }

   public boolean method_23443() {
      return this.field_26365.method_30664();
   }

   public class_6688 method_23438() {
      return this.field_26365;
   }

   public List<class_623> method_23437() {
      return Collections.<class_623>unmodifiableList(this.field_26366);
   }

   public Date method_23441() {
      return class_8076.method_36683(this.field_26363.method_16027());
   }

   public Date method_23439() {
      return class_8076.method_36683(this.field_26363.method_16029());
   }

   public double method_23440() {
      return (double)this.field_26363.method_16025() / (double)this.field_26363.method_16026();
   }

   public boolean method_23444() {
      for (class_1856 var4 : this.field_26367) {
         if (var4.method_8219()) {
            return true;
         }
      }

      return false;
   }

   public class_7553 method_23442() throws IOException {
      class_1856 var3 = null;

      for (class_1856 var5 : this.field_26367) {
         if (var5.method_8219() && (var3 == null || var5.method_8218() < var3.method_8218())) {
            var3 = var5;
         }
      }

      return var3 != null ? var3.method_8199() : null;
   }
}
