package remapped;

public class class_2311 extends class_7346<class_7651> {
   private boolean field_11568;

   public class_2311(class_7039 var1) {
      super(var1.field_941, var1.field_940, 32, var1.field_940 - 40, 36);
      this.field_11569 = var1;
   }

   @Override
   public void method_33486() {
      super.method_33486();
      this.field_11568 = false;
   }

   public int method_10630(class_7651 var1) {
      this.field_11568 = true;
      return this.method_33483(var1);
   }

   @Override
   public boolean method_36221() {
      return this.field_11569.method_41185() == this;
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (var1 != 257 && var1 != 32 && var1 != 335) {
         return super.method_26946(var1, var2, var3);
      } else {
         class_4785 var6 = this.method_36226();
         return var6 != null ? var6.method_26940(0.0, 0.0, 0) : super.method_26946(var1, var2, var3);
      }
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      if (var5 == 0 && var1 < (double)this.method_36191() && var3 >= (double)this.field_40876 && var3 <= (double)this.field_40877) {
         int var8 = class_7039.method_32293(this.field_11569).method_36229();
         int var9 = this.method_36191();
         int var10 = (int)Math.floor(var3 - (double)this.field_40876) - this.field_40874 + (int)this.method_36228() - 4;
         int var11 = var10 / this.field_40878;
         if (var1 >= (double)var8 && var1 <= (double)var9 && var11 >= 0 && var10 >= 0 && var11 < this.method_36218()) {
            this.method_33484(var10, var11, var1, var3, this.field_40891);
            class_7039.method_32297(this.field_11569, class_7039.method_32346(this.field_11569) + 7);
            this.method_33482(var11);
         }

         return true;
      } else {
         return super.method_26940(var1, var3, var5);
      }
   }

   @Override
   public void method_33482(int var1) {
      this.method_33485(var1);
      if (var1 != -1) {
         class_7675 var4;
         if (!this.field_11568) {
            if (var1 >= class_7039.method_32332(this.field_11569).size()) {
               class_7039.method_32285(this.field_11569, -1L);
               return;
            }

            var4 = (class_7675)class_7039.method_32332(this.field_11569).get(var1);
         } else if (var1 != 0) {
            if (var1 - 1 >= class_7039.method_32332(this.field_11569).size()) {
               class_7039.method_32285(this.field_11569, -1L);
               return;
            }

            var4 = (class_7675)class_7039.method_32332(this.field_11569).get(var1 - 1);
         } else {
            var4 = null;
         }

         class_7039.method_32209(this.field_11569, var4);
         if (var4 != null) {
            if (var4.field_39004 != class_6804.field_35065) {
               class_7039.method_32285(this.field_11569, var4.field_39016);
               if (class_7039.method_32346(this.field_11569) >= 10 && class_7039.method_32301(this.field_11569).field_36675) {
                  this.field_11569.method_32260(class_7039.method_32268(this.field_11569, class_7039.method_32320(this.field_11569)), this.field_11569);
               }
            } else {
               class_7039.method_32285(this.field_11569, -1L);
            }
         } else {
            class_7039.method_32285(this.field_11569, -1L);
         }
      }
   }

   public void method_10629(class_7651 var1) {
      super.method_36197(var1);
      int var4 = this.method_41183().indexOf(var1);
      if (this.field_11568 && var4 == 0) {
         class_7567.method_34408(class_6956.method_31803("mco.trial.message.line1"), class_6956.method_31803("mco.trial.message.line2"));
      } else if (!this.field_11568 || var4 > 0) {
         class_7675 var5 = (class_7675)class_7039.method_32332(this.field_11569).get(var4 - (!this.field_11568 ? 0 : 1));
         class_7039.method_32285(this.field_11569, var5.field_39016);
         class_7039.method_32209(this.field_11569, var5);
         if (var5.field_39004 != class_6804.field_35065) {
            class_7567.method_34410(class_6956.method_31803("narrator.select", var5.field_39012));
         } else {
            class_7567.method_34410(class_6956.method_31803("mco.selectServer.uninitialized") + class_6956.method_31803("mco.gui.button"));
         }
      }
   }

   @Override
   public void method_33484(int var1, int var2, double var3, double var5, int var7) {
      if (this.field_11568) {
         if (var2 == 0) {
            class_7039.method_32281(this.field_11569, true);
            return;
         }

         var2--;
      }

      if (var2 < class_7039.method_32332(this.field_11569).size()) {
         class_7675 var10 = (class_7675)class_7039.method_32332(this.field_11569).get(var2);
         if (var10 != null) {
            if (var10.field_39004 != class_6804.field_35065) {
               class_7039.method_32285(this.field_11569, var10.field_39016);
            } else {
               class_7039.method_32285(this.field_11569, -1L);
               MinecraftClient.method_8510().method_8609(new class_2341(var10, this.field_11569));
            }

            if (class_7039.method_32270(this.field_11569) != class_270.field_970) {
               if (class_7039.method_32270(this.field_11569) != class_270.field_969) {
                  if (class_7039.method_32270(this.field_11569) == class_270.field_971) {
                     class_7039.method_32221(this.field_11569);
                  }
               } else {
                  class_7039.method_32285(this.field_11569, var10.field_39016);
                  class_7039.method_32261(this.field_11569, var10);
               }
            } else {
               class_7039.method_32285(this.field_11569, var10.field_39016);
               class_7039.method_32222(this.field_11569, var10);
            }
         }
      }
   }

   @Override
   public int method_36205() {
      return this.method_36218() * 36;
   }

   @Override
   public int method_36195() {
      return 300;
   }
}
