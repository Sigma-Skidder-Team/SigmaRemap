package mapped;

import com.google.common.collect.Lists;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.text.Color;
import net.minecraft.util.text.Style;

import java.util.List;

public class Class2546 implements Class2545 {
   private static String[] field16770;
   public final Class7733 field16771;
   private final boolean field16772;
   private final float field16773;
   private final float field16774;
   private final float field16775;
   private final float field16776;
   private final float field16777;
   private final Matrix4f field16778;
   private final boolean field16779;
   private final int field16780;
   private float field16781;
   private float field16782;
   private List<Class8442> field16783;
   private Style field16784;
   private Class1807 field16785;
   public final FontRenderer field16786;

   private void method10740(Class8442 var1) {
      if (this.field16783 == null) {
         this.field16783 = Lists.newArrayList();
      }

      this.field16783.add(var1);
   }

   public Class2546(FontRenderer var1, Class7733 var2, float var3, float var4, int var5, boolean var6, Matrix4f var7, boolean var8, int var9) {
      this.field16786 = var1;
      this.field16771 = var2;
      this.field16781 = var3;
      this.field16782 = var4;
      this.field16772 = var6;
      this.field16773 = !var6 ? 1.0F : 0.25F;
      this.field16774 = (float)(var5 >> 16 & 0xFF) / 255.0F * this.field16773;
      this.field16775 = (float)(var5 >> 8 & 0xFF) / 255.0F * this.field16773;
      this.field16776 = (float)(var5 & 0xFF) / 255.0F * this.field16773;
      this.field16777 = (float)(var5 >> 24 & 0xFF) / 255.0F;
      this.field16778 = !var7.method35504() ? var7 : Class8978.field40587;
      this.field16779 = var8;
      this.field16780 = var9;
   }

   @Override
   public boolean method10739(int var1, Style var2, int var3) {
      Class1807 var6 = this.method10742(var2);
      Class2052 var7 = var6.method7922(var3);
      Class8978 var8 = var2.getObfuscated() && var3 != 32 ? var6.method7926(var7) : var6.method7924(var3);
      boolean var9 = var2.getBold();
      float var10 = this.field16777;
      Color var11 = var2.getColor();
      float var12;
      float var13;
      float var14;
      if (var11 == null) {
         var12 = this.field16774;
         var13 = this.field16775;
         var14 = this.field16776;
      } else {
         int var15 = var11.func_240742_a_();
         var12 = (float)(var15 >> 16 & 0xFF) / 255.0F * this.field16773;
         var13 = (float)(var15 >> 8 & 0xFF) / 255.0F * this.field16773;
         var14 = (float)(var15 & 0xFF) / 255.0F * this.field16773;
      }

      if (!(var8 instanceof Class8977)) {
         float var18 = !var9 ? 0.0F : var7.method8701();
         float var16 = !this.field16772 ? 0.0F : var7.method8702();
         IVertexBuilder var17 = this.field16771.method25597(var8.method32942(this.field16779));
         FontRenderer.method38832(
            this.field16786,
            var8,
            var9,
            var2.getItalic(),
            var18,
            this.field16781 + var16,
            this.field16782 + var16,
            this.field16778,
            var17,
            var12,
            var13,
            var14,
            var10,
            this.field16780
         );
      }

      float var19 = var7.method8699(var9);
      float var20 = !this.field16772 ? 0.0F : 1.0F;
      if (var2.getStrikethrough()) {
         this.method10740(
            new Class8442(
               this.field16781 + var20 - 1.0F,
               this.field16782 + var20 + 4.5F,
               this.field16781 + var20 + var19,
               this.field16782 + var20 + 4.5F - 1.0F,
               0.01F,
               var12,
               var13,
               var14,
               var10
            )
         );
      }

      if (var2.getUnderlined()) {
         this.method10740(
            new Class8442(
               this.field16781 + var20 - 1.0F,
               this.field16782 + var20 + 9.0F,
               this.field16781 + var20 + var19,
               this.field16782 + var20 + 9.0F - 1.0F,
               0.01F,
               var12,
               var13,
               var14,
               var10
            )
         );
      }

      this.field16781 += var19;
      return true;
   }

   public float method10741(int var1, float var2) {
      if (var1 != 0) {
         float var5 = (float)(var1 >> 24 & 0xFF) / 255.0F;
         float var6 = (float)(var1 >> 16 & 0xFF) / 255.0F;
         float var7 = (float)(var1 >> 8 & 0xFF) / 255.0F;
         float var8 = (float)(var1 & 0xFF) / 255.0F;
         this.method10740(new Class8442(var2 - 1.0F, this.field16782 + 9.0F, this.field16781 + 1.0F, this.field16782 - 1.0F, 0.01F, var6, var7, var8, var5));
      }

      if (this.field16783 != null) {
         Class8978 var9 = FontRenderer.method38833(this.field16786, Style.DEFAULT_FONT).method7927();
         IVertexBuilder var10 = this.field16771.method25597(var9.method32942(this.field16779));

         for (Class8442 var12 : this.field16783) {
            var9.method32941(var12, this.field16778, var10, this.field16780);
         }
      }

      return this.field16781;
   }

   private Class1807 method10742(Style var1) {
      if (var1 != this.field16784) {
         this.field16784 = var1;
         this.field16785 = FontRenderer.method38833(this.field16786, var1.getFontId());
         return this.field16785;
      } else {
         return this.field16785;
      }
   }
}
