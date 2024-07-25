package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;

public class class_1453 extends Entity {
   private class_2522 field_7822 = class_4783.field_23216.method_29260();
   public int field_7827;
   public boolean field_7818 = true;
   private boolean field_7820;
   private boolean field_7825;
   private int field_7823 = 40;
   private float field_7826 = 2.0F;
   public CompoundNBT field_7819;
   public static final class_7821<class_1331> field_7821 = class_8073.<class_1331>method_36641(class_1453.class, class_2734.field_13353);

   public class_1453(class_6629<? extends class_1453> var1, World var2) {
      super(var1, var2);
   }

   public class_1453(World var1, double var2, double var4, double var6, class_2522 var8) {
      this(class_6629.field_34245, var1);
      this.field_7822 = var8;
      this.field_41759 = true;
      this.method_37256(var2, var4 + (double)((1.0F - this.method_37074()) / 2.0F), var6);
      this.method_37215(class_1343.field_7335);
      this.field_41767 = var2;
      this.field_41698 = var4;
      this.field_41725 = var6;
      this.method_6687(this.method_37075());
   }

   @Override
   public boolean method_37394() {
      return false;
   }

   public void method_6687(class_1331 var1) {
      this.field_41735.method_36633(field_7821, var1);
   }

   public class_1331 method_6690() {
      return this.field_41735.<class_1331>method_36640(field_7821);
   }

   @Override
   public boolean method_37126() {
      return false;
   }

   @Override
   public void method_37329() {
      this.field_41735.method_36634(field_7821, class_1331.field_7306);
   }

   @Override
   public boolean method_37167() {
      return !this.field_41751;
   }

   @Override
   public void method_37123() {
      if (!this.field_7822.method_8345()) {
         class_6414 var3 = this.field_7822.method_8360();
         if (this.field_7827++ == 0) {
            class_1331 var4 = this.method_37075();
            if (!this.field_41768.method_28262(var4).method_8350(var3)) {
               if (!this.field_41768.field_33055) {
                  this.method_37204();
                  return;
               }
            } else {
               this.field_41768.method_7508(var4, false);
            }
         }

         if (!this.method_37078()) {
            this.method_37215(this.method_37098().method_6214(0.0, -0.04, 0.0));
         }

         this.method_37226(class_7412.field_37839, this.method_37098());
         if (!this.field_41768.field_33055) {
            class_1331 var18 = this.method_37075();
            boolean var5 = this.field_7822.method_8360() instanceof class_4730;
            boolean var6 = var5 && this.field_41768.method_28258(var18).method_22007(class_6503.field_33094);
            double var7 = this.method_37098().method_6221();
            if (var5 && var7 > 1.0) {
               class_9529 var9 = this.field_41768
                  .method_28265(
                     new class_972(
                        new class_1343(this.field_41767, this.field_41698, this.field_41725),
                        this.method_37245(),
                        class_3132.field_15553,
                        class_9583.field_48749,
                        this
                     )
                  );
               if (var9.method_33990() != class_1430.field_7721 && this.field_41768.method_28258(var9.method_43955()).method_22007(class_6503.field_33094)) {
                  var18 = var9.method_43955();
                  var6 = true;
               }
            }

            if (!this.field_41726 && !var6) {
               if (!this.field_41768.field_33055
                  && (this.field_7827 > 100 && (var18.method_12165() < 1 || var18.method_12165() > 256) || this.field_7827 > 600)) {
                  if (this.field_7818 && this.field_41768.method_29537().method_1285(class_291.field_1024)) {
                     this.method_37312(var3);
                  }

                  this.method_37204();
               }
            } else {
               class_2522 var19 = this.field_41768.method_28262(var18);
               this.method_37215(this.method_37098().method_6210(0.7, -0.5, 0.7));
               if (!var19.method_8350(class_4783.field_23833)) {
                  this.method_37204();
                  if (this.field_7820) {
                     if (var3 instanceof class_305) {
                        ((class_305)var3).method_1362(this.field_41768, var18, this);
                     }
                  } else {
                     boolean var10 = var19.method_8374(
                        new class_9519(this.field_41768, var18, Direction.field_802, ItemStack.EMPTY, Direction.field_817)
                     );
                     boolean var11 = class_305.method_1361(this.field_41768.method_28262(var18.method_6100())) && (!var5 || !var6);
                     boolean var12 = this.field_7822.method_8309(this.field_41768, var18) && !var11;
                     if (var10 && var12) {
                        if (this.field_7822.method_10307(class_6023.field_30719)
                           && this.field_41768.method_28258(var18).method_22005() == class_8532.field_43674) {
                           this.field_7822 = this.field_7822.method_10308(class_6023.field_30719, Boolean.valueOf(true));
                        }

                        if (!this.field_41768.method_7513(var18, this.field_7822, 3)) {
                           if (this.field_7818 && this.field_41768.method_29537().method_1285(class_291.field_1024)) {
                              this.method_37312(var3);
                           }
                        } else {
                           if (var3 instanceof class_305) {
                              ((class_305)var3).method_1360(this.field_41768, var18, this.field_7822, var19, this);
                           }

                           if (this.field_7819 != null && var3 instanceof class_724) {
                              class_3757 var13 = this.field_41768.method_28260(var18);
                              if (var13 != null) {
                                 CompoundNBT var14 = var13.method_17396(new CompoundNBT());

                                 for (String var16 : this.field_7819.method_25952()) {
                                    class_8406 var17 = this.field_7819.method_25929(var16);
                                    if (!"x".equals(var16) && !"y".equals(var16) && !"z".equals(var16)) {
                                       var14.method_25946(var16, var17.method_38708());
                                    }
                                 }

                                 var13.method_17394(this.field_7822, var14);
                                 var13.method_17407();
                              }
                           }
                        }
                     } else if (this.field_7818 && this.field_41768.method_29537().method_1285(class_291.field_1024)) {
                        this.method_37312(var3);
                     }
                  }
               }
            }
         }

         this.method_37215(this.method_37098().method_6209(0.98));
      } else {
         this.method_37204();
      }
   }

