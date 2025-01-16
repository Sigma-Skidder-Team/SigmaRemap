// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Class7343
{
    private final Minecraft field28355;
    private final Class1844 field28356;
    private final Supplier<String> field28357;
    private final Consumer<String> field28358;
    private final int field28359;
    private int field28360;
    private int field28361;
    
    public Class7343(final Minecraft field28355, final Supplier<String> field28356, final Consumer<String> field28357, final int field28358) {
        this.field28355 = field28355;
        this.field28356 = field28355.fontRenderer;
        this.field28357 = field28356;
        this.field28358 = field28357;
        this.field28359 = field28358;
        this.method22556();
    }
    
    public boolean method22551(final char c) {
        if (Class9528.method35576(c)) {
            this.method22552(Character.toString(c));
        }
        return true;
    }
    
    private void method22552(final String str) {
        if (this.field28361 != this.field28360) {
            this.method22555();
        }
        final String str2 = this.field28357.get();
        this.field28360 = MathHelper.method35651(this.field28360, 0, str2.length());
        final String string = new StringBuilder(str2).insert(this.field28360, str).toString();
        if (this.field28356.method6617(string) <= this.field28359) {
            this.field28358.accept(string);
            final int min = Math.min(string.length(), this.field28360 + str.length());
            this.field28360 = min;
            this.field28361 = min;
        }
    }
    
    public boolean method22553(final int n) {
        final String s = this.field28357.get();
        if (Screen.method3052(n)) {
            this.field28361 = 0;
            this.field28360 = s.length();
            return true;
        }
        if (Screen.method3051(n)) {
            this.field28355.field4651.method22508(this.method22554());
            return true;
        }
        if (Screen.method3050(n)) {
            this.method22552(Class9528.method35577(TextFormatting.getTextWithoutFormattingCodes(this.field28355.field4651.method22507().replaceAll("\\r", ""))));
            this.field28361 = this.field28360;
            return true;
        }
        if (Screen.method3049(n)) {
            this.field28355.field4651.method22508(this.method22554());
            this.method22555();
            return true;
        }
        if (n == 259) {
            if (!s.isEmpty()) {
                if (this.field28361 == this.field28360) {
                    if (this.field28360 > 0) {
                        final String string = new StringBuilder(s).deleteCharAt(Math.max(0, this.field28360 - 1)).toString();
                        final int max = Math.max(0, this.field28360 - 1);
                        this.field28360 = max;
                        this.field28361 = max;
                        this.field28358.accept(string);
                    }
                }
                else {
                    this.method22555();
                }
            }
            return true;
        }
        if (n == 261) {
            if (!s.isEmpty()) {
                if (this.field28361 == this.field28360) {
                    if (this.field28360 < s.length()) {
                        this.field28358.accept(new StringBuilder(s).deleteCharAt(Math.max(0, this.field28360)).toString());
                    }
                }
                else {
                    this.method22555();
                }
            }
            return true;
        }
        if (n == 263) {
            final int n2 = this.field28356.method6630() ? 1 : -1;
            if (!Screen.method3046()) {
                this.field28360 = Math.max(0, Math.min(s.length(), this.field28360 + n2));
            }
            else {
                this.field28360 = this.field28356.method6629(s, n2, this.field28360, true);
            }
            if (!Screen.method3047()) {
                this.field28361 = this.field28360;
            }
            return true;
        }
        if (n == 262) {
            final int n3 = this.field28356.method6630() ? -1 : 1;
            if (!Screen.method3046()) {
                this.field28360 = Math.max(0, Math.min(s.length(), this.field28360 + n3));
            }
            else {
                this.field28360 = this.field28356.method6629(s, n3, this.field28360, true);
            }
            if (!Screen.method3047()) {
                this.field28361 = this.field28360;
            }
            return true;
        }
        if (n == 268) {
            this.field28360 = 0;
            if (!Screen.method3047()) {
                this.field28361 = this.field28360;
            }
            return true;
        }
        if (n != 269) {
            return false;
        }
        this.field28360 = this.field28357.get().length();
        if (!Screen.method3047()) {
            this.field28361 = this.field28360;
        }
        return true;
    }
    
    private String method22554() {
        return this.field28357.get().substring(Math.min(this.field28360, this.field28361), Math.max(this.field28360, this.field28361));
    }
    
    private void method22555() {
        if (this.field28361 != this.field28360) {
            final String s = this.field28357.get();
            final int min = Math.min(this.field28360, this.field28361);
            final String string = s.substring(0, min) + s.substring(Math.max(this.field28360, this.field28361));
            this.field28360 = min;
            this.field28361 = this.field28360;
            this.field28358.accept(string);
        }
    }
    
    public void method22556() {
        final int length = this.field28357.get().length();
        this.field28360 = length;
        this.field28361 = length;
    }
    
    public int method22557() {
        return this.field28360;
    }
    
    public int method22558() {
        return this.field28361;
    }
}
