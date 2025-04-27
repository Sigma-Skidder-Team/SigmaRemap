// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.sourceforge.jaad.aac.AACException;
import java.util.Arrays;

public class Class4197 implements Class4198, Class4178, Class4204
{
    private final boolean field18780;
    public final Class2077 field18781;
    public int field18782;
    public int field18783;
    public boolean field18784;
    public int field18785;
    public boolean[] field18786;
    public int field18787;
    public int field18788;
    public int field18789;
    public int field18790;
    public int field18791;
    public int field18792;
    public int field18793;
    public int[] field18794;
    public int[] field18795;
    public int[] field18796;
    public int[][] field18797;
    public int[] field18798;
    public int[][] field18799;
    public int[] field18800;
    public int[] field18801;
    public int[] field18802;
    public int[] field18803;
    public int[] field18804;
    public int[] field18805;
    public int[] field18806;
    public int[] field18807;
    public int[][] field18808;
    public int[][] field18809;
    public int[][] field18810;
    public int[] field18811;
    public float[][][] field18812;
    public float[][][] field18813;
    public int[] field18814;
    public int[][][] field18815;
    public int[][] field18816;
    public float[][][] field18817;
    public float[][][] field18818;
    public int[][][] field18819;
    public float[][][] field18820;
    public float[][][] field18821;
    public int[][] field18822;
    public int[] field18823;
    public int[] field18824;
    public int[][] field18825;
    public int[][] field18826;
    public float[][] field18827;
    public float[][] field18828;
    public int field18829;
    public int[] field18830;
    public int[] field18831;
    public int[][] field18832;
    public int[][] field18833;
    public int[] field18834;
    public int[] field18835;
    public int field18836;
    public int field18837;
    public int field18838;
    public int field18839;
    public boolean field18840;
    public int field18841;
    public int[] field18842;
    public int field18843;
    public int field18844;
    public int field18845;
    public int field18846;
    public boolean field18847;
    public int field18848;
    public int field18849;
    public boolean field18850;
    public Class6443[] field18851;
    public Class6442[] field18852;
    public float[][][][] field18853;
    public int field18854;
    public int field18855;
    public int field18856;
    public int field18857;
    public Class5598 field18858;
    public boolean field18859;
    public boolean field18860;
    public boolean field18861;
    public int field18862;
    public int field18863;
    public int field18864;
    public boolean field18865;
    public int field18866;
    public int field18867;
    public int field18868;
    public int field18869;
    public boolean field18870;
    public int field18871;
    public int field18872;
    public int field18873;
    public boolean field18874;
    public boolean field18875;
    public int field18876;
    public boolean[] field18877;
    public boolean[] field18878;
    public boolean field18879;
    public int field18880;
    public int field18881;
    public boolean field18882;
    public int[] field18883;
    public int[][] field18884;
    public int[][] field18885;
    public int[][] field18886;
    public int[] field18887;
    public int[] field18888;
    public int[] field18889;
    public int[] field18890;
    public int[] field18891;
    public int[][] field18892;
    public int[][] field18893;
    
