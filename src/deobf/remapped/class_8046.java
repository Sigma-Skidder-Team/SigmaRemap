package remapped;

public class class_8046 extends class_1859 {
   public int field_41211;
   public final class_2440 field_41205;
   public final class_2440 field_41207;
   public String field_41209;
   public Vector3i field_41210;
   public int field_41206;
   public int field_41208;

   public class_8046(class_7038 var1, String var2, int var3, int var4, int var5, int var6, String var7, Vector3i var8, int var9) {
      super(var1, var2, var3, var4, var5, var6, true);
      this.field_41211 = var4;
      this.field_41205 = new class_2440(114, 114);
      this.field_41207 = new class_2440(200, 200);
      this.field_41207.method_11119(class_4043.field_19618);
      this.field_41209 = var7;
      this.field_41210 = var8;
      this.field_41206 = var9;
      this.field_41208 = var6;
      this.field_20341 = true;
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
      this.field_41205.method_11119(!this.method_1535() ? class_4043.field_19618 : class_4043.field_19620);
      boolean var5 = this.method_1535() || var1 > this.method_32155() + this.method_32109() - 62;
      this.method_1533(var5);
      if (this.field_41207.method_11128() == class_4043.field_19620) {
         this.method_1533(false);
         this.method_32175(Math.round((float)this.method_32109() * class_9681.method_44757(this.field_41207.method_11123(), 0.0F, 1.0F, 1.0F)));
         if (this.field_41207.method_11123() == 1.0F) {
            this.method_8235();
         }
      }
   }

   public void method_36513() {
      this.field_41207.method_11119(class_4043.field_19620);
   }

   @Override
   public void method_32178(float var1) {
      class_73.method_103(
         (float)this.field_36270,
         (float)this.field_36261,
         (float)this.field_36278,
         (float)this.field_36257,
         class_314.method_1444(class_314.method_1401(class_1255.field_6918.field_6917, 0.03F), this.field_41205.method_11123())
      );
      class_73.method_87(
         class_5320.field_27152,
         (float)(this.field_36270 + 68),
         (float)(this.field_36261 + 14),
         this.field_41209,
         class_314.method_1444(class_1255.field_6929.field_6917, 0.8F)
      );
      class_73.method_87(
         class_5320.field_27138,
         (float)(this.field_36270 + 68),
         (float)(this.field_36261 + 38),
         "x:" + this.field_41210.getX() + " z:" + this.field_41210.getZ(),
         class_314.method_1444(class_1255.field_6929.field_6917, 0.5F)
      );
      byte var4 = 27;
      int var5 = this.field_36278 - 43;
      float var6 = !this.method_1535() ? 0.2F : 0.4F;
      class_73.method_103(
         (float)(this.field_36270 + var5), (float)(this.field_36261 + var4), 20.0F, 2.0F, class_314.method_1444(class_1255.field_6929.field_6917, var6)
      );
      class_73.method_103(
         (float)(this.field_36270 + var5), (float)(this.field_36261 + var4 + 5), 20.0F, 2.0F, class_314.method_1444(class_1255.field_6929.field_6917, var6)
      );
      class_73.method_103(
         (float)(this.field_36270 + var5), (float)(this.field_36261 + var4 + 10), 20.0F, 2.0F, class_314.method_1444(class_1255.field_6929.field_6917, var6)
      );
      class_73.method_121(
         (float)(this.field_36270 + 35),
         (float)(this.field_36261 + this.field_36257 / 2),
         20.0F,
         class_314.method_1442(this.field_41206, class_1255.field_6929.field_6917, 0.9F)
      );
      class_73.method_121((float)(this.field_36270 + 35), (float)(this.field_36261 + this.field_36257 / 2), 17.0F, this.field_41206);
      class_73.method_128(
         (float)this.field_36270,
         (float)this.field_36261,
         (float)this.field_36278,
         (float)this.field_36257,
         14.0F,
         var1 * 0.2F * this.field_41205.method_11123()
      );
      super.method_32178(var1);
   }
}
