// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4203 implements Class4198
{
    private static String[] field18931;
    private static final float[] field18932;
    private static final float[] field18933;
    private static final float[][] field18934;
    private static final float[][] field18935;
    private static final float[] field18936;
    private static final float[][] field18937;
    private static final float[][] field18938;
    private static final float[] field18939;
    
    public static void method12647(final Class4197 class4197, final int n) {
        for (int i = 0; i < class4197.field18805[n]; ++i) {
            if (class4197.field18892[n][i] != 0) {
                final int n2 = (i != 0) ? class4197.field18810[n][i - 1] : class4197.field18811[n];
                if (class4197.field18810[n][i] != n2) {
                    if (n2 == 1 && class4197.field18810[n][i] == 0) {
                        for (int j = 0; j < class4197.field18795[class4197.field18810[n][i]]; ++j) {
                            for (int k = 0; k < class4197.field18791; ++k) {
                                if (class4197.field18797[1][k] == class4197.field18797[0][j]) {
                                    int n3;
                                    if (i != 0) {
                                        n3 = class4197.field18815[n][k][i - 1];
                                    }
                                    else {
                                        n3 = class4197.field18816[n][k];
                                    }
                                    class4197.field18815[n][j][i] += n3;
                                }
                            }
                        }
                    }
                    else if (n2 == 0) {
                        if (class4197.field18810[n][i] == 1) {
                            for (int l = 0; l < class4197.field18795[class4197.field18810[n][i]]; ++l) {
                                for (int n4 = 0; n4 < class4197.field18792; ++n4) {
                                    if (class4197.field18797[0][n4] <= class4197.field18797[1][l]) {
                                        if (class4197.field18797[1][l] < class4197.field18797[0][n4 + 1]) {
                                            int n5;
                                            if (i != 0) {
                                                n5 = class4197.field18815[n][n4][i - 1];
                                            }
                                            else {
                                                n5 = class4197.field18816[n][n4];
                                            }
                                            class4197.field18815[n][l][i] += n5;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                else {
                    for (int n6 = 0; n6 < class4197.field18795[class4197.field18810[n][i]]; ++n6) {
                        int n7;
                        if (i != 0) {
                            n7 = class4197.field18815[n][n6][i - 1];
                        }
                        else {
                            n7 = class4197.field18816[n][n6];
                        }
                        class4197.field18815[n][n6][i] += n7;
                    }
                }
            }
            else {
                for (int n8 = 1; n8 < class4197.field18795[class4197.field18810[n][i]]; ++n8) {
                    class4197.field18815[n][n8][i] += class4197.field18815[n][n8 - 1][i];
                    if (class4197.field18815[n][n8][i] < 0) {
                        class4197.field18815[n][n8][i] = 0;
                    }
                }
            }
        }
    }
    
    public static void method12648(final Class4197 class4197, final int n) {
        for (int i = 0; i < class4197.field18807[n]; ++i) {
            if (class4197.field18893[n][i] != 0) {
                if (i != 0) {
                    for (int j = 0; j < class4197.field18793; ++j) {
                        class4197.field18819[n][j][i] += class4197.field18819[n][j][i - 1];
                    }
                }
                else {
                    for (int k = 0; k < class4197.field18793; ++k) {
                        class4197.field18819[n][k][i] = class4197.field18822[n][k] + class4197.field18819[n][k][0];
                    }
                }
            }
            else {
                for (int l = 1; l < class4197.field18793; ++l) {
                    class4197.field18819[n][l][i] += class4197.field18819[n][l - 1][i];
                }
            }
        }
    }
    
    public static float method12649(final Class4197 class4197, final int n, final int n2, final int n3) {
        if (class4197.field18882) {
            if (class4197.field18819[0][n2][n3] >= 0) {
                if (class4197.field18819[0][n2][n3] <= 30) {
                    if (class4197.field18819[1][n2][n3] >= 0) {
                        if (class4197.field18819[1][n2][n3] <= 24) {
                            if (n != 0) {
                                return Class4203.field18938[class4197.field18819[0][n2][n3]][class4197.field18819[1][n2][n3] >> 1];
                            }
                            return Class4203.field18937[class4197.field18819[0][n2][n3]][class4197.field18819[1][n2][n3] >> 1];
                        }
                    }
                }
            }
            return 0.0f;
        }
        if (class4197.field18819[n][n2][n3] >= 0 && class4197.field18819[n][n2][n3] <= 30) {
            return Class4203.field18936[class4197.field18819[n][n2][n3]];
        }
        return 0.0f;
    }
    
    public static float method12650(final Class4197 class4197, final int n, final int n2, final int n3) {
        if (class4197.field18882) {
            if (class4197.field18819[0][n2][n3] >= 0) {
                if (class4197.field18819[0][n2][n3] <= 30) {
                    if (class4197.field18819[1][n2][n3] >= 0) {
                        if (class4197.field18819[1][n2][n3] <= 24) {
                            if (n != 0) {
                                return Class4203.field18935[class4197.field18819[0][n2][n3]][class4197.field18819[1][n2][n3] >> 1];
                            }
                            return Class4203.field18934[class4197.field18819[0][n2][n3]][class4197.field18819[1][n2][n3] >> 1];
                        }
                    }
                }
            }
            return 0.0f;
        }
        if (class4197.field18819[n][n2][n3] >= 0 && class4197.field18819[n][n2][n3] <= 30) {
            return Class4203.field18933[class4197.field18819[n][n2][n3]];
        }
        return 0.0f;
    }
    
    public static void method12651(final Class4197 class4197, final int n) {
        if (!class4197.field18882) {
            final int n2 = class4197.field18786[n] ? 0 : 1;
            for (int i = 0; i < class4197.field18805[n]; ++i) {
                for (int j = 0; j < class4197.field18795[class4197.field18810[n][i]]; ++j) {
                    final int n3 = class4197.field18815[n][j][i] >> n2;
                    if (n3 >= 0 && n3 < 64) {
                        class4197.field18817[n][j][i] = Class4203.field18932[n3];
                        if (n2 != 0) {
                            if ((class4197.field18815[n][j][i] & 0x1) != 0x0) {
                                class4197.field18817[n][j][i] *= 1.4142135f;
                            }
                        }
                    }
                    else {
                        class4197.field18817[n][j][i] = 0.0f;
                    }
                }
            }
            for (int k = 0; k < class4197.field18807[n]; ++k) {
                for (int l = 0; l < class4197.field18793; ++l) {
                    class4197.field18820[n][l][k] = method12649(class4197, n, l, k);
                    class4197.field18821[n][l][k] = method12650(class4197, n, l, k);
                }
            }
        }
    }
    
    public static void method12652(final Class4197 class4197) {
        final int n = class4197.field18786[0] ? 0 : 1;
        final int n2 = class4197.field18786[1] ? 0 : 1;
        for (int i = 0; i < class4197.field18805[0]; ++i) {
            for (int j = 0; j < class4197.field18795[class4197.field18810[0][i]]; ++j) {
                final int n3 = (class4197.field18815[0][j][i] >> n) + 1;
                final int n4 = class4197.field18815[1][j][i] >> n2;
                if (n3 >= 0) {
                    if (n3 < 64) {
                        if (n4 >= 0) {
                            if (n4 <= 24) {
                                float n5 = Class4203.field18932[n3];
                                if (n != 0) {
                                    if ((class4197.field18815[0][j][i] & 0x1) != 0x0) {
                                        n5 *= (float)1.414213562;
                                    }
                                }
                                class4197.field18817[0][j][i] = n5 * Class4203.field18939[n4];
                                class4197.field18817[1][j][i] = n5 * Class4203.field18939[24 - n4];
                                continue;
                            }
                        }
                    }
                }
                class4197.field18817[1][j][i] = 0.0f;
                class4197.field18817[0][j][i] = 0.0f;
            }
        }
        for (int k = 0; k < class4197.field18807[0]; ++k) {
            for (int l = 0; l < class4197.field18793; ++l) {
                class4197.field18820[0][l][k] = method12649(class4197, 0, l, k);
                class4197.field18820[1][l][k] = method12649(class4197, 1, l, k);
                class4197.field18821[0][l][k] = method12650(class4197, 0, l, k);
                class4197.field18821[1][l][k] = method12650(class4197, 1, l, k);
            }
        }
    }
    
    static {
        field18932 = new float[] { 64.0f, 128.0f, 256.0f, 512.0f, 1024.0f, 2048.0f, 4096.0f, 8192.0f, 16384.0f, 32768.0f, 65536.0f, 131072.0f, 262144.0f, 524288.0f, 1048580.0f, 2097150.0f, 4194300.0f, 8388610.0f, 1.67772E7f, 3.35544E7f, 6.71089E7f, 1.34218E8f, 2.68435E8f, 5.36871E8f, 1.07374E9f, 2.14748E9f, 4.29497E9f, 8.58993E9f, 1.71799E10f, 3.43597E10f, 6.87195E10f, 1.37439E11f, 2.74878E11f, 5.49756E11f, 1.09951E12f, 2.19902E12f, 4.39805E12f, 8.79609E12f, 1.75922E13f, 3.51844E13f, 7.03687E13f, 1.40737E14f, 2.81475E14f, 5.6295E14f, 1.1259E15f, 2.2518E15f, 4.5036E15f, 9.0072E15f, 1.80144E16f, 3.60288E16f, 7.20576E16f, 1.44115E17f, 2.8823E17f, 5.76461E17f, 1.15292E18f, 2.30584E18f, 4.61169E18f, 9.22337E18f, 1.84467E19f, 3.68935E19f, 7.3787E19f, 1.47574E20f, 2.95148E20f, 5.90296E20f };
        field18933 = new float[] { 0.984615f, 0.969697f, 0.941176f, 0.888889f, 0.8f, 0.666667f, 0.5f, 0.333333f, 0.2f, 0.111111f, 0.0588235f, 0.030303f, 0.0153846f, 0.00775194f, 0.00389105f, 0.00194932f, 9.7561E-4f, 4.88043E-4f, 2.44081E-4f, 1.22055E-4f, 6.10314E-5f, 3.05166E-5f, 1.52586E-5f, 7.62934E-6f, 3.81468E-6f, 1.90734E-6f, 9.53673E-7f, 4.76837E-7f, 2.38419E-7f, 1.19209E-7f, 5.96046E-8f };
        field18934 = new float[][] { { 0.0302959f, 0.111015f, 0.332468f, 0.663212f, 0.882759f, 0.962406f, 0.984615f, 0.990329f, 0.991768f, 0.992128f, 0.992218f, 0.992241f, 0.992246f }, { 0.0153809f, 0.0587695f, 0.199377f, 0.496124f, 0.790123f, 0.927536f, 0.969697f, 0.980843f, 0.98367f, 0.984379f, 0.984556f, 0.984601f, 0.984612f }, { 0.00775006f, 0.0302744f, 0.110727f, 0.329897f, 0.653061f, 0.864865f, 0.941176f, 0.962406f, 0.967864f, 0.969238f, 0.969582f, 0.969668f, 0.96969f }, { 0.0038901f, 0.0153698f, 0.0586081f, 0.197531f, 0.484848f, 0.761905f, 0.888889f, 0.927536f, 0.937729f, 0.940312f, 0.94096f, 0.941122f, 0.941163f }, { 0.00194884f, 0.00774443f, 0.0301887f, 0.109589f, 0.32f, 0.615385f, 0.8f, 0.864865f, 0.882759f, 0.887348f, 0.888503f, 0.888792f, 0.888865f }, { 9.75372E-4f, 0.00388727f, 0.0153257f, 0.057971f, 0.190476f, 0.444444f, 0.666667f, 0.761905f, 0.790123f, 0.797508f, 0.799375f, 0.799844f, 0.799961f }, { 4.87924E-4f, 0.00194742f, 0.00772201f, 0.0298507f, 0.105263f, 0.285714f, 0.5f, 0.615385f, 0.653061f, 0.663212f, 0.6658f, 0.66645f, 0.666612f }, { 2.44021E-4f, 9.74659E-4f, 0.00387597f, 0.0151515f, 0.0555556f, 0.166667f, 0.333333f, 0.444444f, 0.484848f, 0.496124f, 0.499025f, 0.499756f, 0.499939f }, { 1.22026E-4f, 4.87567E-4f, 0.00194175f, 0.00763359f, 0.0285714f, 0.0909091f, 0.2f, 0.285714f, 0.32f, 0.329897f, 0.332468f, 0.333116f, 0.333279f }, { 6.10165E-5f, 2.43843E-4f, 9.71817E-4f, 0.00383142f, 0.0144928f, 0.047619f, 0.111111f, 0.166667f, 0.190476f, 0.197531f, 0.199377f, 0.199844f, 0.199961f }, { 3.05092E-5f, 1.21936E-4f, 4.86145E-4f, 0.00191939f, 0.00729927f, 0.0243902f, 0.0588235f, 0.0909091f, 0.105263f, 0.109589f, 0.110727f, 0.111015f, 0.111087f }, { 1.52548E-5f, 6.09719E-5f, 2.43132E-4f, 9.60615E-4f, 0.003663f, 0.0123457f, 0.030303f, 0.047619f, 0.0555556f, 0.057971f, 0.0586081f, 0.0587695f, 0.05881f }, { 7.62747E-6f, 3.04869E-5f, 1.21581E-4f, 4.80538E-4f, 0.00183486f, 0.00621118f, 0.0153846f, 0.0243902f, 0.0285714f, 0.0298507f, 0.0301887f, 0.0302744f, 0.0302959f }, { 3.81375E-6f, 1.52437E-5f, 6.0794E-5f, 2.40327E-4f, 9.18274E-4f, 0.00311526f, 0.00775194f, 0.0123457f, 0.0144928f, 0.0151515f, 0.0153257f, 0.0153698f, 0.0153809f }, { 1.90688E-6f, 7.62189E-6f, 3.03979E-5f, 1.20178E-4f, 4.59348E-4f, 0.00156006f, 0.00389105f, 0.00621118f, 0.00729927f, 0.00763359f, 0.00772201f, 0.00774443f, 0.00775006f }, { 9.53441E-7f, 3.81096E-6f, 1.51992E-5f, 6.00925E-5f, 2.29727E-4f, 7.8064E-4f, 0.00194932f, 0.00311526f, 0.003663f, 0.00383142f, 0.00387597f, 0.00388727f, 0.0038901f }, { 4.76721E-7f, 1.90548E-6f, 7.59965E-6f, 3.00472E-5f, 1.14877E-4f, 3.90472E-4f, 9.7561E-4f, 0.00156006f, 0.00183486f, 0.00191939f, 0.00194175f, 0.00194742f, 0.00194884f }, { 2.3836E-7f, 9.52743E-7f, 3.79984E-6f, 1.50238E-5f, 5.74416E-5f, 1.95274E-4f, 4.88043E-4f, 7.8064E-4f, 9.18274E-4f, 9.60615E-4f, 9.71817E-4f, 9.74659E-4f, 9.75372E-4f }, { 1.1918E-7f, 4.76372E-7f, 1.89992E-6f, 7.51196E-6f, 2.87216E-5f, 9.76467E-5f, 2.44081E-4f, 3.90472E-4f, 4.59348E-4f, 4.80538E-4f, 4.86145E-4f, 4.87567E-4f, 4.87924E-4f }, { 5.95901E-8f, 2.38186E-7f, 9.49963E-7f, 3.756E-6f, 1.4361E-5f, 4.88257E-5f, 1.22055E-4f, 1.95274E-4f, 2.29727E-4f, 2.40327E-4f, 2.43132E-4f, 2.43843E-4f, 2.44021E-4f }, { 2.9795E-8f, 1.19093E-7f, 4.74982E-7f, 1.878E-6f, 7.18056E-6f, 2.44135E-5f, 6.10314E-5f, 9.76467E-5f, 1.14877E-4f, 1.20178E-4f, 1.21581E-4f, 1.21936E-4f, 1.22026E-4f }, { 1.48975E-8f, 5.95465E-8f, 2.37491E-7f, 9.39002E-7f, 3.59029E-6f, 1.22069E-5f, 3.05166E-5f, 4.88257E-5f, 5.74416E-5f, 6.00925E-5f, 6.0794E-5f, 6.09719E-5f, 6.10165E-5f }, { 7.44876E-9f, 2.97732E-8f, 1.18745E-7f, 4.69501E-7f, 1.79515E-6f, 6.10348E-6f, 1.52586E-5f, 2.44135E-5f, 2.87216E-5f, 3.00472E-5f, 3.03979E-5f, 3.04869E-5f, 3.05092E-5f }, { 3.72438E-9f, 1.48866E-8f, 5.93727E-8f, 2.34751E-7f, 8.97575E-7f, 3.05175E-6f, 7.62934E-6f, 1.22069E-5f, 1.4361E-5f, 1.50238E-5f, 1.51992E-5f, 1.52437E-5f, 1.52548E-5f }, { 1.86219E-9f, 7.44331E-9f, 2.96864E-8f, 1.17375E-7f, 4.48788E-7f, 1.52588E-6f, 3.81468E-6f, 6.10348E-6f, 7.18056E-6f, 7.51196E-6f, 7.59965E-6f, 7.62189E-6f, 7.62747E-6f }, { 9.31095E-10f, 3.72166E-9f, 1.48432E-8f, 5.86876E-8f, 2.24394E-7f, 7.62939E-7f, 1.90734E-6f, 3.05175E-6f, 3.59029E-6f, 3.756E-6f, 3.79984E-6f, 3.81096E-6f, 3.81375E-6f }, { 4.65548E-10f, 1.86083E-9f, 7.42159E-9f, 2.93438E-8f, 1.12197E-7f, 3.8147E-7f, 9.53673E-7f, 1.52588E-6f, 1.79515E-6f, 1.878E-6f, 1.89992E-6f, 1.90548E-6f, 1.90688E-6f }, { 2.32774E-10f, 9.30414E-10f, 3.71079E-9f, 1.46719E-8f, 5.60985E-8f, 1.90735E-7f, 4.76837E-7f, 7.62939E-7f, 8.97575E-7f, 9.39002E-7f, 9.49963E-7f, 9.52743E-7f, 9.53441E-7f }, { 1.16387E-10f, 4.65207E-10f, 1.8554E-9f, 7.33596E-9f, 2.80492E-8f, 9.53674E-8f, 2.38419E-7f, 3.8147E-7f, 4.48788E-7f, 4.69501E-7f, 4.74982E-7f, 4.76372E-7f, 4.76721E-7f }, { 5.81935E-11f, 2.32603E-10f, 9.27699E-10f, 3.66798E-9f, 1.40246E-8f, 4.76837E-8f, 1.19209E-7f, 1.90735E-7f, 2.24394E-7f, 2.34751E-7f, 2.37491E-7f, 2.38186E-7f, 2.3836E-7f }, { 2.90967E-11f, 1.16302E-10f, 4.63849E-10f, 1.83399E-9f, 7.01231E-9f, 2.38419E-8f, 5.96046E-8f, 9.53674E-8f, 1.12197E-7f, 1.17375E-7f, 1.18745E-7f, 1.19093E-7f, 1.1918E-7f } };
        field18935 = new float[][] { { 0.992246f, 0.992241f, 0.992218f, 0.992128f, 0.991768f, 0.990329f, 0.984615f, 0.962406f, 0.882759f, 0.663212f, 0.332468f, 0.111015f, 0.0302959f }, { 0.984612f, 0.984601f, 0.984556f, 0.984379f, 0.98367f, 0.980843f, 0.969697f, 0.927536f, 0.790123f, 0.496124f, 0.199377f, 0.0587695f, 0.0153809f }, { 0.96969f, 0.969668f, 0.969582f, 0.969238f, 0.967864f, 0.962406f, 0.941176f, 0.864865f, 0.653061f, 0.329897f, 0.110727f, 0.0302744f, 0.00775006f }, { 0.941163f, 0.941122f, 0.94096f, 0.940312f, 0.937729f, 0.927536f, 0.888889f, 0.761905f, 0.484848f, 0.197531f, 0.0586081f, 0.0153698f, 0.0038901f }, { 0.888865f, 0.888792f, 0.888503f, 0.887348f, 0.882759f, 0.864865f, 0.8f, 0.615385f, 0.32f, 0.109589f, 0.0301887f, 0.00774443f, 0.00194884f }, { 0.799961f, 0.799844f, 0.799375f, 0.797508f, 0.790123f, 0.761905f, 0.666667f, 0.444444f, 0.190476f, 0.057971f, 0.0153257f, 0.00388727f, 9.75372E-4f }, { 0.666612f, 0.66645f, 0.6658f, 0.663212f, 0.653061f, 0.615385f, 0.5f, 0.285714f, 0.105263f, 0.0298507f, 0.00772201f, 0.00194742f, 4.87924E-4f }, { 0.499939f, 0.499756f, 0.499025f, 0.496124f, 0.484848f, 0.444444f, 0.333333f, 0.166667f, 0.0555556f, 0.0151515f, 0.00387597f, 9.74659E-4f, 2.44021E-4f }, { 0.333279f, 0.333116f, 0.332468f, 0.329897f, 0.32f, 0.285714f, 0.2f, 0.0909091f, 0.0285714f, 0.00763359f, 0.00194175f, 4.87567E-4f, 1.22026E-4f }, { 0.199961f, 0.199844f, 0.199377f, 0.197531f, 0.190476f, 0.166667f, 0.111111f, 0.047619f, 0.0144928f, 0.00383142f, 9.71817E-4f, 2.43843E-4f, 6.10165E-5f }, { 0.111087f, 0.111015f, 0.110727f, 0.109589f, 0.105263f, 0.0909091f, 0.0588235f, 0.0243902f, 0.00729927f, 0.00191939f, 4.86145E-4f, 1.21936E-4f, 3.05092E-5f }, { 0.05881f, 0.0587695f, 0.0586081f, 0.057971f, 0.0555556f, 0.047619f, 0.030303f, 0.0123457f, 0.003663f, 9.60615E-4f, 2.43132E-4f, 6.09719E-5f, 1.52548E-5f }, { 0.0302959f, 0.0302744f, 0.0301887f, 0.0298507f, 0.0285714f, 0.0243902f, 0.0153846f, 0.00621118f, 0.00183486f, 4.80538E-4f, 1.21581E-4f, 3.04869E-5f, 7.62747E-6f }, { 0.0153809f, 0.0153698f, 0.0153257f, 0.0151515f, 0.0144928f, 0.0123457f, 0.00775194f, 0.00311526f, 9.18274E-4f, 2.40327E-4f, 6.0794E-5f, 1.52437E-5f, 3.81375E-6f }, { 0.00775006f, 0.00774443f, 0.00772201f, 0.00763359f, 0.00729927f, 0.00621118f, 0.00389105f, 0.00156006f, 4.59348E-4f, 1.20178E-4f, 3.03979E-5f, 7.62189E-6f, 1.90688E-6f }, { 0.0038901f, 0.00388727f, 0.00387597f, 0.00383142f, 0.003663f, 0.00311526f, 0.00194932f, 7.8064E-4f, 2.29727E-4f, 6.00925E-5f, 1.51992E-5f, 3.81096E-6f, 9.53441E-7f }, { 0.00194884f, 0.00194742f, 0.00194175f, 0.00191939f, 0.00183486f, 0.00156006f, 9.7561E-4f, 3.90472E-4f, 1.14877E-4f, 3.00472E-5f, 7.59965E-6f, 1.90548E-6f, 4.76721E-7f }, { 9.75372E-4f, 9.74659E-4f, 9.71817E-4f, 9.60615E-4f, 9.18274E-4f, 7.8064E-4f, 4.88043E-4f, 1.95274E-4f, 5.74416E-5f, 1.50238E-5f, 3.79984E-6f, 9.52743E-7f, 2.3836E-7f }, { 4.87924E-4f, 4.87567E-4f, 4.86145E-4f, 4.80538E-4f, 4.59348E-4f, 3.90472E-4f, 2.44081E-4f, 9.76467E-5f, 2.87216E-5f, 7.51196E-6f, 1.89992E-6f, 4.76372E-7f, 1.1918E-7f }, { 2.44021E-4f, 2.43843E-4f, 2.43132E-4f, 2.40327E-4f, 2.29727E-4f, 1.95274E-4f, 1.22055E-4f, 4.88257E-5f, 1.4361E-5f, 3.756E-6f, 9.49963E-7f, 2.38186E-7f, 5.95901E-8f }, { 1.22026E-4f, 1.21936E-4f, 1.21581E-4f, 1.20178E-4f, 1.14877E-4f, 9.76467E-5f, 6.10314E-5f, 2.44135E-5f, 7.18056E-6f, 1.878E-6f, 4.74982E-7f, 1.19093E-7f, 2.9795E-8f }, { 6.10165E-5f, 6.09719E-5f, 6.0794E-5f, 6.00925E-5f, 5.74416E-5f, 4.88257E-5f, 3.05166E-5f, 1.22069E-5f, 3.59029E-6f, 9.39002E-7f, 2.37491E-7f, 5.95465E-8f, 1.48975E-8f }, { 3.05092E-5f, 3.04869E-5f, 3.03979E-5f, 3.00472E-5f, 2.87216E-5f, 2.44135E-5f, 1.52586E-5f, 6.10348E-6f, 1.79515E-6f, 4.69501E-7f, 1.18745E-7f, 2.97732E-8f, 7.44876E-9f }, { 1.52548E-5f, 1.52437E-5f, 1.51992E-5f, 1.50238E-5f, 1.4361E-5f, 1.22069E-5f, 7.62934E-6f, 3.05175E-6f, 8.97575E-7f, 2.34751E-7f, 5.93727E-8f, 1.48866E-8f, 3.72438E-9f }, { 7.62747E-6f, 7.62189E-6f, 7.59965E-6f, 7.51196E-6f, 7.18056E-6f, 6.10348E-6f, 3.81468E-6f, 1.52588E-6f, 4.48788E-7f, 1.17375E-7f, 2.96864E-8f, 7.44331E-9f, 1.86219E-9f }, { 3.81375E-6f, 3.81096E-6f, 3.79984E-6f, 3.756E-6f, 3.59029E-6f, 3.05175E-6f, 1.90734E-6f, 7.62939E-7f, 2.24394E-7f, 5.86876E-8f, 1.48432E-8f, 3.72166E-9f, 9.31095E-10f }, { 1.90688E-6f, 1.90548E-6f, 1.89992E-6f, 1.878E-6f, 1.79515E-6f, 1.52588E-6f, 9.53673E-7f, 3.8147E-7f, 1.12197E-7f, 2.93438E-8f, 7.42159E-9f, 1.86083E-9f, 4.65548E-10f }, { 9.53441E-7f, 9.52743E-7f, 9.49963E-7f, 9.39002E-7f, 8.97575E-7f, 7.62939E-7f, 4.76837E-7f, 1.90735E-7f, 5.60985E-8f, 1.46719E-8f, 3.71079E-9f, 9.30414E-10f, 2.32774E-10f }, { 4.76721E-7f, 4.76372E-7f, 4.74982E-7f, 4.69501E-7f, 4.48788E-7f, 3.8147E-7f, 2.38419E-7f, 9.53674E-8f, 2.80492E-8f, 7.33596E-9f, 1.8554E-9f, 4.65207E-10f, 1.16387E-10f }, { 2.3836E-7f, 2.38186E-7f, 2.37491E-7f, 2.34751E-7f, 2.24394E-7f, 1.90735E-7f, 1.19209E-7f, 4.76837E-8f, 1.40246E-8f, 3.66798E-9f, 9.27699E-10f, 2.32603E-10f, 5.81935E-11f }, { 1.1918E-7f, 1.19093E-7f, 1.18745E-7f, 1.17375E-7f, 1.12197E-7f, 9.53674E-8f, 5.96046E-8f, 2.38419E-8f, 7.01231E-9f, 1.83399E-9f, 4.63849E-10f, 1.16302E-10f, 2.90967E-11f } };
        field18936 = new float[] { 0.0153846f, 0.030303f, 0.0588235f, 0.111111f, 0.2f, 0.333333f, 0.5f, 0.666667f, 0.8f, 0.888889f, 0.941176f, 0.969697f, 0.984615f, 0.992248f, 0.996109f, 0.998051f, 0.999024f, 0.999512f, 0.999756f, 0.999878f, 0.999939f, 0.999969f, 0.999985f, 0.999992f, 0.999996f, 0.999998f, 0.999999f, 1.0f, 1.0f, 1.0f, 1.0f };
        field18937 = new float[][] { { 0.969704f, 0.888985f, 0.667532f, 0.336788f, 0.117241f, 0.037594f, 0.0153846f, 0.00967118f, 0.00823245f, 0.00787211f, 0.00778198f, 0.00775945f, 0.00775382f }, { 0.984619f, 0.94123f, 0.800623f, 0.503876f, 0.209877f, 0.0724638f, 0.030303f, 0.0191571f, 0.0163305f, 0.0156212f, 0.0154438f, 0.0153994f, 0.0153883f }, { 0.99225f, 0.969726f, 0.889273f, 0.670103f, 0.346939f, 0.135135f, 0.0588235f, 0.037594f, 0.0321361f, 0.0307619f, 0.0304178f, 0.0303317f, 0.0303102f }, { 0.99611f, 0.98463f, 0.941392f, 0.802469f, 0.515152f, 0.238095f, 0.111111f, 0.0724638f, 0.0622711f, 0.0596878f, 0.0590397f, 0.0588776f, 0.058837f }, { 0.998051f, 0.992256f, 0.969811f, 0.890411f, 0.68f, 0.384615f, 0.2f, 0.135135f, 0.117241f, 0.112652f, 0.111497f, 0.111208f, 0.111135f }, { 0.999025f, 0.996113f, 0.984674f, 0.942029f, 0.809524f, 0.555556f, 0.333333f, 0.238095f, 0.209877f, 0.202492f, 0.200625f, 0.200156f, 0.200039f }, { 0.999512f, 0.998053f, 0.992278f, 0.970149f, 0.894737f, 0.714286f, 0.5f, 0.384615f, 0.346939f, 0.336788f, 0.3342f, 0.33355f, 0.333388f }, { 0.999756f, 0.999025f, 0.996124f, 0.984848f, 0.944444f, 0.833333f, 0.666667f, 0.555556f, 0.515152f, 0.503876f, 0.500975f, 0.500244f, 0.500061f }, { 0.999878f, 0.999512f, 0.998058f, 0.992366f, 0.971429f, 0.909091f, 0.8f, 0.714286f, 0.68f, 0.670103f, 0.667532f, 0.666884f, 0.666721f }, { 0.999939f, 0.999756f, 0.999028f, 0.996169f, 0.985507f, 0.952381f, 0.888889f, 0.833333f, 0.809524f, 0.802469f, 0.800623f, 0.800156f, 0.800039f }, { 0.999969f, 0.999878f, 0.999514f, 0.998081f, 0.992701f, 0.97561f, 0.941176f, 0.909091f, 0.894737f, 0.890411f, 0.889273f, 0.888985f, 0.888913f }, { 0.999985f, 0.999939f, 0.999757f, 0.999039f, 0.996337f, 0.987654f, 0.969697f, 0.952381f, 0.944444f, 0.942029f, 0.941392f, 0.94123f, 0.94119f }, { 0.999992f, 0.99997f, 0.999878f, 0.999519f, 0.998165f, 0.993789f, 0.984615f, 0.97561f, 0.971429f, 0.970149f, 0.969811f, 0.969726f, 0.969704f }, { 0.999996f, 0.999985f, 0.999939f, 0.99976f, 0.999082f, 0.996885f, 0.992248f, 0.987654f, 0.985507f, 0.984848f, 0.984674f, 0.98463f, 0.984619f }, { 0.999998f, 0.999992f, 0.99997f, 0.99988f, 0.999541f, 0.99844f, 0.996109f, 0.993789f, 0.992701f, 0.992366f, 0.992278f, 0.992256f, 0.99225f }, { 0.999999f, 0.999996f, 0.999985f, 0.99994f, 0.99977f, 0.999219f, 0.998051f, 0.996885f, 0.996337f, 0.996169f, 0.996124f, 0.996113f, 0.99611f }, { 1.0f, 0.999998f, 0.999992f, 0.99997f, 0.999885f, 0.99961f, 0.999024f, 0.99844f, 0.998165f, 0.998081f, 0.998058f, 0.998053f, 0.998051f }, { 1.0f, 0.999999f, 0.999996f, 0.999985f, 0.999943f, 0.999805f, 0.999512f, 0.999219f, 0.999082f, 0.999039f, 0.999028f, 0.999025f, 0.999025f }, { 1.0f, 1.0f, 0.999998f, 0.999992f, 0.999971f, 0.999902f, 0.999756f, 0.99961f, 0.999541f, 0.999519f, 0.999514f, 0.999512f, 0.999512f }, { 1.0f, 1.0f, 0.999999f, 0.999996f, 0.999986f, 0.999951f, 0.999878f, 0.999805f, 0.99977f, 0.99976f, 0.999757f, 0.999756f, 0.999756f }, { 1.0f, 1.0f, 1.0f, 0.999998f, 0.999993f, 0.999976f, 0.999939f, 0.999902f, 0.999885f, 0.99988f, 0.999878f, 0.999878f, 0.999878f }, { 1.0f, 1.0f, 1.0f, 0.999999f, 0.999996f, 0.999988f, 0.999969f, 0.999951f, 0.999943f, 0.99994f, 0.999939f, 0.999939f, 0.999939f }, { 1.0f, 1.0f, 1.0f, 1.0f, 0.999998f, 0.999994f, 0.999985f, 0.999976f, 0.999971f, 0.99997f, 0.99997f, 0.99997f, 0.999969f }, { 1.0f, 1.0f, 1.0f, 1.0f, 0.999999f, 0.999997f, 0.999992f, 0.999988f, 0.999986f, 0.999985f, 0.999985f, 0.999985f, 0.999985f }, { 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.999998f, 0.999996f, 0.999994f, 0.999993f, 0.999992f, 0.999992f, 0.999992f, 0.999992f }, { 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.999999f, 0.999998f, 0.999997f, 0.999996f, 0.999996f, 0.999996f, 0.999996f, 0.999996f }, { 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.999999f, 0.999998f, 0.999998f, 0.999998f, 0.999998f, 0.999998f, 0.999998f }, { 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.999999f, 0.999999f, 0.999999f, 0.999999f, 0.999999f, 0.999999f }, { 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f }, { 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f }, { 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f } };
        field18938 = new float[][] { { 0.00775382f, 0.00775945f, 0.00778198f, 0.00787211f, 0.00823245f, 0.00967118f, 0.0153846f, 0.037594f, 0.117241f, 0.336788f, 0.667532f, 0.888985f, 0.969704f }, { 0.0153883f, 0.0153994f, 0.0154438f, 0.0156212f, 0.0163305f, 0.0191571f, 0.030303f, 0.0724638f, 0.209877f, 0.503876f, 0.800623f, 0.94123f, 0.984619f }, { 0.0303102f, 0.0303317f, 0.0304178f, 0.0307619f, 0.0321361f, 0.037594f, 0.0588235f, 0.135135f, 0.346939f, 0.670103f, 0.889273f, 0.969726f, 0.99225f }, { 0.058837f, 0.0588776f, 0.0590397f, 0.0596878f, 0.0622711f, 0.0724638f, 0.111111f, 0.238095f, 0.515152f, 0.802469f, 0.941392f, 0.98463f, 0.99611f }, { 0.111135f, 0.111208f, 0.111497f, 0.112652f, 0.117241f, 0.135135f, 0.2f, 0.384615f, 0.68f, 0.890411f, 0.969811f, 0.992256f, 0.998051f }, { 0.200039f, 0.200156f, 0.200625f, 0.202492f, 0.209877f, 0.238095f, 0.333333f, 0.555556f, 0.809524f, 0.942029f, 0.984674f, 0.996113f, 0.999025f }, { 0.333388f, 0.33355f, 0.3342f, 0.336788f, 0.346939f, 0.384615f, 0.5f, 0.714286f, 0.894737f, 0.970149f, 0.992278f, 0.998053f, 0.999512f }, { 0.500061f, 0.500244f, 0.500975f, 0.503876f, 0.515152f, 0.555556f, 0.666667f, 0.833333f, 0.944444f, 0.984848f, 0.996124f, 0.999025f, 0.999756f }, { 0.666721f, 0.666884f, 0.667532f, 0.670103f, 0.68f, 0.714286f, 0.8f, 0.909091f, 0.971429f, 0.992366f, 0.998058f, 0.999512f, 0.999878f }, { 0.800039f, 0.800156f, 0.800623f, 0.802469f, 0.809524f, 0.833333f, 0.888889f, 0.952381f, 0.985507f, 0.996169f, 0.999028f, 0.999756f, 0.999939f }, { 0.888913f, 0.888985f, 0.889273f, 0.890411f, 0.894737f, 0.909091f, 0.941176f, 0.97561f, 0.992701f, 0.998081f, 0.999514f, 0.999878f, 0.999969f }, { 0.94119f, 0.94123f, 0.941392f, 0.942029f, 0.944444f, 0.952381f, 0.969697f, 0.987654f, 0.996337f, 0.999039f, 0.999757f, 0.999939f, 0.999985f }, { 0.969704f, 0.969726f, 0.969811f, 0.970149f, 0.971429f, 0.97561f, 0.984615f, 0.993789f, 0.998165f, 0.999519f, 0.999878f, 0.99997f, 0.999992f }, { 0.984619f, 0.98463f, 0.984674f, 0.984848f, 0.985507f, 0.987654f, 0.992248f, 0.996885f, 0.999082f, 0.99976f, 0.999939f, 0.999985f, 0.999996f }, { 0.99225f, 0.992256f, 0.992278f, 0.992366f, 0.992701f, 0.993789f, 0.996109f, 0.99844f, 0.999541f, 0.99988f, 0.99997f, 0.999992f, 0.999998f }, { 0.99611f, 0.996113f, 0.996124f, 0.996169f, 0.996337f, 0.996885f, 0.998051f, 0.999219f, 0.99977f, 0.99994f, 0.999985f, 0.999996f, 0.999999f }, { 0.998051f, 0.998053f, 0.998058f, 0.998081f, 0.998165f, 0.99844f, 0.999024f, 0.99961f, 0.999885f, 0.99997f, 0.999992f, 0.999998f, 1.0f }, { 0.999025f, 0.999025f, 0.999028f, 0.999039f, 0.999082f, 0.999219f, 0.999512f, 0.999805f, 0.999943f, 0.999985f, 0.999996f, 0.999999f, 1.0f }, { 0.999512f, 0.999512f, 0.999514f, 0.999519f, 0.999541f, 0.99961f, 0.999756f, 0.999902f, 0.999971f, 0.999992f, 0.999998f, 1.0f, 1.0f }, { 0.999756f, 0.999756f, 0.999757f, 0.99976f, 0.99977f, 0.999805f, 0.999878f, 0.999951f, 0.999986f, 0.999996f, 0.999999f, 1.0f, 1.0f }, { 0.999878f, 0.999878f, 0.999878f, 0.99988f, 0.999885f, 0.999902f, 0.999939f, 0.999976f, 0.999993f, 0.999998f, 1.0f, 1.0f, 1.0f }, { 0.999939f, 0.999939f, 0.999939f, 0.99994f, 0.999943f, 0.999951f, 0.999969f, 0.999988f, 0.999996f, 0.999999f, 1.0f, 1.0f, 1.0f }, { 0.999969f, 0.99997f, 0.99997f, 0.99997f, 0.999971f, 0.999976f, 0.999985f, 0.999994f, 0.999998f, 1.0f, 1.0f, 1.0f, 1.0f }, { 0.999985f, 0.999985f, 0.999985f, 0.999985f, 0.999986f, 0.999988f, 0.999992f, 0.999997f, 0.999999f, 1.0f, 1.0f, 1.0f, 1.0f }, { 0.999992f, 0.999992f, 0.999992f, 0.999992f, 0.999993f, 0.999994f, 0.999996f, 0.999998f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f }, { 0.999996f, 0.999996f, 0.999996f, 0.999996f, 0.999996f, 0.999997f, 0.999998f, 0.999999f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f }, { 0.999998f, 0.999998f, 0.999998f, 0.999998f, 0.999998f, 0.999998f, 0.999999f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f }, { 0.999999f, 0.999999f, 0.999999f, 0.999999f, 0.999999f, 0.999999f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f }, { 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f }, { 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f }, { 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f } };
        field18939 = new float[] { 2.44081E-4f, 4.88043E-4f, 9.7561E-4f, 0.00194932f, 0.00389105f, 0.00775194f, 0.0153846f, 0.030303f, 0.0588235f, 0.111111f, 0.2f, 0.333333f, 0.5f, 0.666667f, 0.8f, 0.888889f, 0.941176f, 0.969697f, 0.984615f, 0.992248f, 0.996109f, 0.998051f, 0.999024f, 0.999512f, 0.999756f };
    }
}