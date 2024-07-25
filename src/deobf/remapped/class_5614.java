package remapped;

import java.util.Map.Entry;

public class class_5614 extends Entity {
   public int field_28508;
   public int field_28514;
   public int field_28509;
   private int field_28510 = 5;
   private int field_28513;
   private class_704 field_28507;
   private int field_28512;

   public class_5614(World var1, double var2, double var4, double var6, int var8) {
      this(class_6629.field_34299, var1);
      this.method_37256(var2, var4, var6);
      this.rotationYaw = (float)(this.field_41717.nextDouble() * 360.0);
      this.method_37214(
         (this.field_41717.nextDouble() * 0.2F - 0.1F) * 2.0, this.field_41717.nextDouble() * 0.2 * 2.0, (this.field_41717.nextDouble() * 0.2F - 0.1F) * 2.0
      );
      this.field_28513 = var8;
   }

   public class_5614(class_6629<? extends class_5614> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public boolean method_37126() {
      return false;
   }

   @Override
   public void method_37329() {
   }

   @Override
   public void method_37123() {
      super.method_37123();
      if (this.field_28509 > 0) {
         this.field_28509--;
      }

      this.field_41767 = this.getPosX();
      this.field_41698 = this.method_37309();
      this.field_41725 = this.getPosZ();
      if (!this.method_37261(class_6503.field_33094)) {
         if (!this.method_37078()) {
            this.method_37215(this.method_37098().method_6214(0.0, -0.03, 0.0));
         }
      } else {
         this.method_25472();
      }

      if (this.world.method_28258(this.method_37075()).method_22007(class_6503.field_33095)) {
         this.method_37214(
            (double)((this.field_41717.nextFloat() - this.field_41717.nextFloat()) * 0.2F),
            0.2F,
            (double)((this.field_41717.nextFloat() - this.field_41717.nextFloat()) * 0.2F)
         );
         this.method_37155(class_463.field_2912, 0.4F, 2.0F + this.field_41717.nextFloat() * 0.4F);
      }

      if (!this.world.method_6681(this.method_37241())) {
         this.method_37160(this.getPosX(), (this.method_37241().field_19937 + this.method_37241().field_19939) / 2.0, this.getPosZ());
      }

      double var3 = 8.0;
      if (this.field_28512 < this.field_28508 - 20 + this.method_37145() % 100) {
         if (this.field_28507 == null || this.field_28507.method_37275(this) > 64.0) {
            this.field_28507 = this.world.method_25861(this, 8.0);
         }

         this.field_28512 = this.field_28508;
      }

      if (this.field_28507 != null && this.field_28507.method_37221()) {
         this.field_28507 = null;
      }

      if (this.field_28507 != null) {
         class_1343 var5 = new class_1343(
            this.field_28507.getPosX() - this.getPosX(),
            this.field_28507.method_37309() + (double)this.field_28507.method_37277() / 2.0 - this.method_37309(),
            this.field_28507.getPosZ() - this.getPosZ()
         );
         double var6 = var5.method_6221();
         if (var6 < 64.0) {
            double var8 = 1.0 - Math.sqrt(var6) / 8.0;
            this.method_37215(this.method_37098().method_6215(var5.method_6213().method_6209(var8 * var8 * 0.1)));
         }
      }

      this.method_37226(class_7412.field_37839, this.method_37098());
      float var10 = 0.98F;
      if (this.onGround) {
         var10 = this.world
               .method_28262(new BlockPos(this.getPosX(), this.method_37309() - 1.0, this.getPosZ()))
               .method_8360()
               .method_29308()
            * 0.98F;
      }

      this.method_37215(this.method_37098().method_6210((double)var10, 0.98, (double)var10));
      if (this.onGround) {
         this.method_37215(this.method_37098().method_6210(1.0, -0.9, 1.0));
      }

      this.field_28508++;
      this.field_28514++;
      if (this.field_28514 >= 6000) {
         this.method_37204();
      }
   }

   private void method_25472() {
      class_1343 var3 = this.method_37098();
      this.method_37214(var3.field_7336 * 0.99F, Math.min(var3.field_7333 + 5.0E-4F, 0.06F), var3.field_7334 * 0.99F);
   }

   @Override
   public void method_37101() {
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      if (!this.method_37180(var1)) {
         this.method_37138();
         this.field_28510 = (int)((float)this.field_28510 - var2);
         if (this.field_28510 <= 0) {
            this.method_37204();
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      var1.method_25958("Health", (short)this.field_28510);
      var1.method_25958("Age", (short)this.field_28514);
      var1.method_25958("Value", (short)this.field_28513);
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      this.field_28510 = var1.method_25956("Health");
      this.field_28514 = var1.method_25956("Age");
      this.field_28513 = var1.method_25956("Value");
   }

   @Override
   public void method_37347(class_704 var1) {
      if (!this.world.field_33055 && this.field_28509 == 0 && var1.field_3851 == 0) {
         var1.field_3851 = 2;
         var1.method_26467(this, 1);
         Entry var4 = class_2931.method_13413(class_3668.field_17872, var1, ItemStack::method_27995);
         if (var4 != null) {
            ItemStack var5 = (ItemStack)var4.getValue();
            if (!var5.method_28022() && var5.method_27995()) {
               int var6 = Math.min(this.method_25474(this.field_28513), var5.method_28026());
               this.field_28513 = this.field_28513 - this.method_25475(var6);
               var5.method_27999(var5.method_28026() - var6);
            }
         }

         if (this.field_28513 > 0) {
            var1.method_3159(this.field_28513);
         }

         this.method_37204();
      }
   }

   private int method_25475(int var1) {
      return var1 / 2;
   }

   private int method_25474(int var1) {
      return var1 * 2;
   }

   public int method_25471() {
      return this.field_28513;
   }

   public int method_25473() {
      if (this.field_28513 < 2477) {
         if (this.field_28513 < 1237) {
            if (this.field_28513 < 617) {
               if (this.field_28513 < 307) {
                  if (this.field_28513 < 149) {
                     if (this.field_28513 < 73) {
                        if (this.field_28513 < 37) {
                           if (this.field_28513 < 17) {
                              if (this.field_28513 < 7) {
                                 return this.field_28513 < 3 ? 0 : 1;
                              } else {
                                 return 2;
                              }
                           } else {
                              return 3;
                           }
                        } else {
                           return 4;
                        }
                     } else {
                        return 5;
                     }
                  } else {
                     return 6;
                  }
               } else {
                  return 7;
               }
            } else {
               return 8;
            }
         } else {
            return 9;
         }
      } else {
         return 10;
      }
   }

   public static int method_25476(int var0) {
      if (var0 < 2477) {
         if (var0 < 1237) {
            if (var0 < 617) {
               if (var0 < 307) {
                  if (var0 < 149) {
                     if (var0 < 73) {
                        if (var0 < 37) {
                           if (var0 < 17) {
                              if (var0 < 7) {
                                 return var0 < 3 ? 1 : 3;
                              } else {
                                 return 7;
                              }
                           } else {
                              return 17;
                           }
                        } else {
                           return 37;
                        }
                     } else {
                        return 73;
                     }
                  } else {
                     return 149;
                  }
               } else {
                  return 307;
               }
            } else {
               return 617;
            }
         } else {
            return 1237;
         }
      } else {
         return 2477;
      }
   }

   @Override
   public boolean method_37394() {
      return false;
   }

   @Override
   public Packet<?> method_37142() {
      return new class_3491(this);
   }
}
