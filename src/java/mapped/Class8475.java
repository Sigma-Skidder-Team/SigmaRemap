package mapped;

import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.regex.Pattern;

public final class Class8475 implements Class8474 {
   private static final Map<Character, String> field36301 = new HashMap<Character, String>();
   public static final int field36302 = 1;
   public static final int field36303 = 10;
   private static final char[] field36304 = new char[]{' '};
   private static final Map<String, String> field36305 = new LinkedHashMap<String, String>();
   private final Writer field36306;
   private final Class9497<Class6415> field36307;
   private Class6415 field36308;
   private final Queue<Class5931> field36309;
   private Class5931 field36310;
   private final Class9497<Integer> field36311;
   private Integer field36312;
   private int field36313;
   private boolean field36314;
   private boolean field36315;
   private boolean field36316;
   private int field36317;
   private boolean field36318;
   private boolean field36319;
   private boolean field36320;
   private Boolean field36321;
   private Boolean field36322;
   private boolean field36323;
   private int field36324;
   private int field36325;
   private int field36326;
   private char[] field36327;
   private boolean field36328;
   private Map<String, String> field36329;
   private String field36330;
   private String field36331;
   private Class8058 field36332;
   private Class1857 field36333;
   private static final Pattern field36334 = Pattern.compile("^![-_\\w]*!$");
   private static final Pattern field36335 = Pattern.compile("^[-_\\w]*$");

   public Class8475(Writer var1, Class8324 var2) {
      this.field36306 = var1;
      this.field36307 = new Class9497<Class6415>(100);
      this.field36308 = new Class6430(this);
      this.field36309 = new ArrayBlockingQueue<Class5931>(100);
      this.field36310 = null;
      this.field36311 = new Class9497<Integer>(10);
      this.field36312 = null;
      this.field36313 = 0;
      this.field36315 = false;
      this.field36316 = false;
      this.field36317 = 0;
      this.field36318 = true;
      this.field36319 = true;
      this.field36320 = false;
      this.field36321 = var2.method29163();
      this.field36322 = var2.method29165();
      this.field36323 = var2.method29152();
      this.field36324 = 2;
      if (var2.method29157() > 1 && var2.method29157() < 10) {
         this.field36324 = var2.method29157();
      }

      this.field36325 = var2.method29159();
      this.field36326 = 80;
      if (var2.method29167() > this.field36324 * 2) {
         this.field36326 = var2.method29167();
      }

      this.field36327 = var2.method29170().method8752().toCharArray();
      this.field36328 = var2.method29169();
      this.field36329 = new LinkedHashMap<String, String>();
      this.field36330 = null;
      this.field36331 = null;
      this.field36332 = null;
      this.field36333 = null;
   }

   @Override
   public void method29888(Class5931 var1) throws IOException {
      this.field36309.add(var1);

      while (!this.method29889()) {
         this.field36310 = this.field36309.poll();
         this.field36308.method19539();
         this.field36310 = null;
      }
   }

   private boolean method29889() {
      if (!this.field36309.isEmpty()) {
         Class5931 var3 = this.field36309.peek();
         if (!(var3 instanceof Class5938)) {
            if (!(var3 instanceof Class5927)) {
               return !(var3 instanceof Class5939) ? false : this.method29890(3);
            } else {
               return this.method29890(2);
            }
         } else {
            return this.method29890(1);
         }
      } else {
         return true;
      }
   }

   private boolean method29890(int var1) {
      int var4 = 0;
      Iterator var5 = this.field36309.iterator();
      var5.next();

      while (var5.hasNext()) {
         Class5931 var6 = (Class5931)var5.next();
         if (var6 instanceof Class5938 || var6 instanceof Class5926) {
            var4++;
         } else if (var6 instanceof Class5932 || var6 instanceof Class5934) {
            var4--;
         } else if (var6 instanceof Class5937) {
            var4 = -1;
         }

         if (var4 < 0) {
            return false;
         }
      }

      return this.field36309.size() < var1 + 1;
   }

