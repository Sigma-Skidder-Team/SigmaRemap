package remapped;

public class class_1860 implements class_857 {
   public class_1860(class_8186 var1) {
      this.field_9427 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      class_4787 var4 = var1.method_23255().<class_4787>method_6746(class_4787.class);
      class_6545 var5 = var1.<class_6545>method_23242(new class_9278(var4));
      var1.method_23236(new class_498(), var5);
      int[] var6 = new int[256];
      int[] var7 = new int[256];

      for (int var8 = 0; var8 < 16; var8++) {
         class_3929 var9 = var5.method_29869()[var8];
         if (var9 != null) {
            boolean var10 = false;

            for (int var11 = 0; var11 < var9.method_18193(); var11++) {
               int var12 = var9.method_18168(var11);
               int var13 = this.field_9427.field_41896.method_27301().method_28217(var12);
               if (!var10 && var13 != class_1690.field_8745 && var13 != class_1690.field_8744 && var13 != class_1690.field_8747) {
                  var10 = true;
               }

               var9.method_18167(var11, var13);
            }

            if (!var10) {
               var9.method_18188(0);
            } else {
               int var19 = 0;

               for (int var21 = 0; var21 < 16; var21++) {
                  for (int var26 = 0; var26 < 16; var26++) {
                     for (int var14 = 0; var14 < 16; var14++) {
                        int var15 = var9.method_18186(var21, var26, var14);
                        if (var15 != class_1690.field_8745 && var15 != class_1690.field_8744 && var15 != class_1690.field_8747) {
                           var19++;
                           var7[var21 + var14 * 16] = var26 + var8 * 16 + 1;
                        }

                        if (this.field_9427.field_41896.method_27301().method_1882().contains(var15)) {
                           var6[var21 + var14 * 16] = var26 + var8 * 16 + 1;
                        }

                        if (class_3446.method_15884().method_25838() && this.field_9427.field_41896.method_27301().method_1881().contains(var15)) {
                           class_1690.method_7609(var5, var9, var8, var21, var26, var14);
                        }
                     }
                  }
               }

               var9.method_18188(var19);
            }
         }
      }

      class_5531 var16 = new class_5531("");
      var16.<class_6674>method_25122(new class_6674("MOTION_BLOCKING", class_1690.method_7611(var6)));
      var16.<class_6674>method_25122(new class_6674("WORLD_SURFACE", class_1690.method_7611(var7)));
      var5.method_29857(var16);
      class_5051 var17 = var1.method_23259(36);
      var17.method_23236(class_8039.field_41157, var5.method_29858());
      var17.method_23236(class_8039.field_41157, var5.method_29860());
      int var18 = !var5.method_29863() ? 0 : 262143;
      int var20 = 0;

      for (int var22 = 0; var22 < var5.method_29869().length; var22++) {
         class_3929 var27 = var5.method_29869()[var22];
         if (var27 != null) {
            if (!var5.method_29863() && var27.method_18178()) {
               var18 |= 1 << var22 + 1;
            }

            var20 |= 1 << var22 + 1;
         }
      }

      var17.method_23236(class_8039.field_41157, var18);
      var17.method_23236(class_8039.field_41157, var20);
      var17.method_23236(class_8039.field_41157, 0);
      var17.method_23236(class_8039.field_41157, 0);
      if (var5.method_29863()) {
         var17.method_23236(class_8039.field_41165, class_1690.method_7613());
      }

      for (class_3929 var34 : var5.method_29869()) {
         if (var34 != null && var34.method_18178()) {
            var17.method_23236(class_8039.field_41165, var34.method_18174());
         } else if (var5.method_29863()) {
            var17.method_23236(class_8039.field_41165, class_1690.method_7613());
         }
      }

      if (var5.method_29863()) {
         var17.method_23236(class_8039.field_41165, class_1690.method_7613());
      }

      for (class_3929 var35 : var5.method_29869()) {
         if (var35 != null) {
            var17.method_23236(class_8039.field_41165, var35.method_18162());
         }
      }

      class_4074 var25 = var1.method_23255().<class_4074>method_6746(class_4074.class);
      int var30 = Math.abs(var25.method_18777() - var5.method_29858());
      int var33 = Math.abs(var25.method_18783() - var5.method_29860());
      if (var25.method_18782() || var30 >= 64 || var33 >= 64) {
         class_5051 var36 = var1.method_23259(64);
         var36.method_23236(class_8039.field_41157, var5.method_29858());
         var36.method_23236(class_8039.field_41157, var5.method_29860());
         var36.method_23235(class_5988.class, true, true);
         var25.method_18785(var5.method_29858());
         var25.method_18781(var5.method_29860());
      }

      var17.method_23235(class_5988.class, true, true);
   }

   private Byte[] method_8238(byte[] var1) {
      Byte[] var4 = new Byte[var1.length];

      for (int var5 = 0; var5 < var1.length; var5++) {
         var4[var5] = var1[var5];
      }

      return var4;
   }
}
