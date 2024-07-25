package remapped;

public class class_8282 {
   private static String[] field_42455;

   private static int method_38216(float var0) {
      float var3 = var0 / 3.0F;
      var3 = MathHelper.clamp(var3, -1.0F, 1.0F);
      return MathHelper.hsvToRGB(0.62222224F - var3 * 0.05F, 0.5F + var3 * 0.1F, 1.0F);
   }

   public static class_6325 method_38196(float var0, float var1, float var2, boolean var3) {
      class_7961 var6 = new class_7961();
      class_4705.method_21758(var6);
      var6.method_36017(class_4565.field_22239, new class_3222(EntityType.field_34225, 8, 4, 4));
      var6.method_36017(class_4565.field_22239, new class_3222(EntityType.field_34251, 4, 2, 3));
      var6.method_36017(class_4565.field_22239, new class_3222(EntityType.field_34250, 8, 2, 4));
      if (!var3) {
         class_4705.method_21689(var6);
         class_4705.method_21686(var6, 100, 25, 100);
      } else {
         class_4705.method_21747(var6);
      }

      class_3082 var7 = new class_3082().method_14125(class_7036.field_36222);
      class_4705.method_21720(var7);
      var7.method_14126(class_8390.field_42933);
      class_4705.method_21737(var7);
      class_4705.method_21687(var7);
      class_4705.method_21710(var7);
      class_4705.method_21690(var7);
      class_4705.method_21681(var7);
      class_4705.method_21728(var7);
      class_4705.method_21692(var7);
      class_4705.method_21739(var7);
      var7.method_14130(class_1841.field_9345, !var3 ? class_7024.field_36060 : class_7024.field_36143);
      class_4705.method_21704(var7);
      class_4705.method_21741(var7);
      class_4705.method_21745(var7);
      class_4705.method_21743(var7);
      class_4705.method_21708(var7);
      class_4705.method_21750(var7);
      class_4705.method_21729(var7);
      return new class_9315()
         .method_42998(class_6750.field_34844)
         .method_43005(class_8862.field_45310)
         .method_43007(var0)
         .method_43003(var1)
         .method_42999(var2)
         .method_43008(0.8F)
         .method_43002(
            new class_7731()
               .method_34995(4159204)
               .method_34997(329011)
               .method_34993(12638463)
               .method_34999(method_38216(var2))
               .method_35001(class_3161.field_15715)
               .method_34988()
         )
         .method_43004(var6.method_36014())
         .method_43001(var7.method_14124())
         .method_42997();
   }

   public static class_6325 method_38189(float var0, float var1, boolean var2) {
      class_7961 var5 = new class_7961();
      class_4705.method_21758(var5);
      class_4705.method_21747(var5);
      class_3082 var6 = new class_3082().method_14125(class_7036.field_36243);
      class_4705.method_21720(var6);
      var6.method_14126(class_8390.field_42933);
      class_4705.method_21737(var6);
      class_4705.method_21687(var6);
      class_4705.method_21710(var6);
      class_4705.method_21731(var6);
      class_4705.method_21728(var6);
      class_4705.method_21692(var6);
      class_4705.method_21739(var6);
      if (!var2) {
         class_4705.method_21715(var6);
      } else {
         class_4705.method_21727(var6);
      }

      class_4705.method_21704(var6);
      class_4705.method_21694(var6);
      class_4705.method_21745(var6);
      class_4705.method_21743(var6);
      class_4705.method_21708(var6);
      class_4705.method_21729(var6);
      return new class_9315()
         .method_42998(class_6750.field_34844)
         .method_43005(class_8862.field_45307)
         .method_43007(var0)
         .method_43003(var1)
         .method_42999(0.6F)
         .method_43008(0.6F)
         .method_43002(
            new class_7731()
               .method_34995(4159204)
               .method_34997(329011)
               .method_34993(12638463)
               .method_34999(method_38216(0.6F))
               .method_35001(class_3161.field_15715)
               .method_34988()
         )
         .method_43004(var5.method_36014())
         .method_43001(var6.method_14124())
         .method_42997();
   }

   public static class_6325 method_38186() {
      return method_38178(0.1F, 0.2F, 40, 2, 3);
   }

   public static class_6325 method_38191() {
      class_7961 var2 = new class_7961();
      class_4705.method_21759(var2);
      return method_38173(0.1F, 0.2F, 0.8F, false, true, false, var2);
   }

   public static class_6325 method_38175() {
      class_7961 var2 = new class_7961();
      class_4705.method_21759(var2);
      return method_38173(0.2F, 0.4F, 0.8F, false, true, true, var2);
   }

   public static class_6325 method_38181() {
      class_7961 var2 = new class_7961();
      class_4705.method_21759(var2);
      var2.method_36017(class_4565.field_22239, new class_3222(EntityType.field_34228, 10, 1, 1))
         .method_36017(class_4565.field_22247, new class_3222(EntityType.field_34214, 2, 1, 1));
      return method_38173(0.2F, 0.4F, 0.9F, false, false, true, var2);
   }

   public static class_6325 method_38212() {
      return method_38178(0.45F, 0.3F, 10, 1, 1);
   }

   public static class_6325 method_38165() {
      return method_38193(0.1F, 0.2F, 40, 2);
   }

   public static class_6325 method_38214() {
      return method_38193(0.45F, 0.3F, 10, 1);
   }

   private static class_6325 method_38178(float var0, float var1, int var2, int var3, int var4) {
      class_7961 var7 = new class_7961();
      class_4705.method_21759(var7);
      var7.method_36017(class_4565.field_22239, new class_3222(EntityType.field_34228, var2, 1, var3))
         .method_36017(class_4565.field_22247, new class_3222(EntityType.field_34214, 2, 1, var4))
         .method_36017(class_4565.field_22239, new class_3222(EntityType.field_34232, 1, 1, 2));
      var7.method_36018();
      return method_38173(var0, var1, 0.9F, false, false, false, var7);
   }

   private static class_6325 method_38193(float var0, float var1, int var2, int var3) {
      class_7961 var6 = new class_7961();
      class_4705.method_21759(var6);
      var6.method_36017(class_4565.field_22239, new class_3222(EntityType.field_34228, var2, 1, var3))
         .method_36017(class_4565.field_22239, new class_3222(EntityType.field_34232, 80, 1, 2))
         .method_36017(class_4565.field_22247, new class_3222(EntityType.field_34214, 2, 1, 1));
      return method_38173(var0, var1, 0.9F, true, false, false, var6);
   }

