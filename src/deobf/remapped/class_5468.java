package remapped;

public class class_5468 extends class_7346<class_9753> {
   public class_5468(class_1980 var1) {
      super(class_1980.method_9111(var1) + 10, class_1980.method_9119(12) + 20, class_1980.method_9112(1), class_1980.method_9123(12) + 20, 13);
      this.field_27877 = var1;
   }

   public void method_24880(class_7407 var1) {
      class_1980 var10003 = this.field_27877;
      this.field_27877.getClass();
      this.method_33483(new class_9753(var10003, var1));
   }

   @Override
   public int method_36195() {
      return (int)((double)this.field_40891 * 1.0);
   }

   @Override
   public boolean method_36221() {
      return this.field_27877.method_41185() == this;
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      if (var5 == 0 && var1 < (double)this.method_36191() && var3 >= (double)this.field_40876 && var3 <= (double)this.field_40877) {
         int var8 = class_1980.method_9109(this.field_27877);
         int var9 = class_1980.method_9109(this.field_27877) + class_1980.method_9111(this.field_27877);
         int var10 = (int)Math.floor(var3 - (double)this.field_40876) - this.field_40874 + (int)this.method_36228() - 4;
         int var11 = var10 / this.field_40878;
         if (var1 >= (double)var8 && var1 <= (double)var9 && var11 >= 0 && var10 >= 0 && var11 < this.method_36218()) {
            this.method_33482(var11);
            this.method_33484(var10, var11, var1, var3, this.field_40891);
         }

         return true;
      } else {
         return super.method_26940(var1, var3, var5);
      }
   }

   @Override
   public void method_33484(int var1, int var2, double var3, double var5, int var7) {
      if (var2 >= 0
         && var2 <= class_1980.method_9107(this.field_27877).field_39019.size()
         && class_1980.method_9129(this.field_27877) != class_7179.field_36918) {
         if (class_1980.method_9129(this.field_27877) != class_7179.field_36917) {
            if (class_1980.method_9129(this.field_27877) == class_7179.field_36921) {
               class_1980.method_9125(this.field_27877, var2);
            }
         } else if (!class_1980.method_9107(this.field_27877).field_39019.get(var2).method_33753()) {
            class_1980.method_9104(this.field_27877, var2);
         } else {
            class_1980.method_9128(this.field_27877, var2);
         }
      }
   }

   @Override
   public void method_33482(int var1) {
      this.method_33485(var1);
      if (var1 != -1) {
         class_7567.method_34410(class_6956.method_31803("narrator.select", class_1980.method_9107(this.field_27877).field_39019.get(var1).method_33746()));
      }

      this.method_24879(var1);
   }

   public void method_24879(int var1) {
      class_1980.method_9106(this.field_27877, var1);
      class_1980.method_9126(this.field_27877);
   }

   public void method_24878(class_9753 var1) {
      super.method_36197(var1);
      class_1980.method_9106(this.field_27877, this.method_41183().indexOf(var1));
      class_1980.method_9126(this.field_27877);
   }

   @Override
   public void method_36199(class_7966 var1) {
      this.field_27877.method_1183(var1);
   }

   @Override
   public int method_36191() {
      return class_1980.method_9109(this.field_27877) + this.field_40891 - 5;
   }

   @Override
   public int method_36205() {
      return this.method_36218() * 13;
   }
}
