// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientFonts;

public class Class1136 implements Runnable
{
    private static String[] field6139;
    public final /* synthetic */ Class9175 field6140;
    public final /* synthetic */ ColorHelper field6141;
    public final /* synthetic */ Class4833 field6142;
    public final /* synthetic */ Class4833 field6143;
    
    public Class1136(final Class4833 field6143, final Class9175 field6144, final ColorHelper field6145, final Class4833 field6146) {
        this.field6143 = field6143;
        this.field6140 = field6144;
        this.field6141 = field6145;
        this.field6142 = field6146;
    }
    
    @Override
    public void run() {
        if (!Class4833.method14496(this.field6143).method14240(this.field6140.field38864)) {
            final Class4868 class4868;
            Class4833.method14496(this.field6143).method14239(class4868 = new Class4868(Class4833.method14496(this.field6143), this.field6140.field38864, 0, Class4833.method14496(this.field6143).method14396().method14250().size() * Class4833.method14497(this.field6143), Class4833.method14498(this.field6143), Class4833.method14497(this.field6143), this.field6141, this.field6140.field38863, ClientFonts.JelloLight14));
            final ScrollablePane class4869;
            this.field6142.addToList(class4869 = new ScrollablePane(this.field6142, this.field6140.field38864, Class4833.method14498(this.field6143), 0, this.field6142.method14276() - Class4833.method14498(this.field6143), this.field6142.method14278() - Class4833.method14499(this.field6143), ColorHelper.field25964, this.field6140.field38863));
            class4869.method14393(true);
            class4869.setEnabled(false);
            class4869.setListening(false);
            if (this.field6140.field38866 != null) {
                for (int i = 0; i < this.field6140.field38866.size(); ++i) {
                    final Class8681 class4870 = this.field6140.field38866.get(i);
                    final int n = 65;
                    final int n2 = 10;
                    if (!class4869.method14240(this.field6140.field38864)) {
                        final Class4910 class4871;
                        class4869.addToList(class4871 = new Class4910(class4869, n2 + i % 3 * 183 - ((i % 3 <= 0) ? 0 : n2) - ((i % 3 <= 1) ? 0 : n2), n + n2 + (i - i % 3) / 3 * 210, 183, 220, class4870));
                        class4871.doThis((class9177, n) -> Class4833.method14501(this.field6143, class9175, class4870));
                    }
                }
            }
            class4868.doThis((class4818, n) -> Class4833.method14500(this.field6143, class4869));
        }
    }
}
