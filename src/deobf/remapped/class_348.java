package remapped;

import java.util.Locale;

public class class_348 {
   private static class_348 field_1368;
   private final int field_1369;
   private final int field_1364;
   private final int field_1363;
   private final int field_1361;
   private final int field_1366;
   private final boolean field_1362;
   private final boolean field_1367;

   private class_348(boolean var1, boolean var2, int var3, int var4, int var5, int var6, int var7) {
      this.field_1362 = var1;
      this.field_1369 = var3;
      this.field_1363 = var4;
      this.field_1364 = var5;
      this.field_1361 = var6;
      this.field_1367 = var2;
      this.field_1366 = var7;
   }

   public class_348() {
      this(false, true, 1, 0, 1, 0, 32774);
   }

   public class_348(int var1, int var2, int var3) {
      this(false, false, var1, var2, var1, var2, var3);
   }

   public class_348(int var1, int var2, int var3, int var4, int var5) {
      this(true, false, var1, var2, var3, var4, var5);
   }

   public void method_1769() {
      if (!this.equals(field_1368)) {
         if (field_1368 == null || this.field_1367 != field_1368.method_1772()) {
            field_1368 = this;
            if (this.field_1367) {
               RenderSystem.method_16448();
               return;
            }

            RenderSystem.enableBlend();
         }

         RenderSystem.method_16401(this.field_1366);
         if (!this.field_1362) {
            RenderSystem.method_16397(this.field_1369, this.field_1363);
         } else {
            RenderSystem.method_16424(this.field_1369, this.field_1363, this.field_1364, this.field_1361);
         }
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 instanceof class_348) {
            class_348 var4 = (class_348)var1;
            if (this.field_1366 == var4.field_1366) {
               if (this.field_1361 == var4.field_1361) {
                  if (this.field_1363 == var4.field_1363) {
                     if (this.field_1367 == var4.field_1367) {
                        if (this.field_1362 == var4.field_1362) {
                           return this.field_1364 == var4.field_1364 ? this.field_1369 == var4.field_1369 : false;
                        } else {
                           return false;
                        }
                     } else {
                        return false;
                     }
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field_1369;
      var3 = 31 * var3 + this.field_1364;
      var3 = 31 * var3 + this.field_1363;
      var3 = 31 * var3 + this.field_1361;
      var3 = 31 * var3 + this.field_1366;
      var3 = 31 * var3 + (!this.field_1362 ? 0 : 1);
      return 31 * var3 + (!this.field_1367 ? 0 : 1);
   }

   public boolean method_1772() {
      return this.field_1367;
   }

   public static int method_1771(String var0) {
      String var3 = var0.trim().toLowerCase(Locale.ROOT);
      if (!"add".equals(var3)) {
         if (!"subtract".equals(var3)) {
            if (!"reversesubtract".equals(var3)) {
               if (!"reverse_subtract".equals(var3)) {
                  if (!"min".equals(var3)) {
                     return !"max".equals(var3) ? 32774 : 32776;
                  } else {
                     return 32775;
                  }
               } else {
                  return 32779;
               }
            } else {
               return 32779;
            }
         } else {
            return 32778;
         }
      } else {
         return 32774;
      }
   }

   public static int method_1768(String var0) {
      String var3 = var0.trim().toLowerCase(Locale.ROOT);
      var3 = var3.replaceAll("_", "");
      var3 = var3.replaceAll("one", "1");
      var3 = var3.replaceAll("zero", "0");
      var3 = var3.replaceAll("minus", "-");
      if (!"0".equals(var3)) {
         if (!"1".equals(var3)) {
            if (!"srccolor".equals(var3)) {
               if (!"1-srccolor".equals(var3)) {
                  if (!"dstcolor".equals(var3)) {
                     if (!"1-dstcolor".equals(var3)) {
                        if (!"srcalpha".equals(var3)) {
                           if (!"1-srcalpha".equals(var3)) {
                              if (!"dstalpha".equals(var3)) {
                                 return !"1-dstalpha".equals(var3) ? -1 : 773;
                              } else {
                                 return 772;
                              }
                           } else {
                              return 771;
                           }
                        } else {
                           return 770;
                        }
                     } else {
                        return 775;
                     }
                  } else {
                     return 774;
                  }
               } else {
                  return 769;
               }
            } else {
               return 768;
            }
         } else {
            return 1;
         }
      } else {
         return 0;
      }
   }
}
