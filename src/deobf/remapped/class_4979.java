package remapped;

import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.regex.Pattern;

public final class class_4979 implements class_6743 {
   private static final Map<Character, String> field_25796 = new HashMap<Character, String>();
   public static final int field_25785 = 1;
   public static final int field_25797 = 10;
   private static final char[] field_25772 = new char[]{' '};
   private static final Map<String, String> field_25795 = new LinkedHashMap<String, String>();
   private final Writer field_25767;
   private final class_8613<class_3155> field_25798;
   private class_3155 field_25799;
   private final Queue<class_8087> field_25768;
   private class_8087 field_25801;
   private final class_8613<Integer> field_25775;
   private Integer field_25783;
   private int field_25800;
   private boolean field_25777;
   private boolean field_25771;
   private boolean field_25793;
   private int field_25790;
   private boolean field_25778;
   private boolean field_25786;
   private boolean field_25802;
   private Boolean field_25773;
   private Boolean field_25787;
   private boolean field_25794;
   private int field_25779;
   private int field_25782;
   private int field_25791;
   private char[] field_25769;
   private boolean field_25774;
   private Map<String, String> field_25792;
   private String field_25780;
   private String field_25784;
   private class_3490 field_25781;
   private class_7587 field_25770;
   private static final Pattern field_25788 = Pattern.compile("^![-_\\w]*!$");
   private static final Pattern field_25776 = Pattern.compile("^[-_\\w]*$");

   public class_4979(Writer var1, class_4251 var2) {
      this.field_25767 = var1;
      this.field_25798 = new class_8613<class_3155>(100);
      this.field_25799 = new class_6438(this, null);
      this.field_25768 = new ArrayBlockingQueue<class_8087>(100);
      this.field_25801 = null;
      this.field_25775 = new class_8613<Integer>(10);
      this.field_25783 = null;
      this.field_25800 = 0;
      this.field_25771 = false;
      this.field_25793 = false;
      this.field_25790 = 0;
      this.field_25778 = true;
      this.field_25786 = true;
      this.field_25802 = false;
      this.field_25773 = var2.method_19791();
      this.field_25787 = var2.method_19821();
      this.field_25794 = var2.method_19802();
      this.field_25779 = 2;
      if (var2.method_19819() > 1 && var2.method_19819() < 10) {
         this.field_25779 = var2.method_19819();
      }

      this.field_25782 = var2.method_19801();
      this.field_25791 = 80;
      if (var2.method_19813() > this.field_25779 * 2) {
         this.field_25791 = var2.method_19813();
      }

      this.field_25769 = var2.method_19797().method_586().toCharArray();
      this.field_25774 = var2.method_19816();
      this.field_25792 = new LinkedHashMap<String, String>();
      this.field_25780 = null;
      this.field_25784 = null;
      this.field_25781 = null;
      this.field_25770 = null;
   }

   @Override
   public void method_30889(class_8087 var1) throws IOException {
      this.field_25768.add(var1);

      while (!this.method_22939()) {
         this.field_25801 = this.field_25768.poll();
         this.field_25799.method_14555();
         this.field_25801 = null;
      }
   }

   private boolean method_22939() {
      if (!this.field_25768.isEmpty()) {
         class_8087 var3 = this.field_25768.peek();
         if (!(var3 instanceof class_922)) {
            if (!(var3 instanceof class_2410)) {
               return !(var3 instanceof class_3659) ? false : this.method_22905(3);
            } else {
               return this.method_22905(2);
            }
         } else {
            return this.method_22905(1);
         }
      } else {
         return true;
      }
   }

   private boolean method_22905(int var1) {
      int var4 = 0;
      Iterator var5 = this.field_25768.iterator();
      var5.next();

      while (var5.hasNext()) {
         class_8087 var6 = (class_8087)var5.next();
         if (var6 instanceof class_922 || var6 instanceof class_369) {
            var4++;
         } else if (var6 instanceof class_1927 || var6 instanceof class_4768) {
            var4--;
         } else if (var6 instanceof class_2946) {
            var4 = -1;
         }

         if (var4 < 0) {
            return false;
         }
      }

      return this.field_25768.size() < var1 + 1;
   }

