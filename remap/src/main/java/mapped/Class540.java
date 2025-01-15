// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.text.DecimalFormat;

public class Class540 extends Class527
{
    private final Class501 field3232;
    private Class2181 field3233;
    private Class2052 field3234;
    private Class102 field3235;
    private boolean field3236;
    private boolean field3237;
    private boolean field3238;
    private Class576 field3239;
    private Class576 field3240;
    private Class576 field3241;
    private Class576 field3242;
    private Class576 field3243;
    private Class576 field3244;
    private Class576 field3245;
    private Class576 field3246;
    private Class576 field3247;
    private Class576 field3248;
    private Class654 field3249;
    private Class654 field3250;
    private Class654 field3251;
    private Class654 field3252;
    private Class654 field3253;
    private Class654 field3254;
    private Class654 field3255;
    private Class654 field3256;
    private Class654 field3257;
    private Class654 field3258;
    private Class654 field3259;
    private Class654 field3260;
    private Class654 field3261;
    private Class654 field3262;
    private final DecimalFormat field3263;
    
    public Class540(final Class501 field3232) {
        super(new Class2259(Class7521.field29820.method11856(), new Object[0]));
        this.field3233 = Class2181.field12917;
        this.field3234 = Class2052.field11707;
        this.field3235 = Class102.field308;
        this.field3263 = new DecimalFormat("0.0###");
        this.field3232 = field3232;
        this.field3263.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
    }
    
    @Override
    public void method2992() {
        this.field3239.method3376();
        this.field3240.method3376();
        this.field3241.method3376();
        this.field3242.method3376();
        this.field3243.method3376();
        this.field3244.method3376();
        this.field3245.method3376();
        this.field3246.method3376();
        this.field3247.method3376();
        this.field3248.method3376();
    }
    
    private void method3131() {
        if (this.method3139(Class2146.field12634)) {
            this.field3150.method5244(null);
        }
    }
    
    private void method3132() {
        this.field3232.method2565(this.field3233);
        this.field3232.method2567(this.field3234);
        this.field3232.method2571(this.field3235);
        this.field3232.method2574(this.field3236);
        this.field3232.method2594(this.field3237);
        this.field3232.method2596(this.field3238);
        this.field3150.method5244(null);
    }
    
