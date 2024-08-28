package mapped;

public class Class4915 {
   private static String field22781 = "MC_";
   public static final String field22782 = "MC_VERSION";
   public static final String field22783 = "MC_GL_VERSION";
   public static final String field22784 = "MC_GLSL_VERSION";
   public static final String field22785 = "MC_OS_WINDOWS";
   public static final String field22786 = "MC_OS_MAC";
   public static final String field22787 = "MC_OS_LINUX";
   public static final String field22788 = "MC_OS_OTHER";
   public static final String field22789 = "MC_GL_VENDOR_ATI";
   public static final String field22790 = "MC_GL_VENDOR_INTEL";
   public static final String field22791 = "MC_GL_VENDOR_NVIDIA";
   public static final String field22792 = "MC_GL_VENDOR_XORG";
   public static final String field22793 = "MC_GL_VENDOR_OTHER";
   public static final String field22794 = "MC_GL_RENDERER_RADEON";
   public static final String field22795 = "MC_GL_RENDERER_GEFORCE";
   public static final String field22796 = "MC_GL_RENDERER_QUADRO";
   public static final String field22797 = "MC_GL_RENDERER_INTEL";
   public static final String field22798 = "MC_GL_RENDERER_GALLIUM";
   public static final String field22799 = "MC_GL_RENDERER_MESA";
   public static final String field22800 = "MC_GL_RENDERER_OTHER";
   public static final String field22801 = "MC_FXAA_LEVEL";
   public static final String field22802 = "MC_NORMAL_MAP";
   public static final String field22803 = "MC_SPECULAR_MAP";
   public static final String field22804 = "MC_RENDER_QUALITY";
   public static final String field22805 = "MC_SHADOW_QUALITY";
   public static final String field22806 = "MC_HAND_DEPTH";
   public static final String field22807 = "MC_OLD_HAND_LIGHT";
   public static final String field22808 = "MC_OLD_LIGHTING";
   private static Class8489[] field22809;

   public static String method15199() {
      OS var2 = Util.getOSType();
      switch (Class9720.field45412[var2.ordinal()]) {
         case 1:
            return "MC_OS_WINDOWS";
         case 2:
            return "MC_OS_MAC";
         case 3:
            return "MC_OS_LINUX";
         default:
            return "MC_OS_OTHER";
      }
   }

   public static String method15200() {
      String var2 = Class7944.field34149;
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

   public static String method15201() {
      String var2 = Class7944.field34148;
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

   public static String method15202() {
      return field22781;
   }

   public static Class8489[] method15203() {
      if (field22809 == null) {
         String[] var2 = Class7944.method26793();
         Class8489[] var3 = new Class8489[var2.length];

         for (int var4 = 0; var4 < var2.length; var4++) {
            var3[var4] = new Class8489(field22781 + var2[var4], "");
         }

         field22809 = var3;
      }

      return field22809;
   }

   public static String method15204() {
      StringBuilder var2 = new StringBuilder();
      method15206(var2, "MC_VERSION", Class7944.method26787());
      method15208(var2, "MC_GL_VERSION " + Class7944.method26790().method25565());
      method15208(var2, "MC_GLSL_VERSION " + Class7944.method26791().method25565());
      method15208(var2, method15199());
      method15208(var2, method15200());
      method15208(var2, method15201());
      return var2.toString();
   }

   public static String method15205() {
      StringBuilder var2 = new StringBuilder();
      if (Class8981.field40878 > 0) {
         method15206(var2, "MC_FXAA_LEVEL", Class8981.field40878);
      }

      if (Class8981.field40874) {
         method15208(var2, "MC_NORMAL_MAP");
      }

      if (Class8981.field40875) {
         method15208(var2, "MC_SPECULAR_MAP");
      }

      method15207(var2, "MC_RENDER_QUALITY", Class8981.field40865);
      method15207(var2, "MC_SHADOW_QUALITY", Class8981.field40866);
      method15207(var2, "MC_HAND_DEPTH", Class8981.field40864);
      if (Class8981.method32993()) {
         method15208(var2, "MC_OLD_HAND_LIGHT");
      }

      if (Class8981.method32995()) {
         method15208(var2, "MC_OLD_LIGHTING");
      }

      return var2.toString();
   }

   private static void method15206(StringBuilder var0, String var1, int var2) {
      var0.append("#define ");
      var0.append(var1);
      var0.append(" ");
      var0.append(var2);
      var0.append("\n");
   }

   private static void method15207(StringBuilder var0, String var1, float var2) {
      var0.append("#define ");
      var0.append(var1);
      var0.append(" ");
      var0.append(var2);
      var0.append("\n");
   }

   private static void method15208(StringBuilder var0, String var1) {
      var0.append("#define ");
      var0.append(var1);
      var0.append("\n");
   }
}