   private void method29891(boolean var1, boolean var2) {
      this.field36311.method36683(this.field36312);
      if (this.field36312 != null) {
         if (!var2) {
            this.field36312 = this.field36312 + this.field36324;
         }
      } else if (!var1) {
         this.field36312 = 0;
      } else {
         this.field36312 = this.field36324;
      }
   }

   private void method29892(boolean var1, boolean var2, boolean var3) throws IOException {
      this.field36314 = var1;
      this.field36315 = var2;
      this.field36316 = var3;
      if (!(this.field36310 instanceof Class5929)) {
         if (!(this.field36310 instanceof Class5930) && !(this.field36310 instanceof Class5926)) {
            throw new Class2487("expected NodeEvent, but got " + this.field36310);
         }

         this.method29903("&");
         this.method29904();
         if (!(this.field36310 instanceof Class5930)) {
            if (!(this.field36310 instanceof Class5927)) {
               if (this.field36313 == 0 && !this.field36321 && !((Class5939)this.field36310).method18430() && !this.method29900()) {
                  this.method29898();
               } else {
                  this.method29896();
               }
            } else if (this.field36313 == 0 && !this.field36321 && !((Class5927)this.field36310).method18430() && !this.method29899()) {
               this.method29897();
            } else {
               this.method29895();
            }
         } else {
            this.method29894();
         }
      } else {
         this.method29893();
      }
   }

   private void method29893() throws IOException {
      if (((Class5928)this.field36310).method18432() != null) {
         this.method29903("*");
         this.field36308 = this.field36307.method36684();
      } else {
         throw new Class2487("anchor is not specified for alias");
      }
   }

   private void method29894() throws IOException {
      this.method29891(true, false);
      this.method29906();
      this.field36312 = this.field36311.method36684();
      this.field36308 = this.field36307.method36684();
   }

   private void method29895() throws IOException {
      this.method29916("[", true, true, false);
      this.field36313++;
      this.method29891(true, false);
      if (this.field36322) {
         this.method29917();
      }

      this.field36308 = new Class6428(this);
   }

   private void method29896() throws IOException {
      this.method29916("{", true, true, false);
      this.field36313++;
      this.method29891(true, false);
      if (this.field36322) {
         this.method29917();
      }

      this.field36308 = new Class6416(this);
   }

   private void method29897() throws IOException {
      boolean var3 = this.field36315 && !this.field36319;
      this.method29891(false, var3);
      this.field36308 = new Class6418(this);
   }

   private void method29898() throws IOException {
      this.method29891(false, false);
      this.field36308 = new Class6419(this);
   }

   private boolean method29899() {
      return this.field36310 instanceof Class5927 && !this.field36309.isEmpty() && this.field36309.peek() instanceof Class5935;
   }

   private boolean method29900() {
      return this.field36310 instanceof Class5939 && !this.field36309.isEmpty() && this.field36309.peek() instanceof Class5936;
   }

   private boolean method29901() {
      if (this.field36310 instanceof Class5938 && !this.field36309.isEmpty()) {
         Class5931 var3 = this.field36309.peek();
         if (!(var3 instanceof Class5930)) {
            return false;
         } else {
            Class5930 var4 = (Class5930)var3;
            return var4.method18432() == null && var4.method18433() == null && var4.method18436() != null && var4.method18435().length() == 0;
         }
      } else {
         return false;
      }
   }

   private boolean method29902() {
      int var3 = 0;
      if (this.field36310 instanceof Class5928 && ((Class5928)this.field36310).method18432() != null) {
         if (this.field36330 == null) {
            this.field36330 = method29911(((Class5928)this.field36310).method18432());
         }

         var3 += this.field36330.length();
      }

      String var4 = null;
      if (!(this.field36310 instanceof Class5930)) {
         if (this.field36310 instanceof Class5926) {
            var4 = ((Class5926)this.field36310).method18426();
         }
      } else {
         var4 = ((Class5930)this.field36310).method18433();
      }

      if (var4 != null) {
         if (this.field36331 == null) {
            this.field36331 = this.method29910(var4);
         }

         var3 += this.field36331.length();
      }

      if (this.field36310 instanceof Class5930) {
         if (this.field36332 == null) {
            this.field36332 = this.method29912(((Class5930)this.field36310).method18435());
         }

         var3 += this.field36332.field34594.length();
      }

      return var3 < 128
         && (
            this.field36310 instanceof Class5929
               || this.field36310 instanceof Class5930 && !this.field36332.field34595 && !this.field36332.field34596
               || this.method29899()
               || this.method29900()
         );
   }

