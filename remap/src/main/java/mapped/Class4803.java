// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class Class4803 implements Class4925
{
    public String field20474;
    public Class4803 field20475;
    private final List<Class4803> field20476;
    private final List<Class6507> field20477;
    public int field20478;
    public int field20479;
    public int field20480;
    public int field20481;
    public float field20482;
    public float field20483;
    public int field20484;
    public int field20485;
    public boolean field20486;
    public boolean field20487;
    public boolean field20488;
    public boolean field20489;
    public boolean field20490;
    public boolean field20491;
    public boolean field20492;
    public boolean field20493;
    public boolean field20494;
    public String field20495;
    public Class7524 field20496;
    public Class6523 field20497;
    private ArrayList<Runnable> field20498;
    private final List<Class4803> field20499;
    private boolean field20500;
    private final List<Class4803> field20501;
    private Class4803 field20502;
    private final List<Class8538> field20503;
    private final List<Class7818> field20504;
    private final List<Class9492> field20505;
    private final List<Class8306> field20506;
    private final List<Class8749> field20507;
    private int field20508;
    private int field20509;
    
    public Class4803(final Class4803 class4803, final String s) {
        this(class4803, s, 0, 0, 0, 0);
    }
    
    public Class4803(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4) {
        this(class4803, s, n, n2, n3, n4, Class6523.field25964);
    }
    
    public Class4803(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Class6523 class4804) {
        this(class4803, s, n, n2, n3, n4, class4804, null);
    }
    
    public Class4803(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Class6523 class4804, final String s2) {
        this(class4803, s, n, n2, n3, n4, class4804, s2, Class9400.field40314);
    }
    
    public Class4803(final Class4803 field20475, final String field20476, final int field20477, final int field20478, final int field20479, final int field20480, final Class6523 field20481, final String field20482, final Class7524 field20483) {
        this.field20476 = new ArrayList<Class4803>();
        this.field20477 = new ArrayList<Class6507>();
        this.field20482 = 1.0f;
        this.field20483 = 1.0f;
        this.field20484 = 0;
        this.field20485 = 0;
        this.field20498 = new ArrayList<Runnable>();
        this.field20499 = new ArrayList<Class4803>();
        this.field20501 = new ArrayList<Class4803>();
        this.field20503 = new ArrayList<Class8538>();
        this.field20504 = new ArrayList<Class7818>();
        this.field20505 = new ArrayList<Class9492>();
        this.field20506 = new ArrayList<Class8306>();
        this.field20507 = new ArrayList<Class8749>();
        this.field20474 = field20476;
        this.field20475 = field20475;
        this.field20478 = field20477;
        this.field20479 = field20478;
        this.field20480 = field20479;
        this.field20481 = field20480;
        this.field20495 = field20482;
        this.field20497 = field20481;
        this.field20496 = field20483;
        this.field20486 = true;
        this.field20487 = true;
        this.field20493 = true;
        this.field20494 = false;
    }
    
    private void method14223() {
        for (final Class4803 class4803 : new ArrayList(this.field20476)) {
            if (class4803.method14300()) {
                this.field20476.remove(class4803);
                this.field20476.add(class4803);
            }
            if (!class4803.method14302()) {
                continue;
            }
            this.field20476.remove(class4803);
            this.field20476.add(0, class4803);
        }
    }
    
    public Class4803 method14224(final String anObject) {
        for (final Class4803 class4803 : this.field20476) {
            if (!class4803.method14266().equals(anObject)) {
                continue;
            }
            return class4803;
        }
        return null;
    }
    
    public void method14225(final Runnable e) {
        synchronized (this) {
            if (e != null) {
                this.field20498.add(e);
            }
        }
    }
    
    private void method14226() {
        for (final Class4803 class4803 : this.field20501) {
            this.field20476.remove(class4803);
            if (this.field20502 != class4803) {
                continue;
            }
            this.field20502 = null;
        }
        this.field20499.clear();
        final Iterator<Class4803> iterator2 = this.field20499.iterator();
        while (iterator2.hasNext()) {
            this.field20476.add(iterator2.next());
        }
        this.field20499.clear();
        if (this.field20502 != null) {
            this.field20476.remove(this.field20502);
            this.field20476.add(this.field20502);
        }
        this.method14223();
    }
    
    public void method14200(final int field20508, final int field20509) {
        this.field20509 = field20509;
        this.field20508 = field20508;
        this.field20491 = (this.method14298() && this.method14238(field20508, field20509));
        for (int i = 0; i < this.field20498.size(); ++i) {
            final Runnable runnable = this.field20498.get(i);
            if (runnable != null) {
                runnable.run();
            }
        }
        this.field20498.clear();
        this.field20500 = true;
        try {
            final Iterator<Class4803> iterator = this.field20476.iterator();
            while (iterator.hasNext()) {
                iterator.next().method14200(field20508, field20509);
            }
        }
        catch (final ConcurrentModificationException ex) {
            ex.printStackTrace();
            Class9463.method35174().method20242("FUCK! Why does this shit happen");
        }
        this.field20492 &= this.field20491;
        for (final Class6507 class6507 : this.method14269()) {
            if (this.field20486) {
                class6507.method19597(this, this.method14267());
            }
        }
        this.method14226();
        this.field20500 = false;
    }
    
    public void method14227() {
        GL11.glTranslatef((float)(this.method14272() + this.method14276() / 2), (float)(this.method14274() + this.method14278() / 2), 0.0f);
        GL11.glScalef(this.method14282(), this.method14284(), 0.0f);
        GL11.glTranslatef((float)(-this.method14272() - this.method14276() / 2), (float)(-this.method14274() - this.method14278() / 2), 0.0f);
    }
    
    public void method14228() {
        GL11.glTranslatef((float)this.method14289(), (float)this.method14291(), 0.0f);
    }
    
    public void method14205(final float n) {
        this.method14229(n);
    }
    
    public final void method14229(final float n) {
        Class8933.method31503();
        GL11.glAlphaFunc(519, 0.0f);
        GL11.glTranslatef((float)this.method14272(), (float)this.method14274(), 0.0f);
        for (final Class4803 class4803 : this.field20476) {
            if (!class4803.method14296()) {
                continue;
            }
            GL11.glPushMatrix();
            class4803.method14205(n);
            GL11.glPopMatrix();
        }
    }
    
    public boolean method14230() {
        for (final Class4803 class4803 : this.method14250()) {
            if (class4803 instanceof Class4831 && class4803.field20488) {
                return true;
            }
            if (!class4803.method14230()) {
                continue;
            }
            return true;
        }
        return false;
    }
    
    public void method14231(final int n) {
        for (final Class4803 class4803 : this.field20476) {
            if (!class4803.method14304()) {
                continue;
            }
            if (!class4803.method14296()) {
                continue;
            }
            class4803.method14231(n);
        }
    }
    
    @Override
    public void method14232(final char c) {
        for (final Class4803 class4803 : this.field20476) {
            if (!class4803.method14304()) {
                continue;
            }
            if (!class4803.method14296()) {
                continue;
            }
            class4803.method14232(c);
        }
        this.method14265(c);
    }
    
    @Override
    public void method14204(final int n) {
        for (final Class4803 class4803 : this.field20476) {
            if (!class4803.method14304()) {
                continue;
            }
            if (!class4803.method14296()) {
                continue;
            }
            class4803.method14204(n);
        }
        this.method14263(n);
    }
    
    @Override
    public boolean method14211(final int n, final int n2, final int n3) {
        boolean b = false;
        for (int i = this.field20476.size() - 1; i >= 0; --i) {
            final Class4803 class4803 = this.field20476.get(i);
            boolean b2 = false;
            Label_0140: {
                if (class4803.method14267() != null) {
                    if (class4803.method14267() instanceof Class4817) {
                        if (class4803.method14267().method14236(n, n2)) {
                            if (class4803.method14267().method14296()) {
                                if (class4803.method14267().method14304()) {
                                    b2 = true;
                                    break Label_0140;
                                }
                            }
                        }
                    }
                }
                b2 = false;
            }
            final boolean b3 = b2;
            if (!b) {
                if (class4803.method14304()) {
                    if (class4803.method14296()) {
                        if (class4803.method14236(n, n2) || b3) {
                            class4803.method14211(n, n2, n3);
                            b = !b3;
                            continue;
                        }
                    }
                }
            }
            class4803.method14307(false);
            final Class4803 class4804 = class4803;
            if (class4804 != null) {
                final Iterator<Class4803> iterator = class4804.method14250().iterator();
                while (iterator.hasNext()) {
                    iterator.next().method14307(false);
                }
            }
        }
        if (!b) {
            final boolean b4 = true;
            this.field20491 = b4;
            this.field20492 = b4;
            this.method14251();
            this.method14257(n3);
            return false;
        }
        return true;
    }
    
    @Override
    public void method14233(final int n, final int n2, final int n3) {
        this.field20491 = this.method14236(n, n2);
        for (final Class4803 class4803 : this.field20476) {
            if (!class4803.method14304()) {
                continue;
            }
            if (!class4803.method14296()) {
                continue;
            }
            class4803.method14233(n, n2, n3);
        }
        this.method14259(n3);
        if (this.method14309()) {
            if (this.method14308()) {
                this.method14234(n, n2, n3);
            }
        }
        this.field20492 = false;
    }
    
    @Override
    public void method14234(final int n, final int n2, final int n3) {
        this.method14261(n3);
    }
    
    @Override
    public void method14235(final float n) {
        for (final Class4803 class4803 : this.field20476) {
            if (!class4803.method14304()) {
                continue;
            }
            if (!class4803.method14296()) {
                continue;
            }
            class4803.method14235(n);
        }
    }
    
    public boolean method14236(int n, int n2) {
        n -= this.method14280();
        n2 -= this.method14281();
        if (n >= 0) {
            if (n <= this.field20480) {
                if (n2 >= 0) {
                    if (n2 <= this.field20481) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean method14237(final int n, final int n2, final boolean b) {
        final boolean method14236 = this.method14236(n, n2);
        if (method14236) {
            if (this.field20475 != null) {
                if (b) {
                    for (final Class4803 class4803 : this.method14250()) {
                        if (class4803.method14296() && class4803.method14236(n, n2)) {
                            return false;
                        }
                    }
                }
                Class4803 class4804 = this;
                for (Class4803 class4805 = this.method14267(); class4805 != null; class4805 = class4805.method14267()) {
                    for (int i = class4805.method14249(class4804) + 1; i < class4805.method14250().size(); ++i) {
                        final Class4803 class4806 = class4805.method14250().get(i);
                        if (class4806 != class4804) {
                            if (class4806.method14296()) {
                                if (class4806.method14236(n, n2)) {
                                    return false;
                                }
                            }
                        }
                    }
                    class4804 = class4805;
                }
            }
        }
        return method14236;
    }
    
    public boolean method14238(final int n, final int n2) {
        return this.method14237(n, n2, true);
    }
    
    public void method14239(final Class4803 class4803) {
        if (class4803 == null) {
            return;
        }
        for (final Class4803 class4804 : this.method14250()) {
            if (class4804.method14266().equals(class4803.method14266())) {
                throw new RuntimeException("Children with duplicate IDs! Child with id \"" + class4804.method14266() + "\" already exists in view \"" + this.method14266() + "\"!");
            }
        }
        class4803.method14268(this);
        if (this.field20500) {
            this.field20499.add(class4803);
        }
        else {
            try {
                this.field20476.add(class4803);
            }
            catch (final ConcurrentModificationException ex) {
                this.field20499.add(class4803);
            }
        }
    }
    
    public boolean method14240(final String anObject) {
        final Iterator<Class4803> iterator = this.method14250().iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().method14266().equals(anObject)) {
                continue;
            }
            return true;
        }
        return false;
    }
    
    public void method14241(final Class4803 class4803) {
        if (class4803 != null) {
            final Iterator<Class4803> iterator = this.method14250().iterator();
            while (iterator.hasNext()) {
                if (!iterator.next().method14266().equals(class4803.method14266())) {
                    continue;
                }
                throw new RuntimeException("Children with duplicate IDs!");
            }
            class4803.method14268(this);
            this.field20499.add(class4803);
        }
    }
    
    public void method14242(final Class4803 class4803) {
        if (class4803 == null) {
            return;
        }
        final Iterator<Class4803> iterator = this.method14250().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().method14266().equals(class4803.method14266())) {
                throw new RuntimeException("Children with duplicate IDs!");
            }
        }
        class4803.method14268(this);
        try {
            this.field20476.add(class4803);
        }
        catch (final ConcurrentModificationException ex) {}
    }
    
    public void method14243(final Class4803 class4803) {
        if (this.field20500) {
            this.field20501.add(class4803);
        }
        else {
            this.method14245(class4803);
        }
    }
    
    public void method14244(final Class4803 class4803) {
        this.field20501.add(class4803);
    }
    
    public void method14245(final Class4803 class4803) {
        this.field20476.remove(class4803);
        if (this.field20502 != null) {
            if (this.field20502.equals(class4803)) {
                this.field20502 = null;
            }
        }
        if (this.field20499.contains(class4803)) {
            this.field20499.remove(class4803);
        }
    }
    
    public void method14246(final Class4803 class4803) {
        for (final Class4803 class4804 : this.method14250()) {
            if (!class4804.field20474.equals(class4803.field20474)) {
                continue;
            }
            this.method14243(class4804);
        }
    }
    
    public void method14247() {
        this.field20476.clear();
    }
    
    public boolean method14248(final Class4803 class4803) {
        return this.field20476.contains(class4803);
    }
    
    public int method14249(final Class4803 class4803) {
        return this.field20476.indexOf(class4803);
    }
    
    public List<Class4803> method14250() {
        return this.field20476;
    }
    
    public void method14251() {
        this.method14307(true);
        if (this.field20475 != null) {
            this.field20475.field20502 = this;
            this.field20475.method14251();
        }
    }
    
    public void method14252() {
        for (final Class4803 class4803 : this.field20475.method14250()) {
            if (class4803 == this) {
                return;
            }
            class4803.method14251();
        }
    }
    
    public void method14253() {
        this.field20476.clear();
    }
    
    public Class4405 method14202(final Class4405 class4405) {
        if (this.method14310()) {
            class4405.method13301("id", this.method14266());
            class4405.method13298("x", this.method14272());
            class4405.method13298("y", this.method14274());
            if (this.method14312()) {
                class4405.method13298("width", this.method14276());
                class4405.method13298("height", this.method14278());
            }
            class4405.method13298("index", (this.field20475 == null) ? 0 : this.field20475.method14249(this));
            return this.method14254(class4405);
        }
        return class4405;
    }
    
    public final Class4405 method14254(final Class4405 class4405) {
        final Class88 class4406 = new Class88();
        for (final Class4803 class4407 : this.field20476) {
            if (!class4407.method14310()) {
                continue;
            }
            final Class4405 method14202 = class4407.method14202(new Class4405());
            if (method14202.method13274() <= 0) {
                continue;
            }
            class4406.method486(method14202);
        }
        class4405.method13301("children", class4406);
        return class4405;
    }
    
    public void method14203(final Class4405 class4405) {
        if (this.method14310()) {
            this.field20478 = Class8105.method26632(class4405, "x", this.field20478);
            this.field20479 = Class8105.method26632(class4405, "y", this.field20479);
            if (this.method14312()) {
                this.field20480 = Class8105.method26632(class4405, "width", this.field20480);
                this.field20481 = Class8105.method26632(class4405, "height", this.field20481);
            }
            final Class88 method26638 = Class8105.method26638(class4405, "children");
            class4405.method13273().iterator();
            if (method26638 != null) {
                final ArrayList list = new ArrayList((Collection<? extends E>)this.field20476);
                for (int i = 0; i < method26638.method462(); ++i) {
                    final Class4405 method26639 = method26638.method457(i);
                    final String method26640 = Class8105.method26636(method26639, "id", null);
                    final int method26641 = Class8105.method26632(method26639, "index", -1);
                    for (final Class4803 class4406 : list) {
                        if (!class4406.method14266().equals(method26640)) {
                            continue;
                        }
                        class4406.method14203(method26639);
                        if (method26641 < 0) {
                            continue;
                        }
                        this.field20476.remove(class4406);
                        if (method26641 > this.field20476.size()) {
                            this.field20476.add(class4406);
                        }
                        else {
                            this.field20476.add(method26641, class4406);
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Class4803) {
            final Class4803 class4803 = (Class4803)o;
            return this.field20474.equals(class4803.field20474) && (this.method14267() == null || this.method14267().equals(class4803.method14267()));
        }
        return false;
    }
    
    public void method14255(final Class6802 class6802) {
        class6802.method20822(this);
    }
    
    public final Class4803 method14256(final Class8538 class8538) {
        this.field20503.add(class8538);
        return this;
    }
    
    public void method14257(final int n) {
        final Iterator<Class8538> iterator = this.field20503.iterator();
        while (iterator.hasNext()) {
            iterator.next().method28645(this, n);
        }
    }
    
    public Class4803 method14258(final Class7818 class7818) {
        this.field20504.add(class7818);
        return this;
    }
    
    public void method14259(final int n) {
        final Iterator<Class7818> iterator = this.field20504.iterator();
        while (iterator.hasNext()) {
            iterator.next().method25261(this, n);
        }
    }
    
    public Class4803 method14260(final Class9492 class9492) {
        this.field20505.add(class9492);
        return this;
    }
    
    public void method14261(final int n) {
        final Iterator<Class9492> iterator = this.field20505.iterator();
        while (iterator.hasNext()) {
            iterator.next().method35322(this, n);
        }
    }
    
    public final Class4803 method14262(final Class8306 class8306) {
        this.field20506.add(class8306);
        return this;
    }
    
    public void method14263(final int n) {
        final Iterator<Class8306> iterator = this.field20506.iterator();
        while (iterator.hasNext()) {
            iterator.next().method27593(this, n);
        }
    }
    
    public final Class4803 method14264(final Class8749 class8749) {
        this.field20507.add(class8749);
        return this;
    }
    
    public void method14265(final char c) {
        final Iterator<Class8749> iterator = this.field20507.iterator();
        while (iterator.hasNext()) {
            iterator.next().method30248(c);
        }
    }
    
    public String method14266() {
        return this.field20474;
    }
    
    public Class4803 method14267() {
        return this.field20475;
    }
    
    public void method14268(final Class4803 field20475) {
        this.field20475 = field20475;
    }
    
    public List<Class6507> method14269() {
        return this.field20477;
    }
    
    public void method14270(final Class6507 class6507) {
        this.field20477.add(class6507);
    }
    
    public void method14271(final Class6507 class6507) {
        this.field20477.remove(class6507);
    }
    
    public int method14272() {
        return this.field20478;
    }
    
    public void method14273(final int field20478) {
        this.field20478 = field20478;
    }
    
    public int method14274() {
        return this.field20479;
    }
    
    public void method14275(final int field20479) {
        this.field20479 = field20479;
    }
    
    public int method14276() {
        return this.field20480;
    }
    
    public void method14277(final int field20480) {
        this.field20480 = field20480;
    }
    
    public int method14278() {
        return this.field20481;
    }
    
    public void method14279(final int field20481) {
        this.field20481 = field20481;
    }
    
    public int method14280() {
        return (this.field20475 == null) ? this.field20478 : (this.field20475.method14280() + this.field20478);
    }
    
    public int method14281() {
        return (this.field20475 == null) ? this.field20479 : (this.field20475.method14281() + this.field20479);
    }
    
    public float method14282() {
        return this.field20482;
    }
    
    public float method14283() {
        return (this.method14267() == null) ? this.method14282() : (this.method14267().method14283() * this.method14282());
    }
    
    public float method14284() {
        return this.field20483;
    }
    
    public float method14285() {
        return (this.method14267() == null) ? this.method14284() : (this.method14267().method14285() * this.method14284());
    }
    
    public void method14286(final float field20482) {
        this.field20482 = field20482;
    }
    
    public void method14287(final float field20483) {
        this.field20483 = field20483;
    }
    
    public void method14288(final float field20482, final float field20483) {
        this.field20482 = field20482;
        this.field20483 = field20483;
    }
    
    public int method14289() {
        return this.field20484;
    }
    
    public int method14290() {
        return (this.method14267() == null) ? this.method14289() : (this.method14267().method14290() * this.method14289());
    }
    
    public int method14291() {
        return this.field20485;
    }
    
    public int method14292() {
        return (this.method14267() == null) ? this.method14291() : (this.method14267().method14292() * this.method14291());
    }
    
    public void method14293(final int field20484) {
        this.field20484 = field20484;
    }
    
    public void method14294(final int field20485) {
        this.field20485 = field20485;
    }
    
    public void method14295(final int field20484, final int field20485) {
        this.field20484 = field20484;
        this.field20485 = field20485;
    }
    
    public boolean method14296() {
        return this.field20486;
    }
    
    public void method14297(final boolean field20486) {
        this.field20486 = field20486;
    }
    
    public boolean method14298() {
        return (this.field20475 == null) ? this.field20486 : (this.field20486 && this.field20475.method14298());
    }
    
    public void method14299(final boolean field20486) {
        this.field20486 = field20486;
        if (this.field20475 != null) {
            this.field20475.method14299(field20486);
        }
    }
    
    public boolean method14300() {
        return this.field20489;
    }
    
    public void method14301(final boolean field20489) {
        this.field20489 = field20489;
    }
    
    public boolean method14302() {
        return this.field20490;
    }
    
    public void method14303(final boolean field20490) {
        this.field20490 = field20490;
    }
    
    public boolean method14304() {
        return this.field20487;
    }
    
    public void method14305(final boolean field20487) {
        this.field20487 = field20487;
    }
    
    public boolean method14306() {
        return this.field20488;
    }
    
    public void method14307(final boolean field20488) {
        this.field20488 = field20488;
    }
    
    public boolean method14308() {
        return this.field20491;
    }
    
    public boolean method14309() {
        return this.field20492;
    }
    
    public boolean method14310() {
        return this.field20493;
    }
    
    public void method14311(final boolean field20493) {
        this.field20493 = field20493;
    }
    
    public boolean method14312() {
        return this.field20494;
    }
    
    public void method14313(final boolean field20494) {
        this.field20494 = field20494;
    }
    
    public String method14314() {
        return this.field20495;
    }
    
    public void method14315(final String field20495) {
        this.field20495 = field20495;
    }
    
    public Class7524 method14316() {
        return this.field20496;
    }
    
    public void method14317(final Class7524 field20496) {
        this.field20496 = field20496;
    }
    
    public Class6523 method14318() {
        return this.field20497;
    }
    
    public void method14319(final Class6523 field20497) {
        this.field20497 = field20497;
    }
    
    public int method14320() {
        return this.field20508;
    }
    
    public int method14321() {
        return this.field20509;
    }
    
    public void method14322(final int field20508) {
        this.field20508 = field20508;
    }
    
    public void method14323(final int field20509) {
        this.field20509 = field20509;
    }
}
