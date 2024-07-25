package remapped;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class class_3751 {
   private boolean field_18344 = true;
   private Deque<Boolean> field_18338 = new ArrayDeque<Boolean>();
   private Deque<Boolean> field_18334 = new ArrayDeque<Boolean>();
   private Map<String, String> field_18335 = new HashMap<String, String>();
   private static final Pattern field_18327 = Pattern.compile("\\s*#\\s*(\\w+)\\s*(.*)");
   private static final Pattern field_18333 = Pattern.compile("defined\\s+(\\w+)");
   private static final Pattern field_18342 = Pattern.compile("defined\\s*\\(\\s*(\\w+)\\s*\\)");
   private static final Pattern field_18340 = Pattern.compile("(\\w+)");
   private static final String field_18332 = "define";
   private static final String field_18329 = "undef";
   private static final String field_18337 = "ifdef";
   private static final String field_18341 = "ifndef";
   private static final String field_18343 = "if";
   private static final String field_18330 = "else";
   private static final String field_18328 = "elif";
   private static final String field_18339 = "endif";
   private static final List<String> field_18336 = Arrays.<String>asList(
      field_18331[3], field_18331[4], field_18331[5], field_18331[6], field_18331[7], field_18331[9], field_18331[8], field_18331[10]
   );

   public boolean method_17362(String var1) {
      Matcher var4 = field_18327.matcher(var1);
      if (!var4.matches()) {
         return this.field_18344;
      } else {
         String var5 = var4.group(1);
         String var6 = var4.group(2);
         int var7 = var6.indexOf("//");
         if (var7 >= 0) {
            var6 = var6.substring(0, var7);
         }

         boolean var8 = this.field_18344;
         this.method_17365(var5, var6);
         this.field_18344 = !this.field_18338.contains(Boolean.FALSE);
         return this.field_18344 || var8;
      }
   }

   public static boolean method_17363(String var0) {
      Matcher var3 = field_18327.matcher(var0);
      if (var3.matches()) {
         String var4 = var3.group(1);
         return field_18336.contains(var4);
      } else {
         return false;
      }
   }

   private void method_17365(String var1, String var2) {
      StringTokenizer var5 = new StringTokenizer(var2, " \t");
      String var6 = !var5.hasMoreTokens() ? "" : var5.nextToken();
      String var7 = !var5.hasMoreTokens() ? "" : var5.nextToken("").trim();
      if (!var1.equals("define")) {
         if (!var1.equals("undef")) {
            if (!var1.equals("ifdef")) {
               if (!var1.equals("ifndef")) {
                  if (!var1.equals("if")) {
                     if (!this.field_18338.isEmpty()) {
                        if (!var1.equals("elif")) {
                           if (!var1.equals("else")) {
                              if (var1.equals("endif")) {
                                 this.field_18338.removeLast();
                                 this.field_18334.removeLast();
                              }
                           } else {
                              boolean var8 = this.field_18338.removeLast();
                              boolean var9 = this.field_18334.removeLast();
                              boolean var10 = !var9;
                              this.field_18338.add(var10);
                              this.field_18334.add(true);
                           }
                        } else {
                           boolean var11 = this.field_18338.removeLast();
                           boolean var15 = this.field_18334.removeLast();
                           if (!var15) {
                              boolean var16 = this.method_17361(var2);
                              this.field_18338.add(var16);
                              this.field_18334.add(var16);
                           } else {
                              this.field_18338.add(false);
                              this.field_18334.add(var15);
                           }
                        }
                     }
                  } else {
                     boolean var12 = this.method_17361(var2);
                     this.field_18338.add(var12);
                     this.field_18334.add(var12);
                  }
               } else {
                  boolean var13 = !this.field_18335.containsKey(var6);
                  this.field_18338.add(var13);
                  this.field_18334.add(var13);
               }
            } else {
               boolean var14 = this.field_18335.containsKey(var6);
               this.field_18338.add(var14);
               this.field_18334.add(var14);
            }
         } else {
            this.field_18335.remove(var6);
         }
      } else {
         this.field_18335.put(var6, var7);
      }
   }

   private boolean method_17361(String var1) {
      Matcher var4 = field_18333.matcher(var1);
      var1 = var4.replaceAll("defined_$1");
      Matcher var5 = field_18342.matcher(var1);
      var1 = var5.replaceAll("defined_$1");
      boolean var6 = false;
      int var7 = 0;

      do {
         var6 = false;
         Matcher var8 = field_18340.matcher(var1);

         while (var8.find()) {
            String var9 = var8.group();
            if (var9.length() > 0) {
               char var10 = var9.charAt(0);
               if ((Character.isLetter(var10) || var10 == '_') && this.field_18335.containsKey(var9)) {
                  String var11 = this.field_18335.get(var9);
                  if (var11 == null) {
                     var11 = "1";
                  }

                  int var12 = var8.start();
                  int var13 = var8.end();
                  var1 = var1.substring(0, var12) + " " + var11 + " " + var1.substring(var13);
                  var6 = true;
                  var7++;
                  break;
               }
            }
         }
      } while (var6 && var7 < 100);

      if (var7 >= 100) {
         Config.method_14317("Too many iterations: " + var7 + ", when resolving: " + var1);
         return true;
      } else {
         try {
            class_4306 var18 = new class_4306(this.field_18335);
            class_1833 var19 = new class_1833(var18);
            class_3999 var20 = var19.method_8106(var1);
            if (var20.method_18450() == class_8848.field_45252) {
               class_1342 var22 = (class_1342)var20;
               return var22.method_6191();
            } else if (var20.method_18450() == class_8848.field_45248) {
               class_6839 var21 = (class_6839)var20;
               float var23 = var21.method_31353();
               return var23 != 0.0F;
            } else {
               throw new class_425("Not a boolean or float expression: " + var20.method_18450());
            }
         } catch (class_425 var14) {
            Config.method_14317("Invalid macro expression: " + var1);
            Config.method_14317("Error: " + var14.getMessage());
            return false;
         }
      }
   }
}