   private static class_6325 method_38173(float var0, float var1, float var2, boolean var3, boolean var4, boolean var5, class_7961 var6) {
      class_3082 var9 = new class_3082().method_14125(class_7036.field_36243);
      if (!var4 && !var5) {
         var9.method_14126(class_8390.field_42936);
      }

      class_4705.method_21720(var9);
      var9.method_14126(class_8390.field_42926);
      class_4705.method_21737(var9);
      class_4705.method_21687(var9);
      class_4705.method_21710(var9);
      class_4705.method_21728(var9);
      class_4705.method_21692(var9);
      class_4705.method_21739(var9);
      if (!var3) {
         if (!var4 && !var5) {
            class_4705.method_21717(var9);
         }

         if (!var4) {
            class_4705.method_21754(var9);
         } else {
            class_4705.method_21716(var9);
         }
      } else {
         class_4705.method_21735(var9);
      }

      class_4705.method_21698(var9);
      class_4705.method_21702(var9);
      class_4705.method_21745(var9);
      class_4705.method_21743(var9);
      class_4705.method_21708(var9);
      class_4705.method_21724(var9);
      class_4705.method_21729(var9);
      return new class_9315()
         .method_42998(class_6750.field_34844)
         .method_43005(class_8862.field_45300)
         .method_43007(var0)
         .method_43003(var1)
         .method_42999(0.95F)
         .method_43008(var2)
         .method_43002(
            new class_7731()
               .method_34995(4159204)
               .method_34997(329011)
               .method_34993(12638463)
               .method_34999(method_38216(0.95F))
               .method_35001(class_3161.field_15715)
               .method_34988()
         )
         .method_43004(var6.method_36014())
         .method_43001(var9.method_14124())
         .method_42997();
   }

   public static class_6325 method_38184(float var0, float var1, class_7929<class_5194> var2, boolean var3) {
      class_7961 var6 = new class_7961();
      class_4705.method_21758(var6);
      var6.method_36017(class_4565.field_22239, new class_3222(EntityType.field_34327, 5, 4, 6));
      class_4705.method_21747(var6);
      class_3082 var7 = new class_3082().method_14125(var2);
      class_4705.method_21720(var7);
      var7.method_14126(class_8390.field_42935);
      class_4705.method_21737(var7);
      class_4705.method_21687(var7);
      class_4705.method_21710(var7);
      class_4705.method_21728(var7);
      class_4705.method_21692(var7);
      class_4705.method_21739(var7);
      if (!var3) {
         class_4705.method_21697(var7);
      } else {
         class_4705.method_21684(var7);
      }

      class_4705.method_21704(var7);
      class_4705.method_21756(var7);
      class_4705.method_21745(var7);
      class_4705.method_21743(var7);
      class_4705.method_21708(var7);
      class_4705.method_21706(var7);
      class_4705.method_21725(var7);
      class_4705.method_21729(var7);
      return new class_9315()
         .method_42998(class_6750.field_34844)
         .method_43005(class_8862.field_45298)
         .method_43007(var0)
         .method_43003(var1)
         .method_42999(0.2F)
         .method_43008(0.3F)
         .method_43002(
            new class_7731()
               .method_34995(4159204)
               .method_34997(329011)
               .method_34993(12638463)
               .method_34999(method_38216(0.2F))
               .method_35001(class_3161.field_15715)
               .method_34988()
         )
         .method_43004(var6.method_36014())
         .method_43001(var7.method_14124())
         .method_42997();
   }

   public static class_6325 method_38195(float var0, float var1, boolean var2, boolean var3, boolean var4) {
      class_7961 var7 = new class_7961();
      class_4705.method_21718(var7);
      class_3082 var8 = new class_3082().method_14125(class_7036.field_36230);
      if (var2) {
         var8.method_14126(class_8390.field_42920);
         var8.method_14126(class_8390.field_42917);
      }

      if (var3) {
         var8.method_14126(class_8390.field_42945);
      }

      if (var4) {
         class_4705.method_21719(var8);
      }

      class_4705.method_21720(var8);
      var8.method_14126(class_8390.field_42941);
      class_4705.method_21737(var8);
      class_4705.method_21703(var8);
      class_4705.method_21710(var8);
      class_4705.method_21728(var8);
      class_4705.method_21692(var8);
      class_4705.method_21739(var8);
      class_4705.method_21704(var8);
      class_4705.method_21756(var8);
      class_4705.method_21723(var8);
      class_4705.method_21745(var8);
      class_4705.method_21691(var8);
      class_4705.method_21708(var8);
      class_4705.method_21751(var8);
      class_4705.method_21729(var8);
      return new class_9315()
         .method_42998(class_6750.field_34851)
         .method_43005(class_8862.field_45294)
         .method_43007(var0)
         .method_43003(var1)
         .method_42999(2.0F)
         .method_43008(0.0F)
         .method_43002(
            new class_7731()
               .method_34995(4159204)
               .method_34997(329011)
               .method_34993(12638463)
               .method_34999(method_38216(2.0F))
               .method_35001(class_3161.field_15715)
               .method_34988()
         )
         .method_43004(var7.method_36014())
         .method_43001(var8.method_14124())
         .method_42997();
   }

   public static class_6325 method_38199(boolean var0) {
      class_7961 var3 = new class_7961();
      class_4705.method_21730(var3);
      if (!var0) {
         var3.method_36018();
      }

      class_3082 var4 = new class_3082().method_14125(class_7036.field_36243);
      if (!var0) {
         var4.method_14126(class_8390.field_42937).method_14126(class_8390.field_42917);
      }

      class_4705.method_21720(var4);
      var4.method_14126(class_8390.field_42933);
      class_4705.method_21737(var4);
      class_4705.method_21687(var4);
      class_4705.method_21710(var4);
      class_4705.method_21688(var4);
      if (var0) {
         var4.method_14130(class_1841.field_9345, class_7024.field_36107);
      }

      class_4705.method_21728(var4);
      class_4705.method_21692(var4);
      class_4705.method_21739(var4);
      class_4705.method_21709(var4);
      if (var0) {
         var4.method_14130(class_1841.field_9345, class_7024.field_36127);
      }

      class_4705.method_21745(var4);
      if (!var0) {
         class_4705.method_21743(var4);
      } else {
         var4.method_14130(class_1841.field_9345, class_7024.field_36084);
      }

      class_4705.method_21708(var4);
      class_4705.method_21729(var4);
      return new class_9315()
         .method_42998(class_6750.field_34844)
         .method_43005(class_8862.field_45293)
         .method_43007(0.125F)
         .method_43003(0.05F)
         .method_42999(0.8F)
         .method_43008(0.4F)
         .method_43002(
            new class_7731()
               .method_34995(4159204)
               .method_34997(329011)
               .method_34993(12638463)
               .method_34999(method_38216(0.8F))
               .method_35001(class_3161.field_15715)
               .method_34988()
         )
         .method_43004(var3.method_36014())
         .method_43001(var4.method_14124())
         .method_42997();
   }

   private static class_6325 method_38209(class_3082 var0) {
      class_7961 var3 = new class_7961();
      class_4705.method_21740(var3);
      return new class_9315()
         .method_42998(class_6750.field_34851)
         .method_43005(class_8862.field_45302)
         .method_43007(0.1F)
         .method_43003(0.2F)
         .method_42999(0.5F)
         .method_43008(0.5F)
         .method_43002(
            new class_7731()
               .method_34995(4159204)
               .method_34997(329011)
               .method_34993(10518688)
               .method_34999(0)
               .method_35001(class_3161.field_15715)
               .method_34988()
         )
         .method_43004(var3.method_36014())
         .method_43001(var0.method_14124())
         .method_42997();
   }

