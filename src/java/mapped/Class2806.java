package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class2806<T extends Entity> extends Class2803<T> {
   private static String[] field17464;
   private final Class7219 field17465;
   private final Class7219 field17466;
   private final Class7219 field17467;
   private final Class7219 field17468;
   private final Class7219 field17469;
   private final Class7219 field17470;
   private final Class7219 field17471;

   public Class2806() {
      this.field17604 = 64;
      this.field17605 = 64;
      this.field17465 = new Class7219(this, 0, 8);
      this.field17465.method22673(-3.0F, -2.0F, -8.0F, 5.0F, 3.0F, 9.0F);
      this.field17470 = new Class7219(this, 3, 20);
      this.field17470.method22673(-2.0F, 0.0F, 0.0F, 3.0F, 2.0F, 6.0F);
      this.field17470.method22679(0.0F, -2.0F, 1.0F);
      this.field17465.method22670(this.field17470);
      this.field17471 = new Class7219(this, 4, 29);
      this.field17471.method22673(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F);
      this.field17471.method22679(0.0F, 0.5F, 6.0F);
      this.field17470.method22670(this.field17471);
      this.field17466 = new Class7219(this, 23, 12);
      this.field17466.method22673(0.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F);
      this.field17466.method22679(2.0F, -2.0F, -8.0F);
      this.field17467 = new Class7219(this, 16, 24);
      this.field17467.method22673(0.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F);
      this.field17467.method22679(6.0F, 0.0F, 0.0F);
      this.field17466.method22670(this.field17467);
      this.field17468 = new Class7219(this, 23, 12);
      this.field17468.field31038 = true;
      this.field17468.method22673(-6.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F);
      this.field17468.method22679(-3.0F, -2.0F, -8.0F);
      this.field17469 = new Class7219(this, 16, 24);
      this.field17469.field31038 = true;
      this.field17469.method22673(-13.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F);
      this.field17469.method22679(-6.0F, 0.0F, 0.0F);
      this.field17468.method22670(this.field17469);
      this.field17466.field31037 = 0.1F;
      this.field17467.field31037 = 0.1F;
      this.field17468.field31037 = -0.1F;
      this.field17469.field31037 = -0.1F;
      this.field17465.field31035 = -0.1F;
      Class7219 var3 = new Class7219(this, 0, 0);
      var3.method22673(-4.0F, -2.0F, -5.0F, 7.0F, 3.0F, 5.0F);
      var3.method22679(0.0F, 1.0F, -7.0F);
      var3.field31035 = 0.2F;
      this.field17465.method22670(var3);
      this.field17465.method22670(this.field17466);
      this.field17465.method22670(this.field17468);
   }

   @Override
   public Iterable<Class7219> method11015() {
      return ImmutableList.of(this.field17465);
   }

   @Override
   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var9 = ((float)(var1.getEntityId() * 3) + var4) * 0.13F;
      float var10 = 16.0F;
      this.field17466.field31037 = MathHelper.cos(var9) * 16.0F * (float) (Math.PI / 180.0);
      this.field17467.field31037 = MathHelper.cos(var9) * 16.0F * (float) (Math.PI / 180.0);
      this.field17468.field31037 = -this.field17466.field31037;
      this.field17469.field31037 = -this.field17467.field31037;
      this.field17470.field31035 = -(5.0F + MathHelper.cos(var9 * 2.0F) * 5.0F) * (float) (Math.PI / 180.0);
      this.field17471.field31035 = -(5.0F + MathHelper.cos(var9 * 2.0F) * 5.0F) * (float) (Math.PI / 180.0);
   }
}
