package remapped;

public class class_9107 extends class_1859 {
   public class_2440 field_46631;
   public class_2440 field_46632;
   public int field_46627;
   public int field_46626;
   public int field_46624;
   public int field_46629;
   public String field_46625;
   public class_273 field_46623;
   public final class_9128 field_46630;
   public class_8343 field_46622;
   public boolean field_46621 = false;

   public class_9107(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_9128 var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field_46624 = 500;
      this.field_46629 = (int)Math.min(600.0F, (float)var6 * 0.7F);
      this.field_46626 = (var5 - this.field_46624) / 2;
      this.field_46627 = (var6 - this.field_46629) / 2 + 20;
      this.field_46630 = var7;
      byte var10 = 10;
      byte var11 = 59;
      this.method_32148(
         this.field_46623 = new class_273(
            this, "mods", this.field_46626 + var10, this.field_46627 + var11, this.field_46624 - var10 * 2, this.field_46629 - var11 - var10, var7
         )
      );
      this.field_46631 = new class_2440(200, 120);
      this.field_46632 = new class_2440(240, 200);
      this.method_32105(false);
   }

   @Override
   public void method_32145(int var1, int var2) {
      if (this.method_32185()
         && (var1 < this.field_46626 || var2 < this.field_46627 || var1 > this.field_46626 + this.field_46624 || var2 > this.field_46627 + this.field_46629)) {
         this.field_46621 = true;
      }

      this.field_46631.method_11119(this.field_46621 ? class_4043.field_19618 : class_4043.field_19620);
      this.field_46632.method_11119(this.field_46621 ? class_4043.field_19618 : class_4043.field_19620);
      super.method_32145(var1, var2);
   }

   private boolean method_41951(String var1, String var2) {
      return var1 != null && var1 != "" && var2 != null ? var2.toLowerCase().contains(var1.toLowerCase()) : true;
   }

   private boolean method_41950(String var1, String var2) {
      return var1 != null && var1 != "" && var2 != null ? var2.toLowerCase().startsWith(var1.toLowerCase()) : true;
   }

   @Override
   public void method_32178(float var1) {
      var1 = this.field_46631.method_11123();
      float var4 = class_9556.method_44073(var1, 0.0F, 1.0F, 1.0F);
      if (this.field_46621) {
         var4 = class_9681.method_44756(var1, 0.0F, 1.0F, 1.0F);
      }

      this.method_32111(0.8F + var4 * 0.2F, 0.8F + var4 * 0.2F);
      class_73.method_94(
         (float)this.field_36270,
         (float)this.field_36261,
         (float)this.field_36278,
         (float)this.field_36257,
         class_314.method_1444(class_1255.field_6929.field_6917, 0.45F * var1)
      );
      super.method_32190();
      class_73.method_108(
         (float)this.field_46626,
         (float)this.field_46627,
         (float)this.field_46624,
         (float)this.field_46629,
         10.0F,
         class_314.method_1444(class_1255.field_6918.field_6917, var1)
      );
      class_73.method_87(
         class_5320.field_27147,
         (float)this.field_46626,
         (float)(this.field_46627 - 60),
         this.field_46630.method_41992(),
         class_314.method_1444(class_1255.field_6918.field_6917, var1)
      );
      byte var5 = 30;
      class_73.method_135((float)this.field_46626, (float)this.field_46627, (float)(this.field_46624 - 30), (float)this.field_46629);
      class_73.method_87(
         class_5320.field_27152,
         (float)(var5 + this.field_46626),
         (float)(var5 + this.field_46627),
         this.field_46630.method_42001(),
         class_314.method_1444(class_1255.field_6929.field_6917, var1 * 0.7F)
      );
      class_73.method_141();
      super.method_32178(var1);
   }
}