   public static class_6325 method_38188() {
      class_3082 var2 = new class_3082().method_14125(class_7036.field_36235);
      return method_38209(var2);
   }

   public static class_6325 method_38207() {
      class_3082 var2 = new class_3082().method_14125(class_7036.field_36235).method_14130(class_1841.field_9349, class_7024.field_36146);
      return method_38209(var2);
   }

   public static class_6325 method_38177() {
      class_3082 var2 = new class_3082().method_14125(class_7036.field_36235).method_14126(class_8390.field_42942);
      return method_38209(var2);
   }

   public static class_6325 method_38168() {
      class_3082 var2 = new class_3082()
         .method_14125(class_7036.field_36235)
         .method_14126(class_8390.field_42942)
         .method_14130(class_1841.field_9349, class_7024.field_36061)
         .method_14130(class_1841.field_9345, class_7024.field_36008);
      return method_38209(var2);
   }

   public static class_6325 method_38203() {
      class_3082 var2 = new class_3082().method_14125(class_7036.field_36235).method_14130(class_1841.field_9343, class_7024.field_36158);
      return method_38209(var2);
   }

   public static class_6325 method_38211(float var0, float var1) {
      class_7961 var4 = new class_7961();
      class_4705.method_21721(var4);
      class_3082 var5 = new class_3082().method_14125(class_7036.field_36226);
      class_4705.method_21720(var5);
      var5.method_14126(class_8390.field_42933);
      class_4705.method_21737(var5);
      class_4705.method_21687(var5);
      class_4705.method_21710(var5);
      class_4705.method_21728(var5);
      class_4705.method_21692(var5);
      class_4705.method_21739(var5);
      class_4705.method_21705(var5);
      class_4705.method_21745(var5);
      class_4705.method_21743(var5);
      class_4705.method_21708(var5);
      class_4705.method_21729(var5);
      return new class_9315()
         .method_42998(class_6750.field_34844)
         .method_43005(class_8862.field_45296)
         .method_43007(var0)
         .method_43003(var1)
         .method_42999(0.9F)
         .method_43008(1.0F)
         .method_43002(
            new class_7731()
               .method_34995(4159204)
               .method_34997(329011)
               .method_34993(12638463)
               .method_34999(method_38216(0.9F))
               .method_35001(class_3161.field_15715)
               .method_34988()
         )
         .method_43004(var4.method_36014())
         .method_43001(var5.method_14124())
         .method_42997();
   }

   private static class_6325 method_38206(float var0, float var1, float var2, boolean var3, boolean var4, class_7961 var5) {
      class_3082 var8 = new class_3082().method_14125(!var4 ? class_7036.field_36243 : class_7036.field_36240);
      if (!var3 && !var4) {
         var8.method_14126(class_8390.field_42919).method_14126(class_8390.field_42917);
      }

      class_4705.method_21720(var8);
      var8.method_14126(!var3 ? class_8390.field_42933 : class_8390.field_42935);
      class_4705.method_21737(var8);
      class_4705.method_21687(var8);
      class_4705.method_21710(var8);
      if (!var4) {
         class_4705.method_21738(var8);
      }

      class_4705.method_21728(var8);
      class_4705.method_21692(var8);
      class_4705.method_21739(var8);
      if (!var4) {
         class_4705.method_21742(var8);
         class_4705.method_21698(var8);
         class_4705.method_21734(var8);
      } else {
         class_4705.method_21682(var8);
         class_4705.method_21704(var8);
         class_4705.method_21736(var8);
      }

      class_4705.method_21745(var8);
      class_4705.method_21743(var8);
      class_4705.method_21708(var8);
      class_4705.method_21729(var8);
      return new class_9315()
         .method_42998(class_6750.field_34851)
         .method_43005(class_8862.field_45313)
         .method_43007(var0)
         .method_43003(var1)
         .method_42999(var2)
         .method_43008(0.0F)
         .method_43002(
            new class_7731()
               .method_34995(4159204)
               .method_34997(329011)
               .method_34993(12638463)
               .method_34999(method_38216(var2))
               .method_35001(class_3161.field_15715)
               .method_34988()
         )
         .method_43004(var5.method_36014())
         .method_43001(var8.method_14124())
         .method_42997();
   }

   public static class_6325 method_38202(float var0, float var1, float var2, boolean var3, boolean var4) {
      class_7961 var7 = method_38170();
      return method_38206(var0, var1, var2, var3, var4, var7);
   }

   private static class_7961 method_38170() {
      class_7961 var2 = new class_7961();
      class_4705.method_21758(var2);
      var2.method_36017(class_4565.field_22239, new class_3222(EntityType.field_34286, 1, 2, 6))
         .method_36017(class_4565.field_22239, new class_3222(EntityType.field_34248, 1, 1, 1));
      class_4705.method_21747(var2);
      return var2;
   }

   public static class_6325 method_38183() {
      class_7961 var2 = method_38170();
      var2.method_36017(class_4565.field_22239, new class_3222(EntityType.field_34327, 8, 4, 4));
      return method_38206(1.5F, 0.025F, 1.0F, true, false, var2);
   }

   private static class_6325 method_38163(class_7929<class_5194> var0, float var1, float var2, boolean var3, boolean var4) {
      class_7961 var7 = new class_7961();
      class_4705.method_21747(var7);
      class_3082 var8 = new class_3082().method_14125(var0);
      class_4705.method_21733(var8);
      var8.method_14126(!var3 ? class_8390.field_42933 : class_8390.field_42935);
      class_4705.method_21737(var8);
      class_4705.method_21687(var8);
      class_4705.method_21710(var8);
      class_4705.method_21728(var8);
      class_4705.method_21692(var8);
      class_4705.method_21744(var8);
      class_4705.method_21739(var8);
      if (var4) {
         class_4705.method_21683(var8);
      }

      class_4705.method_21714(var8);
      class_4705.method_21745(var8);
      class_4705.method_21701(var8);
      class_4705.method_21708(var8);
      class_4705.method_21729(var8);
      return new class_9315()
         .method_42998(class_6750.field_34851)
         .method_43005(class_8862.field_45303)
         .method_43007(var1)
         .method_43003(var2)
         .method_42999(2.0F)
         .method_43008(0.0F)
         .method_43002(
            new class_7731()
               .method_34995(4159204)
               .method_34997(329011)
               .method_34993(12638463)
               .method_34999(method_38216(2.0F))
               .method_34998(10387789)
               .method_34990(9470285)
               .method_35001(class_3161.field_15715)
               .method_34988()
         )
         .method_43004(var7.method_36014())
         .method_43001(var8.method_14124())
         .method_42997();
   }

   public static class_6325 method_38200(float var0, float var1, boolean var2) {
      return method_38163(class_7036.field_36242, var0, var1, var2, false);
   }

   public static class_6325 method_38210(float var0, float var1) {
      return method_38163(class_7036.field_36238, var0, var1, true, true);
   }

   public static class_6325 method_38185() {
      return method_38163(class_7036.field_36232, 0.1F, 0.2F, true, false);
   }

