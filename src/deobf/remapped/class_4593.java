package remapped;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class class_4593 {
   private static final Pattern field_22329 = Pattern.compile("^\\s*#version\\s+.*$");
   private static final Pattern field_22327 = Pattern.compile("^\\s*#include\\s+\"([A-Za-z0-9_/\\.]+)\".*$");
   private static final Set<String> field_22330 = method_21265();
   private static final Map<String, Integer> field_22326 = method_21293();
   private static final Map<String, Integer> field_22331 = method_21270();

   public static class_6843[] method_21286(class_8591 var0, String[] var1, List<Integer> var2) {
      if (var0 == null) {
         return new class_6843[0];
      } else {
         HashMap var5 = new HashMap();
         method_21281(var0, "/shaders", var1, var5);

         for (int var7 : var2) {
            String var8 = "/shaders/world" + var7;
            method_21281(var0, var8, var1, var5);
         }

         Collection var9 = var5.values();
         class_6843[] var10 = var9.<class_6843>toArray(new class_6843[var9.size()]);
         class_1624 var11 = new class_1624();
         Arrays.sort(var10, var11);
         return var10;
      }
   }

   private static void method_21281(class_8591 var0, String var1, String[] var2, Map<String, class_6843> var3) {
      for (int var6 = 0; var6 < var2.length; var6++) {
         String var7 = var2[var6];
         if (!var7.equals("")) {
            String var8 = var1 + "/" + var7 + ".vsh";
            String var9 = var1 + "/" + var7 + ".fsh";
            method_21280(var0, var8, var3);
            method_21280(var0, var9, var3);
         }
      }
   }

   private static void method_21280(class_8591 var0, String var1, Map<String, class_6843> var2) {
      String[] var5 = method_21278(var0, var1);

      for (int var6 = 0; var6 < var5.length; var6++) {
         String var7 = var5[var6];
         class_6843 var8 = method_21287(var7, var1);
         if (var8 != null && !var8.method_31405().startsWith(class_244.method_1067()) && (!var8.method_31399() || method_21289(var8, var5))) {
            String var9 = var8.method_31405();
            class_6843 var10 = (class_6843)var2.get(var9);
            if (var10 == null) {
               var2.put(var9, var8);
            } else {
               if (!Config.equals(var10.method_31382(), var8.method_31382())) {
                  Config.method_14317("Ambiguous shader option: " + var8.method_31405());
                  Config.method_14317(" - in " + Config.method_14289(var10.method_31402()) + ": " + var10.method_31382());
                  Config.method_14317(" - in " + Config.method_14289(var8.method_31402()) + ": " + var8.method_31382());
                  var10.method_31386(false);
               }

               if (var10.method_31397() == null || var10.method_31397().length() <= 0) {
                  var10.method_31388(var8.method_31397());
               }

               var10.method_31390(var8.method_31402());
            }
         }
      }
   }

   private static boolean method_21289(class_6843 var0, String[] var1) {
      for (int var4 = 0; var4 < var1.length; var4++) {
         String var5 = var1[var4];
         if (var0.method_31379(var5)) {
            return true;
         }
      }

      return false;
   }

   private static String[] method_21278(class_8591 var0, String var1) {
      try {
         ArrayList var4 = new ArrayList();
         String var5 = method_21292(var1, var0, 0, var4, 0);
         if (var5 == null) {
            return new String[0];
         } else {
            ByteArrayInputStream var6 = new ByteArrayInputStream(var5.getBytes());
            return Config.method_14432(var6);
         }
      } catch (IOException var7) {
         Config.method_14277(var7.getClass().getName() + ": " + var7.getMessage());
         return new String[0];
      }
   }

   private static class_6843 method_21287(String var0, String var1) {
      class_6843 var4 = null;
      if (var4 == null) {
         var4 = class_6335.method_29008(var0, var1);
      }

      if (var4 == null) {
         var4 = class_872.method_3769(var0, var1);
      }

      if (var4 != null) {
         return var4;
      } else {
         if (var4 == null) {
            var4 = class_3395.method_15686(var0, var1);
         }

         if (var4 == null) {
            var4 = class_6383.method_29170(var0, var1);
         }

         return var4 != null && field_22330.contains(var4.method_31405()) ? var4 : null;
      }
   }

   private static Set<String> method_21265() {
      HashSet var2 = new HashSet();
      var2.add("shadowMapResolution");
      var2.add("shadowMapFov");
      var2.add("shadowDistance");
      var2.add("shadowDistanceRenderMul");
      var2.add("shadowIntervalSize");
      var2.add("generateShadowMipmap");
      var2.add("generateShadowColorMipmap");
      var2.add("shadowHardwareFiltering");
      var2.add("shadowHardwareFiltering0");
      var2.add("shadowHardwareFiltering1");
      var2.add("shadowtex0Mipmap");
      var2.add("shadowtexMipmap");
      var2.add("shadowtex1Mipmap");
      var2.add("shadowcolor0Mipmap");
      var2.add("shadowColor0Mipmap");
      var2.add("shadowcolor1Mipmap");
      var2.add("shadowColor1Mipmap");
      var2.add("shadowtex0Nearest");
      var2.add("shadowtexNearest");
      var2.add("shadow0MinMagNearest");
      var2.add("shadowtex1Nearest");
      var2.add("shadow1MinMagNearest");
      var2.add("shadowcolor0Nearest");
      var2.add("shadowColor0Nearest");
      var2.add("shadowColor0MinMagNearest");
      var2.add("shadowcolor1Nearest");
      var2.add("shadowColor1Nearest");
      var2.add("shadowColor1MinMagNearest");
      var2.add("wetnessHalflife");
      var2.add("drynessHalflife");
      var2.add("eyeBrightnessHalflife");
      var2.add("centerDepthHalflife");
      var2.add("sunPathRotation");
      var2.add("ambientOcclusionLevel");
      var2.add("superSamplingLevel");
      var2.add("noiseTextureResolution");
      return var2;
   }

   public static class_8471[] method_21264(Properties var0, class_6843[] var1) {
      String var4 = "profile.";
      ArrayList var5 = new ArrayList();

      for (String var7 : var0.keySet()) {
         if (var7.startsWith(var4)) {
            String var8 = var7.substring(var4.length());
            var0.getProperty(var7);
            HashSet var9 = new HashSet();
            class_8471 var10 = method_21277(var8, var0, var9, var1);
            if (var10 != null) {
               var5.add(var10);
            }
         }
      }

      return var5.size() > 0 ? var5.<class_8471>toArray(new class_8471[var5.size()]) : null;
   }

   public static Map<String, class_1342> method_21268(Properties var0, class_6843[] var1) {
      String var4 = "program.";
      Pattern var5 = Pattern.compile("program\\.([^.]+)\\.enabled");
      HashMap var6 = new HashMap();

      for (String var8 : var0.keySet()) {
         Matcher var9 = var5.matcher(var8);
         if (var9.matches()) {
            String var10 = var9.group(1);
            String var11 = var0.getProperty(var8).trim();
            class_1342 var12 = method_21272(var11, var1);
            if (var12 != null) {
               var6.put(var10, var12);
            } else {
               class_1910.method_8673("Error parsing program condition: " + var8);
            }
         }
      }

      return var6;
   }

   private static class_1342 method_21272(String var0, class_6843[] var1) {
      try {
         class_6522 var4 = new class_6522(var1);
         class_1833 var5 = new class_1833(var4);
         return var5.method_8096(var0);
      } catch (class_425 var6) {
         class_1910.method_8669(var6.getClass().getName() + ": " + var6.getMessage());
         return null;
      }
   }

   public static Set<String> method_21266(Properties var0, class_6843[] var1) {
      HashSet var4 = new HashSet();
      String var5 = var0.getProperty("sliders");
      if (var5 != null) {
         String[] var6 = Config.method_14302(var5, " ");

         for (int var7 = 0; var7 < var6.length; var7++) {
            String var8 = var6[var7];
            class_6843 var9 = class_1001.method_4342(var8, var1);
            if (var9 != null) {
               var4.add(var8);
            } else {
               Config.method_14317("Invalid shader option: " + var8);
            }
         }

         return var4;
      } else {
         return var4;
      }
   }

   private static class_8471 method_21277(String var0, Properties var1, Set<String> var2, class_6843[] var3) {
      String var6 = "profile.";
      String var7 = var6 + var0;
      if (!var2.contains(var7)) {
         var2.add(var0);
         class_8471 var8 = new class_8471(var0);
         String var9 = var1.getProperty(var7);
         String[] var10 = Config.method_14302(var9, " ");

         for (int var11 = 0; var11 < var10.length; var11++) {
            String var12 = var10[var11];
            if (!var12.startsWith(var6)) {
               String[] var13 = Config.method_14302(var12, ":=");
               if (var13.length != 1) {
                  if (var13.length == 2) {
                     String var14 = var13[0];
                     String var15 = var13[1];
                     class_6843 var16 = class_1001.method_4342(var14, var3);
                     if (var16 != null) {
                        if (var16.method_31380(var15)) {
                           var16.method_31400(true);
                           var8.method_38979(var14, var15);
                        } else {
                           Config.method_14317("[Shaders] Invalid value: " + var12);
                        }
                     } else {
                        Config.method_14317("[Shaders] Invalid option: " + var12);
                     }
                  } else {
                     Config.method_14317("[Shaders] Invalid option value: " + var12);
                  }
               } else {
                  String var19 = var13[0];
                  boolean var21 = true;
                  if (var19.startsWith("!")) {
                     var21 = false;
                     var19 = var19.substring(1);
                  }

                  String var22 = "program.";
                  if (!var19.startsWith(var22)) {
                     class_6843 var17 = class_1001.method_4342(var19, var3);
                     if (var17 instanceof class_6335) {
                        var8.method_38979(var19, String.valueOf(var21));
                        var17.method_31400(true);
                     } else {
                        Config.method_14317("[Shaders] Invalid option: " + var19);
                     }
                  } else {
                     String var23 = var19.substring(var22.length());
                     if (class_6588.method_30155(var23)) {
                        if (!var21) {
                           var8.method_38986(var23);
                        } else {
                           var8.method_38985(var23);
                        }
                     } else {
                        Config.method_14317("Invalid program: " + var23 + " in profile: " + var8.method_38982());
                     }
                  }
               }
            } else {
               String var18 = var12.substring(var6.length());
               class_8471 var20 = method_21277(var18, var1, var2, var3);
               if (var8 != null) {
                  var8.method_38984(var20);
                  var8.method_38990(var20.method_38988());
               }
            }
         }

         return var8;
      } else {
         Config.method_14317("[Shaders] Profile already parsed: " + var0);
         return null;
      }
   }

   public static Map<String, class_4842> method_21271(Properties var0, class_8471[] var1, class_6843[] var2) {
      HashMap var5 = new HashMap();
      method_21275("screen", var0, var5, var1, var2);
      return !var5.isEmpty() ? var5 : null;
   }

   private static boolean method_21275(String var0, Properties var1, Map<String, class_4842> var2, class_8471[] var3, class_6843[] var4) {
      String var7 = var1.getProperty(var0);
      if (var7 == null) {
         return false;
      } else {
         ArrayList var8 = new ArrayList();
         HashSet var9 = new HashSet();
         String[] var10 = Config.method_14302(var7, " ");

         for (int var11 = 0; var11 < var10.length; var11++) {
            String var12 = var10[var11];
            if (!var12.equals("<empty>")) {
               if (!var9.contains(var12)) {
                  var9.add(var12);
                  if (!var12.equals("<profile>")) {
                     if (!var12.equals("*")) {
                        if (var12.startsWith("[") && var12.endsWith("]")) {
                           String var17 = class_8251.method_37819(var12, "[", "]");
                           if (var17.matches("^[a-zA-Z0-9_]+$")) {
                              if (method_21275("screen." + var17, var1, var2, var3, var4)) {
                                 class_2838 var14 = new class_2838(var17);
                                 var8.add(var14);
                              } else {
                                 Config.method_14317("[Shaders] Invalid screen: " + var12 + ", key: " + var0);
                              }
                           } else {
                              Config.method_14317("[Shaders] Invalid screen: " + var12 + ", key: " + var0);
                           }
                        } else {
                           class_6843 var13 = class_1001.method_4342(var12, var4);
                           if (var13 != null) {
                              var13.method_31400(true);
                              var8.add(var13);
                           } else {
                              Config.method_14317("[Shaders] Invalid option: " + var12 + ", key: " + var0);
                              var8.add((class_6843)null);
                           }
                        }
                     } else {
                        class_2725 var18 = new class_2725("<rest>");
                        var8.add(var18);
                     }
                  } else if (var3 != null) {
                     class_4058 var19 = new class_4058(var3, var4);
                     var8.add(var19);
                  } else {
                     Config.method_14317("[Shaders] Option profile can not be used, no profiles defined: " + var12 + ", key: " + var0);
                  }
               } else {
                  Config.method_14317("[Shaders] Duplicate option: " + var12 + ", key: " + var0);
               }
            } else {
               var8.add((class_6843)null);
            }
         }

         class_6843[] var15 = var8.<class_6843>toArray(new class_6843[var8.size()]);
         String var16 = var1.getProperty(var0 + ".columns");
         int var20 = Config.method_14361(var16, 2);
         class_4842 var21 = new class_4842(var0, var15, var20);
         var2.put(var0, var21);
         return true;
      }
   }

   public static BufferedReader method_21267(BufferedReader var0, String var1, class_8591 var2, int var3, List<String> var4, int var5) throws IOException {
      String var8 = "/";
      int var9 = var1.lastIndexOf("/");
      if (var9 >= 0) {
         var8 = var1.substring(0, var9);
      }

      CharArrayWriter var10 = new CharArrayWriter();
      int var11 = -1;
      LinkedHashSet var12 = new LinkedHashSet();
      int var13 = 1;

      while (true) {
         String var14 = var0.readLine();
         if (var14 == null) {
            char[] var23 = var10.toCharArray();
            if (var11 >= 0 && var12.size() > 0) {
               StringBuilder var29 = new StringBuilder();

               for (class_4789 var37 : var12) {
                  var29.append("#define ");
                  var29.append(var37.method_22086());
                  var29.append(" ");
                  var29.append(var37.method_22085());
                  var29.append("\n");
               }

               String var34 = var29.toString();
               StringBuilder var38 = new StringBuilder(new String(var23));
               var38.insert(var11, var34);
               String var39 = var38.toString();
               var23 = var39.toCharArray();
            }

            CharArrayReader var30 = new CharArrayReader(var23);
            return new BufferedReader(var30);
         }

         if (var11 < 0) {
            Matcher var15 = field_22329.matcher(var14);
            if (var15.matches()) {
               String var16 = class_244.method_1062() + class_244.method_1066();
               String var17 = var14 + "\n" + var16;
               String var18 = "#line " + (var13 + 1) + " " + var3;
               var14 = var17 + var18;
               var11 = var10.size() + var17.length();
            }
         }

         Matcher var22 = field_22327.matcher(var14);
         if (var22.matches()) {
            String var24 = var22.group(1);
            boolean var31 = var24.startsWith("/");
            String var35 = !var31 ? var8 + "/" + var24 : "/shaders" + var24;
            if (!var4.contains(var35)) {
               var4.add(var35);
            }

            int var19 = var4.indexOf(var35) + 1;
            var14 = method_21292(var35, var2, var19, var4, var5);
            if (var14 == null) {
               throw new IOException("Included file not found: " + var1);
            }

            if (var14.endsWith("\n")) {
               var14 = var14.substring(0, var14.length() - 1);
            }

            String var20 = "#line 1 " + var19 + "\n";
            if (var14.startsWith("#version ")) {
               var20 = "";
            }

            var14 = var20 + var14 + "\n#line " + (var13 + 1) + " " + var3;
         }

         if (var11 >= 0 && var14.contains(class_244.method_1067())) {
            class_4789[] var25 = method_21279(var14, class_244.method_1069());

            for (int var32 = 0; var32 < var25.length; var32++) {
               class_4789 var36 = var25[var32];
               var12.add(var36);
            }
         }

         if (class_6588.method_30126()) {
            String var26 = var14.replace("gl_TextureMatrix[1]", "gl_TextureMatrix[2]");
            var26 = var26.replace("gl_MultiTexCoord1", "gl_MultiTexCoord2");
            if (!var26.equals(var14)) {
               var26 = var26 + " // Legacy fix, replaced TU 1 with 2";
               var14 = var26;
            }
         }

         var10.write(var14);
         var10.write("\n");
         var13++;
      }
   }

   private static class_4789[] method_21279(String var0, class_4789[] var1) {
      ArrayList var4 = new ArrayList();

      for (int var5 = 0; var5 < var1.length; var5++) {
         class_4789 var6 = var1[var5];
         if (var0.contains(var6.method_22086())) {
            var4.add(var6);
         }
      }

      return var4.<class_4789>toArray(new class_4789[var4.size()]);
   }

   private static String method_21292(String var0, class_8591 var1, int var2, List<String> var3, int var4) throws IOException {
      if (var4 >= 10) {
         throw new IOException("#include depth exceeded: " + var4 + ", file: " + var0);
      } else {
         var4++;
         InputStream var7 = var1.method_39505(var0);
         if (var7 == null) {
            return null;
         } else {
            InputStreamReader var8 = new InputStreamReader(var7, "ASCII");
            BufferedReader var9 = new BufferedReader(var8);
            var9 = method_21267(var9, var0, var1, var2, var3, var4);
            CharArrayWriter var10 = new CharArrayWriter();

            while (true) {
               String var11 = var9.readLine();
               if (var11 == null) {
                  return var10.toString();
               }

               var10.write(var11);
               var10.write("\n");
            }
         }
      }
   }

   public static class_5142 method_21288(Properties var0) {
      String var3 = "uniform";
      String var4 = "variable";
      String var5 = var3 + ".";
      String var6 = var4 + ".";
      HashMap var7 = new HashMap();
      ArrayList var8 = new ArrayList();

      for (String var10 : var0.keySet()) {
         String[] var11 = Config.method_14302(var10, ".");
         if (var11.length == 3) {
            String var12 = var11[0];
            String var13 = var11[1];
            String var14 = var11[2];
            String var15 = var0.getProperty(var10).trim();
            if (!var7.containsKey(var14)) {
               if (var12.equals(var3) || var12.equals(var4)) {
                  class_1910.method_8671("Custom " + var12 + ": " + var14);
                  class_6458 var16 = method_21283(var12, var14, var13, var15, var7);
                  if (var16 != null) {
                     var7.put(var14, var16.method_29424());
                     if (!var12.equals(var4)) {
                        var8.add(var16);
                     }
                  }
               }
            } else {
               class_1910.method_8669("Expression already defined: " + var14);
            }
         }
      }

      if (var8.size() > 0) {
         class_6458[] var17 = var8.<class_6458>toArray(new class_6458[var8.size()]);
         return new class_5142(var17, var7);
      } else {
         return null;
      }
   }

   private static class_6458 method_21283(String var0, String var1, String var2, String var3, Map<String, class_3999> var4) {
      try {
         class_7751 var7 = class_7751.method_35175(var2);
         if (var7 == null) {
            class_1910.method_8669("Unknown " + var0 + " type: " + var7);
            return null;
         } else {
            class_6497 var8 = new class_6497(var4);
            class_1833 var9 = new class_1833(var8);
            class_3999 var10 = var9.method_8106(var3);
            class_8848 var11 = var10.method_18450();
            if (!var7.method_35172(var11)) {
               class_1910.method_8669("Expression type does not match " + var0 + " type, expression: " + var11 + ", " + var0 + ": " + var7 + " " + var1);
               return null;
            } else {
               var10 = method_21274(var10);
               return new class_6458(var1, var7, var10);
            }
         }
      } catch (class_425 var12) {
         class_1910.method_8669(var12.getClass().getName() + ": " + var12.getMessage());
         return null;
      }
   }

   private static class_3999 method_21274(class_3999 var0) {
      if (!(var0 instanceof class_6839)) {
         return (class_3999)(!(var0 instanceof class_8350) ? var0 : new class_3696((class_8350)var0));
      } else {
         return new class_825((class_6839)var0);
      }
   }

   public static void method_21285(Properties var0) {
      for (String var4 : var0.keySet()) {
         String[] var5 = Config.method_14302(var4, ".");
         if (var5.length == 2) {
            String var6 = var5[0];
            String var7 = var5[1];
            if (var6.equals("alphaTest")) {
               class_3009 var8 = class_6588.method_30288(var7);
               if (var8 != null) {
                  String var9 = var0.getProperty(var4).trim();
                  class_2412 var10 = method_21290(var9);
                  if (var10 != null) {
                     var8.method_13744(var10);
                  }
               } else {
                  class_1910.method_8673("Invalid program name: " + var7);
               }
            }
         }
      }
   }

   public static class_2412 method_21290(String var0) {
      if (var0 == null) {
         return null;
      } else {
         String[] var3 = Config.method_14302(var0, " ");
         if (var3.length != 1) {
            if (var3.length == 2) {
               String var8 = var3[0];
               String var5 = var3[1];
               Integer var6 = field_22326.get(var8);
               float var7 = Config.method_14445(var5, -1.0F);
               if (var6 != null && var7 >= 0.0F) {
                  return new class_2412(true, var6, var7);
               }
            }
         } else {
            String var4 = var3[0];
            if (var4.equals("off") || var4.equals("false")) {
               return new class_2412(false);
            }
         }

         class_1910.method_8673("Invalid alpha test: " + var0);
         return null;
      }
   }

   public static void method_21282(Properties var0) {
      for (String var4 : var0.keySet()) {
         String[] var5 = Config.method_14302(var4, ".");
         if (var5.length == 2) {
            String var6 = var5[0];
            String var7 = var5[1];
            if (var6.equals("blend")) {
               class_3009 var8 = class_6588.method_30288(var7);
               if (var8 != null) {
                  String var9 = var0.getProperty(var4).trim();
                  class_3525 var10 = method_21291(var9);
                  if (var10 != null) {
                     var8.method_13765(var10);
                  }
               } else {
                  class_1910.method_8673("Invalid program name: " + var7);
               }
            }
         }
      }
   }

   public static class_3525 method_21291(String var0) {
      if (var0 == null) {
         return null;
      } else {
         String[] var3 = Config.method_14302(var0, " ");
         if (var3.length != 1) {
            if (var3.length == 2 || var3.length == 4) {
               String var12 = var3[0];
               String var5 = var3[1];
               String var6 = var12;
               String var7 = var5;
               if (var3.length == 4) {
                  var6 = var3[2];
                  var7 = var3[3];
               }

               Integer var8 = field_22331.get(var12);
               Integer var9 = field_22331.get(var5);
               Integer var10 = field_22331.get(var6);
               Integer var11 = field_22331.get(var7);
               if (var8 != null && var9 != null && var10 != null && var11 != null) {
                  return new class_3525(true, var8, var9, var10, var11);
               }
            }
         } else {
            String var4 = var3[0];
            if (var4.equals("off") || var4.equals("false")) {
               return new class_3525(false);
            }
         }

         class_1910.method_8673("Invalid blend mode: " + var0);
         return null;
      }
   }

   public static void method_21269(Properties var0) {
      for (String var4 : var0.keySet()) {
         String[] var5 = Config.method_14302(var4, ".");
         if (var5.length == 2) {
            String var6 = var5[0];
            String var7 = var5[1];
            if (var6.equals("scale")) {
               class_3009 var8 = class_6588.method_30288(var7);
               if (var8 != null) {
                  String var9 = var0.getProperty(var4).trim();
                  class_1400 var10 = method_21284(var9);
                  if (var10 != null) {
                     var8.method_13761(var10);
                  }
               } else {
                  class_1910.method_8673("Invalid program name: " + var7);
               }
            }
         }
      }
   }

   private static class_1400 method_21284(String var0) {
      String[] var3 = Config.method_14302(var0, " ");
      float var4 = Config.method_14445(var3[0], -1.0F);
      float var5 = 0.0F;
      float var6 = 0.0F;
      if (var3.length > 1) {
         if (var3.length != 3) {
            class_1910.method_8673("Invalid render scale: " + var0);
            return null;
         }

         var5 = Config.method_14445(var3[1], -1.0F);
         var6 = Config.method_14445(var3[2], -1.0F);
      }

      if (Config.method_14353(var4, 0.0F, 1.0F) && Config.method_14353(var5, 0.0F, 1.0F) && Config.method_14353(var6, 0.0F, 1.0F)) {
         return new class_1400(var4, var5, var6);
      } else {
         class_1910.method_8673("Invalid render scale: " + var0);
         return null;
      }
   }

   public static void method_21273(Properties var0) {
      for (String var4 : var0.keySet()) {
         String[] var5 = Config.method_14302(var4, ".");
         if (var5.length == 3) {
            String var6 = var5[0];
            String var7 = var5[1];
            String var8 = var5[2];
            if (var6.equals("flip")) {
               class_3009 var9 = class_6588.method_30288(var7);
               if (var9 != null) {
                  Boolean[] var10 = var9.method_13748();
                  int var11 = class_6588.method_30167(var8);
                  if (var11 >= 0 && var11 < var10.length) {
                     String var12 = var0.getProperty(var4).trim();
                     Boolean var13 = Config.method_14256(var12, (Boolean)null);
                     if (var13 != null) {
                        var10[var11] = var13;
                     } else {
                        class_1910.method_8673("Invalid boolean value: " + var12);
                     }
                  } else {
                     class_1910.method_8673("Invalid buffer name: " + var8);
                  }
               } else {
                  class_1910.method_8673("Invalid program name: " + var7);
               }
            }
         }
      }
   }

   private static Map<String, Integer> method_21293() {
      HashMap var2 = new HashMap();
      var2.put("NEVER", new Integer(512));
      var2.put("LESS", new Integer(513));
      var2.put("EQUAL", new Integer(514));
      var2.put("LEQUAL", new Integer(515));
      var2.put("GREATER", new Integer(516));
      var2.put("NOTEQUAL", new Integer(517));
      var2.put("GEQUAL", new Integer(518));
      var2.put("ALWAYS", new Integer(519));
      return Collections.<String, Integer>unmodifiableMap(var2);
   }

   private static Map<String, Integer> method_21270() {
      HashMap var2 = new HashMap();
      var2.put("ZERO", new Integer(0));
      var2.put("ONE", new Integer(1));
      var2.put("SRC_COLOR", new Integer(768));
      var2.put("ONE_MINUS_SRC_COLOR", new Integer(769));
      var2.put("DST_COLOR", new Integer(774));
      var2.put("ONE_MINUS_DST_COLOR", new Integer(775));
      var2.put("SRC_ALPHA", new Integer(770));
      var2.put("ONE_MINUS_SRC_ALPHA", new Integer(771));
      var2.put("DST_ALPHA", new Integer(772));
      var2.put("ONE_MINUS_DST_ALPHA", new Integer(773));
      var2.put("CONSTANT_COLOR", new Integer(32769));
      var2.put("ONE_MINUS_CONSTANT_COLOR", new Integer(32770));
      var2.put("CONSTANT_ALPHA", new Integer(32771));
      var2.put("ONE_MINUS_CONSTANT_ALPHA", new Integer(32772));
      var2.put("SRC_ALPHA_SATURATE", new Integer(776));
      return Collections.<String, Integer>unmodifiableMap(var2);
   }
}