   private void method29903(String var1) throws IOException {
      Class5928 var4 = (Class5928)this.field36310;
      if (var4.method18432() != null) {
         if (this.field36330 == null) {
            this.field36330 = method29911(var4.method18432());
         }

         this.method29916(var1 + this.field36330, true, false, false);
         this.field36330 = null;
      } else {
         this.field36330 = null;
      }
   }

   private void method29904() throws IOException {
      Object var3 = null;
      if (!(this.field36310 instanceof Class5930)) {
         Class5926 var6 = (Class5926)this.field36310;
         var3 = var6.method18426();
         if ((!this.field36321 || var3 == null) && var6.method18427()) {
            this.field36331 = null;
            return;
         }
      } else {
         Class5930 var4 = (Class5930)this.field36310;
         var3 = var4.method18433();
         if (this.field36333 == null) {
            this.field36333 = this.method29905();
         }

         if ((!this.field36321 || var3 == null)
            && (this.field36333 == null && var4.method18436().method26091() || this.field36333 != null && var4.method18436().method26092())) {
            this.field36331 = null;
            return;
         }

         if (var4.method18436().method26091() && var3 == null) {
            var3 = "!";
            this.field36331 = null;
         }
      }

      if (var3 != null) {
         if (this.field36331 == null) {
            this.field36331 = this.method29910((String)var3);
         }

         this.method29916(this.field36331, true, false, false);
         this.field36331 = null;
      } else {
         throw new Class2487("tag is not specified");
      }
   }

   private Class1857 method29905() {
      Class5930 var3 = (Class5930)this.field36310;
      if (this.field36332 == null) {
         this.field36332 = this.method29912(var3.method18435());
      }

      if ((var3.method18437() || var3.method18434() != Class1857.field9894) && !this.field36321) {
         if (!var3.method18437()
            || !var3.method18436().method26091()
            || this.field36316 && (this.field36332.field34595 || this.field36332.field34596)
            || (this.field36313 == 0 || !this.field36332.field34597) && (this.field36313 != 0 || !this.field36332.field34598)) {
            if (!var3.method18437()
               && (var3.method18434() == Class1857.field9896 || var3.method18434() == Class1857.field9897)
               && this.field36313 == 0
               && !this.field36316
               && this.field36332.field34600) {
               return var3.method18434();
            } else {
               return (var3.method18437() || var3.method18434() == Class1857.field9895)
                     && this.field36332.field34599
                     && (!this.field36316 || !this.field36332.field34596)
                  ? Class1857.field9895
                  : Class1857.field9894;
            }
         } else {
            return null;
         }
      } else {
         return Class1857.field9894;
      }
   }

   private void method29906() throws IOException {
      Class5930 var3 = (Class5930)this.field36310;
      if (this.field36332 == null) {
         this.field36332 = this.method29912(var3.method18435());
      }

      if (this.field36333 == null) {
         this.field36333 = this.method29905();
      }

      boolean var4 = !this.field36316 && this.field36328;
      if (this.field36333 == null) {
         this.method29927(this.field36332.field34594, var4);
      } else {
         switch (Class9273.field42657[this.field36333.ordinal()]) {
            case 1:
               this.method29923(this.field36332.field34594, var4);
               break;
            case 2:
               this.method29922(this.field36332.field34594, var4);
               break;
            case 3:
               this.method29925(this.field36332.field34594, var4);
               break;
            case 4:
               this.method29926(this.field36332.field34594);
               break;
            default:
               throw new Class2478("Unexpected style: " + this.field36333);
         }
      }

      this.field36332 = null;
      this.field36333 = null;
   }

   private String method29907(Class2148 var1) {
      if (var1.method8852() == 1) {
         return var1.method8854();
      } else {
         throw new Class2487("unsupported YAML version: " + var1);
      }
   }