    public Class4197(final boolean b, final boolean field18850, final Class2077 field18851, final boolean field18852) {
        this.field18786 = new boolean[2];
        this.field18794 = new int[4];
        this.field18795 = new int[2];
        this.field18796 = new int[64];
        this.field18797 = new int[2][64];
        this.field18798 = new int[64];
        this.field18799 = new int[4][64];
        this.field18800 = new int[64];
        this.field18801 = new int[2];
        this.field18802 = new int[2];
        this.field18803 = new int[2];
        this.field18804 = new int[2];
        this.field18805 = new int[2];
        this.field18806 = new int[2];
        this.field18807 = new int[2];
        this.field18808 = new int[2][6];
        this.field18809 = new int[2][3];
        this.field18810 = new int[2][6];
        this.field18811 = new int[2];
        this.field18812 = new float[2][5][64];
        this.field18813 = new float[2][5][64];
        this.field18814 = new int[2];
        this.field18815 = new int[2][64][5];
        this.field18816 = new int[2][64];
        this.field18817 = new float[2][64][5];
        this.field18818 = new float[2][64][5];
        this.field18819 = new int[2][64][2];
        this.field18820 = new float[2][64][2];
        this.field18821 = new float[2][64][2];
        this.field18822 = new int[2][64];
        this.field18823 = new int[2];
        this.field18824 = new int[2];
        this.field18825 = new int[2][5];
        this.field18826 = new int[2][5];
        this.field18827 = new float[2][64];
        this.field18828 = new float[2][64];
        this.field18830 = new int[64];
        this.field18831 = new int[64];
        this.field18832 = new int[2][64];
        this.field18833 = new int[2][64];
        this.field18834 = new int[2];
        this.field18835 = new int[2];
        this.field18842 = new int[2];
        this.field18851 = new Class6443[2];
        this.field18852 = new Class6442[2];
        this.field18853 = new float[2][40][64][2];
        this.field18877 = new boolean[2];
        this.field18878 = new boolean[2];
        this.field18883 = new int[2];
        this.field18884 = new int[2][9];
        this.field18885 = new int[2][9];
        this.field18886 = new int[2][9];
        this.field18887 = new int[2];
        this.field18888 = new int[2];
        this.field18889 = new int[2];
        this.field18890 = new int[2];
        this.field18891 = new int[2];
        this.field18892 = new int[2][9];
        this.field18893 = new int[2][3];
        this.field18780 = field18852;
        this.field18850 = field18850;
        this.field18781 = field18851;
        this.field18869 = 2;
        this.field18870 = true;
        this.field18871 = 2;
        this.field18872 = 2;
        this.field18873 = 2;
        this.field18874 = true;
        this.field18875 = true;
        this.field18866 = 5;
        this.field18865 = true;
        this.field18876 = 1;
        this.field18842[0] = -1;
        this.field18842[1] = -1;
        this.field18849 = 0;
        this.field18847 = true;
        this.field18856 = 8;
        this.field18857 = 2;
        this.field18844 = 0;
        this.field18845 = 0;
        this.field18846 = 0;
        this.field18836 = -1;
        if (!b) {
            this.field18854 = 32;
            this.field18855 = 16;
        }
        else {
            this.field18854 = 30;
            this.field18855 = 15;
        }
        this.field18814[0] = 0;
        this.field18814[1] = 0;
        if (!field18850) {
            this.field18851[0] = new Class6443(32);
            this.field18852[0] = new Class6442(field18852 ? 32 : 64);
            this.field18852[1] = null;
        }
        else {
            this.field18851[0] = new Class6443(32);
            this.field18851[1] = new Class6443(32);
            this.field18852[0] = new Class6442(field18852 ? 32 : 64);
            this.field18852[1] = new Class6442(field18852 ? 32 : 64);
        }
    }
    
    public void method12607() {
        if (this.field18851[0] != null) {
            this.field18851[0].method19212();
        }
        if (this.field18851[1] != null) {
            this.field18851[1].method19212();
        }
        if (this.field18852[0] != null) {
            this.field18852[0].method19207();
        }
        if (this.field18852[1] != null) {
            this.field18852[1].method19207();
        }
        int i;
        for (i = 0; i < 5; ++i) {
            if (this.field18812[0][i] != null) {
                Arrays.fill(this.field18812[0][i], 0.0f);
            }
            if (this.field18812[1][i] != null) {
                Arrays.fill(this.field18812[1][i], 0.0f);
            }
            if (this.field18813[0][i] != null) {
                Arrays.fill(this.field18813[0][i], 0.0f);
            }
            if (this.field18813[1][i] != null) {
                Arrays.fill(this.field18813[1][i], 0.0f);
            }
        }
        for (int j = 0; j < 40; ++j) {
            for (int k = 0; k < 64; ++k) {
                this.field18853[0][j][i][0] = 0.0f;
                this.field18853[0][j][i][1] = 0.0f;
                this.field18853[1][j][i][0] = 0.0f;
                this.field18853[1][j][i][1] = 0.0f;
            }
        }
        this.field18814[0] = 0;
        this.field18814[1] = 0;
        this.field18849 = 0;
        this.field18847 = true;
        this.field18806[0] = 0;
        this.field18806[1] = 0;
        this.field18869 = 2;
        this.field18870 = true;
        this.field18871 = 2;
        this.field18872 = 2;
        this.field18873 = 2;
        this.field18874 = true;
        this.field18875 = true;
        this.field18866 = 5;
        this.field18865 = true;
        this.field18876 = 1;
        this.field18842[0] = -1;
        this.field18842[1] = -1;
        this.field18844 = 0;
        this.field18845 = 0;
        this.field18846 = 0;
        this.field18836 = -1;
        this.field18811[0] = 0;
        this.field18811[1] = 0;
        for (int l = 0; l < 49; ++l) {
            this.field18816[0][l] = 0;
            this.field18822[0][l] = 0;
            this.field18816[1][l] = 0;
            this.field18822[1][l] = 0;
            this.field18833[0][l] = 0;
            this.field18833[1][l] = 0;
        }
        this.field18878[0] = false;
        this.field18878[1] = false;
    }
    