    @Override
    public void method2969() {
        this.field3150.field4651.method22505(true);
        this.field3249 = this.method3029(new Class654(this.field3152 / 2 - 4 - 150, 210, 150, 20, Class8822.method30773("gui.done", new Object[0]), class654 -> this.method3131()));
        this.field3250 = this.method3029(new Class654(this.field3152 / 2 + 4, 210, 150, 20, Class8822.method30773("gui.cancel", new Object[0]), class654 -> this.method3132()));
        this.field3251 = this.method3029(new Class654(this.field3152 / 2 + 4 + 100, 185, 50, 20, Class8822.method30773("structure_block.button.save", new Object[0]), class654 -> {
            if (this.field3232.method2570() == Class102.field305) {
                this.method3139(Class2146.field12635);
                this.field3150.method5244(null);
            }
        }));
        this.field3252 = this.method3029(new Class654(this.field3152 / 2 + 4 + 100, 185, 50, 20, Class8822.method30773("structure_block.button.load", new Object[0]), class654 -> {
            if (this.field3232.method2570() == Class102.field306) {
                this.method3139(Class2146.field12636);
                this.field3150.method5244(null);
            }
        }));
        this.field3257 = this.method3029(new Class654(this.field3152 / 2 - 4 - 150, 185, 50, 20, "MODE", class654 -> {
            this.field3232.method2572();
            this.method3138();
        }));
        this.field3258 = this.method3029(new Class654(this.field3152 / 2 + 4 + 100, 120, 50, 20, Class8822.method30773("structure_block.button.detect_size", new Object[0]), class654 -> {
            if (this.field3232.method2570() == Class102.field305) {
                this.method3139(Class2146.field12637);
                this.field3150.method5244(null);
            }
        }));
        this.field3259 = this.method3029(new Class654(this.field3152 / 2 + 4 + 100, 160, 50, 20, "ENTITIES", class654 -> {
            this.field3232.method2574(!this.field3232.method2573());
            this.method3133();
        }));
        this.field3260 = this.method3029(new Class654(this.field3152 / 2 - 20, 185, 40, 20, "MIRROR", class654 -> {
            switch (Class7630.field30220[this.field3232.method2564().ordinal()]) {
                case 1: {
                    this.field3232.method2565(Class2181.field12918);
                    break;
                }
                case 2: {
                    this.field3232.method2565(Class2181.field12919);
                    break;
                }
                case 3: {
                    this.field3232.method2565(Class2181.field12917);
                    break;
                }
            }
            this.method3136();
        }));
        this.field3261 = this.method3029(new Class654(this.field3152 / 2 + 4 + 100, 80, 50, 20, "SHOWAIR", class654 -> {
            this.field3232.method2594(!this.field3232.method2593());
            this.method3134();
        }));
        this.field3262 = this.method3029(new Class654(this.field3152 / 2 + 4 + 100, 80, 50, 20, "SHOWBB", class654 -> {
            this.field3232.method2596(!this.field3232.method2595());
            this.method3135();
        }));
        this.field3253 = this.method3029(new Class654(this.field3152 / 2 - 1 - 40 - 1 - 40 - 20, 185, 40, 20, "0", class654 -> {
            this.field3232.method2567(Class2052.field11707);
            this.method3137();
        }));
        this.field3254 = this.method3029(new Class654(this.field3152 / 2 - 1 - 40 - 20, 185, 40, 20, "90", class654 -> {
            this.field3232.method2567(Class2052.field11708);
            this.method3137();
        }));
        this.field3255 = this.method3029(new Class654(this.field3152 / 2 + 1 + 20, 185, 40, 20, "180", class654 -> {
            this.field3232.method2567(Class2052.field11709);
            this.method3137();
        }));
        this.field3256 = this.method3029(new Class654(this.field3152 / 2 + 1 + 40 + 1 + 20, 185, 40, 20, "270", class654 -> {
            this.field3232.method2567(Class2052.field11710);
            this.method3137();
        }));
        (this.field3239 = new Class579(this, this.field3156, this.field3152 / 2 - 152, 40, 300, 20, Class8822.method30773("structure_block.structure_name", new Object[0]))).method3397(64);
        this.field3239.method3377(this.field3232.method2554());
        this.field3149.add(this.field3239);
        final BlockPos method2560 = this.field3232.method2560();
        (this.field3240 = new Class576(this.field3156, this.field3152 / 2 - 152, 80, 80, 20, Class8822.method30773("structure_block.position.x", new Object[0]))).method3397(15);
        this.field3240.method3377(Integer.toString(method2560.getX()));
        this.field3149.add(this.field3240);
        (this.field3241 = new Class576(this.field3156, this.field3152 / 2 - 72, 80, 80, 20, Class8822.method30773("structure_block.position.y", new Object[0]))).method3397(15);
        this.field3241.method3377(Integer.toString(method2560.getY()));
        this.field3149.add(this.field3241);
        (this.field3242 = new Class576(this.field3156, this.field3152 / 2 + 8, 80, 80, 20, Class8822.method30773("structure_block.position.z", new Object[0]))).method3397(15);
        this.field3242.method3377(Integer.toString(method2560.getZ()));
        this.field3149.add(this.field3242);
        final BlockPos method2561 = this.field3232.method2562();
        (this.field3243 = new Class576(this.field3156, this.field3152 / 2 - 152, 120, 80, 20, Class8822.method30773("structure_block.size.x", new Object[0]))).method3397(15);
        this.field3243.method3377(Integer.toString(method2561.getX()));
        this.field3149.add(this.field3243);
        (this.field3244 = new Class576(this.field3156, this.field3152 / 2 - 72, 120, 80, 20, Class8822.method30773("structure_block.size.y", new Object[0]))).method3397(15);
        this.field3244.method3377(Integer.toString(method2561.getY()));
        this.field3149.add(this.field3244);
        (this.field3245 = new Class576(this.field3156, this.field3152 / 2 + 8, 120, 80, 20, Class8822.method30773("structure_block.size.z", new Object[0]))).method3397(15);
        this.field3245.method3377(Integer.toString(method2561.getZ()));
        this.field3149.add(this.field3245);
        (this.field3246 = new Class576(this.field3156, this.field3152 / 2 - 152, 120, 80, 20, Class8822.method30773("structure_block.integrity.integrity", new Object[0]))).method3397(15);
        this.field3246.method3377(this.field3263.format(this.field3232.method2575()));
        this.field3149.add(this.field3246);
        (this.field3247 = new Class576(this.field3156, this.field3152 / 2 - 72, 120, 80, 20, Class8822.method30773("structure_block.integrity.seed", new Object[0]))).method3397(31);
        this.field3247.method3377(Long.toString(this.field3232.method2577()));
        this.field3149.add(this.field3247);
        (this.field3248 = new Class576(this.field3156, this.field3152 / 2 - 152, 120, 240, 20, Class8822.method30773("structure_block.custom_data", new Object[0]))).method3397(128);
        this.field3248.method3377(this.field3232.method2568());
        this.field3149.add(this.field3248);
        this.field3233 = this.field3232.method2564();
        this.method3136();
        this.field3234 = this.field3232.method2566();
        this.method3137();
        this.field3235 = this.field3232.method2570();
        this.method3138();
        this.field3236 = this.field3232.method2573();
        this.method3133();
        this.field3237 = this.field3232.method2593();
        this.method3134();
        this.field3238 = this.field3232.method2595();
        this.method3135();
        this.method3476(this.field3239);
    }
    
