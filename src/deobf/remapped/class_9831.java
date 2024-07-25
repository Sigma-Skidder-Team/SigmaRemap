package remapped;

import net.minecraft.util.text.ITextComponent;

public class class_9831 extends class_2208<class_1722> implements class_474 {
   private static final Identifier field_49797 = new Identifier("textures/gui/container/crafting_table.png");
   private static final Identifier field_49800 = new Identifier("textures/gui/recipe_button.png");
   private final class_8002 field_49799 = new class_8002();
   private boolean field_49798;

   public class_9831(class_1722 var1, class_7051 var2, ITextComponent var3) {
      super(var1, var2, var3);
   }

   @Override
   public void method_1163() {
      super.method_1163();
      this.field_49798 = this.field_941 < 379;
      this.field_49799.method_36308(this.field_941, this.field_940, this.field_943, this.field_49798, this.field_10956);
      this.field_10984 = this.field_49799.method_36325(this.field_49798, this.field_941, this.field_10981);
      this.field_942.add(this.field_49799);
      this.method_41178(this.field_49799);
      this.<class_77>method_1186(new class_77(this.field_10984 + 5, this.field_940 / 2 - 49, 20, 18, 0, 0, 19, field_49800, var1 -> {
         this.field_49799.method_36323(this.field_49798);
         this.field_49799.method_36326();
         this.field_10984 = this.field_49799.method_36325(this.field_49798, this.field_941, this.field_10981);
         ((class_77)var1).method_166(this.field_10984 + 5, this.field_940 / 2 - 49);
      }));
      this.field_10959 = 29;
   }

   @Override
   public void method_5312() {
      super.method_5312();
      this.field_49799.method_36315();
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      if (this.field_49799.method_36314() && this.field_49798) {
         this.method_10223(var1, var4, var2, var3);
         this.field_49799.method_6767(var1, var2, var3, var4);
      } else {
         this.field_49799.method_6767(var1, var2, var3, var4);
         super.method_6767(var1, var2, var3, var4);
         this.field_49799.method_36322(var1, this.field_10984, this.field_10962, true, var4);
      }

      this.method_10214(var1, var2, var3);
      this.field_49799.method_36301(var1, this.field_10984, this.field_10962, var2, var3);
   }

   @Override
   public void method_10223(class_7966 var1, float var2, int var3, int var4) {
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_943.method_8577().method_35674(field_49797);
      int var7 = this.field_10984;
      int var8 = (this.field_940 - this.field_10973) / 2;
      this.method_9781(var1, var7, var8, 0, 0, this.field_10981, this.field_10973);
   }

   @Override
   public boolean method_10222(int var1, int var2, int var3, int var4, double var5, double var7) {
      return (!this.field_49798 || !this.field_49799.method_36314()) && super.method_10222(var1, var2, var3, var4, var5, var7);
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      if (this.field_49799.method_26940(var1, var3, var5)) {
         this.method_41180(this.field_49799);
         return true;
      } else {
         return this.field_49798 && this.field_49799.method_36314() ? true : super.method_26940(var1, var3, var5);
      }
   }

   @Override
   public boolean method_10215(double var1, double var3, int var5, int var6, int var7) {
      boolean var10 = var1 < (double)var5 || var3 < (double)var6 || var1 >= (double)(var5 + this.field_10981) || var3 >= (double)(var6 + this.field_10973);
      return this.field_49799.method_36304(var1, var3, this.field_10984, this.field_10962, this.field_10981, this.field_10973, var7) && var10;
   }

   @Override
   public void method_10217(class_7934 var1, int var2, int var3, class_6269 var4) {
      super.method_10217(var1, var2, var3, var4);
      this.field_49799.method_36309(var1);
   }

   @Override
   public void method_2263() {
      this.field_49799.method_36321();
   }

   @Override
   public void method_1162() {
      this.field_49799.method_36311();
      super.method_1162();
   }

   @Override
   public class_8002 method_2262() {
      return this.field_49799;
   }
}
