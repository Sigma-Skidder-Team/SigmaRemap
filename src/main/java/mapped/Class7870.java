package mapped;

import java.math.BigDecimal;

public final class Class7870 {
   private float[] field33686;
   private float[] field33687;
   private float[] field33688;
   private int field33689;
   private float[] field33690;
   private int field33691;
   private float field33692;
   private float[] field33693;
   private float[] field33694 = new float[32];
   private static final double field33695 = Math.PI;
   private static final float field33696 = (float)(1.0 / (2.0 * Math.cos(0.04908738521234052)));
   private static final float field33697 = (float)(1.0 / (2.0 * Math.cos(0.14726215563702155)));
   private static final float field33698 = (float)(1.0 / (2.0 * Math.cos(0.2454369260617026)));
   private static final float field33699 = (float)(1.0 / (2.0 * Math.cos(0.3436116964863836)));
   private static final float field33700 = (float)(1.0 / (2.0 * Math.cos(0.44178646691106466)));
   private static final float field33701 = (float)(1.0 / (2.0 * Math.cos(0.5399612373357456)));
   private static final float field33702 = (float)(1.0 / (2.0 * Math.cos(0.6381360077604268)));
   private static final float field33703 = (float)(1.0 / (2.0 * Math.cos(0.7363107781851077)));
   private static final float field33704 = (float)(1.0 / (2.0 * Math.cos(0.8344855486097889)));
   private static final float field33705 = (float)(1.0 / (2.0 * Math.cos(0.9326603190344698)));
   private static final float field33706 = (float)(1.0 / (2.0 * Math.cos(1.030835089459151)));
   private static final float field33707 = (float)(1.0 / (2.0 * Math.cos(1.1290098598838318)));
   private static final float field33708 = (float)(1.0 / (2.0 * Math.cos(1.227184630308513)));
   private static final float field33709 = (float)(1.0 / (2.0 * Math.cos(1.325359400733194)));
   private static final float field33710 = (float)(1.0 / (2.0 * Math.cos(1.423534171157875)));
   private static final float field33711 = (float)(1.0 / (2.0 * Math.cos(1.521708941582556)));
   private static final float field33712 = (float)(1.0 / (2.0 * Math.cos(0.09817477042468103)));
   private static final float field33713 = (float)(1.0 / (2.0 * Math.cos(0.2945243112740431)));
   private static final float field33714 = (float)(1.0 / (2.0 * Math.cos(0.4908738521234052)));
   private static final float field33715 = (float)(1.0 / (2.0 * Math.cos(0.6872233929727672)));
   private static final float field33716 = (float)(1.0 / (2.0 * Math.cos(0.8835729338221293)));
   private static final float field33717 = (float)(1.0 / (2.0 * Math.cos(1.0799224746714913)));
   private static final float field33718 = (float)(1.0 / (2.0 * Math.cos(1.2762720155208536)));
   private static final float field33719 = (float)(1.0 / (2.0 * Math.cos(1.4726215563702154)));
   private static final float field33720 = (float)(1.0 / (2.0 * Math.cos(Math.PI / 16)));
   private static final float field33721 = (float)(1.0 / (2.0 * Math.cos(0.5890486225480862)));
   private static final float field33722 = (float)(1.0 / (2.0 * Math.cos(0.9817477042468103)));
   private static final float field33723 = (float)(1.0 / (2.0 * Math.cos(1.3744467859455345)));
   private static final float field33724 = (float)(1.0 / (2.0 * Math.cos(Math.PI / 8)));
   private static final float field33725 = (float)(1.0 / (2.0 * Math.cos(Math.PI * 3.0 / 8.0)));
   private static final float field33726 = (float)(1.0 / (2.0 * Math.cos(Math.PI / 4)));
   private static float[] field33727 = null;
   private static float[][] field33728 = (float[][])null;

   public Class7870(int var1, float var2, float[] var3) {
      if (field33727 == null) {
         field33727 = method26387();
         field33728 = method26388(field33727, 16);
      }

      this.field33686 = new float[512];
      this.field33687 = new float[512];
      this.field33690 = new float[32];
      this.field33691 = var1;
      this.field33692 = var2;
      this.method26363(this.field33693);
      this.method26364();
   }

   public void method26363(float[] var1) {
      this.field33693 = var1;
      if (this.field33693 == null) {
         this.field33693 = new float[32];

         for (int var4 = 0; var4 < 32; var4++) {
            this.field33693[var4] = 1.0F;
         }
      }

      if (this.field33693.length < 32) {
         throw new IllegalArgumentException("eq0");
      }
   }

   public void method26364() {
      for (int var3 = 0; var3 < 512; var3++) {
         this.field33686[var3] = this.field33687[var3] = 0.0F;
      }

      for (int var4 = 0; var4 < 32; var4++) {
         this.field33690[var4] = 0.0F;
      }

      this.field33688 = this.field33686;
      this.field33689 = 15;
   }

   public void method26365(float var1, int var2) {
      this.field33690[var2] = this.field33693[var2] * var1;
   }

   public void method26366(float[] var1) {
      for (int var4 = 31; var4 >= 0; var4--) {
         this.field33690[var4] = var1[var4] * this.field33693[var4];
      }
   }