    @Override
    public void method2970(final Class869 class869, final int n, final int n2) {
        final String method3378 = this.field3239.method3378();
        final String method3379 = this.field3240.method3378();
        final String method3380 = this.field3241.method3378();
        final String method3381 = this.field3242.method3378();
        final String method3382 = this.field3243.method3378();
        final String method3383 = this.field3244.method3378();
        final String method3384 = this.field3245.method3378();
        final String method3385 = this.field3246.method3378();
        final String method3386 = this.field3247.method3378();
        final String method3387 = this.field3248.method3378();
        this.method3038(class869, n, n2);
        this.field3239.method3377(method3378);
        this.field3240.method3377(method3379);
        this.field3241.method3377(method3380);
        this.field3242.method3377(method3381);
        this.field3243.method3377(method3382);
        this.field3244.method3377(method3383);
        this.field3245.method3377(method3384);
        this.field3246.method3377(method3385);
        this.field3247.method3377(method3386);
        this.field3248.method3377(method3387);
    }
    
    @Override
    public void method2971() {
        this.field3150.field4651.method22505(false);
    }
    
    private void method3133() {
        if (this.field3232.method2573()) {
            this.field3259.method3367(Class8822.method30773("options.off", new Object[0]));
        }
        else {
            this.field3259.method3367(Class8822.method30773("options.on", new Object[0]));
        }
    }
    
    private void method3134() {
        if (!this.field3232.method2593()) {
            this.field3261.method3367(Class8822.method30773("options.off", new Object[0]));
        }
        else {
            this.field3261.method3367(Class8822.method30773("options.on", new Object[0]));
        }
    }
    
    private void method3135() {
        if (!this.field3232.method2595()) {
            this.field3262.method3367(Class8822.method30773("options.off", new Object[0]));
        }
        else {
            this.field3262.method3367(Class8822.method30773("options.on", new Object[0]));
        }
    }
    
    private void method3136() {
        switch (Class7630.field30220[this.field3232.method2564().ordinal()]) {
            case 1: {
                this.field3260.method3367("|");
                break;
            }
            case 2: {
                this.field3260.method3367("< >");
                break;
            }
            case 3: {
                this.field3260.method3367("^ v");
                break;
            }
        }
    }
    
    private void method3137() {
        this.field3253.field3431 = true;
        this.field3254.field3431 = true;
        this.field3255.field3431 = true;
        this.field3256.field3431 = true;
        switch (Class7630.field30221[this.field3232.method2566().ordinal()]) {
            case 1: {
                this.field3253.field3431 = false;
                break;
            }
            case 2: {
                this.field3255.field3431 = false;
                break;
            }
            case 3: {
                this.field3256.field3431 = false;
                break;
            }
            case 4: {
                this.field3254.field3431 = false;
                break;
            }
        }
    }
    
    private void method3138() {
        this.field3239.method3410(false);
        this.field3240.method3410(false);
        this.field3241.method3410(false);
        this.field3242.method3410(false);
        this.field3243.method3410(false);
        this.field3244.method3410(false);
        this.field3245.method3410(false);
        this.field3246.method3410(false);
        this.field3247.method3410(false);
        this.field3248.method3410(false);
        this.field3251.field3432 = false;
        this.field3252.field3432 = false;
        this.field3258.field3432 = false;
        this.field3259.field3432 = false;
        this.field3260.field3432 = false;
        this.field3253.field3432 = false;
        this.field3254.field3432 = false;
        this.field3255.field3432 = false;
        this.field3256.field3432 = false;
        this.field3261.field3432 = false;
        this.field3262.field3432 = false;
        switch (Class7630.field30222[this.field3232.method2570().ordinal()]) {
            case 1: {
                this.field3239.method3410(true);
                this.field3240.method3410(true);
                this.field3241.method3410(true);
                this.field3242.method3410(true);
                this.field3243.method3410(true);
                this.field3244.method3410(true);
                this.field3245.method3410(true);
                this.field3251.field3432 = true;
                this.field3258.field3432 = true;
                this.field3259.field3432 = true;
                this.field3261.field3432 = true;
                break;
            }
            case 2: {
                this.field3239.method3410(true);
                this.field3240.method3410(true);
                this.field3241.method3410(true);
                this.field3242.method3410(true);
                this.field3246.method3410(true);
                this.field3247.method3410(true);
                this.field3252.field3432 = true;
                this.field3259.field3432 = true;
                this.field3260.field3432 = true;
                this.field3253.field3432 = true;
                this.field3254.field3432 = true;
                this.field3255.field3432 = true;
                this.field3256.field3432 = true;
                this.field3262.field3432 = true;
                this.method3137();
                break;
            }
            case 3: {
                this.field3239.method3410(true);
                break;
            }
            case 4: {
                this.field3248.method3410(true);
                break;
            }
        }
        this.field3257.method3367(Class8822.method30773("structure_block.mode." + this.field3232.method2570().getName(), new Object[0]));
    }
    
