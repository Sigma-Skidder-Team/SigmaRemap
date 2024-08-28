package mapped;

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

public final class Class7158 implements Class7157 {
   private static final Pattern field30746 = Pattern.compile("[^0-9A-Fa-f]");
   public static final Map<Character, String> field30747 = new HashMap<Character, String>();
   public static final Map<Character, Integer> field30748 = new HashMap<Character, Integer>();
   private final Class9583 field30749;
   private boolean field30750 = false;
   private int field30751 = 0;
   private List<Class6553> field30752;
   private int field30753 = 0;
   private int field30754 = -1;
   private Class9497<Integer> field30755;
   private boolean field30756 = true;
   private Map<Integer, Class9077> field30757;

   public Class7158(Class9583 var1) {
      this.field30749 = var1;
      this.field30752 = new ArrayList<Class6553>(100);
      this.field30755 = new Class9497<Integer>(10);
      this.field30757 = new LinkedHashMap<Integer, Class9077>();
      this.method22340();
   }

   @Override
   public boolean method22329(Class2228... var1) {
      while (this.method22332()) {
         this.method22333();
      }

      if (!this.field30752.isEmpty()) {
         if (var1.length == 0) {
            return true;
         }

         Class2228 var4 = this.field30752.get(0).method19894();

         for (int var5 = 0; var5 < var1.length; var5++) {
            if (var4 == var1[var5]) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public Class6553 method22330() {
      while (this.method22332()) {
         this.method22333();
      }

      return this.field30752.get(0);
   }

   @Override
   public Class6553 method22331() {
      this.field30753++;
      return this.field30752.remove(0);
   }

   private boolean method22332() {
      if (!this.field30750) {
         if (!this.field30752.isEmpty()) {
            this.method22335();
            return this.method22334() == this.field30753;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private void method22333() {
      this.method22373();
      this.method22335();
      this.method22338(this.field30749.method37209());
      int var3 = this.field30749.method37202();
      switch (var3) {
         case 0:
            this.method22341();
            return;
         case 33:
            this.method22358();
            return;
         case 34:
            this.method22363();
            return;
         case 37:
            if (this.method22366()) {
               this.method22342();
               return;
            }
            break;
         case 38:
            this.method22357();
            return;
         case 39:
            this.method22362();
            return;
         case 42:
            this.method22356();
            return;
         case 44:
            this.method22352();
            return;
         case 45:
            if (this.method22367()) {
               this.method22343();
               return;
            }

            if (this.method22369()) {
               this.method22353();
               return;
            }
            break;
         case 46:
            if (this.method22368()) {
               this.method22344();
               return;
            }
            break;
         case 58:
            if (this.method22371()) {
               this.method22355();
               return;
            }
            break;
         case 62:
            if (this.field30751 == 0) {
               this.method22360();
               return;
            }
            break;
         case 63:
            if (this.method22370()) {
               this.method22354();
               return;
            }
            break;
         case 91:
            this.method22346();
            return;
         case 93:
            this.method22349();
            return;
         case 123:
            this.method22347();
            return;
         case 124:
            if (this.field30751 == 0) {
               this.method22359();
               return;
            }
            break;
         case 125:
            this.method22350();
            return;
      }

      if (this.method22372()) {
         this.method22365();
      } else {
         String var4 = String.valueOf(Character.toChars(var3));

         for (Character var6 : field30747.keySet()) {
            String var7 = field30747.get(var6);
            if (var7.equals(var4)) {
               var4 = "\\" + var6;
               break;
            }
         }

         if (var3 == 9) {
            var4 = var4 + "(TAB)";
         }

         String var8 = String.format("found character '%s' that cannot start any token. (Do not use %s for indentation)", var4, var4);
         throw new Class2481("while scanning for the next token", null, var8, this.field30749.method37199());
      }
   }

   private int method22334() {
      return this.field30757.isEmpty() ? -1 : this.field30757.values().iterator().next().method33818();
   }

   private void method22335() {
      if (!this.field30757.isEmpty()) {
         Iterator var3 = this.field30757.values().iterator();

         while (var3.hasNext()) {
            Class9077 var4 = (Class9077)var3.next();
            if (var4.method33822() != this.field30749.method37211() || this.field30749.method37210() - var4.method33821() > 1024) {
               if (var4.method33823()) {
                  throw new Class2481("while scanning a simple key", var4.method33820(), "could not find expected ':'", this.field30749.method37199());
               }

               var3.remove();
            }
         }
      }
   }

   private void method22336() {
      boolean var3 = this.field30751 == 0 && this.field30754 == this.field30749.method37209();
      if (!this.field30756 && var3) {
         throw new Class2478("A simple key is required only if it is the first token in the current line");
      } else {
         if (this.field30756) {
            this.method22337();
            int var4 = this.field30753 + this.field30752.size();
            Class9077 var5 = new Class9077(
               var4, var3, this.field30749.method37210(), this.field30749.method37211(), this.field30749.method37209(), this.field30749.method37199()
            );
            this.field30757.put(this.field30751, var5);
         }
      }
   }

   private void method22337() {
      Class9077 var3 = this.field30757.remove(this.field30751);
      if (var3 != null && var3.method33823()) {
         throw new Class2481("while scanning a simple key", var3.method33820(), "could not find expected ':'", this.field30749.method37199());
      }
   }

   private void method22338(int var1) {
      if (this.field30751 == 0) {
         while (this.field30754 > var1) {
            Class2512 var4 = this.field30749.method37199();
            this.field30754 = this.field30755.method36684();
            this.field30752.add(new Class6566(var4, var4));
         }
      }
   }

   private boolean method22339(int var1) {
      if (this.field30754 >= var1) {
         return false;
      } else {
         this.field30755.method36683(this.field30754);
         this.field30754 = var1;
         return true;
      }
   }

   private void method22340() {
      Class2512 var3 = this.field30749.method37199();
      Class6567 var4 = new Class6567(var3, var3);
      this.field30752.add(var4);
   }

   private void method22341() {
      this.method22338(-1);
      this.method22337();
      this.field30756 = false;
      this.field30757.clear();
      Class2512 var3 = this.field30749.method37199();
      Class6569 var4 = new Class6569(var3, var3);
      this.field30752.add(var4);
      this.field30750 = true;
   }

   private void method22342() {
      this.method22338(-1);
      this.method22337();
      this.field30756 = false;
      Class6553 var3 = this.method22374();
      this.field30752.add(var3);
   }

   private void method22343() {
      this.method22345(true);
   }

   private void method22344() {
      this.method22345(false);
   }

   private void method22345(boolean var1) {
      this.method22338(-1);
      this.method22337();
      this.field30756 = false;
      Class2512 var4 = this.field30749.method37199();
      this.field30749.method37201(3);
      Class2512 var5 = this.field30749.method37199();
      Object var6;
      if (!var1) {
         var6 = new Class6561(var4, var5);
      } else {
         var6 = new Class6552(var4, var5);
      }

      this.field30752.add((Class6553)var6);
   }

   private void method22346() {
      this.method22348(false);
   }

   private void method22347() {
      this.method22348(true);
   }

   private void method22348(boolean var1) {
      this.method22336();
      this.field30751++;
      this.field30756 = true;
      Class2512 var4 = this.field30749.method37199();
      this.field30749.method37201(1);
      Class2512 var5 = this.field30749.method37199();
      Object var6;
      if (!var1) {
         var6 = new Class6556(var4, var5);
      } else {
         var6 = new Class6555(var4, var5);
      }

      this.field30752.add((Class6553)var6);
   }

   private void method22349() {
      this.method22351(false);
   }

   private void method22350() {
      this.method22351(true);
   }

   private void method22351(boolean var1) {
      this.method22337();
      this.field30751--;
      this.field30756 = false;
      Class2512 var4 = this.field30749.method37199();
      this.field30749.method37200();
      Class2512 var5 = this.field30749.method37199();
      Object var6;
      if (!var1) {
         var6 = new Class6558(var4, var5);
      } else {
         var6 = new Class6559(var4, var5);
      }

      this.field30752.add((Class6553)var6);
   }

   private void method22352() {
      this.field30756 = true;
      this.method22337();
      Class2512 var3 = this.field30749.method37199();
      this.field30749.method37200();
      Class2512 var4 = this.field30749.method37199();
      Class6554 var5 = new Class6554(var3, var4);
      this.field30752.add(var5);
   }

   private void method22353() {
      if (this.field30751 == 0) {
         if (!this.field30756) {
            throw new Class2481(null, null, "sequence entries are not allowed here", this.field30749.method37199());
         }

         if (this.method22339(this.field30749.method37209())) {
            Class2512 var3 = this.field30749.method37199();
            this.field30752.add(new Class6562(var3, var3));
         }
      }

      this.field30756 = true;
      this.method22337();
      Class2512 var6 = this.field30749.method37199();
      this.field30749.method37200();
      Class2512 var4 = this.field30749.method37199();
      Class6560 var5 = new Class6560(var6, var4);
      this.field30752.add(var5);
   }

   private void method22354() {
      if (this.field30751 == 0) {
         if (!this.field30756) {
            throw new Class2481(null, null, "mapping keys are not allowed here", this.field30749.method37199());
         }

         if (this.method22339(this.field30749.method37209())) {
            Class2512 var3 = this.field30749.method37199();
            this.field30752.add(new Class6573(var3, var3));
         }
      }

      this.field30756 = this.field30751 == 0;
      this.method22337();
      Class2512 var6 = this.field30749.method37199();
      this.field30749.method37200();
      Class2512 var4 = this.field30749.method37199();
      Class6572 var5 = new Class6572(var6, var4);
      this.field30752.add(var5);
   }

   private void method22355() {
      Class9077 var3 = this.field30757.remove(this.field30751);
      if (var3 == null) {
         if (this.field30751 == 0 && !this.field30756) {
            throw new Class2481(null, null, "mapping values are not allowed here", this.field30749.method37199());
         }

         if (this.field30751 == 0 && this.method22339(this.field30749.method37209())) {
            Class2512 var4 = this.field30749.method37199();
            this.field30752.add(new Class6573(var4, var4));
         }

         this.field30756 = this.field30751 == 0;
         this.method22337();
      } else {
         this.field30752.add(var3.method33818() - this.field30753, new Class6572(var3.method33820(), var3.method33820()));
         if (this.field30751 == 0 && this.method22339(var3.method33819())) {
            this.field30752.add(var3.method33818() - this.field30753, new Class6573(var3.method33820(), var3.method33820()));
         }

         this.field30756 = false;
      }

      Class2512 var7 = this.field30749.method37199();
      this.field30749.method37200();
      Class2512 var5 = this.field30749.method37199();
      Class6574 var6 = new Class6574(var7, var5);
      this.field30752.add(var6);
   }

   private void method22356() {
      this.method22336();
      this.field30756 = false;
      Class6553 var3 = this.method22382(false);
      this.field30752.add(var3);
   }

   private void method22357() {
      this.method22336();
      this.field30756 = false;
      Class6553 var3 = this.method22382(true);
      this.field30752.add(var3);
   }

   private void method22358() {
      this.method22336();
      this.field30756 = false;
      Class6553 var3 = this.method22383();
      this.field30752.add(var3);
   }

   private void method22359() {
      this.method22361('|');
   }

   private void method22360() {
      this.method22361('>');
   }

   private void method22361(char var1) {
      this.field30756 = true;
      this.method22337();
      Class6553 var4 = this.method22384(var1);
      this.field30752.add(var4);
   }

   private void method22362() {
      this.method22364('\'');
   }

   private void method22363() {
      this.method22364('"');
   }

   private void method22364(char var1) {
      this.method22336();
      this.field30756 = false;
      Class6553 var4 = this.method22389(var1);
      this.field30752.add(var4);
   }

   private void method22365() {
      this.method22336();
      this.field30756 = false;
      Class6553 var3 = this.method22393();
      this.field30752.add(var3);
   }

   private boolean method22366() {
      return this.field30749.method37209() == 0;
   }

   private boolean method22367() {
      return this.field30749.method37209() == 0
         && "---".equals(this.field30749.method37204(3))
         && Class8852.field40003.method32204(this.field30749.method37203(3));
   }

   private boolean method22368() {
      return this.field30749.method37209() == 0
         && "...".equals(this.field30749.method37204(3))
         && Class8852.field40003.method32204(this.field30749.method37203(3));
   }

   private boolean method22369() {
      return Class8852.field40003.method32204(this.field30749.method37203(1));
   }

   private boolean method22370() {
      return this.field30751 == 0 ? Class8852.field40003.method32204(this.field30749.method37203(1)) : true;
   }

   private boolean method22371() {
      return this.field30751 == 0 ? Class8852.field40003.method32204(this.field30749.method37203(1)) : true;
   }

   private boolean method22372() {
      int var3 = this.field30749.method37202();
      return Class8852.field40003.method32207(var3, "-?:,[]{}#&*!|>'\"%@`")
         || Class8852.field40003.method32205(this.field30749.method37203(1)) && (var3 == 45 || this.field30751 == 0 && "?:".indexOf(var3) != -1);
   }

   private void method22373() {
      if (this.field30749.method37210() == 0 && this.field30749.method37202() == 65279) {
         this.field30749.method37200();
      }

      boolean var3 = false;

      while (!var3) {
         int var4 = 0;

         while (this.field30749.method37203(var4) == 32) {
            var4++;
         }

         if (var4 > 0) {
            this.field30749.method37201(var4);
         }

         if (this.field30749.method37202() == 35) {
            var4 = 0;

            while (Class8852.field40001.method32205(this.field30749.method37203(var4))) {
               var4++;
            }

            if (var4 > 0) {
               this.field30749.method37201(var4);
            }
         }

         if (this.method22398().length() == 0) {
            var3 = true;
         } else if (this.field30751 == 0) {
            this.field30756 = true;
         }
      }
   }

   private Class6553 method22374() {
      Class2512 var3 = this.field30749.method37199();
      this.field30749.method37200();
      String var4 = this.method22375(var3);
      List var5 = null;
      Class2512 var6;
      if (!"YAML".equals(var4)) {
         if (!"TAG".equals(var4)) {
            var6 = this.field30749.method37199();
            int var7 = 0;

            while (Class8852.field40001.method32205(this.field30749.method37203(var7))) {
               var7++;
            }

            if (var7 > 0) {
               this.field30749.method37201(var7);
            }
         } else {
            var5 = this.method22378(var3);
            var6 = this.field30749.method37199();
         }
      } else {
         var5 = this.method22376(var3);
         var6 = this.field30749.method37199();
      }

      this.method22381(var3);
      return new Class6565(var4, var5, var3, var6);
   }

   private String method22375(Class2512 var1) {
      int var4 = 0;
      int var5 = this.field30749.method37203(var4);

      while (Class8852.field40006.method32204(var5)) {
         var5 = this.field30749.method37203(++var4);
      }

      if (var4 != 0) {
         String var9 = this.field30749.method37205(var4);
         var5 = this.field30749.method37202();
         if (!Class8852.field40002.method32205(var5)) {
            return var9;
         } else {
            String var7 = String.valueOf(Character.toChars(var5));
            throw new Class2481(
               "while scanning a directive",
               var1,
               "expected alphabetic or numeric character, but found " + var7 + "(" + var5 + ")",
               this.field30749.method37199()
            );
         }
      } else {
         String var6 = String.valueOf(Character.toChars(var5));
         throw new Class2481(
            "while scanning a directive", var1, "expected alphabetic or numeric character, but found " + var6 + "(" + var5 + ")", this.field30749.method37199()
         );
      }
   }

   private List<Integer> method22376(Class2512 var1) {
      while (this.field30749.method37202() == 32) {
         this.field30749.method37200();
      }

      Integer var4 = this.method22377(var1);
      int var5 = this.field30749.method37202();
      if (var5 == 46) {
         this.field30749.method37200();
         Integer var9 = this.method22377(var1);
         var5 = this.field30749.method37202();
         if (!Class8852.field40002.method32205(var5)) {
            ArrayList var10 = new ArrayList(2);
            var10.add(var4);
            var10.add(var9);
            return var10;
         } else {
            String var7 = String.valueOf(Character.toChars(var5));
            throw new Class2481(
               "while scanning a directive", var1, "expected a digit or ' ', but found " + var7 + "(" + var5 + ")", this.field30749.method37199()
            );
         }
      } else {
         String var6 = String.valueOf(Character.toChars(var5));
         throw new Class2481("while scanning a directive", var1, "expected a digit or '.', but found " + var6 + "(" + var5 + ")", this.field30749.method37199());
      }
   }

   private Integer method22377(Class2512 var1) {
      int var4 = this.field30749.method37202();
      if (!Character.isDigit(var4)) {
         String var7 = String.valueOf(Character.toChars(var4));
         throw new Class2481("while scanning a directive", var1, "expected a digit, but found " + var7 + "(" + var4 + ")", this.field30749.method37199());
      } else {
         int var5 = 0;

         while (Character.isDigit(this.field30749.method37203(var5))) {
            var5++;
         }

         return Integer.parseInt(this.field30749.method37205(var5));
      }
   }

   private List<String> method22378(Class2512 var1) {
      while (this.field30749.method37202() == 32) {
         this.field30749.method37200();
      }

      String var4 = this.method22379(var1);

      while (this.field30749.method37202() == 32) {
         this.field30749.method37200();
      }

      String var5 = this.method22380(var1);
      ArrayList var6 = new ArrayList(2);
      var6.add(var4);
      var6.add(var5);
      return var6;
   }

   private String method22379(Class2512 var1) {
      String var4 = this.method22395("directive", var1);
      int var5 = this.field30749.method37202();
      if (var5 == 32) {
         return var4;
      } else {
         String var6 = String.valueOf(Character.toChars(var5));
         throw new Class2481("while scanning a directive", var1, "expected ' ', but found " + var6 + "(" + var5 + ")", this.field30749.method37199());
      }
   }

   private String method22380(Class2512 var1) {
      String var4 = this.method22396("directive", var1);
      int var5 = this.field30749.method37202();
      if (!Class8852.field40002.method32205(var5)) {
         return var4;
      } else {
         String var6 = String.valueOf(Character.toChars(var5));
         throw new Class2481("while scanning a directive", var1, "expected ' ', but found " + var6 + "(" + var5 + ")", this.field30749.method37199());
      }
   }

   private void method22381(Class2512 var1) {
      while (this.field30749.method37202() == 32) {
         this.field30749.method37200();
      }

      if (this.field30749.method37202() == 35) {
         while (Class8852.field40001.method32205(this.field30749.method37202())) {
            this.field30749.method37200();
         }
      }

      int var4 = this.field30749.method37202();
      String var5 = this.method22398();
      if (var5.length() == 0 && var4 != 0) {
         String var6 = String.valueOf(Character.toChars(var4));
         throw new Class2481(
            "while scanning a directive", var1, "expected a comment or a line break, but found " + var6 + "(" + var4 + ")", this.field30749.method37199()
         );
      }
   }

   private Class6553 method22382(boolean var1) {
      Class2512 var4 = this.field30749.method37199();
      int var5 = this.field30749.method37202();
      String var6 = var5 != 42 ? "anchor" : "alias";
      this.field30749.method37200();
      int var7 = 0;
      int var8 = this.field30749.method37203(var7);

      while (Class8852.field40006.method32204(var8)) {
         var8 = this.field30749.method37203(++var7);
      }

      if (var7 != 0) {
         String var13 = this.field30749.method37205(var7);
         var8 = this.field30749.method37202();
         if (!Class8852.field40003.method32207(var8, "?:,]}%@`")) {
            Class2512 var14 = this.field30749.method37199();
            Object var11;
            if (!var1) {
               var11 = new Class6557(var13, var4, var14);
            } else {
               var11 = new Class6568(var13, var4, var14);
            }

            return (Class6553)var11;
         } else {
            String var10 = String.valueOf(Character.toChars(var8));
            throw new Class2481(
               "while scanning an " + var6,
               var4,
               "expected alphabetic or numeric character, but found " + var10 + "(" + var8 + ")",
               this.field30749.method37199()
            );
         }
      } else {
         String var9 = String.valueOf(Character.toChars(var8));
         throw new Class2481(
            "while scanning an " + var6, var4, "expected alphabetic or numeric character, but found " + var9 + "(" + var8 + ")", this.field30749.method37199()
         );
      }
   }

   private Class6553 method22383() {
      Class2512 var3 = this.field30749.method37199();
      int var4 = this.field30749.method37203(1);
      String var5 = null;
      Object var6 = null;
      if (var4 != 60) {
         if (!Class8852.field40003.method32204(var4)) {
            int var7 = 1;

            boolean var8;
            for (var8 = false; Class8852.field40002.method32205(var4); var4 = this.field30749.method37203(++var7)) {
               if (var4 == 33) {
                  var8 = true;
                  break;
               }
            }

            if (!var8) {
               var5 = "!";
               this.field30749.method37200();
            } else {
               var5 = this.method22395("tag", var3);
            }

            var6 = this.method22396("tag", var3);
         } else {
            var6 = "!";
            this.field30749.method37200();
         }
      } else {
         this.field30749.method37201(2);
         var6 = this.method22396("tag", var3);
         var4 = this.field30749.method37202();
         if (var4 != 62) {
            String var14 = String.valueOf(Character.toChars(var4));
            throw new Class2481("while scanning a tag", var3, "expected '>', but found '" + var14 + "' (" + var4 + ")", this.field30749.method37199());
         }

         this.field30749.method37200();
      }

      var4 = this.field30749.method37202();
      if (!Class8852.field40002.method32205(var4)) {
         Class7951 var13 = new Class7951(var5, (String)var6);
         Class2512 var15 = this.field30749.method37199();
         return new Class6564(var13, var3, var15);
      } else {
         String var12 = String.valueOf(Character.toChars(var4));
         throw new Class2481("while scanning a tag", var3, "expected ' ', but found '" + var12 + "' (" + var4 + ")", this.field30749.method37199());
      }
   }

   private Class6553 method22384(char var1) {
      boolean var4;
      if (var1 != '>') {
         var4 = false;
      } else {
         var4 = true;
      }

      StringBuilder var5 = new StringBuilder();
      Class2512 var6 = this.field30749.method37199();
      this.field30749.method37200();
      Class8192 var7 = this.method22385(var6);
      int var8 = var7.method28491();
      this.method22386(var6);
      int var9 = this.field30754 + 1;
      if (var9 < 1) {
         var9 = 1;
      }

      int var10;
      String var12;
      Class2512 var13;
      if (var8 != -1) {
         var10 = var9 + var8 - 1;
         Object[] var11 = this.method22388(var10);
         var12 = (String)var11[0];
         var13 = (Class2512)var11[1];
      } else {
         Object[] var18 = this.method22387();
         var12 = (String)var18[0];
         int var14 = (Integer)var18[1];
         var13 = (Class2512)var18[2];
         var10 = Math.max(var9, var14);
      }

      String var19 = "";

      while (this.field30749.method37209() == var10 && this.field30749.method37202() != 0) {
         var5.append(var12);
         boolean var15 = " \t".indexOf(this.field30749.method37202()) == -1;
         int var16 = 0;

         while (Class8852.field40001.method32205(this.field30749.method37203(var16))) {
            var16++;
         }

         var5.append(this.field30749.method37205(var16));
         var19 = this.method22398();
         Object[] var17 = this.method22388(var10);
         var12 = (String)var17[0];
         var13 = (Class2512)var17[1];
         if (this.field30749.method37209() != var10 || this.field30749.method37202() == 0) {
            break;
         }

         if (!var4 || !"\n".equals(var19) || !var15 || " \t".indexOf(this.field30749.method37202()) != -1) {
            var5.append(var19);
         } else if (var12.length() == 0) {
            var5.append(" ");
         }
      }

      if (var7.method28489()) {
         var5.append(var19);
      }

      if (var7.method28490()) {
         var5.append(var12);
      }

      return new Class6563(var5.toString(), false, var6, var13, Class1857.method8100(var1));
   }

   private Class8192 method22385(Class2512 var1) {
      Boolean var4 = null;
      int var5 = -1;
      int var6 = this.field30749.method37202();
      if (var6 != 45 && var6 != 43) {
         if (Character.isDigit(var6)) {
            String var11 = String.valueOf(Character.toChars(var6));
            var5 = Integer.parseInt(var11);
            if (var5 == 0) {
               throw new Class2481(
                  "while scanning a block scalar", var1, "expected indentation indicator in the range 1-9, but found 0", this.field30749.method37199()
               );
            }

            this.field30749.method37200();
            var6 = this.field30749.method37202();
            if (var6 == 45 || var6 == 43) {
               if (var6 != 43) {
                  var4 = Boolean.FALSE;
               } else {
                  var4 = Boolean.TRUE;
               }

               this.field30749.method37200();
            }
         }
      } else {
         if (var6 != 43) {
            var4 = Boolean.FALSE;
         } else {
            var4 = Boolean.TRUE;
         }

         this.field30749.method37200();
         var6 = this.field30749.method37202();
         if (Character.isDigit(var6)) {
            String var7 = String.valueOf(Character.toChars(var6));
            var5 = Integer.parseInt(var7);
            if (var5 == 0) {
               throw new Class2481(
                  "while scanning a block scalar", var1, "expected indentation indicator in the range 1-9, but found 0", this.field30749.method37199()
               );
            }

            this.field30749.method37200();
         }
      }

      var6 = this.field30749.method37202();
      if (!Class8852.field40002.method32205(var6)) {
         return new Class8192(var4, var5);
      } else {
         String var12 = String.valueOf(Character.toChars(var6));
         throw new Class2481(
            "while scanning a block scalar",
            var1,
            "expected chomping or indentation indicators, but found " + var12 + "(" + var6 + ")",
            this.field30749.method37199()
         );
      }
   }

   private String method22386(Class2512 var1) {
      while (this.field30749.method37202() == 32) {
         this.field30749.method37200();
      }

      if (this.field30749.method37202() == 35) {
         while (Class8852.field40001.method32205(this.field30749.method37202())) {
            this.field30749.method37200();
         }
      }

      int var4 = this.field30749.method37202();
      String var5 = this.method22398();
      if (var5.length() == 0 && var4 != 0) {
         String var6 = String.valueOf(Character.toChars(var4));
         throw new Class2481(
            "while scanning a block scalar", var1, "expected a comment or a line break, but found " + var6 + "(" + var4 + ")", this.field30749.method37199()
         );
      } else {
         return var5;
      }
   }

   private Object[] method22387() {
      StringBuilder var3 = new StringBuilder();
      int var4 = 0;
      Class2512 var5 = this.field30749.method37199();

      while (Class8852.field39999.method32206(this.field30749.method37202(), " \r")) {
         if (this.field30749.method37202() == 32) {
            this.field30749.method37200();
            if (this.field30749.method37209() > var4) {
               var4 = this.field30749.method37209();
            }
         } else {
            var3.append(this.method22398());
            var5 = this.field30749.method37199();
         }
      }

      return new Object[]{var3.toString(), var4, var5};
   }

   private Object[] method22388(int var1) {
      StringBuilder var4 = new StringBuilder();
      Class2512 var5 = this.field30749.method37199();

      for (int var6 = this.field30749.method37209(); var6 < var1 && this.field30749.method37202() == 32; var6++) {
         this.field30749.method37200();
      }

      String var7 = null;

      while ((var7 = this.method22398()).length() != 0) {
         var4.append((String)var7);
         var5 = this.field30749.method37199();

         for (int var8 = this.field30749.method37209(); var8 < var1 && this.field30749.method37202() == 32; var8++) {
            this.field30749.method37200();
         }
      }

      return new Object[]{var4.toString(), var5};
   }

   private Class6553 method22389(char var1) {
      boolean var4;
      if (var1 != '"') {
         var4 = false;
      } else {
         var4 = true;
      }

      StringBuilder var5 = new StringBuilder();
      Class2512 var6 = this.field30749.method37199();
      int var7 = this.field30749.method37202();
      this.field30749.method37200();
      var5.append(this.method22390(var4, var6));

      while (this.field30749.method37202() != var7) {
         var5.append(this.method22391(var6));
         var5.append(this.method22390(var4, var6));
      }

      this.field30749.method37200();
      Class2512 var8 = this.field30749.method37199();
      return new Class6563(var5.toString(), false, var6, var8, Class1857.method8100(var1));
   }

   private String method22390(boolean var1, Class2512 var2) {
      StringBuilder var5 = new StringBuilder();

      while (true) {
         int var6 = 0;

         while (Class8852.field40003.method32207(this.field30749.method37203(var6), "'\"\\")) {
            var6++;
         }

         if (var6 != 0) {
            var5.append(this.field30749.method37205(var6));
         }

         int var7 = this.field30749.method37202();
         if (!var1 && var7 == 39 && this.field30749.method37203(1) == 39) {
            var5.append("'");
            this.field30749.method37201(2);
         } else if ((!var1 || var7 != 39) && (var1 || "\"\\".indexOf(var7) == -1)) {
            if (!var1 || var7 != 92) {
               return var5.toString();
            }

            this.field30749.method37200();
            var7 = this.field30749.method37202();
            if (!Character.isSupplementaryCodePoint(var7) && field30747.containsKey((char)var7)) {
               var5.append(field30747.get((char)var7));
               this.field30749.method37200();
            } else if (!Character.isSupplementaryCodePoint(var7) && field30748.containsKey((char)var7)) {
               var6 = field30748.get((char)var7);
               this.field30749.method37200();
               String var13 = this.field30749.method37204(var6);
               if (field30746.matcher(var13).find()) {
                  throw new Class2481(
                     "while scanning a double-quoted scalar",
                     var2,
                     "expected escape sequence of " + var6 + " hexadecimal numbers, but found: " + var13,
                     this.field30749.method37199()
                  );
               }

               int var9 = Integer.parseInt(var13, 16);
               String var10 = new String(Character.toChars(var9));
               var5.append(var10);
               this.field30749.method37201(var6);
            } else {
               if (this.method22398().length() == 0) {
                  String var8 = String.valueOf(Character.toChars(var7));
                  throw new Class2481(
                     "while scanning a double-quoted scalar", var2, "found unknown escape character " + var8 + "(" + var7 + ")", this.field30749.method37199()
                  );
               }

               var5.append(this.method22392(var2));
            }
         } else {
            var5.appendCodePoint(var7);
            this.field30749.method37200();
         }
      }
   }

   private String method22391(Class2512 var1) {
      StringBuilder var4 = new StringBuilder();
      int var5 = 0;

      while (" \t".indexOf(this.field30749.method37203(var5)) != -1) {
         var5++;
      }

      String var6 = this.field30749.method37205(var5);
      int var7 = this.field30749.method37202();
      if (var7 != 0) {
         String var8 = this.method22398();
         if (var8.length() == 0) {
            var4.append(var6);
         } else {
            String var9 = this.method22392(var1);
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
         throw new Class2481("while scanning a quoted scalar", var1, "found unexpected end of stream", this.field30749.method37199());
      }
   }

   private String method22392(Class2512 var1) {
      StringBuilder var4 = new StringBuilder();

      while (true) {
         String var5 = this.field30749.method37204(3);
         if (("---".equals(var5) || "...".equals(var5)) && Class8852.field40003.method32204(this.field30749.method37203(3))) {
            throw new Class2481("while scanning a quoted scalar", var1, "found unexpected document separator", this.field30749.method37199());
         }

         while (" \t".indexOf(this.field30749.method37202()) != -1) {
            this.field30749.method37200();
         }

         String var6 = this.method22398();
         if (var6.length() == 0) {
            return var4.toString();
         }

         var4.append(var6);
      }
   }

   private Class6553 method22393() {
      StringBuilder var3 = new StringBuilder();
      Class2512 var4 = this.field30749.method37199();
      Class2512 var5 = var4;
      int var6 = this.field30754 + 1;
      String var7 = "";

      while (true) {
         int var8 = 0;
         if (this.field30749.method37202() == 35) {
            return new Class6563(var3.toString(), var4, var5, true);
         }

         while (true) {
            int var9 = this.field30749.method37203(var8);
            if (Class8852.field40003.method32204(var9)
               || var9 == 58 && Class8852.field40003.method32206(this.field30749.method37203(var8 + 1), this.field30751 == 0 ? "" : ",[]{}")
               || this.field30751 != 0 && ",?[]{}".indexOf(var9) != -1) {
               if (var8 == 0) {
                  return new Class6563(var3.toString(), var4, var5, true);
               }

               this.field30756 = false;
               var3.append(var7);
               var3.append(this.field30749.method37205(var8));
               var5 = this.field30749.method37199();
               var7 = this.method22394();
               if (var7.length() == 0 || this.field30749.method37202() == 35 || this.field30751 == 0 && this.field30749.method37209() < var6) {
                  return new Class6563(var3.toString(), var4, var5, true);
               }
               break;
            }

            var8++;
         }
      }
   }

   private String method22394() {
      int var3 = 0;

      while (this.field30749.method37203(var3) == 32 || this.field30749.method37203(var3) == 9) {
         var3++;
      }

      String var4 = this.field30749.method37205(var3);
      String var5 = this.method22398();
      if (var5.length() == 0) {
         return var4;
      } else {
         this.field30756 = true;
         String var6 = this.field30749.method37204(3);
         if (!"---".equals(var6) && (!"...".equals(var6) || !Class8852.field40003.method32204(this.field30749.method37203(3)))) {
            StringBuilder var7 = new StringBuilder();

            do {
               while (this.field30749.method37202() == 32) {
                  this.field30749.method37200();
               }

               String var8 = this.method22398();
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
               var6 = this.field30749.method37204(3);
            } while (!"---".equals(var6) && (!"...".equals(var6) || !Class8852.field40003.method32204(this.field30749.method37203(3))));

            return "";
         } else {
            return "";
         }
      }
   }

   private String method22395(String var1, Class2512 var2) {
      int var5 = this.field30749.method37202();
      if (var5 != 33) {
         String var9 = String.valueOf(Character.toChars(var5));
         throw new Class2481("while scanning a " + var1, var2, "expected '!', but found " + var9 + "(" + var5 + ")", this.field30749.method37199());
      } else {
         int var6 = 1;
         var5 = this.field30749.method37203(var6);
         if (var5 != 32) {
            while (Class8852.field40006.method32204(var5)) {
               var5 = this.field30749.method37203(++var6);
            }

            if (var5 != 33) {
               this.field30749.method37201(var6);
               String var7 = String.valueOf(Character.toChars(var5));
               throw new Class2481("while scanning a " + var1, var2, "expected '!', but found " + var7 + "(" + var5 + ")", this.field30749.method37199());
            }

            var6++;
         }

         return this.field30749.method37205(var6);
      }
   }

   private String method22396(String var1, Class2512 var2) {
      StringBuilder var5 = new StringBuilder();
      int var6 = 0;

      int var7;
      for (var7 = this.field30749.method37203(var6); Class8852.field40005.method32204(var7); var7 = this.field30749.method37203(var6)) {
         if (var7 != 37) {
            var6++;
         } else {
            var5.append(this.field30749.method37205(var6));
            var6 = 0;
            var5.append(this.method22397(var1, var2));
         }
      }

      if (var6 != 0) {
         var5.append(this.field30749.method37205(var6));
      }

      if (var5.length() != 0) {
         return var5.toString();
      } else {
         String var8 = String.valueOf(Character.toChars(var7));
         throw new Class2481("while scanning a " + var1, var2, "expected URI, but found " + var8 + "(" + var7 + ")", this.field30749.method37199());
      }
   }

   private String method22397(String var1, Class2512 var2) {
      int var5 = 1;

      while (this.field30749.method37203(var5 * 3) == 37) {
         var5++;
      }

      Class2512 var6 = this.field30749.method37199();

      ByteBuffer var7;
      for (var7 = ByteBuffer.allocate(var5); this.field30749.method37202() == 37; this.field30749.method37201(2)) {
         this.field30749.method37200();

         try {
            byte var8 = (byte)Integer.parseInt(this.field30749.method37204(2), 16);
            var7.put(var8);
         } catch (NumberFormatException var14) {
            int var9 = this.field30749.method37202();
            String var10 = String.valueOf(Character.toChars(var9));
            int var11 = this.field30749.method37203(1);
            String var12 = String.valueOf(Character.toChars(var11));
            throw new Class2481(
               "while scanning a " + var1,
               var2,
               "expected URI escape sequence of 2 hexadecimal numbers, but found " + var10 + "(" + var9 + ") and " + var12 + "(" + var11 + ")",
               this.field30749.method37199()
            );
         }
      }

      ((Buffer)var7).flip();

      try {
         return Class8261.method28800(var7);
      } catch (CharacterCodingException var13) {
         throw new Class2481("while scanning a " + var1, var2, "expected URI in UTF-8: " + var13.getMessage(), var6);
      }
   }

   private String method22398() {
      int var3 = this.field30749.method37202();
      if (var3 != 13 && var3 != 10 && var3 != 133) {
         if (var3 != 8232 && var3 != 8233) {
            return "";
         } else {
            this.field30749.method37200();
            return String.valueOf(Character.toChars(var3));
         }
      } else {
         if (var3 == 13 && 10 == this.field30749.method37203(1)) {
            this.field30749.method37201(2);
         } else {
            this.field30749.method37200();
         }

         return "\n";
      }
   }

   static {
      field30747.put('0', "\u0000");
      field30747.put('a', "\u0007");
      field30747.put('b', "\b");
      field30747.put('t', "\t");
      field30747.put('n', "\n");
      field30747.put('v', "\u000b");
      field30747.put('f', "\f");
      field30747.put('r', "\r");
      field30747.put('e', "\u001b");
      field30747.put(' ', " ");
      field30747.put('"', "\u0020");
      field30747.put('\\', "\\");
      field30747.put('N', "\u0085");
      field30747.put('_', " ");
      field30747.put('L', "\u2028");
      field30747.put('P', "\u2029");
      field30748.put('x', 2);
      field30748.put('u', 4);
      field30748.put('U', 8);
   }
}
