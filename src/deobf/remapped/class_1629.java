package remapped;

import net.minecraft.util.text.ITextComponent;

public abstract class class_1629<T extends class_8383> extends class_2208<T> implements class_474 {
   private static final class_4639 field_8482 = new class_4639("textures/gui/recipe_button.png");
   public final class_3840 field_8483;
   private boolean field_8484;
   private final class_4639 field_8481;

   public class_1629(T var1, class_3840 var2, class_7051 var3, ITextComponent var4, class_4639 var5) {
      super((T)var1, var3, var4);
      this.field_8483 = var2;
      this.field_8481 = var5;
   }

   @Override
   public void method_1163() {
      super.method_1163();
      this.field_8484 = this.field_941 < 379;
      this.field_8483.method_36308(this.field_941, this.field_940, this.field_943, this.field_8484, this.field_10956);
      this.field_10984 = this.field_8483.method_36325(this.field_8484, this.field_941, this.field_10981);
      this.<class_77>method_1186(new class_77(this.field_10984 + 20, this.field_940 / 2 - 49, 20, 18, 0, 0, 19, field_8482, var1 -> {
         this.field_8483.method_36323(this.field_8484);
         this.field_8483.method_36326();
         this.field_10984 = this.field_8483.method_36325(this.field_8484, this.field_941, this.field_10981);
         ((class_77)var1).method_166(this.field_10984 + 20, this.field_940 / 2 - 49);
      }));
      this.field_10959 = (this.field_10981 - this.field_948.method_45379(this.field_947)) / 2;
   }

   @Override
   public void method_5312() {
      super.method_5312();
      this.field_8483.method_36315();
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      if (this.field_8483.method_36314() && this.field_8484) {
         this.method_10223(var1, var4, var2, var3);
         this.field_8483.method_6767(var1, var2, var3, var4);
      } else {
         this.field_8483.method_6767(var1, var2, var3, var4);
         super.method_6767(var1, var2, var3, var4);
         this.field_8483.method_36322(var1, this.field_10984, this.field_10962, true, var4);
      }

      this.method_10214(var1, var2, var3);
      this.field_8483.method_36301(var1, this.field_10984, this.field_10962, var2, var3);
   }

   @Override
   public void method_10223(class_7966 var1, float var2, int var3, int var4) {
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_943.method_8577().method_35674(this.field_8481);
      int var7 = this.field_10984;
      int var8 = this.field_10962;
      this.method_9781(var1, var7, var8, 0, 0, this.field_10981, this.field_10973);
      if (this.field_10956.method_38635()) {
         int var9 = this.field_10956.method_38636();
         this.method_9781(var1, var7 + 56, var8 + 36 + 12 - var9, 176, 12 - var9, 14, var9 + 1);
      }

      int var10 = this.field_10956.method_38637();
      this.method_9781(var1, var7 + 79, var8 + 34, 176, 14, var10 + 1, 16);
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      if (this.field_8483.method_26940(var1, var3, var5)) {
         return true;
      } else {
         return this.field_8484 && this.field_8483.method_36314() ? true : super.method_26940(var1, var3, var5);
      }
   }

   @Override
   public void method_10217(class_7934 var1, int var2, int var3, class_6269 var4) {
      super.method_10217(var1, var2, var3, var4);
      this.field_8483.method_36309(var1);
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      return !this.field_8483.method_26946(var1, var2, var3) ? super.method_26946(var1, var2, var3) : false;
   }

   @Override
   public boolean method_10215(double var1, double var3, int var5, int var6, int var7) {
      boolean var10 = var1 < (double)var5 || var3 < (double)var6 || var1 >= (double)(var5 + this.field_10981) || var3 >= (double)(var6 + this.field_10973);
      return this.field_8483.method_36304(var1, var3, this.field_10984, this.field_10962, this.field_10981, this.field_10973, var7) && var10;
   }

   @Override
   public boolean method_26938(char var1, int var2) {
      return !this.field_8483.method_26938(var1, var2) ? super.method_26938(var1, var2) : true;
   }

   @Override
   public void method_2263() {
      this.field_8483.method_36321();
   }

   @Override
   public class_8002 method_2262() {
      return this.field_8483;
   }

   @Override
   public void method_1162() {
      this.field_8483.method_36311();
      super.method_1162();
   }
}