    private boolean method3139(final Class2146 class2146) {
        this.field3150.method5269().method17292(new Class4360(this.field3232.method2193(), class2146, this.field3232.method2570(), this.field3239.method3378(), new BlockPos(this.method3142(this.field3240.method3378()), this.method3142(this.field3241.method3378()), this.method3142(this.field3242.method3378())), new BlockPos(this.method3142(this.field3243.method3378()), this.method3142(this.field3244.method3378()), this.method3142(this.field3245.method3378())), this.field3232.method2564(), this.field3232.method2566(), this.field3248.method3378(), this.field3232.method2573(), this.field3232.method2593(), this.field3232.method2595(), this.method3141(this.field3246.method3378()), this.method3140(this.field3247.method3378())));
        return true;
    }
    
    private long method3140(final String s) {
        try {
            return Long.valueOf(s);
        }
        catch (final NumberFormatException ex) {
            return 0L;
        }
    }
    
    private float method3141(final String s) {
        try {
            return Float.valueOf(s);
        }
        catch (final NumberFormatException ex) {
            return 1.0f;
        }
    }
    
    private int method3142(final String s) {
        try {
            return Integer.parseInt(s);
        }
        catch (final NumberFormatException ex) {
            return 0;
        }
    }
    
    @Override
    public void method3028() {
        this.method3132();
    }
    
    @Override
    public boolean method2972(final int n, final int n2, final int n3) {
        if (super.method2972(n, n2, n3)) {
            return true;
        }
        if (n != 257 && n != 335) {
            return false;
        }
        this.method3131();
        return true;
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        final Class102 method2570 = this.field3232.method2570();
        this.method3295(this.field3156, this.field3148.method8461(), this.field3152 / 2, 10, 16777215);
        if (method2570 != Class102.field308) {
            this.method3297(this.field3156, Class8822.method30773("structure_block.structure_name", new Object[0]), this.field3152 / 2 - 153, 30, 10526880);
            this.field3239.method2975(n, n2, n3);
        }
        if (method2570 == Class102.field306 || method2570 == Class102.field305) {
            this.method3297(this.field3156, Class8822.method30773("structure_block.position", new Object[0]), this.field3152 / 2 - 153, 70, 10526880);
            this.field3240.method2975(n, n2, n3);
            this.field3241.method2975(n, n2, n3);
            this.field3242.method2975(n, n2, n3);
            final String method2571 = Class8822.method30773("structure_block.include_entities", new Object[0]);
            this.method3297(this.field3156, method2571, this.field3152 / 2 + 154 - this.field3156.method6617(method2571), 150, 10526880);
        }
        if (method2570 == Class102.field305) {
            this.method3297(this.field3156, Class8822.method30773("structure_block.size", new Object[0]), this.field3152 / 2 - 153, 110, 10526880);
            this.field3243.method2975(n, n2, n3);
            this.field3244.method2975(n, n2, n3);
            this.field3245.method2975(n, n2, n3);
            final String method2572 = Class8822.method30773("structure_block.detect_size", new Object[0]);
            this.method3297(this.field3156, method2572, this.field3152 / 2 + 154 - this.field3156.method6617(method2572), 110, 10526880);
            final String method2573 = Class8822.method30773("structure_block.show_air", new Object[0]);
            this.method3297(this.field3156, method2573, this.field3152 / 2 + 154 - this.field3156.method6617(method2573), 70, 10526880);
        }
        if (method2570 == Class102.field306) {
            this.method3297(this.field3156, Class8822.method30773("structure_block.integrity", new Object[0]), this.field3152 / 2 - 153, 110, 10526880);
            this.field3246.method2975(n, n2, n3);
            this.field3247.method2975(n, n2, n3);
            final String method2574 = Class8822.method30773("structure_block.show_boundingbox", new Object[0]);
            this.method3297(this.field3156, method2574, this.field3152 / 2 + 154 - this.field3156.method6617(method2574), 70, 10526880);
        }
        if (method2570 == Class102.field308) {
            this.method3297(this.field3156, Class8822.method30773("structure_block.custom_data", new Object[0]), this.field3152 / 2 - 153, 110, 10526880);
            this.field3248.method2975(n, n2, n3);
        }
        this.method3297(this.field3156, Class8822.method30773("structure_block.mode_info." + method2570.getName(), new Object[0]), this.field3152 / 2 - 153, 174, 10526880);
        super.method2975(n, n2, n3);
    }
    
    @Override
    public boolean method2991() {
        return false;
    }
}