   private String method29908(String var1) {
      if (var1.length() != 0) {
         if (var1.charAt(0) != '!' || var1.charAt(var1.length() - 1) != '!') {
            throw new Class2487("tag handle must start and end with '!': " + var1);
         } else if (!"!".equals(var1) && !field36334.matcher(var1).matches()) {
            throw new Class2487("invalid character in the tag handle: " + var1);
         } else {
            return var1;
         }
      } else {
         throw new Class2487("tag handle must not be empty");
      }
   }

   private String method29909(String var1) {
      if (var1.length() == 0) {
         throw new Class2487("tag prefix must not be empty");
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

   private String method29910(String var1) {
      if (var1.length() == 0) {
         throw new Class2487("tag must not be empty");
      } else if ("!".equals(var1)) {
         return var1;
      } else {
         String var4 = null;
         String var5 = var1;

         for (String var7 : this.field36329.keySet()) {
            if (var1.startsWith(var7) && ("!".equals(var7) || var7.length() < var1.length())) {
               var4 = var7;
            }
         }

         if (var4 != null) {
            var5 = var1.substring(var4.length());
            var4 = this.field36329.get(var4);
         }

         int var8 = var5.length();
         String var9 = var8 <= 0 ? "" : var5.substring(0, var8);
         return var4 == null ? "!<" + var9 + ">" : var4 + var9;
      }
   }

   public static String method29911(String var0) {
      if (var0.length() != 0) {
         if (field36335.matcher(var0).matches()) {
            return var0;
         } else {
            throw new Class2487("invalid character in the anchor: " + var0);
         }
      } else {
         throw new Class2487("anchor must not be empty");
      }
   }

   private Class8058 method29912(String var1) {
      if (var1.length() == 0) {
         return new Class8058(var1, true, false, false, true, true, false);
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
         boolean var15 = var1.length() == 1 || Class8852.field40003.method32204(var1.codePointAt(1));
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

            boolean var20 = Class8852.field39999.method32204(var19);
            if (var20) {
               var6 = true;
            }

            if (var19 != 10 && (32 > var19 || var19 > 126)) {
               if (var19 == 133 || var19 >= 160 && var19 <= 55295 || var19 >= 57344 && var19 <= 65533 || var19 >= 65536 && var19 <= 1114111) {
                  if (!this.field36323) {
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
            var14 = Class8852.field40004.method32204(var19) || var20;
            var15 = true;
            if (var18 + 1 < var1.length()) {
               int var21 = var18 + Character.charCount(var1.codePointAt(var18));
               if (var21 < var1.length()) {
                  var15 = Class8852.field40004.method32204(var1.codePointAt(var21)) || var20;
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

         return new Class8058(var1, false, var6, var23, var24, var25, var22);
      }
   }

   public void method29913() throws IOException {
      this.field36306.flush();
   }

   public void method29914() {
   }

   public void method29915() throws IOException {
      this.method29913();
   }

   public void method29916(String var1, boolean var2, boolean var3, boolean var4) throws IOException {
      if (!this.field36318 && var2) {
         this.field36317++;
         this.field36306.write(field36304);
      }

      this.field36318 = var3;
      this.field36319 = this.field36319 && var4;
      this.field36317 = this.field36317 + var1.length();
      this.field36320 = false;
      this.field36306.write(var1);
   }

   public void method29917() throws IOException {
      int var3;
      if (this.field36312 == null) {
         var3 = 0;
      } else {
         var3 = this.field36312;
      }

      if (!this.field36319 || this.field36317 > var3 || this.field36317 == var3 && !this.field36318) {
         this.method29919(null);
      }

      this.method29918(var3 - this.field36317);
   }

   private void method29918(int var1) throws IOException {
      if (var1 > 0) {
         this.field36318 = true;
         char[] var4 = new char[var1];

         for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5] = ' ';
         }

         this.field36317 += var1;
         this.field36306.write(var4);
      }
   }

   private void method29919(String var1) throws IOException {
      this.field36318 = true;
      this.field36319 = true;
      this.field36317 = 0;
      if (var1 != null) {
         this.field36306.write(var1);
      } else {
         this.field36306.write(this.field36327);
      }
   }

   public void method29920(String var1) throws IOException {
      this.field36306.write("%YAML ");
      this.field36306.write(var1);
      this.method29919(null);
   }

   public void method29921(String var1, String var2) throws IOException {
      this.field36306.write("%TAG ");
      this.field36306.write(var1);
      this.field36306.write(field36304);
      this.field36306.write(var2);
      this.method29919(null);
   }

   private void method29922(String var1, boolean var2) throws IOException {
      this.method29916("'", true, false, false);
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
               if (Class8852.field39999.method32206(var9, "\u0000 '") && var7 < var8) {
                  int var16 = var8 - var7;
                  this.field36317 += var16;
                  this.field36306.write(var1, var7, var16);
                  var7 = var8;
               }
            } else if (var9 == 0 || Class8852.field39999.method32205(var9)) {
               if (var1.charAt(var7) == '\n') {
                  this.method29919(null);
               }

               String var15 = var1.substring(var7, var8);

               for (char var14 : var15.toCharArray()) {
                  if (var14 != '\n') {
                     this.method29919(String.valueOf(var14));
                  } else {
                     this.method29919(null);
                  }
               }

               this.method29917();
               var7 = var8;
            }
         } else if (var9 == 0 || var9 != ' ') {
            if (var7 + 1 == var8 && this.field36317 > this.field36326 && var2 && var7 != 0 && var8 != var1.length()) {
               this.method29917();
            } else {
               int var10 = var8 - var7;
               this.field36317 += var10;
               this.field36306.write(var1, var7, var10);
            }

            var7 = var8;
         }

         if (var9 == '\'') {
            this.field36317 += 2;
            this.field36306.write("''");
            var7 = var8 + 1;
         }

         if (var9 != 0) {
            var5 = var9 == ' ';
            var6 = Class8852.field39999.method32204(var9);
         }
      }

      this.method29916("'", false, false, false);
   }

   private void method29923(String var1, boolean var2) throws IOException {
      this.method29916("\"", true, false, false);
      int var5 = 0;

      for (int var6 = 0; var6 <= var1.length(); var6++) {
         Character var7 = null;
         if (var6 < var1.length()) {
            var7 = var1.charAt(var6);
         }

         if (var7 == null || "\"\\\u0085\u2028\u2029\ufeff".indexOf(var7) != -1 || ' ' > var7 || var7 > '~') {
            if (var5 < var6) {
               int var8 = var6 - var5;
               this.field36317 += var8;
               this.field36306.write(var1, var5, var8);
               var5 = var6;
            }

            if (var7 != null) {
               String var11;
               if (!field36301.containsKey(var7)) {
                  if (this.field36323 && Class9583.method37198(var7)) {
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
                  var11 = "\\" + field36301.get(var7);
               }

               this.field36317 = this.field36317 + var11.length();
               this.field36306.write(var11);
               var5 = var6 + 1;
            }
         }

         if (0 < var6 && var6 < var1.length() - 1 && (var7 == ' ' || var5 >= var6) && this.field36317 + (var6 - var5) > this.field36326 && var2) {
            String var12;
            if (var5 < var6) {
               var12 = var1.substring(var5, var6) + "\\";
            } else {
               var12 = "\\";
            }

            if (var5 < var6) {
               var5 = var6;
            }

            this.field36317 = this.field36317 + var12.length();
            this.field36306.write(var12);
            this.method29917();
            this.field36318 = false;
            this.field36319 = false;
            if (var1.charAt(var5) == ' ') {
               var12 = "\\";
               this.field36317 = this.field36317 + var12.length();
               this.field36306.write(var12);
            }
         }
      }

      this.method29916("\"", false, false, false);
   }

   private String method29924(String var1) {
      StringBuilder var4 = new StringBuilder();
      if (Class8852.field39999.method32206(var1.charAt(0), " ")) {
         var4.append(this.field36324);
      }

      char var5 = var1.charAt(var1.length() - 1);
      if (!Class8852.field39999.method32205(var5)) {
         if (var1.length() == 1 || Class8852.field39999.method32204(var1.charAt(var1.length() - 2))) {
            var4.append("+");
         }
      } else {
         var4.append("-");
      }

      return var4.toString();
   }

   public void method29925(String var1, boolean var2) throws IOException {
      String var5 = this.method29924(var1);
      this.method29916(">" + var5, true, false, false);
      if (var5.length() > 0 && var5.charAt(var5.length() - 1) == '+') {
         this.field36320 = true;
      }

      this.method29919(null);
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
               if (Class8852.field39999.method32206(var11, "\u0000 ")) {
                  int var18 = var10 - var9;
                  this.field36317 += var18;
                  this.field36306.write(var1, var9, var18);
                  if (var11 == 0) {
                     this.method29919(null);
                  }

                  var9 = var10;
               }
            } else if (var11 != ' ') {
               if (var9 + 1 == var10 && this.field36317 > this.field36326 && var2) {
                  this.method29917();
               } else {
                  int var17 = var10 - var9;
                  this.field36317 += var17;
                  this.field36306.write(var1, var9, var17);
               }

               var9 = var10;
            }
         } else if (var11 == 0 || Class8852.field39999.method32205(var11)) {
            if (!var6 && var11 != 0 && var11 != ' ' && var1.charAt(var9) == '\n') {
               this.method29919(null);
            }

            var6 = var11 == ' ';
            String var12 = var1.substring(var9, var10);

            for (char var16 : var12.toCharArray()) {
               if (var16 != '\n') {
                  this.method29919(String.valueOf(var16));
               } else {
                  this.method29919(null);
               }
            }

            if (var11 != 0) {
               this.method29917();
            }

            var9 = var10;
         }

         if (var11 != 0) {
            var8 = Class8852.field39999.method32204(var11);
            var7 = var11 == ' ';
         }
      }
   }

