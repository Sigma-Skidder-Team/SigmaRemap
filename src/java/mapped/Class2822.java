package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;

public class Class2822<T extends Entity> extends Class2803<T> {
   private static String[] field17578;
   private final Class7219 field17579;
   private final Class7219 field17580;
   private final Class7219 field17581;
   private final Class7219 field17582;
   private final Class7219 field17583;
   private final Class7219 field17584;
   private final Class7219 field17585;

   public Class2822() {
      this.field17604 = 32;
      this.field17605 = 32;
      byte var3 = 22;
      this.field17579 = new Class7219(this, 0, 0);
      this.field17579.method22673(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 7.0F);
      this.field17579.method22679(0.0F, 22.0F, 0.0F);
      this.field17581 = new Class7219(this, 11, 0);
      this.field17581.method22673(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F);
      this.field17581.method22679(0.0F, 22.0F, 0.0F);
      this.field17582 = new Class7219(this, 0, 0);
      this.field17582.method22673(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 1.0F);
      this.field17582.method22679(0.0F, 22.0F, -3.0F);
      this.field17583 = new Class7219(this, 22, 1);
      this.field17583.method22673(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F);
      this.field17583.method22679(-1.0F, 23.0F, 0.0F);
      this.field17583.field31037 = (float) (-Math.PI / 4);
      this.field17584 = new Class7219(this, 22, 4);
      this.field17584.method22673(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F);
      this.field17584.method22679(1.0F, 23.0F, 0.0F);
      this.field17584.field31037 = (float) (Math.PI / 4);
      this.field17585 = new Class7219(this, 22, 3);
      this.field17585.method22673(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F);
      this.field17585.method22679(0.0F, 22.0F, 7.0F);
      this.field17580 = new Class7219(this, 20, -6);
      this.field17580.method22673(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 6.0F);
      this.field17580.method22679(0.0F, 20.0F, 0.0F);
   }

   @Override
   public Iterable<Class7219> method11015() {
      return ImmutableList.of(this.field17579, this.field17581, this.field17582, this.field17583, this.field17584, this.field17585, this.field17580);
   }

   @Override
   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var9 = 1.0F;
      if (!var1.method3250()) {
         var9 = 1.5F;
      }

      this.field17585.field31036 = -var9 * 0.45F * MathHelper.sin(0.6F * var4);
   }
}