   private void method_22919(boolean var1, boolean var2) {
      this.field_25775.method_39588(this.field_25783);
      if (this.field_25783 != null) {
         if (!var2) {
            this.field_25783 = this.field_25783 + this.field_25779;
         }
      } else if (!var1) {
         this.field_25783 = 0;
      } else {
         this.field_25783 = this.field_25779;
      }
   }

   private void method_22896(boolean var1, boolean var2, boolean var3) throws IOException {
      this.field_25777 = var1;
      this.field_25771 = var2;
      this.field_25793 = var3;
      if (!(this.field_25801 instanceof class_8788)) {
         if (!(this.field_25801 instanceof class_4417) && !(this.field_25801 instanceof class_369)) {
            throw new class_5633("expected NodeEvent, but got " + this.field_25801);
         }

         this.method_22908("&");
         this.method_22897();
         if (!(this.field_25801 instanceof class_4417)) {
            if (!(this.field_25801 instanceof class_2410)) {
               if (this.field_25800 == 0 && !this.field_25773 && !((class_3659)this.field_25801).method_1812() && !this.method_22914()) {
                  this.method_22902();
               } else {
                  this.method_22881();
               }
            } else if (this.field_25800 == 0 && !this.field_25773 && !((class_2410)this.field_25801).method_1812() && !this.method_22936()) {
               this.method_22899();
            } else {
               this.method_22931();
            }
         } else {
            this.method_22922();
         }
      } else {
         this.method_22925();
      }
   }

   private void method_22925() throws IOException {
      if (((class_5399)this.field_25801).method_24586() != null) {
         this.method_22908("*");
         this.field_25799 = this.field_25798.method_39590();
      } else {
         throw new class_5633("anchor is not specified for alias");
      }
   }

   private void method_22922() throws IOException {
      this.method_22919(true, false);
      this.method_22910();
      this.field_25783 = this.field_25775.method_39590();
      this.field_25799 = this.field_25798.method_39590();
   }

   private void method_22931() throws IOException {
      this.method_22895("[", true, true, false);
      this.field_25800++;
      this.method_22919(true, false);
      if (this.field_25787) {
         this.method_22883();
      }

      this.field_25799 = new class_6345(this, null);
   }

   private void method_22881() throws IOException {
      this.method_22895("{", true, true, false);
      this.field_25800++;
      this.method_22919(true, false);
      if (this.field_25787) {
         this.method_22883();
      }

      this.field_25799 = new class_6570(this, null);
   }

   private void method_22899() throws IOException {
      boolean var3 = this.field_25771 && !this.field_25786;
      this.method_22919(false, var3);
      this.field_25799 = new class_3124(this, null);
   }

   private void method_22902() throws IOException {
      this.method_22919(false, false);
      this.field_25799 = new class_2204(this, null);
   }

   private boolean method_22936() {
      return this.field_25801 instanceof class_2410 && !this.field_25768.isEmpty() && this.field_25768.peek() instanceof class_6130;
   }

   private boolean method_22914() {
      return this.field_25801 instanceof class_3659 && !this.field_25768.isEmpty() && this.field_25768.peek() instanceof class_4363;
   }

   private boolean method_22888() {
      if (this.field_25801 instanceof class_922 && !this.field_25768.isEmpty()) {
         class_8087 var3 = this.field_25768.peek();
         if (!(var3 instanceof class_4417)) {
            return false;
         } else {
            class_4417 var4 = (class_4417)var3;
            return var4.method_24586() == null && var4.method_20550() == null && var4.method_20549() != null && var4.method_20548().length() == 0;
         }
      } else {
         return false;
      }
   }

