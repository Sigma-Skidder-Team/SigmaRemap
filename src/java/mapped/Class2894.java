package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class Class2894<T extends Class880> extends Class2797<T> {
   private static String[] field17431;
   private List<Class7219> field17918 = Lists.newArrayList();
   public final Class7219 field17919;
   public final Class7219 field17920;
   public final Class7219 field17921;
   public final Class7219 field17922;
   public final Class7219 field17923;
   private final Class7219 field17924;
   private final Class7219 field17925;
   private final boolean field17926;

   public Class2894(float var1, boolean var2) {
      super(RenderType::method14318, var1, 0.0F, 64, 64);
      this.field17926 = var2;
      this.field17925 = new Class7219(this, 24, 0);
      this.field17925.method22675(-3.0F, -6.0F, -1.0F, 6.0F, 6.0F, 1.0F, var1);
      this.field17924 = new Class7219(this, 0, 0);
      this.field17924.method22684(64, 32);
      this.field17924.method22675(-5.0F, 0.0F, -1.0F, 10.0F, 16.0F, 1.0F, var1);
      if (!var2) {
         this.field17436 = new Class7219(this, 32, 48);
         this.field17436.method22675(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
         this.field17436.method22679(5.0F, 2.0F, 0.0F);
         this.field17919 = new Class7219(this, 48, 48);
         this.field17919.method22675(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1 + 0.25F);
         this.field17919.method22679(5.0F, 2.0F, 0.0F);
         this.field17920 = new Class7219(this, 40, 32);
         this.field17920.method22675(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1 + 0.25F);
         this.field17920.method22679(-5.0F, 2.0F, 10.0F);
      } else {
         this.field17436 = new Class7219(this, 32, 48);
         this.field17436.method22675(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, var1);
         this.field17436.method22679(5.0F, 2.5F, 0.0F);
         this.field17435 = new Class7219(this, 40, 16);
         this.field17435.method22675(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, var1);
         this.field17435.method22679(-5.0F, 2.5F, 0.0F);
         this.field17919 = new Class7219(this, 48, 48);
         this.field17919.method22675(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, var1 + 0.25F);
         this.field17919.method22679(5.0F, 2.5F, 0.0F);
         this.field17920 = new Class7219(this, 40, 32);
         this.field17920.method22675(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, var1 + 0.25F);
         this.field17920.method22679(-5.0F, 2.5F, 10.0F);
      }

      this.field17438 = new Class7219(this, 16, 48);
      this.field17438.method22675(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.field17438.method22679(1.9F, 12.0F, 0.0F);
      this.field17921 = new Class7219(this, 0, 48);
      this.field17921.method22675(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1 + 0.25F);
      this.field17921.method22679(1.9F, 12.0F, 0.0F);
      this.field17922 = new Class7219(this, 0, 32);
      this.field17922.method22675(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1 + 0.25F);
      this.field17922.method22679(-1.9F, 12.0F, 0.0F);
      this.field17923 = new Class7219(this, 16, 32);
      this.field17923.method22675(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, var1 + 0.25F);
      this.field17923.method22679(0.0F, 0.0F, 0.0F);
   }

   @Override
   public Iterable<Class7219> method11002() {
      return Iterables.concat(super.method11002(), ImmutableList.of(this.field17921, this.field17922, this.field17919, this.field17920, this.field17923));
   }

   public void method11208(MatrixStack var1, Class5422 var2, int var3, int var4) {
      this.field17925.method22669(this.field17432);
      this.field17925.field31032 = 0.0F;
      this.field17925.field31033 = 0.0F;
      this.field17925.method22680(var1, var2, var3, var4);
   }

   public void method11209(MatrixStack var1, Class5422 var2, int var3, int var4) {
      this.field17924.method22680(var1, var2, var3, var4);
   }

   @Override
   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.method10998((T)var1, var2, var3, var4, var5, var6);
      this.field17921.method22669(this.field17438);
      this.field17922.method22669(this.field17437);
      this.field17919.method22669(this.field17436);
      this.field17920.method22669(this.field17435);
      this.field17923.method22669(this.field17434);
      if (!var1.method2943(Class2106.field13735).isEmpty()) {
         if (!var1.method3336()) {
            this.field17924.field31034 = -1.1F;
            this.field17924.field31033 = -0.85F;
         } else {
            this.field17924.field31034 = 0.3F;
            this.field17924.field31033 = 0.8F;
         }
      } else if (!var1.method3336()) {
         this.field17924.field31034 = 0.0F;
         this.field17924.field31033 = 0.0F;
      } else {
         this.field17924.field31034 = 1.4F;
         this.field17924.field31033 = 1.85F;
      }
   }

   @Override
   public void method11009(boolean var1) {
      super.method11009(var1);
      this.field17919.field31039 = var1;
      this.field17920.field31039 = var1;
      this.field17921.field31039 = var1;
      this.field17922.field31039 = var1;
      this.field17923.field31039 = var1;
      this.field17924.field31039 = var1;
      this.field17925.field31039 = var1;
   }

   @Override
   public void method11010(Class2205 var1, MatrixStack var2) {
      Class7219 var5 = this.method11011(var1);
      if (!this.field17926) {
         var5.method22682(var2);
      } else {
         float var6 = 0.5F * (float)(var1 != Class2205.field14418 ? -1 : 1);
         var5.field31032 += var6;
         var5.method22682(var2);
         var5.field31032 -= var6;
      }
   }

   public Class7219 method11210(Random var1) {
      return this.field17918.get(var1.nextInt(this.field17918.size()));
   }

   @Override
   public void accept(Class7219 var1) {
      if (this.field17918 == null) {
         this.field17918 = Lists.newArrayList();
      }

      this.field17918.add(var1);
   }
}
