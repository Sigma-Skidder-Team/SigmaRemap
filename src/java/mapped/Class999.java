package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.*;
import java.util.Map.Entry;

public class Class999 extends Entity {
   private static final Logger field5497 = LogManager.getLogger();
   private static final Class9289<Float> field5498 = Class9361.<Float>method35441(Class999.class, Class7784.field33392);
   private static final Class9289<Integer> field5499 = Class9361.<Integer>method35441(Class999.class, Class7784.field33391);
   private static final Class9289<Boolean> field5500 = Class9361.<Boolean>method35441(Class999.class, Class7784.field33398);
   private static final Class9289<Class7436> field5501 = Class9361.<Class7436>method35441(Class999.class, Class7784.field33399);
   private Class8812 field5502 = Class8137.field34976;
   private final List<Class2023> field5503 = Lists.newArrayList();
   private final Map<Entity, Integer> field5504 = Maps.newHashMap();
   private int field5505 = 600;
   private int field5506 = 20;
   private int field5507 = 20;
   private boolean field5508;
   private int field5509;
   private float field5510;
   private float field5511;
   private Class880 field5512;
   private UUID field5513;

   public Class999(Class8992<? extends Class999> var1, Class1655 var2) {
      super(var1, var2);
      this.field5052 = true;
      this.method4097(3.0F);
   }

   public Class999(Class1655 var1, double var2, double var4, double var6) {
      this(Class8992.field41005, var1);
      this.method3215(var2, var4, var6);
   }

   @Override
   public void method2850() {
      this.method3210().method35442(field5499, 0);
      this.method3210().method35442(field5498, 0.5F);
      this.method3210().method35442(field5500, false);
      this.method3210().method35442(field5501, Class7940.field34068);
   }

   public void method4097(float var1) {
      if (!this.field5024.field9020) {
         this.method3210().method35446(field5498, var1);
      }
   }

   @Override
   public void method3385() {
      double var3 = this.getPosX();
      double var5 = this.getPosY();
      double var7 = this.getPosZ();
      super.method3385();
      this.method3215(var3, var5, var7);
   }

   public float method4098() {
      return this.method3210().<Float>method35445(field5498);
   }

   public void method4099(Class8812 var1) {
      this.field5502 = var1;
      if (!this.field5508) {
         this.method4100();
      }
   }

   private void method4100() {
      if (this.field5502 == Class8137.field34976 && this.field5503.isEmpty()) {
         this.method3210().method35446(field5499, 0);
      } else {
         this.method3210().method35446(field5499, Class9741.method38184(Class9741.method38177(this.field5502, this.field5503)));
      }
   }

   public void method4101(Class2023 var1) {
      this.field5503.add(var1);
      if (!this.field5508) {
         this.method4100();
      }
   }

   public int method4102() {
      return this.method3210().<Integer>method35445(field5499);
   }

   public void method4103(int var1) {
      this.field5508 = true;
      this.method3210().method35446(field5499, var1);
   }

   public Class7436 method4104() {
      return this.method3210().<Class7436>method35445(field5501);
   }

   public void method4105(Class7436 var1) {
      this.method3210().method35446(field5501, var1);
   }

   public void method4106(boolean var1) {
      this.method3210().method35446(field5500, var1);
   }

   public boolean method4107() {
      return this.method3210().<Boolean>method35445(field5500);
   }

   public int method4108() {
      return this.field5505;
   }

   public void method4109(int var1) {
      this.field5505 = var1;
   }

