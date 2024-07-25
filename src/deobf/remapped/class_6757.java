package remapped;

import com.google.common.hash.Hashing;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextProperties;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.lang3.Validate;

public class class_6757 extends class_2269 {
   private final class_4145 field_34870;
   private final MinecraftClient field_34865;
   private final class_2560 field_34866;
   private final Identifier field_34868;
   private String field_34869;
   private class_7884 field_34867;
   private long field_34862;

   public class_6757(class_4116 var1, class_4145 var2, class_2560 var3) {
      this.field_34864 = var1;
      this.field_34870 = var2;
      this.field_34866 = var3;
      this.field_34865 = MinecraftClient.getInstance();
      this.field_34868 = new Identifier("servers/" + Hashing.sha1().hashUnencodedChars(var3.field_12675) + "/icon");
      this.field_34867 = (class_7884)this.field_34865.method_8577().method_35679(this.field_34868);
   }

   @Override
   public void method_21644(class_7966 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      if (!this.field_34866.field_12668) {
         this.field_34866.field_12668 = true;
         this.field_34866.field_12674 = -2L;
         this.field_34866.field_12672 = StringTextComponent.EMPTY;
         this.field_34866.field_12671 = StringTextComponent.EMPTY;
         class_4116.method_19128().submit(() -> {
            try {
               this.field_34870.method_19238().method_32592(this.field_34866, () -> this.field_34865.execute(this::method_30966));
            } catch (UnknownHostException var4x) {
               this.field_34866.field_12674 = -1L;
               this.field_34866.field_12672 = class_4116.method_19113();
            } catch (Exception var5x) {
               this.field_34866.field_12674 = -1L;
               this.field_34866.field_12672 = class_4116.method_19119();
            }
         });
      }

      boolean var13 = this.field_34866.field_12663 != class_7665.method_34674().getProtocolVersion();
      this.field_34865.textRenderer.method_45385(var1, this.field_34866.field_12670, (float)(var4 + 32 + 3), (float)(var3 + 1), 16777215);
      List var14 = this.field_34865.textRenderer.method_45391(this.field_34866.field_12672, var5 - 32 - 2);

      for (int var15 = 0; var15 < Math.min(var14.size(), 2); var15++) {
         this.field_34865.textRenderer.method_45382(var1, (class_7107)var14.get(var15), (float)(var4 + 32 + 3), (float)(var3 + 12 + 9 * var15), 8421504);
      }

      Object var26 = !var13 ? this.field_34866.field_12671 : this.field_34866.field_12666.deepCopy().mergeStyle(TextFormatting.RED);
      int var16 = this.field_34865.textRenderer.method_45379((ITextProperties)var26);
      this.field_34865.textRenderer.method_45378(var1, (ITextComponent)var26, (float)(var4 + var5 - var16 - 15 - 2), (float)(var3 + 1), 8421504);
      byte var17 = 0;
      int var18;
      Object var19;
      List var20;
      if (!var13) {
         if (this.field_34866.field_12668 && this.field_34866.field_12674 != -2L) {
            if (this.field_34866.field_12674 >= 0L) {
               if (this.field_34866.field_12674 >= 150L) {
                  if (this.field_34866.field_12674 >= 300L) {
                     if (this.field_34866.field_12674 >= 600L) {
                        if (this.field_34866.field_12674 >= 1000L) {
                           var18 = 4;
                        } else {
                           var18 = 3;
                        }
                     } else {
                        var18 = 2;
                     }
                  } else {
                     var18 = 1;
                  }
               } else {
                  var18 = 0;
               }
            } else {
               var18 = 5;
            }

            if (this.field_34866.field_12674 >= 0L) {
               var19 = new TranslationTextComponent("multiplayer.status.ping", this.field_34866.field_12674);
               var20 = this.field_34866.field_12664;
            } else {
               var19 = class_4116.method_19115();
               var20 = Collections.emptyList();
            }
         } else {
            var17 = 1;
            var18 = (int)(Util.getMeasuringTimeMs() / 100L + (long)(var2 * 2) & 7L);
            if (var18 > 4) {
               var18 = 8 - var18;
            }

            var19 = class_4116.method_19121();
            var20 = Collections.emptyList();
         }
      } else {
         var18 = 5;
         var19 = class_4116.method_19118();
         var20 = this.field_34866.field_12664;
      }

      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_34865.method_8577().method_35674(class_2089.field_10507);
      class_2089.method_9778(var1, var4 + var5 - 15, var3, (float)(var17 * 10), (float)(176 + var18 * 8), 10, 8, 256, 256);
      String var21 = this.field_34866.method_11622();
      if (!Objects.equals(var21, this.field_34869)) {
         if (!this.method_30969(var21)) {
            this.field_34866.method_11623((String)null);
            this.method_30966();
         } else {
            this.field_34869 = var21;
         }
      }

      if (this.field_34867 == null) {
         this.method_30968(var1, var4, var3, class_4116.method_19124());
      } else {
         this.method_30968(var1, var4, var3, this.field_34868);
      }

      int var22 = var7 - var4;
      int var23 = var8 - var3;
      if (var22 >= var5 - 15 && var22 <= var5 - 5 && var23 >= 0 && var23 <= 8) {
         this.field_34870.method_19237(Collections.<ITextComponent>singletonList((ITextComponent)var19));
      } else if (var22 >= var5 - var16 - 15 - 2 && var22 <= var5 - 15 - 2 && var23 >= 0 && var23 <= 8) {
         this.field_34870.method_19237(var20);
      }

      if (this.field_34865.gameOptions.field_45570 || var9) {
         this.field_34865.method_8577().method_35674(class_4116.method_19126());
         class_2089.method_9774(var1, var4, var3, var4 + 32, var3 + 32, -1601138544);
         class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
         int var24 = var7 - var4;
         int var25 = var8 - var3;
         if (this.method_30967()) {
            if (var24 < 32 && var24 > 16) {
               class_2089.method_9778(var1, var4, var3, 0.0F, 32.0F, 32, 32, 256, 256);
            } else {
               class_2089.method_9778(var1, var4, var3, 0.0F, 0.0F, 32, 32, 256, 256);
            }
         }

         if (var2 > 0) {
            if (var24 < 16 && var25 < 16) {
               class_2089.method_9778(var1, var4, var3, 96.0F, 32.0F, 32, 32, 256, 256);
            } else {
               class_2089.method_9778(var1, var4, var3, 96.0F, 0.0F, 32, 32, 256, 256);
            }
         }

         if (var2 < this.field_34870.method_19242().method_14671() - 1) {
            if (var24 < 16 && var25 > 16) {
               class_2089.method_9778(var1, var4, var3, 64.0F, 32.0F, 32, 32, 256, 256);
            } else {
               class_2089.method_9778(var1, var4, var3, 64.0F, 0.0F, 32, 32, 256, 256);
            }
         }
      }
   }