   private static class_6325 method_38201(class_7961 var0, int var1, int var2, boolean var3, class_3082 var4) {
      return new class_9315()
         .method_42998(class_6750.field_34844)
         .method_43005(class_8862.field_45309)
         .method_43007(!var3 ? -1.0F : -1.8F)
         .method_43003(0.1F)
         .method_42999(0.5F)
         .method_43008(0.5F)
         .method_43002(
            new class_7731()
               .method_34995(var1)
               .method_34997(var2)
               .method_34993(12638463)
               .method_34999(method_38216(0.5F))
               .method_35001(class_3161.field_15715)
               .method_34988()
         )
         .method_43004(var0.method_36014())
         .method_43001(var4.method_14124())
         .method_42997();
   }

   private static class_3082 method_38197(class_7929<class_5194> var0, boolean var1, boolean var2, boolean var3) {
      class_3082 var6 = new class_3082().method_14125(var0);
      class_7865 var7 = !var2 ? class_8390.field_42944 : class_8390.field_42916;
      if (!var3) {
         var6.method_14126(var7);
         if (var1) {
            var6.method_14126(class_8390.field_42922);
         }

         class_4705.method_21752(var6);
      } else {
         if (var1) {
            var6.method_14126(class_8390.field_42922);
         }

         class_4705.method_21752(var6);
         var6.method_14126(var7);
      }

      var6.method_14126(class_8390.field_42930);
      class_4705.method_21746(var6);
      class_4705.method_21687(var6);
      class_4705.method_21710(var6);
      class_4705.method_21728(var6);
      class_4705.method_21692(var6);
      class_4705.method_21739(var6);
      class_4705.method_21748(var6);
      class_4705.method_21704(var6);
      class_4705.method_21756(var6);
      class_4705.method_21745(var6);
      class_4705.method_21743(var6);
      class_4705.method_21708(var6);
      return var6;
   }

   public static class_6325 method_38192(boolean var0) {
      class_7961 var3 = new class_7961();
      class_4705.method_21680(var3, 3, 4, 15);
      var3.method_36017(class_4565.field_22248, new class_3222(EntityType.field_34236, 15, 1, 5));
      boolean var4 = !var0;
      class_3082 var5 = method_38197(class_7036.field_36243, var0, false, var4);
      var5.method_14130(class_1841.field_9345, !var0 ? class_7024.field_36029 : class_7024.field_36039);
      class_4705.method_21696(var5);
      class_4705.method_21726(var5);
      class_4705.method_21729(var5);
      return method_38201(var3, 4020182, 329011, var0, var5);
   }

   public static class_6325 method_38179(boolean var0) {
      class_7961 var3 = new class_7961();
      class_4705.method_21680(var3, 1, 4, 10);
      var3.method_36017(class_4565.field_22250, new class_3222(EntityType.field_34320, 1, 1, 2));
      class_3082 var4 = method_38197(class_7036.field_36243, var0, false, true);
      var4.method_14130(class_1841.field_9345, !var0 ? class_7024.field_36108 : class_7024.field_36177);
      class_4705.method_21696(var4);
      class_4705.method_21726(var4);
      class_4705.method_21729(var4);
      return method_38201(var3, 4159204, 329011, var0, var4);
   }

   public static class_6325 method_38213(boolean var0) {
      class_7961 var3 = new class_7961();
      if (!var0) {
         class_4705.method_21680(var3, 10, 2, 15);
      } else {
         class_4705.method_21680(var3, 8, 4, 8);
      }

      var3.method_36017(class_4565.field_22248, new class_3222(EntityType.field_34315, 5, 1, 3))
         .method_36017(class_4565.field_22248, new class_3222(EntityType.field_34278, 25, 8, 8))
         .method_36017(class_4565.field_22250, new class_3222(EntityType.field_34320, 2, 1, 2));
      class_3082 var4 = method_38197(class_7036.field_36224, var0, true, false);
      var4.method_14130(class_1841.field_9345, !var0 ? class_7024.field_36053 : class_7024.field_36042);
      if (var0) {
         class_4705.method_21696(var4);
      }

      class_4705.method_21753(var4);
      class_4705.method_21729(var4);
      return method_38201(var3, 4566514, 267827, var0, var4);
   }

   public static class_6325 method_38172() {
      class_7961 var2 = new class_7961().method_36017(class_4565.field_22248, new class_3222(EntityType.field_34315, 15, 1, 3));
      class_4705.method_21695(var2, 10, 4);
      class_3082 var3 = method_38197(class_7036.field_36228, false, true, false)
         .method_14130(class_1841.field_9345, class_7024.field_36169)
         .method_14130(class_1841.field_9345, class_7024.field_36053)
         .method_14130(class_1841.field_9345, class_7024.field_36041);
      class_4705.method_21729(var3);
      return method_38201(var2, 4445678, 270131, false, var3);
   }

   public static class_6325 method_38217() {
      class_7961 var2 = new class_7961();
      class_4705.method_21695(var2, 5, 1);
      var2.method_36017(class_4565.field_22247, new class_3222(EntityType.field_34211, 5, 1, 1));
      class_3082 var3 = method_38197(class_7036.field_36228, true, true, false).method_14130(class_1841.field_9345, class_7024.field_36042);
      class_4705.method_21696(var3);
      class_4705.method_21729(var3);
      return method_38201(var2, 4445678, 270131, true, var3);
   }

   public static class_6325 method_38198(boolean var0) {
      class_7961 var3 = new class_7961()
         .method_36017(class_4565.field_22250, new class_3222(EntityType.field_34292, 1, 1, 4))
         .method_36017(class_4565.field_22248, new class_3222(EntityType.field_34236, 15, 1, 5))
         .method_36017(class_4565.field_22239, new class_3222(EntityType.field_34229, 1, 1, 2));
      class_4705.method_21747(var3);
      var3.method_36017(class_4565.field_22247, new class_3222(EntityType.field_34211, 5, 1, 1));
      float var4 = !var0 ? 0.0F : 0.5F;
      class_3082 var5 = new class_3082().method_14125(class_7036.field_36241);
      var5.method_14126(class_8390.field_42944);
      if (var0) {
         var5.method_14126(class_8390.field_42922);
      }

      class_4705.method_21752(var5);
      var5.method_14126(class_8390.field_42930);
      class_4705.method_21746(var5);
      class_4705.method_21687(var5);
      class_4705.method_21722(var5);
      class_4705.method_21710(var5);
      class_4705.method_21732(var5);
      class_4705.method_21728(var5);
      class_4705.method_21692(var5);
      class_4705.method_21739(var5);
      class_4705.method_21748(var5);
      class_4705.method_21704(var5);
      class_4705.method_21756(var5);
      class_4705.method_21745(var5);
      class_4705.method_21743(var5);
      class_4705.method_21708(var5);
      class_4705.method_21729(var5);
      return new class_9315()
         .method_42998(!var0 ? class_6750.field_34846 : class_6750.field_34844)
         .method_43005(class_8862.field_45309)
         .method_43007(!var0 ? -1.0F : -1.8F)
         .method_43003(0.1F)
         .method_42999(var4)
         .method_43006(class_101.field_241)
         .method_43008(0.5F)
         .method_43002(
            new class_7731()
               .method_34995(3750089)
               .method_34997(329011)
               .method_34993(12638463)
               .method_34999(method_38216(var4))
               .method_35001(class_3161.field_15715)
               .method_34988()
         )
         .method_43004(var3.method_36014())
         .method_43001(var5.method_14124())
         .method_42997();
   }

