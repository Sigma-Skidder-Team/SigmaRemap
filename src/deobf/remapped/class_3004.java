package remapped;

import java.util.ArrayList;
import java.util.List;
import org.lwjgl.glfw.GLFW;

public class class_3004 extends class_446 {
   public static final class_590 field_14738 = new class_590(
      -892679478, -892679478, -892679478, class_1255.field_6929.field_6917, class_6206.field_31724, class_6206.field_31726
   );
   public static final class_590 field_14753 = new class_590(-1, -1, -1, class_1255.field_6918.field_6917, class_6206.field_31724, class_6206.field_31726);
   private String field_14743 = "";
   private float field_14748;
   private final float field_14755 = 2.0F;
   private float field_14754;
   private float field_14750;
   private final float field_14739 = 2.0F;
   private int field_14752;
   private int field_14756;
   private int field_14746;
   private boolean field_14744;
   private boolean field_14740;
   private boolean field_14741 = false;
   private String field_14745 = Character.toString('·');
   private class_3223 field_14742 = new class_3223();
   private final List<class_2999> field_14749 = new ArrayList<class_2999>();
   private boolean field_14747 = true;

   public class_3004(class_7038 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, field_14738, "", false);
      this.field_14742.method_14776();
   }

   public class_3004(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_590 var7) {
      super(var1, var2, var3, var4, var5, var6, var7, "", false);
      this.field_14742.method_14776();
   }

   public class_3004(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_590 var7, String var8) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, false);
      this.field_14742.method_14776();
   }

   public class_3004(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_590 var7, String var8, String var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, class_5320.field_27141, false);
      this.field_14743 = var9;
      this.field_14742.method_14776();
   }

   public class_3004(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_590 var7, String var8, String var9, class_3384 var10) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, false);
      this.field_14743 = var9;
      this.field_14742.method_14776();
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
      String var5 = this.field_36275;
      if (this.field_14741) {
         var5 = this.field_36275.replaceAll(".", this.field_14745);
      }

      if (this.method_32183() && this.field_36276) {
         SigmaMainClass.method_3328().method_3299().method_30984(class_6763.field_34903);
      }

      this.field_14748 = this.field_14748 + ((!this.field_36276 ? 0.0F : 1.0F) - this.field_14748) / 2.0F;
      if (this.field_36276) {
         if (this.field_14744) {
            this.field_14752 = class_6324.method_28822(var5, this.field_36258, (float)this.method_32155(), var1, this.field_14754);
         }
      } else {
         this.field_14752 = 0;
         this.field_14756 = 0;
         this.field_14750 = 0.0F;
      }

      this.field_14752 = Math.min(Math.max(0, this.field_14752), var5.length());
      this.field_14746 = this.field_14752;
   }

   public void method_13725() {
      this.field_14754 = 0.0F;
   }

   public void method_13729(String var1) {
      this.field_14745 = var1;
   }

   @Override
   public boolean method_29508(int var1, int var2, int var3) {
      if (!super.method_29508(var1, var2, var3)) {
         String var6 = this.field_36275;
         if (this.field_14741) {
            var6 = this.field_36275.replaceAll(".", this.field_14745);
         }

         this.field_14744 = true;
         this.field_14752 = class_6324.method_28822(var6, this.field_36258, (float)this.method_32155(), var1, this.field_14754);
         if (!class_9732.method_44934(MinecraftClient.method_8510().field_9602.method_43181(), 340)
            && !class_9732.method_44934(MinecraftClient.method_8510().field_9602.method_43181(), 344)) {
            this.field_14756 = this.field_14752;
         }

         return false;
      } else {
         return true;
      }
   }

   public void method_13720() {
      this.method_32162();
      this.field_14752 = this.field_36275.length();
      this.field_14756 = 0;
      this.field_14746 = this.field_14752;
   }

   @Override
   public void method_29505(int var1, int var2, int var3) {
      super.method_29505(var1, var2, var3);
      this.field_14744 = false;
   }

   @Override
   public void method_29509(int var1) {
      super.method_29509(var1);
      if (this.field_36276) {
         switch (var1) {
            case 65:
               if (this.method_13722()) {
                  this.field_14752 = this.field_36275.length();
                  this.field_14756 = 0;
                  this.field_14746 = this.field_14752;
               }
               break;
            case 67:
               if (this.method_13722() && this.field_14756 != this.field_14746) {
                  GLFW.glfwSetClipboardString(
                     MinecraftClient.method_8510().field_9602.method_43181(),
                     this.field_36275.substring(Math.min(this.field_14756, this.field_14746), Math.max(this.field_14756, this.field_14746))
                  );
               }
               break;
            case 86:
               if (this.method_13722()) {
                  String var12 = "";

                  try {
                     var12 = GLFW.glfwGetClipboardString(MinecraftClient.method_8510().field_9602.method_43181());
                     if (var12 == null) {
                        var12 = "";
                     }
                  } catch (Exception var7) {
                  }

                  if (var12 != "") {
                     if (this.field_14756 != this.field_14746) {
                        this.field_36275 = class_6324.method_28831(this.field_36275, var12, this.field_14756, this.field_14746);
                        if (this.field_14752 > this.field_14756) {
                           this.field_14752 = this.field_14752 - (Math.max(this.field_14756, this.field_14746) - Math.min(this.field_14756, this.field_14746));
                        }

                        this.field_14752 = this.field_14752 + var12.length();
                        this.field_14756 = this.field_14752;
                     } else {
                        this.field_36275 = class_6324.method_28834(this.field_36275, var12, this.field_14752);
                        this.field_14752 = this.field_14752 + var12.length();
                        this.field_14756 = this.field_14752;
                     }

                     this.method_13723();
                  }
               }
               break;
            case 88:
               if (this.method_13722() && this.field_14756 != this.field_14746) {
                  GLFW.glfwSetClipboardString(
                     MinecraftClient.method_8510().field_9602.method_43181(),
                     this.field_36275.substring(Math.min(this.field_14756, this.field_14746), Math.max(this.field_14756, this.field_14746))
                  );
                  this.field_36275 = class_6324.method_28831(this.field_36275, "", this.field_14756, this.field_14746);
                  if (this.field_14752 > this.field_14756) {
                     this.field_14752 = this.field_14752 - (Math.max(this.field_14756, this.field_14746) - Math.min(this.field_14756, this.field_14746));
                  }

                  this.field_14756 = this.field_14752;
                  this.field_14746 = this.field_14752;
                  this.method_13723();
               }
               break;
            case 256:
               this.method_32177(false);
               break;
            case 259:
               if (this.field_36275.length() > 0) {
                  if (this.field_14756 != this.field_14746) {
                     this.field_36275 = class_6324.method_28831(this.field_36275, "", this.field_14756, this.field_14746);
                     if (this.field_14752 > this.field_14756) {
                        this.field_14752 = this.field_14752 - (Math.max(this.field_14756, this.field_14746) - Math.min(this.field_14756, this.field_14746));
                     }
                  } else if (this.method_13722()) {
                     int var11 = -1;

                     for (int var14 = Math.max(this.field_14752 - 1, 0); var14 >= 0; var14--) {
                        if ((String.valueOf(this.field_36275.charAt(var14)).equalsIgnoreCase(" ") || var14 == 0) && Math.abs(this.field_14752 - var14) > 1) {
                           var11 = var14 + (var14 == 0 ? 0 : 1);
                           break;
                        }
                     }

                     if (var11 != -1) {
                        this.field_36275 = class_6324.method_28831(this.field_36275, "", var11, this.field_14752);
                        this.field_14752 = var11;
                     }
                  } else {
                     this.field_36275 = class_6324.method_28831(this.field_36275, "", this.field_14752 - 1, this.field_14752);
                     this.field_14752--;
                  }

                  this.method_13723();
               }

               this.field_14756 = this.field_14752;
               break;
            case 262:
               if (!this.method_13722()) {
                  this.field_14752++;
               } else {
                  int var10 = -1;

                  for (int var13 = this.field_14752; var13 < this.field_36275.length(); var13++) {
                     try {
                        if ((String.valueOf(this.field_36275.charAt(var13)).equalsIgnoreCase(" ") || var13 == this.field_36275.length() - 1)
                           && (Math.abs(this.field_14752 - var13) > 1 || var13 == this.field_36275.length() - 1)) {
                           var10 = var13 + 1;
                           break;
                        }
                     } catch (Exception var9) {
                        break;
                     }
                  }

                  if (var10 != -1) {
                     this.field_14752 = var10;
                  }
               }

               if (!class_9732.method_44934(MinecraftClient.method_8510().field_9602.method_43181(), 340)
                  && !class_9732.method_44934(MinecraftClient.method_8510().field_9602.method_43181(), 344)) {
                  this.field_14756 = this.field_14752;
               }
               break;
            case 263:
               if (!this.method_13722()) {
                  this.field_14752--;
               } else {
                  int var4 = -1;

                  for (int var5 = Math.max(this.field_14752 - 1, 0); var5 >= 0; var5--) {
                     try {
                        if ((String.valueOf(this.field_36275.charAt(var5)).equalsIgnoreCase(" ") || var5 == 0) && Math.abs(this.field_14752 - var5) > 1) {
                           var4 = var5;
                           break;
                        }
                     } catch (Exception var8) {
                        break;
                     }
                  }

                  if (var4 != -1) {
                     this.field_14752 = var4;
                  }
               }

               if (!class_9732.method_44934(MinecraftClient.method_8510().field_9602.method_43181(), 340)
                  && !class_9732.method_44934(MinecraftClient.method_8510().field_9602.method_43181(), 344)) {
                  this.field_14756 = this.field_14752;
               }
               break;
            case 268:
               this.field_14752 = 0;
               if (!class_9732.method_44934(MinecraftClient.method_8510().field_9602.method_43181(), 340)
                  && !class_9732.method_44934(MinecraftClient.method_8510().field_9602.method_43181(), 344)) {
                  this.field_14756 = this.field_14752;
               }
               break;
            case 269:
               this.field_14752 = this.field_36275.length();
               if (!class_9732.method_44934(MinecraftClient.method_8510().field_9602.method_43181(), 340)
                  && !class_9732.method_44934(MinecraftClient.method_8510().field_9602.method_43181(), 344)) {
                  this.field_14756 = this.field_14752;
               }
         }
      }
   }

   public boolean method_13722() {
      return class_9732.method_44934(MinecraftClient.method_8510().field_9602.method_43181(), 341)
         || class_9732.method_44934(MinecraftClient.method_8510().field_9602.method_43181(), 345)
         || class_9732.method_44934(MinecraftClient.method_8510().field_9602.method_43181(), 343);
   }

   @Override
   public void method_29507(char var1) {
      super.method_29507(var1);
      if (this.method_32098() && class_6324.method_28823(var1)) {
         if (this.field_14756 == this.field_14746) {
            this.field_36275 = class_6324.method_28834(this.field_36275, Character.toString(var1), this.field_14752);
         } else {
            this.field_36275 = class_6324.method_28831(this.field_36275, Character.toString(var1), this.field_14756, this.field_14746);
         }

         this.field_14752++;
         this.field_14756 = this.field_14752;
         this.method_13723();
      }
   }

   @Override
   public void method_32178(float var1) {
      this.method_32130();
      float var4 = 1000.0F;
      boolean var5 = !this.field_36276 ? false : (float)this.field_14742.method_14772() > var4 / 2.0F;
      if ((float)this.field_14742.method_14772() > var4) {
         this.field_14742.method_14773();
      }

      String var6 = this.field_36275;
      if (this.field_14741) {
         var6 = this.field_36275.replaceAll(".", this.field_14745);
      }

      class_73.method_150(this.method_32132(), this.method_32173(), this.method_32132() + this.field_36278, this.method_32173() + this.field_36257, true);
      int var7 = this.field_36270 + 4;
      int var8 = this.field_36278 - 4;
      float var9 = (float)var7 + this.field_14754 + (float)this.field_36258.method_18547(var6.substring(0, this.field_14752));
      if (this.method_32098()) {
         class_73.method_94(
            var9 + (float)(var6.isEmpty() ? 0 : -1),
            (float)(this.field_36261 + this.field_36257 / 2 - this.field_36258.method_18548(var6) / 2 + 2),
            var9 + (float)(var6.isEmpty() ? 1 : 0),
            (float)(this.field_36261 + this.field_36257 / 2 + this.field_36258.method_18548(var6) / 2 - 1),
            class_314.method_1444(this.field_36272.method_2774(), !var5 ? 0.1F * var1 : 0.8F)
         );
         float var10 = (float)(var7 + this.field_36258.method_18547(var6.substring(0, this.field_14752))) + this.field_14750;
         if (var10 < (float)var7) {
            this.field_14750 += (float)var7 - var10;
            this.field_14750 = this.field_14750 - Math.min((float)var8, this.field_14750);
         }

         if (var10 > (float)(var7 + var8)) {
            this.field_14750 += (float)(var7 + var8) - var10;
         }
      }

      this.field_14754 = this.field_14754 + (this.field_14750 - this.field_14754) / 2.0F;
      this.field_14756 = Math.min(Math.max(0, this.field_14756), var6.length());
      this.field_14746 = Math.min(Math.max(0, this.field_14746), var6.length());
      float var14 = (float)var7 + this.field_14754 + (float)this.field_36258.method_18547(var6.substring(0, this.field_14756));
      float var11 = (float)var7 + this.field_14754 + (float)this.field_36258.method_18547(var6.substring(0, this.field_14746));
      class_73.method_94(
         var14,
         (float)(this.field_36261 + this.field_36257 / 2 - this.field_36258.method_18548(var6) / 2),
         var11,
         (float)(this.field_36261 + this.field_36257 / 2 + this.field_36258.method_18548(var6) / 2),
         class_314.method_1444(-5516546, var1)
      );
      class_6206 var12 = this.field_36272.method_2773();
      class_6206 var13 = this.field_36272.method_2770();
      class_73.method_88(
         this.field_36258,
         (float)var7 + this.field_14754,
         (float)(this.field_36261 + this.field_36257 / 2),
         var6.length() == 0 && (!this.field_36276 || var6.length() <= 0) ? this.field_14743 : var6,
         class_314.method_1444(this.field_36272.method_2774(), (this.field_14748 / 2.0F + 0.4F) * var1 * (this.field_36276 && var6.length() > 0 ? 1.0F : 0.5F)),
         var12,
         var13
      );
      class_73.method_141();
      if (this.field_14747) {
         class_73.method_94(
            (float)this.field_36270,
            (float)(this.field_36261 + this.field_36257 - 2),
            (float)(this.field_36270 + this.field_36278),
            (float)(this.field_36261 + this.field_36257),
            class_314.method_1444(this.field_36272.method_2764(), (this.field_14748 / 2.0F + 0.5F) * var1)
         );
      }

      super.method_32178(var1);
   }

   public final void method_13721(class_2999 var1) {
      this.field_14749.add(var1);
   }

   public void method_13723() {
      for (class_2999 var4 : this.field_14749) {
         var4.method_13703(this);
      }
   }

   public String method_13728() {
      return this.field_14743;
   }

   public void method_13727(String var1) {
      this.field_14743 = var1;
   }

   public void method_13726(boolean var1) {
      this.field_14741 = var1;
   }

   public void method_13724(boolean var1) {
      this.field_14747 = var1;
   }
}
