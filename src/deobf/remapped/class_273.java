package remapped;

import java.util.HashMap;
import java.util.Map.Entry;
import org.lwjgl.opengl.GL11;

public class class_273 extends class_2612 implements class_1768 {
   private Module field_977;
   private boolean field_983;
   private boolean field_984;
   public int field_982 = 200;
   private HashMap<class_1552, Setting> field_976 = new HashMap<class_1552, Setting>();
   public HashMap<Module, class_7038> field_978 = new HashMap<Module, class_7038>();
   public class_2440 field_979 = new class_2440(114, 114);
   private String field_981 = "";
   private String field_980 = "";

   public class_273(class_7038 var1, String var2, int var3, int var4, int var5, int var6, Module var7) {
      super(var1, var2, var3, var4, var5, var6);
      this.field_977 = var7;
      this.method_32105(false);
      this.method_1240();
   }

   private int method_1241(class_7038 var1, Setting var2, int var3, int var4, int var5) {
      switch (var2.method_23030()) {
         case field_26724:
            byte var21 = 24;
            byte var29 = 24;
            class_1552 var37 = new class_1552(var1, var2.method_23032() + "lbl", var3, var4, this.field_982, 24, class_1552.field_8208, var2.method_23032());
            class_7688 var45 = new class_7688(var1, var2.method_23032() + "checkbox", var1.method_32109() - 24 - var5, var4 + 6, 24, 24);
            this.field_976.put(var37, var2);
            var45.method_34833((Boolean)var2.method_23031(), false);
            var2.method_23029(var1x -> {
               if (var45.method_34834() != (Boolean)var1x.method_23031()) {
                  var45.method_34833((Boolean)var1x.method_23031(), false);
               }
            });
            var45.method_8236(var1x -> var2.method_23037(((class_7688)var1x).method_34834()));
            var45.method_32135((var1x, var2x) -> var1x.method_32175(var2x.method_32109() - 24 - var5));
            var1.method_32148(var37);
            var1.method_32148(var45);
            var4 += 24 + var5;
            break;
         case field_26718:
            byte var20 = 126;
            byte var28 = 24;
            class_1552 var36 = new class_1552(var1, var2.method_23032() + "lbl", var3, var4, this.field_982, 24, class_1552.field_8208, var2.method_23032());
            this.field_976.put(var36, var2);
            FloatSetting var44 = (FloatSetting)var2;
            class_1479 var47 = new class_1479(var1, var2.method_23032() + "slider", var1.method_32109() - 126 - var5, var4 + 6, 126, 24);
            var47.method_6824().method_32144(class_5320.field_27138);
            var47.method_32186(Float.toString((Float)var2.method_23031()));
            var47.method_6827(class_1479.method_6825(var44.method_12385(), var44.method_12387(), (Float)var44.method_23031()), false);
            var47.method_6818(-1.0F);
            int var13 = var44.method_12386();
            var44.method_23029(
               var3x -> {
                  if (class_1479.method_6820(var47.method_6822(), var44.method_12385(), var44.method_12387(), var44.method_12382(), var13)
                     != (Float)var3x.method_23031()) {
                     var47.method_32186(Float.toString((Float)var3x.method_23031()));
                     var47.method_6827(class_1479.method_6825(var44.method_12385(), var44.method_12387(), (Float)var3x.method_23031()), false);
                  }
               }
            );
            var47.method_8236(var4x -> {
               float var7 = ((class_1479)var4x).method_6822();
               float var8x = class_1479.method_6820(var7, var44.method_12385(), var44.method_12387(), var44.method_12382(), var13);
               if (var8x != (Float)var2.method_23031()) {
                  var47.method_32186(Float.toString(var8x));
                  var2.method_23037(var8x);
               }
            });
            var47.method_32135((var1x, var2x) -> var1x.method_32175(var2x.method_32109() - 126 - var5));
            var1.method_32148(var36);
            var1.method_32148(var47);
            var4 += 24 + var5;
            break;
         case field_26723:
            byte var19 = 114;
            byte var27 = 27;
            class_1552 var43;
            this.method_32148(
               var43 = new class_1552(var1, var2.method_23032() + "lbl", var3, var4, this.field_982, var27, class_1552.field_8208, var2.method_23032())
            );
            this.field_976.put(var43, var2);
            class_3004 var35;
            this.method_32148(
               var35 = new class_3004(
                  var1,
                  var2.method_23032() + "txt",
                  var1.method_32109() - var5 - var19,
                  var4 + var27 / 4 - 1,
                  var19,
                  var27,
                  class_3004.field_14738,
                  (String)var2.method_23031()
               )
            );
            var35.method_32144(class_5320.field_27139);
            var35.method_13721(var1x -> var2.method_23037(var1x.method_32165()));
            var2.method_23029(var2x -> {
               if (var35.method_32165() != ((HippieModeValue)var2).method_23031()) {
                  var35.method_32186(((HippieModeValue)var2).method_23031());
               }
            });
            var4 += var27 + var5;
            break;
         case field_26722:
            byte var18 = 123;
            byte var26 = 27;
            class_1552 var34 = new class_1552(var1, var2.method_23032() + "lbl", var3, var4 + 2, this.field_982, 27, class_1552.field_8208, var2.method_23032());
            class_3366 var42 = new class_3366(
               var1,
               var2.method_23032() + "btn",
               var1.method_32109() - var5,
               var4 + 6 - 1,
               123,
               27,
               ((ModeSetting)var2).method_12860(),
               ((ModeSetting)var2).method_12858()
            );
            this.field_976.put(var34, var2);
            var2.method_23029(var2x -> {
               if (var42.method_15427() != ((ModeSetting)var2).method_12858()) {
                  var42.method_15426(((ModeSetting)var2).method_12858());
               }
            });
            var42.method_8236(var2x -> {
               ((ModeSetting)var2).method_12859(((class_3366)var2x).method_15427());
               var42.method_15426(((ModeSetting)var2).method_12858());
            });
            var42.method_32135((var2x, var3x) -> var2x.method_32175(var1.method_32109() - 123 - var5));
            var1.method_32148(var34);
            var1.method_32148(var42);
            var4 += 27 + var5;
         case field_26717:
         default:
            break;
         case field_26716:
            class_7038 var17 = new class_7038(var1, var2.method_23032() + "view", var3, var4, var1.method_32109(), 0);
            int var25 = 0;

            for (Setting var41 : ((class_7131)var2).method_9875()) {
               var25 = this.method_1241(var17, var41, 0, var25, var5);
            }

            new class_4383().method_21840(var17, var1);
            var17.method_32135((var1x, var2x) -> var1x.method_32142(var2x.method_32109() - var5));
            var1.method_32148(var17);
            var4 += var17.method_32137() + var5;
            break;
         case field_26720:
            byte var16 = 123;
            byte var24 = 27;
            class_1552 var32 = new class_1552(var1, var2.method_23032() + "lbl", var3, var4, this.field_982, 27, class_1552.field_8208, var2.method_23032());
            class_9563 var40 = new class_9563(
               var1,
               var2.method_23032() + "btn",
               var1.method_32109() - var5,
               var4 + 6,
               123,
               27,
               ((SomeWeirdIntegerSetting)var2).method_32991(),
               (Integer)var2.method_23031()
            );
            this.field_976.put(var32, var2);
            var2.method_23029(var1x -> {
               if (var40.method_44209() != (Integer)var1x.method_23031()) {
                  var40.method_44211((Integer)var1x.method_23031(), false);
               }
            });
            var40.method_8236(var1x -> var2.method_23037(((class_9563)var1x).method_44209()));
            var40.method_32135((var2x, var3x) -> var2x.method_32175(var1.method_32109() - 123 - var5));
            var1.method_32148(var32);
            var1.method_32148(var40);
            var4 += 27 + var5;
            break;
         case field_26719:
            short var15 = 175;
            short var23 = 200;
            class_1552 var31 = new class_1552(var1, var2.method_23032() + "lbl", var3, var4, this.field_982, 200, class_1552.field_8208, var2.method_23032());
            class_1723 var39 = new class_1723(
               var1,
               var2.method_23032() + "picker",
               var1.method_32109() - var5,
               var4 + 5,
               175,
               200,
               ((MultiSetting)var2).method_21251(),
               ((MultiSetting)var2).method_23031().<String>toArray(new String[0])
            );
            this.field_976.put(var31, var2);
            var39.method_8236(var2x -> var2.method_23037(var39.method_7719()));
            var39.method_32135((var2x, var3x) -> var2x.method_32175(var1.method_32109() - 175 - var5));
            var1.method_32148(var31);
            var1.method_32148(var39);
            var4 += 200 + var5;
            break;
         case field_26727:
            short var14 = 160;
            byte var22 = 114;
            ColorSetting var30 = (ColorSetting)var2;
            class_1552 var38 = new class_1552(var1, var2.method_23032() + "lbl", var3, var4, this.field_982, 24, class_1552.field_8208, var2.method_23032());
            class_628 var46 = new class_628(
               var1, var2.method_23032() + "color", var1.method_32109() - 160 - var5 + 10, var4, 160, 114, (Integer)var2.method_23031(), var30.method_4268()
            );
            this.field_976.put(var38, var2);
            var2.method_23029(var3x -> {
               var46.method_2919((Integer)var2.method_23031());
               var46.method_2924(var30.method_4268());
            });
            var46.method_8236(var2x -> {
               var2.method_23038(((class_628)var2x).method_2922(), false);
               var30.method_4271(((class_628)var2x).method_2918());
            });
            var1.method_32148(var38);
            var1.method_32148(var46);
            var4 += 114 + var5 - 10;
            break;
         case field_26721:
            short var8 = 150;
            short var9 = 150;
            class_7928 var10 = (class_7928)var2.method_23031();
            class_1552 var11 = new class_1552(var1, var2.method_23032() + "lbl", var3, var4, this.field_982, 24, class_1552.field_8208, var2.method_23032());
            class_8310 var12 = new class_8310(
               var1,
               var2.method_23032() + "color",
               var1.method_32109() - 150 - var5 + 10,
               var4,
               150,
               150,
               20,
               var10.field_40551,
               var10.field_40553,
               var10.field_40550,
               var10.field_40552
            );
            this.field_976.put(var11, var2);
            var2.method_23029(var2x -> {
               class_7928 var5x = (class_7928)var2.method_23031();
               var12.method_38326(var5x.field_40551, var5x.field_40553, var5x.field_40550, var5x.field_40552);
            });
            var12.method_8236(
               var2x -> ((SomeWeirdMultiFloatSetting)var2).method_2109(var12.method_38325()[0], var12.method_38325()[1], var12.method_38325()[2], var12.method_38325()[3])
            );
            var1.method_32148(var11);
            var1.method_32148(var12);
            var4 += 150 + var5 - 10;
      }

      return var4 - (var5 - 10);
   }

