package mapped;

import java.util.Arrays;

public class Class7644 implements Class7642 {
   private static String[] field32728;
   private static final float[][] field32729 = new float[][]{
      {0.9999247F, -0.012271538F},
      {0.99932235F, -0.036807224F},
      {0.9981181F, -0.061320737F},
      {0.9963126F, -0.08579731F},
      {0.993907F, -0.110222206F},
      {0.99090266F, -0.1345807F},
      {0.9873014F, -0.15885815F},
      {0.9831055F, -0.18303989F},
      {0.9783174F, -0.20711137F},
      {0.97293997F, -0.2310581F},
      {0.96697646F, -0.25486565F},
      {0.9604305F, -0.2785197F},
      {0.953306F, -0.30200595F},
      {0.9456073F, -0.3253103F},
      {0.937339F, -0.34841868F},
      {0.9285061F, -0.3713172F},
      {0.9191139F, -0.39399204F},
      {0.909168F, -0.41642955F},
      {0.8986745F, -0.43861625F},
      {0.88763964F, -0.46053872F},
      {0.8760701F, -0.48218378F},
      {0.86397284F, -0.50353837F},
      {0.8513552F, -0.52458966F},
      {0.8382247F, -0.545325F},
      {0.8245893F, -0.5657318F},
      {0.81045717F, -0.58579785F},
      {0.7958369F, -0.60551107F},
      {0.7807372F, -0.6248595F},
      {0.76516724F, -0.64383155F},
      {0.7491364F, -0.6624158F},
      {0.7326543F, -0.680601F},
      {0.71573085F, -0.69837624F}
   };
   private float[] field32730;
   private int field32731;
   private final int field32732;

   public Class7644(int var1) {
      this.field32732 = var1;
      this.field32730 = new float[2 * var1 * 20];
      this.field32731 = 0;
   }

   public void method25109() {
      Arrays.fill(this.field32730, 0.0F);
   }

   public void method25110(Class6528 var1, float[][][] var2, float[] var3) {
      float[] var6 = new float[32];
      float[] var7 = new float[32];
      float var8 = 0.015625F;
      int var9 = 0;

      for (int var10 = 0; var10 < var1.field28728; var10++) {
         for (int var11 = 0; var11 < 32; var11++) {
            var6[var11] = var2[var10][var11][0] * field32729[var11][0] - var2[var10][var11][1] * field32729[var11][1];
            var7[var11] = var2[var10][var11][1] * field32729[var11][0] + var2[var10][var11][0] * field32729[var11][1];
            var6[var11] *= var8;
            var7[var11] *= var8;
         }

         this.method25112(var6, var6);
         this.method25113(var7, var7);

         for (int var12 = 0; var12 < 32; var12++) {
            this.field32730[this.field32731 + var12] = this.field32730[this.field32731 + 640 + var12] = -var6[var12] + var7[var12];
            this.field32730[this.field32731 + 63 - var12] = this.field32730[this.field32731 + 640 + 63 - var12] = var6[var12] + var7[var12];
         }

         for (int var13 = 0; var13 < 32; var13++) {
            var3[var9++] = this.field32730[this.field32731 + var13] * field32723[2 * var13]
               + this.field32730[this.field32731 + 96 + var13] * field32723[64 + 2 * var13]
               + this.field32730[this.field32731 + 128 + var13] * field32723[128 + 2 * var13]
               + this.field32730[this.field32731 + 224 + var13] * field32723[192 + 2 * var13]
               + this.field32730[this.field32731 + 256 + var13] * field32723[256 + 2 * var13]
               + this.field32730[this.field32731 + 352 + var13] * field32723[320 + 2 * var13]
               + this.field32730[this.field32731 + 384 + var13] * field32723[384 + 2 * var13]
               + this.field32730[this.field32731 + 480 + var13] * field32723[448 + 2 * var13]
               + this.field32730[this.field32731 + 512 + var13] * field32723[512 + 2 * var13]
               + this.field32730[this.field32731 + 608 + var13] * field32723[576 + 2 * var13];
         }

         this.field32731 -= 64;
         if (this.field32731 < 0) {
            this.field32731 = 576;
         }
      }
   }

