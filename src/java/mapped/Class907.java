package mapped;

import com.google.common.collect.Lists;

import java.util.List;

public class Class907 extends Entity {
   private Class7380 field5176 = Class8487.field36415.method11579();
   public int field5177;
   public boolean field5178 = true;
   private boolean field5179;
   private boolean field5180;
   private int field5181 = 40;
   private float field5182 = 2.0F;
   public Class39 field5183;
   public static final Class9289<BlockPos> field5184 = Class9361.<BlockPos>method35441(Class907.class, Class7784.field33401);

   public Class907(Class8992<? extends Class907> var1, Class1655 var2) {
      super(var1, var2);
   }

   public Class907(Class1655 var1, double var2, double var4, double var6, Class7380 var8) {
      this(Class8992.field41031, var1);
      this.field5176 = var8;
      this.field5019 = true;
      this.method3215(var2, var4 + (double)((1.0F - this.method3430()) / 2.0F), var6);
      this.method3434(Vector3d.field18047);
      this.field5025 = var2;
      this.field5026 = var4;
      this.field5027 = var6;
      this.method3552(this.method3432());
   }

   @Override
   public boolean method3360() {
      return false;
   }

   public void method3552(BlockPos var1) {
      this.field5063.method35446(field5184, var1);
   }

   public BlockPos method3553() {
      return this.field5063.<BlockPos>method35445(field5184);
   }

   @Override
   public boolean method2940() {
      return false;
   }

   @Override
   public void method2850() {
      this.field5063.method35442(field5184, BlockPos.field13032);
   }

   @Override
   public boolean method3139() {
      return !this.field5041;
   }

   @Override
   public void tick() {
      if (!this.field5176.method23393()) {
         Class3209 var3 = this.field5176.method23383();
         if (this.field5177++ == 0) {
            BlockPos var4 = this.method3432();
            if (!this.field5024.method6738(var4).method23448(var3)) {
               if (!this.field5024.field9020) {
                  this.method2904();
                  return;
               }
            } else {
               this.field5024.method6728(var4, false);
            }
         }

         if (!this.method3247()) {
            this.method3434(this.method3433().method11339(0.0, -0.04, 0.0));
         }

         this.move(Class2107.field13742, this.method3433());
         if (!this.field5024.field9020) {
            BlockPos var18 = this.method3432();
            boolean var5 = this.field5176.method23383() instanceof Class3217;
            boolean var6 = var5 && this.field5024.method6739(var18).method23486(Class8953.field40469);
            double var7 = this.method3433().method11349();
            if (var5 && var7 > 1.0) {
               Class8711 var9 = this.field5024
                  .method7036(
                     new Class6809(
                        new Vector3d(this.field5025, this.field5026, this.field5027), this.method3431(), Class2271.field14774, Class1985.field12963, this
                     )
                  );
               if (var9.method31417() != Class2100.field13689 && this.field5024.method6739(var9.method31423()).method23486(Class8953.field40469)) {
                  var18 = var9.method31423();
                  var6 = true;
               }
            }

            if (!this.field5036 && !var6) {
               if (!this.field5024.field9020 && (this.field5177 > 100 && (var18.getY() < 1 || var18.getY() > 256) || this.field5177 > 600)) {
                  if (this.field5178 && this.field5024.method6789().method17135(Class5462.field24229)) {
                     this.method3300(var3);
                  }

                  this.method2904();
               }
            } else {
               Class7380 var19 = this.field5024.method6738(var18);
               this.method3434(this.method3433().method11347(0.7, -0.5, 0.7));
               if (!var19.method23448(Class8487.field36505)) {
                  this.method2904();
                  if (this.field5179) {
                     if (var3 instanceof Class3213) {
                        ((Class3213)var3).method11600(this.field5024, var18, this);
                     }
                  } else {
                     boolean var10 = var19.method23441(new Class5910(this.field5024, var18, Direction.field672, Class8848.field39973, Direction.field673));
                     boolean var11 = Class3213.method11598(this.field5024.method6738(var18.method8313())) && (!var5 || !var6);
                     boolean var12 = this.field5176.method23443(this.field5024, var18) && !var11;
                     if (var10 && var12) {
                        if (this.field5176.method23462(Class8820.field39710) && this.field5024.method6739(var18).method23472() == Class9479.field44066) {
                           this.field5176 = this.field5176.method23465(Class8820.field39710, Boolean.valueOf(true));
                        }

                        if (!this.field5024.method6725(var18, this.field5176, 3)) {
                           if (this.field5178 && this.field5024.method6789().method17135(Class5462.field24229)) {
                              this.method3300(var3);
                           }
                        } else {
                           if (var3 instanceof Class3213) {
                              ((Class3213)var3).method11599(this.field5024, var18, this.field5176, var19, this);
                           }

                           if (this.field5183 != null && var3 instanceof Class3245) {
                              Class944 var13 = this.field5024.method6759(var18);
                              if (var13 != null) {
                                 Class39 var14 = var13.method3646(new Class39());

                                 for (String var16 : this.field5183.method97()) {
                                    Class30 var17 = this.field5183.method116(var16);
                                    if (!"x".equals(var16) && !"y".equals(var16) && !"z".equals(var16)) {
                                       var14.method99(var16, var17.method79());
                                    }
                                 }

                                 var13.method3645(this.field5176, var14);
                                 var13.method3622();
                              }
                           }
                        }
                     } else if (this.field5178 && this.field5024.method6789().method17135(Class5462.field24229)) {
                        this.method3300(var3);
                     }
                  }
               }
            }
         }

         this.method3434(this.method3433().method11344(0.98));
      } else {
         this.method2904();
      }
   }

