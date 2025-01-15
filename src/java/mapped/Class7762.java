// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;

public class Class7762 implements Class7763
{
    private ArrayList field31707;
    private int field31708;
    private long field31709;
    private boolean field31710;
    private long field31711;
    private float field31712;
    private int field31713;
    private long field31714;
    private boolean field31715;
    private boolean field31716;
    private int field31717;
    private boolean field31718;
    private boolean field31719;
    private Class7765 field31720;
    
    public Class7762() {
        this(true);
    }
    
    public Class7762(final Class7764[] array, final int n) {
        this(array, n, true);
    }
    
    public Class7762(final Class7764[] array, final int[] array2) {
        this(array, array2, true);
    }
    
    public Class7762(final boolean field31716) {
        this.field31707 = new ArrayList();
        this.field31708 = -1;
        this.field31709 = 0L;
        this.field31710 = false;
        this.field31712 = 1.0f;
        this.field31713 = -2;
        this.field31715 = true;
        this.field31716 = true;
        this.field31717 = 1;
        this.field31719 = true;
        this.field31720 = null;
        this.field31708 = 0;
        this.field31716 = field31716;
    }
    
    public Class7762(final Class7764[] array, final int n, final boolean field31716) {
        this.field31707 = new ArrayList();
        this.field31708 = -1;
        this.field31709 = 0L;
        this.field31710 = false;
        this.field31712 = 1.0f;
        this.field31713 = -2;
        this.field31715 = true;
        this.field31716 = true;
        this.field31717 = 1;
        this.field31719 = true;
        this.field31720 = null;
        for (int i = 0; i < array.length; ++i) {
            this.method24773(array[i], n);
        }
        this.field31708 = 0;
        this.field31716 = field31716;
    }
    
    public Class7762(final Class7764[] array, final int[] array2, final boolean field31716) {
        this.field31707 = new ArrayList();
        this.field31708 = -1;
        this.field31709 = 0L;
        this.field31710 = false;
        this.field31712 = 1.0f;
        this.field31713 = -2;
        this.field31715 = true;
        this.field31716 = true;
        this.field31717 = 1;
        this.field31719 = true;
        this.field31720 = null;
        this.field31716 = field31716;
        if (array.length == array2.length) {
            for (int i = 0; i < array.length; ++i) {
                this.method24773(array[i], array2[i]);
            }
            this.field31708 = 0;
            return;
        }
        throw new RuntimeException("There must be one duration per frame");
    }
    
    public Class7762(final Class7765 class7765, final int n) {
        this(class7765, 0, 0, class7765.method24861() - 1, class7765.method24862() - 1, true, n, true);
    }
    
    public Class7762(final Class7765 class7765, final int n, final int n2, final int n3, final int n4, final boolean b, final int n5, final boolean field31716) {
        this.field31707 = new ArrayList();
        this.field31708 = -1;
        this.field31709 = 0L;
        this.field31710 = false;
        this.field31712 = 1.0f;
        this.field31713 = -2;
        this.field31715 = true;
        this.field31716 = true;
        this.field31717 = 1;
        this.field31719 = true;
        this.field31720 = null;
        this.field31716 = field31716;
        if (b) {
            for (int i = n2; i <= n4; ++i) {
                for (int j = n; j <= n3; ++j) {
                    this.method24773(class7765.method24860(j, i), n5);
                }
            }
        }
        else {
            for (int k = n; k <= n3; ++k) {
                for (int l = n2; l <= n4; ++l) {
                    this.method24773(class7765.method24860(k, l), n5);
                }
            }
        }
    }
    
    public Class7762(final Class7765 field31720, final int[] array, final int[] array2) {
        this.field31707 = new ArrayList();
        this.field31708 = -1;
        this.field31709 = 0L;
        this.field31710 = false;
        this.field31712 = 1.0f;
        this.field31713 = -2;
        this.field31715 = true;
        this.field31716 = true;
        this.field31717 = 1;
        this.field31719 = true;
        this.field31720 = null;
        this.field31720 = field31720;
        for (int i = 0; i < array.length / 2; ++i) {
            this.method24764(array2[i], array[i * 2], array[i * 2 + 1]);
        }
    }
    
