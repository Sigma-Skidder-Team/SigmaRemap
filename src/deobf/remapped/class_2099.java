package remapped;

import java.util.ArrayList;
import java.util.List;

public class class_2099 extends class_1859 {
   private List<class_6220> field_10535 = new ArrayList<class_6220>();
   public final class_2440 field_10536;
   public class_2612 field_10537;
   public class_3305 field_10538;
   private List<class_299> field_10533 = new ArrayList<class_299>();

   public class_2099(class_7038 var1, String var2, int var3, int var4) {
      super(var1, var2, var3 - 250, var4 - 500, 250, 500, class_590.field_3421, false);
      this.field_10536 = new class_2440(300, 100);
      this.method_32187(true);
      this.method_32105(false);
      class_8223 var7;
      this.method_32148(
         var7 = new class_8223(
            this, "addButton", this.field_36278 - 55, 0, class_5320.field_27141.method_18547("Add"), 69, class_590.field_3421, "+", class_5320.field_27141
         )
      );
      var7.method_32100((var1x, var2x) -> this.field_10538.method_15155(true));
      this.method_32148(this.field_10538 = new class_3305(this, "profile", 0, 69, this.field_36278, 200));
      this.field_10538.method_32187(true);
      this.method_9847();
   }

   public void method_9846() {
      class_727.method_3328();
      class_986 var3 = class_727.method_3328().method_3298().method_848();
      class_1675 var4 = var3.method_4301();
      int var5 = 1;

      while (var3.method_4299(var4.field_8677 + " Copy " + var5)) {
         var5++;
      }

      var3.method_4298(var4.method_7498(var4.field_8677 + " Copy " + var5));
      this.method_32102(() -> this.method_9847());
      this.field_10538.method_15155(false);
   }

   public void method_9849(class_1675 var1) {
      class_727.method_3328();
      class_986 var4 = class_727.method_3328().method_3298().method_848();
      class_1675 var5 = var4.method_4301();
      int var6 = 1;

      while (var4.method_4299(var1.field_8677 + " " + var6)) {
         var6++;
      }

      var4.method_4298(var1.method_7498(var1.field_8677 + " " + var6));
      this.method_32102(() -> this.method_9847());
      this.field_10538.method_15155(false);
   }

   public void method_9848() {
      class_727.method_3328();
      class_986 var3 = class_727.method_3328().method_3298().method_848();
      int var4 = 1;

      while (var3.method_4299("New Profile " + var4)) {
         var4++;
      }

      var3.method_4298(new class_1675("New Profile " + var4, new class_1293()));
      this.method_32102(() -> this.method_9847());
      this.field_10538.method_15155(false);
   }

   public void method_9844() {
      this.field_10538.field_16351.method_11119(class_4043.field_19618);
      if (this.field_10536.method_11128() != class_4043.field_19618) {
         this.field_10536.method_11119(class_4043.field_19618);
      }
   }

   public boolean method_9850() {
      return this.field_10536.method_11128() == class_4043.field_19618 && this.field_10536.method_11123() == 0.0F;
   }

   @Override
   public void method_32145(int var1, int var2) {
      if (var2 > this.field_10538.method_32093() + this.field_10538.method_32137()) {
         this.field_10538.method_15155(false);
      }

      super.method_32145(var1, var2);
   }

   public void method_9847() {
      int var3 = 0;
      if (this.field_10537 != null) {
         var3 = this.field_10537.method_11853();
         this.method_32179(this.field_10537);
      }

      this.method_32148(this.field_10537 = new class_2612(this, "profileScrollView", 10, 80, this.field_36278 - 20, this.field_36257 - 80 - 10));
      this.field_10537.method_11851(var3);
      this.field_10533.clear();
      int var4 = 0;
      byte var5 = 70;

      for (class_1675 var7 : class_727.method_3328().method_3298().method_848().method_4305()) {
         class_299 var8 = new class_299(this, "profile" + var4, 0, var5 * var4, this.field_10537.method_32109(), var5, var7, var4);
         this.field_10537.method_32148(var8);
         this.field_10533.add(var8);
         var4++;
      }

      class_734 var9 = (class_734)this.method_32167();
      var9.method_3356();
   }

   public void method_9845() {
      int var3 = 0;

      for (class_299 var5 : this.field_10533) {
         var5.method_32117(var3);
         var3 += var5.method_32137();
      }
   }

   @Override
   public void method_32178(float var1) {
      var1 = this.field_10536.method_11123();
      this.method_9845();
      float var4 = class_5181.method_23766(var1, 0.37, 1.48, 0.17, 0.99);
      if (this.field_10536.method_11128() == class_4043.field_19618) {
         var4 = class_5181.method_23766(var1, 0.38, 0.73, 0.0, 1.0);
      }

      this.method_32111(0.8F + var4 * 0.2F, 0.8F + var4 * 0.2F);
      this.method_32124((int)((float)this.field_36278 * 0.25F * (1.0F - var4)));
      this.method_32188((int)((float)this.field_36278 * 0.14F * (1.0F - var4)));
      super.method_32190();
      super.method_32130();
      byte var5 = 10;
      int var6 = class_314.method_1444(-723724, class_9681.method_44756(var1, 0.0F, 1.0F, 1.0F));
      class_73.method_128(
         (float)(this.field_36270 + var5 / 2),
         (float)(this.field_36261 + var5 / 2),
         (float)(this.field_36278 - var5),
         (float)(this.field_36257 - var5),
         35.0F,
         var1
      );
      class_73.method_94(
         (float)(this.field_36270 + var5 / 2),
         (float)(this.field_36261 + var5 / 2),
         (float)(this.field_36270 - var5 / 2 + this.field_36278),
         (float)(this.field_36261 - var5 / 2 + this.field_36257),
         class_314.method_1444(class_1255.field_6929.field_6917, var1 * 0.25F)
      );
      class_73.method_108((float)this.field_36270, (float)this.field_36261, (float)this.field_36278, (float)this.field_36257, (float)var5, var6);
      float var7 = 0.9F + (1.0F - class_5181.method_23766(this.field_10538.field_16351.method_11123(), 0.0, 0.96, 0.69, 0.99)) * 0.1F;
      if (this.field_10538.field_16351.method_11128() == class_4043.field_19618) {
         var7 = 0.9F + (1.0F - class_5181.method_23766(this.field_10538.field_16351.method_11123(), 0.61, 0.01, 0.87, 0.16)) * 0.1F;
      }

      this.field_10537.method_32111(var7, var7);
      class_73.method_87(
         class_5320.field_27141,
         (float)(this.field_36270 + 25),
         (float)(this.field_36261 + 20),
         "Profiles",
         class_314.method_1444(class_1255.field_6929.field_6917, 0.8F * var1)
      );
      class_73.method_94(
         (float)(this.field_36270 + 25),
         (float)(this.field_36261 + 69),
         (float)(this.field_36270 + this.field_36278 - 25),
         (float)(this.field_36261 + 70),
         class_314.method_1444(class_1255.field_6929.field_6917, 0.05F * var1)
      );
      super.method_32178(var1);
   }
}
