package mapped;

import net.minecraft.entity.passive.WolfEntity;
import com.google.common.collect.ImmutableList;

public class Class2859<T extends WolfEntity> extends Class2858<T> {
   private static String[] field17711;
   private final Class7219 field17712;
   private final Class7219 field17713;
   private final Class7219 field17714;
   private final Class7219 field17715;
   private final Class7219 field17716;
   private final Class7219 field17717;
   private final Class7219 field17718;
   private final Class7219 field17719;
   private final Class7219 field17720;
   private final Class7219 field17721;

   public Class2859() {
      float var3 = 0.0F;
      float var4 = 13.5F;
      this.field17712 = new Class7219(this, 0, 0);
      this.field17712.method22679(-1.0F, 13.5F, -7.0F);
      this.field17713 = new Class7219(this, 0, 0);
      this.field17713.method22675(-2.0F, -3.0F, -2.0F, 6.0F, 6.0F, 4.0F, 0.0F);
      this.field17712.method22670(this.field17713);
      this.field17714 = new Class7219(this, 18, 14);
      this.field17714.method22675(-3.0F, -2.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F);
      this.field17714.method22679(0.0F, 14.0F, 2.0F);
      this.field17721 = new Class7219(this, 21, 0);
      this.field17721.method22675(-3.0F, -3.0F, -3.0F, 8.0F, 6.0F, 7.0F, 0.0F);
      this.field17721.method22679(-1.0F, 14.0F, 2.0F);
      this.field17715 = new Class7219(this, 0, 18);
      this.field17715.method22675(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F);
      this.field17715.method22679(-2.5F, 16.0F, 7.0F);
      this.field17716 = new Class7219(this, 0, 18);
      this.field17716.method22675(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F);
      this.field17716.method22679(0.5F, 16.0F, 7.0F);
      this.field17717 = new Class7219(this, 0, 18);
      this.field17717.method22675(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F);
      this.field17717.method22679(-2.5F, 16.0F, -4.0F);
      this.field17718 = new Class7219(this, 0, 18);
      this.field17718.method22675(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F);
      this.field17718.method22679(0.5F, 16.0F, -4.0F);
      this.field17719 = new Class7219(this, 9, 18);
      this.field17719.method22679(-1.0F, 12.0F, 8.0F);
      this.field17720 = new Class7219(this, 9, 18);
      this.field17720.method22675(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F);
      this.field17719.method22670(this.field17720);
      this.field17713.method22671(16, 14).method22675(-2.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F);
      this.field17713.method22671(16, 14).method22675(2.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F);
      this.field17713.method22671(0, 10).method22675(-0.5F, 0.0F, -5.0F, 3.0F, 3.0F, 4.0F, 0.0F);
   }

   @Override
   public Iterable<Class7219> method11001() {
      return ImmutableList.of(this.field17712);
   }

   @Override
   public Iterable<Class7219> method11002() {
      return ImmutableList.of(this.field17714, this.field17715, this.field17716, this.field17717, this.field17718, this.field17719, this.field17721);
   }

   public void method10997(T var1, float var2, float var3, float var4) {
      if (!var1.method4369()) {
         this.field17719.field31036 = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3;
      } else {
         this.field17719.field31036 = 0.0F;
      }

      if (!var1.method4395()) {
         this.field17714.method22679(0.0F, 14.0F, 2.0F);
         this.field17714.field31035 = (float) (Math.PI / 2);
         this.field17721.method22679(-1.0F, 14.0F, -3.0F);
         this.field17721.field31035 = this.field17714.field31035;
         this.field17719.method22679(-1.0F, 12.0F, 8.0F);
         this.field17715.method22679(-2.5F, 16.0F, 7.0F);
         this.field17716.method22679(0.5F, 16.0F, 7.0F);
         this.field17717.method22679(-2.5F, 16.0F, -4.0F);
         this.field17718.method22679(0.5F, 16.0F, -4.0F);
         this.field17715.field31035 = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3;
         this.field17716.field31035 = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
         this.field17717.field31035 = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
         this.field17718.field31035 = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3;
      } else {
         this.field17721.method22679(-1.0F, 16.0F, -3.0F);
         this.field17721.field31035 = (float) (Math.PI * 2.0 / 5.0);
         this.field17721.field31036 = 0.0F;
         this.field17714.method22679(0.0F, 18.0F, 0.0F);
         this.field17714.field31035 = (float) (Math.PI / 4);
         this.field17719.method22679(-1.0F, 21.0F, 6.0F);
         this.field17715.method22679(-2.5F, 22.7F, 2.0F);
         this.field17715.field31035 = (float) (Math.PI * 3.0 / 2.0);
         this.field17716.method22679(0.5F, 22.7F, 2.0F);
         this.field17716.field31035 = (float) (Math.PI * 3.0 / 2.0);
         this.field17717.field31035 = 5.811947F;
         this.field17717.method22679(-2.49F, 17.0F, -4.0F);
         this.field17718.field31035 = 5.811947F;
         this.field17718.method22679(0.51F, 17.0F, -4.0F);
      }

      this.field17713.field31037 = var1.method4378(var4) + var1.method4377(var4, 0.0F);
      this.field17721.field31037 = var1.method4377(var4, -0.08F);
      this.field17714.field31037 = var1.method4377(var4, -0.16F);
      this.field17720.field31037 = var1.method4377(var4, -0.2F);
   }

   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17712.field31035 = var6 * (float) (Math.PI / 180.0);
      this.field17712.field31036 = var5 * (float) (Math.PI / 180.0);
      this.field17719.field31035 = var4;
   }
}