   private boolean method_22913() {
      int var3 = 0;
      if (this.field_25801 instanceof class_5399 && ((class_5399)this.field_25801).method_24586() != null) {
         if (this.field_25780 == null) {
            this.field_25780 = method_22928(((class_5399)this.field_25801).method_24586());
         }

         var3 += this.field_25780.length();
      }

      String var4 = null;
      if (!(this.field_25801 instanceof class_4417)) {
         if (this.field_25801 instanceof class_369) {
            var4 = ((class_369)this.field_25801).method_1815();
         }
      } else {
         var4 = ((class_4417)this.field_25801).method_20550();
      }

      if (var4 != null) {
         if (this.field_25784 == null) {
            this.field_25784 = this.method_22924(var4);
         }

         var3 += this.field_25784.length();
      }

      if (this.field_25801 instanceof class_4417) {
         if (this.field_25781 == null) {
            this.field_25781 = this.method_22900(((class_4417)this.field_25801).method_20548());
         }

         var3 += this.field_25781.field_17133.length();
      }

      return var3 < 128
         && (
            this.field_25801 instanceof class_8788
               || this.field_25801 instanceof class_4417 && !this.field_25781.field_17138 && !this.field_25781.field_17134
               || this.method_22936()
               || this.method_22914()
         );
   }

   private void method_22908(String var1) throws IOException {
      class_5399 var4 = (class_5399)this.field_25801;
      if (var4.method_24586() != null) {
         if (this.field_25780 == null) {
            this.field_25780 = method_22928(var4.method_24586());
         }

         this.method_22895(var1 + this.field_25780, true, false, false);
         this.field_25780 = null;
      } else {
         this.field_25780 = null;
      }
   }

   private void method_22897() throws IOException {
      Object var3 = null;
      if (!(this.field_25801 instanceof class_4417)) {
         class_369 var6 = (class_369)this.field_25801;
         var3 = var6.method_1815();
         if ((!this.field_25773 || var3 == null) && var6.method_1814()) {
            this.field_25784 = null;
            return;
         }
      } else {
         class_4417 var4 = (class_4417)this.field_25801;
         var3 = var4.method_20550();
         if (this.field_25770 == null) {
            this.field_25770 = this.method_22890();
         }

         if ((!this.field_25773 || var3 == null)
            && (this.field_25770 == null && var4.method_20549().method_12730() || this.field_25770 != null && var4.method_20549().method_12727())) {
            this.field_25784 = null;
            return;
         }

         if (var4.method_20549().method_12730() && var3 == null) {
            var3 = "!";
            this.field_25784 = null;
         }
      }

      if (var3 != null) {
         if (this.field_25784 == null) {
            this.field_25784 = this.method_22924((String)var3);
         }

         this.method_22895(this.field_25784, true, false, false);
         this.field_25784 = null;
      } else {
         throw new class_5633("tag is not specified");
      }
   }

