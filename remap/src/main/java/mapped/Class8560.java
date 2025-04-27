// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.math.BigDecimal;

public final class Class8560
{
    private final float[] field35940;
    private final float[] field35941;
    private float[] field35942;
    private int field35943;
    private final float[] field35944;
    private final int field35945;
    private final float field35946;
    private float[] field35947;
    private final float[] field35948;
    private static final double field35949 = 3.141592653589793;
    private static final float field35950;
    private static final float field35951;
    private static final float field35952;
    private static final float field35953;
    private static final float field35954;
    private static final float field35955;
    private static final float field35956;
    private static final float field35957;
    private static final float field35958;
    private static final float field35959;
    private static final float field35960;
    private static final float field35961;
    private static final float field35962;
    private static final float field35963;
    private static final float field35964;
    private static final float field35965;
    private static final float field35966;
    private static final float field35967;
    private static final float field35968;
    private static final float field35969;
    private static final float field35970;
    private static final float field35971;
    private static final float field35972;
    private static final float field35973;
    private static final float field35974;
    private static final float field35975;
    private static final float field35976;
    private static final float field35977;
    private static final float field35978;
    private static final float field35979;
    private static final float field35980;
    private static float[] field35981;
    private static float[][] field35982;
    
    public Class8560(final int field35945, final float field35946, final float[] array) {
        this.field35948 = new float[32];
        if (Class8560.field35981 == null) {
            Class8560.field35981 = method28776();
            Class8560.field35982 = method28777(Class8560.field35981, 16);
        }
        this.field35940 = new float[512];
        this.field35941 = new float[512];
        this.field35944 = new float[32];
        this.field35945 = field35945;
        this.field35946 = field35946;
        this.method28752(this.field35947);
        this.method28753();
    }
    
    public void method28752(final float[] field35947) {
        this.field35947 = field35947;
        if (this.field35947 == null) {
            this.field35947 = new float[32];
            for (int i = 0; i < 32; ++i) {
                this.field35947[i] = 1.0f;
            }
        }
        if (this.field35947.length >= 32) {
            return;
        }
        throw new IllegalArgumentException("eq0");
    }
    
    public void method28753() {
        for (int i = 0; i < 512; ++i) {
            this.field35940[i] = (this.field35941[i] = 0.0f);
        }
        for (int j = 0; j < 32; ++j) {
            this.field35944[j] = 0.0f;
        }
        this.field35942 = this.field35940;
        this.field35943 = 15;
    }
    
    public void method28754(final float n, final int n2) {
        this.field35944[n2] = this.field35947[n2] * n;
    }
    
    public void method28755(final float[] array) {
        for (int i = 31; i >= 0; --i) {
            this.field35944[i] = array[i] * this.field35947[i];
        }
    }
    
