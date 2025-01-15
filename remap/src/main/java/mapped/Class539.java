// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.types.DynamicOps;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.JsonOps;
import com.google.gson.JsonElement;
import org.apache.commons.lang3.StringUtils;
import java.util.Random;
import java.nio.file.Path;

public class Class539 extends Class527
{
    private final Class527 field3205;
    private Class576 field3206;
    private Class576 field3207;
    private String field3208;
    private Class1984 field3209;
    private Class1984 field3210;
    private boolean field3211;
    private boolean field3212;
    private boolean field3213;
    private boolean field3214;
    private boolean field3215;
    private boolean field3216;
    private boolean field3217;
    private Class654 field3218;
    private Class654 field3219;
    private Class654 field3220;
    private Class654 field3221;
    private Class654 field3222;
    private Class654 field3223;
    private Class654 field3224;
    private Class654 field3225;
    private String field3226;
    private String field3227;
    private String field3228;
    private String field3229;
    private int field3230;
    public Class51 field3231;
    
    public Class539(final Class527 field3205) {
        super(new Class2259("selectWorld.create", new Object[0]));
        this.field3209 = Class1984.field10986;
        this.field3211 = true;
        this.field3231 = new Class51();
        this.field3205 = field3205;
        this.field3228 = "";
        this.field3229 = Class8822.method30773("selectWorld.newWorld", new Object[0]);
    }
    
    @Override
    public void method2992() {
        this.field3206.method3376();
        this.field3207.method3376();
    }
    
    @Override
    public void method2969() {
        this.field3150.field4651.method22505(true);
        (this.field3206 = new Class580(this, this.field3156, this.field3152 / 2 - 100, 60, 200, 20, Class8822.method30773("selectWorld.enterName", new Object[0]))).method3377(this.field3229);
        this.field3206.method3374(field3229 -> {
            this.field3229 = field3229;
            this.field3218.field3431 = !this.field3206.method3378().isEmpty();
            this.method3104();
            return;
        });
        this.field3149.add(this.field3206);
        this.field3219 = this.method3029(new Class668(this, this.field3152 / 2 - 75, 115, 150, 20, Class8822.method30773("selectWorld.gameMode", new Object[0]), class654 -> {
            switch (Class9088.field38483[this.field3209.ordinal()]) {
                case 1: {
                    this.method3108(Class1984.field10987);
                    break;
                }
                case 2: {
                    this.method3108(Class1984.field10988);
                    break;
                }
                case 3: {
                    this.method3108(Class1984.field10986);
                    break;
                }
            }
            class654.method3368(250);
        }));
        (this.field3207 = new Class576(this.field3156, this.field3152 / 2 - 100, 60, 200, 20, Class8822.method30773("selectWorld.enterSeed", new Object[0]))).method3377(this.field3228);
        this.field3207.method3374(p0 -> this.field3228 = this.field3207.method3378());
        this.field3149.add(this.field3207);
        this.field3221 = this.method3029(new Class672(this, this.field3152 / 2 - 155, 100, 150, 20, Class8822.method30773("selectWorld.mapFeatures", new Object[0]), class654 -> {
            this.field3211 = !this.field3211;
            class654.method3368(250);
        }));
        this.field3221.field3432 = false;
        this.field3223 = this.method3029(new Class670(this, this.field3152 / 2 + 5, 100, 150, 20, Class8822.method30773("selectWorld.mapType", new Object[0]), class654 -> {
            ++this.field3230;
            if (this.field3230 >= Class9505.field40891.length) {
                this.field3230 = 0;
            }
            while (!this.method3106()) {
                ++this.field3230;
                if (this.field3230 < Class9505.field40891.length) {
                    continue;
                }
                this.field3230 = 0;
            }
            this.field3231 = new Class51();
            this.method3109(this.field3217);
            class654.method3368(250);
        }));
        this.field3223.field3432 = false;
        this.field3225 = this.method3029(new Class654(this.field3152 / 2 + 5, 120, 150, 20, Class8822.method30773("selectWorld.customizeType", new Object[0]), class654 -> {
            if (Class9505.field40891[this.field3230] == Class9505.field40893) {
                this.field3150.method5244(new Class696(this, this.field3231));
            }
            if (Class9505.field40891[this.field3230] == Class9505.field40897) {
                this.field3150.method5244(new Class534(this, this.field3231));
            }
        }));
        this.field3225.field3432 = false;
        this.field3224 = this.method3029(new Class656(this, this.field3152 / 2 - 155, 151, 150, 20, Class8822.method30773("selectWorld.allowCommands", new Object[0]), class654 -> {
            this.field3213 = true;
            this.field3212 = !this.field3212;
            class654.method3368(250);
        }));
        this.field3224.field3432 = false;
        this.field3222 = this.method3029(new Class655(this, this.field3152 / 2 + 5, 151, 150, 20, Class8822.method30773("selectWorld.bonusItems", new Object[0]), class654 -> {
            this.field3214 = !this.field3214;
            class654.method3368(250);
        }));
        this.field3222.field3432 = false;
        this.field3220 = this.method3029(new Class654(this.field3152 / 2 - 75, 187, 150, 20, Class8822.method30773("selectWorld.moreWorldOptions", new Object[0]), class654 -> this.method3107()));
        this.field3218 = this.method3029(new Class654(this.field3152 / 2 - 155, this.field3153 - 28, 150, 20, Class8822.method30773("selectWorld.create", new Object[0]), class654 -> this.method3105()));
        this.field3218.field3431 = !this.field3229.isEmpty();
        this.method3029(new Class654(this.field3152 / 2 + 5, this.field3153 - 28, 150, 20, Class8822.method30773("gui.cancel", new Object[0]), class654 -> this.field3150.method5244(this.field3205)));
        this.method3109(this.field3217);
        this.method3476(this.field3206);
        this.method3108(this.field3209);
        this.method3104();
    }
    