   private static class_6325 method_38176(float var0, float var1, boolean var2, class_7961 var3) {
      class_3082 var6 = new class_3082().method_14125(class_7036.field_36243);
      class_4705.method_21720(var6);
      var6.method_14126(class_8390.field_42933);
      class_4705.method_21737(var6);
      class_4705.method_21687(var6);
      class_4705.method_21710(var6);
      if (!var2) {
         class_4705.method_21731(var6);
      } else {
         var6.method_14130(class_1841.field_9345, class_7024.field_35996);
      }

      class_4705.method_21728(var6);
      class_4705.method_21692(var6);
      class_4705.method_21739(var6);
      if (!var2) {
         class_4705.method_21707(var6);
         class_4705.method_21704(var6);
         class_4705.method_21694(var6);
      } else {
         var6.method_14130(class_1841.field_9345, class_7024.field_36124);
         var6.method_14130(class_1841.field_9345, class_7024.field_36000);
         class_4705.method_21756(var6);
      }

      class_4705.method_21745(var6);
      class_4705.method_21743(var6);
      class_4705.method_21708(var6);
      class_4705.method_21729(var6);
      return new class_9315()
         .method_42998(class_6750.field_34844)
         .method_43005(class_8862.field_45307)
         .method_43007(var0)
         .method_43003(var1)
         .method_42999(0.7F)
         .method_43008(0.8F)
         .method_43002(
            new class_7731()
               .method_34995(4159204)
               .method_34997(329011)
               .method_34993(12638463)
               .method_34999(method_38216(0.7F))
               .method_35001(class_3161.field_15715)
               .method_34988()
         )
         .method_43004(var3.method_36014())
         .method_43001(var6.method_14124())
         .method_42997();
   }

   private static class_7961 method_38187() {
      class_7961 var2 = new class_7961();
      class_4705.method_21758(var2);
      class_4705.method_21747(var2);
      return var2;
   }

   public static class_6325 method_38215(float var0, float var1) {
      class_7961 var4 = method_38187().method_36017(class_4565.field_22239, new class_3222(EntityType.field_34225, 5, 4, 4)).method_36018();
      return method_38176(var0, var1, false, var4);
   }

   public static class_6325 method_38194() {
      class_7961 var2 = method_38187().method_36017(class_4565.field_22239, new class_3222(EntityType.field_34251, 4, 2, 3));
      return method_38176(0.1F, 0.4F, true, var2);
   }

   public static class_6325 method_38171(float var0, float var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      class_7961 var8 = new class_7961();
      class_4705.method_21758(var8);
      var8.method_36017(class_4565.field_22239, new class_3222(EntityType.field_34225, 8, 4, 4))
         .method_36017(class_4565.field_22239, new class_3222(EntityType.field_34251, 4, 2, 3))
         .method_36017(class_4565.field_22239, new class_3222(EntityType.field_34250, 8, 2, 4));
      if (!var2 && !var3) {
         var8.method_36018();
      }

      class_4705.method_21747(var8);
      float var9 = !var2 ? 0.25F : -0.5F;
      class_3082 var10 = new class_3082().method_14125(class_7036.field_36243);
      if (var4) {
         var10.method_14126(class_8390.field_42928);
         var10.method_14126(class_8390.field_42917);
      }

      if (var5) {
         var10.method_14126(class_8390.field_42929);
      }

      class_4705.method_21720(var10);
      var10.method_14126(!var3 ? class_8390.field_42933 : class_8390.field_42935);
      class_4705.method_21737(var10);
      class_4705.method_21687(var10);
      class_4705.method_21710(var10);
      class_4705.method_21681(var10);
      class_4705.method_21728(var10);
      class_4705.method_21692(var10);
      class_4705.method_21739(var10);
      class_4705.method_21685(var10);
      class_4705.method_21704(var10);
      class_4705.method_21700(var10);
      class_4705.method_21745(var10);
      class_4705.method_21743(var10);
      class_4705.method_21708(var10);
      if (!var2) {
         class_4705.method_21750(var10);
      } else {
         class_4705.method_21693(var10);
      }

      class_4705.method_21729(var10);
      return new class_9315()
         .method_42998(!var2 ? class_6750.field_34844 : class_6750.field_34846)
         .method_43005(class_8862.field_45310)
         .method_43007(var0)
         .method_43003(var1)
         .method_42999(var9)
         .method_43008(!var2 ? 0.8F : 0.4F)
         .method_43002(
            new class_7731()
               .method_34995(!var2 ? 4159204 : 4020182)
               .method_34997(329011)
               .method_34993(12638463)
               .method_34999(method_38216(var9))
               .method_35001(class_3161.field_15715)
               .method_34988()
         )
         .method_43004(var8.method_36014())
         .method_43001(var10.method_14124())
         .method_42997();
   }

   public static class_6325 method_38174(float var0, float var1, boolean var2) {
      class_7961 var5 = new class_7961();
      class_4705.method_21758(var5);
      class_4705.method_21747(var5);
      class_3082 var6 = new class_3082().method_14125(class_7036.field_36243);
      var6.method_14126(class_8390.field_42931);
      class_4705.method_21720(var6);
      var6.method_14126(class_8390.field_42933);
      class_4705.method_21737(var6);
      class_4705.method_21687(var6);
      class_4705.method_21710(var6);
      var6.method_14130(class_1841.field_9345, !var2 ? class_7024.field_36125 : class_7024.field_36017);
      class_4705.method_21731(var6);
      class_4705.method_21728(var6);
      class_4705.method_21692(var6);
      class_4705.method_21739(var6);
      class_4705.method_21704(var6);
      class_4705.method_21694(var6);
      class_4705.method_21745(var6);
      class_4705.method_21743(var6);
      class_4705.method_21708(var6);
      class_4705.method_21729(var6);
      return new class_9315()
         .method_42998(class_6750.field_34844)
         .method_43005(class_8862.field_45307)
         .method_43007(var0)
         .method_43003(var1)
         .method_42999(0.7F)
         .method_43008(0.8F)
         .method_43002(
            new class_7731()
               .method_34995(4159204)
               .method_34997(329011)
               .method_34993(12638463)
               .method_34999(method_38216(0.7F))
               .method_34992(class_4184.field_20370)
               .method_35001(class_3161.field_15715)
               .method_34988()
         )
         .method_43004(var5.method_36014())
         .method_43001(var6.method_14124())
         .method_42997();
   }

