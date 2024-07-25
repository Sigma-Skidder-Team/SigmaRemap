package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_4478 extends Entity {
   private static final Logger field_21835 = LogManager.getLogger();
   private static final class_7821<Float> field_21838 = class_8073.<Float>method_36641(class_4478.class, class_2734.field_13350);
   private static final class_7821<Integer> field_21834 = class_8073.<Integer>method_36641(class_4478.class, class_2734.field_13366);
   private static final class_7821<Boolean> field_21836 = class_8073.<Boolean>method_36641(class_4478.class, class_2734.field_13347);
   private static final class_7821<class_5079> field_21830 = class_8073.<class_5079>method_36641(class_4478.class, class_2734.field_13351);
   private class_6004 field_21822 = class_3697.field_18134;
   private final List<class_2250> field_21833 = Lists.newArrayList();
   private final Map<Entity, Integer> field_21829 = Maps.newHashMap();
   private int field_21826 = 600;
   private int field_21824 = 20;
   private int field_21828 = 20;
   private boolean field_21832;
   private int field_21821;
   private float field_21831;
   private float field_21823;
   private LivingEntity field_21825;
   private UUID field_21837;

   public class_4478(EntityType<? extends class_4478> var1, World var2) {
      super(var1, var2);
      this.field_41731 = true;
      this.method_20781(3.0F);
   }

   public class_4478(World var1, double var2, double var4, double var6) {
      this(EntityType.field_34279, var1);
      this.method_37256(var2, var4, var6);
   }

   @Override
   public void method_37329() {
      this.method_37372().method_36634(field_21834, 0);
      this.method_37372().method_36634(field_21838, 0.5F);
      this.method_37372().method_36634(field_21836, false);
      this.method_37372().method_36634(field_21830, class_3090.field_15353);
   }

   public void method_20781(float var1) {
      if (!this.world.field_33055) {
         this.method_37372().method_36633(field_21838, var1);
      }
   }

   @Override
   public void method_37187() {
      double var3 = this.getPosX();
      double var5 = this.method_37309();
      double var7 = this.getPosZ();
      super.method_37187();
      this.method_37256(var3, var5, var7);
   }

   public float method_20783() {
      return this.method_37372().<Float>method_36640(field_21838);
   }

   public void method_20793(class_6004 var1) {
      this.field_21822 = var1;
      if (!this.field_21832) {
         this.method_20794();
      }
   }

   private void method_20794() {
      if (this.field_21822 == class_3697.field_18134 && this.field_21833.isEmpty()) {
         this.method_37372().method_36633(field_21834, 0);
      } else {
         this.method_37372().method_36633(field_21834, class_9541.method_43997(class_9541.method_43994(this.field_21822, this.field_21833)));
      }
   }

   public void method_20788(class_2250 var1) {
      this.field_21833.add(var1);
      if (!this.field_21832) {
         this.method_20794();
      }
   }

   public int method_20790() {
      return this.method_37372().<Integer>method_36640(field_21834);
   }

   public void method_20785(int var1) {
      this.field_21832 = true;
      this.method_37372().method_36633(field_21834, var1);
   }

   public class_5079 method_20792() {
      return this.method_37372().<class_5079>method_36640(field_21830);
   }

   public void method_20789(class_5079 var1) {
      this.method_37372().method_36633(field_21830, var1);
   }

   public void method_20786(boolean var1) {
      this.method_37372().method_36633(field_21836, var1);
   }

   public boolean method_20784() {
      return this.method_37372().<Boolean>method_36640(field_21836);
   }

   public int method_20791() {
      return this.field_21826;
   }

   public void method_20787(int var1) {
      this.field_21826 = var1;
   }

   @Override
   public void method_37123() {
      super.method_37123();
      boolean var3 = this.method_20784();
      float var4 = this.method_20783();
      if (!this.world.field_33055) {
         if (this.field_41697 >= this.field_21824 + this.field_21826) {
            this.method_37204();
            return;
         }

         boolean var5 = this.field_41697 < this.field_21824;
         if (var3 != var5) {
            this.method_20786(var5);
         }

         if (var5) {
            return;
         }

         if (this.field_21823 != 0.0F) {
            var4 += this.field_21823;
            if (var4 < 0.5F) {
               this.method_37204();
               return;
            }

            this.method_20781(var4);
         }

         if (this.field_41697 % 5 == 0) {
            Iterator var6 = this.field_21829.entrySet().iterator();

            while (var6.hasNext()) {
               Entry var7 = (Entry)var6.next();
               if (this.field_41697 >= (Integer)var7.getValue()) {
                  var6.remove();
               }
            }

            ArrayList var27 = Lists.newArrayList();

            for (class_2250 var9 : this.field_21822.method_27404()) {
               var27.add(new class_2250(var9.method_10339(), var9.method_10347() / 4, var9.method_10333(), var9.method_10338(), var9.method_10336()));
            }

            var27.addAll(this.field_21833);
            if (!var27.isEmpty()) {
               List var30 = this.world.<LivingEntity>method_25868(LivingEntity.class, this.getBoundingBox());
               if (!var30.isEmpty()) {
                  for (LivingEntity var10 : var30) {
                     if (!this.field_21829.containsKey(var10) && var10.method_26611()) {
                        double var16 = var10.getPosX() - this.getPosX();
                        double var18 = var10.getPosZ() - this.getPosZ();
                        double var20 = var16 * var16 + var18 * var18;
                        if (var20 <= (double)(var4 * var4)) {
                           this.field_21829.put(var10, this.field_41697 + this.field_21828);

                           for (class_2250 var23 : var27) {
                              if (!var23.method_10339().method_6535()) {
                                 var10.method_26558(new class_2250(var23));
                              } else {
                                 var23.method_10339().method_6539(this, this.method_20795(), var10, var23.method_10333(), 0.5);
                              }
                           }

                           if (this.field_21831 != 0.0F) {
                              var4 += this.field_21831;
                              if (var4 < 0.5F) {
                                 this.method_37204();
                                 return;
                              }

                              this.method_20781(var4);
                           }

                           if (this.field_21821 != 0) {
                              this.field_21826 = this.field_21826 + this.field_21821;
                              if (this.field_21826 <= 0) {
                                 this.method_37204();
                                 return;
                              }
                           }
                        }
                     }
                  }
               }
            } else {
               this.field_21829.clear();
            }
         }
      } else {
         class_5079 var24 = this.method_20792();
         if (!var3) {
            float var25 = (float) Math.PI * var4 * var4;

            for (int var28 = 0; (float)var28 < var25; var28++) {
               float var31 = this.field_41717.nextFloat() * (float) (Math.PI * 2);
               float var34 = MathHelper.sqrt(this.field_41717.nextFloat()) * var4;
               float var36 = MathHelper.cos(var31) * var34;
               float var11 = MathHelper.sin(var31) * var34;
               if (var24.method_23357() != class_3090.field_15353) {
                  this.world
                     .method_29551(
                        var24,
                        this.getPosX() + (double)var36,
                        this.method_37309(),
                        this.getPosZ() + (double)var11,
                        (0.5 - this.field_41717.nextDouble()) * 0.15,
                        0.01F,
                        (0.5 - this.field_41717.nextDouble()) * 0.15
                     );
               } else {
                  int var12 = this.method_20790();
                  int var13 = var12 >> 16 & 0xFF;
                  int var14 = var12 >> 8 & 0xFF;
                  int var15 = var12 & 0xFF;
                  this.world
                     .method_29551(
                        var24,
                        this.getPosX() + (double)var36,
                        this.method_37309(),
                        this.getPosZ() + (double)var11,
                        (double)((float)var13 / 255.0F),
                        (double)((float)var14 / 255.0F),
                        (double)((float)var15 / 255.0F)
                     );
               }
            }
         } else if (this.field_41717.nextBoolean()) {
            for (int var26 = 0; var26 < 2; var26++) {
               float var29 = this.field_41717.nextFloat() * (float) (Math.PI * 2);
               float var32 = MathHelper.sqrt(this.field_41717.nextFloat()) * 0.2F;
               float var35 = MathHelper.cos(var29) * var32;
               float var37 = MathHelper.sin(var29) * var32;
               if (var24.method_23357() != class_3090.field_15353) {
                  this.world
                     .method_29551(var24, this.getPosX() + (double)var35, this.method_37309(), this.getPosZ() + (double)var37, 0.0, 0.0, 0.0);
               } else {
                  int var38 = !this.field_41717.nextBoolean() ? this.method_20790() : 16777215;
                  int var39 = var38 >> 16 & 0xFF;
                  int var40 = var38 >> 8 & 0xFF;
                  int var41 = var38 & 0xFF;
                  this.world
                     .method_29551(
                        var24,
                        this.getPosX() + (double)var35,
                        this.method_37309(),
                        this.getPosZ() + (double)var37,
                        (double)((float)var39 / 255.0F),
                        (double)((float)var40 / 255.0F),
                        (double)((float)var41 / 255.0F)
                     );
               }
            }
         }
      }
   }

   public void method_20779(float var1) {
      this.field_21831 = var1;
   }

   public void method_20780(float var1) {
      this.field_21823 = var1;
   }

   public void method_20796(int var1) {
      this.field_21824 = var1;
   }

   public void method_20782(LivingEntity var1) {
      this.field_21825 = var1;
      this.field_21837 = var1 != null ? var1.method_37328() : null;
   }

   @Nullable
   public LivingEntity method_20795() {
      if (this.field_21825 == null && this.field_21837 != null && this.world instanceof class_6331) {
         Entity var3 = ((class_6331)this.world).method_28925(this.field_21837);
         if (var3 instanceof LivingEntity) {
            this.field_21825 = (LivingEntity)var3;
         }
      }

      return this.field_21825;
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      this.field_41697 = var1.method_25947("Age");
      this.field_21826 = var1.method_25947("Duration");
      this.field_21824 = var1.method_25947("WaitTime");
      this.field_21828 = var1.method_25947("ReapplicationDelay");
      this.field_21821 = var1.method_25947("DurationOnUse");
      this.field_21831 = var1.getFloat("RadiusOnUse");
      this.field_21823 = var1.getFloat("RadiusPerTick");
      this.method_20781(var1.getFloat("Radius"));
      if (var1.method_25954("Owner")) {
         this.field_21837 = var1.method_25926("Owner");
      }

      if (var1.contains("Particle", 8)) {
         try {
            this.method_20789(class_3469.method_15950(new StringReader(var1.method_25965("Particle"))));
         } catch (CommandSyntaxException var7) {
            field_21835.warn("Couldn't load custom particle {}", var1.method_25965("Particle"), var7);
         }
      }

      if (var1.contains("Color", 99)) {
         this.method_20785(var1.method_25947("Color"));
      }

      if (var1.contains("Potion", 8)) {
         this.method_20793(class_9541.method_43989(var1));
      }

      if (var1.contains("Effects", 9)) {
         class_3416 var4 = var1.method_25927("Effects", 10);
         this.field_21833.clear();

         for (int var5 = 0; var5 < var4.size(); var5++) {
            class_2250 var6 = class_2250.method_10343(var4.method_15764(var5));
            if (var6 != null) {
               this.method_20788(var6);
            }
         }
      }
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      var1.putInt("Age", this.field_41697);
      var1.putInt("Duration", this.field_21826);
      var1.putInt("WaitTime", this.field_21824);
      var1.putInt("ReapplicationDelay", this.field_21828);
      var1.putInt("DurationOnUse", this.field_21821);
      var1.putFloat("RadiusOnUse", this.field_21831);
      var1.putFloat("RadiusPerTick", this.field_21823);
      var1.putFloat("Radius", this.method_20783());
      var1.method_25941("Particle", this.method_20792().method_23358());
      if (this.field_21837 != null) {
         var1.method_25964("Owner", this.field_21837);
      }

      if (this.field_21832) {
         var1.putInt("Color", this.method_20790());
      }

      if (this.field_21822 != class_3697.field_18134 && this.field_21822 != null) {
         var1.method_25941("Potion", class_8669.field_44365.method_39797(this.field_21822).toString());
      }

      if (!this.field_21833.isEmpty()) {
         class_3416 var4 = new class_3416();

         for (class_2250 var6 : this.field_21833) {
            var4.add(var6.method_10345(new CompoundNBT()));
         }

         var1.put("Effects", var4);
      }
   }

   @Override
   public void method_37191(class_7821<?> var1) {
      if (field_21838.equals(var1)) {
         this.method_37187();
      }

      super.method_37191(var1);
   }

   @Override
   public class_718 method_37132() {
      return class_718.field_3914;
   }

   @Override
   public Packet<?> method_37142() {
      return new class_6589(this);
   }

   @Override
   public class_6097 method_37190(class_7653 var1) {
      return class_6097.method_27938(this.method_20783() * 2.0F, 0.5F);
   }
}