   private void method_1240() {
      byte var3 = 20;
      int var4 = 20;

      for (Setting var6 : this.field_977.method_41996().values()) {
         var4 = this.method_1241(this, var6, 20, var4, 20);
      }

      int var17 = var4;
      if (this.field_977 instanceof SecondModule) {
         SecondModule var18 = (SecondModule)this.field_977;

         for (Module var10 : var18.field_17661) {
            int var11 = 0;
            class_7038 var12 = new class_7038(this, var10.method_41992() + "SubView", 0, var17, this.field_36278, this.field_36257 - var4);
            var12.method_32135((var0, var1) -> var0.method_32142(var1.method_32109()));

            for (Setting var14 : var10.method_41996().values()) {
               var11 = this.method_1241(var12, var14, 20, var11, 20);
            }

            var4 = Math.max(var4 + var11, var4);

            for (class_7038 var20 : var12.method_32134()) {
               if (var20 instanceof class_3366) {
                  class_3366 var15 = (class_3366)var20;
                  int var16 = var15.method_15429() + var15.method_32173() + var15.method_32137() + 14;
                  var11 = Math.max(var11, var16);
               }
            }

            var12.method_32158(var11);
            this.method_32148(var12);
            this.field_978.put(var10, var12);
         }

         var18.method_16865((var1, var2, var3x) -> this.field_978.get(var2).method_32104(var3x));
         var18.method_16866();
      }

      this.method_32148(new class_7038(this, "extentionhack", 0, var4, 0, 20));
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
   }