   @Override
   public boolean method2921(float var1, float var2) {
      if (this.field5180) {
         int var5 = Class9679.method37773(var1 - 1.0F);
         if (var5 > 0) {
            List<Entity> var6 = Lists.newArrayList(this.field5024.method7181(this, this.method3389()));
            boolean var7 = this.field5176.method23446(Class7645.field32765);
            Class8654 var8 = !var7 ? Class8654.field39009 : Class8654.field39008;

            for (Entity var10 : var6) {
               var10.method2741(var8, (float)Math.min(Class9679.method37767((float)var5 * this.field5182), this.field5181));
            }

            if (var7 && (double)this.field5054.nextFloat() < 0.05F + (double)var5 * 0.05) {
               Class7380 var11 = Class3218.method11607(this.field5176);
               if (var11 != null) {
                  this.field5176 = var11;
               } else {
                  this.field5179 = true;
               }
            }
         }
      }

      return false;
   }

   @Override
   public void method2724(Class39 var1) {
      var1.method99("BlockState", Class8354.method29287(this.field5176));
      var1.method102("Time", this.field5177);
      var1.method115("DropItem", this.field5178);
      var1.method115("HurtEntities", this.field5180);
      var1.method107("FallHurtAmount", this.field5182);
      var1.method102("FallHurtMax", this.field5181);
      if (this.field5183 != null) {
         var1.method99("TileEntityData", this.field5183);
      }
   }

   @Override
   public void method2723(Class39 var1) {
      this.field5176 = Class8354.method29285(var1.method130("BlockState"));
      this.field5177 = var1.method122("Time");
      if (!var1.method119("HurtEntities", 99)) {
         if (this.field5176.method23446(Class7645.field32765)) {
            this.field5180 = true;
         }
      } else {
         this.field5180 = var1.method132("HurtEntities");
         this.field5182 = var1.method124("FallHurtAmount");
         this.field5181 = var1.method122("FallHurtMax");
      }

      if (var1.method119("DropItem", 99)) {
         this.field5178 = var1.method132("DropItem");
      }

      if (var1.method119("TileEntityData", 10)) {
         this.field5183 = var1.method130("TileEntityData");
      }

      if (this.field5176.method23393()) {
         this.field5176 = Class8487.field36415.method11579();
      }
   }

   public Class1655 method3554() {
      return this.field5024;
   }

   public void method3555(boolean var1) {
      this.field5180 = var1;
   }

   @Override
   public boolean method3373() {
      return false;
   }

   @Override
   public void method3372(Class8965 var1) {
      super.method3372(var1);
      var1.method32807("Immitating BlockState", this.field5176.toString());
   }

   public Class7380 method3556() {
      return this.field5176;
   }

   @Override
   public boolean method3404() {
      return true;
   }

   @Override
   public Packet<?> method2835() {
      return new Class5487(this, Class3209.method11535(this.method3556()));
   }
}