    public void method12608() {
        Label_0104: {
            if (this.field18866 == this.field18836) {
                if (this.field18867 == this.field18837) {
                    if (this.field18869 == this.field18839) {
                        if (this.field18870 == this.field18840) {
                            if (this.field18868 == this.field18838) {
                                if (this.field18871 == this.field18841) {
                                    this.field18847 = false;
                                    break Label_0104;
                                }
                            }
                        }
                    }
                }
            }
            this.field18847 = true;
        }
        this.field18836 = this.field18866;
        this.field18837 = this.field18867;
        this.field18839 = this.field18869;
        this.field18840 = this.field18870;
        this.field18838 = this.field18868;
        this.field18841 = this.field18871;
    }
    
    public int method12609(final int n, final int n2, final int n3, final int n4, final boolean b, final int n5) {
        int n6 = 0;
        this.field18787 = Class4202.method12639(n, n3, this.field18781);
        final int method12640 = Class4202.method12640(n2, this.field18781, this.field18787);
        if (this.field18781.method8183() < 48000) {
            if (this.field18781.method8183() > 32000) {
                if (method12640 - this.field18787 > 45) {
                    ++n6;
                }
            }
            else if (method12640 - this.field18787 > 48) {
                ++n6;
            }
        }
        else if (method12640 - this.field18787 > 32) {
            ++n6;
        }
        int n7;
        if (n4 != 0) {
            n7 = n6 + Class4202.method12644(this, this.field18787, method12640, n4, b);
        }
        else {
            n7 = n6 + Class4202.method12641(this, this.field18787, method12640, b);
        }
        return (n7 + Class4202.method12645(this, n5, method12640) > 0) ? 1 : 0;
    }
    
    public int method12610(final Class8157 class8157, final int n) throws AACException {
        int method12612 = 0;
        final long n2 = class8157.method26937();
        if (class8157.method26940(4) == 14) {
            this.field18863 = class8157.method26940(10);
        }
        final int field18866 = this.field18866;
        final int field18867 = this.field18876;
        final int field18868 = this.field18867;
        final int field18869 = this.field18869;
        final boolean field18870 = this.field18870;
        final int field18871 = this.field18868;
        if (this.field18861 = class8157.method26942()) {
            this.method12611(class8157);
        }
        this.method12608();
        Label_0166: {
            if (this.field18849 == 0) {
                method12612 = 1;
            }
            else {
                Label_0161: {
                    if (!this.field18847) {
                        if (!this.field18861) {
                            break Label_0161;
                        }
                        if (!this.field18784) {
                            break Label_0161;
                        }
                    }
                    if (this.method12609(this.field18866, this.field18867, this.field18876, this.field18869, this.field18870, this.field18868) > 0) {
                        this.method12609(field18866, field18868, field18867, field18869, field18870, field18871);
                    }
                }
                if (method12612 == 0) {
                    method12612 = this.method12612(class8157);
                    if (method12612 > 0) {
                        if (!this.field18847) {
                            if (!this.field18861) {
                                break Label_0166;
                            }
                            if (!this.field18784) {
                                break Label_0166;
                            }
                        }
                        this.method12609(field18866, field18868, field18867, field18869, field18870, field18871);
                    }
                }
            }
        }
        final int n3 = (int)(class8157.method26937() - n2);
        if (8 * n >= n3) {
            int i;
            for (i = 8 * n - n3; i > 7; i -= 8) {
                class8157.method26940(8);
            }
            class8157.method26940(i);
            return method12612;
        }
        throw new Class2348("frame overread");
    }
    
    private void method12611(final Class8157 class8157) throws AACException {
        ++this.field18849;
        this.field18865 = class8157.method26942();
        this.field18866 = class8157.method26940(4);
        this.field18867 = class8157.method26940(4);
        this.field18868 = class8157.method26940(3);
        class8157.method26940(2);
        final boolean method26942 = class8157.method26942();
        final boolean method26943 = class8157.method26942();
        if (!method26942) {
            this.field18869 = 2;
            this.field18870 = true;
            this.field18871 = 2;
        }
        else {
            this.field18869 = class8157.method26940(2);
            this.field18870 = class8157.method26942();
            this.field18871 = class8157.method26940(2);
        }
        if (!method26943) {
            this.field18872 = 2;
            this.field18873 = 2;
            this.field18874 = true;
            this.field18875 = true;
        }
        else {
            this.field18872 = class8157.method26940(2);
            this.field18873 = class8157.method26940(2);
            this.field18874 = class8157.method26942();
            this.field18875 = class8157.method26942();
        }
    }
    