    private void method28756() {
        final float[] field35944 = this.field35944;
        final float n = field35944[0];
        final float n2 = field35944[1];
        final float n3 = field35944[2];
        final float n4 = field35944[3];
        final float n5 = field35944[4];
        final float n6 = field35944[5];
        final float n7 = field35944[6];
        final float n8 = field35944[7];
        final float n9 = field35944[8];
        final float n10 = field35944[9];
        final float n11 = field35944[10];
        final float n12 = field35944[11];
        final float n13 = field35944[12];
        final float n14 = field35944[13];
        final float n15 = field35944[14];
        final float n16 = field35944[15];
        final float n17 = field35944[16];
        final float n18 = field35944[17];
        final float n19 = field35944[18];
        final float n20 = field35944[19];
        final float n21 = field35944[20];
        final float n22 = field35944[21];
        final float n23 = field35944[22];
        final float n24 = field35944[23];
        final float n25 = field35944[24];
        final float n26 = field35944[25];
        final float n27 = field35944[26];
        final float n28 = field35944[27];
        final float n29 = field35944[28];
        final float n30 = field35944[29];
        final float n31 = field35944[30];
        final float n32 = field35944[31];
        final float n33 = n + n32;
        final float n34 = n2 + n31;
        final float n35 = n3 + n30;
        final float n36 = n4 + n29;
        final float n37 = n5 + n28;
        final float n38 = n6 + n27;
        final float n39 = n7 + n26;
        final float n40 = n8 + n25;
        final float n41 = n9 + n24;
        final float n42 = n10 + n23;
        final float n43 = n11 + n22;
        final float n44 = n12 + n21;
        final float n45 = n13 + n20;
        final float n46 = n14 + n19;
        final float n47 = n15 + n18;
        final float n48 = n16 + n17;
        final float n49 = n33 + n48;
        final float n50 = n34 + n47;
        final float n51 = n35 + n46;
        final float n52 = n36 + n45;
        final float n53 = n37 + n44;
        final float n54 = n38 + n43;
        final float n55 = n39 + n42;
        final float n56 = n40 + n41;
        final float n57 = (n33 - n48) * Class8560.field35966;
        final float n58 = (n34 - n47) * Class8560.field35967;
        final float n59 = (n35 - n46) * Class8560.field35968;
        final float n60 = (n36 - n45) * Class8560.field35969;
        final float n61 = (n37 - n44) * Class8560.field35970;
        final float n62 = (n38 - n43) * Class8560.field35971;
        final float n63 = (n39 - n42) * Class8560.field35972;
        final float n64 = (n40 - n41) * Class8560.field35973;
        final float n65 = n49 + n56;
        final float n66 = n50 + n55;
        final float n67 = n51 + n54;
        final float n68 = n52 + n53;
        final float n69 = (n49 - n56) * Class8560.field35974;
        final float n70 = (n50 - n55) * Class8560.field35975;
        final float n71 = (n51 - n54) * Class8560.field35976;
        final float n72 = (n52 - n53) * Class8560.field35977;
        final float n73 = n57 + n64;
        final float n74 = n58 + n63;
        final float n75 = n59 + n62;
        final float n76 = n60 + n61;
        final float n77 = (n57 - n64) * Class8560.field35974;
        final float n78 = (n58 - n63) * Class8560.field35975;
        final float n79 = (n59 - n62) * Class8560.field35976;
        final float n80 = (n60 - n61) * Class8560.field35977;
        final float n81 = n65 + n68;
        final float n82 = n66 + n67;
        final float n83 = (n65 - n68) * Class8560.field35978;
        final float n84 = (n66 - n67) * Class8560.field35979;
        final float n85 = n69 + n72;
        final float n86 = n70 + n71;
        final float n87 = (n69 - n72) * Class8560.field35978;
        final float n88 = (n70 - n71) * Class8560.field35979;
        final float n89 = n73 + n76;
        final float n90 = n74 + n75;
        final float n91 = (n73 - n76) * Class8560.field35978;
        final float n92 = (n74 - n75) * Class8560.field35979;
        final float n93 = n77 + n80;
        final float n94 = n78 + n79;
        final float n95 = (n77 - n80) * Class8560.field35978;
        final float n96 = (n78 - n79) * Class8560.field35979;
        final float n97 = n81 + n82;
        final float n98 = (n81 - n82) * Class8560.field35980;
        final float n99 = n83 + n84;
        final float n100 = (n83 - n84) * Class8560.field35980;
        final float n101 = n85 + n86;
        final float n102 = (n85 - n86) * Class8560.field35980;
        final float n103 = n87 + n88;
        final float n104 = (n87 - n88) * Class8560.field35980;
        final float n105 = n89 + n90;
        final float n106 = (n89 - n90) * Class8560.field35980;
        final float n107 = n91 + n92;
        final float n108 = (n91 - n92) * Class8560.field35980;
        final float n109 = n93 + n94;
        final float n110 = (n93 - n94) * Class8560.field35980;
        final float n111 = n95 + n96;
        final float n112 = (n95 - n96) * Class8560.field35980;
        final float n115;
        final float n114;
        final float n113 = -(n114 = (n115 = n104) + n102) - n103;
        final float n116 = -n103 - n104 - n101;
        final float n119;
        final float n118;
        final float n117 = (n118 = (n119 = n112) + n108) + n110;
        final float n121;
        final float n120 = -(n121 = n112 + n110 + n106) - n111;
        final float n123;
        final float n122 = (n123 = -n111 - n112 - n107 - n108) - n110;
        final float n124 = -n111 - n112 - n109 - n105;
        final float n125 = n123 - n109;
        final float n126 = -n97;
        final float n127 = n98;
        final float n129;
        final float n128 = -(n129 = n100) - n99;
        final float n130 = (n - n32) * Class8560.field35950;
        final float n131 = (n2 - n31) * Class8560.field35951;
        final float n132 = (n3 - n30) * Class8560.field35952;
        final float n133 = (n4 - n29) * Class8560.field35953;
        final float n134 = (n5 - n28) * Class8560.field35954;
        final float n135 = (n6 - n27) * Class8560.field35955;
        final float n136 = (n7 - n26) * Class8560.field35956;
        final float n137 = (n8 - n25) * Class8560.field35957;
        final float n138 = (n9 - n24) * Class8560.field35958;
        final float n139 = (n10 - n23) * Class8560.field35959;
        final float n140 = (n11 - n22) * Class8560.field35960;
        final float n141 = (n12 - n21) * Class8560.field35961;
        final float n142 = (n13 - n20) * Class8560.field35962;
        final float n143 = (n14 - n19) * Class8560.field35963;
        final float n144 = (n15 - n18) * Class8560.field35964;
        final float n145 = (n16 - n17) * Class8560.field35965;
        final float n146 = n130 + n145;
        final float n147 = n131 + n144;
        final float n148 = n132 + n143;
        final float n149 = n133 + n142;
        final float n150 = n134 + n141;
        final float n151 = n135 + n140;
        final float n152 = n136 + n139;
        final float n153 = n137 + n138;
        final float n154 = (n130 - n145) * Class8560.field35966;
        final float n155 = (n131 - n144) * Class8560.field35967;
        final float n156 = (n132 - n143) * Class8560.field35968;
        final float n157 = (n133 - n142) * Class8560.field35969;
        final float n158 = (n134 - n141) * Class8560.field35970;
        final float n159 = (n135 - n140) * Class8560.field35971;
        final float n160 = (n136 - n139) * Class8560.field35972;
        final float n161 = (n137 - n138) * Class8560.field35973;
        final float n162 = n146 + n153;
        final float n163 = n147 + n152;
        final float n164 = n148 + n151;
        final float n165 = n149 + n150;
        final float n166 = (n146 - n153) * Class8560.field35974;
        final float n167 = (n147 - n152) * Class8560.field35975;
        final float n168 = (n148 - n151) * Class8560.field35976;
        final float n169 = (n149 - n150) * Class8560.field35977;
        final float n170 = n154 + n161;
        final float n171 = n155 + n160;
        final float n172 = n156 + n159;
        final float n173 = n157 + n158;
        final float n174 = (n154 - n161) * Class8560.field35974;
        final float n175 = (n155 - n160) * Class8560.field35975;
        final float n176 = (n156 - n159) * Class8560.field35976;
        final float n177 = (n157 - n158) * Class8560.field35977;
        final float n178 = n162 + n165;
        final float n179 = n163 + n164;
        final float n180 = (n162 - n165) * Class8560.field35978;
        final float n181 = (n163 - n164) * Class8560.field35979;
        final float n182 = n166 + n169;
        final float n183 = n167 + n168;
        final float n184 = (n166 - n169) * Class8560.field35978;
        final float n185 = (n167 - n168) * Class8560.field35979;
        final float n186 = n170 + n173;
        final float n187 = n171 + n172;
        final float n188 = (n170 - n173) * Class8560.field35978;
        final float n189 = (n171 - n172) * Class8560.field35979;
        final float n190 = n174 + n177;
        final float n191 = n175 + n176;
        final float n192 = (n174 - n177) * Class8560.field35978;
        final float n193 = (n175 - n176) * Class8560.field35979;
        final float n194 = n178 + n179;
        final float n195 = (n178 - n179) * Class8560.field35980;
        final float n196 = n180 + n181;
        final float n197 = (n180 - n181) * Class8560.field35980;
        final float n198 = n182 + n183;
        final float n199 = (n182 - n183) * Class8560.field35980;
        final float n200 = n184 + n185;
        final float n201 = (n184 - n185) * Class8560.field35980;
        final float n202 = n186 + n187;
        final float n203 = (n186 - n187) * Class8560.field35980;
        final float n204 = n188 + n189;
        final float n205 = (n188 - n189) * Class8560.field35980;
        final float n206 = n190 + n191;
        final float n207 = (n190 - n191) * Class8560.field35980;
        final float n208 = n192 + n193;
        final float n209 = (n192 - n193) * Class8560.field35980;
        final float n213;
        final float n212;
        final float n211;
        final float n210 = (n211 = (n212 = (n213 = n209) + n201) + n205) + n199 + n207;
        final float n215;
        final float n214 = (n215 = n209 + n205 + n197) + n207;
        final float n218;
        final float n217;
        final float n216 = -(n217 = (n218 = n207 + n209 + n203) + n195) - n208;
        final float n220;
        final float n219 = -(n220 = n218 + n199 + n201) - n200 - n208;
        final float n222;
        final float n221 = (n222 = -n204 - n205 - n208 - n209) - n207 - n196 - n197;
        final float n223 = n222 - n207 - n199 - n200 - n201;
        final float n224 = n222 - n206 - n196 - n197;
        final float n226;
        final float n225 = n222 - n206 - (n226 = n198 + n200 + n201);
        final float n228;
        final float n227 = (n228 = -n202 - n206 - n208 - n209) - n194;
        final float n229 = n228 - n226;
        final float[] field35945 = this.field35942;
        final int field35946 = this.field35943;
        field35945[field35946] = n127;
        field35945[16 + field35946] = n217;
        field35945[32 + field35946] = n121;
        field35945[48 + field35946] = n220;
        field35945[64 + field35946] = n114;
        field35945[80 + field35946] = n210;
        field35945[96 + field35946] = n117;
        field35945[112 + field35946] = n214;
        field35945[128 + field35946] = n129;
        field35945[144 + field35946] = n215;
        field35945[160 + field35946] = n118;
        field35945[176 + field35946] = n211;
        field35945[192 + field35946] = n115;
        field35945[208 + field35946] = n212;
        field35945[224 + field35946] = n119;
        field35945[240 + field35946] = n213;
        field35945[256 + field35946] = 0.0f;
        field35945[272 + field35946] = -n213;
        field35945[288 + field35946] = -n119;
        field35945[304 + field35946] = -n212;
        field35945[320 + field35946] = -n115;
        field35945[336 + field35946] = -n211;
        field35945[352 + field35946] = -n118;
        field35945[368 + field35946] = -n215;
        field35945[384 + field35946] = -n129;
        field35945[400 + field35946] = -n214;
        field35945[416 + field35946] = -n117;
        field35945[432 + field35946] = -n210;
        field35945[448 + field35946] = -n114;
        field35945[464 + field35946] = -n220;
        field35945[480 + field35946] = -n121;
        field35945[496 + field35946] = -n217;
        final float[] array = (this.field35942 != this.field35940) ? this.field35940 : this.field35941;
        array[field35946] = -n127;
        array[16 + field35946] = n216;
        array[32 + field35946] = n120;
        array[48 + field35946] = n219;
        array[64 + field35946] = n113;
        array[80 + field35946] = n223;
        array[96 + field35946] = n122;
        array[112 + field35946] = n221;
        array[128 + field35946] = n128;
        array[144 + field35946] = n224;
        array[160 + field35946] = n125;
        array[176 + field35946] = n225;
        array[192 + field35946] = n116;
        array[208 + field35946] = n229;
        array[224 + field35946] = n124;
        array[240 + field35946] = n227;
        array[256 + field35946] = n126;
        array[272 + field35946] = n227;
        array[288 + field35946] = n124;
        array[304 + field35946] = n229;
        array[320 + field35946] = n116;
        array[336 + field35946] = n225;
        array[352 + field35946] = n125;
        array[368 + field35946] = n224;
        array[384 + field35946] = n128;
        array[400 + field35946] = n221;
        array[416 + field35946] = n122;
        array[432 + field35946] = n223;
        array[448 + field35946] = n113;
        array[464 + field35946] = n219;
        array[480 + field35946] = n120;
        array[496 + field35946] = n216;
    }
    