   private void method26367() {
      float var3 = 0.0F;
      float var4 = 0.0F;
      float var5 = 0.0F;
      float var6 = 0.0F;
      float var7 = 0.0F;
      float var8 = 0.0F;
      float var9 = 0.0F;
      float var10 = 0.0F;
      float var11 = 0.0F;
      float var12 = 0.0F;
      float var13 = 0.0F;
      float var14 = 0.0F;
      float var15 = 0.0F;
      float var16 = 0.0F;
      float var17 = 0.0F;
      float var18 = 0.0F;
      float var19 = 0.0F;
      float var20 = 0.0F;
      float var21 = 0.0F;
      float var22 = 0.0F;
      float var23 = 0.0F;
      float var24 = 0.0F;
      float var25 = 0.0F;
      float var26 = 0.0F;
      float var27 = 0.0F;
      float var28 = 0.0F;
      float var29 = 0.0F;
      float var30 = 0.0F;
      float var31 = 0.0F;
      float var32 = 0.0F;
      float var33 = 0.0F;
      float var34 = 0.0F;
      float[] var35 = this.field33690;
      float var36 = var35[0];
      float var37 = var35[1];
      float var38 = var35[2];
      float var39 = var35[3];
      float var40 = var35[4];
      float var41 = var35[5];
      float var42 = var35[6];
      float var43 = var35[7];
      float var44 = var35[8];
      float var45 = var35[9];
      float var46 = var35[10];
      float var47 = var35[11];
      float var48 = var35[12];
      float var49 = var35[13];
      float var50 = var35[14];
      float var51 = var35[15];
      float var52 = var35[16];
      float var53 = var35[17];
      float var54 = var35[18];
      float var55 = var35[19];
      float var56 = var35[20];
      float var57 = var35[21];
      float var58 = var35[22];
      float var59 = var35[23];
      float var60 = var35[24];
      float var61 = var35[25];
      float var62 = var35[26];
      float var63 = var35[27];
      float var64 = var35[28];
      float var65 = var35[29];
      float var66 = var35[30];
      float var67 = var35[31];
      float var68 = var36 + var67;
      float var69 = var37 + var66;
      float var70 = var38 + var65;
      float var71 = var39 + var64;
      float var72 = var40 + var63;
      float var73 = var41 + var62;
      float var74 = var42 + var61;
      float var75 = var43 + var60;
      float var76 = var44 + var59;
      float var77 = var45 + var58;
      float var78 = var46 + var57;
      float var79 = var47 + var56;
      float var80 = var48 + var55;
      float var81 = var49 + var54;
      float var82 = var50 + var53;
      float var83 = var51 + var52;
      float var84 = var68 + var83;
      float var85 = var69 + var82;
      float var86 = var70 + var81;
      float var87 = var71 + var80;
      float var88 = var72 + var79;
      float var89 = var73 + var78;
      float var90 = var74 + var77;
      float var91 = var75 + var76;
      float var92 = (var68 - var83) * field33712;
      float var93 = (var69 - var82) * field33713;
      float var94 = (var70 - var81) * field33714;
      float var95 = (var71 - var80) * field33715;
      float var96 = (var72 - var79) * field33716;
      float var97 = (var73 - var78) * field33717;
      float var98 = (var74 - var77) * field33718;
      float var99 = (var75 - var76) * field33719;
      var68 = var84 + var91;
      var69 = var85 + var90;
      var70 = var86 + var89;
      var71 = var87 + var88;
      var72 = (var84 - var91) * field33720;
      var73 = (var85 - var90) * field33721;
      var74 = (var86 - var89) * field33722;
      var75 = (var87 - var88) * field33723;
      var76 = var92 + var99;
      var77 = var93 + var98;
      var78 = var94 + var97;
      var79 = var95 + var96;
      var80 = (var92 - var99) * field33720;
      var81 = (var93 - var98) * field33721;
      var82 = (var94 - var97) * field33722;
      var83 = (var95 - var96) * field33723;
      var84 = var68 + var71;
      var85 = var69 + var70;
      var86 = (var68 - var71) * field33724;
      var87 = (var69 - var70) * field33725;
      var88 = var72 + var75;
      var89 = var73 + var74;
      var90 = (var72 - var75) * field33724;
      var91 = (var73 - var74) * field33725;
      var92 = var76 + var79;
      var93 = var77 + var78;
      var94 = (var76 - var79) * field33724;
      var95 = (var77 - var78) * field33725;
      var96 = var80 + var83;
      var97 = var81 + var82;
      var98 = (var80 - var83) * field33724;
      var99 = (var81 - var82) * field33725;
      var68 = var84 + var85;
      var69 = (var84 - var85) * field33726;
      var70 = var86 + var87;
      var71 = (var86 - var87) * field33726;
      var72 = var88 + var89;
      var73 = (var88 - var89) * field33726;
      var74 = var90 + var91;
      var75 = (var90 - var91) * field33726;
      var76 = var92 + var93;
      var77 = (var92 - var93) * field33726;
      var78 = var94 + var95;
      var79 = (var94 - var95) * field33726;
      var80 = var96 + var97;
      var81 = (var96 - var97) * field33726;
      var82 = var98 + var99;
      var83 = (var98 - var99) * field33726;
      var15 = -(var30 = var75 + var73) - var74;
      var7 = -var74 - var75 - var72;
      var28 = (var24 = var83 + var79) + var81;
      var17 = -(var32 = var83 + var81 + var77) - var82;
      float var100;
      var13 = (var100 = -var82 - var83 - var78 - var79) - var81;
      var5 = -var82 - var83 - var80 - var76;
      var9 = var100 - var80;
      var3 = -var68;
      var11 = -var71 - var70;
      var68 = (var36 - var67) * field33696;
      float var142 = (var37 - var66) * field33697;
      var70 = (var38 - var65) * field33698;
      float var152 = (var39 - var64) * field33699;
      var72 = (var40 - var63) * field33700;
      var73 = (var41 - var62) * field33701;
      var74 = (var42 - var61) * field33702;
      float var172 = (var43 - var60) * field33703;
      var76 = (var44 - var59) * field33704;
      var77 = (var45 - var58) * field33705;
      var78 = (var46 - var57) * field33706;
      var79 = (var47 - var56) * field33707;
      var80 = (var48 - var55) * field33708;
      var81 = (var49 - var54) * field33709;
      var82 = (var50 - var53) * field33710;
      float var212 = (var51 - var52) * field33711;
      var84 = var68 + var212;
      var85 = var142 + var82;
      var86 = var70 + var81;
      var87 = var152 + var80;
      var88 = var72 + var79;
      var89 = var73 + var78;
      var90 = var74 + var77;
      var91 = var172 + var76;
      var92 = (var68 - var212) * field33712;
      var93 = (var142 - var82) * field33713;
      var94 = (var70 - var81) * field33714;
      var95 = (var152 - var80) * field33715;
      var96 = (var72 - var79) * field33716;
      var97 = (var73 - var78) * field33717;
      var98 = (var74 - var77) * field33718;
      var99 = (var172 - var76) * field33719;
      var68 = var84 + var91;
      float var143 = var85 + var90;
      var70 = var86 + var89;
      float var153 = var87 + var88;
      var72 = (var84 - var91) * field33720;
      var73 = (var85 - var90) * field33721;
      var74 = (var86 - var89) * field33722;
      float var173 = (var87 - var88) * field33723;
      var76 = var92 + var99;
      var77 = var93 + var98;
      var78 = var94 + var97;
      var79 = var95 + var96;
      var80 = (var92 - var99) * field33720;
      var81 = (var93 - var98) * field33721;
      var82 = (var94 - var97) * field33722;
      float var213 = (var95 - var96) * field33723;
      var84 = var68 + var153;
      var85 = var143 + var70;
      var86 = (var68 - var153) * field33724;
      var87 = (var143 - var70) * field33725;
      var88 = var72 + var173;
      var89 = var73 + var74;
      var90 = (var72 - var173) * field33724;
      var91 = (var73 - var74) * field33725;
      var92 = var76 + var79;
      var93 = var77 + var78;
      var94 = (var76 - var79) * field33724;
      var95 = (var77 - var78) * field33725;
      var96 = var80 + var213;
      var97 = var81 + var82;
      var98 = (var80 - var213) * field33724;
      var99 = (var81 - var82) * field33725;
      var68 = var84 + var85;
      float var144 = (var84 - var85) * field33726;
      var70 = var86 + var87;
      float var154 = (var86 - var87) * field33726;
      var72 = var88 + var89;
      var73 = (var88 - var89) * field33726;
      var74 = var90 + var91;
      float var174 = (var90 - var91) * field33726;
      var76 = var92 + var93;
      var77 = (var92 - var93) * field33726;
      var78 = var94 + var95;
      var79 = (var94 - var95) * field33726;
      var80 = var96 + var97;
      var81 = (var96 - var97) * field33726;
      var82 = var98 + var99;
      float var214 = (var98 - var99) * field33726;
      var29 = (var23 = (var21 = var214 + var174) + var79) + var73 + var81;
      var27 = (var25 = var214 + var79 + var154) + var81;
      var18 = -(var33 = (var100 = var81 + var214 + var77) + var144) - var82;
      var16 = -(var31 = var100 + var73 + var174) - var74 - var82;
      var12 = (var100 = -var78 - var79 - var82 - var214) - var81 - var70 - var154;
      var14 = var100 - var81 - var73 - var74 - var174;
      var10 = var100 - var80 - var70 - var154;
      float var101;
      var8 = var100 - var80 - (var101 = var72 + var74 + var174);
      var4 = (var100 = -var76 - var80 - var82 - var214) - var68;
      var6 = var100 - var101;
      float[] var102 = this.field33688;
      int var103 = this.field33689;
      var102[0 + var103] = var69;
      var102[16 + var103] = var33;
      var102[32 + var103] = var32;
      var102[48 + var103] = var31;
      var102[64 + var103] = var30;
      var102[80 + var103] = var29;
      var102[96 + var103] = var28;
      var102[112 + var103] = var27;
      var102[128 + var103] = var71;
      var102[144 + var103] = var25;
      var102[160 + var103] = var24;
      var102[176 + var103] = var23;
      var102[192 + var103] = var75;
      var102[208 + var103] = var21;
      var102[224 + var103] = var83;
      var102[240 + var103] = var214;
      var102[256 + var103] = 0.0F;
      var102[272 + var103] = -var214;
      var102[288 + var103] = -var83;
      var102[304 + var103] = -var21;
      var102[320 + var103] = -var75;
      var102[336 + var103] = -var23;
      var102[352 + var103] = -var24;
      var102[368 + var103] = -var25;
      var102[384 + var103] = -var71;
      var102[400 + var103] = -var27;
      var102[416 + var103] = -var28;
      var102[432 + var103] = -var29;
      var102[448 + var103] = -var30;
      var102[464 + var103] = -var31;
      var102[480 + var103] = -var32;
      var102[496 + var103] = -var33;
      var102 = this.field33688 != this.field33686 ? this.field33686 : this.field33687;
      var102[0 + var103] = -var69;
      var102[16 + var103] = var18;
      var102[32 + var103] = var17;
      var102[48 + var103] = var16;
      var102[64 + var103] = var15;
      var102[80 + var103] = var14;
      var102[96 + var103] = var13;
      var102[112 + var103] = var12;
      var102[128 + var103] = var11;
      var102[144 + var103] = var10;
      var102[160 + var103] = var9;
      var102[176 + var103] = var8;
      var102[192 + var103] = var7;
      var102[208 + var103] = var6;
      var102[224 + var103] = var5;
      var102[240 + var103] = var4;
      var102[256 + var103] = var3;
      var102[272 + var103] = var4;
      var102[288 + var103] = var5;
      var102[304 + var103] = var6;
      var102[320 + var103] = var7;
      var102[336 + var103] = var8;
      var102[352 + var103] = var9;
      var102[368 + var103] = var10;
      var102[384 + var103] = var11;
      var102[400 + var103] = var12;
      var102[416 + var103] = var13;
      var102[432 + var103] = var14;
      var102[448 + var103] = var15;
      var102[464 + var103] = var16;
      var102[480 + var103] = var17;
      var102[496 + var103] = var18;
   }

