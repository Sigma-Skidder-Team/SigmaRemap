// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.List;

public abstract class Class3167
{
    public static Minecraft field15514;
    public String field15515;
    public String field15516;
    public Class8013 field15517;
    public boolean field15518;
    public boolean field15519;
    private boolean field15520;
    private static List<Class<? extends Class3167>> field15521;
    private Class3167 field15522;
    private int field15523;
    private Set<String> field15524;
    public Map<String, Class4997> field15525;
    
    public Class3167(final Class8013 field15517, final String field15518, final String field15519) {
        this.field15520 = true;
        this.field15522 = null;
        this.field15523 = 0;
        this.field15524 = new HashSet<String>();
        this.field15525 = new LinkedHashMap<String, Class4997>();
        this.field15517 = field15517;
        this.field15515 = field15518;
        this.field15516 = field15519;
    }
    
    public void method9881(final Class4997 class4997) {
        if (!this.field15525.containsKey(class4997.method15204())) {
            this.field15525.put(class4997.method15204(), class4997);
            return;
        }
        throw new IllegalArgumentException("Attempted to add an option with the same name");
    }
    
    public Object method9882(final String s) {
        return this.field15525.get(s).method15198();
    }
    
    public boolean method9883(final String s) {
        try {
            return Boolean.parseBoolean(this.method9882(s).toString());
        }
        catch (final Exception ex) {
            return false;
        }
    }
    
    public float[] method9884(final String s) {
        final Class4997 class4997 = (Class4997)this.method9882(s);
        if (!(class4997 instanceof Class5002)) {
            return null;
        }
        return ((Class5002)class4997).method15217();
    }
    
    public int method9885(final String s) {
        try {
            return Integer.parseInt(this.method9882(s).toString());
        }
        catch (final Exception ex) {
            return -1;
        }
    }
    
    public float method9886(final String s) {
        try {
            return Float.parseFloat(this.method9882(s).toString());
        }
        catch (final Exception ex) {
            return -1.0f;
        }
    }
    