   public void method25111(Class6528 var1, float[][][] var2, float[] var3) {
      float[] var6 = new float[32];
      float[] var7 = new float[32];
      float[] var8 = new float[32];
      float[] var9 = new float[32];
      float[] var10 = new float[32];
      float[] var11 = new float[32];
      float[] var12 = new float[32];
      float[] var13 = new float[32];
      float var14 = 0.015625F;
      int var15 = 0;

      for (int var16 = 0; var16 < var1.field28728; var16++) {
         float[][] var17 = var2[var16];
         var7[31] = var14 * var17[1][0];
         var6[0] = var14 * var17[0][0];
         var11[31] = var14 * var17[62][1];
         var10[0] = var14 * var17[63][1];

         for (int var18 = 1; var18 < 31; var18++) {
            var7[31 - var18] = var14 * var17[2 * var18 + 1][0];
            var6[var18] = var14 * var17[2 * var18][0];
            var11[31 - var18] = var14 * var17[63 - (2 * var18 + 1)][1];
            var10[var18] = var14 * var17[63 - 2 * var18][1];
         }

         var7[0] = var14 * var17[63][0];
         var6[31] = var14 * var17[62][0];
         var11[0] = var14 * var17[0][1];
         var10[31] = var14 * var17[1][1];
         Class6745.method20560(var6, var7, var8, var9);
         Class6745.method20560(var10, var11, var12, var13);
         int var19 = this.field32731;
         int var20 = var19 + 1280;

         for (int var21 = 0; var21 < 32; var21++) {
            this.field32730[var19 + 2 * var21] = this.field32730[var20 + 2 * var21] = var12[var21] - var8[var21];
            this.field32730[var19 + 127 - 2 * var21] = this.field32730[var20 + 127 - 2 * var21] = var12[var21] + var8[var21];
            this.field32730[var19 + 2 * var21 + 1] = this.field32730[var20 + 2 * var21 + 1] = var13[31 - var21] + var9[31 - var21];
            this.field32730[var19 + 127 - (2 * var21 + 1)] = this.field32730[var20 + 127 - (2 * var21 + 1)] = var13[31 - var21] - var9[31 - var21];
         }

         var19 = this.field32731;

         for (int var22 = 0; var22 < 64; var22++) {
            var3[var15++] = this.field32730[var19 + var22 + 0] * field32723[var22 + 0]
               + this.field32730[var19 + var22 + 192] * field32723[var22 + 64]
               + this.field32730[var19 + var22 + 256] * field32723[var22 + 128]
               + this.field32730[var19 + var22 + 448] * field32723[var22 + 192]
               + this.field32730[var19 + var22 + 512] * field32723[var22 + 256]
               + this.field32730[var19 + var22 + 704] * field32723[var22 + 320]
               + this.field32730[var19 + var22 + 768] * field32723[var22 + 384]
               + this.field32730[var19 + var22 + 960] * field32723[var22 + 448]
               + this.field32730[var19 + var22 + 1024] * field32723[var22 + 512]
               + this.field32730[var19 + var22 + 1216] * field32723[var22 + 576];
         }

         this.field32731 -= 128;
         if (this.field32731 < 0) {
            this.field32731 = 1152;
         }
      }
   }