   private class_7587 method_22890() {
      class_4417 var3 = (class_4417)this.field_25801;
      if (this.field_25781 == null) {
         this.field_25781 = this.method_22900(var3.method_20548());
      }

      if ((var3.method_20547() || var3.method_20551() != class_7587.field_38643) && !this.field_25773) {
         if (!var3.method_20547()
            || !var3.method_20549().method_12730()
            || this.field_25793 && (this.field_25781.field_17138 || this.field_25781.field_17134)
            || (this.field_25800 == 0 || !this.field_25781.field_17136) && (this.field_25800 != 0 || !this.field_25781.field_17137)) {
            if (!var3.method_20547()
               && (var3.method_20551() == class_7587.field_38644 || var3.method_20551() == class_7587.field_38648)
               && this.field_25800 == 0
               && !this.field_25793
               && this.field_25781.field_17131) {
               return var3.method_20551();
            } else {
               return (var3.method_20547() || var3.method_20551() == class_7587.field_38649)
                     && this.field_25781.field_17135
                     && (!this.field_25793 || !this.field_25781.field_17134)
                  ? class_7587.field_38649
                  : class_7587.field_38643;
            }
         } else {
            return null;
         }
      } else {
         return class_7587.field_38643;
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void method_22910() throws IOException {
      class_4417 var3 = (class_4417)this.field_25801;
      if (this.field_25781 == null) {
         this.field_25781 = this.method_22900(var3.method_20548());
      }

      if (this.field_25770 == null) {
         this.field_25770 = this.method_22890();
      }

      boolean var4 = !this.field_25793 && this.field_25774;
      if (this.field_25770 == null) {
         this.method_22917(this.field_25781.field_17133, var4);
      } else {
         switch (this.field_25770) {
            case field_38643:
               this.method_22911(this.field_25781.field_17133, var4);
               break;
            case field_38649:
               this.method_22921(this.field_25781.field_17133, var4);
               break;
            case field_38648:
               this.method_22904(this.field_25781.field_17133, var4);
               break;
            case field_38644:
               this.method_22884(this.field_25781.field_17133);
               break;
            default:
               throw new class_5251("Unexpected style: " + this.field_25770);
         }
      }

      this.field_25781 = null;
      this.field_25770 = null;
   }

   private String method_22901(class_7826 var1) {
      if (var1.method_35433() == 1) {
         return var1.method_35434();
      } else {
         throw new class_5633("unsupported YAML version: " + var1);
      }
   }

   private String method_22892(String var1) {
      if (var1.length() != 0) {
         if (var1.charAt(0) != '!' || var1.charAt(var1.length() - 1) != '!') {
            throw new class_5633("tag handle must start and end with '!': " + var1);
         } else if (!"!".equals(var1) && !field_25788.matcher(var1).matches()) {
            throw new class_5633("invalid character in the tag handle: " + var1);
         } else {
            return var1;
         }
      } else {
         throw new class_5633("tag handle must not be empty");
      }
   }

   private String method_22930(String var1) {
      if (var1.length() == 0) {
         throw new class_5633("tag prefix must not be empty");
      } else {
         StringBuilder var4 = new StringBuilder();
         byte var5 = 0;
         int var6 = 0;
         if (var1.charAt(0) == '!') {
            var6 = 1;
         }

         while (var6 < var1.length()) {
            var6++;
         }

         if (var5 < var6) {
            var4.append(var1.substring(var5, var6));
         }

         return var4.toString();
      }
   }

   private String method_22924(String var1) {
      if (var1.length() == 0) {
         throw new class_5633("tag must not be empty");
      } else if ("!".equals(var1)) {
         return var1;
      } else {
         String var4 = null;
         String var5 = var1;

         for (String var7 : this.field_25792.keySet()) {
            if (var1.startsWith(var7) && ("!".equals(var7) || var7.length() < var1.length())) {
               var4 = var7;
            }
         }

         if (var4 != null) {
            var5 = var1.substring(var4.length());
            var4 = this.field_25792.get(var4);
         }

         int var8 = var5.length();
         String var9 = var8 <= 0 ? "" : var5.substring(0, var8);
         return var4 == null ? "!<" + var9 + ">" : var4 + var9;
      }
   }

   public static String method_22928(String var0) {
      if (var0.length() != 0) {
         if (field_25776.matcher(var0).matches()) {
            return var0;
         } else {
            throw new class_5633("invalid character in the anchor: " + var0);
         }
      } else {
         throw new class_5633("anchor must not be empty");
      }
   }

   private class_3490 method_22900(String var1) {
      if (var1.length() == 0) {
         return new class_3490(var1, true, false, false, true, true, false);
      } else {
         boolean var4 = false;
         boolean var5 = false;
         boolean var6 = false;
         boolean var7 = false;
         boolean var8 = false;
         boolean var9 = false;
         boolean var10 = false;
         boolean var11 = false;
         boolean var12 = false;
         boolean var13 = false;
         if (var1.startsWith("---") || var1.startsWith("...")) {
            var4 = true;
            var5 = true;
         }

         boolean var14 = true;
         boolean var15 = var1.length() == 1 || class_6121.field_31299.method_28112(var1.codePointAt(1));
         boolean var16 = false;
         boolean var17 = false;
         int var18 = 0;

         while (var18 < var1.length()) {
            int var19 = var1.codePointAt(var18);
            if (var18 != 0) {
               if (",?[]{}".indexOf(var19) != -1) {
                  var5 = true;
               }

               if (var19 == 58) {
                  var5 = true;
                  if (var15) {
                     var4 = true;
                  }
               }

               if (var19 == 35 && var14) {
                  var5 = true;
                  var4 = true;
               }
            } else {
               if ("#,[]{}&*!|>'\"%@`".indexOf(var19) != -1) {
                  var5 = true;
                  var4 = true;
               }

               if (var19 == 63 || var19 == 58) {
                  var5 = true;
                  if (var15) {
                     var4 = true;
                  }
               }

               if (var19 == 45 && var15) {
                  var5 = true;
                  var4 = true;
               }
            }

            boolean var20 = class_6121.field_31291.method_28112(var19);
            if (var20) {
               var6 = true;
            }

            if (var19 != 10 && (32 > var19 || var19 > 126)) {
               if (var19 == 133 || var19 >= 160 && var19 <= 55295 || var19 >= 57344 && var19 <= 65533 || var19 >= 65536 && var19 <= 1114111) {
                  if (!this.field_25794) {
                     var7 = true;
                  }
               } else {
                  var7 = true;
               }
            }

            if (var19 != 32) {
               if (!var20) {
                  var16 = false;
                  var17 = false;
               } else {
                  if (var18 == 0) {
                     var9 = true;
                  }

                  if (var18 == var1.length() - 1) {
                     var11 = true;
                  }

                  if (var16) {
                     var13 = true;
                  }

                  var16 = false;
                  var17 = true;
               }
            } else {
               if (var18 == 0) {
                  var8 = true;
               }

               if (var18 == var1.length() - 1) {
                  var10 = true;
               }

               if (var17) {
                  var12 = true;
               }

               var16 = true;
               var17 = false;
            }

            var18 += Character.charCount(var19);
            var14 = class_6121.field_31298.method_28112(var19) || var20;
            var15 = true;
            if (var18 + 1 < var1.length()) {
               int var21 = var18 + Character.charCount(var1.codePointAt(var18));
               if (var21 < var1.length()) {
                  var15 = class_6121.field_31298.method_28112(var1.codePointAt(var21)) || var20;
               }
            }
         }

         boolean var23 = true;
         boolean var24 = true;
         boolean var25 = true;
         boolean var22 = true;
         if (var8 || var9 || var10 || var11) {
            var24 = false;
            var23 = false;
         }

         if (var10) {
            var22 = false;
         }

         if (var12) {
            var25 = false;
            var24 = false;
            var23 = false;
         }

         if (var13 || var7) {
            var22 = false;
            var25 = false;
            var24 = false;
            var23 = false;
         }

         if (var6) {
            var23 = false;
         }

         if (var5) {
            var23 = false;
         }

         if (var4) {
            var24 = false;
         }

         return new class_3490(var1, false, var6, var23, var24, var25, var22);
      }
   }

   public void method_22907() throws IOException {
      this.field_25767.flush();
   }

   public void method_22878() {
   }

   public void method_22923() throws IOException {
      this.method_22907();
   }

   public void method_22895(String var1, boolean var2, boolean var3, boolean var4) throws IOException {
      if (!this.field_25778 && var2) {
         this.field_25790++;
         this.field_25767.write(field_25772);
      }

      this.field_25778 = var3;
      this.field_25786 = this.field_25786 && var4;
      this.field_25790 = this.field_25790 + var1.length();
      this.field_25802 = false;
      this.field_25767.write(var1);
   }

   public void method_22883() throws IOException {
      int var3;
      if (this.field_25783 == null) {
         var3 = 0;
      } else {
         var3 = this.field_25783;
      }

      if (!this.field_25786 || this.field_25790 > var3 || this.field_25790 == var3 && !this.field_25778) {
         this.method_22894(null);
      }

      this.method_22891(var3 - this.field_25790);
   }

   private void method_22891(int var1) throws IOException {
      if (var1 > 0) {
         this.field_25778 = true;
         char[] var4 = new char[var1];

         for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5] = ' ';
         }

         this.field_25790 += var1;
         this.field_25767.write(var4);
      }
   }