    private int method12612(final Class8157 class8157) throws AACException {
        this.field18783 = ((this.field18876 == 0) ? 1 : 2);
        if (!this.field18850) {
            final int method12613;
            if ((method12613 = this.method12613(class8157)) > 0) {
                return method12613;
            }
        }
        else {
            final int method12614;
            if ((method12614 = this.method12614(class8157)) > 0) {
                return method12614;
            }
        }
        return 0;
    }
    
    private int method12613(final Class8157 class8157) throws AACException {
        if (class8157.method26942()) {
            class8157.method26940(4);
        }
        final int method12616;
        if ((method12616 = this.method12616(class8157, 0)) <= 0) {
            this.method12617(class8157, 0);
            this.method12618(class8157, 0);
            this.method12621(class8157, 0);
            this.method12622(class8157, 0);
            Class4203.method12651(this, 0);
            Arrays.fill(this.field18832[0], 0, 64, 0);
            Arrays.fill(this.field18832[1], 0, 64, 0);
            if (this.field18877[0] = class8157.method26942()) {
                this.method12620(class8157, 0);
            }
            if (this.field18879 = class8157.method26942()) {
                int n = 0;
                int method12617 = class8157.method26940(4);
                if (method12617 == 15) {
                    method12617 += class8157.method26940(8);
                }
                int i;
                int n3;
                for (i = 8 * method12617; i > 7; i -= n3) {
                    int n2 = 0;
                    this.field18880 = class8157.method26940(2);
                    n2 += 2;
                    if (this.field18880 == 2) {
                        if (n != 0) {
                            this.field18880 = 3;
                        }
                        else {
                            n = 1;
                        }
                    }
                    n3 = n2 + this.method12619(class8157, this.field18880, i);
                    if (n3 > i) {
                        return 1;
                    }
                }
                if (i > 0) {
                    class8157.method26940(i);
                }
            }
            return 0;
        }
        return method12616;
    }
    
    private int method12614(final Class8157 class8157) throws AACException {
        if (class8157.method26942()) {
            class8157.method26940(4);
            class8157.method26940(4);
        }
        if (!(this.field18882 = class8157.method26942())) {
            final int[] array = new int[6];
            final int[] array2 = new int[3];
            final int n = this.field18805[0];
            final int n2 = this.field18807[0];
            final int n3 = this.field18883[0];
            if (n >= 0) System.arraycopy(this.field18808[0], 0, array, 0, n);
            if (n2 >= 0) System.arraycopy(this.field18809[0], 0, array2, 0, n2);
            final int method12616;
            if ((method12616 = this.method12616(class8157, 0)) > 0) {
                return method12616;
            }
            final int method12617;
            if ((method12617 = this.method12616(class8157, 1)) > 0) {
                this.field18883[0] = n3;
                this.field18805[0] = n;
                this.field18807[0] = n2;
                System.arraycopy(array, 0, this.field18808[0], 0, 6);
                System.arraycopy(array2, 0, this.field18809[0], 0, 3);
                return method12617;
            }
            this.method12617(class8157, 0);
            this.method12617(class8157, 1);
            this.method12618(class8157, 0);
            this.method12618(class8157, 1);
            this.method12621(class8157, 0);
            this.method12621(class8157, 1);
            this.method12622(class8157, 0);
            this.method12622(class8157, 1);
            Arrays.fill(this.field18832[0], 0, 64, 0);
            Arrays.fill(this.field18832[1], 0, 64, 0);
            if (this.field18877[0] = class8157.method26942()) {
                this.method12620(class8157, 0);
            }
            if (this.field18877[1] = class8157.method26942()) {
                this.method12620(class8157, 1);
            }
        }
        else {
            final int method12618;
            if ((method12618 = this.method12616(class8157, 0)) > 0) {
                return method12618;
            }
            this.field18883[1] = this.field18883[0];
            this.field18805[1] = this.field18805[0];
            this.field18807[1] = this.field18807[0];
            this.field18887[1] = this.field18887[0];
            for (int n4 = 0; n4 <= this.field18805[0]; ++n4) {
                this.field18808[1][n4] = this.field18808[0][n4];
                this.field18810[1][n4] = this.field18810[0][n4];
            }
            if (this.field18807[0] + 1 >= 0)
                System.arraycopy(this.field18809[0], 0, this.field18809[1], 0, this.field18807[0] + 1);
            this.method12617(class8157, 0);
            this.method12617(class8157, 1);
            this.method12618(class8157, 0);
            if (this.field18793 >= 0) System.arraycopy(this.field18825[0], 0, this.field18825[1], 0, this.field18793);
            this.method12621(class8157, 0);
            this.method12622(class8157, 0);
            this.method12621(class8157, 1);
            this.method12622(class8157, 1);
            Arrays.fill(this.field18832[0], 0, 64, 0);
            Arrays.fill(this.field18832[1], 0, 64, 0);
            if (this.field18877[0] = class8157.method26942()) {
                this.method12620(class8157, 0);
            }
            if (this.field18877[1] = class8157.method26942()) {
                this.method12620(class8157, 1);
            }
        }
        Class4203.method12651(this, 0);
        Class4203.method12651(this, 1);
        if (this.field18882) {
            Class4203.method12652(this);
        }
        if (this.field18879 = class8157.method26942()) {
            int method12619 = class8157.method26940(4);
            if (method12619 == 15) {
                method12619 += class8157.method26940(8);
            }
            int n7;
            int n9;
            for (n7 = 8 * method12619; n7 > 7; n7 -= n9) {
                int n8 = 0;
                this.field18880 = class8157.method26940(2);
                n8 += 2;
                n9 = n8 + this.method12619(class8157, this.field18880, n7);
                if (n9 > n7) {
                    return 1;
                }
            }
            if (n7 > 0) {
                class8157.method26940(n7);
            }
        }
        return 0;
    }
    