   public static class_6325 method_38164(float var0, float var1, boolean var2) {
      class_7961 var5 = new class_7961();
      class_4705.method_21758(var5);
      class_4705.method_21747(var5);
      var5.method_36017(class_4565.field_22247, new class_3222(EntityType.field_34222, 1, 1, 1));
      class_3082 var6 = new class_3082().method_14125(class_7036.field_36239);
      if (!var2) {
         var6.method_14126(class_8390.field_42940);
      }

      var6.method_14126(class_8390.field_42923);
      var6.method_14126(class_8390.field_42939);
      class_4705.method_21737(var6);
      if (!var2) {
         class_4705.method_21719(var6);
      }

      class_4705.method_21687(var6);
      class_4705.method_21710(var6);
      class_4705.method_21728(var6);
      class_4705.method_21692(var6);
      class_4705.method_21760(var6);
      class_4705.method_21712(var6);
      class_4705.method_21745(var6);
      class_4705.method_21711(var6);
      class_4705.method_21708(var6);
      if (!var2) {
         var6.method_14130(class_1841.field_9345, class_7024.field_36067);
      } else {
         class_4705.method_21719(var6);
      }

      class_4705.method_21729(var6);
      return new class_9315()
         .method_42998(class_6750.field_34844)
         .method_43005(class_8862.field_45306)
         .method_43007(var0)
         .method_43003(var1)
         .method_42999(0.8F)
         .method_43008(0.9F)
         .method_43002(
            new class_7731()
               .method_34995(6388580)
               .method_34997(2302743)
               .method_34993(12638463)
               .method_34999(method_38216(0.8F))
               .method_34998(6975545)
               .method_34992(class_4184.field_20365)
               .method_35001(class_3161.field_15715)
               .method_34988()
         )
         .method_43004(var5.method_36014())
         .method_43001(var6.method_14124())
         .method_42997();
   }

   public static class_6325 method_38190(float var0, float var1, boolean var2, boolean var3) {
      class_7961 var6 = new class_7961().method_36019(0.07F);
      class_4705.method_21699(var6);
      class_3082 var7 = new class_3082().method_14125(!var2 ? class_7036.field_36243 : class_7036.field_36231);
      if (!var2 && !var3) {
         var7.method_14126(class_8390.field_42934).method_14126(class_8390.field_42929);
      }

      class_4705.method_21720(var7);
      if (!var2 && !var3) {
         var7.method_14126(class_8390.field_42917);
      }

      var7.method_14126(!var3 ? class_8390.field_42933 : class_8390.field_42935);
      class_4705.method_21737(var7);
      class_4705.method_21687(var7);
      class_4705.method_21710(var7);
      if (var2) {
         var7.method_14130(class_1841.field_9349, class_7024.field_36142);
         var7.method_14130(class_1841.field_9349, class_7024.field_35990);
      }

      class_4705.method_21728(var7);
      class_4705.method_21692(var7);
      class_4705.method_21739(var7);
      class_4705.method_21757(var7);
      class_4705.method_21704(var7);
      class_4705.method_21756(var7);
      class_4705.method_21745(var7);
      class_4705.method_21743(var7);
      class_4705.method_21708(var7);
      class_4705.method_21729(var7);
      return new class_9315()
         .method_42998(class_6750.field_34846)
         .method_43005(class_8862.field_45304)
         .method_43007(var0)
         .method_43003(var1)
         .method_42999(0.0F)
         .method_43008(0.5F)
         .method_43002(
            new class_7731()
               .method_34995(4159204)
               .method_34997(329011)
               .method_34993(12638463)
               .method_34999(method_38216(0.0F))
               .method_35001(class_3161.field_15715)
               .method_34988()
         )
         .method_43004(var6.method_36014())
         .method_43001(var7.method_14124())
         .method_42997();
   }

   public static class_6325 method_38182(float var0, float var1, float var2, int var3, boolean var4) {
      class_7961 var7 = new class_7961()
         .method_36017(class_4565.field_22250, new class_3222(EntityType.field_34292, 2, 1, 4))
         .method_36017(class_4565.field_22248, new class_3222(EntityType.field_34236, 5, 1, 5));
      class_4705.method_21747(var7);
      var7.method_36017(class_4565.field_22247, new class_3222(EntityType.field_34211, !var4 ? 100 : 1, 1, 1));
      class_3082 var8 = new class_3082().method_14125(class_7036.field_36243);
      var8.method_14126(class_8390.field_42923);
      var8.method_14126(class_8390.field_42933);
      class_4705.method_21737(var8);
      class_4705.method_21687(var8);
      class_4705.method_21710(var8);
      class_4705.method_21728(var8);
      class_4705.method_21692(var8);
      class_4705.method_21739(var8);
      class_4705.method_21748(var8);
      class_4705.method_21704(var8);
      class_4705.method_21756(var8);
      class_4705.method_21745(var8);
      class_4705.method_21743(var8);
      class_4705.method_21708(var8);
      if (!var4) {
         var8.method_14130(class_1841.field_9345, class_7024.field_36037);
      }

      class_4705.method_21729(var8);
      return new class_9315()
         .method_42998(!var4 ? class_6750.field_34844 : class_6750.field_34846)
         .method_43005(class_8862.field_45297)
         .method_43007(var0)
         .method_43003(var1)
         .method_42999(var2)
         .method_43008(0.5F)
         .method_43002(
            new class_7731()
               .method_34995(var3)
               .method_34997(329011)
               .method_34993(12638463)
               .method_34999(method_38216(var2))
               .method_35001(class_3161.field_15715)
               .method_34988()
         )
         .method_43004(var7.method_36014())
         .method_43001(var8.method_14124())
         .method_42997();
   }

   public static class_6325 method_38204(float var0, float var1, float var2, float var3, int var4, boolean var5, boolean var6) {
      class_7961 var9 = new class_7961();
      if (!var6 && !var5) {
         var9.method_36017(class_4565.field_22239, new class_3222(EntityType.field_34283, 5, 2, 5));
      }

      class_4705.method_21747(var9);
      class_3082 var10 = new class_3082().method_14125(!var6 ? class_7036.field_36230 : class_7036.field_36229);
      if (!var6) {
         var10.method_14126(class_8390.field_42923);
         var10.method_14126(class_8390.field_42918);
         var10.method_14126(class_8390.field_42927);
      } else {
         class_4705.method_21720(var10);
      }

      var10.method_14126(!var6 ? class_8390.field_42933 : class_8390.field_42935);
      class_4705.method_21737(var10);
      class_4705.method_21687(var10);
      class_4705.method_21710(var10);
      class_4705.method_21728(var10);
      class_4705.method_21692(var10);
      class_4705.method_21739(var10);
      class_4705.method_21704(var10);
      class_4705.method_21756(var10);
      class_4705.method_21745(var10);
      class_4705.method_21743(var10);
      class_4705.method_21708(var10);
      class_4705.method_21729(var10);
      return new class_9315()
         .method_42998(!var5 ? class_6750.field_34844 : class_6750.field_34846)
         .method_43005(!var6 ? class_8862.field_45308 : class_8862.field_45312)
         .method_43007(var0)
         .method_43003(var1)
         .method_42999(var2)
         .method_43008(var3)
         .method_43002(
            new class_7731()
               .method_34995(var4)
               .method_34997(329011)
               .method_34993(12638463)
               .method_34999(method_38216(var2))
               .method_35001(class_3161.field_15715)
               .method_34988()
         )
         .method_43004(var9.method_36014())
         .method_43001(var10.method_14124())
         .method_42997();
   }