   public void method_30966() {
      this.field_34870.method_19242().method_14676();
   }

   public void method_30968(class_7966 var1, int var2, int var3, Identifier var4) {
      this.field_34865.method_8577().method_35674(var4);
      class_3542.method_16488();
      class_2089.method_9778(var1, var2, var3, 0.0F, 0.0F, 32, 32, 32, 32);
      class_3542.method_16448();
   }

   private boolean method_30967() {
      return true;
   }

   private boolean method_30969(String var1) {
      if (var1 == null) {
         this.field_34865.method_8577().method_35678(this.field_34868);
         if (this.field_34867 != null && this.field_34867.method_35651() != null) {
            this.field_34867.method_35651().close();
         }

         this.field_34867 = null;
      } else {
         try {
            class_5797 var4 = class_5797.method_26257(var1);
            Validate.validState(var4.method_26228() == 64, "Must be 64 pixels wide", new Object[0]);
            Validate.validState(var4.method_26253() == 64, "Must be 64 pixels high", new Object[0]);
            if (this.field_34867 == null) {
               this.field_34867 = new class_7884(var4);
            } else {
               this.field_34867.method_35652(var4);
               this.field_34867.method_35650();
            }

            this.field_34865.method_8577().method_35682(this.field_34868, this.field_34867);
         } catch (Throwable var5) {
            class_4116.method_19120().error("Invalid icon for server {} ({})", this.field_34866.field_12670, this.field_34866.field_12675, var5);
            return false;
         }
      }

      return true;
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (Screen.method_1190()) {
         class_4116 var6 = this.field_34870.field_20163;
         int var7 = var6.method_41183().indexOf(this);
         if (var1 == 264 && var7 < this.field_34870.method_19242().method_14671() - 1 || var1 == 265 && var7 > 0) {
            this.method_30965(var7, var1 != 264 ? var7 - 1 : var7 + 1);
            return true;
         }
      }

      return super.method_26946(var1, var2, var3);
   }

   private void method_30965(int var1, int var2) {
      this.field_34870.method_19242().method_14667(var1, var2);
      this.field_34870.field_20163.method_19117(this.field_34870.method_19242());
      class_2269 var5 = this.field_34870.field_20163.method_41183().get(var2);
      this.field_34870.field_20163.method_19114(var5);
      class_4116.method_19122(this.field_34864, var5);
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      double var8 = var1 - (double)this.field_34864.method_36229();
      double var10 = var3 - (double)class_4116.method_19127(this.field_34864, this.field_34864.method_41183().indexOf(this));
      if (var8 <= 32.0) {
         if (var8 < 32.0 && var8 > 16.0 && this.method_30967()) {
            this.field_34870.method_19234(this);
            this.field_34870.method_19235();
            return true;
         }

         int var12 = this.field_34870.field_20163.method_41183().indexOf(this);
         if (var8 < 16.0 && var10 < 16.0 && var12 > 0) {
            this.method_30965(var12, var12 - 1);
            return true;
         }

         if (var8 < 16.0 && var10 > 16.0 && var12 < this.field_34870.method_19242().method_14671() - 1) {
            this.method_30965(var12, var12 + 1);
            return true;
         }
      }

      this.field_34870.method_19234(this);
      if (Util.getMeasuringTimeMs() - this.field_34862 < 250L) {
         this.field_34870.method_19235();
      }

      this.field_34862 = Util.getMeasuringTimeMs();
      return false;
   }

   public class_2560 method_30964() {
      return this.field_34866;
   }
}