    public void method24764(final int n, final int n2, final int n3) {
        if (n != 0) {
            if (this.field31707.isEmpty()) {
                this.field31709 = (int)(n / this.field31712);
            }
            this.field31707.add(new Class9549(this, n, n2, n3));
            this.field31708 = 0;
            return;
        }
        Class8452.method28204("Invalid duration: " + n);
        throw new RuntimeException("Invalid duration: " + n);
    }
    
    public void method24765(final boolean field31716) {
        this.field31716 = field31716;
    }
    
    public void method24766(final boolean field31718) {
        this.field31718 = field31718;
    }
    
    public boolean method24767() {
        return this.field31710;
    }
    
    public void method24768(final float field31712) {
        if (field31712 > 0.0f) {
            this.field31709 = (long)(this.field31709 * this.field31712 / field31712);
            this.field31712 = field31712;
        }
    }
    
    public float method24769() {
        return this.field31712;
    }
    
    public void method24770() {
        if (this.field31707.size() != 0) {
            this.field31711 = this.field31709;
            this.field31710 = true;
        }
    }
    
    public void method24771() {
        if (!this.field31710) {
            return;
        }
        if (this.field31707.size() != 0) {
            this.field31710 = false;
            this.field31709 = this.field31711;
        }
    }
    
    public void method24772() {
        if (this.field31707.size() != 0) {
            this.field31710 = false;
            this.field31708 = 0;
            this.field31709 = (int)(this.field31707.get(0).field41121 / this.field31712);
            this.field31715 = true;
            this.field31714 = 0L;
        }
    }
    
    public void method24773(final Class7764 class7764, final int n) {
        if (n != 0) {
            if (this.field31707.isEmpty()) {
                this.field31709 = (int)(n / this.field31712);
            }
            this.field31707.add(new Class9549(this, class7764, n));
            this.field31708 = 0;
            return;
        }
        Class8452.method28204("Invalid duration: " + n);
        throw new RuntimeException("Invalid duration: " + n);
    }
    
    public void method24774() {
        this.method24775(0.0f, 0.0f);
    }
    
    @Override
    public void method24775(final float n, final float n2) {
        this.method24777(n, n2, (float)this.method24780(), (float)this.method24781());
    }
    
    public void method24776(final float n, final float n2, final Class2427 class2427) {
        this.method24778(n, n2, (float)this.method24780(), (float)this.method24781(), class2427);
    }
    
    public void method24777(final float n, final float n2, final float n3, final float n4) {
        this.method24778(n, n2, n3, n4, Class2427.field14355);
    }
    
    public void method24778(final float n, final float n2, final float n3, final float n4, final Class2427 class2427) {
        if (this.field31707.size() != 0) {
            if (this.field31716) {
                final long method24793 = this.method24793();
                long n5 = method24793 - this.field31714;
                if (this.field31715) {
                    n5 = 0L;
                    this.field31715 = false;
                }
                this.field31714 = method24793;
                this.method24791(n5);
            }
            this.field31707.get(this.field31708).field41120.method24778(n, n2, n3, n4, class2427);
        }
    }
    
    public void method24779(final int n, final int n2) {
        if (this.field31707.size() != 0) {
            if (this.field31716) {
                final long method24793 = this.method24793();
                long n3 = method24793 - this.field31714;
                if (this.field31715) {
                    n3 = 0L;
                    this.field31715 = false;
                }
                this.field31714 = method24793;
                this.method24791(n3);
            }
            final Class9549 class9549 = this.field31707.get(this.field31708);
            this.field31720.method24863(n, n2, class9549.field41122, class9549.field41123);
        }
    }
    
    public int method24780() {
        return this.field31707.get(this.field31708).field41120.method24843();
    }
    
    public int method24781() {
        return this.field31707.get(this.field31708).field41120.method24844();
    }
    
