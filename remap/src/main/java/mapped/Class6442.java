// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;

public class Class6442 implements Class6441
{
    private static String[] field25570;
    private static final float[][] field25571;
    private float[] field25572;
    private int field25573;
    private final int field25574;
    
    public Class6442(final int field25574) {
        this.field25574 = field25574;
        this.field25572 = new float[2 * field25574 * 20];
        this.field25573 = 0;
    }
    
    public void method19207() {
        Arrays.fill(this.field25572, 0.0f);
    }
    
    public void method19208(final Class4197 class4197, final float[][][] array, final float[] array2) {
        final float[] array3 = new float[32];
        final float[] array4 = new float[32];
        final float n = 0.015625f;
        int n2 = 0;
        for (int i = 0; i < class4197.field18854; ++i) {
            for (int j = 0; j < 32; ++j) {
                array3[j] = array[i][j][0] * Class6442.field25571[j][0] - array[i][j][1] * Class6442.field25571[j][1];
                array4[j] = array[i][j][1] * Class6442.field25571[j][0] + array[i][j][0] * Class6442.field25571[j][1];
                final float[] array5 = array3;
                final int n3 = j;
                array5[n3] *= n;
                final float[] array6 = array4;
                final int n4 = j;
                array6[n4] *= n;
            }
            this.method19210(array3, array3);
            this.method19211(array4, array4);
            for (int k = 0; k < 32; ++k) {
                this.field25572[this.field25573 + k] = (this.field25572[this.field25573 + 640 + k] = -array3[k] + array4[k]);
                this.field25572[this.field25573 + 63 - k] = (this.field25572[this.field25573 + 640 + 63 - k] = array3[k] + array4[k]);
            }
            for (int l = 0; l < 32; ++l) {
                array2[n2++] = this.field25572[this.field25573 + l] * Class6442.field25569[2 * l] + this.field25572[this.field25573 + 96 + l] * Class6442.field25569[64 + 2 * l] + this.field25572[this.field25573 + 128 + l] * Class6442.field25569[128 + 2 * l] + this.field25572[this.field25573 + 224 + l] * Class6442.field25569[192 + 2 * l] + this.field25572[this.field25573 + 256 + l] * Class6442.field25569[256 + 2 * l] + this.field25572[this.field25573 + 352 + l] * Class6442.field25569[320 + 2 * l] + this.field25572[this.field25573 + 384 + l] * Class6442.field25569[384 + 2 * l] + this.field25572[this.field25573 + 480 + l] * Class6442.field25569[448 + 2 * l] + this.field25572[this.field25573 + 512 + l] * Class6442.field25569[512 + 2 * l] + this.field25572[this.field25573 + 608 + l] * Class6442.field25569[576 + 2 * l];
            }
            this.field25573 -= 64;
            if (this.field25573 < 0) {
                this.field25573 = 576;
            }
        }
    }
    
    public void method19209(final Class4197 class4197, final float[][][] array, final float[] array2) {
        final float[] array3 = new float[32];
        final float[] array4 = new float[32];
        final float[] array5 = new float[32];
        final float[] array6 = new float[32];
        final float[] array7 = new float[32];
        final float[] array8 = new float[32];
        final float[] array9 = new float[32];
        final float[] array10 = new float[32];
        final float n = 0.015625f;
        int n2 = 0;
        for (int i = 0; i < class4197.field18854; ++i) {
            final float[][] array11 = array[i];
            array4[31] = n * array11[1][0];
            array3[0] = n * array11[0][0];
            array8[31] = n * array11[62][1];
            array7[0] = n * array11[63][1];
            for (int j = 1; j < 31; ++j) {
                array4[31 - j] = n * array11[2 * j + 1][0];
                array3[j] = n * array11[2 * j][0];
                array8[31 - j] = n * array11[63 - (2 * j + 1)][1];
                array7[j] = n * array11[63 - 2 * j][1];
            }
            array4[0] = n * array11[63][0];
            array3[31] = n * array11[62][0];
            array8[0] = n * array11[0][1];
            array7[31] = n * array11[1][1];
            Class9261.method34168(array3, array4, array5, array6);
            Class9261.method34168(array7, array8, array9, array10);
            final int field25573 = this.field25573;
            final int n3 = field25573 + 1280;
            for (int k = 0; k < 32; ++k) {
                this.field25572[field25573 + 2 * k] = (this.field25572[n3 + 2 * k] = array9[k] - array5[k]);
                this.field25572[field25573 + 127 - 2 * k] = (this.field25572[n3 + 127 - 2 * k] = array9[k] + array5[k]);
                this.field25572[field25573 + 2 * k + 1] = (this.field25572[n3 + 2 * k + 1] = array10[31 - k] + array6[31 - k]);
                this.field25572[field25573 + 127 - (2 * k + 1)] = (this.field25572[n3 + 127 - (2 * k + 1)] = array10[31 - k] - array6[31 - k]);
            }
            final int field25574 = this.field25573;
            for (int l = 0; l < 64; ++l) {
                array2[n2++] = this.field25572[field25574 + l + 0] * Class6442.field25569[l + 0] + this.field25572[field25574 + l + 192] * Class6442.field25569[l + 64] + this.field25572[field25574 + l + 256] * Class6442.field25569[l + 128] + this.field25572[field25574 + l + 448] * Class6442.field25569[l + 192] + this.field25572[field25574 + l + 512] * Class6442.field25569[l + 256] + this.field25572[field25574 + l + 704] * Class6442.field25569[l + 320] + this.field25572[field25574 + l + 768] * Class6442.field25569[l + 384] + this.field25572[field25574 + l + 960] * Class6442.field25569[l + 448] + this.field25572[field25574 + l + 1024] * Class6442.field25569[l + 512] + this.field25572[field25574 + l + 1216] * Class6442.field25569[l + 576];
            }
            this.field25573 -= 128;
            if (this.field25573 < 0) {
                this.field25573 = 1152;
            }
        }
    }
    