   @Override
   public void tick() {
      super.tick();
      boolean var3 = this.method4107();
      float var4 = this.method4098();
      if (!this.field5024.field9020) {
         if (this.field5055 >= this.field5506 + this.field5505) {
            this.method2904();
            return;
         }

         boolean var5 = this.field5055 < this.field5506;
         if (var3 != var5) {
            this.method4106(var5);
         }

         if (var5) {
            return;
         }

         if (this.field5511 != 0.0F) {
            var4 += this.field5511;
            if (var4 < 0.5F) {
               this.method2904();
               return;
            }

            this.method4097(var4);
         }

         if (this.field5055 % 5 == 0) {
            Iterator var6 = this.field5504.entrySet().iterator();

            while (var6.hasNext()) {
               Entry var7 = (Entry)var6.next();
               if (this.field5055 >= (Integer)var7.getValue()) {
                  var6.remove();
               }
            }

           List<Class2023> var27 = Lists.newArrayList();

            for (Class2023 var9 : this.field5502.method31816()) {
               var27.add(new Class2023(var9.method8627(), var9.method8628() / 4, var9.method8629(), var9.method8630(), var9.method8631()));
            }

            var27.addAll(this.field5503);
            if (!var27.isEmpty()) {
               List<Class880> var30 = this.field5024.<Class880>method7182(Class880.class, this.method3389());
               if (!var30.isEmpty()) {
                  for (Class880 var10 : var30) {
                     if (!this.field5504.containsKey(var10) && var10.method3169()) {
                        double var16 = var10.getPosX() - this.getPosX();
                        double var18 = var10.getPosZ() - this.getPosZ();
                        double var20 = var16 * var16 + var18 * var18;
                        if (var20 <= (double)(var4 * var4)) {
                           this.field5504.put(var10, this.field5055 + this.field5507);

                           for (Class2023 var23 : var27) {
                              if (!var23.method8627().method22292()) {
                                 var10.method3035(new Class2023(var23));
                              } else {
                                 var23.method8627().method22290(this, this.method4114(), var10, var23.method8629(), 0.5);
                              }
                           }

                           if (this.field5510 != 0.0F) {
                              var4 += this.field5510;
                              if (var4 < 0.5F) {
                                 this.method2904();
                                 return;
                              }

                              this.method4097(var4);
                           }

                           if (this.field5509 != 0) {
                              this.field5505 = this.field5505 + this.field5509;
                              if (this.field5505 <= 0) {
                                 this.method2904();
                                 return;
                              }
                           }
                        }
                     }
                  }
               }
            } else {
               this.field5504.clear();
            }
         }
      } else {
         Class7436 var24 = this.method4104();
         if (!var3) {
            float var25 = (float) Math.PI * var4 * var4;

            for (int var28 = 0; (float)var28 < var25; var28++) {
               float var31 = this.field5054.nextFloat() * (float) (Math.PI * 2);
               float var34 = MathHelper.method37765(this.field5054.nextFloat()) * var4;
               float var36 = MathHelper.method37764(var31) * var34;
               float var11 = MathHelper.method37763(var31) * var34;
               if (var24.method24011() != Class7940.field34068) {
                  this.field5024
                     .method6748(
                        var24,
                        this.getPosX() + (double)var36,
                        this.getPosY(),
                        this.getPosZ() + (double)var11,
                        (0.5 - this.field5054.nextDouble()) * 0.15,
                        0.01F,
                        (0.5 - this.field5054.nextDouble()) * 0.15
                     );
               } else {
                  int var12 = this.method4102();
                  int var13 = var12 >> 16 & 0xFF;
                  int var14 = var12 >> 8 & 0xFF;
                  int var15 = var12 & 0xFF;
                  this.field5024
                     .method6748(
                        var24,
                        this.getPosX() + (double)var36,
                        this.getPosY(),
                        this.getPosZ() + (double)var11,
                        (double)((float)var13 / 255.0F),
                        (double)((float)var14 / 255.0F),
                        (double)((float)var15 / 255.0F)
                     );
               }
            }
         } else if (this.field5054.nextBoolean()) {
            for (int var26 = 0; var26 < 2; var26++) {
               float var29 = this.field5054.nextFloat() * (float) (Math.PI * 2);
               float var32 = MathHelper.method37765(this.field5054.nextFloat()) * 0.2F;
               float var35 = MathHelper.method37764(var29) * var32;
               float var37 = MathHelper.method37763(var29) * var32;
               if (var24.method24011() != Class7940.field34068) {
                  this.field5024.method6748(var24, this.getPosX() + (double)var35, this.getPosY(), this.getPosZ() + (double)var37, 0.0, 0.0, 0.0);
               } else {
                  int var38 = !this.field5054.nextBoolean() ? this.method4102() : 16777215;
                  int var39 = var38 >> 16 & 0xFF;
                  int var40 = var38 >> 8 & 0xFF;
                  int var41 = var38 & 0xFF;
                  this.field5024
                     .method6748(
                        var24,
                        this.getPosX() + (double)var35,
                        this.getPosY(),
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

   public void method4110(float var1) {
      this.field5510 = var1;
   }

   public void method4111(float var1) {
      this.field5511 = var1;
   }

   public void method4112(int var1) {
      this.field5506 = var1;
   }

   public void method4113(Class880 var1) {
      this.field5512 = var1;
      this.field5513 = var1 != null ? var1.getUniqueID() : null;
   }

   @Nullable
   public Class880 method4114() {
      if (this.field5512 == null && this.field5513 != null && this.field5024 instanceof ServerWorld) {
         Entity var3 = ((ServerWorld)this.field5024).method6942(this.field5513);
         if (var3 instanceof Class880) {
            this.field5512 = (Class880)var3;
         }
      }

      return this.field5512;
   }

   @Override
   public void method2723(Class39 var1) {
      this.field5055 = var1.method122("Age");
      this.field5505 = var1.method122("Duration");
      this.field5506 = var1.method122("WaitTime");
      this.field5507 = var1.method122("ReapplicationDelay");
      this.field5509 = var1.method122("DurationOnUse");
      this.field5510 = var1.method124("RadiusOnUse");
      this.field5511 = var1.method124("RadiusPerTick");
      this.method4097(var1.method124("Radius"));
      if (var1.method106("Owner")) {
         this.field5513 = var1.method105("Owner");
      }

      if (var1.method119("Particle", 8)) {
         try {
            this.method4105(Class8050.method27650(new StringReader(var1.method126("Particle"))));
         } catch (CommandSyntaxException var7) {
            field5497.warn("Couldn't load custom particle {}", var1.method126("Particle"), var7);
         }
      }

      if (var1.method119("Color", 99)) {
         this.method4103(var1.method122("Color"));
      }

      if (var1.method119("Potion", 8)) {
         this.method4099(Class9741.method38186(var1));
      }

      if (var1.method119("Effects", 9)) {
         Class41 var4 = var1.method131("Effects", 10);
         this.field5503.clear();

         for (int var5 = 0; var5 < var4.size(); var5++) {
            Class2023 var6 = Class2023.method8639(var4.method153(var5));
            if (var6 != null) {
               this.method4101(var6);
            }
         }
      }
   }

   @Override
   public void method2724(Class39 var1) {
      var1.method102("Age", this.field5055);
      var1.method102("Duration", this.field5505);
      var1.method102("WaitTime", this.field5506);
      var1.method102("ReapplicationDelay", this.field5507);
      var1.method102("DurationOnUse", this.field5509);
      var1.method107("RadiusOnUse", this.field5510);
      var1.method107("RadiusPerTick", this.field5511);
      var1.method107("Radius", this.method4098());
      var1.method109("Particle", this.method4104().method24010());
      if (this.field5513 != null) {
         var1.method104("Owner", this.field5513);
      }

      if (this.field5508) {
         var1.method102("Color", this.method4102());
      }

      if (this.field5502 != Class8137.field34976 && this.field5502 != null) {
         var1.method109("Potion", Class2348.field16076.method9181(this.field5502).toString());
      }

      if (!this.field5503.isEmpty()) {
         Class41 var4 = new Class41();

         for (Class2023 var6 : this.field5503) {
            var4.add(var6.method8637(new Class39()));
         }

         var1.method99("Effects", var4);
      }
   }

   @Override
   public void method3155(Class9289<?> var1) {
      if (field5498.equals(var1)) {
         this.method3385();
      }

      super.method3155(var1);
   }

   @Override
   public Class2315 method3422() {
      return Class2315.field15865;
   }

   @Override
   public Packet<?> method2835() {
      return new Class5487(this);
   }

   @Override
   public Class8847 method2981(Class2090 var1) {
      return Class8847.method32101(this.method4098() * 2.0F, 0.5F);
   }
}