    private int method12615(final int n) {
        final int[] array = { 0, 0, 1, 2, 2, 3, 3, 3, 3, 4 };
        if (n < 10 && n >= 0) {
            return array[n];
        }
        return 0;
    }
    
    private int method12616(final Class8157 class8157, final int n) throws AACException {
        int n2 = 0;
        final int n3 = this.field18805[n];
        final int n4 = this.field18807[n];
        final int n5 = this.field18883[n];
        switch (this.field18883[n] = class8157.method26940(2)) {
            case 0: {
                n2 = Math.min(1 << class8157.method26940(2), 5);
                final int method26941 = class8157.method26941();
                for (int i = 0; i < n2; ++i) {
                    this.field18810[n][i] = method26941;
                }
                this.field18801[n] = 0;
                this.field18802[n] = this.field18855;
                this.field18803[n] = n2 - 1;
                this.field18804[n] = 0;
                break;
            }
            case 1: {
                final int n6 = class8157.method26940(2) + this.field18855;
                n2 = class8157.method26940(2) + 1;
                for (int j = 0; j < n2 - 1; ++j) {
                    this.field18884[n][j] = 2 * class8157.method26940(2) + 2;
                }
                this.field18887[n] = class8157.method26940(this.method12615(n2 + 1));
                for (int k = 0; k < n2; ++k) {
                    this.field18810[n][n2 - k - 1] = class8157.method26941();
                }
                this.field18801[n] = 0;
                this.field18802[n] = n6;
                this.field18803[n] = 0;
                this.field18804[n] = n2 - 1;
                break;
            }
            case 2: {
                final int method26942 = class8157.method26940(2);
                n2 = class8157.method26940(2) + 1;
                for (int l = 0; l < n2 - 1; ++l) {
                    this.field18884[n][l] = 2 * class8157.method26940(2) + 2;
                }
                this.field18887[n] = class8157.method26940(this.method12615(n2 + 1));
                for (int n7 = 0; n7 < n2; ++n7) {
                    this.field18810[n][n7] = class8157.method26941();
                }
                this.field18801[n] = method26942;
                this.field18802[n] = this.field18855;
                this.field18803[n] = n2 - 1;
                this.field18804[n] = 0;
                break;
            }
            case 3: {
                final int method26943 = class8157.method26940(2);
                final int n8 = class8157.method26940(2) + this.field18855;
                this.field18890[n] = class8157.method26940(2);
                this.field18891[n] = class8157.method26940(2);
                n2 = Math.min(5, this.field18890[n] + this.field18891[n] + 1);
                for (int n9 = 0; n9 < this.field18890[n]; ++n9) {
                    this.field18885[n][n9] = 2 * class8157.method26940(2) + 2;
                }
                for (int n10 = 0; n10 < this.field18891[n]; ++n10) {
                    this.field18886[n][n10] = 2 * class8157.method26940(2) + 2;
                }
                this.field18887[n] = class8157.method26940(this.method12615(this.field18890[n] + this.field18891[n] + 2));
                for (int n11 = 0; n11 < n2; ++n11) {
                    this.field18810[n][n11] = class8157.method26941();
                }
                this.field18801[n] = method26943;
                this.field18802[n] = n8;
                this.field18803[n] = this.field18890[n];
                this.field18804[n] = this.field18891[n];
                break;
            }
        }
        if (this.field18883[n] == 3) {
            this.field18805[n] = Math.min(n2, 5);
        }
        else {
            this.field18805[n] = Math.min(n2, 4);
        }
        if (this.field18805[n] <= 0) {
            return 1;
        }
        if (this.field18805[n] > 1) {
            this.field18807[n] = 2;
        }
        else {
            this.field18807[n] = 1;
        }
        final int method26944;
        if ((method26944 = Class4201.method12636(this, n)) > 0) {
            this.field18883[n] = n5;
            this.field18805[n] = n3;
            this.field18807[n] = n4;
            return method26944;
        }
        Class4201.method12637(this, n);
        return 0;
    }
    
