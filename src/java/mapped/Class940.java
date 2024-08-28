package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;
import java.util.List;
import java.util.stream.IntStream;

public class Class940 extends Class939 implements Class930, Class935 {
   private static final int[] field5304 = IntStream.range(0, 27).toArray();
   private Class25<Class8848> field5305 = Class25.<Class8848>method68(27, Class8848.field39973);
   private int field5306;
   private Class2126 field5307 = Class2126.field13872;
   private float field5308;
   private float field5309;
   private Class112 field5310;
   private boolean field5311;

   public Class940(Class112 var1) {
      super(Class4387.field21443);
      this.field5310 = var1;
   }

   public Class940() {
      this((Class112)null);
      this.field5311 = true;
   }

   @Override
   public void method3647() {
      this.method3745();
      if (this.field5307 == Class2126.field13873 || this.field5307 == Class2126.field13875) {
         this.method3750();
      }
   }

   public void method3745() {
      this.field5309 = this.field5308;
      switch (Class9671.field45162[this.field5307.ordinal()]) {
         case 1:
            this.field5308 = 0.0F;
            break;
         case 2:
            this.field5308 += 0.1F;
            if (this.field5308 >= 1.0F) {
               this.method3750();
               this.field5307 = Class2126.field13874;
               this.field5308 = 1.0F;
               this.method3752();
            }
            break;
         case 3:
            this.field5308 -= 0.1F;
            if (this.field5308 <= 0.0F) {
               this.field5307 = Class2126.field13872;
               this.field5308 = 0.0F;
               this.method3752();
            }
            break;
         case 4:
            this.field5308 = 1.0F;
      }
   }

   public Class2126 method3746() {
      return this.field5307;
   }

   public Class6488 method3747(Class7380 var1) {
      return this.method3748(var1.<Direction>method23463(Class3368.field18939));
   }

   public Class6488 method3748(Direction var1) {
      float var4 = this.method3755(1.0F);
      return Class8022.method27426()
         .method19514()
         .method19662(
            (double)(0.5F * var4 * (float)var1.method539()), (double)(0.5F * var4 * (float)var1.method540()), (double)(0.5F * var4 * (float)var1.method541())
         );
   }

   private Class6488 method3749(Direction var1) {
      Direction var4 = var1.method536();
      return this.method3748(var1).method19660((double)var4.method539(), (double)var4.method540(), (double)var4.method541());
   }

   private void method3750() {
      Class7380 var3 = this.field5324.method6738(this.method3774());
      if (var3.method23383() instanceof Class3368) {
         Direction var4 = var3.<Direction>method23463(Class3368.field18939);
         Class6488 var5 = this.method3749(var4).method19668(this.field5325);
         List var6 = this.field5324.method7181((Entity)null, var5);
         if (!var6.isEmpty()) {
            for (int var7 = 0; var7 < var6.size(); var7++) {
               Entity var8 = (Entity)var6.get(var7);
               if (var8.method3422() != Class2315.field15865) {
                  double var9 = 0.0;
                  double var11 = 0.0;
                  double var13 = 0.0;
                  Class6488 var15 = var8.method3389();
                  switch (Class9671.field45163[var4.method544().ordinal()]) {
                     case 1:
                        if (var4.method535() == Class1892.field11092) {
                           var9 = var5.field28452 - var15.field28449;
                        } else {
                           var9 = var15.field28452 - var5.field28449;
                        }

                        var9 += 0.01;
                        break;
                     case 2:
                        if (var4.method535() == Class1892.field11092) {
                           var11 = var5.field28453 - var15.field28450;
                        } else {
                           var11 = var15.field28453 - var5.field28450;
                        }

                        var11 += 0.01;
                        break;
                     case 3:
                        if (var4.method535() == Class1892.field11092) {
                           var13 = var5.field28454 - var15.field28451;
                        } else {
                           var13 = var15.field28454 - var5.field28451;
                        }

                        var13 += 0.01;
                  }

                  var8.move(
                     Class2107.field13745, new Vector3d(var9 * (double)var4.method539(), var11 * (double)var4.method540(), var13 * (double)var4.method541())
                  );
               }
            }
         }
      }
   }

   @Override
   public int method3629() {
      return this.field5305.size();
   }

   @Override
   public boolean method3751(int var1, int var2) {
      if (var1 != 1) {
         return super.method3751(var1, var2);
      } else {
         this.field5306 = var2;
         if (var2 == 0) {
            this.field5307 = Class2126.field13875;
            this.method3752();
         }

         if (var2 == 1) {
            this.field5307 = Class2126.field13873;
            this.method3752();
         }

         return true;
      }
   }

   private void method3752() {
      this.method3775().method23424(this.method3734(), this.method3774(), 3);
   }

   @Override
   public void method3631(PlayerEntity var1) {
      if (!var1.method2800()) {
         if (this.field5306 < 0) {
            this.field5306 = 0;
         }

         this.field5306++;
         this.field5324.method6787(this.field5325, this.method3775().method23383(), 1, this.field5306);
         if (this.field5306 == 1) {
            this.field5324
               .method6742((PlayerEntity)null, this.field5325, Class6067.field27045, Class2266.field14732, 0.5F, this.field5324.field9016.nextFloat() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void method3632(PlayerEntity var1) {
      if (!var1.method2800()) {
         this.field5306--;
         this.field5324.method6787(this.field5325, this.method3775().method23383(), 1, this.field5306);
         if (this.field5306 <= 0) {
            this.field5324
               .method6742((PlayerEntity)null, this.field5325, Class6067.field27044, Class2266.field14732, 0.5F, this.field5324.field9016.nextFloat() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public ITextComponent method3686() {
      return new TranslationTextComponent("container.shulkerBox");
   }

   @Override
   public void method3645(Class7380 var1, Class39 var2) {
      super.method3645(var1, var2);
      this.method3753(var2);
   }

   @Override
   public Class39 method3646(Class39 var1) {
      super.method3646(var1);
      return this.method3754(var1);
   }

   public void method3753(Class39 var1) {
      this.field5305 = Class25.<Class8848>method68(this.method3629(), Class8848.field39973);
      if (!this.method3741(var1) && var1.method119("Items", 9)) {
         Class7920.method26567(var1, this.field5305);
      }
   }

   public Class39 method3754(Class39 var1) {
      if (!this.method3742(var1)) {
         Class7920.method26566(var1, this.field5305, false);
      }

      return var1;
   }

   @Override
   public Class25<Class8848> method3724() {
      return this.field5305;
   }

   @Override
   public void method3725(Class25<Class8848> var1) {
      this.field5305 = var1;
   }

   @Override
   public int[] method3653(Direction var1) {
      return field5304;
   }

   @Override
   public boolean method3654(int var1, Class8848 var2, Direction var3) {
      return !(Block.method11537(var2.method32107()) instanceof Class3368);
   }

   @Override
   public boolean method3655(int var1, Class8848 var2, Direction var3) {
      return true;
   }

   public float method3755(float var1) {
      return Class9679.method37821(var1, this.field5309, this.field5308);
   }

   @Nullable
   public Class112 method3756() {
      if (this.field5311) {
         this.field5310 = Class3368.method11955(this.method3775().method23383());
         this.field5311 = false;
      }

      return this.field5310;
   }

   @Override
   public Class5812 method3690(int var1, Class974 var2) {
      return new Class5814(var1, var2, this);
   }

   public boolean method3757() {
      return this.field5307 == Class2126.field13872;
   }
}
