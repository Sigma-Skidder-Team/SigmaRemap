package remapped;

public class class_772 extends class_1094 {
   private static final Identifier field_4181 = new Identifier("realms", "textures/gui/realms/invite_icon.png");
   private static final Identifier field_4180 = new Identifier("realms", "textures/gui/realms/trial_icon.png");
   private static final Identifier field_4177 = new Identifier("realms", "textures/gui/realms/news_notification_mainscreen.png");
   private static final class_8264 field_4172 = new class_8264();
   private volatile int field_4174;
   private static boolean field_4175;
   private static boolean field_4178;
   private static boolean field_4179;
   private static boolean field_4176;

   @Override
   public void method_1163() {
      this.method_3469();
      this.field_943.field_9600.method_38887(true);
   }

   @Override
   public void method_5312() {
      if ((!this.method_3465() || !this.method_3464() || !field_4179) && !field_4172.method_38095()) {
         field_4172.method_38107();
      } else if (field_4179 && this.method_3465()) {
         field_4172.method_38104();
         if (field_4172.method_38103(class_2845.field_13950)) {
            this.field_4174 = field_4172.method_38101();
         }

         if (field_4172.method_38103(class_2845.field_13952)) {
            field_4178 = field_4172.method_38089();
         }

         if (field_4172.method_38103(class_2845.field_13949)) {
            field_4176 = field_4172.method_38105();
         }

         field_4172.method_38084();
      }
   }

   private boolean method_3465() {
      return this.field_943.field_9577.field_45435;
   }

   private boolean method_3464() {
      return this.field_943.field_9623 instanceof class_1876;
   }

   private void method_3469() {
      if (!field_4175) {
         field_4175 = true;
         new class_4751(this, "Realms Notification Availability checker #1").start();
      }
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      if (field_4179) {
         this.method_3467(var1, var2, var3);
      }

      super.method_6767(var1, var2, var3, var4);
   }

   private void method_3467(class_7966 var1, int var2, int var3) {
      int var6 = this.field_4174;
      byte var7 = 24;
      int var8 = this.field_940 / 4 + 48;
      int var9 = this.field_941 / 2 + 80;
      int var10 = var8 + 48 + 2;
      byte var11 = 0;
      if (field_4176) {
         this.field_943.method_8577().method_35674(field_4177);
         class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
         class_3542.method_16438();
         class_3542.method_16403(0.4F, 0.4F, 0.4F);
         class_2089.method_9778(var1, (int)((double)(var9 + 2 - var11) * 2.5), (int)((double)var10 * 2.5), 0.0F, 0.0F, 40, 40, 40, 40);
         class_3542.method_16489();
         var11 += 14;
      }

      if (var6 != 0) {
         this.field_943.method_8577().method_35674(field_4181);
         class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
         class_2089.method_9778(var1, var9 - var11, var10 - 6, 0.0F, 0.0F, 15, 25, 31, 25);
         var11 += 16;
      }

      if (field_4178) {
         this.field_943.method_8577().method_35674(field_4180);
         class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
         byte var12 = 0;
         if ((Util.getMeasuringTimeMs() / 800L & 1L) == 1L) {
            var12 = 8;
         }

         class_2089.method_9778(var1, var9 + 4 - var11, var10 + 4, 0.0F, (float)var12, 8, 8, 8, 16);
      }
   }

   @Override
   public void method_1162() {
      field_4172.method_38107();
   }
}
