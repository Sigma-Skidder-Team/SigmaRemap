// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import net.minecraft.util.math.MathHelper;

public class Class8490
{
    private final Class8344 field34846;
    private final Suggestions field34847;
    private final String field34848;
    private int field34849;
    private int field34850;
    private Vec2f field34851;
    private boolean field34852;
    private int field34853;
    public final /* synthetic */ Class6823 field34854;
    
    private Class8490(final Class6823 field34854, final int n, final int n2, final int n3, final Suggestions field34855, final boolean b) {
        this.field34854 = field34854;
        this.field34851 = Vec2f.ZERO;
        this.field34846 = new Class8344(n - 1, Class6823.method20900(field34854) ? (n2 - 3 - Math.min(field34855.getList().size(), Class6823.method20901(field34854)) * 12) : n2, n3 + 1, Math.min(field34855.getList().size(), Class6823.method20901(field34854)) * 12);
        this.field34847 = field34855;
        this.field34848 = Class6823.method20902(field34854).method3378();
        this.field34853 = (b ? -1 : 0);
        this.method28360(0);
    }
    
    public void method28355(final int n, final int n2) {
        final int min = Math.min(this.field34847.getList().size(), Class6823.method20901(this.field34854));
        final boolean b = this.field34849 > 0;
        final boolean b2 = this.field34847.getList().size() > this.field34849 + min;
        final boolean b3 = b || b2;
        final boolean b4 = this.field34851.x != n || this.field34851.y != n2;
        if (b4) {
            this.field34851 = new Vec2f((float)n, (float)n2);
        }
        if (b3) {
            AbstractGui.fill(this.field34846.method27808(), this.field34846.method27809() - 1, this.field34846.method27808() + this.field34846.method27810(), this.field34846.method27809(), Class6823.method20903(this.field34854));
            AbstractGui.fill(this.field34846.method27808(), this.field34846.method27809() + this.field34846.method27811(), this.field34846.method27808() + this.field34846.method27810(), this.field34846.method27809() + this.field34846.method27811() + 1, Class6823.method20903(this.field34854));
            if (b) {
                for (int i = 0; i < this.field34846.method27810(); ++i) {
                    if (i % 2 == 0) {
                        AbstractGui.fill(this.field34846.method27808() + i, this.field34846.method27809() - 1, this.field34846.method27808() + i + 1, this.field34846.method27809(), -1);
                    }
                }
            }
            if (b2) {
                for (int j = 0; j < this.field34846.method27810(); ++j) {
                    if (j % 2 == 0) {
                        AbstractGui.fill(this.field34846.method27808() + j, this.field34846.method27809() + this.field34846.method27811(), this.field34846.method27808() + j + 1, this.field34846.method27809() + this.field34846.method27811() + 1, -1);
                    }
                }
            }
        }
        int n3 = 0;
        for (int k = 0; k < min; ++k) {
            final Suggestion suggestion = this.field34847.getList().get(k + this.field34849);
            AbstractGui.fill(this.field34846.method27808(), this.field34846.method27809() + 12 * k, this.field34846.method27808() + this.field34846.method27810(), this.field34846.method27809() + 12 * k + 12, Class6823.method20903(this.field34854));
            if (n > this.field34846.method27808()) {
                if (n < this.field34846.method27808() + this.field34846.method27810()) {
                    if (n2 > this.field34846.method27809() + 12 * k) {
                        if (n2 < this.field34846.method27809() + 12 * k + 12) {
                            if (b4) {
                                this.method28360(k + this.field34849);
                            }
                            n3 = 1;
                        }
                    }
                }
            }
            Class6823.method20904(this.field34854).method6609(suggestion.getText(), (float)(this.field34846.method27808() + 1), (float)(this.field34846.method27809() + 2 + 12 * k), (k + this.field34849 != this.field34850) ? -5592406 : -256);
        }
        if (n3 != 0) {
            final Message tooltip = this.field34847.getList().get(this.field34850).getTooltip();
            if (tooltip != null) {
                Class6823.method20905(this.field34854).method3031(Class9479.method35300(tooltip).getFormattedText(), n, n2);
            }
        }
    }
    
