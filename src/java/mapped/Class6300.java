// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import java.util.ArrayList;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import it.unimi.dsi.fastutil.objects.ObjectList;

public class Class6300
{
    public float field25176;
    public float field25177;
    private int field25178;
    private int field25179;
    public float field25180;
    public float field25181;
    public float field25182;
    public float field25183;
    public float field25184;
    public float field25185;
    public boolean field25186;
    public boolean field25187;
    public final ObjectList<Class9536> field25188;
    public final ObjectList<Class6300> field25189;
    public List field25190;
    public boolean field25191;
    public float field25192;
    public float field25193;
    public float field25194;
    private Class1932 field25195;
    private String field25196;
    private Class8473 field25197;
    private Class1656 field25198;
    
    public Class6300(final Class5901 class5901) {
        this.field25176 = 64.0f;
        this.field25177 = 32.0f;
        this.field25187 = true;
        this.field25188 = (ObjectList<Class9536>)new ObjectArrayList();
        this.field25189 = (ObjectList<Class6300>)new ObjectArrayList();
        this.field25190 = new ArrayList();
        this.field25191 = false;
        this.field25192 = 1.0f;
        this.field25193 = 1.0f;
        this.field25194 = 1.0f;
        this.field25195 = null;
        this.field25196 = null;
        this.field25198 = Class8571.method28908();
        class5901.accept(this);
        this.method18647(class5901.field24269, class5901.field24270);
    }
    
    public Class6300(final Class5901 class5901, final int n, final int n2) {
        this(class5901.field24269, class5901.field24270, n, n2);
        class5901.accept(this);
    }
    
    public Class6300(final int n, final int n2, final int n3, final int n4) {
        this.field25176 = 64.0f;
        this.field25177 = 32.0f;
        this.field25187 = true;
        this.field25188 = (ObjectList<Class9536>)new ObjectArrayList();
        this.field25189 = (ObjectList<Class6300>)new ObjectArrayList();
        this.field25190 = new ArrayList();
        this.field25191 = false;
        this.field25192 = 1.0f;
        this.field25193 = 1.0f;
        this.field25194 = 1.0f;
        this.field25195 = null;
        this.field25196 = null;
        this.field25198 = Class8571.method28908();
        this.method18647(n, n2);
        this.method18634(n3, n4);
    }
    
    public void method18632(final Class6300 class6300) {
        this.field25183 = class6300.field25183;
        this.field25184 = class6300.field25184;
        this.field25185 = class6300.field25185;
        this.field25180 = class6300.field25180;
        this.field25181 = class6300.field25181;
        this.field25182 = class6300.field25182;
    }
    
    public void method18633(final Class6300 class6300) {
        this.field25189.add((Object)class6300);
    }
    
    public Class6300 method18634(final int field25178, final int field25179) {
        this.field25178 = field25178;
        this.field25179 = field25179;
        return this;
    }
    
    public Class6300 method18635(final String s, final float n, final float n2, final float n3, final int n4, final int n5, final int n6, final float n7, final int n8, final int n9) {
        this.method18634(n8, n9);
        this.method18641(this.field25178, this.field25179, n, n2, n3, (float)n4, (float)n5, (float)n6, n7, n7, n7, this.field25186, false);
        return this;
    }
    
    public Class6300 method18636(final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.method18641(this.field25178, this.field25179, n, n2, n3, n4, n5, n6, 0.0f, 0.0f, 0.0f, this.field25186, false);
        return this;
    }
    
    public Class6300 method18637(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final boolean b) {
        this.method18641(this.field25178, this.field25179, n, n2, n3, n4, n5, n6, 0.0f, 0.0f, 0.0f, b, false);
        return this;
    }
    
    public void method18638(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        this.method18641(this.field25178, this.field25179, n, n2, n3, n4, n5, n6, n7, n7, n7, this.field25186, false);
    }
    
    public void method18639(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8, final float n9) {
        this.method18641(this.field25178, this.field25179, n, n2, n3, n4, n5, n6, n7, n8, n9, this.field25186, false);
    }
    
    public void method18640(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final boolean b) {
        this.method18641(this.field25178, this.field25179, n, n2, n3, n4, n5, n6, n7, n7, n7, b, false);
    }
    
    private void method18641(final int n, final int n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8, final float n9, final float n10, final float n11, final boolean b, final boolean b2) {
        this.field25188.add((Object)new Class9536(n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, b, this.field25176, this.field25177));
    }
    
    public void method18642(final float field25180, final float field25181, final float field25182) {
        this.field25180 = field25180;
        this.field25181 = field25181;
        this.field25182 = field25182;
    }
    
    public void method18643(final Class7351 class7351, final Class4150 class7352, final int n, final int n2) {
        this.method18644(class7351, class7352, n, n2, 1.0f, 1.0f, 1.0f, 1.0f);
    }
    
