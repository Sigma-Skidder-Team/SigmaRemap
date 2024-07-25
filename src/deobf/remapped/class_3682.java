package remapped;

public class class_3682 extends class_4088 {
   private final class_9210 field_18042;
   private final class_9332 field_18044 = class_9332.method_43089();
   private Runnable field_18038 = () -> {
   };
   private final class_7934 field_18043;
   private final class_7934 field_18036;
   private final class_7934 field_18045;
   private final class_7934 field_18039;
   private long field_18046;
   private final class_6867 field_18037 = new class_4683(this, 3);
   private final class_6867 field_18041 = new class_272(this, 1);

   public class_3682(int var1, class_7051 var2) {
      this(var1, var2, class_9210.field_47106);
   }

   public class_3682(int var1, class_7051 var2, class_9210 var3) {
      super(class_4165.field_20263, var1);
      this.field_18042 = var3;
      this.field_18043 = this.method_18885(new class_7092(this, this.field_18037, 0, 13, 26));
      this.field_18036 = this.method_18885(new class_365(this, this.field_18037, 1, 33, 26));
      this.field_18045 = this.method_18885(new class_1615(this, this.field_18037, 2, 23, 45));
      this.field_18039 = this.method_18885(new class_789(this, this.field_18041, 0, 143, 58, var3));

      for (int var6 = 0; var6 < 3; var6++) {
         for (int var7 = 0; var7 < 9; var7++) {
            this.method_18885(new class_7934(var2, var7 + var6 * 9 + 9, 8 + var7 * 18, 84 + var6 * 18));
         }
      }

      for (int var8 = 0; var8 < 9; var8++) {
         this.method_18885(new class_7934(var2, var8, 8 + var8 * 18, 142));
      }

      this.method_18889(this.field_18044);
   }

   public int method_17100() {
      return this.field_18044.method_43085();
   }

   @Override
   public boolean method_18861(class_704 var1) {
      return method_18872(this.field_18042, var1, class_4783.field_23853);
   }

   @Override
   public boolean method_18886(class_704 var1, int var2) {
      if (var2 > 0 && var2 <= class_8427.field_43115) {
         this.field_18044.method_43087(var2);
         this.method_17093();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method_18853(class_6867 var1) {
      class_6098 var4 = this.field_18043.method_35898();
      class_6098 var5 = this.field_18036.method_35898();
      class_6098 var6 = this.field_18045.method_35898();
      class_6098 var7 = this.field_18039.method_35898();
      if (var7.method_28022()
         || !var4.method_28022()
            && !var5.method_28022()
            && this.field_18044.method_43085() > 0
            && (this.field_18044.method_43085() < class_8427.field_43117 - class_8427.field_43108 || !var6.method_28022())) {
         if (!var6.method_28022() && var6.method_27960() instanceof class_7174) {
            class_5734 var8 = var4.method_27978("BlockEntityTag");
            boolean var9 = var8.method_25939("Patterns", 9) && !var4.method_28022() && var8.method_25927("Patterns", 10).size() >= 6;
            if (!var9) {
               this.field_18044.method_43087(((class_7174)var6.method_27960()).method_32877().ordinal());
            } else {
               this.field_18044.method_43087(0);
            }
         }
      } else {
         this.field_18039.method_35896(class_6098.field_31203);
         this.field_18044.method_43087(0);
      }

      this.method_17093();
      this.method_18877();
   }

   public void method_17095(Runnable var1) {
      this.field_18038 = var1;
   }

   @Override
   public class_6098 method_18874(class_704 var1, int var2) {
      class_6098 var5 = class_6098.field_31203;
      class_7934 var6 = this.field_19926.get(var2);
      if (var6 != null && var6.method_35884()) {
         class_6098 var7 = var6.method_35898();
         var5 = var7.method_27973();
         if (var2 != this.field_18039.field_40588) {
            if (var2 != this.field_18036.field_40588 && var2 != this.field_18043.field_40588 && var2 != this.field_18045.field_40588) {
               if (var7.method_27960() instanceof class_1967) {
                  if (!this.method_18892(var7, this.field_18043.field_40588, this.field_18043.field_40588 + 1, false)) {
                     return class_6098.field_31203;
                  }
               } else if (var7.method_27960() instanceof class_239) {
                  if (!this.method_18892(var7, this.field_18036.field_40588, this.field_18036.field_40588 + 1, false)) {
                     return class_6098.field_31203;
                  }
               } else if (var7.method_27960() instanceof class_7174) {
                  if (!this.method_18892(var7, this.field_18045.field_40588, this.field_18045.field_40588 + 1, false)) {
                     return class_6098.field_31203;
                  }
               } else if (var2 >= 4 && var2 < 31) {
                  if (!this.method_18892(var7, 31, 40, false)) {
                     return class_6098.field_31203;
                  }
               } else if (var2 >= 31 && var2 < 40 && !this.method_18892(var7, 4, 31, false)) {
                  return class_6098.field_31203;
               }
            } else if (!this.method_18892(var7, 4, 40, false)) {
               return class_6098.field_31203;
            }
         } else {
            if (!this.method_18892(var7, 4, 40, true)) {
               return class_6098.field_31203;
            }

            var6.method_35888(var7, var5);
         }

         if (!var7.method_28022()) {
            var6.method_35887();
         } else {
            var6.method_35896(class_6098.field_31203);
         }

         if (var7.method_27997() == var5.method_27997()) {
            return class_6098.field_31203;
         }

         var6.method_35892(var1, var7);
      }

      return var5;
   }

   @Override
   public void method_18876(class_704 var1) {
      super.method_18876(var1);
      this.field_18042.method_42533((var2, var3) -> this.method_18887(var1, var1.field_41768, this.field_18037));
   }

   private void method_17093() {
      if (this.field_18044.method_43085() > 0) {
         class_6098 var3 = this.field_18043.method_35898();
         class_6098 var4 = this.field_18036.method_35898();
         class_6098 var5 = class_6098.field_31203;
         if (!var3.method_28022() && !var4.method_28022()) {
            var5 = var3.method_27973();
            var5.method_28017(1);
            class_8427 var6 = class_8427.values()[this.field_18044.method_43085()];
            class_9077 var7 = ((class_239)var4.method_27960()).method_1015();
            class_5734 var8 = var5.method_27978("BlockEntityTag");
            class_3416 var9;
            if (!var8.method_25939("Patterns", 9)) {
               var9 = new class_3416();
               var8.method_25946("Patterns", var9);
            } else {
               var9 = var8.method_25927("Patterns", 10);
            }

            class_5734 var10 = new class_5734();
            var10.method_25941("Pattern", var6.method_38789());
            var10.method_25931("Color", var7.method_41794());
            var9.add(var10);
         }

         if (!class_6098.method_27982(var5, this.field_18039.method_35898())) {
            this.field_18039.method_35896(var5);
         }
      }
   }

   public class_7934 method_17092() {
      return this.field_18043;
   }

   public class_7934 method_17096() {
      return this.field_18036;
   }

   public class_7934 method_17094() {
      return this.field_18045;
   }

   public class_7934 method_17099() {
      return this.field_18039;
   }
}