   private void method_22894(String var1) throws IOException {
      this.field_25778 = true;
      this.field_25786 = true;
      this.field_25790 = 0;
      if (var1 != null) {
         this.field_25767.write(var1);
      } else {
         this.field_25767.write(this.field_25769);
      }
   }

   public void method_22938(String var1) throws IOException {
      this.field_25767.write("%YAML ");
      this.field_25767.write(var1);
      this.method_22894(null);
   }

   public void method_22935(String var1, String var2) throws IOException {
      this.field_25767.write("%TAG ");
      this.field_25767.write(var1);
      this.field_25767.write(field_25772);
      this.field_25767.write(var2);
      this.method_22894(null);
   }

   private void method_22921(String var1, boolean var2) throws IOException {
      this.method_22895("'", true, false, false);
      boolean var5 = false;
      boolean var6 = false;
      int var7 = 0;

      for (int var8 = 0; var8 <= var1.length(); var8++) {
         char var9 = 0;
         if (var8 < var1.length()) {
            var9 = var1.charAt(var8);
         }

         if (!var5) {
            if (!var6) {
               if (class_6121.field_31291.method_28113(var9, "\u0000 '") && var7 < var8) {
                  int var16 = var8 - var7;
                  this.field_25790 += var16;
                  this.field_25767.write(var1, var7, var16);
                  var7 = var8;
               }
            } else if (var9 == 0 || class_6121.field_31291.method_28109(var9)) {
               if (var1.charAt(var7) == '\n') {
                  this.method_22894(null);
               }

               String var15 = var1.substring(var7, var8);

               for (char var14 : var15.toCharArray()) {
                  if (var14 != '\n') {
                     this.method_22894(String.valueOf(var14));
                  } else {
                     this.method_22894(null);
                  }
               }

               this.method_22883();
               var7 = var8;
            }
         } else if (var9 == 0 || var9 != ' ') {
            if (var7 + 1 == var8 && this.field_25790 > this.field_25791 && var2 && var7 != 0 && var8 != var1.length()) {
               this.method_22883();
            } else {
               int var10 = var8 - var7;
               this.field_25790 += var10;
               this.field_25767.write(var1, var7, var10);
            }

            var7 = var8;
         }

         if (var9 == '\'') {
            this.field_25790 += 2;
            this.field_25767.write("''");
            var7 = var8 + 1;
         }

         if (var9 != 0) {
            var5 = var9 == ' ';
            var6 = class_6121.field_31291.method_28112(var9);
         }
      }

      this.method_22895("'", false, false, false);
   }

