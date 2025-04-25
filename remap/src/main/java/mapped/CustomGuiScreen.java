// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientFonts;
import org.lwjgl.opengl.GL11;
import slick2d.TrueTypeFont;
import totalcross.json.CJsonUtils;
import totalcross.json.JSONArray;
import totalcross.json.JSONObject;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class CustomGuiScreen implements Class4925
{
    public String field20474;
    public CustomGuiScreen field20475;
    private final List<CustomGuiScreen> field20476;
    private final List<Class6507> field20477;
    public int x;
    public int y;
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
    public TrueTypeFont field20496;
    public ColorHelper field20497;
    private ArrayList<Runnable> field20498;
    private final List<CustomGuiScreen> field20499;
    private boolean field20500;
    private final List<CustomGuiScreen> field20501;
    private CustomGuiScreen field20502;
    private final List<Class8538> field20503;
    private final List<Class7818> field20504;
    private final List<Class9492> field20505;
    private final List<Class8306> field20506;
    private final List<Class8749> field20507;
    private int field20508;
    private int field20509;
    
    public CustomGuiScreen(final CustomGuiScreen customGuiScreen, final String s) {
        this(customGuiScreen, s, 0, 0, 0, 0);
    }
    
    public CustomGuiScreen(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4) {
        this(customGuiScreen, s, n, n2, n3, n4, ColorHelper.field25964);
    }
    
    public CustomGuiScreen(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final ColorHelper class4804) {
        this(customGuiScreen, s, n, n2, n3, n4, class4804, null);
    }
    
    public CustomGuiScreen(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final ColorHelper class4804, final String s2) {
        this(customGuiScreen, s, n, n2, n3, n4, class4804, s2, ClientFonts.JelloLight25);
    }
    
    public CustomGuiScreen(final CustomGuiScreen field20475, final String field20476, final int field20477, final int x, final int y, final int field20480, final ColorHelper field20481, final String field20482, final TrueTypeFont field20483) {
        this.field20476 = new ArrayList<CustomGuiScreen>();
        this.field20477 = new ArrayList<Class6507>();
        this.field20482 = 1.0f;
        this.field20483 = 1.0f;
        this.field20484 = 0;
        this.field20485 = 0;
        this.field20498 = new ArrayList<Runnable>();
        this.field20499 = new ArrayList<CustomGuiScreen>();
        this.field20501 = new ArrayList<CustomGuiScreen>();
        this.field20503 = new ArrayList<Class8538>();
        this.field20504 = new ArrayList<Class7818>();
        this.field20505 = new ArrayList<Class9492>();
        this.field20506 = new ArrayList<Class8306>();
        this.field20507 = new ArrayList<Class8749>();
        this.field20474 = field20476;
        this.field20475 = field20475;
        this.x = field20477;
        this.y = x;
        this.field20480 = y;
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
        for (final CustomGuiScreen customGuiScreen : new ArrayList(this.field20476)) {
            if (customGuiScreen.method14300()) {
                this.field20476.remove(customGuiScreen);
                this.field20476.add(customGuiScreen);
            }
            if (!customGuiScreen.method14302()) {
                continue;
            }
            this.field20476.remove(customGuiScreen);
            this.field20476.add(0, customGuiScreen);
        }
    }
    
    public CustomGuiScreen method14224(final String anObject) {
        for (final CustomGuiScreen customGuiScreen : this.field20476) {
            if (!customGuiScreen.method14266().equals(anObject)) {
                continue;
            }
            return customGuiScreen;
        }
        return null;
    }
    
    public void runThisOnDimensionUpdate(final Runnable e) {
        synchronized (this) {
            if (e != null) {
                this.field20498.add(e);
            }
        }
    }
    
    private void method14226() {
        for (final CustomGuiScreen customGuiScreen : this.field20501) {
            this.field20476.remove(customGuiScreen);
            if (this.field20502 != customGuiScreen) {
                continue;
            }
            this.field20502 = null;
        }
        this.field20499.clear();
        final Iterator<CustomGuiScreen> iterator2 = this.field20499.iterator();
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
            final Iterator<CustomGuiScreen> iterator = this.field20476.iterator();
            while (iterator.hasNext()) {
                iterator.next().method14200(field20508, field20509);
            }
        }
        catch (final ConcurrentModificationException ex) {
            ex.printStackTrace();
            Client.getLogger2().error("FUCK! Why does this shit happen");
        }
        this.field20492 &= this.field20491;
        for (final Class6507 class6507 : this.method14269()) {
            if (this.field20486) {
                class6507.method19597(this, this.getParent());
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
    
    public void draw(final float n) {
        this.method14229(n);
    }
    
    public final void method14229(final float n) {
        Class8933.method31503();
        GL11.glAlphaFunc(519, 0.0f);
        GL11.glTranslatef((float)this.method14272(), (float)this.method14274(), 0.0f);
        for (final CustomGuiScreen customGuiScreen : this.field20476) {
            if (!customGuiScreen.method14296()) {
                continue;
            }
            GL11.glPushMatrix();
            customGuiScreen.draw(n);
            GL11.glPopMatrix();
        }
    }
    
    public boolean method14230() {
        for (final CustomGuiScreen customGuiScreen : this.method14250()) {
            if (customGuiScreen instanceof TextField && customGuiScreen.field20488) {
                return true;
            }
            if (!customGuiScreen.method14230()) {
                continue;
            }
            return true;
        }
        return false;
    }
    
    public void method14231(final int n) {
        for (final CustomGuiScreen customGuiScreen : this.field20476) {
            if (!customGuiScreen.isHovered()) {
                continue;
            }
            if (!customGuiScreen.method14296()) {
                continue;
            }
            customGuiScreen.method14231(n);
        }
    }
    
    @Override
    public void method14232(final char c) {
        for (final CustomGuiScreen customGuiScreen : this.field20476) {
            if (!customGuiScreen.isHovered()) {
                continue;
            }
            if (!customGuiScreen.method14296()) {
                continue;
            }
            customGuiScreen.method14232(c);
        }
        this.method14265(c);
    }
    
    @Override
    public void method14204(final int n) {
        for (final CustomGuiScreen customGuiScreen : this.field20476) {
            if (!customGuiScreen.isHovered()) {
                continue;
            }
            if (!customGuiScreen.method14296()) {
                continue;
            }
            customGuiScreen.method14204(n);
        }
        this.method14263(n);
    }
    
    @Override
    public boolean method14211(final int n, final int n2, final int n3) {
        boolean b = false;
        for (int i = this.field20476.size() - 1; i >= 0; --i) {
            final CustomGuiScreen customGuiScreen = this.field20476.get(i);
            boolean b2 = false;
            Label_0140: {
                if (customGuiScreen.getParent() != null) {
                    if (customGuiScreen.getParent() instanceof Class4817) {
                        if (customGuiScreen.getParent().method14236(n, n2)) {
                            if (customGuiScreen.getParent().method14296()) {
                                if (customGuiScreen.getParent().isHovered()) {
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
                if (customGuiScreen.isHovered()) {
                    if (customGuiScreen.method14296()) {
                        if (customGuiScreen.method14236(n, n2) || b3) {
                            customGuiScreen.method14211(n, n2, n3);
                            b = !b3;
                            continue;
                        }
                    }
                }
            }
            customGuiScreen.method14307(false);
            final CustomGuiScreen class4804 = customGuiScreen;
            if (class4804 != null) {
                final Iterator<CustomGuiScreen> iterator = class4804.method14250().iterator();
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
        for (final CustomGuiScreen customGuiScreen : this.field20476) {
            if (!customGuiScreen.isHovered()) {
                continue;
            }
            if (!customGuiScreen.method14296()) {
                continue;
            }
            customGuiScreen.method14233(n, n2, n3);
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
        for (final CustomGuiScreen customGuiScreen : this.field20476) {
            if (!customGuiScreen.isHovered()) {
                continue;
            }
            if (!customGuiScreen.method14296()) {
                continue;
            }
            customGuiScreen.method14235(n);
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
                    for (final CustomGuiScreen customGuiScreen : this.method14250()) {
                        if (customGuiScreen.method14296() && customGuiScreen.method14236(n, n2)) {
                            return false;
                        }
                    }
                }
                CustomGuiScreen class4804 = this;
                for (CustomGuiScreen class4805 = this.getParent(); class4805 != null; class4805 = class4805.getParent()) {
                    for (int i = class4805.method14249(class4804) + 1; i < class4805.method14250().size(); ++i) {
                        final CustomGuiScreen class4806 = class4805.method14250().get(i);
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
    
    public void addToList(final CustomGuiScreen customGuiScreen) {
        if (customGuiScreen == null) {
            return;
        }
        for (final CustomGuiScreen class4804 : this.method14250()) {
            if (class4804.method14266().equals(customGuiScreen.method14266())) {
                throw new RuntimeException("Children with duplicate IDs! Child with id \"" + class4804.method14266() + "\" already exists in view \"" + this.method14266() + "\"!");
            }
        }
        customGuiScreen.method14268(this);
        if (this.field20500) {
            this.field20499.add(customGuiScreen);
        }
        else {
            try {
                this.field20476.add(customGuiScreen);
            }
            catch (final ConcurrentModificationException ex) {
                this.field20499.add(customGuiScreen);
            }
        }
    }
    
    public boolean method14240(final String anObject) {
        final Iterator<CustomGuiScreen> iterator = this.method14250().iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().method14266().equals(anObject)) {
                continue;
            }
            return true;
        }
        return false;
    }
    
    public void method14241(final CustomGuiScreen customGuiScreen) {
        if (customGuiScreen != null) {
            final Iterator<CustomGuiScreen> iterator = this.method14250().iterator();
            while (iterator.hasNext()) {
                if (!iterator.next().method14266().equals(customGuiScreen.method14266())) {
                    continue;
                }
                throw new RuntimeException("Children with duplicate IDs!");
            }
            customGuiScreen.method14268(this);
            this.field20499.add(customGuiScreen);
        }
    }
    
    public void method14242(final CustomGuiScreen customGuiScreen) {
        if (customGuiScreen == null) {
            return;
        }
        final Iterator<CustomGuiScreen> iterator = this.method14250().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().method14266().equals(customGuiScreen.method14266())) {
                throw new RuntimeException("Children with duplicate IDs!");
            }
        }
        customGuiScreen.method14268(this);
        try {
            this.field20476.add(customGuiScreen);
        }
        catch (final ConcurrentModificationException ex) {}
    }
    
    public void method14243(final CustomGuiScreen customGuiScreen) {
        if (this.field20500) {
            this.field20501.add(customGuiScreen);
        }
        else {
            this.method14245(customGuiScreen);
        }
    }
    
    public void method14244(final CustomGuiScreen customGuiScreen) {
        this.field20501.add(customGuiScreen);
    }
    
    public void method14245(final CustomGuiScreen customGuiScreen) {
        this.field20476.remove(customGuiScreen);
        if (this.field20502 != null) {
            if (this.field20502.equals(customGuiScreen)) {
                this.field20502 = null;
            }
        }
        if (this.field20499.contains(customGuiScreen)) {
            this.field20499.remove(customGuiScreen);
        }
    }
    
    public void method14246(final CustomGuiScreen customGuiScreen) {
        for (final CustomGuiScreen class4804 : this.method14250()) {
            if (!class4804.field20474.equals(customGuiScreen.field20474)) {
                continue;
            }
            this.method14243(class4804);
        }
    }
    
    public void method14247() {
        this.field20476.clear();
    }
    
    public boolean method14248(final CustomGuiScreen customGuiScreen) {
        return this.field20476.contains(customGuiScreen);
    }
    
    public int method14249(final CustomGuiScreen customGuiScreen) {
        return this.field20476.indexOf(customGuiScreen);
    }
    
    public List<CustomGuiScreen> method14250() {
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
        for (final CustomGuiScreen customGuiScreen : this.field20475.method14250()) {
            if (customGuiScreen == this) {
                return;
            }
            customGuiScreen.method14251();
        }
    }
    
    public void method14253() {
        this.field20476.clear();
    }
    
    public JSONObject method14202(final JSONObject JSONObject) {
        if (this.method14310()) {
            JSONObject.put("id", this.method14266());
            JSONObject.put("x", this.method14272());
            JSONObject.put("y", this.method14274());
            if (this.method14312()) {
                JSONObject.put("width", this.method14276());
                JSONObject.put("height", this.method14278());
            }
            JSONObject.put("index", (this.field20475 == null) ? 0 : this.field20475.method14249(this));
            return this.method14254(JSONObject);
        }
        return JSONObject;
    }
    
    public final JSONObject method14254(final JSONObject JSONObject) {
        final JSONArray class4406 = new JSONArray();
        for (final CustomGuiScreen class4407 : this.field20476) {
            if (!class4407.method14310()) {
                continue;
            }
            final JSONObject method14202 = class4407.method14202(new JSONObject());
            if (method14202.length() <= 0) {
                continue;
            }
            class4406.put(method14202);
        }
        JSONObject.put("children", class4406);
        return JSONObject;
    }
    
    public void method14203(final JSONObject JSONObject) {
        if (this.method14310()) {
            this.x = CJsonUtils.getIntOrDefault(JSONObject, "x", this.x);
            this.y = CJsonUtils.getIntOrDefault(JSONObject, "y", this.y);
            if (this.method14312()) {
                this.field20480 = CJsonUtils.getIntOrDefault(JSONObject, "width", this.field20480);
                this.field20481 = CJsonUtils.getIntOrDefault(JSONObject, "height", this.field20481);
            }
            final JSONArray method26638 = CJsonUtils.getJSONArrayOrNull(JSONObject, "children");
            JSONObject.keySet().iterator();
            if (method26638 != null) {
                final ArrayList list = new ArrayList((Collection<? extends E>)this.field20476);
                for (int i = 0; i < method26638.length(); ++i) {
                    final JSONObject method26639 = method26638.getJSONObject(i);
                    final String method26640 = CJsonUtils.getStringOrDefault(method26639, "id", null);
                    final int method26641 = CJsonUtils.getIntOrDefault(method26639, "index", -1);
                    for (final CustomGuiScreen class4406 : list) {
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
        if (o instanceof CustomGuiScreen) {
            final CustomGuiScreen customGuiScreen = (CustomGuiScreen)o;
            return this.field20474.equals(customGuiScreen.field20474) && (this.getParent() == null || this.getParent().equals(customGuiScreen.getParent()));
        }
        return false;
    }
    
    public void method14255(final Class6802 class6802) {
        class6802.method20822(this);
    }
    
    public final CustomGuiScreen method14256(final Class8538 class8538) {
        this.field20503.add(class8538);
        return this;
    }
    
    public void method14257(final int n) {
        final Iterator<Class8538> iterator = this.field20503.iterator();
        while (iterator.hasNext()) {
            iterator.next().method28645(this, n);
        }
    }
    
    public CustomGuiScreen method14258(final Class7818 class7818) {
        this.field20504.add(class7818);
        return this;
    }
    
    public void method14259(final int n) {
        final Iterator<Class7818> iterator = this.field20504.iterator();
        while (iterator.hasNext()) {
            iterator.next().method25261(this, n);
        }
    }
    
    public CustomGuiScreen doThis(final Class9492 class9492) {
        this.field20505.add(class9492);
        return this;
    }
    
    public void method14261(final int n) {
        final Iterator<Class9492> iterator = this.field20505.iterator();
        while (iterator.hasNext()) {
            iterator.next().method35322(this, n);
        }
    }
    
    public final CustomGuiScreen method14262(final Class8306 class8306) {
        this.field20506.add(class8306);
        return this;
    }
    
    public void method14263(final int n) {
        final Iterator<Class8306> iterator = this.field20506.iterator();
        while (iterator.hasNext()) {
            iterator.next().method27593(this, n);
        }
    }
    
    public final CustomGuiScreen method14264(final Class8749 class8749) {
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
    
    public CustomGuiScreen getParent() {
        return this.field20475;
    }
    
    public void method14268(final CustomGuiScreen field20475) {
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
        return this.x;
    }
    
    public void method14273(final int field20478) {
        this.x = field20478;
    }
    
    public int method14274() {
        return this.y;
    }
    
    public void method14275(final int field20479) {
        this.y = field20479;
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
        return (this.field20475 == null) ? this.x : (this.field20475.method14280() + this.x);
    }
    
    public int method14281() {
        return (this.field20475 == null) ? this.y : (this.field20475.method14281() + this.y);
    }
    
    public float method14282() {
        return this.field20482;
    }
    
    public float method14283() {
        return (this.getParent() == null) ? this.method14282() : (this.getParent().method14283() * this.method14282());
    }
    
    public float method14284() {
        return this.field20483;
    }
    
    public float method14285() {
        return (this.getParent() == null) ? this.method14284() : (this.getParent().method14285() * this.method14284());
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
        return (this.getParent() == null) ? this.method14289() : (this.getParent().method14290() * this.method14289());
    }
    
    public int method14291() {
        return this.field20485;
    }
    
    public int method14292() {
        return (this.getParent() == null) ? this.method14291() : (this.getParent().method14292() * this.method14291());
    }
    
    public void method14293(final int field20484) {
        this.field20484 = field20484;
    }
    
    public void drawBackground(final int field20485) {
        this.field20485 = field20485;
    }
    
    public void method14295(final int field20484, final int field20485) {
        this.field20484 = field20484;
        this.field20485 = field20485;
    }
    
    public boolean method14296() {
        return this.field20486;
    }
    
    public void setEnabled(final boolean field20486) {
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
    
    public boolean isHovered() {
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
    
    public void setListening(final boolean field20493) {
        this.field20493 = field20493;
    }
    
    public boolean method14312() {
        return this.field20494;
    }
    
    public void method14313(final boolean field20494) {
        this.field20494 = field20494;
    }
    
    public String getTypedText() {
        return this.field20495;
    }
    
    public void setTypedText(final String field20495) {
        this.field20495 = field20495;
    }
    
    public TrueTypeFont method14316() {
        return this.field20496;
    }
    
    public void setFont(final TrueTypeFont field20496) {
        this.field20496 = field20496;
    }
    
    public ColorHelper method14318() {
        return this.field20497;
    }
    
    public void method14319(final ColorHelper field20497) {
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