    private void method28757() {
        final float[] array = new float[32];
        final float[] array2 = new float[16];
        final float[] array3 = new float[16];
        for (int i = 31; i >= 0; --i) {
            array[i] = 0.0f;
        }
        final float[] field35944 = this.field35944;
        array2[0] = field35944[0] + field35944[31];
        array2[1] = field35944[1] + field35944[30];
        array2[2] = field35944[2] + field35944[29];
        array2[3] = field35944[3] + field35944[28];
        array2[4] = field35944[4] + field35944[27];
        array2[5] = field35944[5] + field35944[26];
        array2[6] = field35944[6] + field35944[25];
        array2[7] = field35944[7] + field35944[24];
        array2[8] = field35944[8] + field35944[23];
        array2[9] = field35944[9] + field35944[22];
        array2[10] = field35944[10] + field35944[21];
        array2[11] = field35944[11] + field35944[20];
        array2[12] = field35944[12] + field35944[19];
        array2[13] = field35944[13] + field35944[18];
        array2[14] = field35944[14] + field35944[17];
        array2[15] = field35944[15] + field35944[16];
        array3[0] = array2[0] + array2[15];
        array3[1] = array2[1] + array2[14];
        array3[2] = array2[2] + array2[13];
        array3[3] = array2[3] + array2[12];
        array3[4] = array2[4] + array2[11];
        array3[5] = array2[5] + array2[10];
        array3[6] = array2[6] + array2[9];
        array3[7] = array2[7] + array2[8];
        array3[8] = (array2[0] - array2[15]) * Class8560.field35966;
        array3[9] = (array2[1] - array2[14]) * Class8560.field35967;
        array3[10] = (array2[2] - array2[13]) * Class8560.field35968;
        array3[11] = (array2[3] - array2[12]) * Class8560.field35969;
        array3[12] = (array2[4] - array2[11]) * Class8560.field35970;
        array3[13] = (array2[5] - array2[10]) * Class8560.field35971;
        array3[14] = (array2[6] - array2[9]) * Class8560.field35972;
        array3[15] = (array2[7] - array2[8]) * Class8560.field35973;
        array2[0] = array3[0] + array3[7];
        array2[1] = array3[1] + array3[6];
        array2[2] = array3[2] + array3[5];
        array2[3] = array3[3] + array3[4];
        array2[4] = (array3[0] - array3[7]) * Class8560.field35974;
        array2[5] = (array3[1] - array3[6]) * Class8560.field35975;
        array2[6] = (array3[2] - array3[5]) * Class8560.field35976;
        array2[7] = (array3[3] - array3[4]) * Class8560.field35977;
        array2[8] = array3[8] + array3[15];
        array2[9] = array3[9] + array3[14];
        array2[10] = array3[10] + array3[13];
        array2[11] = array3[11] + array3[12];
        array2[12] = (array3[8] - array3[15]) * Class8560.field35974;
        array2[13] = (array3[9] - array3[14]) * Class8560.field35975;
        array2[14] = (array3[10] - array3[13]) * Class8560.field35976;
        array2[15] = (array3[11] - array3[12]) * Class8560.field35977;
        array3[0] = array2[0] + array2[3];
        array3[1] = array2[1] + array2[2];
        array3[2] = (array2[0] - array2[3]) * Class8560.field35978;
        array3[3] = (array2[1] - array2[2]) * Class8560.field35979;
        array3[4] = array2[4] + array2[7];
        array3[5] = array2[5] + array2[6];
        array3[6] = (array2[4] - array2[7]) * Class8560.field35978;
        array3[7] = (array2[5] - array2[6]) * Class8560.field35979;
        array3[8] = array2[8] + array2[11];
        array3[9] = array2[9] + array2[10];
        array3[10] = (array2[8] - array2[11]) * Class8560.field35978;
        array3[11] = (array2[9] - array2[10]) * Class8560.field35979;
        array3[12] = array2[12] + array2[15];
        array3[13] = array2[13] + array2[14];
        array3[14] = (array2[12] - array2[15]) * Class8560.field35978;
        array3[15] = (array2[13] - array2[14]) * Class8560.field35979;
        array2[0] = array3[0] + array3[1];
        array2[1] = (array3[0] - array3[1]) * Class8560.field35980;
        array2[2] = array3[2] + array3[3];
        array2[3] = (array3[2] - array3[3]) * Class8560.field35980;
        array2[4] = array3[4] + array3[5];
        array2[5] = (array3[4] - array3[5]) * Class8560.field35980;
        array2[6] = array3[6] + array3[7];
        array2[7] = (array3[6] - array3[7]) * Class8560.field35980;
        array2[8] = array3[8] + array3[9];
        array2[9] = (array3[8] - array3[9]) * Class8560.field35980;
        array2[10] = array3[10] + array3[11];
        array2[11] = (array3[10] - array3[11]) * Class8560.field35980;
        array2[12] = array3[12] + array3[13];
        array2[13] = (array3[12] - array3[13]) * Class8560.field35980;
        array2[14] = array3[14] + array3[15];
        array2[15] = (array3[14] - array3[15]) * Class8560.field35980;
        final float[] array4 = array;
        final int n = 19;
        final float[] array5 = array;
        final int n2 = 4;
        final float[] array6 = array;
        final int n3 = 12;
        final float n4 = array2[7];
        array6[n3] = n4;
        final float n5 = n4 + array2[5];
        array5[n2] = n5;
        array4[n] = -n5 - array2[6];
        array[27] = -array2[6] - array2[7] - array2[4];
        final float[] array7 = array;
        final int n6 = 6;
        final float[] array8 = array;
        final int n7 = 10;
        final float[] array9 = array;
        final int n8 = 14;
        final float n9 = array2[15];
        array9[n8] = n9;
        final float n10 = n9 + array2[11];
        array8[n7] = n10;
        array7[n6] = n10 + array2[13];
        final float[] array10 = array;
        final int n11 = 17;
        final float[] array11 = array;
        final int n12 = 2;
        final float n13 = array2[15] + array2[13] + array2[9];
        array11[n12] = n13;
        array10[n11] = -n13 - array2[14];
        final float n14;
        array[21] = (n14 = -array2[14] - array2[15] - array2[10] - array2[11]) - array2[13];
        array[29] = -array2[14] - array2[15] - array2[12] - array2[8];
        array[25] = n14 - array2[12];
        array[31] = -array2[0];
        array[0] = array2[1];
        final float[] array12 = array;
        final int n15 = 23;
        final float[] array13 = array;
        final int n16 = 8;
        final float n17 = array2[3];
        array13[n16] = n17;
        array12[n15] = -n17 - array2[2];
        array2[0] = (field35944[0] - field35944[31]) * Class8560.field35950;
        array2[1] = (field35944[1] - field35944[30]) * Class8560.field35951;
        array2[2] = (field35944[2] - field35944[29]) * Class8560.field35952;
        array2[3] = (field35944[3] - field35944[28]) * Class8560.field35953;
        array2[4] = (field35944[4] - field35944[27]) * Class8560.field35954;
        array2[5] = (field35944[5] - field35944[26]) * Class8560.field35955;
        array2[6] = (field35944[6] - field35944[25]) * Class8560.field35956;
        array2[7] = (field35944[7] - field35944[24]) * Class8560.field35957;
        array2[8] = (field35944[8] - field35944[23]) * Class8560.field35958;
        array2[9] = (field35944[9] - field35944[22]) * Class8560.field35959;
        array2[10] = (field35944[10] - field35944[21]) * Class8560.field35960;
        array2[11] = (field35944[11] - field35944[20]) * Class8560.field35961;
        array2[12] = (field35944[12] - field35944[19]) * Class8560.field35962;
        array2[13] = (field35944[13] - field35944[18]) * Class8560.field35963;
        array2[14] = (field35944[14] - field35944[17]) * Class8560.field35964;
        array2[15] = (field35944[15] - field35944[16]) * Class8560.field35965;
        array3[0] = array2[0] + array2[15];
        array3[1] = array2[1] + array2[14];
        array3[2] = array2[2] + array2[13];
        array3[3] = array2[3] + array2[12];
        array3[4] = array2[4] + array2[11];
        array3[5] = array2[5] + array2[10];
        array3[6] = array2[6] + array2[9];
        array3[7] = array2[7] + array2[8];
        array3[8] = (array2[0] - array2[15]) * Class8560.field35966;
        array3[9] = (array2[1] - array2[14]) * Class8560.field35967;
        array3[10] = (array2[2] - array2[13]) * Class8560.field35968;
        array3[11] = (array2[3] - array2[12]) * Class8560.field35969;
        array3[12] = (array2[4] - array2[11]) * Class8560.field35970;
        array3[13] = (array2[5] - array2[10]) * Class8560.field35971;
        array3[14] = (array2[6] - array2[9]) * Class8560.field35972;
        array3[15] = (array2[7] - array2[8]) * Class8560.field35973;
        array2[0] = array3[0] + array3[7];
        array2[1] = array3[1] + array3[6];
        array2[2] = array3[2] + array3[5];
        array2[3] = array3[3] + array3[4];
        array2[4] = (array3[0] - array3[7]) * Class8560.field35974;
        array2[5] = (array3[1] - array3[6]) * Class8560.field35975;
        array2[6] = (array3[2] - array3[5]) * Class8560.field35976;
        array2[7] = (array3[3] - array3[4]) * Class8560.field35977;
        array2[8] = array3[8] + array3[15];
        array2[9] = array3[9] + array3[14];
        array2[10] = array3[10] + array3[13];
        array2[11] = array3[11] + array3[12];
        array2[12] = (array3[8] - array3[15]) * Class8560.field35974;
        array2[13] = (array3[9] - array3[14]) * Class8560.field35975;
        array2[14] = (array3[10] - array3[13]) * Class8560.field35976;
        array2[15] = (array3[11] - array3[12]) * Class8560.field35977;
        array3[0] = array2[0] + array2[3];
        array3[1] = array2[1] + array2[2];
        array3[2] = (array2[0] - array2[3]) * Class8560.field35978;
        array3[3] = (array2[1] - array2[2]) * Class8560.field35979;
        array3[4] = array2[4] + array2[7];
        array3[5] = array2[5] + array2[6];
        array3[6] = (array2[4] - array2[7]) * Class8560.field35978;
        array3[7] = (array2[5] - array2[6]) * Class8560.field35979;
        array3[8] = array2[8] + array2[11];
        array3[9] = array2[9] + array2[10];
        array3[10] = (array2[8] - array2[11]) * Class8560.field35978;
        array3[11] = (array2[9] - array2[10]) * Class8560.field35979;
        array3[12] = array2[12] + array2[15];
        array3[13] = array2[13] + array2[14];
        array3[14] = (array2[12] - array2[15]) * Class8560.field35978;
        array3[15] = (array2[13] - array2[14]) * Class8560.field35979;
        array2[0] = array3[0] + array3[1];
        array2[1] = (array3[0] - array3[1]) * Class8560.field35980;
        array2[2] = array3[2] + array3[3];
        array2[3] = (array3[2] - array3[3]) * Class8560.field35980;
        array2[4] = array3[4] + array3[5];
        array2[5] = (array3[4] - array3[5]) * Class8560.field35980;
        array2[6] = array3[6] + array3[7];
        array2[7] = (array3[6] - array3[7]) * Class8560.field35980;
        array2[8] = array3[8] + array3[9];
        array2[9] = (array3[8] - array3[9]) * Class8560.field35980;
        array2[10] = array3[10] + array3[11];
        array2[11] = (array3[10] - array3[11]) * Class8560.field35980;
        array2[12] = array3[12] + array3[13];
        array2[13] = (array3[12] - array3[13]) * Class8560.field35980;
        array2[14] = array3[14] + array3[15];
        array2[15] = (array3[14] - array3[15]) * Class8560.field35980;
        final float[] array14 = array;
        final int n18 = 5;
        final float[] array15 = array;
        final int n19 = 11;
        final float[] array16 = array;
        final int n20 = 13;
        final float[] array17 = array;
        final int n21 = 15;
        final float n22 = array2[15];
        array17[n21] = n22;
        final float n23 = n22 + array2[7];
        array16[n20] = n23;
        final float n24 = n23 + array2[11];
        array15[n19] = n24;
        array14[n18] = n24 + array2[5] + array2[13];
        final float[] array18 = array;
        final int n25 = 7;
        final float[] array19 = array;
        final int n26 = 9;
        final float n27 = array2[15] + array2[11] + array2[3];
        array19[n26] = n27;
        array18[n25] = n27 + array2[13];
        final float[] array20 = array;
        final int n28 = 16;
        final float[] array21 = array;
        final int n29 = 1;
        final float n31;
        final float n30 = (n31 = array2[13] + array2[15] + array2[9]) + array2[1];
        array21[n29] = n30;
        array20[n28] = -n30 - array2[14];
        final float[] array22 = array;
        final int n32 = 18;
        final float[] array23 = array;
        final int n33 = 3;
        final float n34 = n31 + array2[5] + array2[7];
        array23[n33] = n34;
        array22[n32] = -n34 - array2[6] - array2[14];
        final float n35;
        array[22] = (n35 = -array2[10] - array2[11] - array2[14] - array2[15]) - array2[13] - array2[2] - array2[3];
        array[20] = n35 - array2[13] - array2[5] - array2[6] - array2[7];
        array[24] = n35 - array2[12] - array2[2] - array2[3];
        final float n36;
        array[26] = n35 - array2[12] - (n36 = array2[4] + array2[6] + array2[7]);
        final float n37;
        array[30] = (n37 = -array2[8] - array2[12] - array2[14] - array2[15]) - array2[0];
        array[28] = n37 - n36;
        final float[] array24 = array;
        final float[] field35945 = this.field35942;
        field35945[this.field35943] = array24[0];
        field35945[16 + this.field35943] = array24[1];
        field35945[32 + this.field35943] = array24[2];
        field35945[48 + this.field35943] = array24[3];
        field35945[64 + this.field35943] = array24[4];
        field35945[80 + this.field35943] = array24[5];
        field35945[96 + this.field35943] = array24[6];
        field35945[112 + this.field35943] = array24[7];
        field35945[128 + this.field35943] = array24[8];
        field35945[144 + this.field35943] = array24[9];
        field35945[160 + this.field35943] = array24[10];
        field35945[176 + this.field35943] = array24[11];
        field35945[192 + this.field35943] = array24[12];
        field35945[208 + this.field35943] = array24[13];
        field35945[224 + this.field35943] = array24[14];
        field35945[240 + this.field35943] = array24[15];
        field35945[256 + this.field35943] = 0.0f;
        field35945[272 + this.field35943] = -array24[15];
        field35945[288 + this.field35943] = -array24[14];
        field35945[304 + this.field35943] = -array24[13];
        field35945[320 + this.field35943] = -array24[12];
        field35945[336 + this.field35943] = -array24[11];
        field35945[352 + this.field35943] = -array24[10];
        field35945[368 + this.field35943] = -array24[9];
        field35945[384 + this.field35943] = -array24[8];
        field35945[400 + this.field35943] = -array24[7];
        field35945[416 + this.field35943] = -array24[6];
        field35945[432 + this.field35943] = -array24[5];
        field35945[448 + this.field35943] = -array24[4];
        field35945[464 + this.field35943] = -array24[3];
        field35945[480 + this.field35943] = -array24[2];
        field35945[496 + this.field35943] = -array24[1];
    }
    