   private void method_22911(String var1, boolean var2) throws IOException {
      this.method_22895("\"", true, false, false);
      int var5 = 0;

      for (int var6 = 0; var6 <= var1.length(); var6++) {
         Character var7 = null;
         if (var6 < var1.length()) {
            var7 = var1.charAt(var6);
         }

         if (var7 == null || "\"\\\u0085\u2028\u2029\ufeff".indexOf(var7) != -1 || ' ' > var7 || var7 > '~') {
            if (var5 < var6) {
               int var8 = var6 - var5;
               this.field_25790 += var8;
               this.field_25767.write(var1, var5, var8);
               var5 = var6;
            }

            if (var7 != null) {
               String var11;
               if (!field_25796.containsKey(var7)) {
                  if (this.field_25794 && class_8907.method_40978(var7)) {
                     var11 = String.valueOf(var7);
                  } else if (var7 > 255) {
                     if (var7 < '\ud800' || var7 > '\udbff') {
                        String var16 = "000" + Integer.toString(var7, 16);
                        var11 = "\\u" + var16.substring(var16.length() - 4);
                     } else if (var6 + 1 >= var1.length()) {
                        String var14 = "000" + Integer.toString(var7, 16);
                        var11 = "\\u" + var14.substring(var14.length() - 4);
                     } else {
                        Character var15 = var1.charAt(++var6);
                        String var10 = "000" + Long.toHexString((long)Character.toCodePoint(var7, var15));
                        var11 = "\\U" + var10.substring(var10.length() - 8);
                     }
                  } else {
                     String var9 = "0" + Integer.toString(var7, 16);
                     var11 = "\\x" + var9.substring(var9.length() - 2);
                  }
               } else {
                  var11 = "\\" + field_25796.get(var7);
               }

               this.field_25790 = this.field_25790 + var11.length();
               this.field_25767.write(var11);
               var5 = var6 + 1;
            }
         }

         if (0 < var6 && var6 < var1.length() - 1 && (var7 == ' ' || var5 >= var6) && this.field_25790 + (var6 - var5) > this.field_25791 && var2) {
            String var12;
            if (var5 < var6) {
               var12 = var1.substring(var5, var6) + "\\";
            } else {
               var12 = "\\";
            }

            if (var5 < var6) {
               var5 = var6;
            }

            this.field_25790 = this.field_25790 + var12.length();
            this.field_25767.write(var12);
            this.method_22883();
            this.field_25778 = false;
            this.field_25786 = false;
            if (var1.charAt(var5) == ' ') {
               var12 = "\\";
               this.field_25790 = this.field_25790 + var12.length();
               this.field_25767.write(var12);
            }
         }
      }

      this.method_22895("\"", false, false, false);
   }