    public String method9887(final String s) {
        try {
            return (String)this.method9882(s);
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    public List<Class4997> method9888(final String s) {
        try {
            return this.field15525.get(s).method15224();
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    public void method9889(final String s, final Object o) {
        this.field15525.get(s).method15199(o);
    }
    
    public void method9890(final String s, final boolean b) {
        this.field15525.get(s).method15199(b);
    }
    
    public void method9891(final String s, final int i) {
        this.field15525.get(s).method15199(i);
    }
    
    public void method9892(final String s, final boolean b) {
        this.field15525.get(s).method15199(b);
    }
    
    public void method9893(final String s, final String s2) {
        this.field15525.get(s).method15199(s2);
    }
    
    public void method9894() {
        if (this.field15518) {
            this.method9897();
        }
        this.field15518 = false;
        this.field15519 = true;
        final Iterator<Class4997> iterator = this.field15525.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().method15194();
        }
    }
    
    public Class4405 method9895(final Class4405 class4405) {
        final Class88 method26638 = Class8105.method26638(class4405, "options");
        try {
            this.field15518 = class4405.method13253("enabled");
        }
        catch (final Class2381 class4406) {}
        try {
            this.field15519 = class4405.method13253("allowed");
        }
        catch (final Class2381 class4407) {}
        if (method26638 != null) {
            for (int i = 0; i < method26638.method462(); ++i) {
                final Class4405 method26639 = method26638.method457(i);
                Object method26640 = null;
                try {
                    method26640 = Class8105.method26636(method26639, "name", null);
                }
                catch (final Class2381 class4408) {}
                for (final Class4997 class4409 : this.field15525.values()) {
                    if (class4409.method15204().equals(method26640)) {
                        try {
                            class4409.method15186(method26639);
                        }
                        catch (final Class2381 class4410) {
                            Class9463.method35173().method35187().method20241("Could not initialize settings of " + this.method9901() + "." + class4409.method15204() + " from config.");
                        }
                        break;
                    }
                }
            }
        }
        if (this.field15518 && Class3167.field15514.world != null) {
            this.method9879();
        }
        return class4405;
    }
    
    public Class4405 method9896(final Class4405 class4405) {
        class4405.method13301("name", this.method9901());
        class4405.method13295("enabled", this.field15518);
        class4405.method13295("allowed", this.method9911());
        final Class88 class4406 = new Class88();
        final Iterator<Class4997> iterator = this.field15525.values().iterator();
        while (iterator.hasNext()) {
            class4406.method486(iterator.next().method15193(new Class4405()));
        }
        class4405.method13301("options", class4406);
        return class4405;
    }
    
    public void method9879() {
        if (this.getClass().isAnnotationPresent(Class6752.class)) {
            if (!Class3167.field15521.contains(this.getClass())) {
                Class9463.method35173().method35187().method20241("This mod is still in development. Be careful!");
                Class3167.field15521.add(this.getClass());
            }
        }
    }
    
    public void method9897() {
    }
    
    public boolean method9898() {
        return this.method9906();
    }
    
    public Map<String, Class4997> method9899() {
        return this.field15525;
    }
    
    public String method9900() {
        return this.field15515;
    }
    
    public String method9901() {
        return this.field15515;
    }
    
    public String method9902() {
        return this.field15516;
    }
    
    public Class8013 method9903() {
        if (Class9463.method35173().method35209() == Class2209.field13465 && this.field15517 == Class8013.field32992) {
            return Class8013.field32985;
        }
        if (Class9463.method35173().method35209() == Class2209.field13465 && this.field15517 == Class8013.field32989) {
            return Class8013.field32988;
        }
        return this.field15517;
    }
    
    public int method9904() {
        return this.field15523;
    }
    
    public Class8013 method9905() {
        return this.field15517;
    }
    
    public boolean method9906() {
        return Class9463.method35173().method35209() != Class2209.field13466 && (Class9463.method35173().method35209() != Class2209.field13465 || this.method9916()) && this.field15518;
    }
    
    public void method9907(final boolean field15518) {
        if (this.field15518 != field15518) {
            if (!(this.field15518 = field15518)) {
                Class9463.method35173().method35188().method21093(this);
                this.method9897();
            }
            else {
                Class9463.method35173().method35188().method21092(this);
                this.method9879();
            }
        }
        Class9463.method35173().method35189().method21557().method21968(this);
    }
    
    public void method9908(final boolean field15518) {
        if (!(this.field15518 = field15518)) {
            Class9463.method35173().method35188().method21093(this);
        }
        else {
            Class9463.method35173().method35188().method21092(this);
        }
    }
    
    public void method9909(final boolean field15518) {
        if (this.field15518 != field15518) {
            if (!(this.field15518 = field15518)) {
                Class9463.method35173().method35188().method21093(this);
                if (!(this instanceof Class3247)) {
                    if (Class9463.method35173().method35209() == Class2209.field13464) {
                        if (Class9463.method35173().method35189().method21551(Class3311.class).method9883("Sound")) {
                            Class9463.method35173().method35196().method32830("deactivate");
                        }
                    }
                    if (Class9463.method35173().method35209() == Class2209.field13465) {
                        if (Class9463.method35173().method35189().method21551(Class3315.class).method9883("Sound")) {
                            Minecraft.method5277().method5299().method6422(Class6836.method20933(Class8520.field35617, 0.6f));
                        }
                    }
                }
                this.method9897();
            }
            else {
                Class9463.method35173().method35188().method21092(this);
                if (Class9463.method35173().method35209() == Class2209.field13464) {
                    if (Class9463.method35173().method35189().method21551(Class3311.class).method9883("Sound")) {
                        Class9463.method35173().method35196().method32830("activate");
                    }
                }
                if (Class9463.method35173().method35209() == Class2209.field13465) {
                    if (Class9463.method35173().method35189().method21551(Class3315.class).method9883("Sound")) {
                        Minecraft.method5277().method5299().method6422(Class6836.method20933(Class8520.field35617, 0.7f));
                    }
                }
                this.method9879();
                ++this.field15523;
            }
        }
        Class9463.method35173().method35189().method21557().method21968(this);
    }
    
    public void method9910() {
        if (this.method9906()) {
            this.method9909(false);
        }
        else {
            this.method9909(true);
        }
    }
    
    public boolean method9911() {
        return this.field15519;
    }
    
    public void method9912(final boolean field15519) {
        this.field15519 = field15519;
    }
    
    public void method9913(final Class3167 field15522) {
        this.field15522 = field15522;
    }
    
    public Class3167 method9914() {
        return (this.field15522 != null) ? this.field15522 : this;
    }
    
    public void method9915(final boolean field15520) {
        this.field15520 = field15520;
    }
    
    public boolean method9916() {
        return this.field15520;
    }
    
    public void method9917() {
    }
    
    static {
        Class3167.field15514 = Minecraft.method5277();
        Class3167.field15521 = new ArrayList<Class<? extends Class3167>>();
    }
}