    private void method12617(final Class8157 class8157, final int n) throws AACException {
        for (int i = 0; i < this.field18805[n]; ++i) {
            this.field18892[n][i] = class8157.method26941();
        }
        for (int j = 0; j < this.field18807[n]; ++j) {
            this.field18893[n][j] = class8157.method26941();
        }
    }
    
    private void method12618(final Class8157 class8157, final int n) throws AACException {
        for (int i = 0; i < this.field18793; ++i) {
            this.field18825[n][i] = class8157.method26940(2);
        }
    }
    
    private int method12619(final Class8157 class8157, final int n, final int n2) throws AACException {
        switch (n) {
            case 2: {
                if (this.field18858 == null) {
                    this.field18858 = new Class5598(this.field18781, this.field18854);
                }
                if (this.field18860) {
                    this.field18858.field22910 = false;
                }
                final int method16845 = this.field18858.method16845(class8157);
                if (!this.field18859 && this.field18858.field22910) {
                    this.field18859 = true;
                }
                if (this.field18858.field22910) {
                    this.field18860 = false;
                }
                return method16845;
            }
            default: {
                this.field18881 = class8157.method26940(6);
                return 6;
            }
        }
    }
    
    private void method12620(final Class8157 class8157, final int n) throws AACException {
        for (int i = 0; i < this.field18791; ++i) {
            this.field18832[n][i] = class8157.method26941();
        }
    }
    
    private void method12621(final Class8157 class8157, final int n) throws AACException {
        if (this.field18805[n] == 1 && this.field18883[n] == 0) {
            this.field18786[n] = false;
        }
        else {
            this.field18786[n] = this.field18865;
        }
        int n2;
        int[][] array;
        int[][] array2;
        if (this.field18882 && n == 1) {
            n2 = 1;
            if (!this.field18786[n]) {
                array = Class4197.field18942;
                array2 = Class4197.field18943;
            }
            else {
                array = Class4197.field18946;
                array2 = Class4197.field18947;
            }
        }
        else {
            n2 = 0;
            if (!this.field18786[n]) {
                array = Class4197.field18940;
                array2 = Class4197.field18941;
            }
            else {
                array = Class4197.field18944;
                array2 = Class4197.field18945;
            }
        }
        for (int i = 0; i < this.field18805[n]; ++i) {
            if (this.field18892[n][i] != 0) {
                for (int j = 0; j < this.field18795[this.field18810[n][i]]; ++j) {
                    this.field18815[n][j][i] = this.method12623(class8157, array) << n2;
                }
            }
            else {
                if (this.field18882 && n == 1) {
                    if (!this.field18786[n]) {
                        this.field18815[n][0][i] = class8157.method26940(6) << n2;
                    }
                    else {
                        this.field18815[n][0][i] = class8157.method26940(5) << n2;
                    }
                }
                else if (!this.field18786[n]) {
                    this.field18815[n][0][i] = class8157.method26940(7) << n2;
                }
                else {
                    this.field18815[n][0][i] = class8157.method26940(6) << n2;
                }
                for (int k = 1; k < this.field18795[this.field18810[n][i]]; ++k) {
                    this.field18815[n][k][i] = this.method12623(class8157, array2) << n2;
                }
            }
        }
        Class4203.method12647(this, n);
    }
    