    private void method28758(final Class7037 class7037) {
        final float[] field35942 = this.field35942;
        final float[] field35943 = this.field35948;
        int n = 0;
        for (int i = 0; i < 32; ++i) {
            final float[] array = Class8560.field35982[i];
            field35943[i] = (field35942[n] * array[0] + field35942[15 + n] * array[1] + field35942[14 + n] * array[2] + field35942[13 + n] * array[3] + field35942[12 + n] * array[4] + field35942[11 + n] * array[5] + field35942[10 + n] * array[6] + field35942[9 + n] * array[7] + field35942[8 + n] * array[8] + field35942[7 + n] * array[9] + field35942[6 + n] * array[10] + field35942[5 + n] * array[11] + field35942[4 + n] * array[12] + field35942[3 + n] * array[13] + field35942[2 + n] * array[14] + field35942[1 + n] * array[15]) * this.field35946;
            n += 16;
        }
    }
    
    private void method28759(final Class7037 class7037) {
        final float[] field35942 = this.field35942;
        final float[] field35943 = this.field35948;
        int n = 0;
        for (int i = 0; i < 32; ++i) {
            final float[] array = Class8560.field35982[i];
            field35943[i] = (field35942[1 + n] * array[0] + field35942[n] * array[1] + field35942[15 + n] * array[2] + field35942[14 + n] * array[3] + field35942[13 + n] * array[4] + field35942[12 + n] * array[5] + field35942[11 + n] * array[6] + field35942[10 + n] * array[7] + field35942[9 + n] * array[8] + field35942[8 + n] * array[9] + field35942[7 + n] * array[10] + field35942[6 + n] * array[11] + field35942[5 + n] * array[12] + field35942[4 + n] * array[13] + field35942[3 + n] * array[14] + field35942[2 + n] * array[15]) * this.field35946;
            n += 16;
        }
    }
    
