package remapped;

import com.mojang.datafixers.util.Pair;
import java.util.List;
import net.minecraft.util.text.ITextComponent;

public class class_408 extends class_2208<class_3682> {
   private static final Identifier field_1707 = new Identifier("textures/gui/container/loom.png");
   private static final int field_1704 = (class_8427.field_43117 - class_8427.field_43108 - 1 + 4 - 1) / 4;
   private final class_1549 field_1711;
   private List<Pair<class_8427, class_9077>> field_1702;
   private ItemStack field_1712 = ItemStack.EMPTY;
   private ItemStack field_1708 = ItemStack.EMPTY;
   private ItemStack field_1709 = ItemStack.EMPTY;
   private boolean field_1703;
   private boolean field_1706;
   private boolean field_1714;
   private float field_1715;
   private boolean field_1705;
   private int field_1710 = 1;

   public class_408(class_3682 var1, class_7051 var2, ITextComponent var3) {
      super(var1, var2, var3);
      this.field_1711 = class_9429.method_43641();
      var1.method_17095(this::method_2030);
      this.field_10971 -= 2;
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      super.method_6767(var1, var2, var3, var4);
      this.method_10214(var1, var2, var3);
   }

   @Override
   public void method_10223(class_7966 var1, float var2, int var3, int var4) {
      this.method_1183(var1);
      this.field_943.getTextureManager().bindTexture(field_1707);
      int var7 = this.field_10984;
      int var8 = this.field_10962;
      this.method_9781(var1, var7, var8, 0, 0, this.field_10981, this.field_10973);
      class_7934 var9 = this.field_10956.method_17092();
      class_7934 var10 = this.field_10956.method_17096();
      class_7934 var11 = this.field_10956.method_17094();
      class_7934 var12 = this.field_10956.method_17099();
      if (!var9.method_35884()) {
         this.method_9781(var1, var7 + var9.field_40589, var8 + var9.field_40590, this.field_10981, 0, 16, 16);
      }

      if (!var10.method_35884()) {
         this.method_9781(var1, var7 + var10.field_40589, var8 + var10.field_40590, this.field_10981 + 16, 0, 16, 16);
      }

      if (!var11.method_35884()) {
         this.method_9781(var1, var7 + var11.field_40589, var8 + var11.field_40590, this.field_10981 + 32, 0, 16, 16);
      }

      int var13 = (int)(41.0F * this.field_1715);
      this.method_9781(var1, var7 + 119, var8 + 13 + var13, 232 + (!this.field_1703 ? 12 : 0), 0, 12, 15);
      class_2083.method_9716();
      if (this.field_1702 != null && !this.field_1714) {
         class_3758 var14 = this.field_943.method_8589().method_13796();
         var1.method_36063();
         var1.method_36065((double)(var7 + 139), (double)(var8 + 52), 0.0);
         var1.method_36062(24.0F, -24.0F, 1.0F);
         var1.method_36065(0.5, 0.5, 0.5);
         float var15 = 0.6666667F;
         var1.method_36062(0.6666667F, -0.6666667F, -0.6666667F);
         this.field_1711.field_8191 = 0.0F;
         this.field_1711.field_8181 = -32.0F;
         class_9429.method_43643(var1, var14, 15728880, class_5367.field_27381, this.field_1711, class_6560.field_33431, true, this.field_1702);
         var1.method_36064();
         var14.method_17415();
      } else if (this.field_1714) {
         this.method_9781(var1, var7 + var12.field_40589 - 2, var8 + var12.field_40590 - 2, this.field_10981, 17, 17, 16);
      }

      if (!this.field_1703) {
         if (this.field_1706) {
            int var22 = var7 + 60;
            int var24 = var8 + 13;
            this.field_943.getTextureManager().bindTexture(field_1707);
            this.method_9781(var1, var22, var24, 0, this.field_10973, 14, 14);
            int var16 = this.field_10956.method_17100();
            this.method_2029(var16, var22, var24);
         }
      } else {
         int var23 = var7 + 60;
         int var25 = var8 + 13;
         int var26 = this.field_1710 + 16;

         for (int var17 = this.field_1710; var17 < var26 && var17 < class_8427.field_43117 - class_8427.field_43108; var17++) {
            int var18 = var17 - this.field_1710;
            int var19 = var23 + var18 % 4 * 14;
            int var20 = var25 + var18 / 4 * 14;
            this.field_943.getTextureManager().bindTexture(field_1707);
            int var21 = this.field_10973;
            if (var17 != this.field_10956.method_17100()) {
               if (var3 >= var19 && var4 >= var20 && var3 < var19 + 14 && var4 < var20 + 14) {
                  var21 += 28;
               }
            } else {
               var21 += 14;
            }

            this.method_9781(var1, var19, var20, 0, var21, 14, 14);
            this.method_2029(var17, var19, var20);
         }
      }

      class_2083.method_9717();
   }

