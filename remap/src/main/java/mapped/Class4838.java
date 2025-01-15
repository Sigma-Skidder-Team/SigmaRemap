// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;

public class Class4838 extends Class4825
{
    public Class4817 field20741;
    public Class4831 field20742;
    private ArrayList<Class8681> field20743;
    private Class7643 field20744;
    
    public Class4838(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final String s2) {
        super(class4803, s, n, n2, n3, n4, Class6523.field25964, s2, false);
        this.field20744 = Class9463.method35173().method35199();
        this.method14239(this.field20741 = new Class4817(this, "albumView", 0, 0, n3, n4, Class6523.field25964, "View"));
        this.method14239(this.field20742 = new Class4831(this, "searchInput", 30, 14, n3 - 60, 70, Class4831.field20671, "", "Search..."));
        this.field20742.method14301(true);
    }
    
    @Override
    public void method14205(final float n) {
        super.method14205(n);
    }
    
    @Override
    public void method14204(final int n) {
        if (n == 257) {
            if (this.field20742.method14306()) {
                this.field20742.method14307(false);
                new Thread(() -> {
                    this.field20743 = new ArrayList<Class8681>();
                    Class6109.method18247(this.field20742.method14314());
                    final Class7357[] array;
                    int i = 0;
                    for (int length = array.length; i < length; ++i) {
                        final Class7357 class7357 = array[i];
                        this.field20743.add(new Class8681(class7357.field28389, class7357.field28390, class7357.field28391));
                    }
                    this.method14225(() -> {
                        this.method14245(this.field20741);
                        final Class4817 field20741 = new Class4817(this, "albumView", 0, 0, this.field20480, this.field20481, Class6523.field25964, "View");
                        this.method14239(this.field20741 = field20741);
                        if (this.field20743 != null) {
                            int j = 0;
                            while (j < this.field20743.size()) {
                                final Class8681 class7358 = this.field20743.get(j);
                                final Class4817 field20742 = this.field20741;
                                final int n2;
                                final int n3;
                                new Class4910(this.field20741, n2 + j % 3 * 183 - ((j % 3 <= 0) ? 0 : n2) - ((j % 3 <= 1) ? 0 : n2), n3 + n2 + (j - j % 3) / 3 * 210, 183, 220, class7358);
                                final Class4803 class7359;
                                field20742.method14239(class7359);
                                final Class4803 class7360;
                                class7360.method14260((class8682, n) -> this.field20744.method24182(null, class7358));
                                ++j;
                            }
                        }
                    });
                    return;
                }).start();
            }
        }
        super.method14204(n);
    }
}
