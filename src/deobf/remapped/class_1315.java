package remapped;

import java.util.function.Predicate;

public class class_1315 {
   private static String[] field_7255;
   private static final class_2874<class_2522> field_7259 = new class_9554<class_2522>(class_6414.field_32758, class_4783.field_23184.method_29260());
   private final int field_7256;
   private short field_7260;
   private short field_7261;
   private short field_7258;
   private final class_5427<class_2522> field_7262;
   public static final ThreadLocal<class_6215> field_7257 = new ThreadLocal<class_6215>();

   public class_1315(int var1) {
      this(var1, (short)0, (short)0, (short)0);
   }

   public class_1315(int var1, short var2, short var3, short var4) {
      this.field_7256 = var1;
      this.field_7260 = var2;
      this.field_7261 = var3;
      this.field_7258 = var4;
      this.field_7262 = new class_5427<class_2522>(
         field_7259, class_6414.field_32758, class_4338::method_20185, class_4338::method_20187, class_4783.field_23184.method_29260()
      );
   }

   public class_2522 method_5999(int var1, int var2, int var3) {
      return this.field_7262.method_24689(var1, var2, var3);
   }

   public class_4774 method_5986(int var1, int var2, int var3) {
      return this.field_7262.method_24689(var1, var2, var3).method_8364();
   }

   public void method_5992() {
      this.field_7262.method_24691();
   }

   public void method_5987() {
      this.field_7262.method_24687();
   }

   public class_2522 method_5988(int var1, int var2, int var3, class_2522 var4) {
      return this.method_5989(var1, var2, var3, var4, true);
   }

   public class_2522 method_5989(int var1, int var2, int var3, class_2522 var4, boolean var5) {
      class_2522 var8;
      if (!var5) {
         var8 = this.field_7262.method_24678(var1, var2, var3, var4);
      } else {
         var8 = this.field_7262.method_24677(var1, var2, var3, var4);
      }

      class_4774 var9 = var8.method_8364();
      class_4774 var10 = var4.method_8364();
      if (!var8.method_8345()) {
         this.field_7260--;
         if (var8.method_8331()) {
            this.field_7261--;
         }
      }

      if (!var9.method_22001()) {
         this.field_7258--;
      }

      if (!var4.method_8345()) {
         this.field_7260++;
         if (var4.method_8331()) {
            this.field_7261++;
         }
      }

      if (!var10.method_22001()) {
         this.field_7258++;
      }

      return var8;
   }

   public boolean method_6002() {
      return this.field_7260 == 0;
   }

   public static boolean method_6003(class_1315 var0) {
      return var0 == class_2654.field_13073 || var0.method_6002();
   }

   public boolean method_5994() {
      return this.method_6000() || this.method_6007();
   }

   public boolean method_6000() {
      return this.field_7261 > 0;
   }

   public boolean method_6007() {
      return this.field_7258 > 0;
   }

   public int method_5997() {
      return this.field_7256;
   }

   public void method_6005() {
      class_6215 var3 = field_7257.get();
      if (var3 != null) {
         class_6274[] var4 = var3.method_28428();
         if (var4 != null) {
            int var5 = this.field_7256 >> 4;
            if (var5 >= 0 && var5 < var4.length) {
               class_6274 var6 = var4[var5];
               if (var6 != null) {
                  this.field_7260 = var6.method_28609();
                  this.field_7261 = var6.method_28607();
                  this.field_7258 = var6.method_28608();
                  var4[var5] = null;
                  return;
               }
            }
         }
      }

      this.field_7260 = 0;
      this.field_7261 = 0;
      this.field_7258 = 0;
      this.field_7262.method_24681((var1, var2) -> {
         class_4774 var5x = var1.method_8364();
         if (!var1.method_8345()) {
            this.field_7260 = (short)(this.field_7260 + var2);
            if (var1.method_8331()) {
               this.field_7261 = (short)(this.field_7261 + var2);
            }
         }

         if (!var5x.method_22001()) {
            this.field_7260 = (short)(this.field_7260 + var2);
            if (var5x.method_22000()) {
               this.field_7258 = (short)(this.field_7258 + var2);
            }
         }
      });
   }

   public class_5427<class_2522> method_6006() {
      return this.field_7262;
   }

   public void method_6001(class_8248 var1) {
      this.field_7260 = var1.readShort();
      this.field_7262.method_24679(var1);
   }

   public void method_5998(class_8248 var1) {
      var1.writeShort(this.field_7260);
      this.field_7262.method_24685(var1);
   }

   public int method_6004() {
      return 2 + this.field_7262.method_24682();
   }

   public boolean method_5993(Predicate<class_2522> var1) {
      return this.field_7262.method_24686(var1);
   }

   public short method_5991() {
      return this.field_7260;
   }

   public short method_5996() {
      return this.field_7261;
   }

   public short method_5990() {
      return this.field_7258;
   }
}