    private void method19210(final float[] array, final float[] array2) {
        final float n = array2[15] - array2[16];
        final float n2 = 0.70710677f * (array2[15] + array2[16]);
        final float n3 = 0.70710677f * n;
        final float n4 = array2[8] - array2[23];
        final float n5 = 0.70710677f * (array2[8] + array2[23]);
        final float n6 = 0.70710677f * n4;
        final float n7 = array2[12] - array2[19];
        final float n8 = 0.70710677f * (array2[12] + array2[19]);
        final float n9 = 0.70710677f * n7;
        final float n10 = array2[11] - array2[20];
        final float n11 = 0.70710677f * (array2[11] + array2[20]);
        final float n12 = 0.70710677f * n10;
        final float n13 = array2[14] - array2[17];
        final float n14 = 0.70710677f * (array2[14] + array2[17]);
        final float n15 = 0.70710677f * n13;
        final float n16 = array2[9] - array2[22];
        final float n17 = 0.70710677f * (array2[9] + array2[22]);
        final float n18 = 0.70710677f * n16;
        final float n19 = array2[13] - array2[18];
        final float n20 = 0.70710677f * (array2[13] + array2[18]);
        final float n21 = 0.70710677f * n19;
        final float n22 = array2[10] - array2[21];
        final float n23 = 0.70710677f * (array2[10] + array2[21]);
        final float n24 = 0.70710677f * n22;
        final float n25 = array2[0] - n2;
        final float n26 = array2[0] + n2;
        final float n27 = array2[31] - n3;
        final float n28 = array2[31] + n3;
        final float n29 = array2[7] - n5;
        final float n30 = array2[7] + n5;
        final float n31 = array2[24] - n6;
        final float n32 = array2[24] + n6;
        final float n33 = array2[3] - n8;
        final float n34 = array2[3] + n8;
        final float n35 = array2[28] - n9;
        final float n36 = array2[28] + n9;
        final float n37 = array2[4] - n11;
        final float n38 = array2[4] + n11;
        final float n39 = array2[27] - n12;
        final float n40 = array2[27] + n12;
        final float n41 = array2[1] - n14;
        final float n42 = array2[1] + n14;
        final float n43 = array2[30] - n15;
        final float n44 = array2[30] + n15;
        final float n45 = array2[6] - n17;
        final float n46 = array2[6] + n17;
        final float n47 = array2[25] - n18;
        final float n48 = array2[25] + n18;
        final float n49 = array2[2] - n20;
        final float n50 = array2[2] + n20;
        final float n51 = array2[29] - n21;
        final float n52 = array2[29] + n21;
        final float n53 = array2[5] - n23;
        final float n54 = array2[5] + n23;
        final float n55 = array2[26] - n24;
        final float n56 = array2[26] + n24;
        final float n57 = n32 + n30;
        final float n58 = -0.5411961f * n32;
        final float n59 = 0.9238795f * n57;
        final float n60 = 1.306563f * n30;
        final float n61 = n58 + n59;
        final float n62 = n60 - n59;
        final float n63 = n31 + n29;
        final float n64 = 1.306563f * n31;
        final float n65 = -0.38268343f * n63;
        final float n66 = 0.5411961f * n29;
        final float n67 = n64 + n65;
        final float n68 = n66 - n65;
        final float n69 = n40 + n38;
        final float n70 = -0.5411961f * n40;
        final float n71 = 0.9238795f * n69;
        final float n72 = 1.306563f * n38;
        final float n73 = n70 + n71;
        final float n74 = n72 - n71;
        final float n75 = n39 + n37;
        final float n76 = 1.306563f * n39;
        final float n77 = -0.38268343f * n75;
        final float n78 = 0.5411961f * n37;
        final float n79 = n76 + n77;
        final float n80 = n78 - n77;
        final float n81 = n48 + n46;
        final float n82 = -0.5411961f * n48;
        final float n83 = 0.9238795f * n81;
        final float n84 = 1.306563f * n46;
        final float n85 = n82 + n83;
        final float n86 = n84 - n83;
        final float n87 = n47 + n45;
        final float n88 = 1.306563f * n47;
        final float n89 = -0.38268343f * n87;
        final float n90 = 0.5411961f * n45;
        final float n91 = n88 + n89;
        final float n92 = n90 - n89;
        final float n93 = n56 + n54;
        final float n94 = -0.5411961f * n56;
        final float n95 = 0.9238795f * n93;
        final float n96 = 1.306563f * n54;
        final float n97 = n94 + n95;
        final float n98 = n96 - n95;
        final float n99 = n55 + n53;
        final float n100 = 1.306563f * n55;
        final float n101 = -0.38268343f * n99;
        final float n102 = 0.5411961f * n53;
        final float n103 = n100 + n101;
        final float n104 = n102 - n101;
        final float n105 = n26 - n61;
        final float n106 = n26 + n61;
        final float n107 = n28 - n62;
        final float n108 = n28 + n62;
        final float n109 = n25 - n67;
        final float n110 = n25 + n67;
        final float n111 = n27 - n68;
        final float n112 = n27 + n68;
        final float n113 = n34 - n73;
        final float n114 = n34 + n73;
        final float n115 = n36 - n74;
        final float n116 = n36 + n74;
        final float n117 = n33 - n79;
        final float n118 = n33 + n79;
        final float n119 = n35 - n80;
        final float n120 = n35 + n80;
        final float n121 = n42 - n85;
        final float n122 = n42 + n85;
        final float n123 = n44 - n86;
        final float n124 = n44 + n86;
        final float n125 = n41 - n91;
        final float n126 = n41 + n91;
        final float n127 = n43 - n92;
        final float n128 = n43 + n92;
        final float n129 = n50 - n97;
        final float n130 = n50 + n97;
        final float n131 = n52 - n98;
        final float n132 = n52 + n98;
        final float n133 = n49 - n103;
        final float n134 = n49 + n103;
        final float n135 = n51 - n104;
        final float n136 = n51 + n104;
        final float n137 = n116 + n114;
        final float n138 = -0.78569496f * n116;
        final float n139 = 0.98078525f * n137;
        final float n140 = 1.1758755f * n114;
        final float n141 = n138 + n139;
        final float n142 = n140 - n139;
        final float n143 = n120 + n118;
        final float n144 = 0.27589938f * n120;
        final float n145 = 0.55557024f * n143;
        final float n146 = 1.3870399f * n118;
        final float n147 = n144 + n145;
        final float n148 = n146 - n145;
        final float n149 = n115 + n113;
        final float n150 = 1.1758755f * n115;
        final float n151 = -0.19509032f * n149;
        final float n152 = 0.78569496f * n113;
        final float n153 = n150 + n151;
        final float n154 = n152 - n151;
        final float n155 = n119 + n117;
        final float n156 = 1.3870399f * n119;
        final float n157 = -0.8314696f * n155;
        final float n158 = -0.27589938f * n117;
        final float n159 = n156 + n157;
        final float n160 = n158 - n157;
        final float n161 = n132 + n130;
        final float n162 = -0.78569496f * n132;
        final float n163 = 0.98078525f * n161;
        final float n164 = 1.1758755f * n130;
        final float n165 = n162 + n163;
        final float n166 = n164 - n163;
        final float n167 = n136 + n134;
        final float n168 = 0.27589938f * n136;
        final float n169 = 0.55557024f * n167;
        final float n170 = 1.3870399f * n134;
        final float n171 = n168 + n169;
        final float n172 = n170 - n169;
        final float n173 = n131 + n129;
        final float n174 = 1.1758755f * n131;
        final float n175 = -0.19509032f * n173;
        final float n176 = 0.78569496f * n129;
        final float n177 = n174 + n175;
        final float n178 = n176 - n175;
        final float n179 = n135 + n133;
        final float n180 = 1.3870399f * n135;
        final float n181 = -0.8314696f * n179;
        final float n182 = -0.27589938f * n133;
        final float n183 = n180 + n181;
        final float n184 = n182 - n181;
        final float n185 = n106 - n141;
        final float n186 = n106 + n141;
        final float n187 = n108 - n142;
        final float n188 = n108 + n142;
        final float n189 = n110 - n147;
        final float n190 = n110 + n147;
        final float n191 = n112 - n148;
        final float n192 = n112 + n148;
        final float n193 = n105 - n153;
        final float n194 = n105 + n153;
        final float n195 = n107 - n154;
        final float n196 = n107 + n154;
        final float n197 = n109 - n159;
        final float n198 = n109 + n159;
        final float n199 = n111 - n160;
        final float n200 = n111 + n160;
        final float n201 = n122 - n165;
        final float n202 = n122 + n165;
        final float n203 = n124 - n166;
        final float n204 = n124 + n166;
        final float n205 = n126 - n171;
        final float n206 = n126 + n171;
        final float n207 = n128 - n172;
        final float n208 = n128 + n172;
        final float n209 = n121 - n177;
        final float n210 = n121 + n177;
        final float n211 = n123 - n178;
        final float n212 = n123 + n178;
        final float n213 = n125 - n183;
        final float n214 = n125 + n183;
        final float n215 = n127 - n184;
        final float n216 = n127 + n184;
        final float n217 = n204 + n202;
        final float n218 = -0.89716756f * n204;
        final float n219 = 0.9951847f * n217;
        final float n220 = 1.0932019f * n202;
        final float n221 = n218 + n219;
        final float n222 = n220 - n219;
        final float n223 = n208 + n206;
        final float n224 = -0.41052452f * n208;
        final float n225 = 0.8819213f * n223;
        final float n226 = 1.353318f * n206;
        final float n227 = n224 + n225;
        final float n228 = n226 - n225;
        final float n229 = n212 + n210;
        final float n230 = 0.13861717f * n212;
        final float n231 = 0.6343933f * n229;
        final float n232 = 1.4074037f * n210;
        final float n233 = n230 + n231;
        final float n234 = n232 - n231;
        final float n235 = n216 + n214;
        final float n236 = 0.66665566f * n216;
        final float n237 = 0.29028466f * n235;
        final float n238 = 1.247225f * n214;
        final float n239 = n236 + n237;
        final float n240 = n238 - n237;
        final float n241 = n203 + n201;
        final float n242 = 1.0932019f * n203;
        final float n243 = -0.09801714f * n241;
        final float n244 = 0.89716756f * n201;
        final float n245 = n242 + n243;
        final float n246 = n244 - n243;
        final float n247 = n207 + n205;
        final float n248 = 1.353318f * n207;
        final float n249 = -0.47139674f * n247;
        final float n250 = 0.41052452f * n205;
        final float n251 = n248 + n249;
        final float n252 = n250 - n249;
        final float n253 = n211 + n209;
        final float n254 = 1.4074037f * n211;
        final float n255 = -0.77301043f * n253;
        final float n256 = -0.13861717f * n209;
        final float n257 = n254 + n255;
        final float n258 = n256 - n255;
        final float n259 = n215 + n213;
        final float n260 = 1.247225f * n215;
        final float n261 = -0.95694035f * n259;
        final float n262 = -0.66665566f * n213;
        final float n263 = n260 + n261;
        final float n264 = n262 - n261;
        final float n265 = n186 - n221;
        final float n266 = n186 + n221;
        final float n267 = n188 - n222;
        final float n268 = n188 + n222;
        final float n269 = n190 - n227;
        final float n270 = n190 + n227;
        final float n271 = n192 - n228;
        final float n272 = n192 + n228;
        final float n273 = n194 - n233;
        final float n274 = n194 + n233;
        final float n275 = n196 - n234;
        final float n276 = n196 + n234;
        final float n277 = n198 - n239;
        final float n278 = n198 + n239;
        final float n279 = n200 - n240;
        final float n280 = n200 + n240;
        final float n281 = n185 - n245;
        final float n282 = n185 + n245;
        final float n283 = n187 - n246;
        final float n284 = n187 + n246;
        final float n285 = n189 - n251;
        final float n286 = n189 + n251;
        final float n287 = n191 - n252;
        final float n288 = n191 + n252;
        final float n289 = n193 - n257;
        final float n290 = n193 + n257;
        final float n291 = n195 - n258;
        final float n292 = n195 + n258;
        final float n293 = n197 - n263;
        final float n294 = n197 + n263;
        final float n295 = n199 - n264;
        final float n296 = n199 + n264;
        final float n297 = n268 + n266;
        final float n298 = -0.9751576f * n268;
        final float n299 = 0.9996988f * n297;
        final float n300 = 1.02424f * n266;
        array[0] = n298 + n299;
        array[31] = n300 - n299;
        final float n301 = n272 + n270;
        final float n302 = -0.87006885f * n272;
        final float n303 = 0.99247956f * n301;
        final float n304 = 1.1148902f * n270;
        array[2] = n302 + n303;
        array[29] = n304 - n303;
        final float n305 = n276 + n274;
        final float n306 = -0.7566009f * n276;
        final float n307 = 0.9757021f * n305;
        final float n308 = 1.1948034f * n274;
        array[4] = n306 + n307;
        array[27] = n308 - n307;
        final float n309 = n280 + n278;
        final float n310 = -0.63584644f * n280;
        final float n311 = 0.94952816f * n309;
        final float n312 = 1.2632099f * n278;
        array[6] = n310 + n311;
        array[25] = n312 - n311;
        final float n313 = n284 + n282;
        final float n314 = -0.5089684f * n284;
        final float n315 = 0.9142098f * n313;
        final float n316 = 1.3194511f * n282;
        array[8] = n314 + n315;
        array[23] = n316 - n315;
        final float n317 = n288 + n286;
        final float n318 = -0.3771888f * n288;
        final float n319 = 0.87008697f * n317;
        final float n320 = 1.3629851f * n286;
        array[10] = n318 + n319;
        array[21] = n320 - n319;
        final float n321 = n292 + n290;
        final float n322 = -0.24177662f * n292;
        final float n323 = 0.8175848f * n321;
        final float n324 = 1.393393f * n290;
        array[12] = n322 + n323;
        array[19] = n324 - n323;
        final float n325 = n296 + n294;
        final float n326 = -0.104036f * n296;
        final float n327 = 0.7572088f * n325;
        final float n328 = 1.4103817f * n294;
        array[14] = n326 + n327;
        array[17] = n328 - n327;
        final float n329 = n267 + n265;
        final float n330 = 0.034706537f * n267;
        final float n331 = 0.68954057f * n329;
        final float n332 = 1.4137876f * n265;
        array[16] = n330 + n331;
        array[15] = n332 - n331;
        final float n333 = n271 + n269;
        final float n334 = 0.17311484f * n271;
        final float n335 = 0.6152316f * n333;
        final float n336 = 1.403578f * n269;
        array[18] = n334 + n335;
        array[13] = n336 - n335;
        final float n337 = n275 + n273;
        final float n338 = 0.30985594f * n275;
        final float n339 = 0.53499764f * n337;
        final float n340 = 1.3798512f * n273;
        array[20] = n338 + n339;
        array[11] = n340 - n339;
        final float n341 = n279 + n277;
        final float n342 = 0.44361296f * n279;
        final float n343 = 0.44961134f * n341;
        final float n344 = 1.3428357f * n277;
        array[22] = n342 + n343;
        array[9] = n344 - n343;
        final float n345 = n283 + n281;
        final float n346 = 0.57309777f * n283;
        final float n347 = 0.35989505f * n345;
        final float n348 = 1.2928878f * n281;
        array[24] = n346 + n347;
        array[7] = n348 - n347;
        final float n349 = n287 + n285;
        final float n350 = 0.6970633f * n287;
        final float n351 = 0.26671275f * n349;
        final float n352 = 1.2304888f * n285;
        array[26] = n350 + n351;
        array[5] = n352 - n351;
        final float n353 = n291 + n289;
        final float n354 = 0.81431574f * n291;
        final float n355 = 0.17096189f * n353;
        final float n356 = 1.1562395f * n289;
        array[28] = n354 + n355;
        array[3] = n356 - n355;
        final float n357 = n295 + n293;
        final float n358 = 0.9237259f * n295;
        final float n359 = 0.07356457f * n357;
        final float n360 = 1.070855f * n293;
        array[30] = n358 + n359;
        array[1] = n360 - n359;
    }
    
