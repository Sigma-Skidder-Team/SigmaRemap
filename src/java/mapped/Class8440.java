package mapped;

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

public class Class8440 {
   private static final Pattern field36157 = Pattern.compile("^\\s*#version\\s+.*$");
   private static final Pattern field36158 = Pattern.compile("^\\s*#include\\s+\"([A-Za-z0-9_/\\.]+)\".*$");
   private static final Set<String> field36159 = method29664();
   private static final Map<String, Integer> field36160 = method29685();
   private static final Map<String, Integer> field36161 = method29686();

   public static Class6679[] method29658(Class4671 var0, String[] var1, List<Integer> var2) {
      if (var0 == null) {
         return new Class6679[0];
      } else {
         HashMap var5 = new HashMap();
         method29659(var0, "/shaders", var1, var5);

         for (int var7 : var2) {
            String var8 = "/shaders/world" + var7;
            method29659(var0, var8, var1, var5);
         }

         Collection<Class6679> var9 = var5.values();
         Class6679[] var10 = var9.toArray(new Class6679[var9.size()]);
         Class3574 var11 = new Class3574();
         Arrays.sort(var10, var11);
         return var10;
      }
   }

   private static void method29659(Class4671 var0, String var1, String[] var2, Map<String, Class6679> var3) {
      for (int var6 = 0; var6 < var2.length; var6++) {
         String var7 = var2[var6];
         if (!var7.equals("")) {
            String var8 = var1 + "/" + var7 + ".vsh";
            String var9 = var1 + "/" + var7 + ".fsh";
            method29660(var0, var8, var3);
            method29660(var0, var9, var3);
         }
      }
   }

   private static void method29660(Class4671 var0, String var1, Map<String, Class6679> var2) {
      String[] var5 = method29662(var0, var1);

      for (int var6 = 0; var6 < var5.length; var6++) {
         String var7 = var5[var6];
         Class6679 var8 = method29663(var7, var1);
         if (var8 != null && !var8.method20366().startsWith(Class4915.method15202()) && (!var8.method20386() || method29661(var8, var5))) {
            String var9 = var8.method20366();
            Class6679 var10 = (Class6679)var2.get(var9);
            if (var10 == null) {
               var2.put(var9, var8);
            } else {
               if (!Class7944.equals(var10.method20372(), var8.method20372())) {
                  Class7944.method26811("Ambiguous shader option: " + var8.method20366());
                  Class7944.method26811(" - in " + Class7944.method26854(var10.method20377()) + ": " + var10.method20372());
                  Class7944.method26811(" - in " + Class7944.method26854(var8.method20377()) + ": " + var8.method20372());
                  var10.method20380(false);
               }

               if (var10.method20367() == null || var10.method20367().length() <= 0) {
                  var10.method20369(var8.method20367());
               }

               var10.method20378(var8.method20377());
            }
         }
      }
   }

   private static boolean method29661(Class6679 var0, String[] var1) {
      for (int var4 = 0; var4 < var1.length; var4++) {
         String var5 = var1[var4];
         if (var0.method20387(var5)) {
            return true;
         }
      }

      return false;
   }

   private static String[] method29662(Class4671 var0, String var1) {
      try {
         ArrayList var4 = new ArrayList();
         String var5 = method29674(var1, var0, 0, var4, 0);
         if (var5 == null) {
            return new String[0];
         } else {
            ByteArrayInputStream var6 = new ByteArrayInputStream(var5.getBytes());
            return Class7944.method26923(var6);
         }
      } catch (IOException var7) {
         Class7944.method26810(var7.getClass().getName() + ": " + var7.getMessage());
         return new String[0];
      }
   }

   private static Class6679 method29663(String var0, String var1) {
      Class6679 var4 = null;
      if (var4 == null) {
         var4 = Class6682.method20391(var0, var1);
      }

      if (var4 == null) {
         var4 = Class6678.method20364(var0, var1);
      }

      if (var4 != null) {
         return var4;
      } else {
         if (var4 == null) {
            var4 = Class6683.method20391(var0, var1);
         }

         if (var4 == null) {
            var4 = Class6685.method20364(var0, var1);
         }

         return var4 != null && field36159.contains(var4.method20366()) ? var4 : null;
      }
   }