    private void method28760(final Class7037 class7037) {
        final float[] field35942 = this.field35942;
        final float[] field35943 = this.field35948;
        int n = 0;
        for (int i = 0; i < 32; ++i) {
            final float[] array = Class8560.field35982[i];
            field35943[i] = (field35942[2 + n] * array[0] + field35942[1 + n] * array[1] + field35942[n] * array[2] + field35942[15 + n] * array[3] + field35942[14 + n] * array[4] + field35942[13 + n] * array[5] + field35942[12 + n] * array[6] + field35942[11 + n] * array[7] + field35942[10 + n] * array[8] + field35942[9 + n] * array[9] + field35942[8 + n] * array[10] + field35942[7 + n] * array[11] + field35942[6 + n] * array[12] + field35942[5 + n] * array[13] + field35942[4 + n] * array[14] + field35942[3 + n] * array[15]) * this.field35946;
            n += 16;
        }
    }
    
    private void method28761(final Class7037 class7037) {
        final float[] field35942 = this.field35942;
        final float[] field35943 = this.field35948;
        int n = 0;
        for (int i = 0; i < 32; ++i) {
            final float[] array = Class8560.field35982[i];
            field35943[i] = (field35942[3 + n] * array[0] + field35942[2 + n] * array[1] + field35942[1 + n] * array[2] + field35942[n] * array[3] + field35942[15 + n] * array[4] + field35942[14 + n] * array[5] + field35942[13 + n] * array[6] + field35942[12 + n] * array[7] + field35942[11 + n] * array[8] + field35942[10 + n] * array[9] + field35942[9 + n] * array[10] + field35942[8 + n] * array[11] + field35942[7 + n] * array[12] + field35942[6 + n] * array[13] + field35942[5 + n] * array[14] + field35942[4 + n] * array[15]) * this.field35946;
            n += 16;
        }
    }
    
    private void method28762(final Class7037 class7037) {
        final float[] field35942 = this.field35942;
        final float[] field35943 = this.field35948;
        int n = 0;
        for (int i = 0; i < 32; ++i) {
            final float[] array = Class8560.field35982[i];
            field35943[i] = (field35942[4 + n] * array[0] + field35942[3 + n] * array[1] + field35942[2 + n] * array[2] + field35942[1 + n] * array[3] + field35942[n] * array[4] + field35942[15 + n] * array[5] + field35942[14 + n] * array[6] + field35942[13 + n] * array[7] + field35942[12 + n] * array[8] + field35942[11 + n] * array[9] + field35942[10 + n] * array[10] + field35942[9 + n] * array[11] + field35942[8 + n] * array[12] + field35942[7 + n] * array[13] + field35942[6 + n] * array[14] + field35942[5 + n] * array[15]) * this.field35946;
            n += 16;
        }
    }
    
    private void method28763(final Class7037 class7037) {
        final float[] field35942 = this.field35942;
        final float[] field35943 = this.field35948;
        int n = 0;
        for (int i = 0; i < 32; ++i) {
            final float[] array = Class8560.field35982[i];
            field35943[i] = (field35942[5 + n] * array[0] + field35942[4 + n] * array[1] + field35942[3 + n] * array[2] + field35942[2 + n] * array[3] + field35942[1 + n] * array[4] + field35942[n] * array[5] + field35942[15 + n] * array[6] + field35942[14 + n] * array[7] + field35942[13 + n] * array[8] + field35942[12 + n] * array[9] + field35942[11 + n] * array[10] + field35942[10 + n] * array[11] + field35942[9 + n] * array[12] + field35942[8 + n] * array[13] + field35942[7 + n] * array[14] + field35942[6 + n] * array[15]) * this.field35946;
            n += 16;
        }
    }
    
    private void method28764(final Class7037 class7037) {
        final float[] field35942 = this.field35942;
        final float[] field35943 = this.field35948;
        int n = 0;
        for (int i = 0; i < 32; ++i) {
            final float[] array = Class8560.field35982[i];
            field35943[i] = (field35942[6 + n] * array[0] + field35942[5 + n] * array[1] + field35942[4 + n] * array[2] + field35942[3 + n] * array[3] + field35942[2 + n] * array[4] + field35942[1 + n] * array[5] + field35942[n] * array[6] + field35942[15 + n] * array[7] + field35942[14 + n] * array[8] + field35942[13 + n] * array[9] + field35942[12 + n] * array[10] + field35942[11 + n] * array[11] + field35942[10 + n] * array[12] + field35942[9 + n] * array[13] + field35942[8 + n] * array[14] + field35942[7 + n] * array[15]) * this.field35946;
            n += 16;
        }
    }
    
    private void method28765(final Class7037 class7037) {
        final float[] field35942 = this.field35942;
        final float[] field35943 = this.field35948;
        int n = 0;
        for (int i = 0; i < 32; ++i) {
            final float[] array = Class8560.field35982[i];
            field35943[i] = (field35942[7 + n] * array[0] + field35942[6 + n] * array[1] + field35942[5 + n] * array[2] + field35942[4 + n] * array[3] + field35942[3 + n] * array[4] + field35942[2 + n] * array[5] + field35942[1 + n] * array[6] + field35942[n] * array[7] + field35942[15 + n] * array[8] + field35942[14 + n] * array[9] + field35942[13 + n] * array[10] + field35942[12 + n] * array[11] + field35942[11 + n] * array[12] + field35942[10 + n] * array[13] + field35942[9 + n] * array[14] + field35942[8 + n] * array[15]) * this.field35946;
            n += 16;
        }
    }
    
    private void method28766(final Class7037 class7037) {
        final float[] field35942 = this.field35942;
        final float[] field35943 = this.field35948;
        int n = 0;
        for (int i = 0; i < 32; ++i) {
            final float[] array = Class8560.field35982[i];
            field35943[i] = (field35942[8 + n] * array[0] + field35942[7 + n] * array[1] + field35942[6 + n] * array[2] + field35942[5 + n] * array[3] + field35942[4 + n] * array[4] + field35942[3 + n] * array[5] + field35942[2 + n] * array[6] + field35942[1 + n] * array[7] + field35942[n] * array[8] + field35942[15 + n] * array[9] + field35942[14 + n] * array[10] + field35942[13 + n] * array[11] + field35942[12 + n] * array[12] + field35942[11 + n] * array[13] + field35942[10 + n] * array[14] + field35942[9 + n] * array[15]) * this.field35946;
            n += 16;
        }
    }
    
    private void method28767(final Class7037 class7037) {
        final float[] field35942 = this.field35942;
        final float[] field35943 = this.field35948;
        int n = 0;
        for (int i = 0; i < 32; ++i) {
            final float[] array = Class8560.field35982[i];
            field35943[i] = (field35942[9 + n] * array[0] + field35942[8 + n] * array[1] + field35942[7 + n] * array[2] + field35942[6 + n] * array[3] + field35942[5 + n] * array[4] + field35942[4 + n] * array[5] + field35942[3 + n] * array[6] + field35942[2 + n] * array[7] + field35942[1 + n] * array[8] + field35942[n] * array[9] + field35942[15 + n] * array[10] + field35942[14 + n] * array[11] + field35942[13 + n] * array[12] + field35942[12 + n] * array[13] + field35942[11 + n] * array[14] + field35942[10 + n] * array[15]) * this.field35946;
            n += 16;
        }
    }
    