   private void method_2029(int var1, int var2, int var3) {
      ItemStack var6 = new ItemStack(class_4897.field_25216);
      CompoundNBT var7 = var6.method_27978("BlockEntityTag");
      class_3416 var8 = new class_1697()
         .method_7624(class_8427.field_43111, class_9077.field_46498)
         .method_7624(class_8427.values()[var1], class_9077.field_46493)
         .method_7625();
      var7.method_25946("Patterns", var8);
      class_7966 var9 = new class_7966();
      var9.method_36063();
      var9.method_36065((double)((float)var2 + 0.5F), (double)(var3 + 16), 0.0);
      var9.method_36062(6.0F, -6.0F, 1.0F);
      var9.method_36065(0.5, 0.5, 0.0);
      var9.method_36065(0.5, 0.5, 0.5);
      float var10 = 0.6666667F;
      var9.method_36062(0.6666667F, -0.6666667F, -0.6666667F);
      class_3758 var11 = this.field_943.method_8589().method_13796();
      this.field_1711.field_8191 = 0.0F;
      this.field_1711.field_8181 = -32.0F;
      List var12 = class_8837.method_40658(class_9077.field_46498, class_8837.method_40656(var6));
      class_9429.method_43643(var9, var11, 15728880, class_5367.field_27381, this.field_1711, class_6560.field_33431, true, var12);
      var9.method_36064();
      var11.method_17415();
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      this.field_1705 = false;
      if (this.field_1703) {
         int var8 = this.field_10984 + 60;
         int var9 = this.field_10962 + 13;
         int var10 = this.field_1710 + 16;

         for (int var11 = this.field_1710; var11 < var10; var11++) {
            int var12 = var11 - this.field_1710;
            double var13 = var1 - (double)(var8 + var12 % 4 * 14);
            double var15 = var3 - (double)(var9 + var12 / 4 * 14);
            if (var13 >= 0.0 && var15 >= 0.0 && var13 < 14.0 && var15 < 14.0 && this.field_10956.method_18886(this.field_943.thePlayer, var11)) {
               MinecraftClient.getInstance().method_8590().method_16345(class_4949.method_22675(class_463.field_2842, 1.0F));
               this.field_943.playerController.method_42154(this.field_10956.field_19925, var11);
               return true;
            }
         }

         var8 = this.field_10984 + 119;
         var9 = this.field_10962 + 9;
         if (var1 >= (double)var8 && var1 < (double)(var8 + 12) && var3 >= (double)var9 && var3 < (double)(var9 + 56)) {
            this.field_1705 = true;
         }
      }

      return super.method_26940(var1, var3, var5);
   }

   @Override
   public boolean method_26944(double var1, double var3, int var5, double var6, double var8) {
      if (this.field_1705 && this.field_1703) {
         int var12 = this.field_10962 + 13;
         int var13 = var12 + 56;
         this.field_1715 = ((float)var3 - (float)var12 - 7.5F) / ((float)(var13 - var12) - 15.0F);
         this.field_1715 = class_9299.method_42828(this.field_1715, 0.0F, 1.0F);
         int var14 = field_1704 - 4;
         int var15 = (int)((double)(this.field_1715 * (float)var14) + 0.5);
         if (var15 < 0) {
            var15 = 0;
         }

         this.field_1710 = 1 + var15 * 4;
         return true;
      } else {
         return super.method_26944(var1, var3, var5, var6, var8);
      }
   }

   @Override
   public boolean method_26945(double var1, double var3, double var5) {
      if (this.field_1703) {
         int var9 = field_1704 - 4;
         this.field_1715 = (float)((double)this.field_1715 - var5 / (double)var9);
         this.field_1715 = class_9299.method_42828(this.field_1715, 0.0F, 1.0F);
         this.field_1710 = 1 + (int)((double)(this.field_1715 * (float)var9) + 0.5) * 4;
      }

      return true;
   }

   @Override
   public boolean method_10215(double var1, double var3, int var5, int var6, int var7) {
      return var1 < (double)var5 || var3 < (double)var6 || var1 >= (double)(var5 + this.field_10981) || var3 >= (double)(var6 + this.field_10973);
   }

   private void method_2030() {
      ItemStack var3 = this.field_10956.method_17099().method_35898();
      if (!var3.method_28022()) {
         this.field_1702 = class_8837.method_40658(((class_1967)var3.method_27960()).method_9065(), class_8837.method_40656(var3));
      } else {
         this.field_1702 = null;
      }

      ItemStack var4 = this.field_10956.method_17092().method_35898();
      ItemStack var5 = this.field_10956.method_17096().method_35898();
      ItemStack var6 = this.field_10956.method_17094().method_35898();
      CompoundNBT var7 = var4.method_27978("BlockEntityTag");
      this.field_1714 = var7.method_25939("Patterns", 9) && !var4.method_28022() && var7.method_25927("Patterns", 10).size() >= 6;
      if (this.field_1714) {
         this.field_1702 = null;
      }

      if (!ItemStack.method_27982(var4, this.field_1712) || !ItemStack.method_27982(var5, this.field_1708) || !ItemStack.method_27982(var6, this.field_1709)
         )
       {
         this.field_1703 = !var4.method_28022() && !var5.method_28022() && var6.method_28022() && !this.field_1714;
         this.field_1706 = !this.field_1714 && !var6.method_28022() && !var4.method_28022() && !var5.method_28022();
      }

      this.field_1712 = var4.method_27973();
      this.field_1708 = var5.method_27973();
      this.field_1709 = var6.method_27973();
   }
}