   private void method26368() {
      float[] var3 = new float[32];
      float[] var4 = new float[16];
      float[] var5 = new float[16];

      for (int var6 = 31; var6 >= 0; var6--) {
         var3[var6] = 0.0F;
      }

      float[] var10 = this.field33690;
      var4[0] = var10[0] + var10[31];
      var4[1] = var10[1] + var10[30];
      var4[2] = var10[2] + var10[29];
      var4[3] = var10[3] + var10[28];
      var4[4] = var10[4] + var10[27];
      var4[5] = var10[5] + var10[26];
      var4[6] = var10[6] + var10[25];
      var4[7] = var10[7] + var10[24];
      var4[8] = var10[8] + var10[23];
      var4[9] = var10[9] + var10[22];
      var4[10] = var10[10] + var10[21];
      var4[11] = var10[11] + var10[20];
      var4[12] = var10[12] + var10[19];
      var4[13] = var10[13] + var10[18];
      var4[14] = var10[14] + var10[17];
      var4[15] = var10[15] + var10[16];
      var5[0] = var4[0] + var4[15];
      var5[1] = var4[1] + var4[14];
      var5[2] = var4[2] + var4[13];
      var5[3] = var4[3] + var4[12];
      var5[4] = var4[4] + var4[11];
      var5[5] = var4[5] + var4[10];
      var5[6] = var4[6] + var4[9];
      var5[7] = var4[7] + var4[8];
      var5[8] = (var4[0] - var4[15]) * field33712;
      var5[9] = (var4[1] - var4[14]) * field33713;
      var5[10] = (var4[2] - var4[13]) * field33714;
      var5[11] = (var4[3] - var4[12]) * field33715;
      var5[12] = (var4[4] - var4[11]) * field33716;
      var5[13] = (var4[5] - var4[10]) * field33717;
      var5[14] = (var4[6] - var4[9]) * field33718;
      var5[15] = (var4[7] - var4[8]) * field33719;
      var4[0] = var5[0] + var5[7];
      var4[1] = var5[1] + var5[6];
      var4[2] = var5[2] + var5[5];
      var4[3] = var5[3] + var5[4];
      var4[4] = (var5[0] - var5[7]) * field33720;
      var4[5] = (var5[1] - var5[6]) * field33721;
      var4[6] = (var5[2] - var5[5]) * field33722;
      var4[7] = (var5[3] - var5[4]) * field33723;
      var4[8] = var5[8] + var5[15];
      var4[9] = var5[9] + var5[14];
      var4[10] = var5[10] + var5[13];
      var4[11] = var5[11] + var5[12];
      var4[12] = (var5[8] - var5[15]) * field33720;
      var4[13] = (var5[9] - var5[14]) * field33721;
      var4[14] = (var5[10] - var5[13]) * field33722;
      var4[15] = (var5[11] - var5[12]) * field33723;
      var5[0] = var4[0] + var4[3];
      var5[1] = var4[1] + var4[2];
      var5[2] = (var4[0] - var4[3]) * field33724;
      var5[3] = (var4[1] - var4[2]) * field33725;
      var5[4] = var4[4] + var4[7];
      var5[5] = var4[5] + var4[6];
      var5[6] = (var4[4] - var4[7]) * field33724;
      var5[7] = (var4[5] - var4[6]) * field33725;
      var5[8] = var4[8] + var4[11];
      var5[9] = var4[9] + var4[10];
      var5[10] = (var4[8] - var4[11]) * field33724;
      var5[11] = (var4[9] - var4[10]) * field33725;
      var5[12] = var4[12] + var4[15];
      var5[13] = var4[13] + var4[14];
      var5[14] = (var4[12] - var4[15]) * field33724;
      var5[15] = (var4[13] - var4[14]) * field33725;
      var4[0] = var5[0] + var5[1];
      var4[1] = (var5[0] - var5[1]) * field33726;
      var4[2] = var5[2] + var5[3];
      var4[3] = (var5[2] - var5[3]) * field33726;
      var4[4] = var5[4] + var5[5];
      var4[5] = (var5[4] - var5[5]) * field33726;
      var4[6] = var5[6] + var5[7];
      var4[7] = (var5[6] - var5[7]) * field33726;
      var4[8] = var5[8] + var5[9];
      var4[9] = (var5[8] - var5[9]) * field33726;
      var4[10] = var5[10] + var5[11];
      var4[11] = (var5[10] - var5[11]) * field33726;
      var4[12] = var5[12] + var5[13];
      var4[13] = (var5[12] - var5[13]) * field33726;
      var4[14] = var5[14] + var5[15];
      var4[15] = (var5[14] - var5[15]) * field33726;
      var3[19] = -(var3[4] = (var3[12] = var4[7]) + var4[5]) - var4[6];
      var3[27] = -var4[6] - var4[7] - var4[4];
      var3[6] = (var3[10] = (var3[14] = var4[15]) + var4[11]) + var4[13];
      var3[17] = -(var3[2] = var4[15] + var4[13] + var4[9]) - var4[14];
      float var7;
      var3[21] = (var7 = -var4[14] - var4[15] - var4[10] - var4[11]) - var4[13];
      var3[29] = -var4[14] - var4[15] - var4[12] - var4[8];
      var3[25] = var7 - var4[12];
      var3[31] = -var4[0];
      var3[0] = var4[1];
      var3[23] = -(var3[8] = var4[3]) - var4[2];
      var4[0] = (var10[0] - var10[31]) * field33696;
      var4[1] = (var10[1] - var10[30]) * field33697;
      var4[2] = (var10[2] - var10[29]) * field33698;
      var4[3] = (var10[3] - var10[28]) * field33699;
      var4[4] = (var10[4] - var10[27]) * field33700;
      var4[5] = (var10[5] - var10[26]) * field33701;
      var4[6] = (var10[6] - var10[25]) * field33702;
      var4[7] = (var10[7] - var10[24]) * field33703;
      var4[8] = (var10[8] - var10[23]) * field33704;
      var4[9] = (var10[9] - var10[22]) * field33705;
      var4[10] = (var10[10] - var10[21]) * field33706;
      var4[11] = (var10[11] - var10[20]) * field33707;
      var4[12] = (var10[12] - var10[19]) * field33708;
      var4[13] = (var10[13] - var10[18]) * field33709;
      var4[14] = (var10[14] - var10[17]) * field33710;
      var4[15] = (var10[15] - var10[16]) * field33711;
      var5[0] = var4[0] + var4[15];
      var5[1] = var4[1] + var4[14];
      var5[2] = var4[2] + var4[13];
      var5[3] = var4[3] + var4[12];
      var5[4] = var4[4] + var4[11];
      var5[5] = var4[5] + var4[10];
      var5[6] = var4[6] + var4[9];
      var5[7] = var4[7] + var4[8];
      var5[8] = (var4[0] - var4[15]) * field33712;
      var5[9] = (var4[1] - var4[14]) * field33713;
      var5[10] = (var4[2] - var4[13]) * field33714;
      var5[11] = (var4[3] - var4[12]) * field33715;
      var5[12] = (var4[4] - var4[11]) * field33716;
      var5[13] = (var4[5] - var4[10]) * field33717;
      var5[14] = (var4[6] - var4[9]) * field33718;
      var5[15] = (var4[7] - var4[8]) * field33719;
      var4[0] = var5[0] + var5[7];
      var4[1] = var5[1] + var5[6];
      var4[2] = var5[2] + var5[5];
      var4[3] = var5[3] + var5[4];
      var4[4] = (var5[0] - var5[7]) * field33720;
      var4[5] = (var5[1] - var5[6]) * field33721;
      var4[6] = (var5[2] - var5[5]) * field33722;
      var4[7] = (var5[3] - var5[4]) * field33723;
      var4[8] = var5[8] + var5[15];
      var4[9] = var5[9] + var5[14];
      var4[10] = var5[10] + var5[13];
      var4[11] = var5[11] + var5[12];
      var4[12] = (var5[8] - var5[15]) * field33720;
      var4[13] = (var5[9] - var5[14]) * field33721;
      var4[14] = (var5[10] - var5[13]) * field33722;
      var4[15] = (var5[11] - var5[12]) * field33723;
      var5[0] = var4[0] + var4[3];
      var5[1] = var4[1] + var4[2];
      var5[2] = (var4[0] - var4[3]) * field33724;
      var5[3] = (var4[1] - var4[2]) * field33725;
      var5[4] = var4[4] + var4[7];
      var5[5] = var4[5] + var4[6];
      var5[6] = (var4[4] - var4[7]) * field33724;
      var5[7] = (var4[5] - var4[6]) * field33725;
      var5[8] = var4[8] + var4[11];
      var5[9] = var4[9] + var4[10];
      var5[10] = (var4[8] - var4[11]) * field33724;
      var5[11] = (var4[9] - var4[10]) * field33725;
      var5[12] = var4[12] + var4[15];
      var5[13] = var4[13] + var4[14];
      var5[14] = (var4[12] - var4[15]) * field33724;
      var5[15] = (var4[13] - var4[14]) * field33725;
      var4[0] = var5[0] + var5[1];
      var4[1] = (var5[0] - var5[1]) * field33726;
      var4[2] = var5[2] + var5[3];
      var4[3] = (var5[2] - var5[3]) * field33726;
      var4[4] = var5[4] + var5[5];
      var4[5] = (var5[4] - var5[5]) * field33726;
      var4[6] = var5[6] + var5[7];
      var4[7] = (var5[6] - var5[7]) * field33726;
      var4[8] = var5[8] + var5[9];
      var4[9] = (var5[8] - var5[9]) * field33726;
      var4[10] = var5[10] + var5[11];
      var4[11] = (var5[10] - var5[11]) * field33726;
      var4[12] = var5[12] + var5[13];
      var4[13] = (var5[12] - var5[13]) * field33726;
      var4[14] = var5[14] + var5[15];
      var4[15] = (var5[14] - var5[15]) * field33726;
      var3[5] = (var3[11] = (var3[13] = (var3[15] = var4[15]) + var4[7]) + var4[11]) + var4[5] + var4[13];
      var3[7] = (var3[9] = var4[15] + var4[11] + var4[3]) + var4[13];
      var3[16] = -(var3[1] = (var7 = var4[13] + var4[15] + var4[9]) + var4[1]) - var4[14];
      var3[18] = -(var3[3] = var7 + var4[5] + var4[7]) - var4[6] - var4[14];
      var3[22] = (var7 = -var4[10] - var4[11] - var4[14] - var4[15]) - var4[13] - var4[2] - var4[3];
      var3[20] = var7 - var4[13] - var4[5] - var4[6] - var4[7];
      var3[24] = var7 - var4[12] - var4[2] - var4[3];
      float var8;
      var3[26] = var7 - var4[12] - (var8 = var4[4] + var4[6] + var4[7]);
      var3[30] = (var7 = -var4[8] - var4[12] - var4[14] - var4[15]) - var4[0];
      var3[28] = var7 - var8;
      float[] var9 = this.field33688;
      var9[0 + this.field33689] = var3[0];
      var9[16 + this.field33689] = var3[1];
      var9[32 + this.field33689] = var3[2];
      var9[48 + this.field33689] = var3[3];
      var9[64 + this.field33689] = var3[4];
      var9[80 + this.field33689] = var3[5];
      var9[96 + this.field33689] = var3[6];
      var9[112 + this.field33689] = var3[7];
      var9[128 + this.field33689] = var3[8];
      var9[144 + this.field33689] = var3[9];
      var9[160 + this.field33689] = var3[10];
      var9[176 + this.field33689] = var3[11];
      var9[192 + this.field33689] = var3[12];
      var9[208 + this.field33689] = var3[13];
      var9[224 + this.field33689] = var3[14];
      var9[240 + this.field33689] = var3[15];
      var9[256 + this.field33689] = 0.0F;
      var9[272 + this.field33689] = -var3[15];
      var9[288 + this.field33689] = -var3[14];
      var9[304 + this.field33689] = -var3[13];
      var9[320 + this.field33689] = -var3[12];
      var9[336 + this.field33689] = -var3[11];
      var9[352 + this.field33689] = -var3[10];
      var9[368 + this.field33689] = -var3[9];
      var9[384 + this.field33689] = -var3[8];
      var9[400 + this.field33689] = -var3[7];
      var9[416 + this.field33689] = -var3[6];
      var9[432 + this.field33689] = -var3[5];
      var9[448 + this.field33689] = -var3[4];
      var9[464 + this.field33689] = -var3[3];
      var9[480 + this.field33689] = -var3[2];
      var9[496 + this.field33689] = -var3[1];
   }

