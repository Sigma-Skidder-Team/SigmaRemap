// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;

public class Class4899 extends Class4841
{
    public Class4831 field20954;
    public String field20955;
    
    public Class4899(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final boolean b) {
        super(class4803, s, n, n2, n3, n4, b);
        this.method14239(this.field20954 = new Class4831(this, "search", 50, 0, n3 - 60, n4 - 2, Class4831.field20670, "", "Search..."));
        this.field20954.method14478(false);
        this.field20954.method14473(class4831 -> this.field20955 = this.field20954.method14314());
    }
    
    @Override
    public void method14205(final float n) {
        this.field20954.method14307(true);
        final int n2 = 10;
        Class8154.method26913((float)(this.field20478 + n2 / 2), (float)(this.field20479 + n2 / 2), (float)(this.field20480 - n2), (float)(this.field20481 - n2), 9.0f, n * 0.9f);
        Class8154.method26913((float)(this.field20478 + n2 / 2), (float)(this.field20479 + n2 / 2), (float)(this.field20480 - n2), (float)(this.field20481 - n2), 30.0f, n * 0.4f);
        Class8154.method26925((float)this.field20478, (float)this.field20479, (float)this.field20480, (float)this.field20481, (float)n2, Class6430.method19118(Class265.field1278.field1292, 0.97f));
        Class8154.method26899((float)(this.field20478 + 20), (float)(this.field20479 + 20), 20.0f, 20.0f, Class7853.field32216, Class6430.method19118(Class265.field1273.field1292, 0.3f));
        final ArrayList<Class3167> method14713 = this.method14713();
        if (method14713.size() > 0) {
            if (this.method14715(this.field20955, method14713.get(0).method9901())) {
                Class8154.method26889(this.field20954.method14316(), (float)(this.field20478 + 54), (float)(this.field20479 + 14), this.field20955 + method14713.get(0).method9901().substring(this.field20955.length(), method14713.get(0).method9901().length()) + (method14713.get(0).method9906() ? " - Enabled" : " - Disabled"), Class6430.method19118(Class265.field1273.field1292, 0.25f));
            }
        }
        super.method14205(n);
    }
    
    public ArrayList<Class3167> method14713() {
        final ArrayList list = new ArrayList();
        if (this.field20955 != null && this.field20955.length() != 0) {
            for (final Class3167 e : Class9463.method35173().method35189().method21553().values()) {
                if (!this.method14715(this.field20955, e.method9901())) {
                    continue;
                }
                list.add(e);
            }
            return list;
        }
        return list;
    }
    
    @Override
    public void method14204(final int n) {
        super.method14204(n);
        if (n == 257) {
            final ArrayList<Class3167> method14713 = this.method14713();
            if (method14713.size() > 0) {
                method14713.get(0).method9910();
            }
            Minecraft.method5277().displayGuiScreen(null);
        }
    }
    
    private boolean method14714(final String s, final String s2) {
        if (s != null) {
            if (s != "") {
                if (s2 != null) {
                    return s2.toLowerCase().contains(s.toLowerCase());
                }
            }
        }
        return true;
    }
    
    private boolean method14715(final String s, final String s2) {
        if (s != null) {
            if (s != "") {
                if (s2 != null) {
                    return s2.toLowerCase().startsWith(s.toLowerCase());
                }
            }
        }
        return true;
    }
}
