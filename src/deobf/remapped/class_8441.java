package remapped;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map.Entry;

public class class_8441 extends class_2596 {
   private static MinecraftClient field_43177 = MinecraftClient.getInstance();
   private class_8343 field_43185;
   public Date field_43186;
   public class_7868 field_43187;
   public class_4103 field_43178;
   public boolean field_43181 = false;
   public boolean field_43184;
   public class_8914 field_43189;
   public int field_43179;
   public boolean field_43188;
   private boolean field_43182;
   private boolean field_43180;

   public class_8441() {
      super("KeybindManager");
      this.field_43186 = new Date();
      this.method_32148(this.field_43178 = new class_4103(this, "keyboard", (this.field_36278 - 1060) / 2, (this.field_36257 - 357) / 2));
      this.field_43178.method_32111(0.4F, 0.4F);
      this.field_43178
         .method_8236(
            var2 -> {
               boolean var5 = false;

               for (class_7038 var7 : this.method_32134()) {
                  if (var7 instanceof class_7868) {
                     var5 = true;
                  }
               }

               if (this.field_43178.field_19975 == this.field_43179 && var5) {
                  this.method_38830();
               } else {
                  int[] var8 = this.field_43178.method_18947(this.field_43178.field_19975);
                  String var9 = class_314.method_1451(this.field_43178.field_19975);
                  this.field_43187 = new class_7868(
                     this, "popover", this.field_43178.method_32132() + var8[0], this.field_43178.method_32173() + var8[1], this.field_43178.field_19975, var9
                  );
                  this.field_43187.method_8236(var1x -> this.method_38828(this.field_43178));
                  this.field_43187.method_35614(var1x -> {
                     var1x.method_32187(false);
                     this.method_38836();
                  });
                  this.field_43179 = this.field_43178.field_19975;
               }
            }
         );
      class_314.method_1403();
   }

   public static ArrayList<class_1226> method_38833() {
      ArrayList var2 = new ArrayList();

      for (class_9128 var4 : SigmaMainClass.method_3328().method_3298().method_843().values()) {
         var2.add(new class_1226(var4));
      }

      for (Entry var6 : class_6763.field_34911.entrySet()) {
         var2.add(new class_1226((Class<? extends Screen>)var6.getKey()));
      }

      return var2;
   }

   private void method_38828(class_4103 var1) {
      this.method_32102(new class_9891(this, var1));
   }

   private void method_38835() {
      this.method_32102(new class_7204(this, this));
   }

   private void method_38836() {
      this.method_32102(new class_7002(this, this));
   }

   private void method_38831() {
      this.method_32102(new class_9383(this, this));
   }

   private void method_38830() {
      this.method_32102(new class_3452(this, this));
   }

   @Override
   public void method_32145(int var1, int var2) {
      if (this.method_32185()) {
         this.field_43178.method_32162();
         this.method_32107();
         this.field_43179 = 0;
         this.field_43187 = null;
      }

      if (this.field_43187 != null) {
         this.field_43178.method_32162();
         this.method_32107();
         this.method_32148(this.field_43187);
         this.field_43187 = null;
      }

      super.method_32145(var1, var2);
      this.method_32105(false);
   }

   @Override
   public int method_11773() {
      return 60;
   }

   @Override
   public void method_29509(int var1) {
      super.method_29509(var1);
      if (var1 == 256) {
         class_314.method_1430();
         field_43177.method_8609(null);
      }
   }

   @Override
   public void method_32178(float var1) {
      var1 = (float)Math.min(200L, new Date().getTime() - this.field_43186.getTime()) / 200.0F;
      float var4 = class_9556.method_44073(var1, 0.0F, 1.0F, 1.0F);
      this.method_32111(0.8F + var4 * 0.2F, 0.8F + var4 * 0.2F);
      float var5 = 0.25F * var1;
      class_73.method_94(
         (float)this.field_36270,
         (float)this.field_36261,
         (float)(this.field_36270 + this.field_36278),
         (float)(this.field_36261 + this.field_36257),
         class_314.method_1444(class_1255.field_6929.field_6917, var5)
      );
      super.method_32190();
      class_73.method_87(
         class_5320.field_27147,
         (float)((this.field_36278 - 1060) / 2),
         (float)((this.field_36257 - 357) / 2 - 90),
         "Keybind Manager",
         class_1255.field_6918.field_6917
      );
      super.method_32178(var1);
   }
}