   private void method26369(Class6748 var1) {
      float[] var4 = this.field33688;
      float[] var5 = this.field33694;
      byte var6 = 0;

      for (int var7 = 0; var7 < 32; var7++) {
         float[] var8 = field33728[var7];
         float var9 = (
               var4[0 + var6] * var8[0]
                  + var4[15 + var6] * var8[1]
                  + var4[14 + var6] * var8[2]
                  + var4[13 + var6] * var8[3]
                  + var4[12 + var6] * var8[4]
                  + var4[11 + var6] * var8[5]
                  + var4[10 + var6] * var8[6]
                  + var4[9 + var6] * var8[7]
                  + var4[8 + var6] * var8[8]
                  + var4[7 + var6] * var8[9]
                  + var4[6 + var6] * var8[10]
                  + var4[5 + var6] * var8[11]
                  + var4[4 + var6] * var8[12]
                  + var4[3 + var6] * var8[13]
                  + var4[2 + var6] * var8[14]
                  + var4[1 + var6] * var8[15]
            )
            * this.field33692;
         var5[var7] = var9;
         var6 += 16;
      }
   }

   private void method26370(Class6748 var1) {
      float[] var4 = this.field33688;
      float[] var5 = this.field33694;
      byte var6 = 0;

      for (int var7 = 0; var7 < 32; var7++) {
         float[] var8 = field33728[var7];
         float var9 = (
               var4[1 + var6] * var8[0]
                  + var4[0 + var6] * var8[1]
                  + var4[15 + var6] * var8[2]
                  + var4[14 + var6] * var8[3]
                  + var4[13 + var6] * var8[4]
                  + var4[12 + var6] * var8[5]
                  + var4[11 + var6] * var8[6]
                  + var4[10 + var6] * var8[7]
                  + var4[9 + var6] * var8[8]
                  + var4[8 + var6] * var8[9]
                  + var4[7 + var6] * var8[10]
                  + var4[6 + var6] * var8[11]
                  + var4[5 + var6] * var8[12]
                  + var4[4 + var6] * var8[13]
                  + var4[3 + var6] * var8[14]
                  + var4[2 + var6] * var8[15]
            )
            * this.field33692;
         var5[var7] = var9;
         var6 += 16;
      }
   }