   public static class_6325 method_38180() {
      class_3082 var2 = new class_3082().method_14125(class_7036.field_36236);
      var2.method_14130(class_1841.field_9348, class_7024.field_36075);
      return new class_9315()
         .method_42998(class_6750.field_34851)
         .method_43005(class_8862.field_45312)
         .method_43007(0.1F)
         .method_43003(0.2F)
         .method_42999(0.5F)
         .method_43008(0.5F)
         .method_43002(
            new class_7731()
               .method_34995(4159204)
               .method_34997(329011)
               .method_34993(12638463)
               .method_34999(method_38216(0.5F))
               .method_35001(class_3161.field_15715)
               .method_34988()
         )
         .method_43004(class_6068.field_31042)
         .method_43001(var2.method_14124())
         .method_42997();
   }

   public static class_6325 method_38169() {
      class_6068 var2 = new class_7961()
         .method_36017(class_4565.field_22247, new class_3222(EntityType.field_34281, 50, 4, 4))
         .method_36017(class_4565.field_22247, new class_3222(EntityType.field_34234, 100, 4, 4))
         .method_36017(class_4565.field_22247, new class_3222(EntityType.field_34295, 2, 4, 4))
         .method_36017(class_4565.field_22247, new class_3222(EntityType.field_34308, 1, 4, 4))
         .method_36017(class_4565.field_22247, new class_3222(EntityType.field_34240, 15, 4, 4))
         .method_36017(class_4565.field_22239, new class_3222(EntityType.field_34233, 60, 1, 2))
         .method_36014();
      class_3082 var3 = new class_3082()
         .method_14125(class_7036.field_36237)
         .method_14126(class_8390.field_42932)
         .method_14126(class_8390.field_42924)
         .method_14126(class_8390.field_42938)
         .method_14131(class_6033.field_30811, class_2846.field_13958)
         .method_14130(class_1841.field_9345, class_7024.field_36040);
      class_4705.method_21745(var3);
      var3.method_14130(class_1841.field_9352, class_7024.field_36011)
         .method_14130(class_1841.field_9352, class_7024.field_36098)
         .method_14130(class_1841.field_9352, class_7024.field_36179)
         .method_14130(class_1841.field_9352, class_7024.field_36064)
         .method_14130(class_1841.field_9352, class_7024.field_36157)
         .method_14130(class_1841.field_9352, class_7024.field_36056)
         .method_14130(class_1841.field_9352, class_7024.field_36140)
         .method_14130(class_1841.field_9352, class_7024.field_36105)
         .method_14130(class_1841.field_9352, class_7024.field_36155);
      class_4705.method_21755(var3);
      return new class_9315()
         .method_42998(class_6750.field_34851)
         .method_43005(class_8862.field_45305)
         .method_43007(0.1F)
         .method_43003(0.2F)
         .method_42999(2.0F)
         .method_43008(0.0F)
         .method_43002(
            new class_7731()
               .method_34995(4159204)
               .method_34997(329011)
               .method_34993(3344392)
               .method_34999(method_38216(2.0F))
               .method_35000(SoundEvents.field_2095)
               .method_35001(new class_3161(SoundEvents.field_2228, 6000, 8, 2.0))
               .method_34991(new class_3902(SoundEvents.field_2536, 0.0111))
               .method_34996(class_2623.method_11870(SoundEvents.field_2385))
               .method_34988()
         )
         .method_43004(var2)
         .method_43001(var3.method_14124())
         .method_42997();
   }

   public static class_6325 method_38208() {
      double var2 = 0.7;
      double var4 = 0.15;
      class_6068 var6 = new class_7961()
         .method_36017(class_4565.field_22247, new class_3222(EntityType.field_34241, 20, 5, 5))
         .method_36017(class_4565.field_22247, new class_3222(EntityType.field_34281, 50, 4, 4))
         .method_36017(class_4565.field_22247, new class_3222(EntityType.field_34308, 1, 4, 4))
         .method_36017(class_4565.field_22239, new class_3222(EntityType.field_34233, 60, 1, 2))
         .method_36015(EntityType.field_34241, 0.7, 0.15)
         .method_36015(EntityType.field_34281, 0.7, 0.15)
         .method_36015(EntityType.field_34308, 0.7, 0.15)
         .method_36015(EntityType.field_34233, 0.7, 0.15)
         .method_36014();
      class_3082 var7 = new class_3082()
         .method_14125(class_7036.field_36233)
         .method_14126(class_8390.field_42924)
         .method_14126(class_8390.field_42921)
         .method_14126(class_8390.field_42932)
         .method_14126(class_8390.field_42938)
         .method_14131(class_6033.field_30811, class_2846.field_13958)
         .method_14130(class_1841.field_9345, class_7024.field_36040)
         .method_14130(class_1841.field_9351, class_7024.field_36019)
         .method_14130(class_1841.field_9352, class_7024.field_36011)
         .method_14130(class_1841.field_9352, class_7024.field_36064)
         .method_14130(class_1841.field_9352, class_7024.field_36157)
         .method_14130(class_1841.field_9352, class_7024.field_36002)
         .method_14130(class_1841.field_9352, class_7024.field_36098)
         .method_14130(class_1841.field_9352, class_7024.field_36179)
         .method_14130(class_1841.field_9352, class_7024.field_36105)
         .method_14130(class_1841.field_9352, class_7024.field_36155)
         .method_14130(class_1841.field_9352, class_7024.field_36038);
      class_4705.method_21755(var7);
      return new class_9315()
         .method_42998(class_6750.field_34851)
         .method_43005(class_8862.field_45305)
         .method_43007(0.1F)
         .method_43003(0.2F)
         .method_42999(2.0F)
         .method_43008(0.0F)
         .method_43002(
            new class_7731()
               .method_34995(4159204)
               .method_34997(329011)
               .method_34993(1787717)
               .method_34999(method_38216(2.0F))
               .method_34989(new class_2569(class_3090.field_15375, 0.00625F))
               .method_35000(SoundEvents.field_2026)
               .method_35001(new class_3161(SoundEvents.field_2459, 6000, 8, 2.0))
               .method_34991(new class_3902(SoundEvents.field_2273, 0.0111))
               .method_34996(class_2623.method_11870(SoundEvents.field_2678))
               .method_34988()
         )
         .method_43004(var6)
         .method_43001(var7.method_14124())
         .method_42997();
   }

