package mapped;

import net.optifine.Config;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class8152 {
   private boolean field35081 = true;
   private Deque<Boolean> field35082 = new ArrayDeque<Boolean>();
   private Deque<Boolean> field35083 = new ArrayDeque<Boolean>();
   private Map<String, String> field35084 = new HashMap<String, String>();
   private static final Pattern field35085 = Pattern.compile("\\s*#\\s*(\\w+)\\s*(.*)");
   private static final Pattern field35086 = Pattern.compile("defined\\s+(\\w+)");
   private static final Pattern field35087 = Pattern.compile("defined\\s*\\(\\s*(\\w+)\\s*\\)");
   private static final Pattern field35088 = Pattern.compile("(\\w+)");
   private static final String field35089 = "define";
   private static final String field35090 = "undef";
   private static final String field35091 = "ifdef";
   private static final String field35092 = "ifndef";
   private static final String field35093 = "if";
   private static final String field35094 = "else";
   private static final String field35095 = "elif";
   private static final String field35096 = "endif";
   private static final List<String> field35097 = Arrays.asList("define", "undef", "ifdef", "ifndef", "if", "else", "elif", "endif");

   public boolean method28282(String var1) {
      Matcher var4 = field35085.matcher(var1);
      if (!var4.matches()) {
         return this.field35081;
      } else {
         String var5 = var4.group(1);
         String var6 = var4.group(2);
         int var7 = var6.indexOf("//");
         if (var7 >= 0) {
            var6 = var6.substring(0, var7);
         }

         boolean var8 = this.field35081;
         this.method28284(var5, var6);
         this.field35081 = !this.field35082.contains(Boolean.FALSE);
         return this.field35081 || var8;
      }
   }

   public static boolean method28283(String var0) {
      Matcher var3 = field35085.matcher(var0);
      if (var3.matches()) {
         String var4 = var3.group(1);
         return field35097.contains(var4);
      } else {
         return false;
      }
   }

   private void method28284(String var1, String var2) {
      StringTokenizer var5 = new StringTokenizer(var2, " \t");
      String var6 = !var5.hasMoreTokens() ? "" : var5.nextToken();
      String var7 = !var5.hasMoreTokens() ? "" : var5.nextToken("").trim();
      if (!var1.equals("define")) {
         if (!var1.equals("undef")) {
            if (!var1.equals("ifdef")) {
               if (!var1.equals("ifndef")) {
                  if (!var1.equals("if")) {
                     if (!this.field35082.isEmpty()) {
                        if (!var1.equals("elif")) {
                           if (!var1.equals("else")) {
                              if (var1.equals("endif")) {
                                 this.field35082.removeLast();
                                 this.field35083.removeLast();
                              }
                           } else {
                              boolean var8 = this.field35082.removeLast();
                              boolean var9 = this.field35083.removeLast();
                              boolean var10 = !var9;
                              this.field35082.add(var10);
                              this.field35083.add(true);
                           }
                        } else {
                           boolean var11 = this.field35082.removeLast();
                           boolean var15 = this.field35083.removeLast();
                           if (!var15) {
                              boolean var16 = this.method28285(var2);
                              this.field35082.add(var16);
                              this.field35083.add(var16);
                           } else {
                              this.field35082.add(false);
                              this.field35083.add(var15);
                           }
                        }
                     }
                  } else {
                     boolean var12 = this.method28285(var2);
                     this.field35082.add(var12);
                     this.field35083.add(var12);
                  }
               } else {
                  boolean var13 = !this.field35084.containsKey(var6);
                  this.field35082.add(var13);
                  this.field35083.add(var13);
               }
            } else {
               boolean var14 = this.field35084.containsKey(var6);
               this.field35082.add(var14);
               this.field35083.add(var14);
            }
         } else {
            this.field35084.remove(var6);
         }
      } else {
         this.field35084.put(var6, var7);
      }
   }

   private boolean method28285(String var1) {
      Matcher var4 = field35086.matcher(var1);
      var1 = var4.replaceAll("defined_$1");
      Matcher var5 = field35087.matcher(var1);
      var1 = var5.replaceAll("defined_$1");
      boolean var6 = false;
      int var7 = 0;

      do {
         var6 = false;
         Matcher var8 = field35088.matcher(var1);

         while (var8.find()) {
            String var9 = var8.group();
            if (var9.length() > 0) {
               char var10 = var9.charAt(0);
               if ((Character.isLetter(var10) || var10 == '_') && this.field35084.containsKey(var9)) {
                  String var11 = this.field35084.get(var9);
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
         Config.method26811("Too many iterations: " + var7 + ", when resolving: " + var1);
         return true;
      } else {
         try {
            Class6270 var18 = new Class6270(this.field35084);
            Class7344 var19 = new Class7344(var18);
            Class1878 var20 = var19.method23272(var1);
            if (var20.method8139() == Class2118.field13805) {
               Class1876 var22 = (Class1876)var20;
               return var22.method8137();
            } else if (var20.method8139() == Class2118.field13803) {
               Class1884 var21 = (Class1884)var20;
               float var23 = var21.method8142();
               return var23 != 0.0F;
            } else {
               throw new Class2445("Not a boolean or float expression: " + var20.method8139());
            }
         } catch (Class2445 var14) {
            Config.method26811("Invalid macro expression: " + var1);
            Config.method26811("Error: " + var14.getMessage());
            return false;
         }
      }
   }
}