   private void method25112(float[] var1, float[] var2) {
      float var5 = var2[15] - var2[16];
      float var6 = var2[15] + var2[16];
      float var7 = 0.70710677F * var6;
      float var8 = 0.70710677F * var5;
      float var9 = var2[8] - var2[23];
      float var10 = var2[8] + var2[23];
      float var11 = 0.70710677F * var10;
      float var12 = 0.70710677F * var9;
      float var13 = var2[12] - var2[19];
      float var14 = var2[12] + var2[19];
      float var15 = 0.70710677F * var14;
      float var16 = 0.70710677F * var13;
      float var17 = var2[11] - var2[20];
      float var18 = var2[11] + var2[20];
      float var19 = 0.70710677F * var18;
      float var20 = 0.70710677F * var17;
      float var21 = var2[14] - var2[17];
      float var22 = var2[14] + var2[17];
      float var23 = 0.70710677F * var22;
      float var24 = 0.70710677F * var21;
      float var25 = var2[9] - var2[22];
      float var26 = var2[9] + var2[22];
      float var27 = 0.70710677F * var26;
      float var28 = 0.70710677F * var25;
      float var29 = var2[13] - var2[18];
      float var30 = var2[13] + var2[18];
      float var31 = 0.70710677F * var30;
      float var32 = 0.70710677F * var29;
      float var33 = var2[10] - var2[21];
      float var34 = var2[10] + var2[21];
      float var35 = 0.70710677F * var34;
      float var36 = 0.70710677F * var33;
      float var37 = var2[0] - var7;
      float var38 = var2[0] + var7;
      float var39 = var2[31] - var8;
      float var40 = var2[31] + var8;
      float var41 = var2[7] - var11;
      float var42 = var2[7] + var11;
      float var43 = var2[24] - var12;
      float var44 = var2[24] + var12;
      float var45 = var2[3] - var15;
      float var46 = var2[3] + var15;
      float var47 = var2[28] - var16;
      float var48 = var2[28] + var16;
      float var49 = var2[4] - var19;
      float var50 = var2[4] + var19;
      float var51 = var2[27] - var20;
      float var52 = var2[27] + var20;
      float var53 = var2[1] - var23;
      float var54 = var2[1] + var23;
      float var55 = var2[30] - var24;
      float var56 = var2[30] + var24;
      float var57 = var2[6] - var27;
      float var58 = var2[6] + var27;
      float var59 = var2[25] - var28;
      float var60 = var2[25] + var28;
      float var61 = var2[2] - var31;
      float var62 = var2[2] + var31;
      float var63 = var2[29] - var32;
      float var64 = var2[29] + var32;
      float var65 = var2[5] - var35;
      float var66 = var2[5] + var35;
      float var67 = var2[26] - var36;
      float var68 = var2[26] + var36;
      float var69 = var44 + var42;
      float var70 = -0.5411961F * var44;
      float var71 = 0.9238795F * var69;
      float var72 = 1.306563F * var42;
      float var73 = var70 + var71;
      float var74 = var72 - var71;
      float var75 = var43 + var41;
      float var76 = 1.306563F * var43;
      float var77 = -0.38268343F * var75;
      float var78 = 0.5411961F * var41;
      float var79 = var76 + var77;
      float var80 = var78 - var77;
      float var81 = var52 + var50;
      float var82 = -0.5411961F * var52;
      float var83 = 0.9238795F * var81;
      float var84 = 1.306563F * var50;
      float var85 = var82 + var83;
      float var86 = var84 - var83;
      float var87 = var51 + var49;
      float var88 = 1.306563F * var51;
      float var89 = -0.38268343F * var87;
      float var90 = 0.5411961F * var49;
      float var91 = var88 + var89;
      float var92 = var90 - var89;
      float var93 = var60 + var58;
      float var94 = -0.5411961F * var60;
      float var95 = 0.9238795F * var93;
      float var96 = 1.306563F * var58;
      float var97 = var94 + var95;
      float var98 = var96 - var95;
      float var99 = var59 + var57;
      float var100 = 1.306563F * var59;
      float var101 = -0.38268343F * var99;
      float var102 = 0.5411961F * var57;
      float var103 = var100 + var101;
      float var104 = var102 - var101;
      float var105 = var68 + var66;
      float var106 = -0.5411961F * var68;
      float var107 = 0.9238795F * var105;
      float var108 = 1.306563F * var66;
      float var109 = var106 + var107;
      float var110 = var108 - var107;
      float var111 = var67 + var65;
      float var112 = 1.306563F * var67;
      float var113 = -0.38268343F * var111;
      float var114 = 0.5411961F * var65;
      float var115 = var112 + var113;
      float var116 = var114 - var113;
      float var117 = var38 - var73;
      float var118 = var38 + var73;
      float var119 = var40 - var74;
      float var120 = var40 + var74;
      float var121 = var37 - var79;
      float var122 = var37 + var79;
      float var123 = var39 - var80;
      float var124 = var39 + var80;
      float var125 = var46 - var85;
      float var126 = var46 + var85;
      float var127 = var48 - var86;
      float var128 = var48 + var86;
      float var129 = var45 - var91;
      float var130 = var45 + var91;
      float var131 = var47 - var92;
      float var132 = var47 + var92;
      float var133 = var54 - var97;
      float var134 = var54 + var97;
      float var135 = var56 - var98;
      float var136 = var56 + var98;
      float var137 = var53 - var103;
      float var138 = var53 + var103;
      float var139 = var55 - var104;
      float var140 = var55 + var104;
      float var141 = var62 - var109;
      float var142 = var62 + var109;
      float var143 = var64 - var110;
      float var144 = var64 + var110;
      float var145 = var61 - var115;
      float var146 = var61 + var115;
      float var147 = var63 - var116;
      float var148 = var63 + var116;
      float var149 = var128 + var126;
      float var150 = -0.78569496F * var128;
      float var151 = 0.98078525F * var149;
      float var152 = 1.1758755F * var126;
      float var153 = var150 + var151;
      float var154 = var152 - var151;
      float var155 = var132 + var130;
      float var156 = 0.27589938F * var132;
      float var157 = 0.55557024F * var155;
      float var158 = 1.3870399F * var130;
      float var159 = var156 + var157;
      float var160 = var158 - var157;
      float var161 = var127 + var125;
      float var162 = 1.1758755F * var127;
      float var163 = -0.19509032F * var161;
      float var164 = 0.78569496F * var125;
      float var165 = var162 + var163;
      float var166 = var164 - var163;
      float var167 = var131 + var129;
      float var168 = 1.3870399F * var131;
      float var169 = -0.8314696F * var167;
      float var170 = -0.27589938F * var129;
      float var171 = var168 + var169;
      float var172 = var170 - var169;
      float var173 = var144 + var142;
      float var174 = -0.78569496F * var144;
      float var175 = 0.98078525F * var173;
      float var176 = 1.1758755F * var142;
      float var177 = var174 + var175;
      float var178 = var176 - var175;
      float var179 = var148 + var146;
      float var180 = 0.27589938F * var148;
      float var181 = 0.55557024F * var179;
      float var182 = 1.3870399F * var146;
      float var183 = var180 + var181;
      float var184 = var182 - var181;
      float var185 = var143 + var141;
      float var186 = 1.1758755F * var143;
      float var187 = -0.19509032F * var185;
      float var188 = 0.78569496F * var141;
      float var189 = var186 + var187;
      float var190 = var188 - var187;
      float var191 = var147 + var145;
      float var192 = 1.3870399F * var147;
      float var193 = -0.8314696F * var191;
      float var194 = -0.27589938F * var145;
      float var195 = var192 + var193;
      float var196 = var194 - var193;
      float var197 = var118 - var153;
      float var198 = var118 + var153;
      float var199 = var120 - var154;
      float var200 = var120 + var154;
      float var201 = var122 - var159;
      float var202 = var122 + var159;
      float var203 = var124 - var160;
      float var204 = var124 + var160;
      float var205 = var117 - var165;
      float var206 = var117 + var165;
      float var207 = var119 - var166;
      float var208 = var119 + var166;
      float var209 = var121 - var171;
      float var210 = var121 + var171;
      float var211 = var123 - var172;
      float var212 = var123 + var172;
      float var213 = var134 - var177;
      float var214 = var134 + var177;
      float var215 = var136 - var178;
      float var216 = var136 + var178;
      float var217 = var138 - var183;
      float var218 = var138 + var183;
      float var219 = var140 - var184;
      float var220 = var140 + var184;
      float var221 = var133 - var189;
      float var222 = var133 + var189;
      float var223 = var135 - var190;
      float var224 = var135 + var190;
      float var225 = var137 - var195;
      float var226 = var137 + var195;
      float var227 = var139 - var196;
      float var228 = var139 + var196;
      float var229 = var216 + var214;
      float var230 = -0.89716756F * var216;
      float var231 = 0.9951847F * var229;
      float var232 = 1.0932019F * var214;
      float var233 = var230 + var231;
      float var234 = var232 - var231;
      float var235 = var220 + var218;
      float var236 = -0.41052452F * var220;
      float var237 = 0.8819213F * var235;
      float var238 = 1.353318F * var218;
      float var239 = var236 + var237;
      float var240 = var238 - var237;
      float var241 = var224 + var222;
      float var242 = 0.13861717F * var224;
      float var243 = 0.6343933F * var241;
      float var244 = 1.4074037F * var222;
      float var245 = var242 + var243;
      float var246 = var244 - var243;
      float var247 = var228 + var226;
      float var248 = 0.66665566F * var228;
      float var249 = 0.29028466F * var247;
      float var250 = 1.247225F * var226;
      float var251 = var248 + var249;
      float var252 = var250 - var249;
      float var253 = var215 + var213;
      float var254 = 1.0932019F * var215;
      float var255 = -0.09801714F * var253;
      float var256 = 0.89716756F * var213;
      float var257 = var254 + var255;
      float var258 = var256 - var255;
      float var259 = var219 + var217;
      float var260 = 1.353318F * var219;
      float var261 = -0.47139674F * var259;
      float var262 = 0.41052452F * var217;
      float var263 = var260 + var261;
      float var264 = var262 - var261;
      float var265 = var223 + var221;
      float var266 = 1.4074037F * var223;
      float var267 = -0.77301043F * var265;
      float var268 = -0.13861717F * var221;
      float var269 = var266 + var267;
      float var270 = var268 - var267;
      float var271 = var227 + var225;
      float var272 = 1.247225F * var227;
      float var273 = -0.95694035F * var271;
      float var274 = -0.66665566F * var225;
      float var275 = var272 + var273;
      float var276 = var274 - var273;
      float var277 = var198 - var233;
      float var278 = var198 + var233;
      float var279 = var200 - var234;
      float var280 = var200 + var234;
      float var281 = var202 - var239;
      float var282 = var202 + var239;
      float var283 = var204 - var240;
      float var284 = var204 + var240;
      float var285 = var206 - var245;
      float var286 = var206 + var245;
      float var287 = var208 - var246;
      float var288 = var208 + var246;
      float var289 = var210 - var251;
      float var290 = var210 + var251;
      float var291 = var212 - var252;
      float var292 = var212 + var252;
      float var293 = var197 - var257;
      float var294 = var197 + var257;
      float var295 = var199 - var258;
      float var296 = var199 + var258;
      float var297 = var201 - var263;
      float var298 = var201 + var263;
      float var299 = var203 - var264;
      float var300 = var203 + var264;
      float var301 = var205 - var269;
      float var302 = var205 + var269;
      float var303 = var207 - var270;
      float var304 = var207 + var270;
      float var305 = var209 - var275;
      float var306 = var209 + var275;
      float var307 = var211 - var276;
      float var308 = var211 + var276;
      float var309 = var280 + var278;
      float var310 = -0.9751576F * var280;
      float var311 = 0.9996988F * var309;
      float var312 = 1.02424F * var278;
      var1[0] = var310 + var311;
      var1[31] = var312 - var311;
      float var313 = var284 + var282;
      float var314 = -0.87006885F * var284;
      float var315 = 0.99247956F * var313;
      float var316 = 1.1148902F * var282;
      var1[2] = var314 + var315;
      var1[29] = var316 - var315;
      float var317 = var288 + var286;
      float var318 = -0.7566009F * var288;
      float var319 = 0.9757021F * var317;
      float var320 = 1.1948034F * var286;
      var1[4] = var318 + var319;
      var1[27] = var320 - var319;
      float var321 = var292 + var290;
      float var322 = -0.63584644F * var292;
      float var323 = 0.94952816F * var321;
      float var324 = 1.2632099F * var290;
      var1[6] = var322 + var323;
      var1[25] = var324 - var323;
      float var325 = var296 + var294;
      float var326 = -0.5089684F * var296;
      float var327 = 0.9142098F * var325;
      float var328 = 1.3194511F * var294;
      var1[8] = var326 + var327;
      var1[23] = var328 - var327;
      float var329 = var300 + var298;
      float var330 = -0.3771888F * var300;
      float var331 = 0.87008697F * var329;
      float var332 = 1.3629851F * var298;
      var1[10] = var330 + var331;
      var1[21] = var332 - var331;
      float var333 = var304 + var302;
      float var334 = -0.24177662F * var304;
      float var335 = 0.8175848F * var333;
      float var336 = 1.393393F * var302;
      var1[12] = var334 + var335;
      var1[19] = var336 - var335;
      float var337 = var308 + var306;
      float var338 = -0.104036F * var308;
      float var339 = 0.7572088F * var337;
      float var340 = 1.4103817F * var306;
      var1[14] = var338 + var339;
      var1[17] = var340 - var339;
      float var341 = var279 + var277;
      float var342 = 0.034706537F * var279;
      float var343 = 0.68954057F * var341;
      float var344 = 1.4137876F * var277;
      var1[16] = var342 + var343;
      var1[15] = var344 - var343;
      float var345 = var283 + var281;
      float var346 = 0.17311484F * var283;
      float var347 = 0.6152316F * var345;
      float var348 = 1.403578F * var281;
      var1[18] = var346 + var347;
      var1[13] = var348 - var347;
      float var349 = var287 + var285;
      float var350 = 0.30985594F * var287;
      float var351 = 0.53499764F * var349;
      float var352 = 1.3798512F * var285;
      var1[20] = var350 + var351;
      var1[11] = var352 - var351;
      float var353 = var291 + var289;
      float var354 = 0.44361296F * var291;
      float var355 = 0.44961134F * var353;
      float var356 = 1.3428357F * var289;
      var1[22] = var354 + var355;
      var1[9] = var356 - var355;
      float var357 = var295 + var293;
      float var358 = 0.57309777F * var295;
      float var359 = 0.35989505F * var357;
      float var360 = 1.2928878F * var293;
      var1[24] = var358 + var359;
      var1[7] = var360 - var359;
      float var361 = var299 + var297;
      float var362 = 0.6970633F * var299;
      float var363 = 0.26671275F * var361;
      float var364 = 1.2304888F * var297;
      var1[26] = var362 + var363;
      var1[5] = var364 - var363;
      float var365 = var303 + var301;
      float var366 = 0.81431574F * var303;
      float var367 = 0.17096189F * var365;
      float var368 = 1.1562395F * var301;
      var1[28] = var366 + var367;
      var1[3] = var368 - var367;
      float var369 = var307 + var305;
      float var370 = 0.9237259F * var307;
      float var371 = 0.07356457F * var369;
      float var372 = 1.070855F * var305;
      var1[30] = var370 + var371;
      var1[1] = var372 - var371;
   }

