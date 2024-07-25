package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class class_3169<T extends class_5834> extends class_2344<T> {
   private static String[] field_15850;
   private List<class_1549> field_15854 = Lists.newArrayList();
   public final class_1549 field_15851;
   public final class_1549 field_15855;
   public final class_1549 field_15849;
   public final class_1549 field_15853;
   public final class_1549 field_15846;
   private final class_1549 field_15847;
   private final class_1549 field_15852;
   private final boolean field_15848;

   public class_3169(float var1, boolean var2) {
      super(RenderLayer::method_16705, var1, 0.0F, 64, 64);
      this.field_15848 = var2;
      this.field_15852 = new class_1549(this, 24, 0);
      this.field_15852.method_7049(-3.0F, -6.0F, -1.0F, 6.0F, 6.0F, 1.0F, var1);
      this.field_15847 = new class_1549(this, 0, 0);
      this.field_15847.method_7033(64, 32);
      this.field_15847.method_7049(-5.0F, 0.0F, -1.0F, 10.0F, 16.0F, 1.0F, var1);
      if (!var2) {
         this.field_11701 = new class_1549(this, 32, 48);
         this.field_11701.method_7049(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
         this.field_11701.method_7046(5.0F, 2.0F, 0.0F);
         this.field_15851 = new class_1549(this, 48, 48);
         this.field_15851.method_7049(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1 + 0.25F);
         this.field_15851.method_7046(5.0F, 2.0F, 0.0F);
         this.field_15855 = new class_1549(this, 40, 32);
         this.field_15855.method_7049(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1 + 0.25F);
         this.field_15855.method_7046(-5.0F, 2.0F, 10.0F);
      } else {
         this.field_11701 = new class_1549(this, 32, 48);
         this.field_11701.method_7049(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, var1);
         this.field_11701.method_7046(5.0F, 2.5F, 0.0F);
         this.field_11705 = new class_1549(this, 40, 16);
         this.field_11705.method_7049(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, var1);
         this.field_11705.method_7046(-5.0F, 2.5F, 0.0F);
         this.field_15851 = new class_1549(this, 48, 48);
         this.field_15851.method_7049(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, var1 + 0.25F);
         this.field_15851.method_7046(5.0F, 2.5F, 0.0F);
         this.field_15855 = new class_1549(this, 40, 32);
         this.field_15855.method_7049(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, var1 + 0.25F);
         this.field_15855.method_7046(-5.0F, 2.5F, 10.0F);
      }

      this.field_11703 = new class_1549(this, 16, 48);
      this.field_11703.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.field_11703.method_7046(1.9F, 12.0F, 0.0F);
      this.field_15849 = new class_1549(this, 0, 48);
      this.field_15849.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1 + 0.25F);
      this.field_15849.method_7046(1.9F, 12.0F, 0.0F);
      this.field_15853 = new class_1549(this, 0, 32);
      this.field_15853.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1 + 0.25F);
      this.field_15853.method_7046(-1.9F, 12.0F, 0.0F);
      this.field_15846 = new class_1549(this, 16, 32);
      this.field_15846.method_7049(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, var1 + 0.25F);
      this.field_15846.method_7046(0.0F, 0.0F, 0.0F);
   }

   @Override
   public Iterable<class_1549> method_6902() {
      return Iterables.concat(super.method_6902(), ImmutableList.of(this.field_15849, this.field_15853, this.field_15851, this.field_15855, this.field_15846));
   }

   public void method_14621(class_7966 var1, class_7907 var2, int var3, int var4) {
      this.field_15852.method_7034(this.field_11696);
      this.field_15852.field_8183 = 0.0F;
      this.field_15852.field_8181 = 0.0F;
      this.field_15852.method_7060(var1, var2, var3, var4);
   }

   public void method_14622(class_7966 var1, class_7907 var2, int var3, int var4) {
      this.field_15847.method_7060(var1, var2, var3, var4);
   }

   @Override
   public void method_10738(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.method_10738((T)var1, var2, var3, var4, var5, var6);
      this.field_15849.method_7034(this.field_11703);
      this.field_15853.method_7034(this.field_11706);
      this.field_15851.method_7034(this.field_11701);
      this.field_15855.method_7034(this.field_11705);
      this.field_15846.method_7034(this.field_11704);
      if (!var1.method_26520(class_6943.field_35708).method_28022()) {
         if (!var1.method_37382()) {
            this.field_15847.field_8187 = -1.1F;
            this.field_15847.field_8181 = -0.85F;
         } else {
            this.field_15847.field_8187 = 0.3F;
            this.field_15847.field_8181 = 0.8F;
         }
      } else if (!var1.method_37382()) {
         this.field_15847.field_8187 = 0.0F;
         this.field_15847.field_8181 = 0.0F;
      } else {
         this.field_15847.field_8187 = 1.4F;
         this.field_15847.field_8181 = 1.85F;
      }
   }

   @Override
   public void method_10741(boolean var1) {
      super.method_10741(var1);
      this.field_15851.field_8200 = var1;
      this.field_15855.field_8200 = var1;
      this.field_15849.field_8200 = var1;
      this.field_15853.field_8200 = var1;
      this.field_15846.field_8200 = var1;
      this.field_15847.field_8200 = var1;
      this.field_15852.field_8200 = var1;
   }

   @Override
   public void method_7948(class_1736 var1, class_7966 var2) {
      class_1549 var5 = this.method_10746(var1);
      if (!this.field_15848) {
         var5.method_7057(var2);
      } else {
         float var6 = 0.5F * (float)(var1 != class_1736.field_8943 ? -1 : 1);
         var5.field_8183 += var6;
         var5.method_7057(var2);
         var5.field_8183 -= var6;
      }
   }

   public class_1549 method_14620(Random var1) {
      return this.field_15854.get(var1.nextInt(this.field_15854.size()));
   }

   @Override
   public void accept(class_1549 var1) {
      if (this.field_15854 == null) {
         this.field_15854 = Lists.newArrayList();
      }

      this.field_15854.add(var1);
   }
}