    private void method3103() {
        this.field3226 = Class8822.method30773("selectWorld.gameMode." + Class1984.method7997(this.field3209) + ".line1", new Object[0]);
        this.field3227 = Class8822.method30773("selectWorld.gameMode." + Class1984.method7997(this.field3209) + ".line2", new Object[0]);
    }
    
    private void method3104() {
        this.field3208 = this.field3206.method3378().trim();
        if (this.field3208.isEmpty()) {
            this.field3208 = "World";
        }
        try {
            this.field3208 = Class6732.method20421(this.field3150.method5243().method25799(), this.field3208, "");
        }
        catch (final Exception ex) {
            this.field3208 = "World";
            final Class539 class539 = this;
            final Class539 class540 = this;
            final Class869 class541 = class540.field3150;
            final Class7952 class542 = class541.method5243();
            final Path path = class542.method25799();
            final Class539 class543 = this;
            final String s = class543.field3208;
            final String s2 = "";
            final String s3 = Class6732.method20421(path, s, s2);
            class539.field3208 = s3;
        }
        return;
        try {
            final Class539 class539 = this;
            final Class539 class540 = this;
            final Class869 class541 = class540.field3150;
            final Class7952 class542 = class541.method5243();
            final Path path = class542.method25799();
            final Class539 class543 = this;
            final String s = class543.field3208;
            final String s2 = "";
            final String s3 = Class6732.method20421(path, s, s2);
            class539.field3208 = s3;
        }
        catch (final Exception cause) {
            throw new RuntimeException("Could not create save folder", cause);
        }
    }
    
    @Override
    public void method2971() {
        this.field3150.field4651.method22505(false);
    }
    
    private void method3105() {
        this.field3150.method5244(null);
        if (!this.field3216) {
            this.field3216 = true;
            long nextLong = new Random().nextLong();
            final String method3378 = this.field3207.method3378();
            if (!StringUtils.isEmpty((CharSequence)method3378)) {
                try {
                    final long long1 = Long.parseLong(method3378);
                    if (long1 != 0L) {
                        nextLong = long1;
                    }
                }
                catch (final NumberFormatException ex) {
                    nextLong = method3378.hashCode();
                }
            }
            final Class8511 class8511 = new Class8511(nextLong, Class1984.method7998(this.field3209), this.field3211, this.field3215, Class9505.field40891[this.field3230]);
            class8511.method28433((JsonElement)Dynamic.convert((DynamicOps)Class8453.field34721, (DynamicOps)JsonOps.INSTANCE, (Object)this.field3231));
            if (this.field3214 && !this.field3215) {
                class8511.method28431();
            }
            if (this.field3212 && !this.field3215) {
                class8511.method28432();
            }
            this.field3150.method5262(this.field3208, this.field3206.method3378().trim(), class8511);
        }
    }
    
    private boolean method3106() {
        final Class9505 class9505 = Class9505.field40891[this.field3230];
        return class9505 != null && class9505.method35407() && (class9505 != Class9505.field40898 || Class527.method3047());
    }
    
    private void method3107() {
        this.method3109(!this.field3217);
    }
    
    private void method3108(final Class1984 field3209) {
        if (!this.field3213) {
            this.field3212 = (field3209 == Class1984.field10988);
        }
        if (field3209 != Class1984.field10987) {
            this.field3215 = false;
            this.field3224.field3431 = true;
            this.field3222.field3431 = true;
        }
        else {
            this.field3215 = true;
            this.field3224.field3431 = false;
            this.field3222.field3431 = false;
        }
        this.field3209 = field3209;
        this.method3103();
    }
    