   private String method_22903(String var1) {
      StringBuilder var4 = new StringBuilder();
      if (class_6121.field_31291.method_28113(var1.charAt(0), " ")) {
         var4.append(this.field_25779);
      }

      char var5 = var1.charAt(var1.length() - 1);
      if (!class_6121.field_31291.method_28109(var5)) {
         if (var1.length() == 1 || class_6121.field_31291.method_28112(var1.charAt(var1.length() - 2))) {
            var4.append("+");
         }
      } else {
         var4.append("-");
      }

      return var4.toString();
   }

   public void method_22904(String var1, boolean var2) throws IOException {
      String var5 = this.method_22903(var1);
      this.method_22895(">" + var5, true, false, false);
      if (var5.length() > 0 && var5.charAt(var5.length() - 1) == '+') {
         this.field_25802 = true;
      }

      this.method_22894(null);
      boolean var6 = true;
      boolean var7 = false;
      boolean var8 = true;
      int var9 = 0;

      for (int var10 = 0; var10 <= var1.length(); var10++) {
         char var11 = 0;
         if (var10 < var1.length()) {
            var11 = var1.charAt(var10);
         }

         if (!var8) {
            if (!var7) {
               if (class_6121.field_31291.method_28113(var11, "\u0000 ")) {
                  int var18 = var10 - var9;
                  this.field_25790 += var18;
                  this.field_25767.write(var1, var9, var18);
                  if (var11 == 0) {
                     this.method_22894(null);
                  }

                  var9 = var10;
               }
            } else if (var11 != ' ') {
               if (var9 + 1 == var10 && this.field_25790 > this.field_25791 && var2) {
                  this.method_22883();
               } else {
                  int var17 = var10 - var9;
                  this.field_25790 += var17;
                  this.field_25767.write(var1, var9, var17);
               }

               var9 = var10;
            }
         } else if (var11 == 0 || class_6121.field_31291.method_28109(var11)) {
            if (!var6 && var11 != 0 && var11 != ' ' && var1.charAt(var9) == '\n') {
               this.method_22894(null);
            }

            var6 = var11 == ' ';
            String var12 = var1.substring(var9, var10);

            for (char var16 : var12.toCharArray()) {
               if (var16 != '\n') {
                  this.method_22894(String.valueOf(var16));
               } else {
                  this.method_22894(null);
               }
            }

            if (var11 != 0) {
               this.method_22883();
            }

            var9 = var10;
         }

         if (var11 != 0) {
            var8 = class_6121.field_31291.method_28112(var11);
            var7 = var11 == ' ';
         }
      }
   }