   private void method25113(float[] var1, float[] var2) {
      float var5 = var2[0] - var2[1];
      float var6 = var2[2] - var2[1];
      float var7 = var2[2] - var2[3];
      float var8 = var2[4] - var2[3];
      float var9 = var2[4] - var2[5];
      float var10 = var2[6] - var2[5];
      float var11 = var2[6] - var2[7];
      float var12 = var2[8] - var2[7];
      float var13 = var2[8] - var2[9];
      float var14 = var2[10] - var2[9];
      float var15 = var2[10] - var2[11];
      float var16 = var2[12] - var2[11];
      float var17 = var2[12] - var2[13];
      float var18 = var2[14] - var2[13];
      float var19 = var2[14] - var2[15];
      float var20 = var2[16] - var2[15];
      float var21 = var2[16] - var2[17];
      float var22 = var2[18] - var2[17];
      float var23 = var2[18] - var2[19];
      float var24 = var2[20] - var2[19];
      float var25 = var2[20] - var2[21];
      float var26 = var2[22] - var2[21];
      float var27 = var2[22] - var2[23];
      float var28 = var2[24] - var2[23];
      float var29 = var2[24] - var2[25];
      float var30 = var2[26] - var2[25];
      float var31 = var2[26] - var2[27];
      float var32 = var2[28] - var2[27];
      float var33 = var2[28] - var2[29];
      float var34 = var2[30] - var2[29];
      float var35 = var2[30] - var2[31];
      float var36 = 0.70710677F * var20;
      float var37 = var2[0] - var36;
      float var38 = var2[0] + var36;
      float var39 = var12 + var28;
      float var40 = 1.306563F * var12;
      float var41 = -0.9238795F * var39;
      float var42 = -0.5411961F * var28;
      float var43 = var40 + var41;
      float var44 = var42 - var41;
      float var45 = var38 - var44;
      float var46 = var38 + var44;
      float var47 = var37 - var43;
      float var48 = var37 + var43;
      float var49 = var16 - var24;
      float var50 = var16 + var24;
      float var51 = 0.70710677F * var50;
      float var52 = var8 - var51;
      float var53 = var8 + var51;
      float var54 = 0.70710677F * var49;
      float var55 = var54 - var32;
      float var56 = var54 + var32;
      float var57 = var56 + var53;
      float var58 = -0.78569496F * var56;
      float var59 = 0.98078525F * var57;
      float var60 = 1.1758755F * var53;
      float var61 = var58 + var59;
      float var62 = var60 - var59;
      float var63 = var55 + var52;
      float var64 = -0.27589938F * var55;
      float var65 = 0.8314696F * var63;
      float var66 = 1.3870399F * var52;
      float var67 = var64 + var65;
      float var68 = var66 - var65;
      float var69 = var46 - var61;
      float var70 = var46 + var61;
      float var71 = var48 - var67;
      float var72 = var48 + var67;
      float var73 = var47 - var68;
      float var74 = var47 + var68;
      float var75 = var45 - var62;
      float var76 = var45 + var62;
      float var77 = var10 - var14;
      float var78 = var10 + var14;
      float var79 = var18 - var22;
      float var80 = var18 + var22;
      float var81 = var26 - var30;
      float var82 = var26 + var30;
      float var83 = 0.70710677F * var80;
      float var84 = var6 - var83;
      float var85 = var6 + var83;
      float var86 = var78 + var82;
      float var87 = 1.306563F * var78;
      float var88 = -0.9238795F * var86;
      float var89 = -0.5411961F * var82;
      float var90 = var87 + var88;
      float var91 = var89 - var88;
      float var92 = var85 - var91;
      float var93 = var85 + var91;
      float var94 = var84 - var90;
      float var95 = var84 + var90;
      float var96 = 0.70710677F * var79;
      float var97 = var34 - var96;
      float var98 = var34 + var96;
      float var99 = var81 + var77;
      float var100 = 1.306563F * var81;
      float var101 = -0.9238795F * var99;
      float var102 = -0.5411961F * var77;
      float var103 = var100 + var101;
      float var104 = var102 - var101;
      float var105 = var98 - var104;
      float var106 = var98 + var104;
      float var107 = var97 - var103;
      float var108 = var97 + var103;
      float var109 = var106 + var93;
      float var110 = -0.89716756F * var106;
      float var111 = 0.9951847F * var109;
      float var112 = 1.0932019F * var93;
      float var113 = var110 + var111;
      float var114 = var112 - var111;
      float var115 = var95 - var108;
      float var116 = -0.66665566F * var108;
      float var117 = 0.95694035F * var115;
      float var118 = 1.247225F * var95;
      float var119 = var117 - var116;
      float var120 = var118 - var117;
      float var121 = var107 + var94;
      float var122 = -0.41052452F * var107;
      float var123 = 0.8819213F * var121;
      float var124 = 1.353318F * var94;
      float var125 = var122 + var123;
      float var126 = var124 - var123;
      float var127 = var92 - var105;
      float var128 = -0.13861717F * var105;
      float var129 = 0.77301043F * var127;
      float var130 = 1.4074037F * var92;
      float var131 = var129 - var128;
      float var132 = var130 - var129;
      float var133 = var70 - var113;
      float var134 = var70 + var113;
      float var135 = var72 - var119;
      float var136 = var72 + var119;
      float var137 = var74 - var125;
      float var138 = var74 + var125;
      float var139 = var76 - var131;
      float var140 = var76 + var131;
      float var141 = var75 - var132;
      float var142 = var75 + var132;
      float var143 = var73 - var126;
      float var144 = var73 + var126;
      float var145 = var71 - var120;
      float var146 = var71 + var120;
      float var147 = var69 - var114;
      float var148 = var69 + var114;
      float var149 = var5 + var35;
      float var150 = 1.0478631F * var5;
      float var151 = -0.99879545F * var149;
      float var152 = -0.9497278F * var35;
      float var153 = var150 + var151;
      float var154 = var152 - var151;
      float var155 = var9 + var31;
      float var156 = 1.2130114F * var9;
      float var157 = -0.97003126F * var155;
      float var158 = -0.7270511F * var31;
      float var159 = var156 + var157;
      float var160 = var158 - var157;
      float var161 = var13 + var27;
      float var162 = 1.3315444F * var13;
      float var163 = -0.9039893F * var161;
      float var164 = -0.4764342F * var27;
      float var165 = var162 + var163;
      float var166 = var164 - var163;
      float var167 = var17 + var23;
      float var168 = 1.3989068F * var17;
      float var169 = -0.8032075F * var167;
      float var170 = -0.20750822F * var23;
      float var171 = var168 + var169;
      float var172 = var170 - var169;
      float var173 = var21 + var19;
      float var174 = 1.41251F * var21;
      float var175 = -0.671559F * var173;
      float var176 = 0.06939217F * var19;
      float var177 = var174 + var175;
      float var178 = var176 - var175;
      float var179 = var25 + var15;
      float var180 = 1.3718313F * var25;
      float var181 = -0.51410276F * var179;
      float var182 = 0.34362587F * var15;
      float var183 = var180 + var181;
      float var184 = var182 - var181;
      float var185 = var29 + var11;
      float var186 = 1.2784339F * var29;
      float var187 = -0.33688986F * var185;
      float var188 = 0.6046542F * var11;
      float var189 = var186 + var187;
      float var190 = var188 - var187;
      float var191 = var33 + var7;
      float var192 = 1.1359069F * var33;
      float var193 = -0.14673047F * var191;
      float var194 = 0.842446F * var7;
      float var195 = var192 + var193;
      float var196 = var194 - var193;
      float var197 = var154 - var178;
      float var198 = var154 + var178;
      float var199 = var153 - var177;
      float var200 = var153 + var177;
      float var201 = var160 - var184;
      float var202 = var160 + var184;
      float var203 = var159 - var183;
      float var204 = var159 + var183;
      float var205 = var166 - var190;
      float var206 = var166 + var190;
      float var207 = var165 - var189;
      float var208 = var165 + var189;
      float var209 = var172 - var196;
      float var210 = var172 + var196;
      float var211 = var171 - var195;
      float var212 = var171 + var195;
      float var213 = var197 + var199;
      float var214 = 1.1758755F * var197;
      float var215 = -0.98078525F * var213;
      float var216 = -0.78569496F * var199;
      float var217 = var214 + var215;
      float var218 = var216 - var215;
      float var219 = var201 + var203;
      float var220 = 1.3870399F * var201;
      float var221 = -0.55557024F * var219;
      float var222 = 0.27589938F * var203;
      float var223 = var220 + var221;
      float var224 = var222 - var221;
      float var225 = var205 + var207;
      float var226 = 0.78569496F * var205;
      float var227 = 0.19509032F * var225;
      float var228 = 1.1758755F * var207;
      float var229 = var226 + var227;
      float var230 = var228 - var227;
      float var231 = var209 + var211;
      float var232 = -0.27589938F * var209;
      float var233 = 0.8314696F * var231;
      float var234 = 1.3870399F * var211;
      float var235 = var232 + var233;
      float var236 = var234 - var233;
      float var237 = var198 - var206;
      float var238 = var198 + var206;
      float var239 = var200 - var208;
      float var240 = var200 + var208;
      float var241 = var202 - var210;
      float var242 = var202 + var210;
      float var243 = var204 - var212;
      float var244 = var204 + var212;
      float var245 = var218 - var230;
      float var246 = var218 + var230;
      float var247 = var217 - var229;
      float var248 = var217 + var229;
      float var249 = var224 - var236;
      float var250 = var224 + var236;
      float var251 = var223 - var235;
      float var252 = var223 + var235;
      float var253 = var237 + var239;
      float var254 = 1.306563F * var237;
      float var255 = -0.9238795F * var253;
      float var256 = -0.5411961F * var239;
      float var257 = var254 + var255;
      float var258 = var256 - var255;
      float var259 = var241 + var243;
      float var260 = 0.5411961F * var241;
      float var261 = 0.38268343F * var259;
      float var262 = 1.306563F * var243;
      float var263 = var260 + var261;
      float var264 = var262 - var261;
      float var265 = var245 + var247;
      float var266 = 1.306563F * var245;
      float var267 = -0.9238795F * var265;
      float var268 = -0.5411961F * var247;
      float var269 = var266 + var267;
      float var270 = var268 - var267;
      float var271 = var249 + var251;
      float var272 = 0.5411961F * var249;
      float var273 = 0.38268343F * var271;
      float var274 = 1.306563F * var251;
      float var275 = var272 + var273;
      float var276 = var274 - var273;
      float var277 = var238 - var242;
      float var278 = var238 + var242;
      float var279 = var240 - var244;
      float var280 = var240 + var244;
      float var281 = var258 - var264;
      float var282 = var258 + var264;
      float var283 = var257 - var263;
      float var284 = var257 + var263;
      float var285 = var246 - var250;
      float var286 = var246 + var250;
      float var287 = var248 - var252;
      float var288 = var248 + var252;
      float var289 = var270 - var276;
      float var290 = var270 + var276;
      float var291 = var269 - var275;
      float var292 = var269 + var275;
      float var293 = var277 - var279;
      float var294 = var277 + var279;
      float var295 = 0.70710677F * var293;
      float var296 = 0.70710677F * var294;
      float var297 = var281 - var283;
      float var298 = var281 + var283;
      float var299 = 0.70710677F * var297;
      float var300 = 0.70710677F * var298;
      float var301 = var285 - var287;
      float var302 = var285 + var287;
      float var303 = 0.70710677F * var301;
      float var304 = 0.70710677F * var302;
      float var305 = var289 - var291;
      float var306 = var289 + var291;
      float var307 = 0.70710677F * var305;
      float var308 = 0.70710677F * var306;
      float var309 = var134 - var278;
      float var310 = var134 + var278;
      float var311 = var136 - var286;
      float var312 = var136 + var286;
      float var313 = var138 - var290;
      float var314 = var138 + var290;
      float var315 = var140 - var282;
      float var316 = var140 + var282;
      float var317 = var142 - var300;
      float var318 = var142 + var300;
      float var319 = var144 - var308;
      float var320 = var144 + var308;
      float var321 = var146 - var304;
      float var322 = var146 + var304;
      float var323 = var148 - var296;
      float var324 = var148 + var296;
      float var325 = var147 - var295;
      float var326 = var147 + var295;
      float var327 = var145 - var303;
      float var328 = var145 + var303;
      float var329 = var143 - var307;
      float var330 = var143 + var307;
      float var331 = var141 - var299;
      float var332 = var141 + var299;
      float var333 = var139 - var284;
      float var334 = var139 + var284;
      float var335 = var137 - var292;
      float var336 = var137 + var292;
      float var337 = var135 - var288;
      float var338 = var135 + var288;
      float var339 = var133 - var280;
      float var340 = var133 + var280;
      var1[31] = 0.5001506F * var310;
      var1[30] = 0.50135845F * var312;
      var1[29] = 0.5037887F * var314;
      var1[28] = 0.50747114F * var316;
      var1[27] = 0.51245147F * var318;
      var1[26] = 0.5187927F * var320;
      var1[25] = 0.5265773F * var322;
      var1[24] = 0.53590983F * var324;
      var1[23] = 0.5469204F * var326;
      var1[22] = 0.5597698F * var328;
      var1[21] = 0.5746552F * var330;
      var1[20] = 0.5918185F * var332;
      var1[19] = 0.61155736F * var334;
      var1[18] = 0.63423896F * var336;
      var1[17] = 0.6603198F * var338;
      var1[16] = 0.6903721F * var340;
      var1[15] = 0.72512054F * var339;
      var1[14] = 0.76549417F * var337;
      var1[13] = 0.8127021F * var335;
      var1[12] = 0.8683447F * var333;
      var1[11] = 0.9345836F * var331;
      var1[10] = 1.0144082F * var329;
      var1[9] = 1.1120716F * var327;
      var1[8] = 1.2338327F * var325;
      var1[7] = 1.3892939F * var323;
      var1[6] = 1.5939723F * var321;
      var1[5] = 1.874676F * var319;
      var1[4] = 2.2820501F * var317;
      var1[3] = 2.9246285F * var315;
      var1[2] = 4.084611F * var313;
      var1[1] = 6.7967505F * var311;
      var1[0] = 20.373878F * var309;
   }
}