    private void method12622(final Class8157 class8157, final int n) throws AACException {
        int n2;
        int[][] array;
        int[][] array2;
        if (this.field18882 && n == 1) {
            n2 = 1;
            array = Class4197.field18949;
            array2 = Class4197.field18947;
        }
        else {
            n2 = 0;
            array = Class4197.field18948;
            array2 = Class4197.field18945;
        }
        for (int i = 0; i < this.field18807[n]; ++i) {
            if (this.field18893[n][i] != 0) {
                for (int j = 0; j < this.field18793; ++j) {
                    this.field18819[n][j][i] = this.method12623(class8157, array) << n2;
                }
            }
            else {
                if (this.field18882 && n == 1) {
                    this.field18819[n][0][i] = class8157.method26940(5) << n2;
                }
                else {
                    this.field18819[n][0][i] = class8157.method26940(5) << n2;
                }
                for (int k = 1; k < this.field18793; ++k) {
                    this.field18819[n][k][i] = this.method12623(class8157, array2) << n2;
                }
            }
        }
        Class4203.method12648(this, n);
    }
    
    private int method12623(final Class8157 class8157, final int[][] array) throws AACException {
        int i;
        for (i = 0; i >= 0; i = array[i][class8157.method26941()]) {}
        return i + 64;
    }
    
    private int method12624(final int n) {
        this.field18843 = this.field18788;
        this.field18846 = this.field18789;
        this.field18845 = this.field18844;
        this.field18806[n] = this.field18805[n];
        if (this.field18805[n] > 0) {
            this.field18811[n] = this.field18810[n][this.field18805[n] - 1];
            for (int i = 0; i < 49; ++i) {
                this.field18816[n][i] = this.field18815[n][i][this.field18805[n] - 1];
                this.field18822[n][i] = this.field18819[n][i][this.field18807[n] - 1];
            }
            System.arraycopy(this.field18832[n], 0, this.field18833[n], 0, 49);
            this.field18878[n] = this.field18877[n];
            if (this.field18823[n] != this.field18805[n]) {
                this.field18842[n] = -1;
            }
            else {
                this.field18842[n] = 0;
            }
            return 0;
        }
        return 19;
    }
    
    private void method12625(final int n) {
        for (int i = 0; i < this.field18856; ++i) {
            for (int j = 0; j < 64; ++j) {
                this.field18853[n][i][j][0] = this.field18853[n][i + this.field18854][j][0];
                this.field18853[n][i][j][1] = this.field18853[n][i + this.field18854][j][1];
            }
        }
        for (int k = this.field18856; k < 40; ++k) {
            for (int l = 0; l < 64; ++l) {
                this.field18853[n][k][l][0] = 0.0f;
                this.field18853[n][k][l][1] = 0.0f;
            }
        }
    }
    
    private int method12626(final float[] array, final float[][][] array2, final int n, boolean b) {
        int method12631 = 0;
        this.field18844 = 0;
        if (!b) {
            this.field18851[n].method19213(this, array, this.field18853[n], this.field18856, this.field18788);
        }
        else {
            this.field18851[n].method19213(this, array, this.field18853[n], this.field18856, 32);
        }
        if (!b) {
            Class6503.method19587(this, this.field18853[n], this.field18853[n], n);
            method12631 = Class4199.method12631(this, this.field18853[n], n);
            if (method12631 > 0) {
                b = true;
            }
        }
        if (!this.field18784 && !b) {
            for (int i = 0; i < this.field18854; ++i) {
                int n2;
                int n3;
                int n4;
                if (i >= this.field18808[n][0]) {
                    n2 = this.field18788;
                    n3 = this.field18789;
                    n4 = this.field18844;
                }
                else {
                    n2 = this.field18843;
                    n3 = this.field18846;
                    n4 = this.field18845;
                }
                for (int j = 0; j < n2 + n4; ++j) {
                    array2[i][j][0] = this.field18853[n][i + this.field18857][j][0];
                    array2[i][j][1] = this.field18853[n][i + this.field18857][j][1];
                }
                for (int k = n2 + n4; k < n2 + n3; ++k) {
                    array2[i][k][0] = this.field18853[n][i + this.field18857][k][0];
                    array2[i][k][1] = this.field18853[n][i + this.field18857][k][1];
                }
                for (int l = Math.max(n2 + n4, n2 + n3); l < 64; ++l) {
                    array2[i][l][0] = 0.0f;
                    array2[i][l][1] = 0.0f;
                }
            }
        }
        else {
            for (int n5 = 0; n5 < this.field18854; ++n5) {
                for (int n6 = 0; n6 < 32; ++n6) {
                    array2[n5][n6][0] = this.field18853[n][n5 + this.field18857][n6][0];
                    array2[n5][n6][1] = this.field18853[n][n5 + this.field18857][n6][1];
                }
                for (int n7 = 32; n7 < 64; ++n7) {
                    array2[n5][n7][0] = 0.0f;
                    array2[n5][n7][1] = 0.0f;
                }
            }
        }
        return method12631;
    }
    
