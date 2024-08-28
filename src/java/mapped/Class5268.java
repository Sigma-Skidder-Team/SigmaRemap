package mapped;

import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.util.InDevelopment;

@InDevelopment
public class Class5268 extends Module {
    public Class5268() {
        super(ModuleCategory.EXPLOIT, "BedRockFinder", "Finds cords based on bedrock patterns");
    }

    public static void method16489(long var0, long var2) {
        long var6 = var0 * 341873128712L + var2 * 132897987541L ^ 25214903917L;
        char[] var8 = new char[17];
        var8[16] = '\n';

        for (int var9 = 0; var9 < 16; var9++) {
            for (int var10 = 0; var10 < 16; var10++) {
                var6 = var6 * 709490313259657689L + 1748772144486964054L;
                var6 &= 281474976710655L;
                if (4L > (var6 >> 17) % 5L) {
                    var8[var10] = ' ';
                } else {
                    var8[var10] = '*';
                }

                var6 = var6 * 5985058416696778513L + -8542997297661424380L;
            }

            System.out.print(var8);
        }
    }

    @Override
    public void method15966() {
        int[] var3 = new int[]{
                0,
                0,
                0,
                0,
                0,
                1,
                1,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                1,
                0,
                1,
                0,
                0,
                0,
                0,
                0,
                1,
                1,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                1,
                0,
                1,
                1,
                0,
                1,
                0,
                1,
                1,
                0,
                0,
                1,
                0,
                1,
                1,
                0,
                0,
                0,
                0,
                1,
                0,
                0,
                0,
                0,
                0,
                1,
                0,
                0,
                0
        };
        System.out.println(this.method16488(var3, 8, 8, 38, -55));
    }

    private Class9499 method16488(int[] var1, int var2, int var3, int var4, int var5) {
        int[] var8 = new int[2304];

        for (long var9 = -1L; var9 <= 1L; var9++) {
            for (long var12 = -1L; var12 <= 1L; var12++) {
                long var14 = (long) var4 + var12;
                long var16 = (long) var5 + var9;
                long var18 = var14 * 341873128712L + var16 * 132897987541L ^ 25214903917L;

                for (int var20 = 0; var20 < 16; var20++) {
                    for (int var21 = 0; var21 < 16; var21++) {
                        var18 = var18 * 709490313259657689L + 1748772144486964054L;
                        var18 &= 281474976710655L;
                        if (4L > (var18 >> 17) % 5L) {
                            var8[(int) ((16L * (var9 + 1L) + (long) var20) * 48L + 16L * (var12 + 1L) + (long) var21)] = 0;
                        } else {
                            var8[(int) ((16L * (var9 + 1L) + (long) var20) * 48L + 16L * (var12 + 1L) + (long) var21)] = 1;
                        }

                        var18 = var18 * 5985058416696778513L + -8542997297661424380L;
                    }
                }
            }
        }

        for (int var11 = 0; var11 <= 48 - var2; var11++) {
            for (int var22 = 0; var22 <= 48 - var3; var22++) {
                boolean var23 = true;

                for (int var24 = 0; var24 < var2 && var23; var24++) {
                    for (int var25 = 0; var25 < var3 && var23; var25++) {
                        if (var1[var24 * var3 + var25] != var8[(var11 + var24) * 48 + var22 + var25]) {
                            var23 = false;
                            break;
                        }

                        if (!var23) {
                            break;
                        }
                    }
                }

                if (var23) {
                    return new Class9499(var11, var22);
                }
            }
        }

        return null;
    }
}