   @Override
   public void method_32178(float var1) {
      boolean var4 = false;

      for (Entry var6 : this.field_976.entrySet()) {
         class_1552 var7 = (class_1552)var6.getKey();
         Setting var8 = (Setting)var6.getValue();
         if (var7.method_32183() && var7.method_32147()) {
            var4 = true;
            this.field_981 = var8.method_23033();
            this.field_980 = var8.method_23032();
            break;
         }
      }

      GL11.glPushMatrix();
      super.method_32178(var1);
      GL11.glPopMatrix();
      this.field_979.method_11119(!var4 ? class_4043.field_19618 : class_4043.field_19620);
      class_73.method_87(
         class_5320.field_27138,
         (float)(this.method_32132() + 10),
         (float)(this.method_32173() + this.method_32137() + 24),
         this.field_980,
         class_314.method_1444(class_1255.field_6918.field_6917, 0.5F * this.field_979.method_11123())
      );
      class_73.method_87(
         class_5320.field_27138,
         (float)(this.method_32132() + 11),
         (float)(this.method_32173() + this.method_32137() + 24),
         this.field_980,
         class_314.method_1444(class_1255.field_6918.field_6917, 0.5F * this.field_979.method_11123())
      );
      class_73.method_87(
         class_5320.field_27138,
         (float)(this.method_32132() + 14 + class_5320.field_27138.method_18547(this.field_980) + 2),
         (float)(this.method_32173() + this.method_32137() + 24),
         this.field_981,
         class_314.method_1444(class_1255.field_6918.field_6917, 0.5F * this.field_979.method_11123())
      );
   }

   @Override
   public boolean method_7901() {
      return this.field_983;
   }

   @Override
   public void method_7903() {
      this.field_983 = true;
   }

   @Override
   public boolean method_7904() {
      return this.field_984;
   }

   @Override
   public void method_7902(boolean var1) {
      if (var1 != this.method_7904()) {
         this.method_7903();
      }
   }
}
