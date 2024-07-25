package remapped;

public class class_244 {
   private static String field_845 = "MC_";
   public static final String field_840 = "MC_VERSION";
   public static final String field_848 = "MC_GL_VERSION";
   public static final String field_853 = "MC_GLSL_VERSION";
   public static final String field_846 = "MC_OS_WINDOWS";
   public static final String field_851 = "MC_OS_MAC";
   public static final String field_838 = "MC_OS_LINUX";
   public static final String field_833 = "MC_OS_OTHER";
   public static final String field_854 = "MC_GL_VENDOR_ATI";
   public static final String field_852 = "MC_GL_VENDOR_INTEL";
   public static final String field_830 = "MC_GL_VENDOR_NVIDIA";
   public static final String field_839 = "MC_GL_VENDOR_XORG";
   public static final String field_855 = "MC_GL_VENDOR_OTHER";
   public static final String field_850 = "MC_GL_RENDERER_RADEON";
   public static final String field_841 = "MC_GL_RENDERER_GEFORCE";
   public static final String field_829 = "MC_GL_RENDERER_QUADRO";
   public static final String field_843 = "MC_GL_RENDERER_INTEL";
   public static final String field_827 = "MC_GL_RENDERER_GALLIUM";
   public static final String field_831 = "MC_GL_RENDERER_MESA";
   public static final String field_832 = "MC_GL_RENDERER_OTHER";
   public static final String field_842 = "MC_FXAA_LEVEL";
   public static final String field_849 = "MC_NORMAL_MAP";
   public static final String field_847 = "MC_SPECULAR_MAP";
   public static final String field_844 = "MC_RENDER_QUALITY";
   public static final String field_836 = "MC_SHADOW_QUALITY";
   public static final String field_828 = "MC_HAND_DEPTH";
   public static final String field_835 = "MC_OLD_HAND_LIGHT";
   public static final String field_834 = "MC_OLD_LIGHTING";
   private static class_4789[] field_837;

   public static String method_1063() {
      OperatingSystem var2 = Util.getOperatingSystem();
      switch (var2) {
         case WINDOWS:
            return "MC_OS_WINDOWS";
         case OSX:
            return "MC_OS_MAC";
         case LINUX:
            return "MC_OS_LINUX";
         default:
            return "MC_OS_OTHER";
      }
   }

   public static String method_1065() {
      String var2 = Config.field_15479;
      if (var2 != null) {
         var2 = var2.toLowerCase();
         if (!var2.startsWith("ati")) {
            if (!var2.startsWith("intel")) {
               if (!var2.startsWith("nvidia")) {
                  return !var2.startsWith("x.org") ? "MC_GL_VENDOR_OTHER" : "MC_GL_VENDOR_XORG";
               } else {
                  return "MC_GL_VENDOR_NVIDIA";
               }
            } else {
               return "MC_GL_VENDOR_INTEL";
            }
         } else {
            return "MC_GL_VENDOR_ATI";
         }
      } else {
         return "MC_GL_VENDOR_OTHER";
      }
   }

   public static String method_1064() {
      String var2 = Config.field_15458;
      if (var2 != null) {
         var2 = var2.toLowerCase();
         if (!var2.startsWith("amd")) {
            if (!var2.startsWith("ati")) {
               if (!var2.startsWith("radeon")) {
                  if (!var2.startsWith("gallium")) {
                     if (!var2.startsWith("intel")) {
                        if (!var2.startsWith("geforce")) {
                           if (!var2.startsWith("nvidia")) {
                              if (!var2.startsWith("quadro")) {
                                 if (!var2.startsWith("nvs")) {
                                    return !var2.startsWith("mesa") ? "MC_GL_RENDERER_OTHER" : "MC_GL_RENDERER_MESA";
                                 } else {
                                    return "MC_GL_RENDERER_QUADRO";
                                 }
                              } else {
                                 return "MC_GL_RENDERER_QUADRO";
                              }
                           } else {
                              return "MC_GL_RENDERER_GEFORCE";
                           }
                        } else {
                           return "MC_GL_RENDERER_GEFORCE";
                        }
                     } else {
                        return "MC_GL_RENDERER_INTEL";
                     }
                  } else {
                     return "MC_GL_RENDERER_GALLIUM";
                  }
               } else {
                  return "MC_GL_RENDERER_RADEON";
               }
            } else {
               return "MC_GL_RENDERER_RADEON";
            }
         } else {
            return "MC_GL_RENDERER_RADEON";
         }
      } else {
         return "MC_GL_RENDERER_OTHER";
      }
   }

   public static String method_1067() {
      return field_845;
   }

   public static class_4789[] method_1069() {
      if (field_837 == null) {
         String[] var2 = Config.method_14381();
         class_4789[] var3 = new class_4789[var2.length];

         for (int var4 = 0; var4 < var2.length; var4++) {
            var3[var4] = new class_4789(field_845 + var2[var4], "");
         }

         field_837 = var3;
      }

      return field_837;
   }

   public static String method_1062() {
      StringBuilder var2 = new StringBuilder();
      method_1061(var2, "MC_VERSION", Config.method_14330());
      method_1059(var2, "MC_GL_VERSION " + Config.method_14311().method_11608());
      method_1059(var2, "MC_GLSL_VERSION " + Config.method_14269().method_11608());
      method_1059(var2, method_1063());
      method_1059(var2, method_1065());
      method_1059(var2, method_1064());
      return var2.toString();
   }

   public static String method_1066() {
      StringBuilder var2 = new StringBuilder();
      if (class_6588.field_33631 > 0) {
         method_1061(var2, "MC_FXAA_LEVEL", class_6588.field_33631);
      }

      if (class_6588.field_33603) {
         method_1059(var2, "MC_NORMAL_MAP");
      }

      if (class_6588.field_33634) {
         method_1059(var2, "MC_SPECULAR_MAP");
      }

      method_1060(var2, "MC_RENDER_QUALITY", class_6588.field_33825);
      method_1060(var2, "MC_SHADOW_QUALITY", class_6588.field_33763);
      method_1060(var2, "MC_HAND_DEPTH", class_6588.field_33751);
      if (class_6588.method_30164()) {
         method_1059(var2, "MC_OLD_HAND_LIGHT");
      }

      if (class_6588.method_30109()) {
         method_1059(var2, "MC_OLD_LIGHTING");
      }

      return var2.toString();
   }

   private static void method_1061(StringBuilder var0, String var1, int var2) {
      var0.append("#define ");
      var0.append(var1);
      var0.append(" ");
      var0.append(var2);
      var0.append("\n");
   }

   private static void method_1060(StringBuilder var0, String var1, float var2) {
      var0.append("#define ");
      var0.append(var1);
      var0.append(" ");
      var0.append(var2);
      var0.append("\n");
   }

   private static void method_1059(StringBuilder var0, String var1) {
      var0.append("#define ");
      var0.append(var1);
      var0.append("\n");
   }
}