    private void method19211(final float[] array, final float[] array2) {
        final float n = array2[0] - array2[1];
        final float n2 = array2[2] - array2[1];
        final float n3 = array2[2] - array2[3];
        final float n4 = array2[4] - array2[3];
        final float n5 = array2[4] - array2[5];
        final float n6 = array2[6] - array2[5];
        final float n7 = array2[6] - array2[7];
        final float n8 = array2[8] - array2[7];
        final float n9 = array2[8] - array2[9];
        final float n10 = array2[10] - array2[9];
        final float n11 = array2[10] - array2[11];
        final float n12 = array2[12] - array2[11];
        final float n13 = array2[12] - array2[13];
        final float n14 = array2[14] - array2[13];
        final float n15 = array2[14] - array2[15];
        final float n16 = array2[16] - array2[15];
        final float n17 = array2[16] - array2[17];
        final float n18 = array2[18] - array2[17];
        final float n19 = array2[18] - array2[19];
        final float n20 = array2[20] - array2[19];
        final float n21 = array2[20] - array2[21];
        final float n22 = array2[22] - array2[21];
        final float n23 = array2[22] - array2[23];
        final float n24 = array2[24] - array2[23];
        final float n25 = array2[24] - array2[25];
        final float n26 = array2[26] - array2[25];
        final float n27 = array2[26] - array2[27];
        final float n28 = array2[28] - array2[27];
        final float n29 = array2[28] - array2[29];
        final float n30 = array2[30] - array2[29];
        final float n31 = array2[30] - array2[31];
        final float n32 = 0.70710677f * n16;
        final float n33 = array2[0] - n32;
        final float n34 = array2[0] + n32;
        final float n35 = n8 + n24;
        final float n36 = 1.306563f * n8;
        final float n37 = -0.9238795f * n35;
        final float n38 = -0.5411961f * n24;
        final float n39 = n36 + n37;
        final float n40 = n38 - n37;
        final float n41 = n34 - n40;
        final float n42 = n34 + n40;
        final float n43 = n33 - n39;
        final float n44 = n33 + n39;
        final float n45 = n12 - n20;
        final float n46 = 0.70710677f * (n12 + n20);
        final float n47 = n4 - n46;
        final float n48 = n4 + n46;
        final float n49 = 0.70710677f * n45;
        final float n50 = n49 - n28;
        final float n51 = n49 + n28;
        final float n52 = n51 + n48;
        final float n53 = -0.78569496f * n51;
        final float n54 = 0.98078525f * n52;
        final float n55 = 1.1758755f * n48;
        final float n56 = n53 + n54;
        final float n57 = n55 - n54;
        final float n58 = n50 + n47;
        final float n59 = -0.27589938f * n50;
        final float n60 = 0.8314696f * n58;
        final float n61 = 1.3870399f * n47;
        final float n62 = n59 + n60;
        final float n63 = n61 - n60;
        final float n64 = n42 - n56;
        final float n65 = n42 + n56;
        final float n66 = n44 - n62;
        final float n67 = n44 + n62;
        final float n68 = n43 - n63;
        final float n69 = n43 + n63;
        final float n70 = n41 - n57;
        final float n71 = n41 + n57;
        final float n72 = n6 - n10;
        final float n73 = n6 + n10;
        final float n74 = n14 - n18;
        final float n75 = n14 + n18;
        final float n76 = n22 - n26;
        final float n77 = n22 + n26;
        final float n78 = 0.70710677f * n75;
        final float n79 = n2 - n78;
        final float n80 = n2 + n78;
        final float n81 = n73 + n77;
        final float n82 = 1.306563f * n73;
        final float n83 = -0.9238795f * n81;
        final float n84 = -0.5411961f * n77;
        final float n85 = n82 + n83;
        final float n86 = n84 - n83;
        final float n87 = n80 - n86;
        final float n88 = n80 + n86;
        final float n89 = n79 - n85;
        final float n90 = n79 + n85;
        final float n91 = 0.70710677f * n74;
        final float n92 = n30 - n91;
        final float n93 = n30 + n91;
        final float n94 = n76 + n72;
        final float n95 = 1.306563f * n76;
        final float n96 = -0.9238795f * n94;
        final float n97 = -0.5411961f * n72;
        final float n98 = n95 + n96;
        final float n99 = n97 - n96;
        final float n100 = n93 - n99;
        final float n101 = n93 + n99;
        final float n102 = n92 - n98;
        final float n103 = n92 + n98;
        final float n104 = n101 + n88;
        final float n105 = -0.89716756f * n101;
        final float n106 = 0.9951847f * n104;
        final float n107 = 1.0932019f * n88;
        final float n108 = n105 + n106;
        final float n109 = n107 - n106;
        final float n110 = n90 - n103;
        final float n111 = -0.66665566f * n103;
        final float n112 = 0.95694035f * n110;
        final float n113 = 1.247225f * n90;
        final float n114 = n112 - n111;
        final float n115 = n113 - n112;
        final float n116 = n102 + n89;
        final float n117 = -0.41052452f * n102;
        final float n118 = 0.8819213f * n116;
        final float n119 = 1.353318f * n89;
        final float n120 = n117 + n118;
        final float n121 = n119 - n118;
        final float n122 = n87 - n100;
        final float n123 = -0.13861717f * n100;
        final float n124 = 0.77301043f * n122;
        final float n125 = 1.4074037f * n87;
        final float n126 = n124 - n123;
        final float n127 = n125 - n124;
        final float n128 = n65 - n108;
        final float n129 = n65 + n108;
        final float n130 = n67 - n114;
        final float n131 = n67 + n114;
        final float n132 = n69 - n120;
        final float n133 = n69 + n120;
        final float n134 = n71 - n126;
        final float n135 = n71 + n126;
        final float n136 = n70 - n127;
        final float n137 = n70 + n127;
        final float n138 = n68 - n121;
        final float n139 = n68 + n121;
        final float n140 = n66 - n115;
        final float n141 = n66 + n115;
        final float n142 = n64 - n109;
        final float n143 = n64 + n109;
        final float n144 = n + n31;
        final float n145 = 1.0478631f * n;
        final float n146 = -0.99879545f * n144;
        final float n147 = -0.9497278f * n31;
        final float n148 = n145 + n146;
        final float n149 = n147 - n146;
        final float n150 = n5 + n27;
        final float n151 = 1.2130114f * n5;
        final float n152 = -0.97003126f * n150;
        final float n153 = -0.7270511f * n27;
        final float n154 = n151 + n152;
        final float n155 = n153 - n152;
        final float n156 = n9 + n23;
        final float n157 = 1.3315444f * n9;
        final float n158 = -0.9039893f * n156;
        final float n159 = -0.4764342f * n23;
        final float n160 = n157 + n158;
        final float n161 = n159 - n158;
        final float n162 = n13 + n19;
        final float n163 = 1.3989068f * n13;
        final float n164 = -0.8032075f * n162;
        final float n165 = -0.20750822f * n19;
        final float n166 = n163 + n164;
        final float n167 = n165 - n164;
        final float n168 = n17 + n15;
        final float n169 = 1.41251f * n17;
        final float n170 = -0.671559f * n168;
        final float n171 = 0.06939217f * n15;
        final float n172 = n169 + n170;
        final float n173 = n171 - n170;
        final float n174 = n21 + n11;
        final float n175 = 1.3718313f * n21;
        final float n176 = -0.51410276f * n174;
        final float n177 = 0.34362587f * n11;
        final float n178 = n175 + n176;
        final float n179 = n177 - n176;
        final float n180 = n25 + n7;
        final float n181 = 1.2784339f * n25;
        final float n182 = -0.33688986f * n180;
        final float n183 = 0.6046542f * n7;
        final float n184 = n181 + n182;
        final float n185 = n183 - n182;
        final float n186 = n29 + n3;
        final float n187 = 1.1359069f * n29;
        final float n188 = -0.14673047f * n186;
        final float n189 = 0.842446f * n3;
        final float n190 = n187 + n188;
        final float n191 = n189 - n188;
        final float n192 = n149 - n173;
        final float n193 = n149 + n173;
        final float n194 = n148 - n172;
        final float n195 = n148 + n172;
        final float n196 = n155 - n179;
        final float n197 = n155 + n179;
        final float n198 = n154 - n178;
        final float n199 = n154 + n178;
        final float n200 = n161 - n185;
        final float n201 = n161 + n185;
        final float n202 = n160 - n184;
        final float n203 = n160 + n184;
        final float n204 = n167 - n191;
        final float n205 = n167 + n191;
        final float n206 = n166 - n190;
        final float n207 = n166 + n190;
        final float n208 = n192 + n194;
        final float n209 = 1.1758755f * n192;
        final float n210 = -0.98078525f * n208;
        final float n211 = -0.78569496f * n194;
        final float n212 = n209 + n210;
        final float n213 = n211 - n210;
        final float n214 = n196 + n198;
        final float n215 = 1.3870399f * n196;
        final float n216 = -0.55557024f * n214;
        final float n217 = 0.27589938f * n198;
        final float n218 = n215 + n216;
        final float n219 = n217 - n216;
        final float n220 = n200 + n202;
        final float n221 = 0.78569496f * n200;
        final float n222 = 0.19509032f * n220;
        final float n223 = 1.1758755f * n202;
        final float n224 = n221 + n222;
        final float n225 = n223 - n222;
        final float n226 = n204 + n206;
        final float n227 = -0.27589938f * n204;
        final float n228 = 0.8314696f * n226;
        final float n229 = 1.3870399f * n206;
        final float n230 = n227 + n228;
        final float n231 = n229 - n228;
        final float n232 = n193 - n201;
        final float n233 = n193 + n201;
        final float n234 = n195 - n203;
        final float n235 = n195 + n203;
        final float n236 = n197 - n205;
        final float n237 = n197 + n205;
        final float n238 = n199 - n207;
        final float n239 = n199 + n207;
        final float n240 = n213 - n225;
        final float n241 = n213 + n225;
        final float n242 = n212 - n224;
        final float n243 = n212 + n224;
        final float n244 = n219 - n231;
        final float n245 = n219 + n231;
        final float n246 = n218 - n230;
        final float n247 = n218 + n230;
        final float n248 = n232 + n234;
        final float n249 = 1.306563f * n232;
        final float n250 = -0.9238795f * n248;
        final float n251 = -0.5411961f * n234;
        final float n252 = n249 + n250;
        final float n253 = n251 - n250;
        final float n254 = n236 + n238;
        final float n255 = 0.5411961f * n236;
        final float n256 = 0.38268343f * n254;
        final float n257 = 1.306563f * n238;
        final float n258 = n255 + n256;
        final float n259 = n257 - n256;
        final float n260 = n240 + n242;
        final float n261 = 1.306563f * n240;
        final float n262 = -0.9238795f * n260;
        final float n263 = -0.5411961f * n242;
        final float n264 = n261 + n262;
        final float n265 = n263 - n262;
        final float n266 = n244 + n246;
        final float n267 = 0.5411961f * n244;
        final float n268 = 0.38268343f * n266;
        final float n269 = 1.306563f * n246;
        final float n270 = n267 + n268;
        final float n271 = n269 - n268;
        final float n272 = n233 - n237;
        final float n273 = n233 + n237;
        final float n274 = n235 - n239;
        final float n275 = n235 + n239;
        final float n276 = n253 - n259;
        final float n277 = n253 + n259;
        final float n278 = n252 - n258;
        final float n279 = n252 + n258;
        final float n280 = n241 - n245;
        final float n281 = n241 + n245;
        final float n282 = n243 - n247;
        final float n283 = n243 + n247;
        final float n284 = n265 - n271;
        final float n285 = n265 + n271;
        final float n286 = n264 - n270;
        final float n287 = n264 + n270;
        final float n288 = n272 - n274;
        final float n289 = n272 + n274;
        final float n290 = 0.70710677f * n288;
        final float n291 = 0.70710677f * n289;
        final float n292 = n276 - n278;
        final float n293 = n276 + n278;
        final float n294 = 0.70710677f * n292;
        final float n295 = 0.70710677f * n293;
        final float n296 = n280 - n282;
        final float n297 = n280 + n282;
        final float n298 = 0.70710677f * n296;
        final float n299 = 0.70710677f * n297;
        final float n300 = n284 - n286;
        final float n301 = n284 + n286;
        final float n302 = 0.70710677f * n300;
        final float n303 = 0.70710677f * n301;
        final float n304 = n129 - n273;
        final float n305 = n129 + n273;
        final float n306 = n131 - n281;
        final float n307 = n131 + n281;
        final float n308 = n133 - n285;
        final float n309 = n133 + n285;
        final float n310 = n135 - n277;
        final float n311 = n135 + n277;
        final float n312 = n137 - n295;
        final float n313 = n137 + n295;
        final float n314 = n139 - n303;
        final float n315 = n139 + n303;
        final float n316 = n141 - n299;
        final float n317 = n141 + n299;
        final float n318 = n143 - n291;
        final float n319 = n143 + n291;
        final float n320 = n142 - n290;
        final float n321 = n142 + n290;
        final float n322 = n140 - n298;
        final float n323 = n140 + n298;
        final float n324 = n138 - n302;
        final float n325 = n138 + n302;
        final float n326 = n136 - n294;
        final float n327 = n136 + n294;
        final float n328 = n134 - n279;
        final float n329 = n134 + n279;
        final float n330 = n132 - n287;
        final float n331 = n132 + n287;
        final float n332 = n130 - n283;
        final float n333 = n130 + n283;
        final float n334 = n128 - n275;
        final float n335 = n128 + n275;
        array[31] = 0.5001506f * n305;
        array[30] = 0.50135845f * n307;
        array[29] = 0.5037887f * n309;
        array[28] = 0.50747114f * n311;
        array[27] = 0.51245147f * n313;
        array[26] = 0.5187927f * n315;
        array[25] = 0.5265773f * n317;
        array[24] = 0.53590983f * n319;
        array[23] = 0.5469204f * n321;
        array[22] = 0.5597698f * n323;
        array[21] = 0.5746552f * n325;
        array[20] = 0.5918185f * n327;
        array[19] = 0.61155736f * n329;
        array[18] = 0.63423896f * n331;
        array[17] = 0.6603198f * n333;
        array[16] = 0.6903721f * n335;
        array[15] = 0.72512054f * n334;
        array[14] = 0.76549417f * n332;
        array[13] = 0.8127021f * n330;
        array[12] = 0.8683447f * n328;
        array[11] = 0.9345836f * n326;
        array[10] = 1.0144082f * n324;
        array[9] = 1.1120716f * n322;
        array[8] = 1.2338327f * n320;
        array[7] = 1.3892939f * n318;
        array[6] = 1.5939723f * n316;
        array[5] = 1.874676f * n314;
        array[4] = 2.2820501f * n312;
        array[3] = 2.9246285f * n310;
        array[2] = 4.084611f * n308;
        array[1] = 6.7967505f * n306;
        array[0] = 20.373878f * n304;
    }
    
