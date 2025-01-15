// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Class7060
{
    private Map<Class<? extends Class3167>, Class3167> field27468;
    private Class9076 field27469;
    private Class7178 field27470;
    private List<Class3167> field27471;
    
    public Class7060() {
        this.field27468 = new LinkedHashMap<Class<? extends Class3167>, Class3167>();
    }
    
    private void method21540() {
        this.field27471 = new ArrayList<Class3167>();
    }
    
    private void method21541(final Class3167 class3167) {
        this.field27471.add(class3167);
    }
    
    private void method21542(final Class<? extends Class3167> clazz) {
        Class9463.method35173().method35188().method21095(clazz);
        this.field27468.remove(clazz);
    }
    
    private void method21543() {
        Collections.sort(this.field27471, new Class4450(this));
        for (final Class3167 class3167 : this.field27471) {
            Class9463.method35173().method35188().method21094(class3167);
            this.field27468.put(class3167.getClass(), class3167);
        }
        Class9146.field38766 = true;
    }
    
    public void method21544(final Class2209 class2209) {
        this.method21540();
        this.method21541(new Class3260());
        this.method21541(new Class3259());
        this.method21541(new Class3256());
        this.method21541(new Class3272());
        this.method21541(new Class3257());
        this.method21541(new Class3295());
        this.method21541(new Class3258());
        this.method21541(new Class3221());
        this.method21541(new Class3385());
        this.method21541(new Class3250());
        this.method21541(new Class3184());
        this.method21541(new Class3265());
        this.method21541(new Class3360());
        this.method21541(new Class3240());
        this.method21541(new Class3254());
        this.method21541(new Class3197());
        this.method21541(new Class3249());
        this.method21541(new Class3376());
        this.method21541(new Class3252());
        this.method21541(new Class3261());
        this.method21541(new Class3181());
        this.method21541(new Class3255());
        this.method21541(new Class3324());
        this.method21541(new Class3211());
        this.method21541(new Class3309());
        this.method21541(new Class3262());
        this.method21541(new Class3232());
        this.method21541(new Class3269());
        this.method21541(new Class3239());
        this.method21541(new Class3208());
        this.method21541(new Class3377());
        this.method21541(new Class3203());
        this.method21541(new Class3215());
        this.method21541(new Class3357());
        this.method21541(new Class3251());
        this.method21541(new Class3177());
        this.method21541(new Class3178());
        this.method21541(new Class3350());
        this.method21541(new Class3271());
        this.method21541(new Class3361());
        this.method21541(new Class3246());
        this.method21541(new Class3353());
        this.method21541(new Class3363());
        this.method21541(new Class3238());
        this.method21541(new Class3275());
        this.method21541(new Class3179());
        this.method21541(new Class3387());
        this.method21541(new Class3278());
        this.method21541(new Class3301());
        this.method21541(new Class3393());
        this.method21541(new Class3224());
        this.method21541(new Class3296());
        this.method21541(new Class3274());
        this.method21541(new Class3276());
        this.method21541(new Class3303());
        this.method21541(new Class3263());
        this.method21541(new Class3386());
        this.method21541(new Class3230());
        this.method21541(new Class3172());
        this.method21541(new Class3317());
        this.method21541(new Class3228());
        this.method21541(new Class3291());
        this.method21541(new Class3266());
        this.method21541(new Class3244());
        this.method21541(new Class3237());
        this.method21541(new Class3195());
        this.method21541(new Class3193());
        this.method21541(new Class3285());
        this.method21541(new Class3288());
        this.method21541(new Class3375());
        this.method21541(new Class3280());
        this.method21541(new Class3352());
        this.method21541(new Class3199());
        this.method21541(new Class3281());
        this.method21541(new Class3304());
        this.method21541(new Class3380());
        this.method21541(new Class3354());
        this.method21541(new Class3192());
        this.method21541(new Class3319());
        this.method21541(new Class3208());
        this.method21541(new Class3305());
        this.method21541(new Class3374());
        this.method21541(new Class3314());
        this.method21541(new Class3318());
        this.method21541(new Class3210());
        this.method21541(new Class3264());
        this.method21541(new Class3182());
        this.method21541(new Class3219());
        this.method21541(new Class3330());
        this.method21541(new Class3216());
        this.method21541(new Class3381());
        if (class2209 != Class2209.field13464) {
            if (class2209 == Class2209.field13465) {
                this.method21541(new Class3315());
                this.method21541(new Class3206());
                this.method21541(new Class3277());
                this.method21541(new Class3248());
                this.method21541(new Class3328());
            }
        }
        else {
            this.method21541(new Class3287());
            this.method21541(new Class3389());
            this.method21541(new Class3325());
            this.method21541(new Class3170());
            this.method21541(new Class3175());
            this.method21541(new Class3289());
            this.method21541(new Class3311());
            this.method21541(new Class3356());
            this.method21541(new Class3279());
            this.method21541(new Class3190());
            this.method21541(new Class3213());
            this.method21541(new Class3300());
            this.method21541(new Class3182());
            this.method21541(new Class3223());
            this.method21541(new Class3188());
            this.method21541(new Class3364());
            this.method21541(new Class3253());
            this.method21541(new Class3268());
            this.method21541(new Class3362());
            this.method21541(new Class3310());
            this.method21541(new Class3368());
        }
        this.method21543();
    }
    
    public Class4405 method21545(final Class4405 class4405) {
        Class88 method26638 = null;
        try {
            method26638 = Class8105.method26638(class4405, "mods");
        }
        catch (final Class2381 class4406) {}
        final Iterator<Class3167> iterator = this.field27468.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().method9894();
        }
        if (method26638 != null) {
            for (int i = 0; i < method26638.method462(); ++i) {
                final Class4405 method26639 = method26638.method457(i);
                Object method26640 = null;
                try {
                    method26640 = Class8105.method26636(method26639, "name", null);
                }
                catch (final Class2381 class4407) {
                    Class9463.method35173().method35187().method20241("Invalid name in mod list config");
                }
                for (final Class3167 class4408 : this.field27468.values()) {
                    if (class4408.method9901().equals(method26640)) {
                        try {
                            class4408.method9895(method26639);
                        }
                        catch (final Class2381 class4409) {
                            Class9463.method35173().method35187().method20241("Could not initialize mod " + class4408.method9901() + " from config. All settings for this mod have been erased.");
                        }
                        break;
                    }
                }
            }
        }
        else {
            Class9463.method35173().method35187().method20240("Mods array does not exist in config. Assuming a blank profile...");
        }
        for (final Class3167 class4410 : this.field27468.values()) {
            if (class4410.method9906()) {
                Class9463.method35173().method35188().method21092(class4410);
                if (class4410 instanceof Class3247) {
                    final Class3247 class4411 = (Class3247)class4410;
                    if (class4411.field15743 != null) {
                        Class9463.method35173().method35188().method21092(class4411.field15743);
                    }
                }
            }
            else {
                Class9463.method35173().method35188().method21093(class4410);
                if (class4410 instanceof Class3247) {
                    final Class3167[] field15742 = ((Class3247)class4410).field15742;
                    for (int length = field15742.length, j = 0; j < length; ++j) {
                        Class9463.method35173().method35188().method21093(field15742[j]);
                    }
                }
            }
            class4410.method9917();
        }
        return class4405;
    }
    
    public Class4405 method21546(final Class4405 class4405) {
        final Class88 class4406 = new Class88();
        final Iterator<Class3167> iterator = this.field27468.values().iterator();
        while (iterator.hasNext()) {
            class4406.method486(iterator.next().method9896(new Class4405()));
        }
        class4405.method13301("mods", class4406);
        return class4405;
    }
    
    public void method21547() {
        long n = this.method21550();
        for (final Class3167 class3167 : this.field27468.values()) {
            final Iterator<Class4997> iterator2 = class3167.method9899().values().iterator();
            while (iterator2.hasNext()) {
                if (iterator2.next().method15202()) {
                    ++n;
                }
                if (!(class3167 instanceof Class3247)) {
                    continue;
                }
                final Class3167[] field15742 = ((Class3247)class3167).field15742;
                for (int length = field15742.length, i = 0; i < length; ++i) {
                    final Iterator<Class4997> iterator3 = field15742[i].method9899().values().iterator();
                    while (iterator3.hasNext()) {
                        if (!iterator3.next().method15202()) {
                            continue;
                        }
                        ++n;
                    }
                }
            }
        }
    }
    
    public void method21548(final Class4405 class4405) {
        String method13268 = null;
        try {
            method13268 = class4405.method13268("profile");
        }
        catch (final Class2381 class4406) {}
        if (Class9463.method35173().method35209() == Class2209.field13465) {
            method13268 = "Classic";
        }
        this.field27469 = new Class9076();
        this.field27470 = new Class7178();
        try {
            this.field27469.method32704(method13268);
            this.field27470.method21963(class4405);
        }
        catch (final IOException ex) {
            Class9463.method35173().method35187().method20242("Could not load profiles!");
            ex.printStackTrace();
            throw new RuntimeException("sorry m8");
        }
        this.field27470.method21969();
    }
    
    public void method21549(final Class4405 class4405) {
        class4405.method13301("profile", this.field27469.method32707().field33839);
        this.field27469.method32707().field33838 = this.method21546(new Class4405());
        try {
            this.field27469.method32706();
            this.field27470.method21962(class4405);
        }
        catch (final IOException ex) {
            ex.printStackTrace();
            Class9463.method35173().method35187().method20241("Unable to save mod profiles...");
        }
    }
    
    public int method21550() {
        final Class4997 class4997 = this.method21551(Class3295.class).method9899().get("Mode");
        final String field21511 = (String)class4997.field21511;
        class4997.method15199("Dolphin");
        class4997.field21511 = (T)field21511;
        return 0;
    }
    
    public Class3167 method21551(final Class<? extends Class3167> clazz) {
        return this.field27468.get(clazz);
    }
    
    public Class3167 method21552(final Class<? extends Class3167> clazz) {
        if (clazz.getSuperclass() == Class3247.class) {
            for (final Class3167 class3167 : this.field27468.get(clazz.getSuperclass()).field15742) {
                if (class3167.getClass() == clazz) {
                    return class3167;
                }
            }
        }
        return this.field27468.get(clazz);
    }
    
    public Map<Class<? extends Class3167>, Class3167> method21553() {
        return this.field27468;
    }
    
    public List<Class3167> method21554(final Class8013 class8013) {
        final ArrayList list = new ArrayList();
        for (final Class3167 class8014 : this.field27468.values()) {
            if (!class8014.method9903().equals(class8013)) {
                continue;
            }
            list.add(class8014);
        }
        return list;
    }
    
    public List<Class3167> method21555() {
        final ArrayList list = new ArrayList();
        for (final Class3167 class3167 : this.field27468.values()) {
            if (!class3167.method9906()) {
                continue;
            }
            list.add(class3167);
        }
        return list;
    }
    
    public Class9076 method21556() {
        return this.field27469;
    }
    
    public Class7178 method21557() {
        return this.field27470;
    }
}
