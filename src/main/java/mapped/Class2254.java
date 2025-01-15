// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.StringReader;

public class Class2254 extends Class2251 implements Class2253
{
    private final String field13796;
    private final Class9043 field13797;
    private final String field13798;
    private String field13799;
    
    public Class2254(final String field13796, final String field13797) {
        this.field13799 = "";
        this.field13796 = field13796;
        this.field13798 = field13797;
        Class9043 method25070 = null;
        try {
            method25070 = new Class7793(new StringReader(field13796)).method25070();
        }
        catch (final CommandSyntaxException ex) {}
        this.field13797 = method25070;
    }
    
    public String method8475() {
        return this.field13796;
    }
    
    public String method8476() {
        return this.field13798;
    }
    
    public void method8477(final String field13799) {
        this.field13799 = field13799;
    }
    
    @Override
    public String method8459() {
        return this.field13799;
    }
    
    private void method8478(final Class7492 class7492) {
        final Class394 method23255 = class7492.method23255();
        if (method23255 != null) {
            if (method23255.method1493()) {
                if (Class8272.method27500(this.field13799)) {
                    final Class6515 method23256 = method23255.method1579();
                    final Class9290 method23257 = method23256.method19632(this.field13798);
                    if (!method23256.method19635(this.field13796, method23257)) {
                        this.field13799 = "";
                    }
                    else {
                        this.method8477(String.format("%d", method23256.method19636(this.field13796, method23257).method23969()));
                    }
                }
            }
        }
    }
    
    public Class2254 method8479() {
        final Class2254 class2254 = new Class2254(this.field13796, this.field13798);
        class2254.method8477(this.field13799);
        return class2254;
    }
    
    @Override
    public Class2250 method8473(final Class7492 class7492, final Class399 class7493, final int n) throws CommandSyntaxException {
        if (class7492 != null) {
            String s;
            if (this.field13797 == null) {
                s = this.field13796;
            }
            else {
                final List<? extends Class399> method32511 = this.field13797.method32511(class7492);
                if (!method32511.isEmpty()) {
                    if (method32511.size() != 1) {
                        throw Class6886.field27001.create();
                    }
                    s = ((Class399)method32511.get(0)).method1867();
                }
                else {
                    s = this.field13796;
                }
            }
            final Class2254 class7494 = new Class2254((class7493 != null && s.equals("*")) ? class7493.method1867() : s, this.field13798);
            class7494.method8477(this.field13799);
            class7494.method8478(class7492);
            return class7494;
        }
        return this.method8479();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Class2254) {
            final Class2254 class2254 = (Class2254)o;
            if (this.field13796.equals(class2254.field13796)) {
                if (this.field13798.equals(class2254.field13798)) {
                    if (super.equals(o)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "ScoreComponent{name='" + this.field13796 + '\'' + "objective='" + this.field13798 + '\'' + ", siblings=" + this.field13791 + ", style=" + this.method8456() + '}';
    }
}
