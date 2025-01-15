// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9261
{
    private static String[] field39723;
    private static final int field39724 = 32;
    private static final float[] field39725;
    private static final float[] field39726;
    private static final float[] field39727;
    private static final int[] field39728;
    
    private static void method34167(final float[] array, final float[] array2) {
        for (int i = 0; i < 16; ++i) {
            final float n = array[i];
            final float n2 = array2[i];
            final int n3 = i + 16;
            final float n4 = array[n3];
            final float n5 = array2[n3];
            final float n6 = Class9261.field39725[i];
            final float n7 = Class9261.field39726[i];
            final float n8 = n - n4;
            final float n9 = n2 - n5;
            final int n10 = i;
            array[n10] += n4;
            final int n11 = i;
            array2[n11] += n5;
            array[n3] = n8 * n6 - n9 * n7;
            array2[n3] = n8 * n7 + n9 * n6;
        }
        for (int j = 0, n12 = 0; j < 8; ++j, n12 += 2) {
            final float n13 = Class9261.field39725[n12];
            final float n14 = Class9261.field39726[n12];
            final int n15 = j;
            final float n16 = array[n15];
            final float n17 = array2[n15];
            final int n18 = n15 + 8;
            final float n19 = array[n18];
            final float n20 = array2[n18];
            final float n21 = n16 - n19;
            final float n22 = n17 - n20;
            final int n23 = n15;
            array[n23] += n19;
            final int n24 = n15;
            array2[n24] += n20;
            array[n18] = n21 * n13 - n22 * n14;
            array2[n18] = n21 * n14 + n22 * n13;
            final int n25 = j + 16;
            final float n26 = array[n25];
            final float n27 = array2[n25];
            final int n28 = n25 + 8;
            final float n29 = array[n28];
            final float n30 = array2[n28];
            final float n31 = n26 - n29;
            final float n32 = n27 - n30;
            final int n33 = n25;
            array[n33] += n29;
            final int n34 = n25;
            array2[n34] += n30;
            array[n28] = n31 * n13 - n32 * n14;
            array2[n28] = n31 * n14 + n32 * n13;
        }
        for (int k = 0; k < 32; k += 8) {
            final int n35 = k + 4;
            final float n36 = array[k];
            final float n37 = array2[k];
            final float n38 = array[n35];
            final float n39 = array2[n35];
            final int n40 = k;
            array[n40] += n38;
            final int n41 = k;
            array2[n41] += n39;
            array[n35] = n36 - n38;
            array2[n35] = n37 - n39;
        }
        final float n42 = Class9261.field39725[4];
        for (int l = 1; l < 32; l += 8) {
            final int n43 = l + 4;
            final float n44 = array[l];
            final float n45 = array2[l];
            final float n46 = array[n43];
            final float n47 = array2[n43];
            final float n48 = n44 - n46;
            final float n49 = n45 - n47;
            final int n50 = l;
            array[n50] += n46;
            final int n51 = l;
            array2[n51] += n47;
            array[n43] = (n48 + n49) * n42;
            array2[n43] = (n49 - n48) * n42;
        }
        for (int n52 = 2; n52 < 32; n52 += 8) {
            final int n53 = n52 + 4;
            final float n54 = array[n52];
            final float n55 = array2[n52];
            final float n56 = array[n53];
            final float n57 = array2[n53];
            final int n58 = n52;
            array[n58] += n56;
            final int n59 = n52;
            array2[n59] += n57;
            array[n53] = n55 - n57;
            array2[n53] = n56 - n54;
        }
        final float n60 = Class9261.field39725[12];
        for (int n61 = 3; n61 < 32; n61 += 8) {
            final int n62 = n61 + 4;
            final float n63 = array[n61];
            final float n64 = array2[n61];
            final float n65 = array[n62];
            final float n66 = array2[n62];
            final float n67 = n63 - n65;
            final float n68 = n64 - n66;
            final int n69 = n61;
            array[n69] += n65;
            final int n70 = n61;
            array2[n70] += n66;
            array[n62] = (n67 - n68) * n60;
            array2[n62] = (n67 + n68) * n60;
        }
        for (int n71 = 0; n71 < 32; n71 += 4) {
            final int n72 = n71 + 2;
            final float n73 = array[n71];
            final float n74 = array2[n71];
            final float n75 = array[n72];
            final float n76 = array2[n72];
            final int n77 = n71;
            array[n77] += n75;
            final int n78 = n71;
            array2[n78] += n76;
            array[n72] = n73 - n75;
            array2[n72] = n74 - n76;
        }
        for (int n79 = 1; n79 < 32; n79 += 4) {
            final int n80 = n79 + 2;
            final float n81 = array[n79];
            final float n82 = array2[n79];
            final float n83 = array[n80];
            final float n84 = array2[n80];
            final int n85 = n79;
            array[n85] += n83;
            final int n86 = n79;
            array2[n86] += n84;
            array[n80] = n82 - n84;
            array2[n80] = n83 - n81;
        }
        for (int n87 = 0; n87 < 32; n87 += 2) {
            final int n88 = n87 + 1;
            final float n89 = array[n87];
            final float n90 = array2[n87];
            final float n91 = array[n88];
            final float n92 = array2[n88];
            final int n93 = n87;
            array[n93] += n91;
            final int n94 = n87;
            array2[n94] += n92;
            array[n88] = n89 - n91;
            array2[n88] = n90 - n92;
        }
    }
    
    public static void method34168(final float[] array, final float[] array2, final float[] array3, final float[] array4) {
        for (int i = 0; i < 32; ++i) {
            final float n = array[i];
            final float n2 = array2[i];
            final float n3 = (n + n2) * Class9261.field39727[i];
            array[i] = n2 * Class9261.field39727[i + 64] + n3;
            array2[i] = n * Class9261.field39727[i + 32] + n3;
        }
        method34167(array, array2);
        for (int j = 0; j < 16; ++j) {
            final int n4 = Class9261.field39728[j];
            final float n5 = array[n4];
            final float n6 = array2[n4];
            final float n7 = (n5 + n6) * Class9261.field39727[j + 96];
            array3[j] = n6 * Class9261.field39727[j + 160] + n7;
            array4[j] = n5 * Class9261.field39727[j + 128] + n7;
        }
        array4[16] = (array2[1] - array[1]) * Class9261.field39727[112];
        array3[16] = (array[1] + array2[1]) * Class9261.field39727[112];
        for (int k = 17; k < 32; ++k) {
            final int n8 = Class9261.field39728[k];
            final float n9 = array[n8];
            final float n10 = array2[n8];
            final float n11 = (n9 + n10) * Class9261.field39727[k + 96];
            array3[k] = n10 * Class9261.field39727[k + 160] + n11;
            array4[k] = n9 * Class9261.field39727[k + 128] + n11;
        }
    }
    
    static {
        field39725 = new float[] { 1.0f, 0.98078525f, 0.9238795f, 0.8314696f, 0.70710677f, 0.5555702f, 0.3826834f, 0.19509028f, 0.0f, -0.19509037f, -0.3826835f, -0.5555703f, -0.7071068f, -0.83146966f, -0.92387956f, -0.9807853f };
        field39726 = new float[] { 0.0f, -0.19509032f, -0.38268346f, -0.55557024f, -0.70710677f, -0.83146966f, -0.92387956f, -0.9807853f, -1.0f, -0.98078525f, -0.9238795f, -0.8314696f, -0.7071067f, -0.5555702f, -0.38268337f, -0.19509023f };
        field39727 = new float[] { 0.9999247f, 0.9981181f, 0.993907f, 0.9873014f, 0.9783174f, 0.96697646f, 0.953306f, 0.937339f, 0.9191139f, 0.8986745f, 0.8760701f, 0.8513552f, 0.82458925f, 0.7958369f, 0.76516724f, 0.7326543f, 0.69837624f, 0.66241574f, 0.62485945f, 0.58579785f, 0.545325f, 0.5035384f, 0.46053872f, 0.41642955f, 0.37131715f, 0.32531023f, 0.2785196f, 0.23105814f, 0.18303989f, 0.13458069f, 0.08579727f, 0.036807165f, -1.0121963f, -1.0594388f, -1.1041292f, -1.1461595f, -1.1854287f, -1.2218422f, -1.255312f, -1.2857577f, -1.313106f, -1.3372908f, -1.3582538f, -1.3759449f, -1.390321f, -1.4013479f, -1.4089987f, -1.4132552f, -1.4141071f, -1.4115522f, -1.4055967f, -1.396255f, -1.3835497f, -1.3675113f, -1.3481784f, -1.3255975f, -1.2998233f, -1.2709177f, -1.2389501f, -1.2039981f, -1.1661453f, -1.1254834f, -1.0821099f, -1.0361296f, -0.9876532f, -0.9367974f, -0.88368475f, -0.8284433f, -0.771206f, -0.71211076f, -0.6513001f, -0.58892035f, -0.5251218f, -0.46005824f, -0.39388633f, -0.32676548f, -0.25885743f, -0.19032592f, -0.121335685f, -0.052053273f, 0.017354608f, 0.086720645f, 0.15587783f, 0.22465932f, 0.29289973f, 0.3604344f, 0.42710093f, 0.49273846f, 0.5571889f, 0.62029713f, 0.681911f, 0.74188185f, 0.8000656f, 0.856322f, 0.91051537f, 0.96251523f, 1.0f, 0.99879545f, 0.9951847f, 0.9891765f, 0.98078525f, 0.97003126f, 0.95694035f, 0.94154406f, 0.9238795f, 0.9039893f, 0.88192123f, 0.8577286f, 0.8314696f, 0.8032075f, 0.77301043f, 0.7409511f, 0.70710677f, 0.6715589f, 0.6343933f, 0.5956993f, 0.5555702f, 0.5141027f, 0.47139665f, 0.4275551f, 0.38268343f, 0.33688983f, 0.29028463f, 0.24298012f, 0.19509023f, 0.1467305f, 0.098017134f, 0.04906765f, -1.0f, -1.0478631f, -1.0932019f, -1.1359069f, -1.1758755f, -1.2130115f, -1.247225f, -1.2784339f, -1.3065629f, -1.3315444f, -1.353318f, -1.3718314f, -1.3870399f, -1.3989068f, -1.4074037f, -1.4125102f, 0.0f, -1.4125102f, -1.4074037f, -1.3989068f, -1.3870399f, -1.3718314f, -1.353318f, -1.3315444f, -1.3065629f, -1.2784339f, -1.247225f, -1.2130114f, -1.1758755f, -1.135907f, -1.0932019f, -1.0478631f, -1.0f, -0.9497278f, -0.89716756f, -0.842446f, -0.78569496f, -0.7270511f, -0.66665566f, -0.6046542f, -0.54119605f, -0.47643423f, -0.4105245f, -0.34362584f, -0.27589935f, -0.2075082f, -0.1386171f, -0.069392145f, 0.0f, 0.069392264f, 0.13861716f, 0.2075082f, 0.27589947f, 0.34362596f, 0.41052464f, 0.4764342f, 0.5411961f, 0.6046542f, 0.6666557f, 0.72705114f, 0.7856951f, 0.842446f, 0.89716756f, 0.9497278f };
        field39728 = new int[] { 0, 16, 8, 24, 4, 20, 12, 28, 2, 18, 10, 26, 6, 22, 14, 30, 1, 17, 9, 25, 5, 21, 13, 29, 3, 19, 11, 27, 7, 23, 15, 31 };
    }
}