   public void method_22884(String var1) throws IOException {
      String var4 = this.method_22903(var1);
      this.method_22895("|" + var4, true, false, false);
      if (var4.length() > 0 && var4.charAt(var4.length() - 1) == '+') {
         this.field_25802 = true;
      }

      this.method_22894(null);
      boolean var5 = true;
      int var6 = 0;

      for (int var7 = 0; var7 <= var1.length(); var7++) {
         char var8 = 0;
         if (var7 < var1.length()) {
            var8 = var1.charAt(var7);
         }

         if (!var5) {
            if (var8 == 0 || class_6121.field_31291.method_28112(var8)) {
               this.field_25767.write(var1, var6, var7 - var6);
               if (var8 == 0) {
                  this.method_22894(null);
               }

               var6 = var7;
            }
         } else if (var8 == 0 || class_6121.field_31291.method_28109(var8)) {
            String var9 = var1.substring(var6, var7);

            for (char var13 : var9.toCharArray()) {
               if (var13 != '\n') {
                  this.method_22894(String.valueOf(var13));
               } else {
                  this.method_22894(null);
               }
            }

            if (var8 != 0) {
               this.method_22883();
            }

            var6 = var7;
         }

         if (var8 != 0) {
            var5 = class_6121.field_31291.method_28112(var8);
         }
      }
   }

   public void method_22917(String var1, boolean var2) throws IOException {
      if (this.field_25777) {
         this.field_25802 = true;
      }

      if (var1.length() != 0) {
         if (!this.field_25778) {
            this.field_25790++;
            this.field_25767.write(field_25772);
         }

         this.field_25778 = false;
         this.field_25786 = false;
         boolean var5 = false;
         boolean var6 = false;
         int var7 = 0;

         for (int var8 = 0; var8 <= var1.length(); var8++) {
            char var9 = 0;
            if (var8 < var1.length()) {
               var9 = var1.charAt(var8);
            }

            if (!var5) {
               if (!var6) {
                  if (class_6121.field_31291.method_28113(var9, "\u0000 ")) {
                     int var16 = var8 - var7;
                     this.field_25790 += var16;
                     this.field_25767.write(var1, var7, var16);
                     var7 = var8;
                  }
               } else if (class_6121.field_31291.method_28109(var9)) {
                  if (var1.charAt(var7) == '\n') {
                     this.method_22894(null);
                  }

                  String var15 = var1.substring(var7, var8);

                  for (char var14 : var15.toCharArray()) {
                     if (var14 != '\n') {
                        this.method_22894(String.valueOf(var14));
                     } else {
                        this.method_22894(null);
                     }
                  }

                  this.method_22883();
                  this.field_25778 = false;
                  this.field_25786 = false;
                  var7 = var8;
               }
            } else if (var9 != ' ') {
               if (var7 + 1 == var8 && this.field_25790 > this.field_25791 && var2) {
                  this.method_22883();
                  this.field_25778 = false;
                  this.field_25786 = false;
               } else {
                  int var10 = var8 - var7;
                  this.field_25790 += var10;
                  this.field_25767.write(var1, var7, var10);
               }

               var7 = var8;
            }

            if (var9 != 0) {
               var5 = var9 == ' ';
               var6 = class_6121.field_31291.method_28112(var9);
            }
         }
      }
   }

   static {
      field_25796.put('\u0000', field_25789[32]);
      field_25796.put('\u0007', "a");
      field_25796.put('\b', "b");
      field_25796.put('\t', "t");
      field_25796.put('\n', "n");
      field_25796.put('\u000b', "v");
      field_25796.put('\f', "f");
      field_25796.put('\r', "r");
      field_25796.put('\u001b', "e");
      field_25796.put('"', field_25789[29]);
      field_25796.put('\\', field_25789[31]);
      field_25796.put('\u0085', "N");
      field_25796.put(' ', "_");
      field_25796.put('\u2028', "L");
      field_25796.put('\u2029', "P");
      field_25795.put(field_25789[6], field_25789[6]);
      field_25795.put("tag:yaml.org,2002:", "!!");
   }
}