    public void method18644(final Class7351 class7351, final Class4150 class7352, final int n, final int n2, final float n3, final float n4, final float n5, final float n6) {
        if (this.field25187) {
            if (!this.field25188.isEmpty() || !this.field25189.isEmpty()) {
                class7351.method22567();
                this.method18645(class7351);
                this.method18646(class7351.method22569(), class7352, n, n2, n3, n4, n5, n6);
                for (int size = this.field25189.size(), i = 0; i < size; ++i) {
                    ((Class6300)this.field25189.get(i)).method18644(class7351, class7352, n, n2, n3, n4, n5, n6);
                }
                class7351.method22568();
            }
        }
    }
    
    public void method18645(final Class7351 class7351) {
        class7351.method22564(this.field25180 / 16.0f, this.field25181 / 16.0f, this.field25182 / 16.0f);
        if (this.field25185 != 0.0f) {
            class7351.method22566(Class9138.field38720.method33327(this.field25185));
        }
        if (this.field25184 != 0.0f) {
            class7351.method22566(Class9138.field38718.method33327(this.field25184));
        }
        if (this.field25183 != 0.0f) {
            class7351.method22566(Class9138.field38716.method33327(this.field25183));
        }
    }
    
    private void method18646(final Class8996 class8996, final Class4150 class8997, final int n, final int n2, final float n3, final float n4, final float n5, final float n6) {
        final Class6789 method32111 = class8996.method32111();
        final Class9429 method32112 = class8996.method32112();
        for (int size = this.field25188.size(), i = 0; i < size; ++i) {
            final Class9536 class8998 = (Class9536)this.field25188.get(i);
            for (int length = Class9536.method35604(class8998).length, j = 0; j < length; ++j) {
                final Class9094 class8999 = Class9536.method35604(class8998)[j];
                if (class8999 != null) {
                    final Class9138 method32113 = class8997.method12419(class8999.field38514);
                    method32113.method33324(method32112);
                    final float method32114 = method32113.method33311();
                    final float method32115 = method32113.method33312();
                    final float method32116 = method32113.method33313();
                    for (int k = 0; k < 4; ++k) {
                        final Class8741 class9000 = class8999.field38513[k];
                        final float n7 = class9000.field36720.method33311() / 16.0f;
                        final float n8 = class9000.field36720.method33312() / 16.0f;
                        final float n9 = class9000.field36720.method33313() / 16.0f;
                        class8997.method12400(method32111.method20761(n7, n8, n9, 1.0f), method32111.method20762(n7, n8, n9, 1.0f), method32111.method20763(n7, n8, n9, 1.0f), n3, n4, n5, n6, class9000.field36721, class9000.field36722, n2, n, method32114, method32115, method32116);
                    }
                }
            }
        }
    }
    
    public Class6300 method18647(final int n, final int n2) {
        this.field25176 = (float)n;
        this.field25177 = (float)n2;
        return this;
    }
    
    public Class9536 method18648(final Random random) {
        return (Class9536)this.field25188.get(random.nextInt(this.field25188.size()));
    }
    
    public void method18649(final float n, final float n2, final float n3, final int n4, final int n5, final int n6, final float n7) {
        this.field25190.add(new Class7846(this, this.field25178, this.field25179, n, n2, n3, n4, n5, n6, n7));
    }
    
    public Class1932 method18650() {
        return this.field25195;
    }
    
    public void method18651(final Class1932 field25195) {
        this.field25195 = field25195;
    }
    
    public String method18652() {
        return this.field25196;
    }
    
    public void method18653(final String field25196) {
        this.field25196 = field25196;
    }
    
    public void method18654(final int[][] array, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        this.field25188.add((Object)new Class9536(array, n, n2, n3, n4, n5, n6, n7, n7, n7, this.field25186, this.field25176, this.field25177));
    }
    
    public Class6300 method18655(final int n) {
        if (this.field25189 != null) {
            return (n >= 0 && n < this.field25189.size()) ? ((Class6300)this.field25189.get(n)) : null;
        }
        return null;
    }
    
    public Class6300 method18656(final String s) {
        if (s != null) {
            if (this.field25189 != null) {
                for (int i = 0; i < this.field25189.size(); ++i) {
                    final Class6300 class6300 = (Class6300)this.field25189.get(i);
                    if (s.equals(class6300.method18652())) {
                        return class6300;
                    }
                }
            }
            return null;
        }
        return null;
    }
    
    public Class6300 method18657(final String s) {
        if (s == null) {
            return null;
        }
        final Class6300 method18656 = this.method18656(s);
        if (method18656 == null) {
            if (this.field25189 != null) {
                for (int i = 0; i < this.field25189.size(); ++i) {
                    final Class6300 method18657 = ((Class6300)this.field25189.get(i)).method18657(s);
                    if (method18657 != null) {
                        return method18657;
                    }
                }
            }
            return null;
        }
        return method18656;
    }
    
    public void method18658(final Class8473 field25197) {
        this.field25197 = field25197;
    }
    
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("id: " + this.field25196 + ", boxes: " + ((this.field25188 == null) ? null : Integer.valueOf(this.field25188.size())) + ", submodels: " + ((this.field25189 == null) ? null : Integer.valueOf(this.field25189.size())));
        return sb.toString();
    }
}
