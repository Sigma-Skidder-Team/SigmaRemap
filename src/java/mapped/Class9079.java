package mapped;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.Util;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.CharacterManager;
import net.minecraft.util.text.TextFormatting;

public class Class9079 {
   private final Supplier<String> field41558;
   private final Consumer<String> field41559;
   private final Supplier<String> field41560;
   private final Consumer<String> field41561;
   private final Predicate<String> field41562;
   private int field41563;
   private int field41564;

   public Class9079(Supplier<String> var1, Consumer<String> var2, Supplier<String> var3, Consumer<String> var4, Predicate<String> var5) {
      this.field41558 = var1;
      this.field41559 = var2;
      this.field41560 = var3;
      this.field41561 = var4;
      this.field41562 = var5;
      this.method33847();
   }

   public static Supplier<String> method33827(Minecraft var0) {
      return () -> method33828(var0);
   }

   public static String method33828(Minecraft var0) {
      return TextFormatting.getTextWithoutFormattingCodes(var0.keyboardListener.method36349().replaceAll("\\r", ""));
   }

   public static Consumer<String> method33829(Minecraft var0) {
      return var1 -> method33830(var0, var1);
   }

   public static void method33830(Minecraft var0, String var1) {
      var0.keyboardListener.method36350(var1);
   }

   public boolean method33831(char var1) {
      if (SharedConstants.isAllowedCharacter(var1)) {
         this.method33834(this.field41558.get(), Character.toString(var1));
      }

      return true;
   }

   public boolean method33832(int var1) {
      if (!Screen.method2481(var1)) {
         if (!Screen.method2480(var1)) {
            if (!Screen.method2479(var1)) {
               if (!Screen.method2478(var1)) {
                  if (var1 != 259) {
                     if (var1 != 261) {
                        if (var1 == 263) {
                           if (!Screen.hasControlDown()) {
                              this.method33837(-1, Screen.method2476());
                           } else {
                              this.method33838(-1, Screen.method2476());
                           }

                           return true;
                        }

                        if (var1 == 262) {
                           if (!Screen.hasControlDown()) {
                              this.method33837(1, Screen.method2476());
                           } else {
                              this.method33838(1, Screen.method2476());
                           }

                           return true;
                        }

                        if (var1 == 268) {
                           this.method33846(Screen.method2476());
                           return true;
                        }

                        if (var1 == 269) {
                           this.method33848(Screen.method2476());
                           return true;
                        }
                     } else {
                        this.method33839(1);
                     }

                     return false;
                  } else {
                     this.method33839(-1);
                     return true;
                  }
               } else {
                  this.method33840();
                  return true;
               }
            } else {
               this.method33841();
               return true;
            }
         } else {
            this.method33842();
            return true;
         }
      } else {
         this.method33843();
         return true;
      }
   }

   private int method33833(int var1) {
      return MathHelper.method37775(var1, 0, this.field41558.get().length());
   }

   private void method33834(String var1, String var2) {
      if (this.field41564 != this.field41563) {
         var1 = this.method33845(var1);
      }

      this.field41563 = MathHelper.method37775(this.field41563, 0, var1.length());
      String var5 = new StringBuilder(var1).insert(this.field41563, var2).toString();
      if (this.field41562.test(var5)) {
         this.field41559.accept(var5);
         this.field41564 = this.field41563 = Math.min(var5.length(), this.field41563 + var2.length());
      }
   }

   public void method33835(String var1) {
      this.method33834(this.field41558.get(), var1);
   }

   private void method33836(boolean var1) {
      if (!var1) {
         this.field41564 = this.field41563;
      }
   }

   public void method33837(int var1, boolean var2) {
      this.field41563 = Util.method38528(this.field41558.get(), this.field41563, var1);
      this.method33836(var2);
   }

   public void method33838(int var1, boolean var2) {
      this.field41563 = CharacterManager.func_238351_a_(this.field41558.get(), var1, this.field41563, true);
      this.method33836(var2);
   }

   public void method33839(int var1) {
      String var4 = this.field41558.get();
      if (!var4.isEmpty()) {
         String var8;
         if (this.field41564 == this.field41563) {
            int var5 = Util.method38528(var4, this.field41563, var1);
            int var6 = Math.min(var5, this.field41563);
            int var7 = Math.max(var5, this.field41563);
            var8 = new StringBuilder(var4).delete(var6, var7).toString();
            if (var1 < 0) {
               this.field41564 = this.field41563 = var6;
            }
         } else {
            var8 = this.method33845(var4);
         }

         this.field41559.accept(var8);
      }
   }

   public void method33840() {
      String var3 = this.field41558.get();
      this.field41561.accept(this.method33844(var3));
      this.field41559.accept(this.method33845(var3));
   }

   public void method33841() {
      this.method33834(this.field41558.get(), this.field41560.get());
      this.field41564 = this.field41563;
   }

   public void method33842() {
      this.field41561.accept(this.method33844(this.field41558.get()));
   }

   public void method33843() {
      this.field41564 = 0;
      this.field41563 = this.field41558.get().length();
   }

   private String method33844(String var1) {
      int var4 = Math.min(this.field41563, this.field41564);
      int var5 = Math.max(this.field41563, this.field41564);
      return var1.substring(var4, var5);
   }

   private String method33845(String var1) {
      if (this.field41564 != this.field41563) {
         int var4 = Math.min(this.field41563, this.field41564);
         int var5 = Math.max(this.field41563, this.field41564);
         String var6 = var1.substring(0, var4) + var1.substring(var5);
         this.field41564 = this.field41563 = var4;
         return var6;
      } else {
         return var1;
      }
   }

   private void method33846(boolean var1) {
      this.field41563 = 0;
      this.method33836(var1);
   }

   public void method33847() {
      this.method33848(false);
   }

   private void method33848(boolean var1) {
      this.field41563 = this.field41558.get().length();
      this.method33836(var1);
   }

   public int method33849() {
      return this.field41563;
   }

   public void method33850(int var1, boolean var2) {
      this.field41563 = this.method33833(var1);
      this.method33836(var2);
   }

   public int method33851() {
      return this.field41564;
   }

   public void method33852(int var1, int var2) {
      int var5 = this.field41558.get().length();
      this.field41563 = MathHelper.method37775(var1, 0, var5);
      this.field41564 = MathHelper.method37775(var2, 0, var5);
   }

   public boolean method33853() {
      return this.field41563 != this.field41564;
   }
}