    public boolean method28356(final int n, final int n2, final int n3) {
        if (this.field34846.method27812(n, n2)) {
            final int n4 = (n2 - this.field34846.method27809()) / 12 + this.field34849;
            if (n4 >= 0) {
                if (n4 < this.field34847.getList().size()) {
                    this.method28360(n4);
                    this.method28361();
                }
            }
            return true;
        }
        return false;
    }
    
    public boolean method28357(final double n) {
        if (!this.field34846.method27812((int)(Class6823.method20906(this.field34854).field4650.method26959() * Class6823.method20906(this.field34854).method5332().method7696() / Class6823.method20906(this.field34854).method5332().method7694()), (int)(Class6823.method20906(this.field34854).field4650.method26960() * Class6823.method20906(this.field34854).method5332().method7697() / Class6823.method20906(this.field34854).method5332().method7695()))) {
            return false;
        }
        this.field34849 = MathHelper.method35651((int)(this.field34849 - n), 0, Math.max(this.field34847.getList().size() - Class6823.method20901(this.field34854), 0));
        return true;
    }
    
    public boolean method28358(final int n, final int n2, final int n3) {
        if (n == 265) {
            this.method28359(-1);
            this.field34852 = false;
            return true;
        }
        if (n == 264) {
            this.method28359(1);
            this.field34852 = false;
            return true;
        }
        if (n == 258) {
            if (this.field34852) {
                this.method28359(Screen.hasShiftDown() ? -1 : 1);
            }
            this.method28361();
            return true;
        }
        if (n != 256) {
            return false;
        }
        this.method28363();
        return true;
    }
    
    public void method28359(final int n) {
        this.method28360(this.field34850 + n);
        final int field34849 = this.field34849;
        final int n2 = this.field34849 + Class6823.method20901(this.field34854) - 1;
        if (this.field34850 >= field34849) {
            if (this.field34850 > n2) {
                this.field34849 = MathHelper.method35651(this.field34850 + Class6823.method20907(this.field34854) - Class6823.method20901(this.field34854), 0, Math.max(this.field34847.getList().size() - Class6823.method20901(this.field34854), 0));
            }
        }
        else {
            this.field34849 = MathHelper.method35651(this.field34850, 0, Math.max(this.field34847.getList().size() - Class6823.method20901(this.field34854), 0));
        }
    }
    
    public void method28360(final int field34850) {
        this.field34850 = field34850;
        if (this.field34850 < 0) {
            this.field34850 += this.field34847.getList().size();
        }
        if (this.field34850 >= this.field34847.getList().size()) {
            this.field34850 -= this.field34847.getList().size();
        }
        Class6823.method20902(this.field34854).method3411(Class6823.method20908(Class6823.method20902(this.field34854).method3378(), this.field34847.getList().get(this.field34850).apply(this.field34848)));
        if (NarratorChatListener.field32404.method25560()) {
            if (this.field34853 != this.field34850) {
                NarratorChatListener.field32404.method25556(this.method28362());
            }
        }
    }
    
    public void method28361() {
        final Suggestion suggestion = this.field34847.getList().get(this.field34850);
        Class6823.method20909(this.field34854, true);
        Class6823.method20902(this.field34854).method3377(suggestion.apply(this.field34848));
        final int n = suggestion.getRange().getStart() + suggestion.getText().length();
        Class6823.method20902(this.field34854).method3391(n);
        Class6823.method20902(this.field34854).method3407(n);
        this.method28360(this.field34850);
        Class6823.method20909(this.field34854, false);
        this.field34852 = true;
    }
    
    private String method28362() {
        this.field34853 = this.field34850;
        final List list = this.field34847.getList();
        final Suggestion suggestion = list.get(this.field34850);
        final Message tooltip = suggestion.getTooltip();
        return (tooltip == null) ? Class8822.method30773("narration.suggestion", this.field34850 + 1, list.size(), suggestion.getText()) : Class8822.method30773("narration.suggestion.tooltip", this.field34850 + 1, list.size(), suggestion.getText(), tooltip.getString());
    }
    
    public void method28363() {
        Class6823.method20910(this.field34854, null);
    }
}
