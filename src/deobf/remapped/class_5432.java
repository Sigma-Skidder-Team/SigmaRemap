package remapped;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public final class class_5432 implements class_1445 {
   private static final Pattern field_27669 = Pattern.compile("[^0-9A-Fa-f]");
   public static final Map<Character, String> field_27675 = new HashMap<Character, String>();
   public static final Map<Character, Integer> field_27670 = new HashMap<Character, Integer>();
   private final class_8907 field_27667;
   private boolean field_27676 = false;
   private int field_27673 = 0;
   private List<class_4610> field_27665;
   private int field_27677 = 0;
   private int field_27668 = -1;
   private class_8613<Integer> field_27666;
   private boolean field_27671 = true;
   private Map<Integer, class_6922> field_27674;

   public class_5432(class_8907 var1) {
      this.field_27667 = var1;
      this.field_27665 = new ArrayList<class_4610>(100);
      this.field_27666 = new class_8613<Integer>(10);
      this.field_27674 = new LinkedHashMap<Integer, class_6922>();
      this.method_24722();
   }

   @Override
   public boolean method_6622(class_7523... var1) {
      while (this.method_24728()) {
         this.method_24714();
      }

      if (!this.field_27665.isEmpty()) {
         if (var1.length == 0) {
            return true;
         }

         class_7523 var4 = this.field_27665.get(0).method_21371();

         for (int var5 = 0; var5 < var1.length; var5++) {
            if (var4 == var1[var5]) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public class_4610 method_6623() {
      while (this.method_24728()) {
         this.method_24714();
      }

      return this.field_27665.get(0);
   }

   @Override
   public class_4610 method_6624() {
      this.field_27677++;
      return this.field_27665.remove(0);
   }

   private boolean method_24728() {
      if (!this.field_27676) {
         if (!this.field_27665.isEmpty()) {
            this.method_24717();
            return this.method_24758() == this.field_27677;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private void method_24714() {
      this.method_24704();
      this.method_24717();
      this.method_24762(this.field_27667.method_40972());
      int var3 = this.field_27667.method_40982();
      switch (var3) {
         case 0:
            this.method_24708();
            return;
         case 33:
            this.method_24760();
            return;
         case 34:
            this.method_24734();
            return;
         case 37:
            if (this.method_24738()) {
               this.method_24716();
               return;
            }
            break;
         case 38:
            this.method_24745();
            return;
         case 39:
            this.method_24752();
            return;
         case 42:
            this.method_24702();
            return;
         case 44:
            this.method_24731();
            return;
         case 45:
            if (this.method_24735()) {
               this.method_24757();
               return;
            }

            if (this.method_24764()) {
               this.method_24703();
               return;
            }
            break;
         case 46:
            if (this.method_24749()) {
               this.method_24711();
               return;
            }
            break;
         case 58:
            if (this.method_24733()) {
               this.method_24706();
               return;
            }
            break;
         case 62:
            if (this.field_27673 == 0) {
               this.method_24707();
               return;
            }
            break;
         case 63:
            if (this.method_24748()) {
               this.method_24718();
               return;
            }
            break;
         case 91:
            this.method_24727();
            return;
         case 93:
            this.method_24726();
            return;
         case 123:
            this.method_24715();
            return;
         case 124:
            if (this.field_27673 == 0) {
               this.method_24730();
               return;
            }
            break;
         case 125:
            this.method_24750();
            return;
      }

      if (this.method_24721()) {
         this.method_24741();
      } else {
         String var4 = String.valueOf(Character.toChars(var3));

         for (Character var6 : field_27675.keySet()) {
            String var7 = field_27675.get(var6);
            if (var7.equals(var4)) {
               var4 = "\\" + var6;
               break;
            }
         }

         if (var3 == 9) {
            var4 = var4 + "(TAB)";
         }

         String var8 = String.format("found character '%s' that cannot start any token. (Do not use %s for indentation)", var4, var4);
         throw new class_7499("while scanning for the next token", null, var8, this.field_27667.method_40969());
      }
   }

   private int method_24758() {
      return this.field_27674.isEmpty() ? -1 : this.field_27674.values().iterator().next().method_31686();
   }

   private void method_24717() {
      if (!this.field_27674.isEmpty()) {
         Iterator var3 = this.field_27674.values().iterator();

         while (var3.hasNext()) {
            class_6922 var4 = (class_6922)var3.next();
            if (var4.method_31683() != this.field_27667.method_40975() || this.field_27667.method_40973() - var4.method_31689() > 1024) {
               if (var4.method_31685()) {
                  throw new class_7499("while scanning a simple key", var4.method_31687(), "could not find expected ':'", this.field_27667.method_40969());
               }

               var3.remove();
            }
         }
      }
   }

   private void method_24747() {
      boolean var3 = this.field_27673 == 0 && this.field_27668 == this.field_27667.method_40972();
      if (!this.field_27671 && var3) {
         throw new class_5251("A simple key is required only if it is the first token in the current line");
      } else {
         if (this.field_27671) {
            this.method_24753();
            int var4 = this.field_27677 + this.field_27665.size();
            class_6922 var5 = new class_6922(
               var4, var3, this.field_27667.method_40973(), this.field_27667.method_40975(), this.field_27667.method_40972(), this.field_27667.method_40969()
            );
            this.field_27674.put(this.field_27673, var5);
         }
      }
   }

   private void method_24753() {
      class_6922 var3 = this.field_27674.remove(this.field_27673);
      if (var3 != null && var3.method_31685()) {
         throw new class_7499("while scanning a simple key", var3.method_31687(), "could not find expected ':'", this.field_27667.method_40969());
      }
   }

   private void method_24762(int var1) {
      if (this.field_27673 == 0) {
         while (this.field_27668 > var1) {
            class_404 var4 = this.field_27667.method_40969();
            this.field_27668 = this.field_27666.method_39590();
            this.field_27665.add(new class_7618(var4, var4));
         }
      }
   }

   private boolean method_24743(int var1) {
      if (this.field_27668 >= var1) {
         return false;
      } else {
         this.field_27666.method_39588(this.field_27668);
         this.field_27668 = var1;
         return true;
      }
   }

   private void method_24722() {
      class_404 var3 = this.field_27667.method_40969();
      class_9436 var4 = new class_9436(var3, var3);
      this.field_27665.add(var4);
   }

   private void method_24708() {
      this.method_24762(-1);
      this.method_24753();
      this.field_27671 = false;
      this.field_27674.clear();
      class_404 var3 = this.field_27667.method_40969();
      class_2223 var4 = new class_2223(var3, var3);
      this.field_27665.add(var4);
      this.field_27676 = true;
   }

   private void method_24716() {
      this.method_24762(-1);
      this.method_24753();
      this.field_27671 = false;
      class_4610 var3 = this.method_24754();
      this.field_27665.add(var3);
   }

   private void method_24757() {
      this.method_24732(true);
   }

   private void method_24711() {
      this.method_24732(false);
   }

   private void method_24732(boolean var1) {
      this.method_24762(-1);
      this.method_24753();
      this.field_27671 = false;
      class_404 var4 = this.field_27667.method_40969();
      this.field_27667.method_40971(3);
      class_404 var5 = this.field_27667.method_40969();
      Object var6;
      if (!var1) {
         var6 = new class_1887(var4, var5);
      } else {
         var6 = new class_721(var4, var5);
      }

      this.field_27665.add((class_4610)var6);
   }

   private void method_24727() {
      this.method_24759(false);
   }

   private void method_24715() {
      this.method_24759(true);
   }

   private void method_24759(boolean var1) {
      this.method_24747();
      this.field_27673++;
      this.field_27671 = true;
      class_404 var4 = this.field_27667.method_40969();
      this.field_27667.method_40971(1);
      class_404 var5 = this.field_27667.method_40969();
      Object var6;
      if (!var1) {
         var6 = new class_8924(var4, var5);
      } else {
         var6 = new class_1410(var4, var5);
      }

      this.field_27665.add((class_4610)var6);
   }

   private void method_24726() {
      this.method_24720(false);
   }

   private void method_24750() {
      this.method_24720(true);
   }

   private void method_24720(boolean var1) {
      this.method_24753();
      this.field_27673--;
      this.field_27671 = false;
      class_404 var4 = this.field_27667.method_40969();
      this.field_27667.method_40970();
      class_404 var5 = this.field_27667.method_40969();
      Object var6;
      if (!var1) {
         var6 = new class_2379(var4, var5);
      } else {
         var6 = new class_7061(var4, var5);
      }

      this.field_27665.add((class_4610)var6);
   }

   private void method_24731() {
      this.field_27671 = true;
      this.method_24753();
      class_404 var3 = this.field_27667.method_40969();
      this.field_27667.method_40970();
      class_404 var4 = this.field_27667.method_40969();
      class_4891 var5 = new class_4891(var3, var4);
      this.field_27665.add(var5);
   }

   private void method_24703() {
      if (this.field_27673 == 0) {
         if (!this.field_27671) {
            throw new class_7499(null, null, "sequence entries are not allowed here", this.field_27667.method_40969());
         }

         if (this.method_24743(this.field_27667.method_40972())) {
            class_404 var3 = this.field_27667.method_40969();
            this.field_27665.add(new class_7595(var3, var3));
         }
      }

      this.field_27671 = true;
      this.method_24753();
      class_404 var6 = this.field_27667.method_40969();
      this.field_27667.method_40970();
      class_404 var4 = this.field_27667.method_40969();
      class_5308 var5 = new class_5308(var6, var4);
      this.field_27665.add(var5);
   }

   private void method_24718() {
      if (this.field_27673 == 0) {
         if (!this.field_27671) {
            throw new class_7499(null, null, "mapping keys are not allowed here", this.field_27667.method_40969());
         }

         if (this.method_24743(this.field_27667.method_40972())) {
            class_404 var3 = this.field_27667.method_40969();
            this.field_27665.add(new class_5417(var3, var3));
         }
      }

      this.field_27671 = this.field_27673 == 0;
      this.method_24753();
      class_404 var6 = this.field_27667.method_40969();
      this.field_27667.method_40970();
      class_404 var4 = this.field_27667.method_40969();
      class_5858 var5 = new class_5858(var6, var4);
      this.field_27665.add(var5);
   }

   private void method_24706() {
      class_6922 var3 = this.field_27674.remove(this.field_27673);
      if (var3 == null) {
         if (this.field_27673 == 0 && !this.field_27671) {
            throw new class_7499(null, null, "mapping values are not allowed here", this.field_27667.method_40969());
         }

         if (this.field_27673 == 0 && this.method_24743(this.field_27667.method_40972())) {
            class_404 var4 = this.field_27667.method_40969();
            this.field_27665.add(new class_5417(var4, var4));
         }

         this.field_27671 = this.field_27673 == 0;
         this.method_24753();
      } else {
         this.field_27665.add(var3.method_31686() - this.field_27677, new class_5858(var3.method_31687(), var3.method_31687()));
         if (this.field_27673 == 0 && this.method_24743(var3.method_31684())) {
            this.field_27665.add(var3.method_31686() - this.field_27677, new class_5417(var3.method_31687(), var3.method_31687()));
         }

         this.field_27671 = false;
      }

      class_404 var7 = this.field_27667.method_40969();
      this.field_27667.method_40970();
      class_404 var5 = this.field_27667.method_40969();
      class_9828 var6 = new class_9828(var7, var5);
      this.field_27665.add(var6);
   }

   private void method_24702() {
      this.method_24747();
      this.field_27671 = false;
      class_4610 var3 = this.method_24737(false);
      this.field_27665.add(var3);
   }

   private void method_24745() {
      this.method_24747();
      this.field_27671 = false;
      class_4610 var3 = this.method_24737(true);
      this.field_27665.add(var3);
   }

   private void method_24760() {
      this.method_24747();
      this.field_27671 = false;
      class_4610 var3 = this.method_24729();
      this.field_27665.add(var3);
   }

   private void method_24730() {
      this.method_24739('|');
   }

   private void method_24707() {
      this.method_24739('>');
   }

   private void method_24739(char var1) {
      this.field_27671 = true;
      this.method_24753();
      class_4610 var4 = this.method_24699(var1);
      this.field_27665.add(var4);
   }

   private void method_24752() {
      this.method_24700('\'');
   }

   private void method_24734() {
      this.method_24700('"');
   }

   private void method_24700(char var1) {
      this.method_24747();
      this.field_27671 = false;
      class_4610 var4 = this.method_24705(var1);
      this.field_27665.add(var4);
   }

   private void method_24741() {
      this.method_24747();
      this.field_27671 = false;
      class_4610 var3 = this.method_24724();
      this.field_27665.add(var3);
   }

   private boolean method_24738() {
      return this.field_27667.method_40972() == 0;
   }

   private boolean method_24735() {
      return this.field_27667.method_40972() == 0
         && "---".equals(this.field_27667.method_40977(3))
         && class_6121.field_31299.method_28112(this.field_27667.method_40983(3));
   }

   private boolean method_24749() {
      return this.field_27667.method_40972() == 0
         && "...".equals(this.field_27667.method_40977(3))
         && class_6121.field_31299.method_28112(this.field_27667.method_40983(3));
   }

   private boolean method_24764() {
      return class_6121.field_31299.method_28112(this.field_27667.method_40983(1));
   }

   private boolean method_24748() {
      return this.field_27673 == 0 ? class_6121.field_31299.method_28112(this.field_27667.method_40983(1)) : true;
   }

   private boolean method_24733() {
      return this.field_27673 == 0 ? class_6121.field_31299.method_28112(this.field_27667.method_40983(1)) : true;
   }

   private boolean method_24721() {
      int var3 = this.field_27667.method_40982();
      return class_6121.field_31299.method_28110(var3, "-?:,[]{}#&*!|>'\"%@`")
         || class_6121.field_31299.method_28109(this.field_27667.method_40983(1)) && (var3 == 45 || this.field_27673 == 0 && "?:".indexOf(var3) != -1);
   }

   private void method_24704() {
      if (this.field_27667.method_40973() == 0 && this.field_27667.method_40982() == 65279) {
         this.field_27667.method_40970();
      }

      boolean var3 = false;

      while (!var3) {
         int var4 = 0;

         while (this.field_27667.method_40983(var4) == 32) {
            var4++;
         }

         if (var4 > 0) {
            this.field_27667.method_40971(var4);
         }

         if (this.field_27667.method_40982() == 35) {
            var4 = 0;

            while (class_6121.field_31290.method_28109(this.field_27667.method_40983(var4))) {
               var4++;
            }

            if (var4 > 0) {
               this.field_27667.method_40971(var4);
            }
         }

         if (this.method_24713().length() == 0) {
            var3 = true;
         } else if (this.field_27673 == 0) {
            this.field_27671 = true;
         }
      }
   }

   private class_4610 method_24754() {
      class_404 var3 = this.field_27667.method_40969();
      this.field_27667.method_40970();
      String var4 = this.method_24725(var3);
      List var5 = null;
      class_404 var6;
      if (!"YAML".equals(var4)) {
         if (!"TAG".equals(var4)) {
            var6 = this.field_27667.method_40969();
            int var7 = 0;

            while (class_6121.field_31290.method_28109(this.field_27667.method_40983(var7))) {
               var7++;
            }

            if (var7 > 0) {
               this.field_27667.method_40971(var7);
            }
         } else {
            var5 = this.method_24709(var3);
            var6 = this.field_27667.method_40969();
         }
      } else {
         var5 = this.method_24712(var3);
         var6 = this.field_27667.method_40969();
      }

      this.method_24736(var3);
      return new class_5438(var4, var5, var3, var6);
   }

   private String method_24725(class_404 var1) {
      int var4 = 0;
      int var5 = this.field_27667.method_40983(var4);

      while (class_6121.field_31289.method_28112(var5)) {
         var5 = this.field_27667.method_40983(++var4);
      }

      if (var4 != 0) {
         String var9 = this.field_27667.method_40974(var4);
         var5 = this.field_27667.method_40982();
         if (!class_6121.field_31280.method_28109(var5)) {
            return var9;
         } else {
            String var7 = String.valueOf(Character.toChars(var5));
            throw new class_7499(
               "while scanning a directive",
               var1,
               "expected alphabetic or numeric character, but found " + var7 + "(" + var5 + ")",
               this.field_27667.method_40969()
            );
         }
      } else {
         String var6 = String.valueOf(Character.toChars(var5));
         throw new class_7499(
            "while scanning a directive",
            var1,
            "expected alphabetic or numeric character, but found " + var6 + "(" + var5 + ")",
            this.field_27667.method_40969()
         );
      }
   }

   private List<Integer> method_24712(class_404 var1) {
      while (this.field_27667.method_40982() == 32) {
         this.field_27667.method_40970();
      }

      Integer var4 = this.method_24697(var1);
      int var5 = this.field_27667.method_40982();
      if (var5 == 46) {
         this.field_27667.method_40970();
         Integer var9 = this.method_24697(var1);
         var5 = this.field_27667.method_40982();
         if (!class_6121.field_31280.method_28109(var5)) {
            ArrayList var10 = new ArrayList(2);
            var10.add(var4);
            var10.add(var9);
            return var10;
         } else {
            String var7 = String.valueOf(Character.toChars(var5));
            throw new class_7499(
               "while scanning a directive", var1, "expected a digit or ' ', but found " + var7 + "(" + var5 + ")", this.field_27667.method_40969()
            );
         }
      } else {
         String var6 = String.valueOf(Character.toChars(var5));
         throw new class_7499(
            "while scanning a directive", var1, "expected a digit or '.', but found " + var6 + "(" + var5 + ")", this.field_27667.method_40969()
         );
      }
   }

   private Integer method_24697(class_404 var1) {
      int var4 = this.field_27667.method_40982();
      if (!Character.isDigit(var4)) {
         String var7 = String.valueOf(Character.toChars(var4));
         throw new class_7499("while scanning a directive", var1, "expected a digit, but found " + var7 + "(" + var4 + ")", this.field_27667.method_40969());
      } else {
         int var5 = 0;

         while (Character.isDigit(this.field_27667.method_40983(var5))) {
            var5++;
         }

         return Integer.parseInt(this.field_27667.method_40974(var5));
      }
   }

   private List<String> method_24709(class_404 var1) {
      while (this.field_27667.method_40982() == 32) {
         this.field_27667.method_40970();
      }

      String var4 = this.method_24698(var1);

      while (this.field_27667.method_40982() == 32) {
         this.field_27667.method_40970();
      }

      String var5 = this.method_24701(var1);
      ArrayList var6 = new ArrayList(2);
      var6.add(var4);
      var6.add(var5);
      return var6;
   }

   private String method_24698(class_404 var1) {
      String var4 = this.method_24740("directive", var1);
      int var5 = this.field_27667.method_40982();
      if (var5 == 32) {
         return var4;
      } else {
         String var6 = String.valueOf(Character.toChars(var5));
         throw new class_7499("while scanning a directive", var1, "expected ' ', but found " + var6 + "(" + var5 + ")", this.field_27667.method_40969());
      }
   }

   private String method_24701(class_404 var1) {
      String var4 = this.method_24746("directive", var1);
      int var5 = this.field_27667.method_40982();
      if (!class_6121.field_31280.method_28109(var5)) {
         return var4;
      } else {
         String var6 = String.valueOf(Character.toChars(var5));
         throw new class_7499("while scanning a directive", var1, "expected ' ', but found " + var6 + "(" + var5 + ")", this.field_27667.method_40969());
      }
   }

   private void method_24736(class_404 var1) {
      while (this.field_27667.method_40982() == 32) {
         this.field_27667.method_40970();
      }

      if (this.field_27667.method_40982() == 35) {
         while (class_6121.field_31290.method_28109(this.field_27667.method_40982())) {
            this.field_27667.method_40970();
         }
      }

      int var4 = this.field_27667.method_40982();
      String var5 = this.method_24713();
      if (var5.length() == 0 && var4 != 0) {
         String var6 = String.valueOf(Character.toChars(var4));
         throw new class_7499(
            "while scanning a directive", var1, "expected a comment or a line break, but found " + var6 + "(" + var4 + ")", this.field_27667.method_40969()
         );
      }
   }

   private class_4610 method_24737(boolean var1) {
      class_404 var4 = this.field_27667.method_40969();
      int var5 = this.field_27667.method_40982();
      String var6 = var5 != 42 ? "anchor" : "alias";
      this.field_27667.method_40970();
      int var7 = 0;
      int var8 = this.field_27667.method_40983(var7);

      while (class_6121.field_31289.method_28112(var8)) {
         var8 = this.field_27667.method_40983(++var7);
      }

      if (var7 != 0) {
         String var13 = this.field_27667.method_40974(var7);
         var8 = this.field_27667.method_40982();
         if (!class_6121.field_31299.method_28110(var8, "?:,]}%@`")) {
            class_404 var14 = this.field_27667.method_40969();
            Object var11;
            if (!var1) {
               var11 = new class_3706(var13, var4, var14);
            } else {
               var11 = new class_977(var13, var4, var14);
            }

            return (class_4610)var11;
         } else {
            String var10 = String.valueOf(Character.toChars(var8));
            throw new class_7499(
               "while scanning an " + var6,
               var4,
               "expected alphabetic or numeric character, but found " + var10 + "(" + var8 + ")",
               this.field_27667.method_40969()
            );
         }
      } else {
         String var9 = String.valueOf(Character.toChars(var8));
         throw new class_7499(
            "while scanning an " + var6,
            var4,
            "expected alphabetic or numeric character, but found " + var9 + "(" + var8 + ")",
            this.field_27667.method_40969()
         );
      }
   }

   private class_4610 method_24729() {
      class_404 var3 = this.field_27667.method_40969();
      int var4 = this.field_27667.method_40983(1);
      String var5 = null;
      Object var6 = null;
      if (var4 != 60) {
         if (!class_6121.field_31299.method_28112(var4)) {
            int var7 = 1;

            boolean var8;
            for (var8 = false; class_6121.field_31280.method_28109(var4); var4 = this.field_27667.method_40983(++var7)) {
               if (var4 == 33) {
                  var8 = true;
                  break;
               }
            }

            if (!var8) {
               var5 = "!";
               this.field_27667.method_40970();
            } else {
               var5 = this.method_24740("tag", var3);
            }

            var6 = this.method_24746("tag", var3);
         } else {
            var6 = "!";
            this.field_27667.method_40970();
         }
      } else {
         this.field_27667.method_40971(2);
         var6 = this.method_24746("tag", var3);
         var4 = this.field_27667.method_40982();
         if (var4 != 62) {
            String var14 = String.valueOf(Character.toChars(var4));
            throw new class_7499("while scanning a tag", var3, "expected '>', but found '" + var14 + "' (" + var4 + ")", this.field_27667.method_40969());
         }

         this.field_27667.method_40970();
      }

      var4 = this.field_27667.method_40982();
      if (!class_6121.field_31280.method_28109(var4)) {
         class_3138 var13 = new class_3138(var5, (String)var6);
         class_404 var15 = this.field_27667.method_40969();
         return new class_9295(var13, var3, var15);
      } else {
         String var12 = String.valueOf(Character.toChars(var4));
         throw new class_7499("while scanning a tag", var3, "expected ' ', but found '" + var12 + "' (" + var4 + ")", this.field_27667.method_40969());
      }
   }

   private class_4610 method_24699(char var1) {
      boolean var4;
      if (var1 != '>') {
         var4 = false;
      } else {
         var4 = true;
      }

      StringBuilder var5 = new StringBuilder();
      class_404 var6 = this.field_27667.method_40969();
      this.field_27667.method_40970();
      class_3853 var7 = this.method_24763(var6);
      int var8 = var7.method_17882();
      this.method_24755(var6);
      int var9 = this.field_27668 + 1;
      if (var9 < 1) {
         var9 = 1;
      }

      int var10;
      String var12;
      class_404 var13;
      if (var8 != -1) {
         var10 = var9 + var8 - 1;
         Object[] var11 = this.method_24719(var10);
         var12 = (String)var11[0];
         var13 = (class_404)var11[1];
      } else {
         Object[] var18 = this.method_24710();
         var12 = (String)var18[0];
         int var14 = (Integer)var18[1];
         var13 = (class_404)var18[2];
         var10 = Math.max(var9, var14);
      }

      String var19 = "";

      while (this.field_27667.method_40972() == var10 && this.field_27667.method_40982() != 0) {
         var5.append(var12);
         boolean var15 = " \t".indexOf(this.field_27667.method_40982()) == -1;
         int var16 = 0;

         while (class_6121.field_31290.method_28109(this.field_27667.method_40983(var16))) {
            var16++;
         }

         var5.append(this.field_27667.method_40974(var16));
         var19 = this.method_24713();
         Object[] var17 = this.method_24719(var10);
         var12 = (String)var17[0];
         var13 = (class_404)var17[1];
         if (this.field_27667.method_40972() != var10 || this.field_27667.method_40982() == 0) {
            break;
         }

         if (!var4 || !"\n".equals(var19) || !var15 || " \t".indexOf(this.field_27667.method_40982()) != -1) {
            var5.append(var19);
         } else if (var12.length() == 0) {
            var5.append(" ");
         }
      }

      if (var7.method_17881()) {
         var5.append(var19);
      }

      if (var7.method_17883()) {
         var5.append(var12);
      }

      return new class_8016(var5.toString(), false, var6, var13, class_7587.method_34479(var1));
   }

   private class_3853 method_24763(class_404 var1) {
      Boolean var4 = null;
      int var5 = -1;
      int var6 = this.field_27667.method_40982();
      if (var6 != 45 && var6 != 43) {
         if (Character.isDigit(var6)) {
            String var11 = String.valueOf(Character.toChars(var6));
            var5 = Integer.parseInt(var11);
            if (var5 == 0) {
               throw new class_7499(
                  "while scanning a block scalar", var1, "expected indentation indicator in the range 1-9, but found 0", this.field_27667.method_40969()
               );
            }

            this.field_27667.method_40970();
            var6 = this.field_27667.method_40982();
            if (var6 == 45 || var6 == 43) {
               if (var6 != 43) {
                  var4 = Boolean.FALSE;
               } else {
                  var4 = Boolean.TRUE;
               }

               this.field_27667.method_40970();
            }
         }
      } else {
         if (var6 != 43) {
            var4 = Boolean.FALSE;
         } else {
            var4 = Boolean.TRUE;
         }

         this.field_27667.method_40970();
         var6 = this.field_27667.method_40982();
         if (Character.isDigit(var6)) {
            String var7 = String.valueOf(Character.toChars(var6));
            var5 = Integer.parseInt(var7);
            if (var5 == 0) {
               throw new class_7499(
                  "while scanning a block scalar", var1, "expected indentation indicator in the range 1-9, but found 0", this.field_27667.method_40969()
               );
            }

            this.field_27667.method_40970();
         }
      }

      var6 = this.field_27667.method_40982();
      if (!class_6121.field_31280.method_28109(var6)) {
         return new class_3853(var4, var5);
      } else {
         String var12 = String.valueOf(Character.toChars(var6));
         throw new class_7499(
            "while scanning a block scalar",
            var1,
            "expected chomping or indentation indicators, but found " + var12 + "(" + var6 + ")",
            this.field_27667.method_40969()
         );
      }
   }

   private String method_24755(class_404 var1) {
      while (this.field_27667.method_40982() == 32) {
         this.field_27667.method_40970();
      }

      if (this.field_27667.method_40982() == 35) {
         while (class_6121.field_31290.method_28109(this.field_27667.method_40982())) {
            this.field_27667.method_40970();
         }
      }

      int var4 = this.field_27667.method_40982();
      String var5 = this.method_24713();
      if (var5.length() == 0 && var4 != 0) {
         String var6 = String.valueOf(Character.toChars(var4));
         throw new class_7499(
            "while scanning a block scalar", var1, "expected a comment or a line break, but found " + var6 + "(" + var4 + ")", this.field_27667.method_40969()
         );
      } else {
         return var5;
      }
   }

   private Object[] method_24710() {
      StringBuilder var3 = new StringBuilder();
      int var4 = 0;
      class_404 var5 = this.field_27667.method_40969();

      while (class_6121.field_31291.method_28113(this.field_27667.method_40982(), " \r")) {
         if (this.field_27667.method_40982() == 32) {
            this.field_27667.method_40970();
            if (this.field_27667.method_40972() > var4) {
               var4 = this.field_27667.method_40972();
            }
         } else {
            var3.append(this.method_24713());
            var5 = this.field_27667.method_40969();
         }
      }

      return new Object[]{var3.toString(), var4, var5};
   }

   private Object[] method_24719(int var1) {
      StringBuilder var4 = new StringBuilder();
      class_404 var5 = this.field_27667.method_40969();

      for (int var6 = this.field_27667.method_40972(); var6 < var1 && this.field_27667.method_40982() == 32; var6++) {
         this.field_27667.method_40970();
      }

      Object var7 = null;

      while ((var7 = this.method_24713()).length() != 0) {
         var4.append((String)var7);
         var5 = this.field_27667.method_40969();

         for (int var8 = this.field_27667.method_40972(); var8 < var1 && this.field_27667.method_40982() == 32; var8++) {
            this.field_27667.method_40970();
         }
      }

      return new Object[]{var4.toString(), var5};
   }

   private class_4610 method_24705(char var1) {
      boolean var4;
      if (var1 != '"') {
         var4 = false;
      } else {
         var4 = true;
      }

      StringBuilder var5 = new StringBuilder();
      class_404 var6 = this.field_27667.method_40969();
      int var7 = this.field_27667.method_40982();
      this.field_27667.method_40970();
      var5.append(this.method_24756(var4, var6));

      while (this.field_27667.method_40982() != var7) {
         var5.append(this.method_24742(var6));
         var5.append(this.method_24756(var4, var6));
      }

      this.field_27667.method_40970();
      class_404 var8 = this.field_27667.method_40969();
      return new class_8016(var5.toString(), false, var6, var8, class_7587.method_34479(var1));
   }

   private String method_24756(boolean var1, class_404 var2) {
      StringBuilder var5 = new StringBuilder();

      while (true) {
         int var6 = 0;

         while (class_6121.field_31299.method_28110(this.field_27667.method_40983(var6), "'\"\\")) {
            var6++;
         }

         if (var6 != 0) {
            var5.append(this.field_27667.method_40974(var6));
         }

         int var7 = this.field_27667.method_40982();
         if (!var1 && var7 == 39 && this.field_27667.method_40983(1) == 39) {
            var5.append("'");
            this.field_27667.method_40971(2);
         } else if ((!var1 || var7 != 39) && (var1 || "\"\\".indexOf(var7) == -1)) {
            if (!var1 || var7 != 92) {
               return var5.toString();
            }

            this.field_27667.method_40970();
            var7 = this.field_27667.method_40982();
            if (!Character.isSupplementaryCodePoint(var7) && field_27675.containsKey((char)var7)) {
               var5.append(field_27675.get((char)var7));
               this.field_27667.method_40970();
            } else if (!Character.isSupplementaryCodePoint(var7) && field_27670.containsKey((char)var7)) {
               var6 = field_27670.get((char)var7);
               this.field_27667.method_40970();
               String var13 = this.field_27667.method_40977(var6);
               if (field_27669.matcher(var13).find()) {
                  throw new class_7499(
                     "while scanning a double-quoted scalar",
                     var2,
                     "expected escape sequence of " + var6 + " hexadecimal numbers, but found: " + var13,
                     this.field_27667.method_40969()
                  );
               }

               int var9 = Integer.parseInt(var13, 16);
               String var10 = new String(Character.toChars(var9));
               var5.append(var10);
               this.field_27667.method_40971(var6);
            } else {
               if (this.method_24713().length() == 0) {
                  String var8 = String.valueOf(Character.toChars(var7));
                  throw new class_7499(
                     "while scanning a double-quoted scalar",
                     var2,
                     "found unknown escape character " + var8 + "(" + var7 + ")",
                     this.field_27667.method_40969()
                  );
               }

               var5.append(this.method_24723(var2));
            }
         } else {
            var5.appendCodePoint(var7);
            this.field_27667.method_40970();
         }
      }
   }

   private String method_24742(class_404 var1) {
      StringBuilder var4 = new StringBuilder();
      int var5 = 0;

      while (" \t".indexOf(this.field_27667.method_40983(var5)) != -1) {
         var5++;
      }

      String var6 = this.field_27667.method_40974(var5);
      int var7 = this.field_27667.method_40982();
      if (var7 != 0) {
         String var8 = this.method_24713();
         if (var8.length() == 0) {
            var4.append(var6);
         } else {
            String var9 = this.method_24723(var1);
            if ("\n".equals(var8)) {
               if (var9.length() == 0) {
                  var4.append(" ");
               }
            } else {
               var4.append(var8);
            }

            var4.append(var9);
         }

         return var4.toString();
      } else {
         throw new class_7499("while scanning a quoted scalar", var1, "found unexpected end of stream", this.field_27667.method_40969());
      }
   }

   private String method_24723(class_404 var1) {
      StringBuilder var4 = new StringBuilder();

      while (true) {
         String var5 = this.field_27667.method_40977(3);
         if (("---".equals(var5) || "...".equals(var5)) && class_6121.field_31299.method_28112(this.field_27667.method_40983(3))) {
            throw new class_7499("while scanning a quoted scalar", var1, "found unexpected document separator", this.field_27667.method_40969());
         }

         while (" \t".indexOf(this.field_27667.method_40982()) != -1) {
            this.field_27667.method_40970();
         }

         String var6 = this.method_24713();
         if (var6.length() == 0) {
            return var4.toString();
         }

         var4.append(var6);
      }
   }

   private class_4610 method_24724() {
      StringBuilder var3 = new StringBuilder();
      class_404 var4 = this.field_27667.method_40969();
      class_404 var5 = var4;
      int var6 = this.field_27668 + 1;
      String var7 = "";

      while (true) {
         int var8 = 0;
         if (this.field_27667.method_40982() == 35) {
            return new class_8016(var3.toString(), var4, var5, true);
         }

         while (true) {
            int var9 = this.field_27667.method_40983(var8);
            if (class_6121.field_31299.method_28112(var9)
               || var9 == 58 && class_6121.field_31299.method_28113(this.field_27667.method_40983(var8 + 1), this.field_27673 == 0 ? "" : ",[]{}")
               || this.field_27673 != 0 && ",?[]{}".indexOf(var9) != -1) {
               if (var8 == 0) {
                  return new class_8016(var3.toString(), var4, var5, true);
               }

               this.field_27671 = false;
               var3.append(var7);
               var3.append(this.field_27667.method_40974(var8));
               var5 = this.field_27667.method_40969();
               var7 = this.method_24761();
               if (var7.length() == 0 || this.field_27667.method_40982() == 35 || this.field_27673 == 0 && this.field_27667.method_40972() < var6) {
                  return new class_8016(var3.toString(), var4, var5, true);
               }
               break;
            }

            var8++;
         }
      }
   }

   private String method_24761() {
      int var3 = 0;

      while (this.field_27667.method_40983(var3) == 32 || this.field_27667.method_40983(var3) == 9) {
         var3++;
      }

      String var4 = this.field_27667.method_40974(var3);
      Object var5 = this.method_24713();
      if (var5.length() == 0) {
         return var4;
      } else {
         this.field_27671 = true;
         String var6 = this.field_27667.method_40977(3);
         if (!"---".equals(var6) && (!"...".equals(var6) || !class_6121.field_31299.method_28112(this.field_27667.method_40983(3)))) {
            StringBuilder var7 = new StringBuilder();

            do {
               while (this.field_27667.method_40982() == 32) {
                  this.field_27667.method_40970();
               }

               String var8 = this.method_24713();
               if (var8.length() == 0) {
                  if ("\n".equals(var5)) {
                     if (var7.length() != 0) {
                        return var7.toString();
                     }

                     return " ";
                  }

                  return var5 + var7;
               }

               var7.append(var8);
               var6 = this.field_27667.method_40977(3);
            } while (!"---".equals(var6) && (!"...".equals(var6) || !class_6121.field_31299.method_28112(this.field_27667.method_40983(3))));

            return "";
         } else {
            return "";
         }
      }
   }

   private String method_24740(String var1, class_404 var2) {
      int var5 = this.field_27667.method_40982();
      if (var5 != 33) {
         String var9 = String.valueOf(Character.toChars(var5));
         throw new class_7499("while scanning a " + var1, var2, "expected '!', but found " + var9 + "(" + var5 + ")", this.field_27667.method_40969());
      } else {
         int var6 = 1;
         var5 = this.field_27667.method_40983(var6);
         if (var5 != 32) {
            while (class_6121.field_31289.method_28112(var5)) {
               var5 = this.field_27667.method_40983(++var6);
            }

            if (var5 != 33) {
               this.field_27667.method_40971(var6);
               String var7 = String.valueOf(Character.toChars(var5));
               throw new class_7499("while scanning a " + var1, var2, "expected '!', but found " + var7 + "(" + var5 + ")", this.field_27667.method_40969());
            }

            var6++;
         }

         return this.field_27667.method_40974(var6);
      }
   }

   private String method_24746(String var1, class_404 var2) {
      StringBuilder var5 = new StringBuilder();
      int var6 = 0;

      int var7;
      for (var7 = this.field_27667.method_40983(var6); class_6121.field_31282.method_28112(var7); var7 = this.field_27667.method_40983(var6)) {
         if (var7 != 37) {
            var6++;
         } else {
            var5.append(this.field_27667.method_40974(var6));
            var6 = 0;
            var5.append(this.method_24744(var1, var2));
         }
      }

      if (var6 != 0) {
         var5.append(this.field_27667.method_40974(var6));
      }

      if (var5.length() != 0) {
         return var5.toString();
      } else {
         String var8 = String.valueOf(Character.toChars(var7));
         throw new class_7499("while scanning a " + var1, var2, "expected URI, but found " + var8 + "(" + var7 + ")", this.field_27667.method_40969());
      }
   }

   private String method_24744(String var1, class_404 var2) {
      int var5 = 1;

      while (this.field_27667.method_40983(var5 * 3) == 37) {
         var5++;
      }

      class_404 var6 = this.field_27667.method_40969();

      ByteBuffer var7;
      for (var7 = ByteBuffer.allocate(var5); this.field_27667.method_40982() == 37; this.field_27667.method_40971(2)) {
         this.field_27667.method_40970();

         try {
            byte var8 = (byte)Integer.parseInt(this.field_27667.method_40977(2), 16);
            var7.put(var8);
         } catch (NumberFormatException var14) {
            int var9 = this.field_27667.method_40982();
            String var10 = String.valueOf(Character.toChars(var9));
            int var11 = this.field_27667.method_40983(1);
            String var12 = String.valueOf(Character.toChars(var11));
            throw new class_7499(
               "while scanning a " + var1,
               var2,
               "expected URI escape sequence of 2 hexadecimal numbers, but found " + var10 + "(" + var9 + ") and " + var12 + "(" + var11 + ")",
               this.field_27667.method_40969()
            );
         }
      }

      ((Buffer)var7).flip();

      try {
         return class_4084.method_18821(var7);
      } catch (CharacterCodingException var13) {
         throw new class_7499("while scanning a " + var1, var2, "expected URI in UTF-8: " + var13.getMessage(), var6);
      }
   }

   private String method_24713() {
      int var3 = this.field_27667.method_40982();
      if (var3 != 13 && var3 != 10 && var3 != 133) {
         if (var3 != 8232 && var3 != 8233) {
            return "";
         } else {
            this.field_27667.method_40970();
            return String.valueOf(Character.toChars(var3));
         }
      } else {
         if (var3 == 13 && 10 == this.field_27667.method_40983(1)) {
            this.field_27667.method_40971(2);
         } else {
            this.field_27667.method_40970();
         }

         return "\n";
      }
   }

   static {
      field_27675.put('0', "\u0000");
      field_27675.put('a', "\u0007");
      field_27675.put('b', "\b");
      field_27675.put('t', "\t");
      field_27675.put('n', field_27672[38]);
      field_27675.put('v', "\u000b");
      field_27675.put('f', "\f");
      field_27675.put('r', "\r");
      field_27675.put('e', "\u001b");
      field_27675.put(' ', field_27672[39]);
      field_27675.put('"', "\"");
      field_27675.put('\\', field_27672[0]);
      field_27675.put('N', "\u0085");
      field_27675.put('_', " ");
      field_27675.put('L', "\u2028");
      field_27675.put('P', "\u2029");
      field_27670.put('x', 2);
      field_27670.put('u', 4);
      field_27670.put('U', 8);
   }
}