    static {
        field25571 = new float[][] { { 0.9999247f, -0.012271538f }, { 0.99932235f, -0.036807224f }, { 0.9981181f, -0.061320737f }, { 0.9963126f, -0.08579731f }, { 0.993907f, -0.110222206f }, { 0.99090266f, -0.1345807f }, { 0.9873014f, -0.15885815f }, { 0.9831055f, -0.18303989f }, { 0.9783174f, -0.20711137f }, { 0.97293997f, -0.2310581f }, { 0.96697646f, -0.25486565f }, { 0.9604305f, -0.2785197f }, { 0.953306f, -0.30200595f }, { 0.9456073f, -0.3253103f }, { 0.937339f, -0.34841868f }, { 0.9285061f, -0.3713172f }, { 0.9191139f, -0.39399204f }, { 0.909168f, -0.41642955f }, { 0.8986745f, -0.43861625f }, { 0.88763964f, -0.46053872f }, { 0.8760701f, -0.48218378f }, { 0.86397284f, -0.50353837f }, { 0.8513552f, -0.52458966f }, { 0.8382247f, -0.545325f }, { 0.8245893f, -0.5657318f }, { 0.81045717f, -0.58579785f }, { 0.7958369f, -0.60551107f }, { 0.7807372f, -0.6248595f }, { 0.76516724f, -0.64383155f }, { 0.7491364f, -0.6624158f }, { 0.7326543f, -0.680601f }, { 0.71573085f, -0.69837624f } };
    }
}