   @Override
   public boolean method_37270(float var1, float var2) {
      if (this.field_7825) {
         int var5 = class_9299.method_42816(var1 - 1.0F);
         if (var5 > 0) {
            ArrayList var6 = Lists.newArrayList(this.field_41768.method_25870(this, this.method_37241()));
            boolean var7 = this.field_7822.method_8349(class_2351.field_11799);
            class_6199 var8 = !var7 ? class_6199.field_31681 : class_6199.field_31666;

            for (Entity var10 : var6) {
               var10.method_37181(var8, (float)Math.min(class_9299.method_42848((float)var5 * this.field_7826), this.field_7823));
            }

            if (var7 && (double)this.field_41717.nextFloat() < 0.05F + (double)var5 * 0.05) {
               class_2522 var11 = class_7372.method_33579(this.field_7822);
               if (var11 != null) {
                  this.field_7822 = var11;
               } else {
                  this.field_7820 = true;
               }
            }
         }
      }

      return false;
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      var1.method_25946("BlockState", class_4338.method_20187(this.field_7822));
      var1.method_25931("Time", this.field_7827);
      var1.method_25934("DropItem", this.field_7818);
      var1.method_25934("HurtEntities", this.field_7825);
      var1.method_25920("FallHurtAmount", this.field_7826);
      var1.method_25931("FallHurtMax", this.field_7823);
      if (this.field_7819 != null) {
         var1.method_25946("TileEntityData", this.field_7819);
      }
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      this.field_7822 = class_4338.method_20185(var1.method_25937("BlockState"));
      this.field_7827 = var1.method_25947("Time");
      if (!var1.method_25939("HurtEntities", 99)) {
         if (this.field_7822.method_8349(class_2351.field_11799)) {
            this.field_7825 = true;
         }
      } else {
         this.field_7825 = var1.method_25933("HurtEntities");
         this.field_7826 = var1.method_25955("FallHurtAmount");
         this.field_7823 = var1.method_25947("FallHurtMax");
      }

      if (var1.method_25939("DropItem", 99)) {
         this.field_7818 = var1.method_25933("DropItem");
      }

      if (var1.method_25939("TileEntityData", 10)) {
         this.field_7819 = var1.method_25937("TileEntityData");
      }

      if (this.field_7822.method_8345()) {
         this.field_7822 = class_4783.field_23216.method_29260();
      }
   }

   public World method_6689() {
      return this.field_41768;
   }

   public void method_6691(boolean var1) {
      this.field_7825 = var1;
   }

   @Override
   public boolean method_37174() {
      return false;
   }

   @Override
   public void method_37331(class_6544 var1) {
      super.method_37331(var1);
      var1.method_29850("Immitating BlockState", this.field_7822.toString());
   }

   public class_2522 method_6688() {
      return this.field_7822;
   }

   @Override
   public boolean method_37131() {
      return true;
   }

   @Override
   public Packet<?> method_37142() {
      return new class_6589(this, class_6414.method_29285(this.method_6688()));
   }
}
