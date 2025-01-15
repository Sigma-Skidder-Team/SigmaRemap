// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5050 extends Class5046
{
    private final Class5078 field21680;
    private Class5066 field21681;
    private Class5065 field21682;
    private Boolean field21683;
    private Integer field21684;
    public String[] field21685;
    private final int field21686 = 0;
    private final int field21687 = 1;
    private final int field21688 = 4;
    private Class5611 field21689;
    private Class5611 field21690;
    private Class5611 field21691;
    private String field21692;
    
    public Class5050(final Class5078 field21680) {
        this.field21683 = true;
        this.field21684 = 0;
        this.field21692 = Class5046.method15438("mco.backup.button.reset");
        this.field21680 = field21680;
    }
    
    public Class5050(final Class5078 class5078, final String field21692) {
        this(class5078);
        this.field21692 = field21692;
    }
    
    @Override
    public void method15375() {
        this.field21682.method15587();
        super.method15375();
    }
    
    @Override
    public void method15369() {
        this.field21685 = new String[] { Class5046.method15438("generator.default"), Class5046.method15438("generator.flat"), Class5046.method15438("generator.largeBiomes"), Class5046.method15438("generator.amplified") };
        this.method15444(true);
        this.method15431(new Class5701(this, 0, this.method15421() / 2 + 8, Class7869.method25488(12), 97, 20, Class5046.method15438("gui.back")));
        this.method15431(this.field21689 = new Class5653(this, 1, this.method15421() / 2 - 102, Class7869.method25488(12), 97, 20, this.field21692));
        (this.field21682 = this.method15436(4, this.method15421() / 2 - 100, Class7869.method25488(2), 200, 20, Class5046.method15438("mco.reset.world.seed"))).method15591(32);
        this.field21682.method15588("");
        this.method15428(this.field21682);
        this.method15434(this.field21682);
        this.method15431(this.field21690 = new Class5630(this, 2, this.method15421() / 2 - 102, Class7869.method25488(4), 205, 20, this.method15473()));
        this.method15431(this.field21691 = new Class5697(this, 3, this.method15421() / 2 - 102, Class7869.method25488(6) - 2, 205, 20, this.method15474()));
        this.method15428(this.field21681 = new Class5066(Class5046.method15438("mco.reset.world.generate"), this.method15421() / 2, 17, 16777215));
        this.method15446();
    }
    
    @Override
    public void method15442() {
        this.method15444(false);
    }
    
    @Override
    public boolean method15376(final int n, final int n2, final int n3) {
        if (n != 256) {
            return super.method15376(n, n2, n3);
        }
        Class7847.method25362(this.field21680);
        return true;
    }
    
    private void method15472() {
        this.field21680.method15729(new Class8999(this.field21682.method15586(), this.field21684, this.field21683));
    }
    
    @Override
    public void method15383(final int n, final int n2, final float n3) {
        this.method15413();
        this.field21681.method15593(this);
        this.method15407(Class5046.method15438("mco.reset.world.seed"), this.method15421() / 2 - 100, Class7869.method25488(1), 10526880);
        this.field21682.method15590(n, n2, n3);
        super.method15383(n, n2, n3);
    }
    
    private String method15473() {
        return Class5046.method15438("selectWorld.mapType") + " " + this.field21685[this.field21684];
    }
    
    private String method15474() {
        return Class5046.method15438("selectWorld.mapFeatures") + " " + Class5046.method15438(((boolean)this.field21683) ? "mco.configure.world.on" : "mco.configure.world.off");
    }
}
