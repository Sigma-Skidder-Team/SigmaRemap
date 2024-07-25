package remapped;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import net.minecraft.util.text.CharacterManager;
import net.minecraft.util.text.TextFormatting;

public class class_6935 {
   private final Supplier<String> field_35649;
   private final Consumer<String> field_35650;
   private final Supplier<String> field_35652;
   private final Consumer<String> field_35647;
   private final Predicate<String> field_35645;
   private int field_35648;
   private int field_35646;

   public class_6935(Supplier<String> var1, Consumer<String> var2, Supplier<String> var3, Consumer<String> var4, Predicate<String> var5) {
      this.field_35649 = var1;
      this.field_35650 = var2;
      this.field_35652 = var3;
      this.field_35647 = var4;
      this.field_35645 = var5;
      this.method_31721();
   }

   public static Supplier<String> method_31712(class_1893 var0) {
      return () -> method_31717(var0);
   }

   public static String method_31717(class_1893 var0) {
      return TextFormatting.getTextWithoutFormattingCodes(var0.field_9600.method_38883().replaceAll("\\r", ""));
   }

   public static Consumer<String> method_31713(class_1893 var0) {
      return var1 -> method_31728(var0, var1);
   }

   public static void method_31728(class_1893 var0, String var1) {
      var0.field_9600.method_38891(var1);
   }

   public boolean method_31714(char var1) {
      if (class_7665.method_34675(var1)) {
         this.method_31719(this.field_35649.get(), Character.toString(var1));
      }

      return true;
   }

   public boolean method_31732(int var1) {
      if (!class_266.method_1174(var1)) {
         if (!class_266.method_1182(var1)) {
            if (!class_266.method_1173(var1)) {
               if (!class_266.method_1166(var1)) {
                  if (var1 != 259) {
                     if (var1 != 261) {
                        if (var1 == 263) {
                           if (!class_266.method_1185()) {
                              this.method_31706(-1, class_266.method_1190());
                           } else {
                              this.method_31725(-1, class_266.method_1190());
                           }

                           return true;
                        }

                        if (var1 == 262) {
                           if (!class_266.method_1185()) {
                              this.method_31706(1, class_266.method_1190());
                           } else {
                              this.method_31725(1, class_266.method_1190());
                           }

                           return true;
                        }

                        if (var1 == 268) {
                           this.method_31708(class_266.method_1190());
                           return true;
                        }

                        if (var1 == 269) {
                           this.method_31722(class_266.method_1190());
                           return true;
                        }
                     } else {
                        this.method_31726(1);
                     }

                     return false;
                  } else {
                     this.method_31726(-1);
                     return true;
                  }
               } else {
                  this.method_31709();
                  return true;
               }
            } else {
               this.method_31727();
               return true;
            }
         } else {
            this.method_31707();
            return true;
         }
      } else {
         this.method_31724();
         return true;
      }
   }

   private int method_31711(int var1) {
      return class_9299.method_42829(var1, 0, this.field_35649.get().length());
   }

   private void method_31719(String var1, String var2) {
      if (this.field_35646 != this.field_35648) {
         var1 = this.method_31715(var1);
      }

      this.field_35648 = class_9299.method_42829(this.field_35648, 0, var1.length());
      String var5 = new StringBuilder(var1).insert(this.field_35648, var2).toString();
      if (this.field_35645.test(var5)) {
         this.field_35650.accept(var5);
         this.field_35646 = this.field_35648 = Math.min(var5.length(), this.field_35648 + var2.length());
      }
   }

   public void method_31705(String var1) {
      this.method_31719(this.field_35649.get(), var1);
   }

   private void method_31710(boolean var1) {
      if (!var1) {
         this.field_35646 = this.field_35648;
      }
   }

   public void method_31706(int var1, boolean var2) {
      this.field_35648 = class_9665.method_44662(this.field_35649.get(), this.field_35648, var1);
      this.method_31710(var2);
   }

   public void method_31725(int var1, boolean var2) {
      this.field_35648 = CharacterManager.func_238351_a_(this.field_35649.get(), var1, this.field_35648, true);
      this.method_31710(var2);
   }

   public void method_31726(int var1) {
      String var4 = this.field_35649.get();
      if (!var4.isEmpty()) {
         String var8;
         if (this.field_35646 == this.field_35648) {
            int var5 = class_9665.method_44662(var4, this.field_35648, var1);
            int var6 = Math.min(var5, this.field_35648);
            int var7 = Math.max(var5, this.field_35648);
            var8 = new StringBuilder(var4).delete(var6, var7).toString();
            if (var1 < 0) {
               this.field_35646 = this.field_35648 = var6;
            }
         } else {
            var8 = this.method_31715(var4);
         }

         this.field_35650.accept(var8);
      }
   }

   public void method_31709() {
      String var3 = this.field_35649.get();
      this.field_35647.accept(this.method_31723(var3));
      this.field_35650.accept(this.method_31715(var3));
   }

   public void method_31727() {
      this.method_31719(this.field_35649.get(), this.field_35652.get());
      this.field_35646 = this.field_35648;
   }

   public void method_31707() {
      this.field_35647.accept(this.method_31723(this.field_35649.get()));
   }

   public void method_31724() {
      this.field_35646 = 0;
      this.field_35648 = this.field_35649.get().length();
   }

   private String method_31723(String var1) {
      int var4 = Math.min(this.field_35648, this.field_35646);
      int var5 = Math.max(this.field_35648, this.field_35646);
      return var1.substring(var4, var5);
   }

   private String method_31715(String var1) {
      if (this.field_35646 != this.field_35648) {
         int var4 = Math.min(this.field_35648, this.field_35646);
         int var5 = Math.max(this.field_35648, this.field_35646);
         String var6 = var1.substring(0, var4) + var1.substring(var5);
         this.field_35646 = this.field_35648 = var4;
         return var6;
      } else {
         return var1;
      }
   }

   private void method_31708(boolean var1) {
      this.field_35648 = 0;
      this.method_31710(var1);
   }

   public void method_31721() {
      this.method_31722(false);
   }

   private void method_31722(boolean var1) {
      this.field_35648 = this.field_35649.get().length();
      this.method_31710(var1);
   }

   public int method_31729() {
      return this.field_35648;
   }

   public void method_31731(int var1, boolean var2) {
      this.field_35648 = this.method_31711(var1);
      this.method_31710(var2);
   }

   public int method_31716() {
      return this.field_35646;
   }

   public void method_31730(int var1, int var2) {
      int var5 = this.field_35649.get().length();
      this.field_35648 = class_9299.method_42829(var1, 0, var5);
      this.field_35646 = class_9299.method_42829(var2, 0, var5);
   }

   public boolean method_31720() {
      return this.field_35648 != this.field_35646;
   }
}