    public int method12627(final float[] array, final float[] array2, final boolean b) {
        boolean b2 = false;
        final float[][][] array3 = new float[32][64][2];
        if (this.field18850) {
            if (this.field18785 != 0 || this.field18849 == 0) {
                b2 = true;
                if (this.field18785 != 0) {
                    if (this.field18847) {
                        this.field18836 = -1;
                    }
                }
            }
            this.field18784 = b;
            this.field18785 += this.method12626(array, array3, 0, b2);
            if (!this.field18780) {
                this.field18852[0].method19209(this, array3, array);
            }
            else {
                this.field18852[0].method19208(this, array3, array);
            }
            this.field18785 += this.method12626(array2, array3, 1, b2);
            if (!this.field18780) {
                this.field18852[1].method19209(this, array3, array2);
            }
            else {
                this.field18852[1].method19208(this, array3, array2);
            }
            if (this.field18861) {
                this.field18784 = false;
            }
            if (this.field18849 != 0) {
                if (this.field18785 == 0) {
                    final int method12624 = this.method12624(0);
                    if (method12624 != 0) {
                        return method12624;
                    }
                    final int method12625 = this.method12624(1);
                    if (method12625 != 0) {
                        return method12625;
                    }
                }
            }
            this.method12625(0);
            this.method12625(1);
            ++this.field18848;
            return 0;
        }
        return 21;
    }
    
    public int method12628(final float[] array, final boolean b) {
        boolean b2 = false;
        final float[][][] array2 = new float[32][64][2];
        if (!this.field18850) {
            if (this.field18785 != 0 || this.field18849 == 0) {
                b2 = true;
                if (this.field18785 != 0) {
                    if (this.field18847) {
                        this.field18836 = -1;
                    }
                }
            }
            this.field18784 = b;
            this.field18785 += this.method12626(array, array2, 0, b2);
            if (!this.field18780) {
                this.field18852[0].method19209(this, array2, array);
            }
            else {
                this.field18852[0].method19208(this, array2, array);
            }
            if (this.field18861) {
                this.field18784 = false;
            }
            if (this.field18849 != 0) {
                if (this.field18785 == 0) {
                    final int method12624 = this.method12624(0);
                    if (method12624 != 0) {
                        return method12624;
                    }
                }
            }
            this.method12625(0);
            ++this.field18848;
            return 0;
        }
        return 21;
    }
    
    public int method12629(final float[] array, final float[] array2, final boolean b) {
        boolean b2 = false;
        final float[][][] array3 = new float[38][64][2];
        final float[][][] array4 = new float[38][64][2];
        if (!this.field18850) {
            if (this.field18785 != 0 || this.field18849 == 0) {
                b2 = true;
                if (this.field18785 != 0) {
                    if (this.field18847) {
                        this.field18836 = -1;
                    }
                }
            }
            this.field18784 = b;
            if (this.field18852[1] == null) {
                this.field18852[1] = new Class6442(this.field18780 ? 32 : 64);
            }
            this.field18785 += this.method12626(array, array3, 0, b2);
            for (int i = this.field18854; i < this.field18854 + 6; ++i) {
                for (int j = 0; j < 5; ++j) {
                    array3[i][j][0] = this.field18853[0][this.field18857 + i][j][0];
                    array3[i][j][1] = this.field18853[0][this.field18857 + i][j][1];
                }
            }
            this.field18858.method16857(array3, array4);
            if (!this.field18780) {
                this.field18852[0].method19209(this, array3, array);
                this.field18852[1].method19209(this, array4, array2);
            }
            else {
                this.field18852[0].method19208(this, array3, array);
                this.field18852[1].method19208(this, array4, array2);
            }
            if (this.field18861) {
                this.field18784 = false;
            }
            if (this.field18849 != 0) {
                if (this.field18785 == 0) {
                    final int method12624 = this.method12624(0);
                    if (method12624 != 0) {
                        return method12624;
                    }
                }
            }
            this.method12625(0);
            ++this.field18848;
            return 0;
        }
        return 21;
    }
    
    public boolean method12630() {
        return this.field18859;
    }
}
