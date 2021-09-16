package de.ee.optimization.game.entity;

import java.util.EnumSet;
import java.util.Set;

public class PlatformMapper {

    private static final Set<Platform> PACKAGE_PC = EnumSet.of(Platform.PC);

    private static final Set<Platform> PACKAGE_PC_PS_XBOX = EnumSet.of(Platform.PC, Platform.XBOX_ONE, Platform.XBOX,
            Platform.PS3, Platform.PS4);

    private static final Set<Platform> PACKAGE_PC_PS_XBOX_NS = EnumSet.of(Platform.PC, Platform.XBOX_ONE,
            Platform.XBOX, Platform.PS3, Platform.PS4, Platform.NINTENDO);

    public static Set<Platform> getPlatforms(final PlatformPackage platformPackage) {
        switch (platformPackage) {
            case PC:
                return PACKAGE_PC;
            case PC_PS_XBOX:
                return PACKAGE_PC_PS_XBOX;
            case PC_PS_XBOX_NS:
                return PACKAGE_PC_PS_XBOX_NS;
            default:
                throw new IllegalStateException("no valid type of platform package" + platformPackage);
        }
    }

}