   private void method26371(Class6748 var1) {
      float[] var4 = this.field33688;
      float[] var5 = this.field33694;
      byte var6 = 0;

      for (int var7 = 0; var7 < 32; var7++) {
         float[] var8 = field33728[var7];
         float var9 = (
               var4[2 + var6] * var8[0]
                  + var4[1 + var6] * var8[1]
                  + var4[0 + var6] * var8[2]
                  + var4[15 + var6] * var8[3]
                  + var4[14 + var6] * var8[4]
                  + var4[13 + var6] * var8[5]
                  + var4[12 + var6] * var8[6]
                  + var4[11 + var6] * var8[7]
                  + var4[10 + var6] * var8[8]
                  + var4[9 + var6] * var8[9]
                  + var4[8 + var6] * var8[10]
                  + var4[7 + var6] * var8[11]
                  + var4[6 + var6] * var8[12]
                  + var4[5 + var6] * var8[13]
                  + var4[4 + var6] * var8[14]
                  + var4[3 + var6] * var8[15]
            )
            * this.field33692;
         var5[var7] = var9;
         var6 += 16;
      }
   }

   private void method26372(Class6748 var1) {
      float[] var4 = this.field33688;
      boolean var5 = false;
      float[] var6 = this.field33694;
      byte var7 = 0;

      for (int var8 = 0; var8 < 32; var8++) {
         float[] var9 = field33728[var8];
         float var10 = (
               var4[3 + var7] * var9[0]
                  + var4[2 + var7] * var9[1]
                  + var4[1 + var7] * var9[2]
                  + var4[0 + var7] * var9[3]
                  + var4[15 + var7] * var9[4]
                  + var4[14 + var7] * var9[5]
                  + var4[13 + var7] * var9[6]
                  + var4[12 + var7] * var9[7]
                  + var4[11 + var7] * var9[8]
                  + var4[10 + var7] * var9[9]
                  + var4[9 + var7] * var9[10]
                  + var4[8 + var7] * var9[11]
                  + var4[7 + var7] * var9[12]
                  + var4[6 + var7] * var9[13]
                  + var4[5 + var7] * var9[14]
                  + var4[4 + var7] * var9[15]
            )
            * this.field33692;
         var6[var8] = var10;
         var7 += 16;
      }
   }

   private void method26373(Class6748 var1) {
      float[] var4 = this.field33688;
      float[] var5 = this.field33694;
      byte var6 = 0;

      for (int var7 = 0; var7 < 32; var7++) {
         float[] var8 = field33728[var7];
         float var9 = (
               var4[4 + var6] * var8[0]
                  + var4[3 + var6] * var8[1]
                  + var4[2 + var6] * var8[2]
                  + var4[1 + var6] * var8[3]
                  + var4[0 + var6] * var8[4]
                  + var4[15 + var6] * var8[5]
                  + var4[14 + var6] * var8[6]
                  + var4[13 + var6] * var8[7]
                  + var4[12 + var6] * var8[8]
                  + var4[11 + var6] * var8[9]
                  + var4[10 + var6] * var8[10]
                  + var4[9 + var6] * var8[11]
                  + var4[8 + var6] * var8[12]
                  + var4[7 + var6] * var8[13]
                  + var4[6 + var6] * var8[14]
                  + var4[5 + var6] * var8[15]
            )
            * this.field33692;
         var5[var7] = var9;
         var6 += 16;
      }
   }

   private void method26374(Class6748 var1) {
      float[] var4 = this.field33688;
      float[] var5 = this.field33694;
      byte var6 = 0;

      for (int var7 = 0; var7 < 32; var7++) {
         float[] var8 = field33728[var7];
         float var9 = (
               var4[5 + var6] * var8[0]
                  + var4[4 + var6] * var8[1]
                  + var4[3 + var6] * var8[2]
                  + var4[2 + var6] * var8[3]
                  + var4[1 + var6] * var8[4]
                  + var4[0 + var6] * var8[5]
                  + var4[15 + var6] * var8[6]
                  + var4[14 + var6] * var8[7]
                  + var4[13 + var6] * var8[8]
                  + var4[12 + var6] * var8[9]
                  + var4[11 + var6] * var8[10]
                  + var4[10 + var6] * var8[11]
                  + var4[9 + var6] * var8[12]
                  + var4[8 + var6] * var8[13]
                  + var4[7 + var6] * var8[14]
                  + var4[6 + var6] * var8[15]
            )
            * this.field33692;
         var5[var7] = var9;
         var6 += 16;
      }
   }

   private void method26375(Class6748 var1) {
      float[] var4 = this.field33688;
      float[] var5 = this.field33694;
      byte var6 = 0;

      for (int var7 = 0; var7 < 32; var7++) {
         float[] var8 = field33728[var7];
         float var9 = (
               var4[6 + var6] * var8[0]
                  + var4[5 + var6] * var8[1]
                  + var4[4 + var6] * var8[2]
                  + var4[3 + var6] * var8[3]
                  + var4[2 + var6] * var8[4]
                  + var4[1 + var6] * var8[5]
                  + var4[0 + var6] * var8[6]
                  + var4[15 + var6] * var8[7]
                  + var4[14 + var6] * var8[8]
                  + var4[13 + var6] * var8[9]
                  + var4[12 + var6] * var8[10]
                  + var4[11 + var6] * var8[11]
                  + var4[10 + var6] * var8[12]
                  + var4[9 + var6] * var8[13]
                  + var4[8 + var6] * var8[14]
                  + var4[7 + var6] * var8[15]
            )
            * this.field33692;
         var5[var7] = var9;
         var6 += 16;
      }
   }

   private void method26376(Class6748 var1) {
      float[] var4 = this.field33688;
      float[] var5 = this.field33694;
      byte var6 = 0;

      for (int var7 = 0; var7 < 32; var7++) {
         float[] var8 = field33728[var7];
         float var9 = (
               var4[7 + var6] * var8[0]
                  + var4[6 + var6] * var8[1]
                  + var4[5 + var6] * var8[2]
                  + var4[4 + var6] * var8[3]
                  + var4[3 + var6] * var8[4]
                  + var4[2 + var6] * var8[5]
                  + var4[1 + var6] * var8[6]
                  + var4[0 + var6] * var8[7]
                  + var4[15 + var6] * var8[8]
                  + var4[14 + var6] * var8[9]
                  + var4[13 + var6] * var8[10]
                  + var4[12 + var6] * var8[11]
                  + var4[11 + var6] * var8[12]
                  + var4[10 + var6] * var8[13]
                  + var4[9 + var6] * var8[14]
                  + var4[8 + var6] * var8[15]
            )
            * this.field33692;
         var5[var7] = var9;
         var6 += 16;
      }
   }

   private void method26377(Class6748 var1) {
      float[] var4 = this.field33688;
      float[] var5 = this.field33694;
      byte var6 = 0;

      for (int var7 = 0; var7 < 32; var7++) {
         float[] var8 = field33728[var7];
         float var9 = (
               var4[8 + var6] * var8[0]
                  + var4[7 + var6] * var8[1]
                  + var4[6 + var6] * var8[2]
                  + var4[5 + var6] * var8[3]
                  + var4[4 + var6] * var8[4]
                  + var4[3 + var6] * var8[5]
                  + var4[2 + var6] * var8[6]
                  + var4[1 + var6] * var8[7]
                  + var4[0 + var6] * var8[8]
                  + var4[15 + var6] * var8[9]
                  + var4[14 + var6] * var8[10]
                  + var4[13 + var6] * var8[11]
                  + var4[12 + var6] * var8[12]
                  + var4[11 + var6] * var8[13]
                  + var4[10 + var6] * var8[14]
                  + var4[9 + var6] * var8[15]
            )
            * this.field33692;
         var5[var7] = var9;
         var6 += 16;
      }
   }