   private static Set<String> method29664() {
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

   public static Class9458[] method29665(Properties var0, Class6679[] var1) {
      String var4 = "profile.";
      ArrayList<Class9458> var5 = new ArrayList();

      for (String var7 : (Set<String>)(Set) var0.keySet()) {
         if (var7.startsWith(var4)) {
            String var8 = var7.substring(var4.length());
            var0.getProperty(var7);
            HashSet var9 = new HashSet();
            Class9458 var10 = method29669(var8, var0, var9, var1);
            if (var10 != null) {
               var5.add(var10);
            }
         }
      }

      return var5.size() > 0 ? var5.toArray(new Class9458[var5.size()]) : null;
   }

   public static Map<String, Class1876> method29666(Properties var0, Class6679[] var1) {
      String var4 = "program.";
      Pattern var5 = Pattern.compile("program\\.([^.]+)\\.enabled");
      HashMap var6 = new HashMap();

      for (String var8 : (Set<String>)(Set) var0.keySet()) {
         Matcher var9 = var5.matcher(var8);
         if (var9.matches()) {
            String var10 = var9.group(1);
            String var11 = var0.getProperty(var8).trim();
            Class1876 var12 = method29667(var11, var1);
            if (var12 != null) {
               var6.put(var10, var12);
            } else {
               Class7399.method23632("Error parsing program condition: " + var8);
            }
         }
      }

      return var6;
   }

   private static Class1876 method29667(String var0, Class6679[] var1) {
      try {
         Class6269 var4 = new Class6269(var1);
         Class7344 var5 = new Class7344(var4);
         return var5.method23271(var0);
      } catch (Class2445 var6) {
         Class7399.method23633(var6.getClass().getName() + ": " + var6.getMessage());
         return null;
      }
   }

   public static Set<String> method29668(Properties var0, Class6679[] var1) {
      HashSet var4 = new HashSet();
      String var5 = var0.getProperty("sliders");
      if (var5 != null) {
         String[] var6 = Class7944.method26903(var5, " ");

         for (int var7 = 0; var7 < var6.length; var7++) {
            String var8 = var6[var7];
            Class6679 var9 = Class6817.method20782(var8, var1);
            if (var9 != null) {
               var4.add(var8);
            } else {
               Class7944.method26811("Invalid shader option: " + var8);
            }
         }

         return var4;
      } else {
         return var4;
      }
   }

   private static Class9458 method29669(String var0, Properties var1, Set<String> var2, Class6679[] var3) {
      String var6 = "profile.";
      String var7 = var6 + var0;
      if (!var2.contains(var7)) {
         var2.add(var0);
         Class9458 var8 = new Class9458(var0);
         String var9 = var1.getProperty(var7);
         String[] var10 = Class7944.method26903(var9, " ");

         for (int var11 = 0; var11 < var10.length; var11++) {
            String var12 = var10[var11];
            if (!var12.startsWith(var6)) {
               String[] var13 = Class7944.method26903(var12, ":=");
               if (var13.length != 1) {
                  if (var13.length == 2) {
                     String var14 = var13[0];
                     String var15 = var13[1];
                     Class6679 var16 = Class6817.method20782(var14, var3);
                     if (var16 != null) {
                        if (var16.method20384(var15)) {
                           var16.method20383(true);
                           var8.method36401(var14, var15);
                        } else {
                           Class7944.method26811("[Shaders] Invalid value: " + var12);
                        }
                     } else {
                        Class7944.method26811("[Shaders] Invalid option: " + var12);
                     }
                  } else {
                     Class7944.method26811("[Shaders] Invalid option value: " + var12);
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
                     Class6679 var17 = Class6817.method20782(var19, var3);
                     if (var17 instanceof Class6682) {
                        var8.method36401(var19, String.valueOf(var21));
                        var17.method20383(true);
                     } else {
                        Class7944.method26811("[Shaders] Invalid option: " + var19);
                     }
                  } else {
                     String var23 = var19.substring(var22.length());
                     if (Shaders.method33145(var23)) {
                        if (!var21) {
                           var8.method36406(var23);
                        } else {
                           var8.method36407(var23);
                        }
                     } else {
                        Class7944.method26811("Invalid program: " + var23 + " in profile: " + var8.method36400());
                     }
                  }
               }
            } else {
               String var18 = var12.substring(var6.length());
               Class9458 var20 = method29669(var18, var1, var2, var3);
               if (var8 != null) {
                  var8.method36402(var20);
                  var8.method36409(var20.method36408());
               }
            }
         }

         return var8;
      } else {
         Class7944.method26811("[Shaders] Profile already parsed: " + var0);
         return null;
      }
   }

   public static Map<String, Class8504> method29670(Properties var0, Class9458[] var1, Class6679[] var2) {
      HashMap var5 = new HashMap();
      method29671("screen", var0, var5, var1, var2);
      return !var5.isEmpty() ? var5 : null;
   }

   private static boolean method29671(String var0, Properties var1, Map<String, Class8504> var2, Class9458[] var3, Class6679[] var4) {
      String var7 = var1.getProperty(var0);
      if (var7 == null) {
         return false;
      } else {
         ArrayList<Class6679> var8 = new ArrayList();
         HashSet var9 = new HashSet();
         String[] var10 = Class7944.method26903(var7, " ");

         for (int var11 = 0; var11 < var10.length; var11++) {
            String var12 = var10[var11];
            if (!var12.equals("<empty>")) {
               if (!var9.contains(var12)) {
                  var9.add(var12);
                  if (!var12.equals("<profile>")) {
                     if (!var12.equals("*")) {
                        if (var12.startsWith("[") && var12.endsWith("]")) {
                           String var17 = Class9402.method35772(var12, "[", "]");
                           if (var17.matches("^[a-zA-Z0-9_]+$")) {
                              if (method29671("screen." + var17, var1, var2, var3, var4)) {
                                 Class6681 var14 = new Class6681(var17);
                                 var8.add(var14);
                              } else {
                                 Class7944.method26811("[Shaders] Invalid screen: " + var12 + ", key: " + var0);
                              }
                           } else {
                              Class7944.method26811("[Shaders] Invalid screen: " + var12 + ", key: " + var0);
                           }
                        } else {
                           Class6679 var13 = Class6817.method20782(var12, var4);
                           if (var13 != null) {
                              var13.method20383(true);
                              var8.add(var13);
                           } else {
                              Class7944.method26811("[Shaders] Invalid option: " + var12 + ", key: " + var0);
                              var8.add((Class6679)null);
                           }
                        }
                     } else {
                        Class6680 var18 = new Class6680("<rest>");
                        var8.add(var18);
                     }
                  } else if (var3 != null) {
                     Class6684 var19 = new Class6684(var3, var4);
                     var8.add(var19);
                  } else {
                     Class7944.method26811("[Shaders] Option profile can not be used, no profiles defined: " + var12 + ", key: " + var0);
                  }
               } else {
                  Class7944.method26811("[Shaders] Duplicate option: " + var12 + ", key: " + var0);
               }
            } else {
               var8.add((Class6679)null);
            }
         }

         Class6679[] var15 = var8.toArray(new Class6679[var8.size()]);
         String var16 = var1.getProperty(var0 + ".columns");
         int var20 = Class7944.method26899(var16, 2);
         Class8504 var21 = new Class8504(var0, var15, var20);
         var2.put(var0, var21);
         return true;
      }
   }

   public static BufferedReader method29672(BufferedReader var0, String var1, Class4671 var2, int var3, List<String> var4, int var5) throws IOException {
      String var8 = "/";
      int var9 = var1.lastIndexOf("/");
      if (var9 >= 0) {
         var8 = var1.substring(0, var9);
      }

      CharArrayWriter var10 = new CharArrayWriter();
      int var11 = -1;
      LinkedHashSet<Class8489> var12 = new LinkedHashSet();
      int var13 = 1;

      while (true) {
         String var14 = var0.readLine();
         if (var14 == null) {
            char[] var23 = var10.toCharArray();
            if (var11 >= 0 && var12.size() > 0) {
               StringBuilder var29 = new StringBuilder();

               for (Class8489 var37 : var12) {
                  var29.append("#define ");
                  var29.append(var37.method30066());
                  var29.append(" ");
                  var29.append(var37.method30067());
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
            Matcher var15 = field36157.matcher(var14);
            if (var15.matches()) {
               String var16 = Class4915.method15204() + Class4915.method15205();
               String var17 = var14 + "\n" + var16;
               String var18 = "#line " + (var13 + 1) + " " + var3;
               var14 = var17 + var18;
               var11 = var10.size() + var17.length();
            }
         }

         Matcher var22 = field36158.matcher(var14);
         if (var22.matches()) {
            String var24 = var22.group(1);
            boolean var31 = var24.startsWith("/");
            String var35 = !var31 ? var8 + "/" + var24 : "/shaders" + var24;
            if (!var4.contains(var35)) {
               var4.add(var35);
            }

            int var19 = var4.indexOf(var35) + 1;
            var14 = method29674(var35, var2, var19, var4, var5);
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

         if (var11 >= 0 && var14.contains(Class4915.method15202())) {
            Class8489[] var25 = method29673(var14, Class4915.method15203());

            for (int var32 = 0; var32 < var25.length; var32++) {
               Class8489 var36 = var25[var32];
               var12.add(var36);
            }
         }

         if (Shaders.method33169()) {
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

   private static Class8489[] method29673(String var0, Class8489[] var1) {
      ArrayList<Class8489> var4 = new ArrayList();

      for (int var5 = 0; var5 < var1.length; var5++) {
         Class8489 var6 = var1[var5];
         if (var0.contains(var6.method30066())) {
            var4.add(var6);
         }
      }

      return var4.toArray(new Class8489[var4.size()]);
   }

   private static String method29674(String var0, Class4671 var1, int var2, List<String> var3, int var4) throws IOException {
      if (var4 >= 10) {
         throw new IOException("#include depth exceeded: " + var4 + ", file: " + var0);
      } else {
         var4++;
         InputStream var7 = var1.method14639(var0);
         if (var7 == null) {
            return null;
         } else {
            InputStreamReader var8 = new InputStreamReader(var7, "ASCII");
            BufferedReader var9 = new BufferedReader(var8);
            var9 = method29672(var9, var0, var1, var2, var3, var4);
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

   public static Class8594 method29675(Properties var0) {
      String var3 = "uniform";
      String var4 = "variable";
      String var5 = var3 + ".";
      String var6 = var4 + ".";
      HashMap var7 = new HashMap();
      ArrayList<Class8943> var8 = new ArrayList();

      for (String var10 : (Set<String>)(Set) var0.keySet()) {
         String[] var11 = Class7944.method26903(var10, ".");
         if (var11.length == 3) {
            String var12 = var11[0];
            String var13 = var11[1];
            String var14 = var11[2];
            String var15 = var0.getProperty(var10).trim();
            if (!var7.containsKey(var14)) {
               if (var12.equals(var3) || var12.equals(var4)) {
                  Class7399.method23634("Custom " + var12 + ": " + var14);
                  Class8943 var16 = method29676(var12, var14, var13, var15, var7);
                  if (var16 != null) {
                     var7.put(var14, var16.method32679());
                     if (!var12.equals(var4)) {
                        var8.add(var16);
                     }
                  }
               }
            } else {
               Class7399.method23633("Expression already defined: " + var14);
            }
         }
      }

      if (var8.size() > 0) {
         Class8943[] var17 = var8.toArray(new Class8943[var8.size()]);
         return new Class8594(var17, var7);
      } else {
         return null;
      }
   }

   private static Class8943 method29676(String var0, String var1, String var2, String var3, Map<String, Class1878> var4) {
      try {
         Class2336 var7 = Class2336.method9114(var2);
         if (var7 == null) {
            Class7399.method23633("Unknown " + var0 + " type: " + var7);
            return null;
         } else {
            Class6268 var8 = new Class6268(var4);
            Class7344 var9 = new Class7344(var8);
            Class1878 var10 = var9.method23272(var3);
            Class2118 var11 = var10.method8139();
            if (!var7.method9113(var11)) {
               Class7399.method23633("Expression type does not match " + var0 + " type, expression: " + var11 + ", " + var0 + ": " + var7 + " " + var1);
               return null;
            } else {
               var10 = method29677(var10);
               return new Class8943(var1, var7, var10);
            }
         }
      } catch (Class2445 var12) {
         Class7399.method23633(var12.getClass().getName() + ": " + var12.getMessage());
         return null;
      }
   }

   private static Class1878 method29677(Class1878 var0) {
      if (!(var0 instanceof Class1884)) {
         return (Class1878)(!(var0 instanceof Class1879) ? var0 : new Class1881((Class1879)var0));
      } else {
         return new Class1883((Class1884)var0);
      }
   }

   public static void method29678(Properties var0) {
      for (String var4 : (Set<String>)(Set) var0.keySet()) {
         String[] var5 = Class7944.method26903(var4, ".");
         if (var5.length == 2) {
            String var6 = var5[0];
            String var7 = var5[1];
            if (var6.equals("alphaTest")) {
               Class7906 var8 = Shaders.method33146(var7);
               if (var8 != null) {
                  String var9 = var0.getProperty(var4).trim();
                  Class7675 var10 = method29679(var9);
                  if (var10 != null) {
                     var8.method26503(var10);
                  }
               } else {
                  Class7399.method23632("Invalid program name: " + var7);
               }
            }
         }
      }
   }

   public static Class7675 method29679(String var0) {
      if (var0 == null) {
         return null;
      } else {
         String[] var3 = Class7944.method26903(var0, " ");
         if (var3.length != 1) {
            if (var3.length == 2) {
               String var8 = var3[0];
               String var5 = var3[1];
               Integer var6 = field36160.get(var8);
               float var7 = Class7944.method26900(var5, -1.0F);
               if (var6 != null && var7 >= 0.0F) {
                  return new Class7675(true, var6, var7);
               }
            }
         } else {
            String var4 = var3[0];
            if (var4.equals("off") || var4.equals("false")) {
               return new Class7675(false);
            }
         }

         Class7399.method23632("Invalid alpha test: " + var0);
         return null;
      }
   }

   public static void method29680(Properties var0) {
      for (String var4 : (Set<String>)(Set) var0.keySet()) {
         String[] var5 = Class7944.method26903(var4, ".");
         if (var5.length == 2) {
            String var6 = var5[0];
            String var7 = var5[1];
            if (var6.equals("blend")) {
               Class7906 var8 = Shaders.method33146(var7);
               if (var8 != null) {
                  String var9 = var0.getProperty(var4).trim();
                  Class8069 var10 = method29681(var9);
                  if (var10 != null) {
                     var8.method26504(var10);
                  }
               } else {
                  Class7399.method23632("Invalid program name: " + var7);
               }
            }
         }
      }
   }

   public static Class8069 method29681(String var0) {
      if (var0 == null) {
         return null;
      } else {
         String[] var3 = Class7944.method26903(var0, " ");
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

               Integer var8 = field36161.get(var12);
               Integer var9 = field36161.get(var5);
               Integer var10 = field36161.get(var6);
               Integer var11 = field36161.get(var7);
               if (var8 != null && var9 != null && var10 != null && var11 != null) {
                  return new Class8069(true, var8, var9, var10, var11);
               }
            }
         } else {
            String var4 = var3[0];
            if (var4.equals("off") || var4.equals("false")) {
               return new Class8069(false);
            }
         }

         Class7399.method23632("Invalid blend mode: " + var0);
         return null;
      }
   }

   public static void method29682(Properties var0) {
      for (String var4 : (Set<String>)(Set) var0.keySet()) {
         String[] var5 = Class7944.method26903(var4, ".");
         if (var5.length == 2) {
            String var6 = var5[0];
            String var7 = var5[1];
            if (var6.equals("scale")) {
               Class7906 var8 = Shaders.method33146(var7);
               if (var8 != null) {
                  String var9 = var0.getProperty(var4).trim();
                  Class7125 var10 = method29683(var9);
                  if (var10 != null) {
                     var8.method26505(var10);
                  }
               } else {
                  Class7399.method23632("Invalid program name: " + var7);
               }
            }
         }
      }
   }

   private static Class7125 method29683(String var0) {
      String[] var3 = Class7944.method26903(var0, " ");
      float var4 = Class7944.method26900(var3[0], -1.0F);
      float var5 = 0.0F;
      float var6 = 0.0F;
      if (var3.length > 1) {
         if (var3.length != 3) {
            Class7399.method23632("Invalid render scale: " + var0);
            return null;
         }

         var5 = Class7944.method26900(var3[1], -1.0F);
         var6 = Class7944.method26900(var3[2], -1.0F);
      }

      if (Class7944.method26896(var4, 0.0F, 1.0F) && Class7944.method26896(var5, 0.0F, 1.0F) && Class7944.method26896(var6, 0.0F, 1.0F)) {
         return new Class7125(var4, var5, var6);
      } else {
         Class7399.method23632("Invalid render scale: " + var0);
         return null;
      }
   }

   public static void method29684(Properties var0) {
      for (String var4 : (Set<String>)(Set) var0.keySet()) {
         String[] var5 = Class7944.method26903(var4, ".");
         if (var5.length == 3) {
            String var6 = var5[0];
            String var7 = var5[1];
            String var8 = var5[2];
            if (var6.equals("flip")) {
               Class7906 var9 = Shaders.method33146(var7);
               if (var9 != null) {
                  Boolean[] var10 = var9.method26495();
                  int var11 = Shaders.method33028(var8);
                  if (var11 >= 0 && var11 < var10.length) {
                     String var12 = var0.getProperty(var4).trim();
                     Boolean var13 = Class7944.method26902(var12, (Boolean)null);
                     if (var13 != null) {
                        var10[var11] = var13;
                     } else {
                        Class7399.method23632("Invalid boolean value: " + var12);
                     }
                  } else {
                     Class7399.method23632("Invalid buffer name: " + var8);
                  }
               } else {
                  Class7399.method23632("Invalid program name: " + var7);
               }
            }
         }
      }
   }

   private static Map<String, Integer> method29685() {
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

   private static Map<String, Integer> method29686() {
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