   public void method29926(String var1) throws IOException {
      String var4 = this.method29924(var1);
      this.method29916("|" + var4, true, false, false);
      if (var4.length() > 0 && var4.charAt(var4.length() - 1) == '+') {
         this.field36320 = true;
      }

      this.method29919(null);
      boolean var5 = true;
      int var6 = 0;

      for (int var7 = 0; var7 <= var1.length(); var7++) {
         char var8 = 0;
         if (var7 < var1.length()) {
            var8 = var1.charAt(var7);
         }

         if (!var5) {
            if (var8 == 0 || Class8852.field39999.method32204(var8)) {
               this.field36306.write(var1, var6, var7 - var6);
               if (var8 == 0) {
                  this.method29919(null);
               }

               var6 = var7;
            }
         } else if (var8 == 0 || Class8852.field39999.method32205(var8)) {
            String var9 = var1.substring(var6, var7);

            for (char var13 : var9.toCharArray()) {
               if (var13 != '\n') {
                  this.method29919(String.valueOf(var13));
               } else {
                  this.method29919(null);
               }
            }

            if (var8 != 0) {
               this.method29917();
            }

            var6 = var7;
         }

         if (var8 != 0) {
            var5 = Class8852.field39999.method32204(var8);
         }
      }
   }

   public void method29927(String var1, boolean var2) throws IOException {
      if (this.field36314) {
         this.field36320 = true;
      }

      if (var1.length() != 0) {
         if (!this.field36318) {
            this.field36317++;
            this.field36306.write(field36304);
         }

         this.field36318 = false;
         this.field36319 = false;
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
                  if (Class8852.field39999.method32206(var9, "\u0000 ")) {
                     int var16 = var8 - var7;
                     this.field36317 += var16;
                     this.field36306.write(var1, var7, var16);
                     var7 = var8;
                  }
               } else if (Class8852.field39999.method32205(var9)) {
                  if (var1.charAt(var7) == '\n') {
                     this.method29919(null);
                  }

                  String var15 = var1.substring(var7, var8);

                  for (char var14 : var15.toCharArray()) {
                     if (var14 != '\n') {
                        this.method29919(String.valueOf(var14));
                     } else {
                        this.method29919(null);
                     }
                  }

                  this.method29917();
                  this.field36318 = false;
                  this.field36319 = false;
                  var7 = var8;
               }
            } else if (var9 != ' ') {
               if (var7 + 1 == var8 && this.field36317 > this.field36326 && var2) {
                  this.method29917();
                  this.field36318 = false;
                  this.field36319 = false;
               } else {
                  int var10 = var8 - var7;
                  this.field36317 += var10;
                  this.field36306.write(var1, var7, var10);
               }

               var7 = var8;
            }

