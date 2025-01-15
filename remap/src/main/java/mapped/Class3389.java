// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;

public class Class3389 extends Class3167
{
    public Class3389() {
        super(Class8013.field32991, "Compass", "Fornite style directions");
        this.method9915(false);
    }
    
    @Class6753
    private void method10804(final Class5740 class5740) {
        if (!this.method9906() || Class3389.field15514.field4684 == null) {
            return;
        }
        if (!Class869.method5277().field4648.field23464) {
            final int index = 5;
            final int n = 60;
            final int n2 = Class869.method5277().field4648.field23466 ? 60 : 0;
            final ArrayList<Integer> method10807 = this.method10807((int)this.method10809(Class3389.field15514.field4684.rotationYaw), index);
            int intValue = method10807.get(index);
            if (intValue == 0) {
                if (this.method10809(Class3389.field15514.field4684.rotationYaw) > 345.0f) {
                    intValue = 360;
                }
            }
            final double n3 = (7.0f + this.method10809(Class3389.field15514.field4684.rotationYaw) - intValue) / 15.0f * n;
            Class8154.method26899(Class3389.field15514.field4632.method7694() / 2 - index * n * 1.5f, -40.0f, index * n * 2 * 1.5f, (float)(220 + n2), Class7853.field32200, Class6430.method19118(Class265.field1278.field1292, 0.25f));
            int n4 = 0;
            for (final int intValue2 : method10807) {
                ++n4;
                this.method10805(Class3389.field15514.field4632.method7694() / 2 + n4 * n - (int)n3 - (index + 1) * n - 2, 30 + n2, n, intValue2, (float)Math.min(Math.max(0.0, Math.min((n4 * n - n3) / (float)(n * index), 1.0)), Math.max(0.0, Math.min(2.25 - (n4 * n - n3) / (float)(n * index), 1.0))) * 0.8f);
            }
        }
    }
    
    private void method10805(final int n, final int n2, final int n3, final int i, final float n4) {
        String string = i + "";
        if (!string.equals("0")) {
            if (!string.equals("90")) {
                if (!string.equals("180")) {
                    if (!string.equals("270")) {
                        if (!string.equals("45")) {
                            if (!string.equals("135")) {
                                if (!string.equals("225")) {
                                    if (string.equals("315")) {
                                        string = "SE";
                                    }
                                }
                                else {
                                    string = "NE";
                                }
                            }
                            else {
                                string = "NW";
                            }
                        }
                        else {
                            string = "SW";
                        }
                    }
                    else {
                        string = "E";
                    }
                }
                else {
                    string = "N";
                }
            }
            else {
                string = "W";
            }
        }
        else {
            string = "S";
        }
        if (!string.matches(".*\\d+.*")) {
            if (string.length() != 1) {
                Class8154.method26889(Class9400.field40314, (float)(n + (n3 - Class9400.field40314.method23505(string)) / 2), (float)(n2 + 20), string, Class6430.method19118(Class265.field1278.field1292, n4));
            }
            else {
                Class8154.method26889(Class9400.field40325, (float)(n + (n3 - Class9400.field40325.method23505(string)) / 2), (float)(n2 + 10), string, Class6430.method19118(Class265.field1278.field1292, n4));
            }
        }
        else {
            Class8154.method26876((float)(n + n3 / 2 - 1), (float)(n2 + 28), (float)(n + n3 / 2 + 1), (float)(n2 + 38), Class6430.method19118(Class265.field1278.field1292, n4 * 0.5f));
            Class8154.method26889(Class9400.field40312, (float)(n + (n3 - Class9400.field40312.method23505(string)) / 2), (float)(n2 + 40), string, Class6430.method19118(Class265.field1278.field1292, n4));
        }
    }
    
    private int method10806(final int n, final int n2) {
        final int n3 = Math.abs(n2 - n) % 360;
        return (n3 <= 180) ? n3 : (360 - n3);
    }
    
    private ArrayList<Integer> method10807(final int n, final int n2) {
        final int method10808 = this.method10808(n);
        final ArrayList list = new ArrayList();
        for (int i = method10808 - 15 * n2; i < method10808; i += 15) {
            list.add((int)this.method10809((float)i));
        }
        for (int j = method10808; j < method10808 + 15 * (n2 + 1); j += 15) {
            list.add((int)this.method10809((float)j));
        }
        return list;
    }
    
    private int method10808(final int n) {
        return (n + 7) / 15 * 15;
    }
    
    public float method10809(float n) {
        n %= 360.0f;
        if (n < 0.0f) {
            n += 360.0f;
        }
        return n;
    }
}
