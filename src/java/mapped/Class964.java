package mapped;

import com.google.common.collect.Lists;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Class964 extends Class944 {
   private ResourceLocation field5395;
   private String field5396 = "";
   private String field5397 = "";
   private BlockPos field5398 = new BlockPos(0, 1, 0);
   private BlockPos field5399 = BlockPos.field13032;
   private Class2089 field5400 = Class2089.field13614;
   private Class80 field5401 = Class80.field185;
   private Class104 field5402 = Class104.field321;
   private boolean field5403 = true;
   private boolean field5404;
   private boolean field5405;
   private boolean field5406 = true;
   private float field5407 = 1.0F;
   private long field5408;

   public Class964() {
      super(Class4387.field21440);
   }

   @Override
   public double method3773() {
      return 96.0;
   }

   @Override
   public Class39 method3646(Class39 var1) {
      super.method3646(var1);
      var1.method109("name", this.method3934());
      var1.method109("author", this.field5396);
      var1.method109("metadata", this.field5397);
      var1.method102("posX", this.field5398.method8304());
      var1.method102("posY", this.field5398.getY());
      var1.method102("posZ", this.field5398.method8306());
      var1.method102("sizeX", this.field5399.method8304());
      var1.method102("sizeY", this.field5399.getY());
      var1.method102("sizeZ", this.field5399.method8306());
      var1.method109("rotation", this.field5401.toString());
      var1.method109("mirror", this.field5400.toString());
      var1.method109("mode", this.field5402.toString());
      var1.method115("ignoreEntities", this.field5403);
      var1.method115("powered", this.field5404);
      var1.method115("showair", this.field5405);
      var1.method115("showboundingbox", this.field5406);
      var1.method107("integrity", this.field5407);
      var1.method103("seed", this.field5408);
      return var1;
   }

   @Override
   public void method3645(Class7380 var1, Class39 var2) {
      super.method3645(var1, var2);
      this.method3937(var2.method126("name"));
      this.field5396 = var2.method126("author");
      this.field5397 = var2.method126("metadata");
      int var5 = MathHelper.method37775(var2.method122("posX"), -48, 48);
      int var6 = MathHelper.method37775(var2.method122("posY"), -48, 48);
      int var7 = MathHelper.method37775(var2.method122("posZ"), -48, 48);
      this.field5398 = new BlockPos(var5, var6, var7);
      int var8 = MathHelper.method37775(var2.method122("sizeX"), 0, 48);
      int var9 = MathHelper.method37775(var2.method122("sizeY"), 0, 48);
      int var10 = MathHelper.method37775(var2.method122("sizeZ"), 0, 48);
      this.field5399 = new BlockPos(var8, var9, var10);

      try {
         this.field5401 = Class80.valueOf(var2.method126("rotation"));
      } catch (IllegalArgumentException var14) {
         this.field5401 = Class80.field185;
      }

      try {
         this.field5400 = Class2089.valueOf(var2.method126("mirror"));
      } catch (IllegalArgumentException var13) {
         this.field5400 = Class2089.field13614;
      }

      try {
         this.field5402 = Class104.valueOf(var2.method126("mode"));
      } catch (IllegalArgumentException var12) {
         this.field5402 = Class104.field321;
      }

      this.field5403 = var2.method132("ignoreEntities");
      this.field5404 = var2.method132("powered");
      this.field5405 = var2.method132("showair");
      this.field5406 = var2.method132("showboundingbox");
      if (var2.method118("integrity")) {
         this.field5407 = var2.method124("integrity");
      } else {
         this.field5407 = 1.0F;
      }

      this.field5408 = var2.method123("seed");
      this.method3932();
   }

   private void method3932() {
      if (this.field5324 != null) {
         BlockPos var3 = this.method3774();
         Class7380 var4 = this.field5324.method6738(var3);
         if (var4.method23448(Blocks.field37113)) {
            this.field5324.method6725(var3, var4.method23465(Class3367.field18938, this.field5402), 2);
         }
      }
   }

   @Nullable
   @Override
   public Class5610 method3776() {
      return new Class5610(this.field5325, 7, this.method3777());
   }

   @Override
   public Class39 method3777() {
      return this.method3646(new Class39());
   }

   public boolean method3933(PlayerEntity var1) {
      if (var1.method2979()) {
         if (var1.method3395().field9020) {
            var1.method2891(this);
         }

         return true;
      } else {
         return false;
      }
   }

   public String method3934() {
      return this.field5395 != null ? this.field5395.toString() : "";
   }

   public String method3935() {
      return this.field5395 != null ? this.field5395.method8292() : "";
   }

   public boolean method3936() {
      return this.field5395 != null;
   }

   public void method3937(String var1) {
      this.method3938(!Class9001.method33256(var1) ? ResourceLocation.method8289(var1) : null);
   }

   public void method3938(ResourceLocation var1) {
      this.field5395 = var1;
   }

   public void method3939(Class880 var1) {
      this.field5396 = var1.method2941().getString();
   }

   public BlockPos method3940() {
      return this.field5398;
   }

   public void method3941(BlockPos var1) {
      this.field5398 = var1;
   }

   public BlockPos method3942() {
      return this.field5399;
   }

   public void method3943(BlockPos var1) {
      this.field5399 = var1;
   }

   public Class2089 method3944() {
      return this.field5400;
   }

   public void method3945(Class2089 var1) {
      this.field5400 = var1;
   }

   public Class80 method3946() {
      return this.field5401;
   }

   public void method3947(Class80 var1) {
      this.field5401 = var1;
   }

   public String method3948() {
      return this.field5397;
   }

   public void method3949(String var1) {
      this.field5397 = var1;
   }

   public Class104 method3950() {
      return this.field5402;
   }

   public void method3951(Class104 var1) {
      this.field5402 = var1;
      Class7380 var4 = this.field5324.method6738(this.method3774());
      if (var4.method23448(Blocks.field37113)) {
         this.field5324.method6725(this.method3774(), var4.method23465(Class3367.field18938, var1), 2);
      }
   }

   public void method3952() {
      switch (Class7708.field33095[this.method3950().ordinal()]) {
         case 1:
            this.method3951(Class104.field319);
            break;
         case 2:
            this.method3951(Class104.field320);
            break;
         case 3:
            this.method3951(Class104.field321);
            break;
         case 4:
            this.method3951(Class104.field318);
      }
   }

   public boolean method3953() {
      return this.field5403;
   }

   public void method3954(boolean var1) {
      this.field5403 = var1;
   }

   public float method3955() {
      return this.field5407;
   }

   public void method3956(float var1) {
      this.field5407 = var1;
   }

   public long method3957() {
      return this.field5408;
   }

   public void method3958(long var1) {
      this.field5408 = var1;
   }

   public boolean method3959() {
      if (this.field5402 == Class104.field318) {
         BlockPos var3 = this.method3774();

         BlockPos var5 = new BlockPos(var3.method8304() - 80, 0, var3.method8306() - 80);
         BlockPos var6 = new BlockPos(var3.method8304() + 80, 255, var3.method8306() + 80);
         List var7 = this.method3961(var5, var6);
         List var8 = this.method3960(var7);
         if (var8.size() >= 1) {
            Class9764 var9 = this.method3962(var3, var8);
            if (var9.field45681 - var9.field45678 > 1 && var9.field45682 - var9.field45679 > 1 && var9.field45683 - var9.field45680 > 1) {
               this.field5398 = new BlockPos(
                  var9.field45678 - var3.method8304() + 1, var9.field45679 - var3.getY() + 1, var9.field45680 - var3.method8306() + 1
               );
               this.field5399 = new BlockPos(
                  var9.field45681 - var9.field45678 - 1, var9.field45682 - var9.field45679 - 1, var9.field45683 - var9.field45680 - 1
               );
               this.method3622();
               Class7380 var10 = this.field5324.method6738(var3);
               this.field5324.method6731(var3, var10, var10, 3);
               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private List<Class964> method3960(List<Class964> var1) {
      Predicate<Class964> var4 = var1x -> var1x.field5402 == Class104.field320 && Objects.equals(this.field5395, var1x.field5395);
      return var1.stream().filter(var4).collect(Collectors.toList());
   }

   private List<Class964> method3961(BlockPos var1, BlockPos var2) {
      ArrayList var5 = Lists.newArrayList();

      for (BlockPos var7 : BlockPos.method8359(var1, var2)) {
         Class7380 var8 = this.field5324.method6738(var7);
         if (var8.method23448(Blocks.field37113)) {
            Class944 var9 = this.field5324.method6759(var7);
            if (var9 != null && var9 instanceof Class964) {
               var5.add((Class964)var9);
            }
         }
      }

      return var5;
   }

   private Class9764 method3962(BlockPos var1, List<Class964> var2) {
      Class9764 var5;
      if (var2.size() <= 1) {
         var5 = new Class9764(var1, var1);
      } else {
         BlockPos var6 = ((Class964)var2.get(0)).method3774();
         var5 = new Class9764(var6, var6);
      }

      for (Class964 var7 : var2) {
         BlockPos var8 = var7.method3774();
         if (var8.method8304() >= var5.field45678) {
            if (var8.method8304() > var5.field45681) {
               var5.field45681 = var8.method8304();
            }
         } else {
            var5.field45678 = var8.method8304();
         }

         if (var8.getY() >= var5.field45679) {
            if (var8.getY() > var5.field45682) {
               var5.field45682 = var8.getY();
            }
         } else {
            var5.field45679 = var8.getY();
         }

         if (var8.method8306() >= var5.field45680) {
            if (var8.method8306() > var5.field45683) {
               var5.field45683 = var8.method8306();
            }
         } else {
            var5.field45680 = var8.method8306();
         }
      }

      return var5;
   }

   public boolean method3963() {
      return this.method3964(true);
   }

   public boolean method3964(boolean var1) {
      if (this.field5402 == Class104.field318 && !this.field5324.field9020 && this.field5395 != null) {
         BlockPos var4 = this.method3774().method8337(this.field5398);
         ServerWorld var5 = (ServerWorld)this.field5324;
         Class8761 var6 = var5.method6938();

         Class8969 var7;
         try {
            var7 = var6.method31603(this.field5395);
         } catch (Class2496 var10) {
            return false;
         }

         var7.method32889(this.field5324, var4, this.field5399, !this.field5403, Blocks.field36894);
         var7.method32887(this.field5396);
         if (var1) {
            try {
               return var6.method31610(this.field5395);
            } catch (Class2496 var9) {
               return false;
            }
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public boolean method3965(ServerWorld var1) {
      return this.method3967(var1, true);
   }

   private static Random method3966(long var0) {
      return var0 != 0L ? new Random(var0) : new Random(Util.method38487());
   }

   public boolean method3967(ServerWorld var1, boolean var2) {
      if (this.field5402 == Class104.field319 && this.field5395 != null) {
         Class8761 var5 = var1.method6938();

         Class8969 var6;
         try {
            var6 = var5.method31604(this.field5395);
         } catch (Class2496 var8) {
            return false;
         }

         return var6 == null ? false : this.method3968(var1, var2, var6);
      } else {
         return false;
      }
   }

   public boolean method3968(ServerWorld var1, boolean var2, Class8969 var3) {
      BlockPos var6 = this.method3774();
      if (!Class9001.method33256(var3.method32888())) {
         this.field5396 = var3.method32888();
      }

      BlockPos var7 = var3.method32886();
      boolean var8 = this.field5399.equals(var7);
      if (!var8) {
         this.field5399 = var7;
         this.method3622();
         Class7380 var9 = var1.method6738(var6);
         var1.method6731(var6, var9, var9, 3);
      }

      if (var2 && !var8) {
         return false;
      } else {
         Class9463 var11 = new Class9463().method36425(this.field5400).method36426(this.field5401).method36428(this.field5403).method36429((Class7481)null);
         if (this.field5407 < 1.0F) {
            var11.method36433().method36434(new Class7094(MathHelper.method37777(this.field5407, 0.0F, 1.0F))).method36431(method3966(this.field5408));
         }

         BlockPos var10 = var6.method8337(this.field5398);
         var3.method32897(var1, var10, var11, method3966(this.field5408));
         return true;
      }
   }

   public void method3969() {
      if (this.field5395 != null) {
         ServerWorld var3 = (ServerWorld)this.field5324;
         Class8761 var4 = var3.method6938();
         var4.method31613(this.field5395);
      }
   }

   public boolean method3970() {
      if (this.field5402 == Class104.field319 && !this.field5324.field9020 && this.field5395 != null) {
         ServerWorld var3 = (ServerWorld)this.field5324;
         Class8761 var4 = var3.method6938();

         try {
            return var4.method31604(this.field5395) != null;
         } catch (Class2496 var6) {
            return false;
         }
      } else {
         return false;
      }
   }

   public boolean method3971() {
      return this.field5404;
   }

   public void method3972(boolean var1) {
      this.field5404 = var1;
   }

   public boolean method3973() {
      return this.field5405;
   }

   public void method3974(boolean var1) {
      this.field5405 = var1;
   }

   public boolean method3975() {
      return this.field5406;
   }

   public void method3976(boolean var1) {
      this.field5406 = var1;
   }
}