   private void method26378(Class6748 var1) {
      float[] var4 = this.field33688;
      float[] var5 = this.field33694;
      byte var6 = 0;

      for (int var7 = 0; var7 < 32; var7++) {
         float[] var8 = field33728[var7];
         float var9 = (
               var4[9 + var6] * var8[0]
                  + var4[8 + var6] * var8[1]
                  + var4[7 + var6] * var8[2]
                  + var4[6 + var6] * var8[3]
                  + var4[5 + var6] * var8[4]
                  + var4[4 + var6] * var8[5]
                  + var4[3 + var6] * var8[6]
                  + var4[2 + var6] * var8[7]
                  + var4[1 + var6] * var8[8]
                  + var4[0 + var6] * var8[9]
                  + var4[15 + var6] * var8[10]
                  + var4[14 + var6] * var8[11]
                  + var4[13 + var6] * var8[12]
                  + var4[12 + var6] * var8[13]
                  + var4[11 + var6] * var8[14]
                  + var4[10 + var6] * var8[15]
            )
            * this.field33692;
         var5[var7] = var9;
         var6 += 16;
      }
   }

   private void method26379(Class6748 var1) {
      float[] var4 = this.field33688;
      float[] var5 = this.field33694;
      byte var6 = 0;

      for (int var7 = 0; var7 < 32; var7++) {
         float[] var8 = field33728[var7];
         float var9 = (
               var4[10 + var6] * var8[0]
                  + var4[9 + var6] * var8[1]
                  + var4[8 + var6] * var8[2]
                  + var4[7 + var6] * var8[3]
                  + var4[6 + var6] * var8[4]
                  + var4[5 + var6] * var8[5]
                  + var4[4 + var6] * var8[6]
                  + var4[3 + var6] * var8[7]
                  + var4[2 + var6] * var8[8]
                  + var4[1 + var6] * var8[9]
                  + var4[0 + var6] * var8[10]
                  + var4[15 + var6] * var8[11]
                  + var4[14 + var6] * var8[12]
                  + var4[13 + var6] * var8[13]
                  + var4[12 + var6] * var8[14]
                  + var4[11 + var6] * var8[15]
            )
            * this.field33692;
         var5[var7] = var9;
         var6 += 16;
      }
   }

   private void method26380(Class6748 var1) {
      float[] var4 = this.field33688;
      float[] var5 = this.field33694;
      byte var6 = 0;

      for (int var7 = 0; var7 < 32; var7++) {
         float[] var8 = field33728[var7];
         float var9 = (
               var4[11 + var6] * var8[0]
                  + var4[10 + var6] * var8[1]
                  + var4[9 + var6] * var8[2]
                  + var4[8 + var6] * var8[3]
                  + var4[7 + var6] * var8[4]
                  + var4[6 + var6] * var8[5]
                  + var4[5 + var6] * var8[6]
                  + var4[4 + var6] * var8[7]
                  + var4[3 + var6] * var8[8]
                  + var4[2 + var6] * var8[9]
                  + var4[1 + var6] * var8[10]
                  + var4[0 + var6] * var8[11]
                  + var4[15 + var6] * var8[12]
                  + var4[14 + var6] * var8[13]
                  + var4[13 + var6] * var8[14]
                  + var4[12 + var6] * var8[15]
            )
            * this.field33692;
         var5[var7] = var9;
         var6 += 16;
      }
   }

   private void method26381(Class6748 var1) {
      float[] var4 = this.field33688;
      float[] var5 = this.field33694;
      byte var6 = 0;

      for (int var7 = 0; var7 < 32; var7++) {
         float[] var8 = field33728[var7];
         float var9 = (
               var4[12 + var6] * var8[0]
                  + var4[11 + var6] * var8[1]
                  + var4[10 + var6] * var8[2]
                  + var4[9 + var6] * var8[3]
                  + var4[8 + var6] * var8[4]
                  + var4[7 + var6] * var8[5]
                  + var4[6 + var6] * var8[6]
                  + var4[5 + var6] * var8[7]
                  + var4[4 + var6] * var8[8]
                  + var4[3 + var6] * var8[9]
                  + var4[2 + var6] * var8[10]
                  + var4[1 + var6] * var8[11]
                  + var4[0 + var6] * var8[12]
                  + var4[15 + var6] * var8[13]
                  + var4[14 + var6] * var8[14]
                  + var4[13 + var6] * var8[15]
            )
            * this.field33692;
         var5[var7] = var9;
         var6 += 16;
      }
   }

   private void method26382(Class6748 var1) {
      float[] var4 = this.field33688;
      float[] var5 = this.field33694;
      byte var6 = 0;

      for (int var7 = 0; var7 < 32; var7++) {
         float[] var8 = field33728[var7];
         float var9 = (
               var4[13 + var6] * var8[0]
                  + var4[12 + var6] * var8[1]
                  + var4[11 + var6] * var8[2]
                  + var4[10 + var6] * var8[3]
                  + var4[9 + var6] * var8[4]
                  + var4[8 + var6] * var8[5]
                  + var4[7 + var6] * var8[6]
                  + var4[6 + var6] * var8[7]
                  + var4[5 + var6] * var8[8]
                  + var4[4 + var6] * var8[9]
                  + var4[3 + var6] * var8[10]
                  + var4[2 + var6] * var8[11]
                  + var4[1 + var6] * var8[12]
                  + var4[0 + var6] * var8[13]
                  + var4[15 + var6] * var8[14]
                  + var4[14 + var6] * var8[15]
            )
            * this.field33692;
         var5[var7] = var9;
         var6 += 16;
      }
   }

   private void method26383(Class6748 var1) {
      float[] var4 = this.field33688;
      float[] var5 = this.field33694;
      byte var6 = 0;

      for (int var7 = 0; var7 < 32; var7++) {
         float[] var8 = field33728[var7];
         float var9 = (
               var4[14 + var6] * var8[0]
                  + var4[13 + var6] * var8[1]
                  + var4[12 + var6] * var8[2]
                  + var4[11 + var6] * var8[3]
                  + var4[10 + var6] * var8[4]
                  + var4[9 + var6] * var8[5]
                  + var4[8 + var6] * var8[6]
                  + var4[7 + var6] * var8[7]
                  + var4[6 + var6] * var8[8]
                  + var4[5 + var6] * var8[9]
                  + var4[4 + var6] * var8[10]
                  + var4[3 + var6] * var8[11]
                  + var4[2 + var6] * var8[12]
                  + var4[1 + var6] * var8[13]
                  + var4[0 + var6] * var8[14]
                  + var4[15 + var6] * var8[15]
            )
            * this.field33692;
         var5[var7] = var9;
         var6 += 16;
      }
   }

   private void method26384(Class6748 var1) {
      float[] var4 = this.field33688;
      float[] var5 = this.field33694;
      byte var6 = 0;

      for (int var7 = 0; var7 < 32; var7++) {
         float[] var8 = field33728[var7];
         float var9 = (
               var4[15 + var6] * var8[0]
                  + var4[14 + var6] * var8[1]
                  + var4[13 + var6] * var8[2]
                  + var4[12 + var6] * var8[3]
                  + var4[11 + var6] * var8[4]
                  + var4[10 + var6] * var8[5]
                  + var4[9 + var6] * var8[6]
                  + var4[8 + var6] * var8[7]
                  + var4[7 + var6] * var8[8]
                  + var4[6 + var6] * var8[9]
                  + var4[5 + var6] * var8[10]
                  + var4[4 + var6] * var8[11]
                  + var4[3 + var6] * var8[12]
                  + var4[2 + var6] * var8[13]
                  + var4[1 + var6] * var8[14]
                  + var4[0 + var6] * var8[15]
            )
            * this.field33692;
         var5[var7] = var9;
         var6 += 16;
      }
   }

