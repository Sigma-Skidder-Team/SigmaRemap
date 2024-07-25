package remapped;

public class class_9634 extends class_4171<class_5542, class_6980<class_5542>> {
   private static String[] field_49090;

   public class_9634(class_2514<class_5542, class_6980<class_5542>> var1) {
      super(var1);
   }

   public void method_44488(
      class_7966 var1, class_2565 var2, int var3, class_5542 var4, float var5, float var6, float var7, float var8, float var9, float var10
   ) {
      boolean var13 = var4.method_26507();
      boolean var14 = var4.method_26449();
      var1.method_36063();
      if (var14) {
         float var15 = 0.75F;
         var1.method_36062(0.75F, 0.75F, 0.75F);
         var1.method_36065(0.0, 0.5, 0.209375F);
      }

      var1.method_36065(
         (double)(this.method_19347().field_35851.field_8183 / 16.0F),
         (double)(this.method_19347().field_35851.field_8181 / 16.0F),
         (double)(this.method_19347().field_35851.field_8187 / 16.0F)
      );
      float var17 = var4.method_25190(var7);
      var1.method_36060(class_2426.field_12076.method_11062(var17));
      var1.method_36060(class_2426.field_12074.method_11074(var9));
      var1.method_36060(class_2426.field_12080.method_11074(var10));
      if (!var4.method_26449()) {
         if (!var13) {
            var1.method_36065(0.06F, 0.27F, -0.5);
         } else {
            var1.method_36065(0.46F, 0.26F, 0.22F);
         }
      } else if (!var13) {
         var1.method_36065(0.06F, 0.26F, -0.5);
      } else {
         var1.method_36065(0.4F, 0.26F, 0.15F);
      }

      var1.method_36060(class_2426.field_12080.method_11074(90.0F));
      if (var13) {
         var1.method_36060(class_2426.field_12076.method_11074(90.0F));
      }

      class_6098 var16 = var4.method_26520(class_6943.field_35707);
      MinecraftClient.method_8510().method_8574().method_42248(var4, var16, class_5612.field_28496, false, var1, var2, var3);
      var1.method_36064();
   }
}