            if (var9 != 0) {
               var5 = var9 == ' ';
               var6 = Class8852.field39999.method32204(var9);
            }
         }
      }
   }

   // $VF: synthetic method
   public static Class5931 method29928(Class8475 var0) {
      return var0.field36310;
   }

   // $VF: synthetic method
   public static Class6415 method29929(Class8475 var0, Class6415 var1) {
      return var0.field36308 = var1;
   }

   // $VF: synthetic method
   public static boolean method29930(Class8475 var0) {
      return var0.field36320;
   }

   // $VF: synthetic method
   public static String method29931(Class8475 var0, Class2148 var1) {
      return var0.method29907(var1);
   }

   // $VF: synthetic method
   public static Map method29932(Class8475 var0, Map var1) {
      return var0.field36329 = var1;
   }

   // $VF: synthetic method
   public static Map method29933() {
      return field36305;
   }

   // $VF: synthetic method
   public static Map method29934(Class8475 var0) {
      return var0.field36329;
   }

   // $VF: synthetic method
   public static String method29935(Class8475 var0, String var1) {
      return var0.method29908(var1);
   }

   // $VF: synthetic method
   public static String method29936(Class8475 var0, String var1) {
      return var0.method29909(var1);
   }

   // $VF: synthetic method
   public static Boolean method29937(Class8475 var0) {
      return var0.field36321;
   }

   // $VF: synthetic method
   public static boolean method29938(Class8475 var0) {
      return var0.method29901();
   }

   // $VF: synthetic method
   public static Class9497 method29939(Class8475 var0) {
      return var0.field36307;
   }

   // $VF: synthetic method
   public static void method29940(Class8475 var0, boolean var1, boolean var2, boolean var3) throws IOException {
      var0.method29892(var1, var2, var3);
   }

   // $VF: synthetic method
   public static Integer method29941(Class8475 var0, Integer var1) {
      return var0.field36312 = var1;
   }

   // $VF: synthetic method
   public static Class9497 method29942(Class8475 var0) {
      return var0.field36311;
   }

   // $VF: synthetic method
   public static int method29943(Class8475 var0) {
      return var0.field36313--;
   }

   // $VF: synthetic method
   public static int method29944(Class8475 var0) {
      return var0.field36317;
   }

   // $VF: synthetic method
   public static int method29945(Class8475 var0) {
      return var0.field36326;
   }

   // $VF: synthetic method
   public static boolean method29946(Class8475 var0) {
      return var0.field36328;
   }

   // $VF: synthetic method
   public static Boolean method29947(Class8475 var0) {
      return var0.field36322;
   }

   // $VF: synthetic method
   public static boolean method29948(Class8475 var0) {
      return var0.method29902();
   }

   // $VF: synthetic method
   public static int method29949(Class8475 var0) {
      return var0.field36325;
   }

   // $VF: synthetic method
   public static void method29950(Class8475 var0, int var1) throws IOException {
      var0.method29918(var1);
   }

   static {
      field36301.put('\u0000', "0");
      field36301.put('\u0007', "a");
      field36301.put('\b', "b");
      field36301.put('\t', "t");
      field36301.put('\n', "n");
      field36301.put('\u000b', "v");
      field36301.put('\f', "f");
      field36301.put('\r', "r");
      field36301.put('\u001b', "e");
      field36301.put('"',  "\"");
      field36301.put('\\', "\\");
      field36301.put('\u0085', "N");
      field36301.put(' ', "_");
      field36301.put('\u2028', "L");
      field36301.put('\u2029', "P");
      field36301.put('!', "!");
      field36305.put("tag:yaml.org,2002:", "!!");
   }
}