    private void method28768(final Class7037 class7037) {
        final float[] field35942 = this.field35942;
        final float[] field35943 = this.field35948;
        int n = 0;
        for (int i = 0; i < 32; ++i) {
            final float[] array = Class8560.field35982[i];
            field35943[i] = (field35942[10 + n] * array[0] + field35942[9 + n] * array[1] + field35942[8 + n] * array[2] + field35942[7 + n] * array[3] + field35942[6 + n] * array[4] + field35942[5 + n] * array[5] + field35942[4 + n] * array[6] + field35942[3 + n] * array[7] + field35942[2 + n] * array[8] + field35942[1 + n] * array[9] + field35942[n] * array[10] + field35942[15 + n] * array[11] + field35942[14 + n] * array[12] + field35942[13 + n] * array[13] + field35942[12 + n] * array[14] + field35942[11 + n] * array[15]) * this.field35946;
            n += 16;
        }
    }
    
    private void method28769(final Class7037 class7037) {
        final float[] field35942 = this.field35942;
        final float[] field35943 = this.field35948;
        int n = 0;
        for (int i = 0; i < 32; ++i) {
            final float[] array = Class8560.field35982[i];
            field35943[i] = (field35942[11 + n] * array[0] + field35942[10 + n] * array[1] + field35942[9 + n] * array[2] + field35942[8 + n] * array[3] + field35942[7 + n] * array[4] + field35942[6 + n] * array[5] + field35942[5 + n] * array[6] + field35942[4 + n] * array[7] + field35942[3 + n] * array[8] + field35942[2 + n] * array[9] + field35942[1 + n] * array[10] + field35942[n] * array[11] + field35942[15 + n] * array[12] + field35942[14 + n] * array[13] + field35942[13 + n] * array[14] + field35942[12 + n] * array[15]) * this.field35946;
            n += 16;
        }
    }
    
    private void method28770(final Class7037 class7037) {
        final float[] field35942 = this.field35942;
        final float[] field35943 = this.field35948;
        int n = 0;
        for (int i = 0; i < 32; ++i) {
            final float[] array = Class8560.field35982[i];
            field35943[i] = (field35942[12 + n] * array[0] + field35942[11 + n] * array[1] + field35942[10 + n] * array[2] + field35942[9 + n] * array[3] + field35942[8 + n] * array[4] + field35942[7 + n] * array[5] + field35942[6 + n] * array[6] + field35942[5 + n] * array[7] + field35942[4 + n] * array[8] + field35942[3 + n] * array[9] + field35942[2 + n] * array[10] + field35942[1 + n] * array[11] + field35942[n] * array[12] + field35942[15 + n] * array[13] + field35942[14 + n] * array[14] + field35942[13 + n] * array[15]) * this.field35946;
            n += 16;
        }
    }
    
    private void method28771(final Class7037 class7037) {
        final float[] field35942 = this.field35942;
        final float[] field35943 = this.field35948;
        int n = 0;
        for (int i = 0; i < 32; ++i) {
            final float[] array = Class8560.field35982[i];
            field35943[i] = (field35942[13 + n] * array[0] + field35942[12 + n] * array[1] + field35942[11 + n] * array[2] + field35942[10 + n] * array[3] + field35942[9 + n] * array[4] + field35942[8 + n] * array[5] + field35942[7 + n] * array[6] + field35942[6 + n] * array[7] + field35942[5 + n] * array[8] + field35942[4 + n] * array[9] + field35942[3 + n] * array[10] + field35942[2 + n] * array[11] + field35942[1 + n] * array[12] + field35942[n] * array[13] + field35942[15 + n] * array[14] + field35942[14 + n] * array[15]) * this.field35946;
            n += 16;
        }
    }
    
    private void method28772(final Class7037 class7037) {
        final float[] field35942 = this.field35942;
        final float[] field35943 = this.field35948;
        int n = 0;
        for (int i = 0; i < 32; ++i) {
            final float[] array = Class8560.field35982[i];
            field35943[i] = (field35942[14 + n] * array[0] + field35942[13 + n] * array[1] + field35942[12 + n] * array[2] + field35942[11 + n] * array[3] + field35942[10 + n] * array[4] + field35942[9 + n] * array[5] + field35942[8 + n] * array[6] + field35942[7 + n] * array[7] + field35942[6 + n] * array[8] + field35942[5 + n] * array[9] + field35942[4 + n] * array[10] + field35942[3 + n] * array[11] + field35942[2 + n] * array[12] + field35942[1 + n] * array[13] + field35942[n] * array[14] + field35942[15 + n] * array[15]) * this.field35946;
            n += 16;
        }
    }
    
    private void method28773(final Class7037 class7037) {
        final float[] field35942 = this.field35942;
        final float[] field35943 = this.field35948;
        int n = 0;
        for (int i = 0; i < 32; ++i) {
            final float[] array = Class8560.field35982[i];
            field35943[i] = (field35942[15 + n] * array[0] + field35942[14 + n] * array[1] + field35942[13 + n] * array[2] + field35942[12 + n] * array[3] + field35942[11 + n] * array[4] + field35942[10 + n] * array[5] + field35942[9 + n] * array[6] + field35942[8 + n] * array[7] + field35942[7 + n] * array[8] + field35942[6 + n] * array[9] + field35942[5 + n] * array[10] + field35942[4 + n] * array[11] + field35942[3 + n] * array[12] + field35942[2 + n] * array[13] + field35942[1 + n] * array[14] + field35942[n] * array[15]) * this.field35946;
            n += 16;
        }
    }
    
    private void method28774(final Class7037 class7037) {
        switch (this.field35943) {
            case 0: {
                this.method28758(class7037);
                break;
            }
            case 1: {
                this.method28759(class7037);
                break;
            }
            case 2: {
                this.method28760(class7037);
                break;
            }
            case 3: {
                this.method28761(class7037);
                break;
            }
            case 4: {
                this.method28762(class7037);
                break;
            }
            case 5: {
                this.method28763(class7037);
                break;
            }
            case 6: {
                this.method28764(class7037);
                break;
            }
            case 7: {
                this.method28765(class7037);
                break;
            }
            case 8: {
                this.method28766(class7037);
                break;
            }
            case 9: {
                this.method28767(class7037);
                break;
            }
            case 10: {
                this.method28768(class7037);
                break;
            }
            case 11: {
                this.method28769(class7037);
                break;
            }
            case 12: {
                this.method28770(class7037);
                break;
            }
            case 13: {
                this.method28771(class7037);
                break;
            }
            case 14: {
                this.method28772(class7037);
                break;
            }
            case 15: {
                this.method28773(class7037);
                break;
            }
        }
        if (class7037 != null) {
            class7037.method21524(this.field35945, this.field35948);
        }
    }
    
    public void method28775(final Class7037 class7037) {
        this.method28756();
        this.method28774(class7037);
        this.field35943 = (this.field35943 + 1 & 0xF);
        this.field35942 = ((this.field35942 != this.field35940) ? this.field35940 : this.field35941);
        for (int i = 0; i < 32; ++i) {
            this.field35944[i] = 0.0f;
        }
    }
    