    public void method24782(final float n, final float n2, final float n3, final float n4) {
        this.method24783(n, n2, n3, n4, Class2427.field14355);
    }
    
    public void method24783(final float n, final float n2, final float n3, final float n4, final Class2427 class2427) {
        if (this.field31707.size() != 0) {
            if (this.field31716) {
                final long method24793 = this.method24793();
                long n5 = method24793 - this.field31714;
                if (this.field31715) {
                    n5 = 0L;
                    this.field31715 = false;
                }
                this.field31714 = method24793;
                this.method24791(n5);
            }
            this.field31707.get(this.field31708).field41120.method24829(n, n2, n3, n4, class2427);
        }
    }
    
    @Deprecated
    public void method24784() {
        if (this.field31716) {
            final long method24793 = this.method24793();
            long n = method24793 - this.field31714;
            if (this.field31715) {
                n = 0L;
                this.field31715 = false;
            }
            this.field31714 = method24793;
            this.method24791(n);
        }
    }
    
    public void method24785(final long n) {
        this.method24791(n);
    }
    
    public int method24786() {
        return this.field31708;
    }
    
    public void method24787(final int field31708) {
        this.field31708 = field31708;
    }
    
    public Class7764 method24788(final int index) {
        return this.field31707.get(index).field41120;
    }
    
    public int method24789() {
        return this.field31707.size();
    }
    
    public Class7764 method24790() {
        return this.field31707.get(this.field31708).field41120;
    }
    
    private void method24791(final long n) {
        if (this.field31710) {
            return;
        }
        if (this.field31707.size() != 0) {
            this.field31709 -= n;
            while (this.field31709 < 0L) {
                if (this.field31710) {
                    break;
                }
                if (this.field31708 == this.field31713) {
                    this.field31710 = true;
                    break;
                }
                if (this.field31708 == this.field31707.size() - 1) {
                    if (!this.field31719) {
                        if (!this.field31718) {
                            this.field31710 = true;
                            break;
                        }
                    }
                }
                this.field31708 = (this.field31708 + this.field31717) % this.field31707.size();
                if (this.field31718) {
                    if (this.field31708 > 0) {
                        if (this.field31708 >= this.field31707.size() - 1) {
                            this.field31708 = this.field31707.size() - 1;
                            this.field31717 = -1;
                        }
                    }
                    else {
                        this.field31708 = 0;
                        this.field31717 = 1;
                        if (!this.field31719) {
                            this.field31710 = true;
                            break;
                        }
                    }
                }
                this.field31709 += (int)(this.field31707.get(this.field31708).field41121 / this.field31712);
            }
        }
    }
    
    public void method24792(final boolean field31719) {
        this.field31719 = field31719;
    }
    
    private long method24793() {
        return 0L;
    }
    
    public void method24794(final int field31713) {
        this.field31713 = field31713;
    }
    
    public int method24795(final int index) {
        return this.field31707.get(index).field41121;
    }
    
    public void method24796(final int index, final int field41121) {
        this.field31707.get(index).field41121 = field41121;
    }
    
    public int[] method24797() {
        final int[] array = new int[this.field31707.size()];
        for (int i = 0; i < this.field31707.size(); ++i) {
            array[i] = this.method24795(i);
        }
        return array;
    }
    
    @Override
    public String toString() {
        String s = "[Animation (" + this.field31707.size() + ") ";
        for (int i = 0; i < this.field31707.size(); ++i) {
            s = s + ((Class9549)this.field31707.get(i)).field41121 + ",";
        }
        return s + "]";
    }
    
    public Class7762 method24798() {
        final Class7762 class7762 = new Class7762();
        class7762.field31720 = this.field31720;
        class7762.field31707 = this.field31707;
        class7762.field31716 = this.field31716;
        class7762.field31717 = this.field31717;
        class7762.field31719 = this.field31719;
        class7762.field31718 = this.field31718;
        class7762.field31712 = this.field31712;
        return class7762;
    }
}
