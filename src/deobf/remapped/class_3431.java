package remapped;

import net.minecraft.util.text.TranslationTextComponent;

public class class_3431 extends class_9331<class_3683> implements class_474 {
   private static final Identifier field_16867 = new Identifier("textures/gui/recipe_button.png");
   private float field_16866;
   private float field_16868;
   private final class_8002 field_16865 = new class_8002();
   private boolean field_16864;
   private boolean field_16863;
   private boolean field_16869;

   public class_3431(class_704 var1) {
      super(var1.field_3869, var1.field_3853, new TranslationTextComponent("container.crafting"));
      this.field_951 = true;
      this.field_10959 = 97;
   }

   @Override
   public void method_5312() {
      if (!this.field_943.field_9647.method_42140()) {
         this.field_16865.method_36315();
      } else {
         this.field_943.method_8609(new class_2546(this.field_943.field_9632));
      }
   }

   @Override
   public void method_1163() {
      if (!this.field_943.field_9647.method_42140()) {
         super.method_1163();
         this.field_16863 = this.field_941 < 379;
         this.field_16865.method_36308(this.field_941, this.field_940, this.field_943, this.field_16863, this.field_10956);
         this.field_16864 = true;
         this.field_10984 = this.field_16865.method_36325(this.field_16863, this.field_941, this.field_10981);
         this.field_942.add(this.field_16865);
         this.method_41178(this.field_16865);
         this.<class_77>method_1186(new class_77(this.field_10984 + 104, this.field_940 / 2 - 22, 20, 18, 0, 0, 19, field_16867, var1 -> {
            this.field_16865.method_36323(this.field_16863);
            this.field_16865.method_36326();
            this.field_10984 = this.field_16865.method_36325(this.field_16863, this.field_941, this.field_10981);
            ((class_77)var1).method_166(this.field_10984 + 104, this.field_940 / 2 - 22);
            this.field_16869 = true;
         }));
      } else {
         this.field_943.method_8609(new class_2546(this.field_943.field_9632));
      }
   }

   @Override
   public void method_10221(class_7966 var1, int var2, int var3) {
      this.field_948.method_45378(var1, this.field_947, (float)this.field_10959, (float)this.field_10971, 4210752);
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      this.field_47639 = !this.field_16865.method_36314();
      if (this.field_16865.method_36314() && this.field_16863) {
         this.method_10223(var1, var4, var2, var3);
         this.field_16865.method_6767(var1, var2, var3, var4);
      } else {
         this.field_16865.method_6767(var1, var2, var3, var4);
         super.method_6767(var1, var2, var3, var4);
         this.field_16865.method_36322(var1, this.field_10984, this.field_10962, false, var4);
      }

      this.method_10214(var1, var2, var3);
      this.field_16865.method_36301(var1, this.field_10984, this.field_10962, var2, var3);
      this.field_16866 = (float)var2;
      this.field_16868 = (float)var3;
   }

   @Override
   public void method_10223(class_7966 var1, float var2, int var3, int var4) {
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_943.method_8577().method_35674(field_10969);
      int var7 = this.field_10984;
      int var8 = this.field_10962;
      this.method_9781(var1, var7, var8, 0, 0, this.field_10981, this.field_10973);
      method_15860(var7 + 51, var8 + 75, 30, (float)(var7 + 51) - this.field_16866, (float)(var8 + 75 - 50) - this.field_16868, this.field_943.field_9632);
   }

   public static void method_15860(int var0, int var1, int var2, float var3, float var4, class_5834 var5) {
      float var8 = (float)Math.atan((double)(var3 / 40.0F));
      float var9 = (float)Math.atan((double)(var4 / 40.0F));
      class_3542.method_16438();
      class_3542.method_16413((float)var0, (float)var1, 1050.0F);
      class_3542.method_16403(1.0F, 1.0F, -1.0F);
      class_7966 var10 = new class_7966();
      var10.method_36065(0.0, 0.0, 1000.0);
      var10.method_36062((float)var2, (float)var2, (float)var2);
      Quaternion var11 = class_2426.field_12076.method_11074(180.0F);
      Quaternion var12 = class_2426.field_12080.method_11074(var9 * 20.0F);
      var11.method_24658(var12);
      var10.method_36060(var11);
      float var13 = var5.field_29605;
      float var14 = var5.field_41701;
      float var15 = var5.field_41755;
      float var16 = var5.field_29657;
      float var17 = var5.field_29618;
      var5.field_29605 = 180.0F + var8 * 20.0F;
      var5.field_41701 = 180.0F + var8 * 40.0F;
      var5.field_41755 = -var9 * 20.0F;
      var5.field_29618 = var5.field_41701;
      var5.field_29657 = var5.field_41701;
      EntityRenderDispatcher var18 = MinecraftClient.getInstance().method_8587();
      var12.method_24652();
      var18.method_28123(var12);
      var18.method_28136(false);
      class_3758 var19 = MinecraftClient.getInstance().method_8589().method_13796();
      class_3542.method_16430(() -> var18.method_28115(var5, 0.0, 0.0, 0.0, 0.0F, 1.0F, var10, var19, 15728880));
      var19.method_17415();
      var18.method_28136(true);
      var5.field_29605 = var13;
      var5.field_41701 = var14;
      var5.field_41755 = var15;
      var5.field_29657 = var16;
      var5.field_29618 = var17;
      class_3542.method_16489();
   }

   @Override
   public boolean method_10222(int var1, int var2, int var3, int var4, double var5, double var7) {
      return (!this.field_16863 || !this.field_16865.method_36314()) && super.method_10222(var1, var2, var3, var4, var5, var7);
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      if (this.field_16865.method_26940(var1, var3, var5)) {
         this.method_41180(this.field_16865);
         return true;
      } else {
         return this.field_16863 && this.field_16865.method_36314() ? false : super.method_26940(var1, var3, var5);
      }
   }

   @Override
   public boolean method_26941(double var1, double var3, int var5) {
      if (!this.field_16869) {
         return super.method_26941(var1, var3, var5);
      } else {
         this.field_16869 = false;
         return true;
      }
   }

   @Override
   public boolean method_10215(double var1, double var3, int var5, int var6, int var7) {
      boolean var10 = var1 < (double)var5 || var3 < (double)var6 || var1 >= (double)(var5 + this.field_10981) || var3 >= (double)(var6 + this.field_10973);
      return this.field_16865.method_36304(var1, var3, this.field_10984, this.field_10962, this.field_10981, this.field_10973, var7) && var10;
   }

   @Override
   public void method_10217(class_7934 var1, int var2, int var3, class_6269 var4) {
      super.method_10217(var1, var2, var3, var4);
      this.field_16865.method_36309(var1);
   }

   @Override
   public void method_2263() {
      this.field_16865.method_36321();
   }

   @Override
   public void method_1162() {
      if (this.field_16864) {
         this.field_16865.method_36311();
      }

      super.method_1162();
   }

   @Override
   public class_8002 method_2262() {
      return this.field_16865;
   }
}