    private static float[] method28776() {
        final String[] split = "0,-0.000442504999227821826934814453125,0.0032501220703125,-0.0070037841796875,0.0310821533203125,-0.0786285400390625,0.100311279296875,-0.5720367431640625,1.144989013671875,0.5720367431640625,0.100311279296875,0.0786285400390625,0.0310821533203125,0.0070037841796875,0.0032501220703125,0.000442504999227821826934814453125,-0.0000152590000652708113193511962890625,-0.0004730219952762126922607421875,0.003326416015625,-0.007919312454760074615478515625,0.030517578125,-0.0841827392578125,0.0909271240234375,-0.6002197265625,1.144287109375,0.5438232421875,0.108856201171875,0.07305908203125,0.0314788818359375,0.0061187739484012126922607421875,0.00317382789216935634613037109375,0.00039672901039011776447296142578125,-0.0000152590000652708113193511962890625,-0.0005340580246411263942718505859375,0.00338745093904435634613037109375,-0.0088653564453125,0.02978515625,-0.0897064208984375,0.0806884765625,-0.6282958984375,1.1422119140625,0.5156097412109375,0.1165771484375,0.0675201416015625,0.03173828125,0.0052947998046875,0.0030822749249637126922607421875,0.0003662109957076609134674072265625,-0.0000152590000652708113193511962890625,-0.000579833984375,0.0034332280047237873077392578125,-0.0098419189453125,0.0288848876953125,-0.0951690673828125,0.0695953369140625,-0.656219482421875,1.138763427734375,0.4874725341796875,0.12347412109375,0.0619964599609375,0.0318450927734375,0.004486083984375,0.00299072288908064365386962890625,0.00032043500686995685100555419921875,-0.0000152590000652708113193511962890625,-0.000625610002316534519195556640625,0.00346374488435685634613037109375,-0.0108489990234375,0.027801513671875,-0.1005401611328125,0.0576171875,-0.6839141845703125,1.1339263916015625,0.45947265625,0.12957763671875,0.0565338134765625,0.0318145751953125,0.0037231449969112873077392578125,0.002899169921875,0.0002899169921875,-0.0000152590000652708113193511962890625,-0.0006866459734737873077392578125,0.00347900390625,-0.0118865966796875,0.0265350341796875,-0.1058197021484375,0.0447845458984375,-0.7113189697265625,1.12774658203125,0.4316558837890625,0.1348876953125,0.0511322021484375,0.0316619873046875,0.0030059809796512126922607421875,0.0027923579327762126922607421875,0.0002593990066088736057281494140625,-0.0000152590000652708113193511962890625,-0.000747681013308465480804443359375,0.00347900390625,-0.012939453125,0.02508544921875,-0.1109466552734375,0.0310821533203125,-0.738372802734375,1.1202239990234375,0.404083251953125,0.1394500732421875,0.04583740234375,0.0313873291015625,0.00233459495939314365386962890625,0.00268554710783064365386962890625,0.00024414100334979593753814697265625,-0.000030518000130541622638702392578125,-0.0008087159949354827404022216796875,0.00346374488435685634613037109375,-0.0140228271484375,0.0234222412109375,-0.1159210205078125,0.016510009765625,-0.7650299072265625,1.1113739013671875,0.376800537109375,0.1432647705078125,0.0406341552734375,0.031005859375,0.0016937260515987873077392578125,0.0025787348859012126922607421875,0.000213623003219254314899444580078125,-0.000030518000130541622638702392578125,-0.00088500999845564365386962890625,0.00341796898283064365386962890625,-0.0151214599609375,0.021575927734375,-0.120697021484375,0.00106811500154435634613037109375,-0.7912139892578125,1.1012115478515625,0.3498687744140625,0.1463623046875,0.035552978515625,0.0305328369140625,0.00109863304533064365386962890625,0.0024566650390625,0.00019836399587802588939666748046875,-0.000030518000130541622638702392578125,-0.0009613040019758045673370361328125,0.0033721919171512126922607421875,-0.0162353515625,0.01953125,-0.1252593994140625,-0.015228270553052425384521484375,-0.816864013671875,1.08978271484375,0.3233184814453125,0.148773193359375,0.030609130859375,0.029937744140625,0.0005493159987963736057281494140625,0.0023498539812862873077392578125,0.00016784699982963502407073974609375,-0.000030518000130541622638702392578125,-0.001037598005495965480804443359375,0.0032806401140987873077392578125,-0.0173492431640625,0.0172576904296875,-0.1295623779296875,-0.032379150390625,-0.841949462890625,1.077117919921875,0.297210693359375,0.1504974365234375,0.02581787109375,0.0292816162109375,0.000030518000130541622638702392578125,0.0022430419921875,0.000152588007040321826934814453125,-0.00004577599975164048373699188232421875,-0.001113891950808465480804443359375,0.00317382789216935634613037109375,-0.018463134765625,0.014801025390625,-0.1335906982421875,-0.05035400390625,-0.866363525390625,1.0632171630859375,0.2715911865234375,0.1515960693359375,0.02117919921875,0.028533935546875,-0.000442504999227821826934814453125,0.00212097191251814365386962890625,0.000137328999699093401432037353515625,-0.00004577599975164048373699188232421875,-0.001205443986691534519195556640625,0.00305175804533064365386962890625,-0.0195770263671875,0.012115479446947574615478515625,-0.137298583984375,-0.0691680908203125,-0.8900909423828125,1.04815673828125,0.2465057373046875,0.152069091796875,0.0167083740234375,0.0277252197265625,-0.0008697509765625,0.00201415992341935634613037109375,0.0001220699996338225901126861572265625,-0.00006103499981691129505634307861328125,-0.001296996953897178173065185546875,0.00288391089998185634613037109375,-0.02069091796875,0.0092315673828125,-0.1406707763671875,-0.088775634765625,-0.913055419921875,1.0319366455078125,0.22198486328125,0.1519622802734375,0.012420654296875,0.0268402099609375,-0.0012664790265262126922607421875,0.001907348982058465480804443359375,0.0001068119963747449219226837158203125,-0.00006103499981691129505634307861328125,-0.00138855003751814365386962890625,0.00270080589689314365386962890625,-0.02178955078125,0.006134033203125,-0.1436767578125,-0.109161376953125,-0.9351959228515625,1.014617919921875,0.19805908203125,0.15130615234375,0.0083160400390625,0.025909423828125,-0.001617431989870965480804443359375,0.001785277971066534519195556640625,0.0001068119963747449219226837158203125,-0.0000762940035201609134674072265625,-0.0014801030047237873077392578125,0.0024871830828487873077392578125,-0.022857666015625,0.0028228759765625,-0.1462554931640625,-0.13031005859375,-0.95648193359375,0.996246337890625,0.1747894287109375,0.150115966796875,0.0043945307843387126922607421875,0.024932861328125,-0.00193786597810685634613037109375,0.0016937260515987873077392578125,0.0000915530035854317247867584228515625,-0.0000762940035201609134674072265625,-0.001586913946084678173065185546875,0.00222778297029435634613037109375,-0.0239105224609375,-0.0006866459734737873077392578125,-0.1484222412109375,-0.1522064208984375,-0.9768524169921875,0.9768524169921875,0.1522064208984375,0.1484222412109375,0.0006866459734737873077392578125,0.0239105224609375,-0.00222778297029435634613037109375,0.001586913946084678173065185546875,0.0000762940035201609134674072265625,-0.0000915530035854317247867584228515625,-0.0016937260515987873077392578125,0.00193786597810685634613037109375,-0.024932861328125,-0.0043945307843387126922607421875,-0.150115966796875,-0.1747894287109375,-0.996246337890625,0.95648193359375,0.13031005859375,0.1462554931640625,-0.0028228759765625,0.022857666015625,-0.0024871830828487873077392578125,0.0014801030047237873077392578125,0.0000762940035201609134674072265625,-0.0001068119963747449219226837158203125,-0.001785277971066534519195556640625,0.001617431989870965480804443359375,-0.025909423828125,-0.0083160400390625,-0.15130615234375,-0.19805908203125,-1.014617919921875,0.9351959228515625,0.109161376953125,0.1436767578125,-0.006134033203125,0.02178955078125,-0.00270080589689314365386962890625,0.00138855003751814365386962890625,0.00006103499981691129505634307861328125,-0.0001068119963747449219226837158203125,-0.001907348982058465480804443359375,0.0012664790265262126922607421875,-0.0268402099609375,-0.012420654296875,-0.1519622802734375,-0.22198486328125,-1.0319366455078125,0.913055419921875,0.088775634765625,0.1406707763671875,-0.0092315673828125,0.02069091796875,-0.00288391089998185634613037109375,0.001296996953897178173065185546875,0.00006103499981691129505634307861328125,-0.0001220699996338225901126861572265625,-0.00201415992341935634613037109375,0.0008697509765625,-0.0277252197265625,-0.0167083740234375,-0.152069091796875,-0.2465057373046875,-1.04815673828125,0.8900909423828125,0.0691680908203125,0.137298583984375,-0.012115479446947574615478515625,0.0195770263671875,-0.00305175804533064365386962890625,0.001205443986691534519195556640625,0.00004577599975164048373699188232421875,-0.000137328999699093401432037353515625,-0.00212097191251814365386962890625,0.000442504999227821826934814453125,-0.028533935546875,-0.02117919921875,-0.1515960693359375,-0.2715911865234375,-1.0632171630859375,0.866363525390625,0.05035400390625,0.1335906982421875,-0.014801025390625,0.018463134765625,-0.00317382789216935634613037109375,0.001113891950808465480804443359375,0.00004577599975164048373699188232421875,-0.000152588007040321826934814453125,-0.0022430419921875,-0.000030518000130541622638702392578125,-0.0292816162109375,-0.02581787109375,-0.1504974365234375,-0.297210693359375,-1.077117919921875,0.841949462890625,0.032379150390625,0.1295623779296875,-0.0172576904296875,0.0173492431640625,-0.0032806401140987873077392578125,0.001037598005495965480804443359375,0.000030518000130541622638702392578125,-0.00016784699982963502407073974609375,-0.0023498539812862873077392578125,-0.0005493159987963736057281494140625,-0.029937744140625,-0.030609130859375,-0.148773193359375,-0.3233184814453125,-1.08978271484375,0.816864013671875,0.015228270553052425384521484375,0.1252593994140625,-0.01953125,0.0162353515625,-0.0033721919171512126922607421875,0.0009613040019758045673370361328125,0.000030518000130541622638702392578125,-0.00019836399587802588939666748046875,-0.0024566650390625,-0.00109863304533064365386962890625,-0.0305328369140625,-0.035552978515625,-0.1463623046875,-0.3498687744140625,-1.1012115478515625,0.7912139892578125,-0.00106811500154435634613037109375,0.120697021484375,-0.021575927734375,0.0151214599609375,-0.00341796898283064365386962890625,0.00088500999845564365386962890625,0.000030518000130541622638702392578125,-0.000213623003219254314899444580078125,-0.0025787348859012126922607421875,-0.0016937260515987873077392578125,-0.031005859375,-0.0406341552734375,-0.1432647705078125,-0.376800537109375,-1.1113739013671875,0.7650299072265625,-0.016510009765625,0.1159210205078125,-0.0234222412109375,0.0140228271484375,-0.00346374488435685634613037109375,0.0008087159949354827404022216796875,0.000030518000130541622638702392578125,-0.00024414100334979593753814697265625,-0.00268554710783064365386962890625,-0.00233459495939314365386962890625,-0.0313873291015625,-0.04583740234375,-0.1394500732421875,-0.404083251953125,-1.1202239990234375,0.738372802734375,-0.0310821533203125,0.1109466552734375,-0.02508544921875,0.012939453125,-0.00347900390625,0.000747681013308465480804443359375,0.0000152590000652708113193511962890625,-0.0002593990066088736057281494140625,-0.0027923579327762126922607421875,-0.0030059809796512126922607421875,-0.0316619873046875,-0.0511322021484375,-0.1348876953125,-0.4316558837890625,-1.12774658203125,0.7113189697265625,-0.0447845458984375,0.1058197021484375,-0.0265350341796875,0.0118865966796875,-0.00347900390625,0.0006866459734737873077392578125,0.0000152590000652708113193511962890625,-0.0002899169921875,-0.002899169921875,-0.0037231449969112873077392578125,-0.0318145751953125,-0.0565338134765625,-0.12957763671875,-0.45947265625,-1.1339263916015625,0.6839141845703125,-0.0576171875,0.1005401611328125,-0.027801513671875,0.0108489990234375,-0.00346374488435685634613037109375,0.000625610002316534519195556640625,0.0000152590000652708113193511962890625,-0.00032043500686995685100555419921875,-0.00299072288908064365386962890625,-0.004486083984375,-0.0318450927734375,-0.0619964599609375,-0.12347412109375,-0.4874725341796875,-1.138763427734375,0.656219482421875,-0.0695953369140625,0.0951690673828125,-0.0288848876953125,0.0098419189453125,-0.0034332280047237873077392578125,0.000579833984375,0.0000152590000652708113193511962890625,-0.0003662109957076609134674072265625,-0.0030822749249637126922607421875,-0.0052947998046875,-0.03173828125,-0.0675201416015625,-0.1165771484375,-0.5156097412109375,-1.1422119140625,0.6282958984375,-0.0806884765625,0.0897064208984375,-0.02978515625,0.0088653564453125,-0.00338745093904435634613037109375,0.0005340580246411263942718505859375,0.0000152590000652708113193511962890625,-0.00039672901039011776447296142578125,-0.00317382789216935634613037109375,-0.0061187739484012126922607421875,-0.0314788818359375,-0.07305908203125,-0.108856201171875,-0.5438232421875,-1.144287109375,0.6002197265625,-0.0909271240234375,0.0841827392578125,-0.030517578125,0.007919312454760074615478515625,-0.003326416015625,0.0004730219952762126922607421875,0.0000152590000652708113193511962890625".split(",");
        final float[] array = new float[split.length];
        for (int i = 0; i < array.length; ++i) {
            array[i] = new BigDecimal(split[i]).floatValue();
        }
        return array;
    }
    
