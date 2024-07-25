package remapped;

public class class_430 implements class_857 {
   public class_430(class_9262 var1) {
      this.field_1804 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      class_4787 var4 = var1.method_23255().<class_4787>method_6746(class_4787.class);
      class_4081 var5 = var1.method_23255().<class_4081>method_6746(class_4081.class);
      class_2376 var6 = new class_2376(var4);
      class_9278 var7 = new class_9278(var4);
      class_6545 var8 = var1.<class_6545>method_23242(var6);
      var1.method_23236(var7, var8);

      for (int var9 = 0; var9 < var8.method_29869().length; var9++) {
         class_3929 var10 = var8.method_29869()[var9];
         if (var10 != null) {
            for (int var11 = 0; var11 < var10.method_18193(); var11++) {
               int var12 = var10.method_18168(var11);
               int var13 = class_2750.method_12391(var12);
               var10.method_18167(var11, var13);
            }

            boolean var23 = false;

            for (int var27 = 0; var27 < var10.method_18193(); var27++) {
               int var30 = var10.method_18168(var27);
               if (var5.method_18810(var30)) {
                  var23 = true;
                  break;
               }
            }

            boolean var28 = false;
            if (class_3446.method_15884().method_25803() && class_7943.method_35965()) {
               for (int var31 = 0; var31 < var10.method_18193(); var31++) {
                  int var14 = var10.method_18168(var31);
                  if (class_7943.method_35966(var14)) {
                     var28 = true;
                     break;
                  }
               }
            }

            if (var23) {
               for (int var32 = 0; var32 < 16; var32++) {
                  for (int var35 = 0; var35 < 16; var35++) {
                     for (int var15 = 0; var15 < 16; var15++) {
                        int var16 = var10.method_18186(var15, var32, var35);
                        if (var5.method_18810(var16)) {
                           var5.method_18812(
                              new class_9371(var15 + (var8.method_29858() << 4), (short)(var32 + (var9 << 4)), var35 + (var8.method_29860() << 4)), var16
                           );
                        }
                     }
                  }
               }
            }

            if (var28) {
               for (int var33 = 0; var33 < 16; var33++) {
                  for (int var36 = 0; var36 < 16; var36++) {
                     for (int var38 = 0; var38 < 16; var38++) {
                        int var40 = var10.method_18186(var38, var33, var36);
                        if (class_7943.method_35966(var40)) {
                           class_7943.field_40653
                              .method_45187(
                                 var1.method_23255(), var38 + (var8.method_29858() << 4), var33 + (var9 << 4), var36 + (var8.method_29860() << 4), var40
                              );
                        }
                     }
                  }
               }
            }
         }
      }

      if (var8.method_29866()) {
         int var18 = Integer.MIN_VALUE;

         for (int var20 = 0; var20 < 256; var20++) {
            int var24 = var8.method_29867()[var20];
            if (!class_2750.method_12394().contains(var24)) {
               if (var24 != 255 && var18 != var24) {
                  if (!class_3446.method_15884().method_25845() || class_3446.method_15883().method_33731()) {
                     class_3446.method_15886().method_34617().warning("Received invalid biome id " + var24);
                  }

                  var18 = var24;
               }

               var8.method_29867()[var20] = 1;
            }
         }
      }

      class_6104 var19 = class_3446.method_15883().method_33743().<class_6104>method_24490(class_6104.class);

      for (class_5531 var25 : var8.method_29862()) {
         int var29 = var19.method_28046(var1.method_23255(), null, var25, false);
         if (var29 != -1) {
            int var34 = (Integer)var25.<class_5287>method_25123("x").method_24129();
            int var37 = (Integer)var25.<class_5287>method_25123("y").method_24129();
            int var39 = (Integer)var25.<class_5287>method_25123("z").method_24129();
            class_9371 var41 = new class_9371(var34, (short)var37, var39);
            class_8012 var17 = var5.method_18809(var41);
            if (var17 != null) {
               var17.method_36352(var29);
            }

            var8.method_29869()[var37 >> 4].method_18182(var34 & 15, var37 & 15, var39 & 15, var29);
         }
      }

      if (class_3446.method_15884().method_25803()) {
         class_7943.method_35963(var1.method_23255(), var8);
         var1.method_23235(class_8633.class, true, true);
         var1.method_23245();

         for (int var22 = 0; var22 < var8.method_29869().length; var22++) {
            class_3929 var26 = var8.method_29869()[var22];
            if (var26 != null) {
               class_7943.method_35974(var1.method_23255(), var8.method_29858(), var8.method_29860(), var22);
            }
         }
      }
   }
}