   public static class_6325 method_38205() {
      class_6068 var2 = new class_7961()
         .method_36017(class_4565.field_22247, new class_3222(EntityType.field_34281, 40, 1, 1))
         .method_36017(class_4565.field_22247, new class_3222(EntityType.field_34295, 100, 2, 5))
         .method_36017(class_4565.field_22239, new class_3222(EntityType.field_34233, 60, 1, 2))
         .method_36014();
      class_3082 var3 = new class_3082()
         .method_14125(class_7036.field_36234)
         .method_14126(class_8390.field_42932)
         .method_14131(class_6033.field_30811, class_2846.field_13958)
         .method_14126(class_8390.field_42924)
         .method_14130(class_1841.field_9349, class_7024.field_36028)
         .method_14130(class_1841.field_9345, class_7024.field_36034)
         .method_14130(class_1841.field_9349, class_7024.field_36101)
         .method_14130(class_1841.field_9349, class_7024.field_36171)
         .method_14130(class_1841.field_9352, class_7024.field_36073)
         .method_14130(class_1841.field_9352, class_7024.field_36035)
         .method_14130(class_1841.field_9352, class_7024.field_36062)
         .method_14130(class_1841.field_9352, class_7024.field_36098)
         .method_14130(class_1841.field_9352, class_7024.field_36179)
         .method_14130(class_1841.field_9352, class_7024.field_36064)
         .method_14130(class_1841.field_9352, class_7024.field_36157)
         .method_14130(class_1841.field_9352, class_7024.field_36056)
         .method_14130(class_1841.field_9352, class_7024.field_36140)
         .method_14130(class_1841.field_9352, class_7024.field_36105)
         .method_14130(class_1841.field_9352, class_7024.field_36095)
         .method_14130(class_1841.field_9352, class_7024.field_35993)
         .method_14130(class_1841.field_9352, class_7024.field_36045);
      class_4705.method_21749(var3);
      return new class_9315()
         .method_42998(class_6750.field_34851)
         .method_43005(class_8862.field_45305)
         .method_43007(0.1F)
         .method_43003(0.2F)
         .method_42999(2.0F)
         .method_43008(0.0F)
         .method_43002(
            new class_7731()
               .method_34995(4159204)
               .method_34997(4341314)
               .method_34993(6840176)
               .method_34999(method_38216(2.0F))
               .method_34989(new class_2569(class_3090.field_15373, 0.118093334F))
               .method_35000(SoundEvents.field_2441)
               .method_35001(new class_3161(SoundEvents.field_2532, 6000, 8, 2.0))
               .method_34991(new class_3902(SoundEvents.field_2640, 0.0111))
               .method_34996(class_2623.method_11870(SoundEvents.field_2739))
               .method_34988()
         )
         .method_43004(var2)
         .method_43001(var3.method_14124())
         .method_42997();
   }

   public static class_6325 method_38167() {
      class_6068 var2 = new class_7961()
         .method_36017(class_4565.field_22247, new class_3222(EntityType.field_34234, 1, 2, 4))
         .method_36017(class_4565.field_22247, new class_3222(EntityType.field_34306, 9, 3, 4))
         .method_36017(class_4565.field_22247, new class_3222(EntityType.field_34240, 5, 3, 4))
         .method_36017(class_4565.field_22239, new class_3222(EntityType.field_34233, 60, 1, 2))
         .method_36014();
      class_3082 var3 = new class_3082()
         .method_14125(class_7036.field_36225)
         .method_14126(class_8390.field_42932)
         .method_14131(class_6033.field_30811, class_2846.field_13958)
         .method_14126(class_8390.field_42924)
         .method_14126(class_8390.field_42938)
         .method_14130(class_1841.field_9345, class_7024.field_36040);
      class_4705.method_21745(var3);
      var3.method_14130(class_1841.field_9352, class_7024.field_36011)
         .method_14130(class_1841.field_9352, class_7024.field_36098)
         .method_14130(class_1841.field_9352, class_7024.field_36064)
         .method_14130(class_1841.field_9352, class_7024.field_36157)
         .method_14130(class_1841.field_9352, class_7024.field_36105)
         .method_14130(class_1841.field_9352, class_7024.field_36155)
         .method_14130(class_1841.field_9345, class_7024.field_36016)
         .method_14130(class_1841.field_9345, class_7024.field_36109)
         .method_14130(class_1841.field_9345, class_7024.field_36077);
      class_4705.method_21755(var3);
      return new class_9315()
         .method_42998(class_6750.field_34851)
         .method_43005(class_8862.field_45305)
         .method_43007(0.1F)
         .method_43003(0.2F)
         .method_42999(2.0F)
         .method_43008(0.0F)
         .method_43002(
            new class_7731()
               .method_34995(4159204)
               .method_34997(329011)
               .method_34993(3343107)
               .method_34999(method_38216(2.0F))
               .method_34989(new class_2569(class_3090.field_15367, 0.025F))
               .method_35000(SoundEvents.field_2705)
               .method_35001(new class_3161(SoundEvents.field_2291, 6000, 8, 2.0))
               .method_34991(new class_3902(SoundEvents.field_2049, 0.0111))
               .method_34996(class_2623.method_11870(SoundEvents.field_2027))
               .method_34988()
         )
         .method_43004(var2)
         .method_43001(var3.method_14124())
         .method_42997();
   }

   public static class_6325 method_38166() {
      class_6068 var2 = new class_7961()
         .method_36017(class_4565.field_22247, new class_3222(EntityType.field_34308, 1, 4, 4))
         .method_36017(class_4565.field_22239, new class_3222(EntityType.field_34233, 60, 1, 2))
         .method_36015(EntityType.field_34308, 1.0, 0.12)
         .method_36014();
      class_3082 var3 = new class_3082()
         .method_14125(class_7036.field_36223)
         .method_14126(class_8390.field_42924)
         .method_14126(class_8390.field_42938)
         .method_14126(class_8390.field_42932)
         .method_14131(class_6033.field_30811, class_2846.field_13958)
         .method_14130(class_1841.field_9345, class_7024.field_36040);
      class_4705.method_21745(var3);
      var3.method_14130(class_1841.field_9352, class_7024.field_36011)
         .method_14130(class_1841.field_9352, class_7024.field_36098)
         .method_14130(class_1841.field_9352, class_7024.field_36179)
         .method_14130(class_1841.field_9352, class_7024.field_36064)
         .method_14130(class_1841.field_9352, class_7024.field_36157)
         .method_14130(class_1841.field_9352, class_7024.field_36105)
         .method_14130(class_1841.field_9352, class_7024.field_36155)
         .method_14130(class_1841.field_9345, class_7024.field_36162)
         .method_14130(class_1841.field_9345, class_7024.field_36093)
         .method_14130(class_1841.field_9345, class_7024.field_36004)
         .method_14130(class_1841.field_9345, class_7024.field_36172);
      class_4705.method_21755(var3);
      return new class_9315()
         .method_42998(class_6750.field_34851)
         .method_43005(class_8862.field_45305)
         .method_43007(0.1F)
         .method_43003(0.2F)
         .method_42999(2.0F)
         .method_43008(0.0F)
         .method_43002(
            new class_7731()
               .method_34995(4159204)
               .method_34997(329011)
               .method_34993(1705242)
               .method_34999(method_38216(2.0F))
               .method_34989(new class_2569(class_3090.field_15379, 0.01428F))
               .method_35000(SoundEvents.field_1954)
               .method_35001(new class_3161(SoundEvents.field_2776, 6000, 8, 2.0))
               .method_34991(new class_3902(SoundEvents.field_2614, 0.0111))
               .method_34996(class_2623.method_11870(SoundEvents.field_2848))
               .method_34988()
         )
         .method_43004(var2)
         .method_43001(var3.method_14124())
         .method_42997();
   }
}
