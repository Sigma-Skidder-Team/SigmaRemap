// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.io.IOException;
import com.mojang.authlib.GameProfile;
import org.apache.logging.log4j.Logger;

public class Class6766 extends Class6765
{
    private static final Logger field26560;
    
    public Class6766(final Class395 class395) {
        super(class395, class395.method1615().field39804);
        final Class9277 method1615 = class395.method1615();
        this.method20622(method1615.field39803);
        super.method20611((boolean)method1615.field39810.get());
        if (!class395.method1500()) {
            this.method20591().method26204(true);
            this.method20592().method26204(true);
        }
        this.method20632();
        this.method20630();
        this.method20631();
        this.method20629();
        this.method20633();
        this.method20635();
        this.method20634();
        if (!this.method20601().method26205().exists()) {
            this.method20636();
        }
    }
    
    @Override
    public void method20611(final boolean b) {
        super.method20611(b);
        this.method20637().method1629(b);
    }
    
    @Override
    public void method20593(final GameProfile gameProfile) {
        super.method20593(gameProfile);
        this.method20634();
    }
    
    @Override
    public void method20594(final GameProfile gameProfile) {
        super.method20594(gameProfile);
        this.method20634();
    }
    
    @Override
    public void method20605() {
        this.method20635();
    }
    
    private void method20629() {
        try {
            this.method20592().method26217();
        }
        catch (final IOException ex) {
            Class6766.field26560.warn("Failed to save ip banlist: ", ex);
        }
    }
    
    private void method20630() {
        try {
            this.method20591().method26217();
        }
        catch (final IOException ex) {
            Class6766.field26560.warn("Failed to save user banlist: ", ex);
        }
    }
    
    private void method20631() {
        try {
            this.method20592().method26218();
        }
        catch (final IOException ex) {
            Class6766.field26560.warn("Failed to load ip banlist: ", ex);
        }
    }
    
    private void method20632() {
        try {
            this.method20591().method26218();
        }
        catch (final IOException ex) {
            Class6766.field26560.warn("Failed to load user banlist: ", ex);
        }
    }
    
    private void method20633() {
        try {
            this.method20603().method26218();
        }
        catch (final Exception ex) {
            Class6766.field26560.warn("Failed to load operators list: ", ex);
        }
    }
    
    private void method20634() {
        try {
            this.method20603().method26217();
        }
        catch (final Exception ex) {
            Class6766.field26560.warn("Failed to save operators list: ", ex);
        }
    }
    
    private void method20635() {
        try {
            this.method20601().method26218();
        }
        catch (final Exception ex) {
            Class6766.field26560.warn("Failed to load white-list: ", ex);
        }
    }
    
    private void method20636() {
        try {
            this.method20601().method26217();
        }
        catch (final Exception ex) {
            Class6766.field26560.warn("Failed to save white-list: ", ex);
        }
    }
    
    @Override
    public boolean method20596(final GameProfile gameProfile) {
        if (this.method20610()) {
            if (!this.method20597(gameProfile)) {
                return this.method20601().method26226(gameProfile);
            }
        }
        return true;
    }
    
    public Class395 method20637() {
        return (Class395)super.method20576();
    }
    
    @Override
    public boolean method20625(final GameProfile gameProfile) {
        return this.method20603().method26221(gameProfile);
    }
    
    static {
        field26560 = LogManager.getLogger();
    }
}