    private static float[][] method28777(final float[] array, final int n) {
        final int n2 = array.length / n;
        final float[][] array2 = new float[n2][];
        for (int i = 0; i < n2; ++i) {
            array2[i] = method28778(array, i * n, n);
        }
        return array2;
    }
    
    private static float[] method28778(final float[] array, final int n, int n2) {
        if (n + n2 > array.length) {
            n2 = array.length - n;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        final float[] array2 = new float[n2];
        System.arraycopy(array, n + 0, array2, 0, n2);
        return array2;
    }
    
    static {
        field35950 = (float)(1.0 / (2.0 * Math.cos(0.04908738521234052)));
        field35951 = (float)(1.0 / (2.0 * Math.cos(0.14726215563702155)));
        field35952 = (float)(1.0 / (2.0 * Math.cos(0.2454369260617026)));
        field35953 = (float)(1.0 / (2.0 * Math.cos(0.3436116964863836)));
        field35954 = (float)(1.0 / (2.0 * Math.cos(0.44178646691106466)));
        field35955 = (float)(1.0 / (2.0 * Math.cos(0.5399612373357456)));
        field35956 = (float)(1.0 / (2.0 * Math.cos(0.6381360077604268)));
        field35957 = (float)(1.0 / (2.0 * Math.cos(0.7363107781851077)));
        field35958 = (float)(1.0 / (2.0 * Math.cos(0.8344855486097889)));
        field35959 = (float)(1.0 / (2.0 * Math.cos(0.9326603190344698)));
        field35960 = (float)(1.0 / (2.0 * Math.cos(1.030835089459151)));
        field35961 = (float)(1.0 / (2.0 * Math.cos(1.1290098598838318)));
        field35962 = (float)(1.0 / (2.0 * Math.cos(1.227184630308513)));
        field35963 = (float)(1.0 / (2.0 * Math.cos(1.325359400733194)));
        field35964 = (float)(1.0 / (2.0 * Math.cos(1.423534171157875)));
        field35965 = (float)(1.0 / (2.0 * Math.cos(1.521708941582556)));
        field35966 = (float)(1.0 / (2.0 * Math.cos(0.09817477042468103)));
        field35967 = (float)(1.0 / (2.0 * Math.cos(0.2945243112740431)));
        field35968 = (float)(1.0 / (2.0 * Math.cos(0.4908738521234052)));
        field35969 = (float)(1.0 / (2.0 * Math.cos(0.6872233929727672)));
        field35970 = (float)(1.0 / (2.0 * Math.cos(0.8835729338221293)));
        field35971 = (float)(1.0 / (2.0 * Math.cos(1.0799224746714913)));
        field35972 = (float)(1.0 / (2.0 * Math.cos(1.2762720155208536)));
        field35973 = (float)(1.0 / (2.0 * Math.cos(1.4726215563702154)));
        field35974 = (float)(1.0 / (2.0 * Math.cos(0.19634954084936207)));
        field35975 = (float)(1.0 / (2.0 * Math.cos(0.5890486225480862)));
        field35976 = (float)(1.0 / (2.0 * Math.cos(0.9817477042468103)));
        field35977 = (float)(1.0 / (2.0 * Math.cos(1.3744467859455345)));
        field35978 = (float)(1.0 / (2.0 * Math.cos(0.39269908169872414)));
        field35979 = (float)(1.0 / (2.0 * Math.cos(1.1780972450961724)));
        field35980 = (float)(1.0 / (2.0 * Math.cos(0.7853981633974483)));
        Class8560.field35981 = null;
        Class8560.field35982 = null;
    }
}