    private void method3109(final boolean field3217) {
        this.field3217 = field3217;
        this.field3219.field3432 = !this.field3217;
        this.field3223.field3432 = this.field3217;
        if (Class9505.field40891[this.field3230] != Class9505.field40898) {
            this.field3219.field3431 = true;
            if (this.field3210 != null) {
                this.method3108(this.field3210);
            }
            this.field3221.field3432 = (this.field3217 && Class9505.field40891[this.field3230] != Class9505.field40896);
            this.field3222.field3432 = this.field3217;
            this.field3224.field3432 = this.field3217;
            this.field3225.field3432 = (this.field3217 && Class9505.field40891[this.field3230].method35404());
        }
        else {
            this.field3219.field3431 = false;
            if (this.field3210 == null) {
                this.field3210 = this.field3209;
            }
            this.method3108(Class1984.field10989);
            this.field3221.field3432 = false;
            this.field3222.field3432 = false;
            this.field3224.field3432 = false;
            this.field3225.field3432 = false;
        }
        this.field3207.method3410(this.field3217);
        this.field3206.method3410(!this.field3217);
        if (!this.field3217) {
            this.field3220.method3367(Class8822.method30773("selectWorld.moreWorldOptions", new Object[0]));
        }
        else {
            this.field3220.method3367(Class8822.method30773("gui.done", new Object[0]));
        }
    }
    
    @Override
    public boolean method2972(final int n, final int n2, final int n3) {
        if (super.method2972(n, n2, n3)) {
            return true;
        }
        if (n != 257 && n != 335) {
            return false;
        }
        this.method3105();
        return true;
    }
    
    @Override
    public void method3028() {
        if (!this.field3217) {
            this.field3150.method5244(this.field3205);
        }
        else {
            this.method3109(false);
        }
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        this.method3295(this.field3156, this.field3148.getFormattedText(), this.field3152 / 2, 20, -1);
        if (!this.field3217) {
            this.method3297(this.field3156, Class8822.method30773("selectWorld.enterName", new Object[0]), this.field3152 / 2 - 100, 47, -6250336);
            this.method3297(this.field3156, Class8822.method30773("selectWorld.resultFolder", new Object[0]) + " " + this.field3208, this.field3152 / 2 - 100, 85, -6250336);
            this.field3206.method2975(n, n2, n3);
            this.method3295(this.field3156, this.field3226, this.field3152 / 2, 137, -6250336);
            this.method3295(this.field3156, this.field3227, this.field3152 / 2, 149, -6250336);
        }
        else {
            this.method3297(this.field3156, Class8822.method30773("selectWorld.enterSeed", new Object[0]), this.field3152 / 2 - 100, 47, -6250336);
            this.method3297(this.field3156, Class8822.method30773("selectWorld.seedInfo", new Object[0]), this.field3152 / 2 - 100, 85, -6250336);
            if (this.field3221.field3432) {
                this.method3297(this.field3156, Class8822.method30773("selectWorld.mapFeatures.info", new Object[0]), this.field3152 / 2 - 150, 122, -6250336);
            }
            if (this.field3224.field3432) {
                this.method3297(this.field3156, Class8822.method30773("selectWorld.allowCommands.info", new Object[0]), this.field3152 / 2 - 150, 172, -6250336);
            }
            this.field3207.method2975(n, n2, n3);
            if (Class9505.field40891[this.field3230].method35412()) {
                this.field3156.method6622(Class8822.method30773(Class9505.field40891[this.field3230].method35401(), new Object[0]), this.field3223.field3426 + 2, this.field3223.field3427 + 22, this.field3223.method3364(), 10526880);
            }
        }
        super.method2975(n, n2, n3);
    }
    
    public void method3110(final Class8660 class8660) {
        this.field3229 = class8660.method29549();
        this.field3228 = Long.toString(class8660.method29534());
        this.field3230 = ((class8660.method29570() != Class9505.field40896) ? class8660.method29570() : Class9505.field40892).method35411();
        this.field3231 = class8660.method29572();
        this.field3211 = class8660.method29565();
        this.field3212 = class8660.method29574();
        if (!class8660.method29568()) {
            if (!class8660.method29564().method591()) {
                if (class8660.method29564().method590()) {
                    this.field3209 = Class1984.field10988;
                }
            }
            else {
                this.field3209 = Class1984.field10986;
            }
        }
        else {
            this.field3209 = Class1984.field10987;
        }
    }
}