   private void method26385(Class6748 var1) {
      switch (this.field33689) {
         case 0:
            this.method26369(var1);
            break;
         case 1:
            this.method26370(var1);
            break;
         case 2:
            this.method26371(var1);
            break;
         case 3:
            this.method26372(var1);
            break;
         case 4:
            this.method26373(var1);
            break;
         case 5:
            this.method26374(var1);
            break;
         case 6:
            this.method26375(var1);
            break;
         case 7:
            this.method26376(var1);
            break;
         case 8:
            this.method26377(var1);
            break;
         case 9:
            this.method26378(var1);
            break;
         case 10:
            this.method26379(var1);
            break;
         case 11:
            this.method26380(var1);
            break;
         case 12:
            this.method26381(var1);
            break;
         case 13:
            this.method26382(var1);
            break;
         case 14:
            this.method26383(var1);
            break;
         case 15:
            this.method26384(var1);
      }

      if (var1 != null) {
         var1.method20566(this.field33691, this.field33694);
      }
   }

   public void method26386(Class6748 var1) {
      this.method26367();
      this.method26385(var1);
      this.field33689 = this.field33689 + 1 & 15;
      this.field33688 = this.field33688 != this.field33686 ? this.field33686 : this.field33687;

      for (int var4 = 0; var4 < 32; var4++) {
         this.field33690[var4] = 0.0F;
      }
   }

