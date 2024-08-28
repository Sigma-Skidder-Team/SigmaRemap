package mapped;

import java.util.Locale;

public class Class5869 {
   private static Class5869 field25646;
   private final int field25647;
   private final int field25648;
   private final int field25649;
   private final int field25650;
   private final int field25651;
   private final boolean field25652;
   private final boolean field25653;

   private Class5869(boolean var1, boolean var2, int var3, int var4, int var5, int var6, int var7) {
      this.field25652 = var1;
      this.field25647 = var3;
      this.field25649 = var4;
      this.field25648 = var5;
      this.field25650 = var6;
      this.field25653 = var2;
      this.field25651 = var7;
   }

   public Class5869() {
      this(false, true, 1, 0, 1, 0, 32774);
   }

   public Class5869(int var1, int var2, int var3) {
      this(false, false, var1, var2, var1, var2, var3);
   }

   public Class5869(int var1, int var2, int var3, int var4, int var5) {
      this(true, false, var1, var2, var3, var4, var5);
   }

   public void method18285() {
      if (!this.equals(field25646)) {
         if (field25646 == null || this.field25653 != field25646.method18286()) {
            field25646 = this;
            if (this.field25653) {
               RenderSystem.disableBlend();
               return;
            }

            RenderSystem.enableBlend();
         }

         RenderSystem.method27838(this.field25651);
         if (!this.field25652) {
            RenderSystem.method27835(this.field25647, this.field25649);
         } else {
            RenderSystem.method27837(this.field25647, this.field25649, this.field25648, this.field25650);
         }
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 instanceof Class5869) {
            Class5869 var4 = (Class5869)var1;
            if (this.field25651 == var4.field25651) {
               if (this.field25650 == var4.field25650) {
                  if (this.field25649 == var4.field25649) {
                     if (this.field25653 == var4.field25653) {
                        if (this.field25652 == var4.field25652) {
                           return this.field25648 == var4.field25648 ? this.field25647 == var4.field25647 : false;
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
      int var3 = this.field25647;
      var3 = 31 * var3 + this.field25648;
      var3 = 31 * var3 + this.field25649;
      var3 = 31 * var3 + this.field25650;
      var3 = 31 * var3 + this.field25651;
      var3 = 31 * var3 + (!this.field25652 ? 0 : 1);
      return 31 * var3 + (!this.field25653 ? 0 : 1);
   }

   public boolean method18286() {
      return this.field25653;
   }

   public static int method18287(String var0) {
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

   public static int method18288(String var0) {
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