   private static float[] method26387() {
      String var2 = "0,-0.000442504999227821826934814453125,0.0032501220703125,-0.0070037841796875,0.0310821533203125,-0.0786285400390625,0.100311279296875,-0.5720367431640625,1.144989013671875,0.5720367431640625,0.100311279296875,0.0786285400390625,0.0310821533203125,0.0070037841796875,0.0032501220703125,0.000442504999227821826934814453125,-0.0000152590000652708113193511962890625,-0.0004730219952762126922607421875,0.003326416015625,-0.007919312454760074615478515625,0.030517578125,-0.0841827392578125,0.0909271240234375,-0.6002197265625,1.144287109375,0.5438232421875,0.108856201171875,0.07305908203125,0.0314788818359375,0.0061187739484012126922607421875,0.00317382789216935634613037109375,0.00039672901039011776447296142578125,-0.0000152590000652708113193511962890625,-0.0005340580246411263942718505859375,0.00338745093904435634613037109375,-0.0088653564453125,0.02978515625,-0.0897064208984375,0.0806884765625,-0.6282958984375,1.1422119140625,0.5156097412109375,0.1165771484375,0.0675201416015625,0.03173828125,0.0052947998046875,0.0030822749249637126922607421875,0.0003662109957076609134674072265625,-0.0000152590000652708113193511962890625,-0.000579833984375,0.0034332280047237873077392578125,-0.0098419189453125,0.0288848876953125,-0.0951690673828125,0.0695953369140625,-0.656219482421875,1.138763427734375,0.4874725341796875,0.12347412109375,0.0619964599609375,0.0318450927734375,0.004486083984375,0.00299072288908064365386962890625,0.00032043500686995685100555419921875,-0.0000152590000652708113193511962890625,-0.000625610002316534519195556640625,0.00346374488435685634613037109375,-0.0108489990234375,0.027801513671875,-0.1005401611328125,0.0576171875,-0.6839141845703125,1.1339263916015625,0.45947265625,0.12957763671875,0.0565338134765625,0.0318145751953125,0.0037231449969112873077392578125,0.002899169921875,0.0002899169921875,-0.0000152590000652708113193511962890625,-0.0006866459734737873077392578125,0.00347900390625,-0.0118865966796875,0.0265350341796875,-0.1058197021484375,0.0447845458984375,-0.7113189697265625,1.12774658203125,0.4316558837890625,0.1348876953125,0.0511322021484375,0.0316619873046875,0.0030059809796512126922607421875,0.0027923579327762126922607421875,0.0002593990066088736057281494140625,-0.0000152590000652708113193511962890625,-0.000747681013308465480804443359375,0.00347900390625,-0.012939453125,0.02508544921875,-0.1109466552734375,0.0310821533203125,-0.738372802734375,1.1202239990234375,0.404083251953125,0.1394500732421875,0.04583740234375,0.0313873291015625,0.00233459495939314365386962890625,0.00268554710783064365386962890625,0.00024414100334979593753814697265625,-0.000030518000130541622638702392578125,-0.0008087159949354827404022216796875,0.00346374488435685634613037109375,-0.0140228271484375,0.0234222412109375,-0.1159210205078125,0.016510009765625,-0.7650299072265625,1.1113739013671875,0.376800537109375,0.1432647705078125,0.0406341552734375,0.031005859375,0.0016937260515987873077392578125,0.0025787348859012126922607421875,0.000213623003219254314899444580078125,-0.000030518000130541622638702392578125,-0.00088500999845564365386962890625,0.00341796898283064365386962890625,-0.0151214599609375,0.021575927734375,-0.120697021484375,0.00106811500154435634613037109375,-0.7912139892578125,1.1012115478515625,0.3498687744140625,0.1463623046875,0.035552978515625,0.0305328369140625,0.00109863304533064365386962890625,0.0024566650390625,0.00019836399587802588939666748046875,-0.000030518000130541622638702392578125,-0.0009613040019758045673370361328125,0.0033721919171512126922607421875,-0.0162353515625,0.01953125,-0.1252593994140625,-0.015228270553052425384521484375,-0.816864013671875,1.08978271484375,0.3233184814453125,0.148773193359375,0.030609130859375,0.029937744140625,0.0005493159987963736057281494140625,0.0023498539812862873077392578125,0.00016784699982963502407073974609375,-0.000030518000130541622638702392578125,-0.001037598005495965480804443359375,0.0032806401140987873077392578125,-0.0173492431640625,0.0172576904296875,-0.1295623779296875,-0.032379150390625,-0.841949462890625,1.077117919921875,0.297210693359375,0.1504974365234375,0.02581787109375,0.0292816162109375,0.000030518000130541622638702392578125,0.0022430419921875,0.000152588007040321826934814453125,-0.00004577599975164048373699188232421875,-0.001113891950808465480804443359375,0.00317382789216935634613037109375,-0.018463134765625,0.014801025390625,-0.1335906982421875,-0.05035400390625,-0.866363525390625,1.0632171630859375,0.2715911865234375,0.1515960693359375,0.02117919921875,0.028533935546875,-0.000442504999227821826934814453125,0.00212097191251814365386962890625,0.000137328999699093401432037353515625,-0.00004577599975164048373699188232421875,-0.001205443986691534519195556640625,0.00305175804533064365386962890625,-0.0195770263671875,0.012115479446947574615478515625,-0.137298583984375,-0.0691680908203125,-0.8900909423828125,1.04815673828125,0.2465057373046875,0.152069091796875,0.0167083740234375,0.0277252197265625,-0.0008697509765625,0.00201415992341935634613037109375,0.0001220699996338225901126861572265625,-0.00006103499981691129505634307861328125,-0.001296996953897178173065185546875,0.00288391089998185634613037109375,-0.02069091796875,0.0092315673828125,-0.1406707763671875,-0.088775634765625,-0.913055419921875,1.0319366455078125,0.22198486328125,0.1519622802734375,0.012420654296875,0.0268402099609375,-0.0012664790265262126922607421875,0.001907348982058465480804443359375,0.0001068119963747449219226837158203125,-0.00006103499981691129505634307861328125,-0.00138855003751814365386962890625,0.00270080589689314365386962890625,-0.02178955078125,0.006134033203125,-0.1436767578125,-0.109161376953125,-0.9351959228515625,1.014617919921875,0.19805908203125,0.15130615234375,0.0083160400390625,0.025909423828125,-0.001617431989870965480804443359375,0.001785277971066534519195556640625,0.0001068119963747449219226837158203125,-0.0000762940035201609134674072265625,-0.0014801030047237873077392578125,0.0024871830828487873077392578125,-0.022857666015625,0.0028228759765625,-0.1462554931640625,-0.13031005859375,-0.95648193359375,0.996246337890625,0.1747894287109375,0.150115966796875,0.0043945307843387126922607421875,0.024932861328125,-0.00193786597810685634613037109375,0.0016937260515987873077392578125,0.0000915530035854317247867584228515625,-0.0000762940035201609134674072265625,-0.001586913946084678173065185546875,0.00222778297029435634613037109375,-0.0239105224609375,-0.0006866459734737873077392578125,-0.1484222412109375,-0.1522064208984375,-0.9768524169921875,0.9768524169921875,0.1522064208984375,0.1484222412109375,0.0006866459734737873077392578125,0.0239105224609375,-0.00222778297029435634613037109375,0.001586913946084678173065185546875,0.0000762940035201609134674072265625,-0.0000915530035854317247867584228515625,-0.0016937260515987873077392578125,0.00193786597810685634613037109375,-0.024932861328125,-0.0043945307843387126922607421875,-0.150115966796875,-0.1747894287109375,-0.996246337890625,0.95648193359375,0.13031005859375,0.1462554931640625,-0.0028228759765625,0.022857666015625,-0.0024871830828487873077392578125,0.0014801030047237873077392578125,0.0000762940035201609134674072265625,-0.0001068119963747449219226837158203125,-0.001785277971066534519195556640625,0.001617431989870965480804443359375,-0.025909423828125,-0.0083160400390625,-0.15130615234375,-0.19805908203125,-1.014617919921875,0.9351959228515625,0.109161376953125,0.1436767578125,-0.006134033203125,0.02178955078125,-0.00270080589689314365386962890625,0.00138855003751814365386962890625,0.00006103499981691129505634307861328125,-0.0001068119963747449219226837158203125,-0.001907348982058465480804443359375,0.0012664790265262126922607421875,-0.0268402099609375,-0.012420654296875,-0.1519622802734375,-0.22198486328125,-1.0319366455078125,0.913055419921875,0.088775634765625,0.1406707763671875,-0.0092315673828125,0.02069091796875,-0.00288391089998185634613037109375,0.001296996953897178173065185546875,0.00006103499981691129505634307861328125,-0.0001220699996338225901126861572265625,-0.00201415992341935634613037109375,0.0008697509765625,-0.0277252197265625,-0.0167083740234375,-0.152069091796875,-0.2465057373046875,-1.04815673828125,0.8900909423828125,0.0691680908203125,0.137298583984375,-0.012115479446947574615478515625,0.0195770263671875,-0.00305175804533064365386962890625,0.001205443986691534519195556640625,0.00004577599975164048373699188232421875,-0.000137328999699093401432037353515625,-0.00212097191251814365386962890625,0.000442504999227821826934814453125,-0.028533935546875,-0.02117919921875,-0.1515960693359375,-0.2715911865234375,-1.0632171630859375,0.866363525390625,0.05035400390625,0.1335906982421875,-0.014801025390625,0.018463134765625,-0.00317382789216935634613037109375,0.001113891950808465480804443359375,0.00004577599975164048373699188232421875,-0.000152588007040321826934814453125,-0.0022430419921875,-0.000030518000130541622638702392578125,-0.0292816162109375,-0.02581787109375,-0.1504974365234375,-0.297210693359375,-1.077117919921875,0.841949462890625,0.032379150390625,0.1295623779296875,-0.0172576904296875,0.0173492431640625,-0.0032806401140987873077392578125,0.001037598005495965480804443359375,0.000030518000130541622638702392578125,-0.00016784699982963502407073974609375,-0.0023498539812862873077392578125,-0.0005493159987963736057281494140625,-0.029937744140625,-0.030609130859375,-0.148773193359375,-0.3233184814453125,-1.08978271484375,0.816864013671875,0.015228270553052425384521484375,0.1252593994140625,-0.01953125,0.0162353515625,-0.0033721919171512126922607421875,0.0009613040019758045673370361328125,0.000030518000130541622638702392578125,-0.00019836399587802588939666748046875,-0.0024566650390625,-0.00109863304533064365386962890625,-0.0305328369140625,-0.035552978515625,-0.1463623046875,-0.3498687744140625,-1.1012115478515625,0.7912139892578125,-0.00106811500154435634613037109375,0.120697021484375,-0.021575927734375,0.0151214599609375,-0.00341796898283064365386962890625,0.00088500999845564365386962890625,0.000030518000130541622638702392578125,-0.000213623003219254314899444580078125,-0.0025787348859012126922607421875,-0.0016937260515987873077392578125,-0.031005859375,-0.0406341552734375,-0.1432647705078125,-0.376800537109375,-1.1113739013671875,0.7650299072265625,-0.016510009765625,0.1159210205078125,-0.0234222412109375,0.0140228271484375,-0.00346374488435685634613037109375,0.0008087159949354827404022216796875,0.000030518000130541622638702392578125,-0.00024414100334979593753814697265625,-0.00268554710783064365386962890625,-0.00233459495939314365386962890625,-0.0313873291015625,-0.04583740234375,-0.1394500732421875,-0.404083251953125,-1.1202239990234375,0.738372802734375,-0.0310821533203125,0.1109466552734375,-0.02508544921875,0.012939453125,-0.00347900390625,0.000747681013308465480804443359375,0.0000152590000652708113193511962890625,-0.0002593990066088736057281494140625,-0.0027923579327762126922607421875,-0.0030059809796512126922607421875,-0.0316619873046875,-0.0511322021484375,-0.1348876953125,-0.4316558837890625,-1.12774658203125,0.7113189697265625,-0.0447845458984375,0.1058197021484375,-0.0265350341796875,0.0118865966796875,-0.00347900390625,0.0006866459734737873077392578125,0.0000152590000652708113193511962890625,-0.0002899169921875,-0.002899169921875,-0.0037231449969112873077392578125,-0.0318145751953125,-0.0565338134765625,-0.12957763671875,-0.45947265625,-1.1339263916015625,0.6839141845703125,-0.0576171875,0.1005401611328125,-0.027801513671875,0.0108489990234375,-0.00346374488435685634613037109375,0.000625610002316534519195556640625,0.0000152590000652708113193511962890625,-0.00032043500686995685100555419921875,-0.00299072288908064365386962890625,-0.004486083984375,-0.0318450927734375,-0.0619964599609375,-0.12347412109375,-0.4874725341796875,-1.138763427734375,0.656219482421875,-0.0695953369140625,0.0951690673828125,-0.0288848876953125,0.0098419189453125,-0.0034332280047237873077392578125,0.000579833984375,0.0000152590000652708113193511962890625,-0.0003662109957076609134674072265625,-0.0030822749249637126922607421875,-0.0052947998046875,-0.03173828125,-0.0675201416015625,-0.1165771484375,-0.5156097412109375,-1.1422119140625,0.6282958984375,-0.0806884765625,0.0897064208984375,-0.02978515625,0.0088653564453125,-0.00338745093904435634613037109375,0.0005340580246411263942718505859375,0.0000152590000652708113193511962890625,-0.00039672901039011776447296142578125,-0.00317382789216935634613037109375,-0.0061187739484012126922607421875,-0.0314788818359375,-0.07305908203125,-0.108856201171875,-0.5438232421875,-1.144287109375,0.6002197265625,-0.0909271240234375,0.0841827392578125,-0.030517578125,0.007919312454760074615478515625,-0.003326416015625,0.0004730219952762126922607421875,0.0000152590000652708113193511962890625";
      String[] var3 = var2.split(",");
      float[] var4 = new float[var3.length];

      for (int var5 = 0; var5 < var4.length; var5++) {
         var4[var5] = new BigDecimal(var3[var5]).floatValue();
      }

      return var4;
   }

   private static float[][] method26388(float[] var0, int var1) {
      int var4 = var0.length / var1;
      float[][] var5 = new float[var4][];

      for (int var6 = 0; var6 < var4; var6++) {
         var5[var6] = method26389(var0, var6 * var1, var1);
      }

      return var5;
   }

   private static float[] method26389(float[] var0, int var1, int var2) {
      if (var1 + var2 > var0.length) {
         var2 = var0.length - var1;
      }

      if (var2 < 0) {
         var2 = 0;
      }

      float[] var5 = new float[var2];

      for (int var6 = 0; var6 < var2; var6++) {
         var5[var6] = var0[var1 + var6];
      }

      return var5;
   }
}
